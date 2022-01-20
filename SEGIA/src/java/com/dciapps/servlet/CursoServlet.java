/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.servlet;

import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Area;
import com.dciapps.webclient.AreaFormacao;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Modulo;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "Q3Vyc29TZXJ2bGV0I0RDSQ==", urlPatterns = {"/Q3Vyc29TZXJ2bGV0I0RDSQ=="})
public class CursoServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();

    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();

    Sender sender = new Sender();

    @SuppressWarnings("UseSpecificCatch")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            String url = encryptUtils.decodeString(request.getQueryString());
            System.out.println(url);

            StringTokenizer st1 = new StringTokenizer(url, "#");

            System.err.println(st1.nextToken());

            StringTokenizer st = new StringTokenizer(st1.nextToken(), "&");

            // Pega a accao
            String accao = st.nextToken();
            System.err.println(accao);

            request.getSession().setAttribute("alerta", "");
            request.getSession().setAttribute("msgErro", "");

            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            sistema = (Sistema) request.getSession().getAttribute("sistema");

            entidade = (Entidade) request.getSession().getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) request.getSession().getAttribute("entidade");
            }

            switch (accao) {

                case "areas": {
                    List<AreaFormacao> areasFormacao = ensinoCtrl.listaAreasFormacao(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário das áreas de formação"));
                    request.getSession().setAttribute("areasFormacao", areasFormacao);
                    response.sendRedirect("course-area");
                }
                ;
                break;

                case "adicionar-area": {
                    String descricao = request.getParameter("descricao");
                    String detalhes = "";

                    if (request.getParameter("detalhes") != null) {
                        detalhes = request.getParameter("detalhes");
                    }

                    String msgErro = "Área de Formação adicionada com sucesso";
                    String alerta = "bg-success";

                    AreaFormacao areaFormacao = ensinoCtrl.buscaAreaFormacaoDescricao(entidade, encryptUtils.encodeString(descricao));

                    if (areaFormacao != null) {
                        msgErro = "Área de formação já existente no centro";
                        alerta = "bg-warning";
                    } else {
                        areaFormacao = new AreaFormacao();
                        areaFormacao.setArefDescricao(encryptUtils.encodeString(descricao));
                        areaFormacao.setArefDetalhes(encryptUtils.encodeString(detalhes));
                        areaFormacao.setEncrypted(true);
                        areaFormacao.setEntidade(entidade);

                        ensinoCtrl.persistirAreaFormacao(areaFormacao);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Inseriu com sucesso a área de formação com a descricao: " + descricao));

                        List<AreaFormacao> areasFormacao = ensinoCtrl.listaAreasFormacao(entidade);

                        request.getSession().setAttribute("areasFormacao", areasFormacao);

                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("course-area");
                }
                ;
                break;
                case "remover-area": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    AreaFormacao areaFormacao = ensinoCtrl.buscaAreaFormacaoId(id);

                    List<Curso> cursos = ensinoCtrl.listaCursosAreaFormacao(entidade, areaFormacao);

                    String msgErro = "Área de formação removida com sucesso";
                    String alerta = "bg-success";

                    if (!cursos.isEmpty()) {

                        msgErro = "Área de formação não pode ser removida, elimine o registo de cursos associados";
                        alerta = "bg-warning";

                    } else {

                        ensinoCtrl.removerAreaFormacao(areaFormacao);

                        String descricao = encryptUtils.decodeString(areaFormacao.getArefDescricao());

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso a área de formação com a descricao: " + descricao));

                        List<AreaFormacao> areasFormacao = ensinoCtrl.listaAreasFormacao(entidade);

                        request.getSession().setAttribute("areasFormacao", areasFormacao);
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("course-area");
                }
                ;
                break;

                case "cursos": {
                    List<AreaFormacao> areasFormacao = ensinoCtrl.listaAreasFormacao(entidade);
                    List<Curso> cursos = ensinoCtrl.listaCursos(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário dos cursos"));
                    request.getSession().setAttribute("areasFormacao", areasFormacao);
                    request.getSession().setAttribute("cursos", cursos);
                    response.sendRedirect("courses");
                }
                ;
                break;

                case "adicionar-curso": {
                    String descricao = request.getParameter("descricao");
                    String tipo = request.getParameter("tipo");
                    String codigo = request.getParameter("codigo");
                    int duracao = Integer.parseInt(request.getParameter("duracao"));
                    int prestacoes = Integer.parseInt(request.getParameter("prestacoes"));
                    int idAreaFormacao = Integer.parseInt(request.getParameter("idAreaFormacao"));

                    String msgErro = "Curso adicionado com sucesso";
                    String alerta = "bg-success";

                    boolean canAdd = true;

                    if (tipo.equals("Curta duração")) {
                        if (duracao > 1) {
                            canAdd = false;
                            msgErro = "Cursos de curta duração não podem ter mais de 1 mês";
                            alerta = "bg-warning";
                        }
                    } else {
                        if (duracao < 1) {
                            canAdd = false;
                            msgErro = "Cursos de longa duração não podem ser de apenas 1 mês";
                            alerta = "bg-warning";
                        }
                    }

                    if (canAdd) {
                        Curso curso = ensinoCtrl.buscaCursoDescricao(entidade, encryptUtils.encodeString(descricao));

                        if (curso != null) {
                            msgErro = "Curso já existente no centro";
                            alerta = "bg-warning";
                        } else {

                            AreaFormacao areaFormacao = ensinoCtrl.buscaAreaFormacaoId(idAreaFormacao);

                            curso = new Curso();
                            curso.setAreaFormacao(areaFormacao);
                            curso.setCursDescricao(encryptUtils.encodeString(descricao));
                            curso.setCursTipo(encryptUtils.encodeString(tipo));
                            curso.setCursCod(encryptUtils.encodeString(codigo));
                            curso.setCursDuracao(duracao);
                            curso.setCursNumPrestacoes(prestacoes);
                            curso.setCursNumTurmas(0);
                            curso.setEncrypted(true);
                            curso.setEntidade(entidade);

                            ensinoCtrl.persistirCurso(curso);

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Inseriu com sucesso o curso com a descricao: " + descricao));

                            List<Curso> cursos = ensinoCtrl.listaCursos(entidade);

                            request.getSession().setAttribute("cursos", cursos);
                            request.getSession().setAttribute("areasFormacao", (List<AreaFormacao>) request.getSession().getAttribute("areasFormacao"));

                        }
                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("courses");
                }
                ;
                break;

                case "remover-curso": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Curso curso = ensinoCtrl.buscaCursoId(id);

                    List<Modulo> modulos = ensinoCtrl.listaModulosCurso(entidade, curso);

                    String msgErro = "Curso removida com sucesso";
                    String alerta = "bg-success";

                    if (!modulos.isEmpty()) {

                        msgErro = "Curso não pode ser removido, elimine o registo de modulos associados";
                        alerta = "bg-warning";

                    } else {

                        ensinoCtrl.removerCurso(curso);

                        String descricao = encryptUtils.decodeString(curso.getCursDescricao());

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o curso com a descricao: " + descricao));

                        List<Curso> cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
                        request.getSession().setAttribute("areasFormacao", (List<AreaFormacao>) request.getSession().getAttribute("areasFormacao"));
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("courses");
                }
                ;
                break;

                case "imprimir-cursos": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");

                    request.getSession().setAttribute("cursos", cursos);

                    response.sendRedirect("print-course");

                }
                ;
                break;

                case "modulos": {
                    List<Modulo> modulos = ensinoCtrl.listaModulos(entidade);
                    List<Curso> cursos = ensinoCtrl.listaCursos(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário dos modulos"));
                    request.getSession().setAttribute("modulos", modulos);
                    request.getSession().setAttribute("cursos", cursos);
                    response.sendRedirect("course-module");
                }
                ;
                break;

                case "adicionar-modulo": {
                    String descricao = request.getParameter("descricao");
                    int duracao = Integer.parseInt(request.getParameter("duracao"));
                    int idCurso = Integer.parseInt(request.getParameter("idCurso"));
                    double custo = Double.parseDouble(request.getParameter("custo"));
                    double credito = Double.parseDouble(request.getParameter("credito"));

                    String msgErro = "Módulo adicionado com sucesso";
                    String alerta = "bg-success";

                    Modulo modulo = ensinoCtrl.buscaModuloDescricao(entidade, encryptUtils.encodeString(descricao));

                    if (modulo != null) {
                        msgErro = "Módulo já existente no centro";
                        alerta = "bg-warning";
                    } else {

                        Curso curso = ensinoCtrl.buscaCursoId(idCurso);

                        modulo = new Modulo();
                        modulo.setCurso(curso);
                        modulo.setEncrypted(true);
                        modulo.setEntidade(entidade);
                        modulo.setModuDescricao(encryptUtils.encodeString(descricao));
                        modulo.setModuDurcao(duracao);
                        modulo.setModuPreco(custo);
                        modulo.setModuCredito(credito);

                        ensinoCtrl.persistirModulo(modulo);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Inseriu com sucesso o módulo com a descricao: " + descricao));

                        List<Modulo> modulos = ensinoCtrl.listaModulos(entidade);

                        request.getSession().setAttribute("modulos", modulos);
                        request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));

                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("course-module");
                }
                ;
                break;

                case "remover-modulo": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Modulo modulo = ensinoCtrl.buscaModuloId(id);

                    String msgErro = "Curso removida com sucesso";
                    String alerta = "bg-success";

                    ensinoCtrl.removerModulo(modulo);

                    String descricao = encryptUtils.decodeString(modulo.getModuDescricao());

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o módulo com a descricao: " + descricao));

                    List<Modulo> modulos = ensinoCtrl.listaModulos(entidade);

                    request.getSession().setAttribute("modulos", modulos);
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("courses");
                }
                ;
                break;

                case "cursos-centro": {
                    List<Entidade> entidades = gestaoCtrl.listaEntidades();
                    List<Curso> cursos = ensinoCtrl.listaCursos(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário dos modulos"));
                    request.getSession().setAttribute("entidades", entidades);
                    request.getSession().setAttribute("cursos", cursos);
                    response.sendRedirect("course-institution");
                }
                ;
                break;

                case "adicionar-curso-centro": {
                    int idEntidade = Integer.parseInt(request.getParameter("idEntidade"));
                    int idCurso = Integer.parseInt(request.getParameter("idCurso"));
                    double custo = Double.parseDouble(request.getParameter("custo"));
                    double custoInscricao = Double.parseDouble(request.getParameter("custoInscricao"));
                    int prestacoes = Integer.parseInt(request.getParameter("prestacoes"));

                    Entidade entidadeAdd = gestaoCtrl.buscarEntidadeId(idEntidade);
                    Curso curso = ensinoCtrl.buscaCursoId(idCurso);

                    String msgErro = "Informação do curso actualizada com sucesso";
                    String alerta = "bg-success";
                    String msg = "Actualizou com sucesso a informação do curso com o id : " + idCurso;

                    if (curso.getEntidade().getEntiId() == entidadeAdd.getEntiId()) {
                        curso.setCursPreco(custo);
                        curso.setCursCustoInscricao(custoInscricao);
                        curso.setCursNumPrestacoes(prestacoes);

                        ensinoCtrl.persistirCurso(curso);
                    } else {
                        Curso cursoNovo = new Curso();
                        cursoNovo.setAreaFormacao(curso.getAreaFormacao());
                        cursoNovo.setCursDescricao(curso.getCursDescricao());
                        cursoNovo.setCursDuracao(curso.getCursDuracao());
                        cursoNovo.setCursPreco(custo);
                        cursoNovo.setCursCustoInscricao(custoInscricao);
                        cursoNovo.setCursNumPrestacoes(prestacoes);
                        cursoNovo.setEncrypted(true);
                        cursoNovo.setEntidade(entidadeAdd);

                        msg = "Associou o curso com a descrição :" + encryptUtils.decodeString(curso.getCursDescricao()) + " ao centro com o id : " + idEntidade;
                    }

                    controleAcessoCtrl.persistirLog(addLog(usuario, msg));
                    List<Curso> cursos = ensinoCtrl.listaCursos(entidade);

                    request.getSession().setAttribute("entidades", (List<Entidade>) request.getSession().getAttribute("entidades"));
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("course-institution");

                }
                ;
                break;

                case "categorias": {
                    List<Area> areas = ensinoCtrl.listaAreas(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário das categorias de formação"));
                    request.getSession().setAttribute("areas", areas);
                    response.sendRedirect("area");
                }
                ;
                break;

                case "adicionar-categoria": {
                    String descricao = request.getParameter("descricao");

                    String msgErro = "Categoria de Formação adicionada com sucesso";
                    String alerta = "bg-success";

                    Area area = ensinoCtrl.buscaAreaDescricao(entidade, encryptUtils.encodeString(descricao));

                    if (area != null) {
                        msgErro = "Categoria de formação já existente no sistema";
                        alerta = "bg-warning";
                    } else {
                        area = new Area();
                        area.setAreaDescricao(encryptUtils.encodeString(descricao));
                        area.setEncrypted(true);
                        area.setEntidade(entidade);

                        ensinoCtrl.persistirArea(area);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Inseriu com sucesso a categoria de formação com a descricao: " + descricao));

                        List<Area> areas = ensinoCtrl.listaAreas(entidade);

                        request.getSession().setAttribute("areas", areas);

                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("area");
                }
                ;
                break;
                case "remover-categoria": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Area area = ensinoCtrl.buscaAreaId(id);

                    String msgErro = "Categoria de formação removida com sucesso";
                    String alerta = "bg-success";

                    ensinoCtrl.removerArea(area);

                    String descricao = encryptUtils.decodeString(area.getAreaDescricao());

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso a categoria de formação com a descricao: " + descricao));

                    List<Area> areas = ensinoCtrl.listaAreas(entidade);

                    request.getSession().setAttribute("areas", areas);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("area");
                }
                ;
                break;
            }
        } catch (Exception exception) {

            Data d = new Data();
            d.le_hora();

            ExceptionWriter ew = new ExceptionWriter();

            String datetime = d.getAno() + "_" + d.getMesString() + "_" + d.getDia() + "_" + d.getHora() + d.getMinuto() + d.getSegundo();
            String msg = "Ocorreu um excepção do tipo:<br>" + ew.getStackTrace(exception);
            String assunto = "[Exception]: " + datetime;

            ew.writeToFile(datetime, msg);
            sender.mailException(assunto, datetime, msg);

            response.sendRedirect("error-500");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Log addLog(Usuario u, String desc) {
        data.le_hora();
        Log log = new Log();

        GregorianCalendar gc = new GregorianCalendar();
        gc.setGregorianChange(new Date());
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        log.setLogData(calendar);
        log.setLogHora(data.getHora() + ":" + data.getMinuto() + ":" + data.getSegundo());
        log.setLogDescricao(desc);
        log.setUsuario(u);
        log.setSistema(sistema);
        log.setEntidade(entidade);

        return log;
    }
}
