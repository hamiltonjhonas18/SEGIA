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
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k=", urlPatterns = {"/RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k="})
public class EstatisticaServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();

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

                case "por-curso": {

                    data.le_hora();

                    List<Curso> cursos = ensinoCtrl.listaCursos(entidade);
                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoes(entidade);

                    Curso curso = null;
                    String anoSelecionado = data.getAno();

                    if (request.getParameter("anoSelecionado") != null) {
                        anoSelecionado = request.getParameter("anoSelecionado");

                    }

                    if (request.getParameter("idCurso") != null) {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = getCurso(cursos, idCurso);

                    } else {
                        if (cursos != null) {
                            if (!cursos.isEmpty()) {
                                curso = cursos.get(0);
                            }
                        }
                    }

                    /*
                     Maior de 60 anos
                     50 á 59 anos
                     40 á 49 anos
                     30 á 39 anos
                     18 á 29 anos
                     Menor de 18 anos
                     */
                    String lblInscricoes = "";
                    String lblMenor18 = "";
                    String lbl18_29 = "";
                    String lbl30_39 = "";
                    String lbl40_49 = "";
                    String lbl50_59 = "";
                    String lblMaior60 = "";
                    int numHomens = 0;
                    int numMulheres = 0;

                    if (inscricoes != null) {
                        if (!inscricoes.isEmpty()) {
                            numHomens = getGeneroInscricoesPeriodo(inscricoes, curso, "Masculino", anoSelecionado);
                            numMulheres = getGeneroInscricoesPeriodo(inscricoes, curso, "Femenino", anoSelecionado);

                            for (int i = 1; i <= 12; i++) {
                                String m = i + "";

                                if (i < 10) {
                                    m = "0" + i;
                                }

                                lblInscricoes += getNumInscricoesPeriodo(inscricoes, curso, (anoSelecionado + "-" + m)) + ",";

                                lblMenor18 += getIdadeInscricoesPeriodo(inscricoes, curso, "Menor de 18 anos", (anoSelecionado + "-" + m)) + ",";
                                lbl18_29 += getIdadeInscricoesPeriodo(inscricoes, curso, "18 á 29 anos", (anoSelecionado + "-" + m)) + ",";
                                lbl30_39 += getIdadeInscricoesPeriodo(inscricoes, curso, "30 á 39 anos", (anoSelecionado + "-" + m)) + ",";
                                lbl40_49 += getIdadeInscricoesPeriodo(inscricoes, curso, "40 á 49 anos", (anoSelecionado + "-" + m)) + ",";
                                lbl50_59 += getIdadeInscricoesPeriodo(inscricoes, curso, "50 á 59 anos", (anoSelecionado + "-" + m)) + ",";
                                lblMaior60 += getIdadeInscricoesPeriodo(inscricoes, curso, "Maior de 60 anos", (anoSelecionado + "-" + m)) + ",";
                            }
                        }
                    }

                    if (!lblInscricoes.isEmpty()) {
                        lblInscricoes = lblInscricoes.substring(0, lblInscricoes.length() - 1);
                    }

                    if (!lblMenor18.isEmpty()) {
                        lblMenor18 = lblMenor18.substring(0, lblMenor18.length() - 1);
                    }

                    if (!lbl18_29.isEmpty()) {
                        lbl18_29 = lbl18_29.substring(0, lbl18_29.length() - 1);
                    }

                    if (!lbl30_39.isEmpty()) {
                        lbl30_39 = lbl30_39.substring(0, lbl30_39.length() - 1);
                    }

                    if (!lbl40_49.isEmpty()) {
                        lbl40_49 = lbl40_49.substring(0, lbl40_49.length() - 1);
                    }

                    if (!lbl50_59.isEmpty()) {
                        lbl50_59 = lbl50_59.substring(0, lbl50_59.length() - 1);
                    }

                    if (!lblMaior60.isEmpty()) {
                        lblMaior60 = lblMaior60.substring(0, lblMaior60.length() - 1);
                    }

                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("inscricoes", inscricoes);

                    request.getSession().setAttribute("numHomens", numHomens);
                    request.getSession().setAttribute("numMulheres", numMulheres);

                    request.getSession().setAttribute("lblInscricoes", lblInscricoes);

                    request.getSession().setAttribute("lblMenor18", lblMenor18);
                    request.getSession().setAttribute("lbl18_29", lbl18_29);
                    request.getSession().setAttribute("lbl30_39", lbl30_39);
                    request.getSession().setAttribute("lbl40_49", lbl40_49);
                    request.getSession().setAttribute("lbl50_59", lbl50_59);
                    request.getSession().setAttribute("lblMaior60", lblMaior60);

                    request.getSession().setAttribute("anoSelecionado", anoSelecionado);
                    request.getSession().setAttribute("curso", curso);

                    String cur = "---";

                    if (curso != null) {
                        cur = encryptUtils.decodeString(curso.getCursDescricao());
                    }

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou as estastísticas do curso: " + cur + " para o ano: " + anoSelecionado));

                    response.sendRedirect("charts-course");
                }
                ;
                break;

                case "gerais": {
                    response.sendRedirect("charts-general");
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

    private Curso getCurso(List<Curso> cursos, int idCurso) {
        Curso curso = null;

        for (Curso c : cursos) {
            if (c.getCursId() == idCurso) {
                curso = c;
            }
        }
        return curso;
    }

    private int getNumInscricoesPeriodo(List<Inscricao> inscricoes, Curso curso, String periodo) {
        int num = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Inscricao i : inscricoes) {
            String dte = sdf.format(i.getInscDataInscricao().toGregorianCalendar().getTime());

            if (i.getCurso().getCursId() == curso.getCursId()) {
                if (dte.startsWith(periodo)) {
                    num++;
                }
            }

        }
        return num;
    }

    private int getIdadeInscricoesPeriodo(List<Inscricao> inscricoes, Curso curso, String criterio, String periodo) {
        int num = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        for (Inscricao i : inscricoes) {

            Date dtaProx = i.getAluno().getPessoa().getPessDataCadastro().toGregorianCalendar().getTime();
            Date dtaHoje = new Date();
            int idade = Days.daysBetween(new DateTime(dtaHoje), new DateTime(dtaProx)).getDays();

            String dte = sdf.format(i.getInscDataInscricao().toGregorianCalendar().getTime());

            if (i.getCurso().getCursId() == curso.getCursId()) {
                if (dte.startsWith(periodo)) {

                    switch (criterio) {
                        case "Menor de 18 anos": {

                            if (idade < 18) {
                                num++;
                            }
                        }
                        ;
                        break;
                        case "18 á 29 anos": {

                            if (idade >= 18 && idade <= 29) {
                                num++;
                            }
                        }
                        ;
                        break;
                        case "30 á 39 anos": {

                            if (idade >= 30 && idade <= 39) {
                                num++;
                            }
                        }
                        ;
                        break;
                        case "40 á 49 anos": {

                            if (idade >= 40 && idade <= 49) {
                                num++;
                            }
                        }
                        ;
                        break;
                        case "50 á 59 anos": {

                            if (idade >= 50 && idade <= 59) {
                                num++;
                            }
                        }
                        ;
                        break;
                        case "Maior de 60 anos": {

                            if (idade >= 60) {
                                num++;
                            }
                        }
                        ;
                        break;
                    }
                }
            }

        }
        return num;
    }

    private int getGeneroInscricoesPeriodo(List<Inscricao> inscricoes, Curso curso, String genero, String periodo) {
        int num = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Inscricao i : inscricoes) {
            String dte = sdf.format(i.getInscDataInscricao().toGregorianCalendar().getTime());

            if (i.getCurso().getCursId() == curso.getCursId()) {
                if (dte.startsWith(periodo)) {

                    String gen = encryptUtils.decodeString(i.getAluno().getPessoa().getPessSexo());

                    if (gen.equals(genero)) {
                        num++;
                    }
                }
            }

        }
        return num;
    }


    private XMLGregorianCalendar getDate(String data) {

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


}
