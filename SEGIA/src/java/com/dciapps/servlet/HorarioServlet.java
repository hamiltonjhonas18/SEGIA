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
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Horario;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.util.Calendar;
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
@WebServlet(name = "SG9yYXJpb1NlcnZsZXQjRENJ", urlPatterns = {"/SG9yYXJpb1NlcnZsZXQjRENJ"})
public class HorarioServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();

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

                case "horarios": {
                    List<Horario> horarios = gestaoCtrl.listaHorarios(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário dos horários"));
                    request.getSession().setAttribute("horarios", horarios);
                    response.sendRedirect("grades-schedule");
                }
                ;
                break;

                case "adicionar-horario": {
                    String hora_inicio = request.getParameter("hora_inicio");
                    String hora_fim = request.getParameter("hora_fim");

                    StringTokenizer st2 = new StringTokenizer(hora_inicio, ":");
                    int horaIni = Integer.parseInt(st2.nextToken());
                    int minIni = Integer.parseInt(st2.nextToken());

                    st2 = new StringTokenizer(hora_fim, ":");
                    int horaFim = Integer.parseInt(st2.nextToken());
                    int minFim = Integer.parseInt(st2.nextToken());

                    Calendar c1 = Calendar.getInstance();

                    c1.set(Calendar.HOUR, horaIni);
                    c1.set(Calendar.MINUTE, minIni);

                    Calendar c2 = Calendar.getInstance();

                    c2.set(Calendar.HOUR, horaFim);
                    c2.set(Calendar.MINUTE, minFim);

                    Date d1 = c1.getTime();
                    Date d2 = c2.getTime();

                    String msgErro = "Horário definido com sucesso";
                    String alerta = "bg-success";

                    if (d2.before(d1)) {
                        msgErro = "A hora de termino não pode ser inferior que a de inicio";
                        alerta = "bg-warning";

                    } else {
                        Horario horario = gestaoCtrl.buscaHorario(entidade, hora_inicio, hora_fim);

                        if (horario != null) {
                            msgErro = "Já existe um horário definido nesse periodo";
                            alerta = "bg-warning";
                        } else {
                            horario = new Horario();
                            horario.setEncrypted(true);
                            horario.setEntidade(entidade);
                            horario.setHoraFim(encryptUtils.encodeString(hora_fim));
                            horario.setHoraInicio(encryptUtils.encodeString(hora_inicio));
                            
                            gestaoCtrl.persistirHorario(horario);

                            List<Horario> horarios = gestaoCtrl.listaHorarios(entidade);

                            request.getSession().setAttribute("horarios", horarios);
                        }
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("grades-schedule");

                }
                ;
                break;

                case "remover-horario": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Horario horario = gestaoCtrl.buscaHorarioId(id);

                    String msgErro = "Horário removido com sucesso";
                    String alerta = "bg-success";

                    if (horario.isHoraUsado()) {
                        msgErro = "Horário em uso não pode ser removido";
                        alerta = "bg-warning";
                    } else {
                        gestaoCtrl.removerHorario(horario);

                        List<Horario> horarios = gestaoCtrl.listaHorarios(entidade);

                        request.getSession().setAttribute("horarios", horarios);
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("grades-schedule");
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
