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

import com.dciapps.local.RCursos;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Notas;
import com.dciapps.webclient.Pagamento;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ContabilidadeCtrl;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "SW5zY3JpY2FvU2VydmxldCNEQ0k=", urlPatterns = {"/SW5zY3JpY2FvU2VydmxldCNEQ0k="})
public class InscricaoServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    ContabilidadeCtrl contabilidadeCtrl = new ContabilidadeCtrl();

    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

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

                case "inscricoes": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Turma turma = (Turma) request.getSession().getAttribute("turmaSelecionada");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                        request.getSession().setAttribute("cursos", cursos);
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
                        turmas = null;
                        turma = null;
                    }

                    if (turmas == null) {
                        turmas = ensinoCtrl.listaTurmasCurso(entidade, curso);
                        request.getSession().setAttribute("turmas", turmas);
                    }

                    if (request.getParameter("idTurma") == null) {
                        if (turma == null) {
                            if (!turmas.isEmpty()) {
                                turma = turmas.get(0);
                            }
                        }
                    } else {
                        int idTurma = Integer.parseInt(request.getParameter("idTurma"));
                        turma = ensinoCtrl.buscaTurmaId(idTurma);
                    }

                    List<Inscricao> inscricoes = null;

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    }

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou o ponto de situação das inscrições"));

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmaSelecionada", turma);

                    response.sendRedirect("inscriptions");
                }
                ;
                break;

                case "imprimir-cursos": {

                    List<RCursos> rcursos = (List<RCursos>) request.getSession().getAttribute("rcursos");

                    request.getSession().setAttribute("rcursos", rcursos);

                    response.sendRedirect("print-course-resume");

                }
                ;
                break;

                case "imprimir-inscricoes": {

                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    request.getSession().setAttribute("inscricoes", inscricoes);

                    response.sendRedirect("print-inscriptions");

                }
                ;
                break;

                case "remover-inscricao": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Inscricao inscricao = ensinoCtrl.buscaInscricaoId(id);
                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosReferencia(entidade, inscricao.getInscReferencia());
                    List<Notas> notas = ensinoCtrl.listaNotasInscricao(entidade, inscricao);
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    boolean isDone = false;
                    boolean isNote = false;

                    if (pagamentos != null) {
                        if (!pagamentos.isEmpty()) {
                            isDone = isPaymentDone(pagamentos);
                        }
                    }

                    if (notas != null) {
                        if (!notas.isEmpty()) {
                            isNote = true;
                        }
                    }

                    String ref = encryptUtils.decodeString(inscricao.getInscReferencia());
                    String msgErro = "Inscrição com a referência " + ref + " removida com successo";
                    String alerta = "bg-success";

                    if (isDone && !isNote) {
                        msgErro = "Inscrição não pode ser removida, existem pagamentos efectuados associados";
                        alerta = "bg-warning";
                    } else if (!isDone && isNote) {

                        msgErro = "Inscrição não pode ser removida, existem notas associadas";
                        alerta = "bg-warning";

                    } else if (isDone && isNote) {

                        msgErro = "Inscrição não pode ser removida, existem registos de notas e pagamentos associados";
                        alerta = "bg-warning";

                    } else {
                        ensinoCtrl.removerInscricao(inscricao);
                        inscricoes = ensinoCtrl.listaInscricoes(entidade);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso a inscrição com a referência: " + ref));

                    }

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<RCursos> rcursos = new ArrayList();

                    int total = 0;

                    if (inscricoes != null) {
                        if (!inscricoes.isEmpty()) {
                            total = inscricoes.size();
                        }
                    }

                    for (Curso curso : cursos) {
                        int numIns = getNumInscricoesCurso(inscricoes, curso);

                        double percentagem = Math.round((numIns * 100.0f) / total);

                        RCursos rCursos = new RCursos();
                        rCursos.setCurso(curso);
                        rCursos.setNumInscricoes(numIns);
                        rCursos.setPercentagem(percentagem);

                        rcursos.add(rCursos);

                    }

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("rcursos", rcursos);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("inscriptions");
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

    private int getNumInscricoesCurso(List<Inscricao> inscricoes, Curso curso) {
        int num = 0;

        for (Inscricao i : inscricoes) {
            if (i.getCurso().getCursId() == curso.getCursId()) {
                num++;
            }
        }

        return num;
    }

    private boolean isPaymentDone(List<Pagamento> pagamentos) {
        boolean isDone = false;

        for (Pagamento p : pagamentos) {
            if (p.isPagStatus()) {
                isDone = true;
            }
        }

        return isDone;
    }
}
