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

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Disciplina;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Sumario;
import com.dciapps.webclient.Tema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
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
@WebServlet(name = "UGxhbm9zU2VydmxldCNEQ0k=", urlPatterns = {"/UGxhbm9zU2VydmxldCNEQ0k="})
public class PlanosServlet extends HttpServlet {

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    Entidade entidade;

    Data data = new Data();
    Sender sender = new Sender();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

    Sistema sistema;

    String codEscola;
    
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
            entidade = (Entidade) request.getSession().getAttribute("entidade");
            

            if (request.getSession().getAttribute("codEscola") != null) {
                codEscola = encryptUtils.encodeString(request.getSession().getAttribute("codEscola").toString());
            }

            switch (accao) {

                case "temas": {

                    Escola escola = ensinoCtrl.buscaEscola(codEscola);

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                        request.getSession().setAttribute("cursos", cursos);
                    }

                    if (disciplinas == null) {
                        disciplinas = ensinoCtrl.listaDisciplinas(entidade);
                        request.getSession().setAttribute("disciplinas", disciplinas);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (curso == null) {
                            if (!cursos.isEmpty()) {
                                curso = cursos.get(0);
                            }
                        }
                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    if (request.getParameter("idDisciplina") == null) {

                        if (disciplina == null) {
                            if (!disciplinas.isEmpty()) {
                                disciplina = disciplinas.get(0);
                            }
                        }
                    } else {
                        int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                        disciplina = ensinoCtrl.buscaDisciplinaId(idDisciplina);
                    }

                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("disciplinaSelecionada", disciplina);

                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("tema", null);
                    request.getSession().setAttribute("escola", escola);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de registo de planos tematátios"));
                    response.sendRedirect("thematic");

                }
                ;
                break;

                case "registar-tema": {
                    String descricao = request.getParameter("descricao");
                    int pratica = Integer.parseInt(request.getParameter("pratica"));
                    int teorica = Integer.parseInt(request.getParameter("teorica"));

                    Escola escola = (Escola) request.getSession().getAttribute("escola");

                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");

                    Tema tema = ensinoCtrl.buscaTemaDescricao(entidade, curso, disciplina, encryptUtils.encodeString(descricao));

                    String msgErro = "[TEMA]: " + descricao + "."
                            + "Adicionado com sucesso";

                    String alerta = "bg-success";

                    if (tema == null) {
                        tema = new Tema();
                        tema.setCurso(curso);
                        tema.setEntidade(entidade);
                        tema.setEscola(escola);
                        tema.setDisciplina(disciplina);
                        tema.setEncrypted(true);
                        tema.setTemaDescricao(encryptUtils.encodeString(descricao));

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso o objectivo com a descrição: " + descricao));
                    } else {
                        msgErro = "[TEMA]: " + descricao + "."
                                + "Actualizado com sucesso";

                        alerta = "bg-success";

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou adicionar um objectivo já existente no sistema com a descrição: " + descricao));
                    }

                    tema.setTemaPratica(pratica);
                    tema.setTemaTeorica(teorica);

                    ensinoCtrl.persistirTema(tema);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("thematic");
                }
                ;
                break;

                case "remover-tema": {
                    int id = Integer.parseInt(request.getParameter("di"));

                    Tema tema = ensinoCtrl.buscaTemaId(id);

                    ensinoCtrl.removerTema(tema);

                    Disciplina disciplina = tema.getDisciplina();
                    Curso curso = tema.getCurso();

                    request.getSession().setAttribute("temas", ensinoCtrl.listaTemas(entidade, curso, disciplina));
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu o tema com id:  " + id));

                    String msgErro = "[TEMA]: " + encryptUtils.decodeString(tema.getTemaDescricao()) + "."
                            + "Removido com sucesso";

                    String alerta = "bg-success";

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("thematics");

                }
                ;
                break;

                case "planotematico": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                        request.getSession().setAttribute("cursos", cursos);
                    }

