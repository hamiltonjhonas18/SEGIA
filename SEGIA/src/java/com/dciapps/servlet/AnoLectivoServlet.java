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
import com.dciapps.localcontroler.MailSender;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclient.Vagas;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
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
@WebServlet(name = "QW5vTGVjdGl2b1NlcnZsZXQjRENJ", urlPatterns = {"/QW5vTGVjdGl2b1NlcnZsZXQjRENJ"})
public class AnoLectivoServlet extends HttpServlet {

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    EncryptUtils encryptUtils = new EncryptUtils();
    Entidade entidade;
    Sender sender = new Sender();

    Data data = new Data();

    Sistema sistema;

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

            switch (accao) {

                case "anosLectivos": {

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                        request.getSession().setAttribute("cursos", cursos);
                    }

                    List<Vagas> vagasList = ensinoCtrl.listaVagasAnoLectivo(entidade, anoLectivo);

                    if (vagasList == null) {
                        vagasList = new ArrayList();
                        if (anoLectivo != null) {
                            for (Curso c : cursos) {
                                Vagas vagas = ensinoCtrl.buscaVagasAnoLectivoCurso(entidade, anoLectivo, c);

                                if (vagas == null) {
                                    vagas = new Vagas();
                                    vagas.setAnoLectivo(anoLectivo);
                                    vagas.setCurso(c);
                                    vagas.setEntidade(entidade);
                                    vagas.setEncrypted(true);

                                    ensinoCtrl.persistirVagas(vagas);
                                    vagas = ensinoCtrl.buscaVagasAnoLectivoCurso(entidade, anoLectivo, c);
                                }

                                vagasList.add(vagas);
                            }
                        }
                    }

                    request.getSession().setAttribute("vagas", vagasList);
                    request.getSession().setAttribute("anoLectivoActivo", anoLectivo);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de actualização de vagas do ano lectivo"));
                    response.sendRedirect("academic-year");

                }
                ;
                break;

                case "actualizar-vagas": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    int nr = Integer.parseInt(request.getParameter("nr"));

                    int tt = nr;
                    Vagas vagas = ensinoCtrl.buscaVagasId(id);
                    nr = nr - vagas.getVagaTotal();
                    vagas.setVagaTotal(tt);

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    ensinoCtrl.persistirVagas(vagas);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Actualizou o número de vagas para o curso :" + encryptUtils.decodeString(vagas.getCurso().getCursDescricao())));

                    String msgErro = nr + " vagas foram adiconadas a classe " + encryptUtils.decodeString(vagas.getCurso().getCursDescricao()) + "";

                    if (nr == 1) {
                        msgErro = "Uma vaga foi adicionada a classe " + encryptUtils.decodeString(vagas.getCurso().getCursDescricao()) + "";
                    }
                    if (nr == 2) {
                        msgErro = "Duas vagas foram adiciondas a classe " + encryptUtils.decodeString(vagas.getCurso().getCursDescricao()) + "";
                    }

                    if (nr < 0) {
                        nr = nr * (-1);

                        switch (nr) {
                            case 1:
                                msgErro = "Uma vaga foi removida da classe " + encryptUtils.decodeString(vagas.getCurso().getCursDescricao()) + "";
                                break;
                            case 2:
                                msgErro = "Duas vagas foram removidas da classe " + encryptUtils.decodeString(vagas.getCurso().getCursDescricao()) + "";
                                break;
                            default:
                                msgErro = nr + " vagas foram removidas da classe " + encryptUtils.decodeString(vagas.getCurso().getCursDescricao()) + "";
                                break;
                        }
                    }
                    String alerta = "bg-success";

                    request.getSession().setAttribute("vagas", ensinoCtrl.listaVagasAnoLectivo(entidade, anoLectivo));
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("academic-year");

                }
                ;
                break;

            }

        } catch (Exception exception) {

            Data d = new Data();
            d.le_hora();

            MailSender ms = new MailSender();
            ExceptionWriter ew = new ExceptionWriter();

            String datetime = d.getAno() + "_" + d.getMesString() + "_" + d.getDia() + "_" + d.getHora() + d.getMinuto() + d.getSegundo();
            String msg = "Ocorreu um excepção do tipo:<br>" + ew.getStackTrace(exception);
            String assunto = "[Exception]: " + datetime;

            ew.writeToFile(datetime, msg);

            response.sendRedirect("500");
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
