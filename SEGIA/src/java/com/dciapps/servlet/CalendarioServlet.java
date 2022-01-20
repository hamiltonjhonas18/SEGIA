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

import com.dciapps.local.HCal;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Agenda;
import com.dciapps.webclient.Calendario;
import com.dciapps.webclient.CalendarioExame;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Disciplina;
import com.dciapps.webclient.Docente;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Sala;
import com.dciapps.webclient.SalaExame;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
@WebServlet(name = "Q2FsZW5kYXJpb1NlcnZsZXQjRENJ", urlPatterns = {"/Q2FsZW5kYXJpb1NlcnZsZXQjRENJ"})
public class CalendarioServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();

    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

    Sender sender = new Sender();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

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

                case "filtrar-semestre": {
                    String to = st.nextToken().split("=")[1];
                    String semestre = request.getParameter("semestre");

                    Turma turma = (Turma) request.getSession().getAttribute("turma");
                    Curso curso = (Curso) request.getSession().getAttribute("curso");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    switch (to) {
                        case "schedule-class": {

                        }
                        ;
                        break;

                        case "schedule-test": {
                            List<Calendario> calendarios = null;

                            if (turma != null) {
                                calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString(semestre), turma);
                            }
                            request.getSession().setAttribute("calendarios", calendarios);
                        }
                        ;
                        break;
                    }

                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                    request.getSession().setAttribute("curso", (Curso) request.getSession().getAttribute("curso"));
                    request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));

                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("hCals", null);

                    response.sendRedirect(to);
                }
                ;
                break;

                case "filtrar-turma": {

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    String to = st.nextToken().split("=")[1];
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    Turma turma = ensinoCtrl.buscaTurmaId(idTurma);

                    switch (to) {
                        case "schedule-class": {

                            List<Agenda> agendas = ensinoCtrl.listaAgendaTurmaSemestre(entidade, anoLectivo, encryptUtils.encodeString(semestre), turma);

                            List<HCal> hCals = fillCalendar(agendas, semestre);

                            request.getSession().setAttribute("agendas", agendas);
                            request.getSession().setAttribute("hCals", hCals);
                        }
                        ;
                        break;
                    }

                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    response.sendRedirect(to);
                }
                ;
                break;

                case "horarios": {

                    request.getSession().setAttribute("curso", null);

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("curso");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (!cursos.isEmpty()) {
                            curso = cursos.get(0);
                        }

                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    @SuppressWarnings("UnusedAssignment")
                    List<Turma> turmas = null;
                    Turma turma = null;

                    if (curso != null) {
                        turmas = ensinoCtrl.listaTurmasCurso(entidade, curso);

                        if (!turmas.isEmpty()) {
                            turma = turmas.get(0);
                        }
                    }

                    List<Agenda> agendas = null;

                    if (turma != null) {
                        agendas = ensinoCtrl.listaAgendaTurmaSemestre(entidade, anoLectivo, encryptUtils.encodeString(semestre), turma);
                    }

                    List<Disciplina> disciplinas = ensinoCtrl.listaDisciplinas(entidade);

                    List<HCal> hCals = fillCalendar(agendas, semestre);

                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("curso", curso);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("agendas", agendas);
                    request.getSession().setAttribute("hCals", hCals);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou o formulário de gestão de horários"));

                    response.sendRedirect("schedule-class");
                }
                ;
                break;

                case "definir-horario": {

                    int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                    String diaSemana = request.getParameter("diaSemana");

                    String horas[] = request.getParameterValues("horas");

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    Turma turma = (Turma) request.getSession().getAttribute("turma");
                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    Disciplina disciplina = ensinoCtrl.buscaDisciplinaId(idDisciplina);

                    for (String hora : horas) {
                        Agenda agenda = ensinoCtrl.buscaAgendaTodosCriterios(entidade, encryptUtils.encodeString(diaSemana), encryptUtils.encodeString(hora), encryptUtils.encodeString(semestre), turma, anoLectivo, disciplina);

                        if (agenda == null) {
                            agenda = new Agenda();

                            agenda.setAnoLectivo(anoLectivo);
                            agenda.setAgenDiaSemana(encryptUtils.encodeString(diaSemana));
                            agenda.setAgenHora(encryptUtils.encodeString(hora));
                            agenda.setAgenSemestre(encryptUtils.encodeString(semestre));
                            agenda.setEncrypted(true);
                            agenda.setEntidade(entidade);
                            agenda.setTurma(turma);
                        }
                        agenda.setDisciplina(disciplina);

                        ensinoCtrl.persistirAgenda(agenda);
                    }
                    String msgErro = "Horário actualizado com sucesso";
                    String alerta = "bg-success";

                    List<Agenda> agendas = ensinoCtrl.listaAgendaTurmaSemestre(entidade, anoLectivo, encryptUtils.encodeString(semestre), turma);

                    request.getSession().setAttribute("agendas", agendas);

                    List<HCal> hCals = fillCalendar(agendas, semestre);

                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                    request.getSession().setAttribute("curso", (Curso) request.getSession().getAttribute("curso"));
                    request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("hCals", hCals);
                    request.getSession().setAttribute("diaSemana", diaSemana);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("schedule-class");
                }
                ;
                break;

                case "imprimir-horario": {
                    request.getSession().setAttribute("hCals", (List<HCal>) request.getSession().getAttribute("hCals"));
                    request.getSession().setAttribute("turma", (Turma) request.getSession().getAttribute("turma"));
                    request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));

                    response.sendRedirect("print-schedule-class");
                }
                ;
                break;

                case "testes": {

                    request.getSession().setAttribute("curso", null);

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("curso");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (!cursos.isEmpty()) {
                            curso = cursos.get(0);
                        }

                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    @SuppressWarnings("UnusedAssignment")
                    List<Turma> turmas = null;
                    Turma turma = null;

                    if (curso != null) {
                        turmas = ensinoCtrl.listaTurmasCurso(entidade, curso);

                        if (!turmas.isEmpty()) {
                            turma = turmas.get(0);
                        }
                    }

                    List<Calendario> calendarios = null;

                    if (turma != null) {
                        calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString(semestre), turma);
                    }

                    List<Disciplina> disciplinas = ensinoCtrl.listaDisciplinas(entidade);

                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("curso", curso);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("calendarios", calendarios);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou o formulário de gestão de calendarios de testes"));

                    response.sendRedirect("schedule-test");
                }
                ;
                break;

                case "definir-calendario-teste": {

                    int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                    String data1 = request.getParameter("data1");
                    String data2 = request.getParameter("data2");
                    String data3 = request.getParameter("data3");
                    String data4 = request.getParameter("data4");
                    String data5 = request.getParameter("data5");
                    String data6 = request.getParameter("data5");

                    String data1Limite = request.getParameter("data1Limite");
                    String data2Limite = request.getParameter("data2Limite");
                    String data3Limite = request.getParameter("data3Limite");
                    String data4Limite = request.getParameter("data4Limite");
                    String data5Limite = request.getParameter("data5Limite");
                    String data6Limite = request.getParameter("data6Limite");

                    String tem = request.getParameter("tem");
                    String acp2 = request.getParameter("acp2");
                    String acs3 = request.getParameter("acs3");
                    String acs4 = request.getParameter("acs4");

                    boolean haveExame = false;
                    boolean haveAcp2 = false;
                    boolean haveAcs3 = false;
                    boolean haveAcs4 = false;

                    if (tem != null) {
                        haveExame = true;
                    }

                    if (acp2 != null) {
                        haveAcp2 = true;
                    }

                    if (acs3 != null) {
                        haveAcs3 = true;
                    }

                    if (acs4 != null) {
                        haveAcs4 = true;
                    }

                    XMLGregorianCalendar calendar1 = getDate(data1);
                    XMLGregorianCalendar calendar2 = getDate(data2);
                    XMLGregorianCalendar calendar3 = getDate(data3);
                    XMLGregorianCalendar calendar4 = getDate(data4);
                    XMLGregorianCalendar calendar5 = getDate(data5);
                    XMLGregorianCalendar calendar6 = getDate(data6);

                    XMLGregorianCalendar calendar1Limite = getDateCalendario(data1Limite);
                    XMLGregorianCalendar calendar2Limite = getDateCalendario(data2Limite);
                    XMLGregorianCalendar calendar3Limite = getDateCalendario(data3Limite);
                    XMLGregorianCalendar calendar4Limite = getDateCalendario(data4Limite);
                    XMLGregorianCalendar calendar5Limite = getDateCalendario(data5Limite);
                    XMLGregorianCalendar calendar6Limite = getDateCalendario(data6Limite);

                    String msgErro = "Calendario de testes actualizado com sucesso";

                    String alerta = "bg-success";

                    boolean dateGood = dateCurrent(calendar1.toGregorianCalendar().getTime());

                    if (dateGood) {
                        dateGood = dateCurrent(calendar2.toGregorianCalendar().getTime());

                        if (dateGood) {
                            dateGood = dateCurrent(calendar3.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar4.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar5.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar6.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar1Limite.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar2Limite.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar3Limite.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar4Limite.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar5Limite.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar6Limite.toGregorianCalendar().getTime());
                        }
                    }

                    if (dateGood) {

                        AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                        Turma turma = (Turma) request.getSession().getAttribute("turma");
                        String semestre = "1º TRIMESTRE";

                        if (request.getSession().getAttribute("semestre") != null) {
                            semestre = request.getSession().getAttribute("semestre").toString();
                        }

                        Disciplina disciplina = ensinoCtrl.buscaDisciplinaId(idDisciplina);

                        Curso curso = turma.getCurso();

                        Calendario calendario = ensinoCtrl.buscaCalendarioTodosCriterios(entidade, curso, encryptUtils.encodeString(semestre), turma, anoLectivo, disciplina);

                        if (calendario == null) {
                            calendario = new Calendario();

                            calendario.setAnoLectivo(anoLectivo);
                            calendario.setCaleSemestre(encryptUtils.encodeString(semestre));
                            calendario.setEncrypted(true);
                            calendario.setEntidade(entidade);
                            calendario.setTurma(turma);
                            calendario.setCurso(turma.getCurso());
                        }
                        calendario.setDisciplina(disciplina);
                        calendario.setCaleTeste1(calendar1);
                        calendario.setCaleTeste2(calendar2);
                        calendario.setCaleTeste3(calendar3);
                        calendario.setCaleTeste4(calendar4);
                        calendario.setCaleAcp(calendar5);
                        calendario.setCaleAcp2(calendar6);

                        calendario.setCaleTeste1Limite(calendar1Limite);
                        calendario.setCaleTeste2Limite(calendar2Limite);
                        calendario.setCaleTeste3Limite(calendar3Limite);
                        calendario.setCaleTeste4Limite(calendar4Limite);
                        calendario.setCaleAcpLimite(calendar5Limite);
                        calendario.setCaleAcp2Limite(calendar6Limite);

                        calendario.setCaleHaveExame(haveExame);
                        calendario.setCaleHaveAcp(haveAcp2);
                        calendario.setCaleHaveTeste3(haveAcs3);
                        calendario.setCaleHaveTeste4(haveAcs4);

                        if (!haveExame) {
                            calendario.setCaleExame(null);
                            calendario.setCaleRecorrencia(null);
                        }

                        if (!haveAcp2) {
                            calendario.setCaleAcp2(null);
                            calendario.setCaleAcp2Limite(null);
                        }

                        if (!haveAcs3) {
                            calendario.setCaleTeste3(null);
                            calendario.setCaleTeste3Limite(null);
                        }

                        if (!haveAcs4) {
                            calendario.setCaleTeste4(null);
                            calendario.setCaleTeste4Limite(null);
                        }

                        ensinoCtrl.persistirCalendario(calendario);
                        List<Calendario> calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString(semestre), turma);

                        request.getSession().setAttribute("calendarios", calendarios);

                        request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                        request.getSession().setAttribute("turma", turma);
                        request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                        request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                        request.getSession().setAttribute("curso", (Curso) request.getSession().getAttribute("curso"));
                        request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));
                        request.getSession().setAttribute("semestre", semestre);

                    } else {

                        msgErro = "Calendario não definido, as datas não podem ser atrasadas";
                        alerta = "bg-warning";

                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("schedule-test");
                }
                ;
                break;

                case "imprimir-calendario": {

                    request.getSession().setAttribute("calendarios", (List<Calendario>) request.getSession().getAttribute("calendarios"));

                    request.getSession().setAttribute("turma", (Turma) request.getSession().getAttribute("turma"));
                    request.getSession().setAttribute("curso", (Curso) request.getSession().getAttribute("curso"));
                    request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));
                    request.getSession().setAttribute("semestre", request.getSession().getAttribute("semestre").toString());

                    response.sendRedirect("print-schedule-test");

                }
                ;
                break;

                case "calendario-exame": {

                    request.getSession().setAttribute("curso", null);

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("curso");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (!cursos.isEmpty()) {
                            curso = cursos.get(0);
                        }

                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    List<CalendarioExame> calendariosExame = ensinoCtrl.listaCalendarioExameAno(entidade, curso, anoLectivo);

                    List<Disciplina> disciplinas = ensinoCtrl.listaDisciplinas(entidade);

                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("curso", curso);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("calendariosExame", calendariosExame);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou o formulário de gestão de calendarios dos exames"));

                    response.sendRedirect("schedule-exam");
                }
                ;
                break;

                case "definir-calendario-exame": {

                    int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                    String data1 = request.getParameter("data1");
                    String data2 = request.getParameter("data2");

                    String data1Limite = request.getParameter("data1Limite");
                    String data2Limite = request.getParameter("data2Limite");

                    XMLGregorianCalendar calendar1 = getDate(data1);
                    XMLGregorianCalendar calendar2 = getDate(data2);

                    XMLGregorianCalendar calendar1Limite = getDateCalendario(data1Limite);
                    XMLGregorianCalendar calendar2Limite = getDateCalendario(data2Limite);

                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");

                    boolean dateGood = dateCurrent(calendar1.toGregorianCalendar().getTime());

                    String msgErro = "Calendario dos exames actualizado com sucesso";
                    String alerta = "bg-success";

                    if (dateGood) {
                        dateGood = dateCurrent(calendar2.toGregorianCalendar().getTime());

                        if (dateGood) {
                            dateGood = dateCurrent(calendar1Limite.toGregorianCalendar().getTime());
                        }

                        if (dateGood) {
                            dateGood = dateCurrent(calendar2Limite.toGregorianCalendar().getTime());
                        }
                    }

                    if (dateGood) {
                        AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                        Disciplina disciplina = getDisciplina(disciplinas, idDisciplina);

                        Curso curso = (Curso) request.getSession().getAttribute("curso");

                        CalendarioExame calendarioExame = ensinoCtrl.buscaCalendarioExameTodosCriterios(entidade, curso, anoLectivo, disciplina);

                        if (calendarioExame == null) {
                            calendarioExame = new CalendarioExame();

                            calendarioExame.setAnoLectivo(anoLectivo);
                            calendarioExame.setEncrypted(true);
                            calendarioExame.setEntidade(entidade);
                            calendarioExame.setDisciplina(disciplina);
                            calendarioExame.setCurso(curso);
                        }

                        calendarioExame.setCaleeExame(calendar1);
                        calendarioExame.setCaleeExameLimite(calendar1Limite);
                        calendarioExame.setCaleeRecorrencia(calendar2);
                        calendarioExame.setCaleeRecorrenciaLimite(calendar2Limite);

                        ensinoCtrl.persistirCalendarioExame(calendarioExame);

                        List<CalendarioExame> calendariosExame = ensinoCtrl.listaCalendarioExameAno(entidade, curso, anoLectivo);

                        request.getSession().setAttribute("calendariosExame", calendariosExame);
                    } else {

                        msgErro = "Calendario não pode ser definido, as datas estão atrasadas.";
                        alerta = "bg-warning";
                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("schedule-exam");
                }
                ;
                break;

                case "juris": {

                    request.getSession().setAttribute("curso", null);

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("curso");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                    }

                    if (request.getParameter("idCurso") == null) {

                        if (!cursos.isEmpty()) {
                            curso = cursos.get(0);
                        }

                    } else {
                        int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                        curso = ensinoCtrl.buscaCursoId(idCurso);
                    }

                    List<CalendarioExame> calendariosExame = ensinoCtrl.listaCalendarioExameAno(entidade, curso, anoLectivo);
                    List<SalaExame> salasExame = ensinoCtrl.listaSalaExameCursoAno(entidade, curso, anoLectivo);

                    List<Docente> docentes = ensinoCtrl.listaDocentes(entidade);
                    List<Sala> salas = ensinoCtrl.listaSalas(entidade);

                    request.getSession().setAttribute("docentes", docentes);
                    request.getSession().setAttribute("salas", salas);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("curso", curso);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("calendariosExame", calendariosExame);
                    request.getSession().setAttribute("salasExame", salasExame);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou o formulário de definição dos membros de jurí"));

                    response.sendRedirect("exam-jury");
                }
                ;
                break;

                case "definir-juri": {

                    List<Sala> salas = (List<Sala>) request.getSession().getAttribute("salas");
                    List<Docente> docentes = (List<Docente>) request.getSession().getAttribute("docentes");
                    List<CalendarioExame> calendariosExame = (List<CalendarioExame>) request.getSession().getAttribute("calendariosExame");

                    int idCalendario = Integer.parseInt(request.getParameter("idCalendario"));
                    int idSala = Integer.parseInt(request.getParameter("idSala"));
                    int idDocente1 = Integer.parseInt(request.getParameter("idDocente1"));
                    int idDocente2 = Integer.parseInt(request.getParameter("idDocente2"));

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    Curso curso = (Curso) request.getSession().getAttribute("curso");

                    String categoria = request.getParameter("categoria");
                    int numAlunos = Integer.parseInt(request.getParameter("numAlunos"));

                    CalendarioExame calendarioExame = getCalendarioExame(calendariosExame, idCalendario);
                    Sala sala = getSala(salas, idSala);
                    Docente docente1 = getDocente(docentes, idDocente1);
                    Docente docente2 = getDocente(docentes, idDocente2);

                    XMLGregorianCalendar calendar = calendarioExame.getCaleeExame();

                    String msgErro = "Jurí dos exames actualizado com sucesso";
                    String alerta = "bg-success";

                    if (docente1.getDoceId() != docente2.getDoceId()) {
                        if (categoria.equals("2ª Época")) {
                            calendar = calendarioExame.getCaleeRecorrencia();
                        }

                        Disciplina disciplina = calendarioExame.getDisciplina();

                        SalaExame salaExame = ensinoCtrl.buscaSalaExameTodosCriterios(entidade, curso, sala, anoLectivo, disciplina);

                        if (salaExame == null) {
                            salaExame = new SalaExame();
                            salaExame.setAnoLectivo(anoLectivo);
                            salaExame.setCurso(curso);
                            salaExame.setDisciplina(disciplina);
                            salaExame.setSala(sala);
                            salaExame.setEntidade(entidade);
                        }

                        salaExame.setJuri1(docente1);
                        salaExame.setJuri2(docente2);
                        salaExame.setSalaeData(calendar);
                        salaExame.setSalaeMaxAlunos(numAlunos);

                        ensinoCtrl.persistirSalaExame(salaExame);

                        List<SalaExame> salasExame = ensinoCtrl.listaSalaExameCursoAno(entidade, curso, anoLectivo);

                        request.getSession().setAttribute("salasExame", salasExame);
                    } else {

                        msgErro = "O membro do júri não pode ser a mesma pessoa";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("exam-jury");

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

    private XMLGregorianCalendar getDateCalendario(String data) {

        StringTokenizer st = new StringTokenizer(data, "/");
        String dt = st.nextToken();
        if (dt.startsWith("0")) {
            dt = dt.charAt(dt.length() - 1) + "";
        }
        int day = Integer.parseInt(dt);
        int month = Integer.parseInt(st.nextToken()) - 1;

        int year = Integer.parseInt(st.nextToken());

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, day, 23, 59, 59);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        return calendar;
    }

    private Agenda getAgenda(List<Agenda> agendas, String diaSemana, String horario, String semestre) {
        Agenda agenda = null;

        for (Agenda a : agendas) {
            String d = encryptUtils.decodeString(a.getAgenDiaSemana());
            String s = encryptUtils.decodeString(a.getAgenSemestre());
            String h = encryptUtils.decodeString(a.getAgenHora());

            if (diaSemana.equals(d) && horario.equals(h) && semestre.equals(s)) {
                agenda = a;
            }
        }

        return agenda;
    }

    private List<HCal> fillCalendar(List<Agenda> agendas, String semestre) {
        List<HCal> hCals = new ArrayList();

        String dias[] = {"SEGUNDA-FEIRA", "TERÇA-FEIRA", "QUARTA-FEIRA", "QUINTA-FEIRA", "SEXTA-FEIRA", "SABÁDO"};

        String horarios[] = {"07:00 - 07:45", "07:50 - 08:35", "08:40 - 09:25", "09:40 - 10:25", "10:30 - 11:15", "11:20 - 12:05",
            "12:40 - 13:25", "13:30 - 14:15", "14:20 - 15:05", "15:20 - 16:05", "16:10 - 16:55", "17:00 - 17:45", "17:45 - 18:30"};

        for (String horario : horarios) {
            HCal hc = new HCal();

            hc.setHorario(horario);

            List<String> aulas = new ArrayList();

            for (String diaSemana : dias) {
                Agenda a = getAgenda(agendas, diaSemana, horario, semestre);

                String str = "";

                if (a != null) {
                    str = encryptUtils.decodeString(a.getDisciplina().getDiscDescricao());
                }

                aulas.add(str);
            }

            hc.setAulas(aulas);

            hCals.add(hc);
        }

        return hCals;
    }

    private Disciplina getDisciplina(List<Disciplina> disciplinas, int id) {
        Disciplina value = null;

        if (disciplinas != null) {
            for (Disciplina d : disciplinas) {
                if (d.getDiscId() == id) {
                    value = d;
                }
            }
        }

        return value;
    }

    private Docente getDocente(List<Docente> docentes, int id) {
        Docente value = null;

        if (docentes != null) {
            for (Docente d : docentes) {
                if (d.getDoceId() == id) {
                    value = d;
                }
            }
        }

        return value;
    }

    private Sala getSala(List<Sala> salas, int id) {
        Sala value = null;

        if (salas != null) {
            for (Sala d : salas) {
                if (d.getSalaId() == id) {
                    value = d;
                }
            }
        }

        return value;
    }

    private CalendarioExame getCalendarioExame(List<CalendarioExame> calendariosExame, int id) {
        CalendarioExame value = null;

        if (calendariosExame != null) {
            for (CalendarioExame d : calendariosExame) {
                if (d.getCaleeId() == id) {
                    value = d;
                }
            }
        }

        return value;
    }

    private boolean dateCurrent(Date day) {
        return !day.before(new Date());
    }
}