                    if (disciplinas == null) {
                        disciplinas = ensinoCtrl.listaDisciplinas(entidade);
                        request.getSession().setAttribute("disciplinas", disciplinas);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (curso == null) {
                            if (!cursos.isEmpty()) {
                                curso = cursos.get(0);
                            }
                        }
                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    if (request.getParameter("idDisciplina") == null) {

                        if (disciplina == null) {
                            if (!disciplinas.isEmpty()) {
                                disciplina = disciplinas.get(0);
                            }
                        }
                    } else {
                        int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                        disciplina = ensinoCtrl.buscaDisciplinaId(idDisciplina);
                    }

                    List<Tema> temas = null;

                    if (curso != null && disciplina != null) {
                        temas = ensinoCtrl.listaTemas(entidade, curso, disciplina);
                    }
                    request.getSession().setAttribute("temas", temas);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("disciplinaSelecionada", disciplina);

                    response.sendRedirect("thematics");

                }
                ;
                break;

                case "planos": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                        request.getSession().setAttribute("cursos", cursos);
                    }

                    if (disciplinas == null) {
                        disciplinas = ensinoCtrl.listaDisciplinas(entidade);
                        request.getSession().setAttribute("disciplinas", disciplinas);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (curso == null) {
                            if (!cursos.isEmpty()) {
                                curso = cursos.get(0);
                            }
                        }
                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    if (request.getParameter("idDisciplina") == null) {

                        if (disciplina == null) {
                            if (!disciplinas.isEmpty()) {
                                disciplina = disciplinas.get(0);
                            }
                        }
                    } else {
                        int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                        disciplina = ensinoCtrl.buscaDisciplinaId(idDisciplina);
                    }

                    List<Tema> temas = null;

                    if (curso != null && disciplina != null) {
                        temas = ensinoCtrl.listaTemas(entidade, curso, disciplina);
                    }

                    Escola escola = ensinoCtrl.buscaEscola(codEscola);

                    request.getSession().setAttribute("temas", temas);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("disciplinaSelecionada", disciplina);

                    request.getSession().setAttribute("sumario", null);
                    request.getSession().setAttribute("escola", escola);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de registo de planos de aulas"));
                    response.sendRedirect("summary");

                }
                ;
                break;

                case "registar-sumario": {
                    String descricao = request.getParameter("descricao");
                    String avaliacao = request.getParameter("avaliacao");
                    String metodologia = request.getParameter("metodologia");
                    String objectivo = request.getParameter("objectivo");
                    String bibliografia = request.getParameter("bibliografia");
                    String recursos = request.getParameter("recursos");
                    String resumo = request.getParameter("resumo");
                    String dataAula = request.getParameter("dataAula");
                    int idTema = Integer.parseInt(request.getParameter("idTema"));

                    XMLGregorianCalendar calendar = getDate(dataAula);

                    Escola escola = (Escola) request.getSession().getAttribute("escola");

                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    List<Tema> temas = (List<Tema>) request.getSession().getAttribute("temas");
                    Tema tema = getTema(temas, idTema);

                    Sumario sumario = ensinoCtrl.buscaSumarioDescricao(entidade, curso, disciplina, encryptUtils.encodeString(descricao));

                    String msgErro = "[PLANO DE AULA]: " + descricao + "."
                            + "Adicionado com sucesso";

                    String alerta = "bg-success";

                    if (sumario == null) {
                        sumario = new Sumario();
                        sumario.setEntidade(entidade);
                        sumario.setEscola(escola);
                        sumario.setDisciplina(disciplina);
                        sumario.setEncrypted(true);
                        sumario.setCurso(curso);
                        sumario.setTema(tema);
                        sumario.setSumaDescricao(encryptUtils.encodeString(descricao));

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso o plano de aula com a descrição: " + descricao));
                    } else {
                        msgErro = "[PLANO DE AULA]: " + descricao + "."
                                + "Actualizado com sucesso";

                        alerta = "bg-success";

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou adicionar um plano de aula com a descrição: " + descricao));
                    }

                    sumario.setSumaAvaliacao(encryptUtils.encodeString(avaliacao));
                    sumario.setSumaBibliografia(encryptUtils.encodeString(bibliografia));
                    sumario.setSumaMetodologia(encryptUtils.encodeString(metodologia));
                    sumario.setSumaObjectivo(encryptUtils.encodeString(objectivo));
                    sumario.setSumaRecursos(encryptUtils.encodeString(recursos));
                    sumario.setSumaResumo(encryptUtils.encodeString(resumo));
                    sumario.setSumaData(calendar);

                    ensinoCtrl.persistirSumario(sumario);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("summary");
                }
                ;
                break;

                case "remover-sumario": {
                    int id = Integer.parseInt(request.getParameter("di"));

                    Sumario sumario = ensinoCtrl.buscaSumarioId(id);

                    ensinoCtrl.removerSumario(sumario);

                    Disciplina disciplina = sumario.getDisciplina();
                    Curso curso = sumario.getCurso();

                    request.getSession().setAttribute("sumarios", ensinoCtrl.listaSumarios(entidade, curso, disciplina));
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu o sumario com id:  " + id));

                    String msgErro = "[PLANO DE AULA]: " + encryptUtils.decodeString(sumario.getSumaDescricao()) + "."
                            + "Removido com sucesso";

                    String alerta = "bg-success";

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("summaries");

                }
                ;
                break;

                case "planoaula": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                        request.getSession().setAttribute("cursos", cursos);
                    }

                    if (disciplinas == null) {
                        disciplinas = ensinoCtrl.listaDisciplinas(entidade);
                        request.getSession().setAttribute("disciplinas", disciplinas);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (curso == null) {
                            if (!cursos.isEmpty()) {
                                curso = cursos.get(0);
                            }
                        }
                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    if (request.getParameter("idDisciplina") == null) {

                        if (disciplina == null) {
                            if (!disciplinas.isEmpty()) {
                                disciplina = disciplinas.get(0);
                            }
                        }
                    } else {
                        int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                        disciplina = ensinoCtrl.buscaDisciplinaId(idDisciplina);
                    }

                    List<Sumario> sumarios = null;

                    if (curso != null && disciplina != null) {
                        sumarios = ensinoCtrl.listaSumarios(entidade, curso, disciplina);
                    }
                    request.getSession().setAttribute("sumarios", sumarios);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("disciplinaSelecionada", disciplina);

                    response.sendRedirect("summaries");

                }
                ;
                break;

            }

        } catch (Exception exception) {

            Data d = new Data();
            d.le_hora();
            ExceptionWriter ew = new ExceptionWriter();

            String datetime = d.getAno() + "_" + d.getMes() + "_" + d.getDia() + "_" + d.getHora() + d.getMinuto() + d.getSegundo();
            String msg = "Ocorreu um excepção do tipo:\n" + ew.getStackTrace(exception);
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

    private Disciplina getDisciplina(List<Disciplina> disciplinas, int id) {
        Disciplina disciplina = null;

        if (disciplinas != null) {
            for (Disciplina d : disciplinas) {
                if (d.getDiscId() == id) {
                    disciplina = d;
                }
            }
        }

        return disciplina;
    }

    public XMLGregorianCalendar getDate(String data) {

        StringTokenizer st = new StringTokenizer(data, "/");

        String dt = st.nextToken();
        if (dt.startsWith("0")) {
            dt = dt.charAt(dt.length() - 1) + "";
        }
        int day = Integer.parseInt(dt);
        int month = Integer.parseInt(st.nextToken()) - 1;
        int year = Integer.parseInt(st.nextToken());

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, day);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        return calendar;
    }

    private Curso getCurso(List<Curso> cursos, int id) {
        Curso curso = null;

        if (cursos != null) {
            for (Curso d : cursos) {
                if (d.getCursId() == id) {
                    curso = d;
                }
            }
        }

        return curso;
    }

    private Tema getTema(List<Tema> temas, int id) {
        Tema tema = null;

        if (temas != null) {
            for (Tema d : temas) {
                if (d.getTemaId() == id) {
                    tema = d;
                }
            }
        }

        return tema;
    }
}
