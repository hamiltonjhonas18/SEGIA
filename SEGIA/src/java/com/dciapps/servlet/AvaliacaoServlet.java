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

import com.dciapps.local.DN;
import com.dciapps.local.ImpNota;
import com.dciapps.local.ImpRes;
import com.dciapps.local.PM;
import com.dciapps.local.Pauta;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.InternetConnetion;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Avaliacao;
import com.dciapps.webclient.Calendario;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Disciplina;
import com.dciapps.webclient.DisciplinaCurso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Exame;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Media;
import com.dciapps.webclient.Notas;
import com.dciapps.webclient.Presencas;
import com.dciapps.webclient.Resposta;
import com.dciapps.webclient.SalaExame;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Upload;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
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
import mz.co.dciapps.ExcelCtrl;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "QXZhbGlhY2FvU2VydmxldCNEQ0k=", urlPatterns = {"/QXZhbGlhY2FvU2VydmxldCNEQ0k="})
public class AvaliacaoServlet extends HttpServlet {

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

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    InternetConnetion internetConnetion = new InternetConnetion();
    ExcelCtrl excelCtrl = new ExcelCtrl();

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

                case "filtrar-turma": {

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    String to = st.nextToken().split("=")[1];
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));

                    Turma turma = ensinoCtrl.buscaTurmaId(idTurma);

                    Curso curso = turma.getCurso();

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    switch (to) {
                        case "avl-behavior": {

                            List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                            request.getSession().setAttribute("inscricoes", inscricoes);
                        }
                        ;
                        break;
                        case "avl-attendance": {

                            List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                            Date dataHoje = new Date();
                            String periodo = sdf.format(dataHoje);
                            String dataSelecionada = sdf2.format(dataHoje) + " - " + sdf2.format(dataHoje);

                            List<Presencas> presencas = ensinoCtrl.listaPresencasTurmaData(entidade, turma, sdf.format(dataHoje));

                            request.getSession().setAttribute("alunos", alunosCurso(inscricoes));
                            request.getSession().setAttribute("periodo", periodo);
                            request.getSession().setAttribute("dataSelecionada", dataSelecionada);
                            request.getSession().setAttribute("presencas", presencas);
                        }
                        ;
                        break;
                        case "avl-notes": {

                            List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                            List<Calendario> calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString(semestre), turma);

                            Calendario calendario = null;

                            if (!calendarios.isEmpty()) {
                                calendario = calendarios.get(0);
                            }

                            List<Aluno> alunos = alunosCurso(inscricoes);

                            Disciplina disciplina = null;

                            List<Notas> notas = null;

                            if (calendario != null) {
                                disciplina = calendario.getDisciplina();

                                notas = ensinoCtrl.listaNotasDisciplinaSemestre(entidade, turma, disciplina, anoLectivo, encryptUtils.encodeString(semestre));

                                if (notas == null) {
                                    notas = new ArrayList();
                                }

                                for (Inscricao i : inscricoes) {
                                    boolean have = checkStudent(notas, i);

                                    if (!have) {
                                        Notas n = new Notas();

                                        n.setAluno(i.getAluno());
                                        n.setAnoLectivo(anoLectivo);
                                        n.setDisciplina(disciplina);
                                        n.setEncrypted(have);
                                        n.setEntidade(entidade);
                                        n.setTurma(turma);
                                        n.setInscricao(i);

                                        notas.add(n);
                                    }
                                }

                            }

                            request.getSession().setAttribute("inscricoes", inscricoes);
                            request.getSession().setAttribute("alunos", alunos);
                            request.getSession().setAttribute("disciplina", disciplina);
                            request.getSession().setAttribute("notas", notas);
                            request.getSession().setAttribute("calendarios", calendarios);
                            request.getSession().setAttribute("calendario", calendario);
                        }
                        ;
                        break;
                        case "avl-guidelines": {

                            List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                            Disciplina disciplina = null;

                            List<Calendario> calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString("1º TRIMESTRE"), turma);

                            Calendario calendario = null;
                            if (calendarios != null) {
                                if (!calendarios.isEmpty()) {
                                    calendario = calendarios.get(0);
                                }
                            }

                            List<Aluno> alunos = alunosCurso(inscricoes);

                            List<Pauta> pautas = new ArrayList();

                            if (calendario != null) {
                                disciplina = calendario.getDisciplina();

                                List<Notas> notas = ensinoCtrl.listaNotasDisciplinaTurma(entidade, turma, disciplina, anoLectivo);

                                if (inscricoes != null) {
                                    for (Inscricao i : inscricoes) {

                                        Notas notas1 = getNotas(notas, i, encryptUtils.encodeString("1º TRIMESTRE"));
                                        Notas notas2 = getNotas(notas, i, encryptUtils.encodeString("2º TRIMESTRE"));
                                        Notas notas3 = getNotas(notas, i, encryptUtils.encodeString("3º TRIMESTRE"));

                                        List<Notas> notasPauta = new ArrayList();
                                        notasPauta.add(notas1);
                                        notasPauta.add(notas2);
                                        notasPauta.add(notas3);

                                        Pauta pauta = new Pauta();
                                        pauta.setInscricao(i);
                                        pauta.setNotas(notasPauta);

                                        pautas.add(pauta);
                                    }
                                }

                            }
                            request.getSession().setAttribute("alunos", alunos);
                            request.getSession().setAttribute("disciplina", disciplina);
                            request.getSession().setAttribute("pautas", pautas);
                            request.getSession().setAttribute("calendarios", calendarios);
                            request.getSession().setAttribute("calendario", calendario);
                        }
                        ;
                        break;

                        case "exam-distribution": {

                            List<Calendario> calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString("1º TRIMESTRE"), turma);

                            Calendario calendario = null;
                            if (calendarios != null) {
                                if (!calendarios.isEmpty()) {
                                    calendario = calendarios.get(0);
                                }
                            }

                            List<Media> medias = null;
                            List<SalaExame> salasExame = null;
                            if (calendario != null) {
                                Disciplina disciplina = calendario.getDisciplina();

                                medias = ensinoCtrl.listaMediasTurmaDisciplinaApurados(entidade, turma, disciplina);
                                salasExame = ensinoCtrl.listaSalaExameDisciplina(entidade, curso, anoLectivo, disciplina);

                            }

                            request.getSession().setAttribute("medias", medias);
                            request.getSession().setAttribute("salasExame", salasExame);
                        }
                        ;
                        break;

                        case "avl-guidelines-freq": {

                            List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                            List<DisciplinaCurso> disciplinasCurso = (List<DisciplinaCurso>) request.getSession().getAttribute("disciplinasCurso");

                            List<PM> pms = new ArrayList();
                            if (inscricoes != null) {

                                for (Inscricao inscricao : inscricoes) {
                                    float medF = 0;
                                    String comp = "";
                                    List<DN> dns = new ArrayList();

                                    PM pm = new PM();
                                    pm.setInscricao(inscricao);

                                    int i = 0;
                                    if (disciplinasCurso != null) {
                                        for (DisciplinaCurso dc : disciplinasCurso) {
                                            Media media = ensinoCtrl.buscaMedia(entidade, anoLectivo, inscricao.getAluno(), dc.getDisciplina());
                                            float med = 0;

                                            if (media != null) {
                                                med = (media.getMediMedia() + media.getMediMedia2() + media.getMediMedia3()) / 3;
                                            }

                                            DN dn = new DN();
                                            dn.setDisciplina(dc.getDisciplina());
                                            dn.setMed(med);

                                            dns.add(dn);

                                            medF += med;
                                            i++;
                                        }
                                    }

                                    if (i != 0) {
                                        medF = medF / i;
                                    }

                                    pm.setComportamentoFinal(comp);
                                    pm.setDns(dns);
                                    pm.setInscricao(inscricao);
                                    pm.setMediaFinal(medF);

                                    pms.add(pm);

                                }

                            }
                            request.getSession().setAttribute("pms", pms);
                            request.getSession().setAttribute("disciplinasCurso", disciplinasCurso);

                        }
                        ;
                        break;

                    }

                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                    request.getSession().setAttribute("cursoSelecionado", (Curso) request.getSession().getAttribute("cursoSelecionado"));
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));

                    response.sendRedirect(to);
                }
                ;
                break;

                case "filtrar-semestre": {
                    String to = st.nextToken().split("=")[1];
                    String semestre = request.getParameter("semestre");

                    Turma turma = (Turma) request.getSession().getAttribute("turma");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    switch (to) {

                        case "avl-notes": {

                            List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                            List<Calendario> calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString(semestre), turma);

                            Calendario calendario = null;

                            if (!calendarios.isEmpty()) {
                                calendario = calendarios.get(0);
                            }

                            List<Aluno> alunos = alunosCurso(inscricoes);

                            Disciplina disciplina = null;

                            List<Notas> notas = null;

                            if (calendario != null) {
                                disciplina = calendario.getDisciplina();

                                notas = ensinoCtrl.listaNotasDisciplinaSemestre(entidade, turma, disciplina, anoLectivo, encryptUtils.encodeString(semestre));

                                if (notas == null) {
                                    notas = new ArrayList();
                                }

                                for (Inscricao i : inscricoes) {
                                    boolean have = checkStudent(notas, i);

                                    if (!have) {
                                        Notas n = new Notas();

                                        n.setAluno(i.getAluno());
                                        n.setAnoLectivo(anoLectivo);
                                        n.setDisciplina(disciplina);
                                        n.setEncrypted(have);
                                        n.setEntidade(entidade);
                                        n.setTurma(turma);
                                        n.setInscricao(i);

                                        notas.add(n);
                                    }
                                }

                            }

                            request.getSession().setAttribute("inscricoes", inscricoes);
                            request.getSession().setAttribute("alunos", alunos);
                            request.getSession().setAttribute("disciplina", disciplina);
                            request.getSession().setAttribute("notas", notas);
                            request.getSession().setAttribute("calendarios", calendarios);
                            request.getSession().setAttribute("calendario", calendario);
                        }
                        ;
                        break;
                    }

                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                    request.getSession().setAttribute("cursoSelecionado", (Curso) request.getSession().getAttribute("cursoSelecionado"));
                    request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));
                    request.getSession().setAttribute("semestre", semestre);

                    response.sendRedirect(to);
                }
                ;
                break;

                case "filtrar-calendario": {

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    String to = st.nextToken().split("=")[1];
                    int idCalendario = Integer.parseInt(request.getParameter("idCalendario"));

                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    Calendario calendario = ensinoCtrl.buscaCalendarioId(idCalendario);
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    switch (to) {

                        case "avl-notes": {

                            Disciplina disciplina = null;

                            List<Notas> notas = null;

                            if (calendario != null) {
                                disciplina = calendario.getDisciplina();

                                notas = ensinoCtrl.listaNotasDisciplinaSemestre(entidade, turma, disciplina, anoLectivo, encryptUtils.encodeString(semestre));

                                if (notas == null) {
                                    notas = new ArrayList();
                                }

                                for (Inscricao i : inscricoes) {
                                    boolean have = checkStudent(notas, i);

                                    if (!have) {
                                        Notas n = new Notas();

                                        n.setAluno(i.getAluno());
                                        n.setAnoLectivo(anoLectivo);
                                        n.setDisciplina(disciplina);
                                        n.setEncrypted(have);
                                        n.setEntidade(entidade);
                                        n.setTurma(turma);
                                        n.setInscricao(i);

                                        notas.add(n);
                                    }
                                }

                            }

                            request.getSession().setAttribute("disciplina", disciplina);
                            request.getSession().setAttribute("notas", notas);
                        }
                        ;
                        break;

                        case "avl-guidelines": {

                            Disciplina disciplina = null;

                            List<Pauta> pautas = new ArrayList();

                            if (calendario != null) {
                                disciplina = calendario.getDisciplina();

                                List<Notas> notas = ensinoCtrl.listaNotasDisciplinaTurma(entidade, turma, disciplina, anoLectivo);

                                if (inscricoes != null) {
                                    for (Inscricao i : inscricoes) {

                                        Notas notas1 = getNotas(notas, i, encryptUtils.encodeString("1º TRIMESTRE"));
                                        Notas notas2 = getNotas(notas, i, encryptUtils.encodeString("2º TRIMESTRE"));
                                        Notas notas3 = getNotas(notas, i, encryptUtils.encodeString("3º TRIMESTRE"));

                                        List<Notas> notasPauta = new ArrayList();
                                        notasPauta.add(notas1);
                                        notasPauta.add(notas2);
                                        notasPauta.add(notas3);

                                        Pauta pauta = new Pauta();
                                        pauta.setInscricao(i);
                                        pauta.setNotas(notasPauta);

                                        pautas.add(pauta);
                                    }
                                }

                            }

                            request.getSession().setAttribute("disciplina", disciplina);
                            request.getSession().setAttribute("pautas", pautas);
                        }
                        ;
                        break;

                        case "exam-distribution": {

                            List<Media> medias = null;
                            List<SalaExame> salasExame = null;
                            if (calendario != null) {
                                Disciplina disciplina = calendario.getDisciplina();

                                Curso curso = calendario.getTurma().getCurso();
                                medias = ensinoCtrl.listaMediasTurmaDisciplinaApurados(entidade, turma, disciplina);
                                salasExame = ensinoCtrl.listaSalaExameDisciplina(entidade, curso, anoLectivo, disciplina);

                            }

                            request.getSession().setAttribute("medias", medias);
                            request.getSession().setAttribute("salasExame", salasExame);

                        }
                        ;
                        break;

                    }

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("calendario", calendario);
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                    request.getSession().setAttribute("cursoSelecionado", (Curso) request.getSession().getAttribute("cursoSelecionado"));
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                    request.getSession().setAttribute("calendarios", (List<Calendario>) request.getSession().getAttribute("calendarios"));

                    response.sendRedirect(to);
                }
                ;
                break;

                case "filtrar-salaExame": {

                    String to = st.nextToken().split("=")[1];
                    int idSala = Integer.parseInt(request.getParameter("idSala"));

                    List<SalaExame> salasExame = (List<SalaExame>) request.getSession().getAttribute("salasExame");
                    SalaExame salaExame = getSalaExame(salasExame, idSala);
                    List<Exame> exames = null;

                    if (salaExame != null) {
                        exames = ensinoCtrl.listaExamesSala(entidade, salaExame);
                    }

                    request.getSession().setAttribute("salaExame", salaExame);
                    request.getSession().setAttribute("exames", exames);

                    response.sendRedirect(to);
                }
                ;
                break;

                case "lancar-notas": {

                    Calendario calendario = (Calendario) request.getSession().getAttribute("calendario");

                    boolean haveT3 = false;
                    boolean haveT4 = false;
                    boolean haveA2 = false;

                    if (calendario != null) {

                        haveT3 = calendario.isCaleHaveTeste3();
                        haveT4 = calendario.isCaleHaveTeste4();
                        haveA2 = calendario.isCaleHaveAcp();
                    }

                    float teste1 = Float.parseFloat(request.getParameter("teste1")); //1ª ACS
                    float teste2 = Float.parseFloat(request.getParameter("teste2")); //2ª ACS
                    float teste5 = Float.parseFloat(request.getParameter("teste5")); //1ª ACP

                    float teste3 = 0; //3ª ACS
                    float teste4 = 0; //4ª ACS
                    float teste6 = 0; //2ª ACP

                    int nACS = 2;
                    int nACP = 1;

                    if (haveT3) {
                        teste3 = Float.parseFloat(request.getParameter("teste3"));
                        nACS++;
                    }

                    if (haveT4) {
                        teste4 = Float.parseFloat(request.getParameter("teste4"));
                        nACS++;
                    }

                    if (haveA2) {
                        teste6 = Float.parseFloat(request.getParameter("teste6"));
                        nACP++;
                    }

                    List<Notas> notasAlunosTurma = (List<Notas>) request.getSession().getAttribute("notas");
                    List<Inscricao> inscrioes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    DecimalFormat df = new DecimalFormat();

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    Inscricao inscricao = getInscricao(inscrioes, id);

                    Aluno aluno = inscricao.getAluno();

                    Disciplina disciplina = null;

                    if (calendario != null) {
                        disciplina = calendario.getDisciplina();
                    }

                    Notas notas = ensinoCtrl.buscaNotasDisciplinaAluno(entidade, aluno, turma, disciplina, anoLectivo, encryptUtils.encodeString(semestre));

                    if (notas == null) {
                        notas = new Notas();
                        notas.setAluno(aluno);
                        notas.setAnoLectivo(anoLectivo);
                        notas.setDisciplina(disciplina);
                        notas.setEncrypted(true);
                        notas.setEntidade(entidade);
                        notas.setTurma(turma);
                        notas.setNotaSemestre(encryptUtils.encodeString(semestre));
                        notas.setInscricao(inscricao);

                        ensinoCtrl.persistirNotas(notas);

                        notas = ensinoCtrl.buscaNotasDisciplinaAluno(entidade, aluno, turma, disciplina, anoLectivo, encryptUtils.encodeString(semestre));

                    }

                    float mACS = Math.round((teste1 + teste2 + teste3 + teste4) / nACS);
                    float mACP = Math.round((teste5 + teste6) / nACP);

                    notas.setNotaTeste1(teste1);
                    notas.setNotaTeste2(teste2);
                    notas.setNotaTeste3(teste3);
                    notas.setNotaTeste4(teste4);
                    notas.setNotaAcp(teste5);
                    notas.setNotaAcp2(teste6);
                    notas.setNotaMedia(Math.round((mACS + mACP) / 2));

                    ensinoCtrl.persistirNotas(notas);

                    float mx = notas.getNotaMedia();
                    Media media = ensinoCtrl.buscaMedia(entidade, anoLectivo, aluno, disciplina);

                    if (media == null) {
                        media = new Media();
                        media.setAluno(aluno);
                        media.setAnoLectivo(anoLectivo);
                        media.setDisciplina(disciplina);
                        media.setMedSemestre(encryptUtils.encodeString(semestre));
                        media.setTurma(turma);
                        media.setInscricao(inscricao);
                        media.setEntidade(entidade);
                        media.setEncrypted(true);
                    }

                    switch (semestre) {
                        case "1º TRIMESTRE":
                            media.setMediMedia(mx);
                            break;
                        case "2º TRIMESTRE":
                            media.setMediMedia2(mx);
                            break;
                        case "3º TRIMESTRE":
                            media.setMediMedia3(mx);
                            break;
                    }

                    ensinoCtrl.persistirMedia(media);

                    String lg = "Lançou com sucesso as notas do aluno  " + encryptUtils.decodeString(notas.getAluno().getPessoa().getPessNome()) + " " + encryptUtils.decodeString(notas.getAluno().getPessoa().getPessApelido()) + " para a disciplina: " + encryptUtils.decodeString(notas.getDisciplina().getDiscDescricao());

                    if (!notas.getAluno().getPessoa().getPessSexo().equals("Masculino")) {
                        lg = "Lançou com sucesso as notas da aluna  " + encryptUtils.decodeString(notas.getAluno().getPessoa().getPessNome()) + " " + encryptUtils.decodeString(notas.getAluno().getPessoa().getPessApelido()) + " para a disciplina: " + encryptUtils.decodeString(notas.getDisciplina().getDiscDescricao());
                    }

                    String msgErro = lg;
                    String alerta = "bg-success";

                    request.getSession().setAttribute("notas", actualizaListaNotas(notasAlunosTurma, notas));
                    //  request.getSession().setAttribute("percentagemT1", percentagemT1);
                    // request.getSession().setAttribute("percentagemT2", percentagemT2);
                    // request.getSession().setAttribute("percentagemTP", percentagemTP);
                    // request.getSession().setAttribute("percentagemAC", percentagemAC);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("msgErro", msgErro);
                    controleAcessoCtrl.persistirLog(addLog(usuario, lg));
                    response.sendRedirect("avl-notes");
                }
                ;
                break;

                case "actualizar-percentages": {
                    int percentagemT1 = Integer.parseInt(request.getParameter("percentagemT1"));
                    int percentagemT2 = Integer.parseInt(request.getParameter("percentagemT2"));
                    int percentagemTP = Integer.parseInt(request.getParameter("percentagemTP"));
                    int percentagemAC = Integer.parseInt(request.getParameter("percentagemAC"));

                    String msgErro = "Percentagens das notas actualizadas com sucesso";
                    String alerta = "bg-success";

                    int somatorio = percentagemT1 + percentagemAC + percentagemT2 + percentagemTP;

                    if (somatorio != 100) {
                        msgErro = "O somatório das percentagens deve ser igual a 100 %. As alterações não formam efectuadas.";
                        alerta = "bg-danger";
                    } else {
                        request.getSession().setAttribute("percentagemT1", percentagemT1);
                        request.getSession().setAttribute("percentagemT2", percentagemT2);
                        request.getSession().setAttribute("percentagemTP", percentagemTP);
                        request.getSession().setAttribute("percentagemAC", percentagemAC);
                    }

                    request.getSession().setAttribute("calendarios", (List<Calendario>) request.getSession().getAttribute("calendarios"));
                    request.getSession().setAttribute("disciplina", (Disciplina) request.getSession().getAttribute("disciplina"));
                    request.getSession().setAttribute("alunos", (List<Aluno>) request.getSession().getAttribute("alunos"));
                    request.getSession().setAttribute("semestre", request.getSession().getAttribute("semestre").toString());
                    request.getSession().setAttribute("notas", (List<Notas>) request.getSession().getAttribute("notas"));
                    request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));
                    request.getSession().setAttribute("cursoSelecionado", (Curso) request.getSession().getAttribute("cursoSelecionado"));
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                    request.getSession().setAttribute("calendario", (Calendario) request.getSession().getAttribute("calendario"));

                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("msgErro", msgErro);

                    response.sendRedirect("avl-notes");
                }
                ;
                break;

                case "presencas": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    @SuppressWarnings("UnusedAssignment")
                    List<Presencas> presencas = null;
                    Date dataHoje = new Date();
                    String periodo = sdf.format(dataHoje);
                    String dataSelecionada = sdf2.format(dataHoje) + " - " + sdf2.format(dataHoje);

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    List<Inscricao> inscricoes = null;

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    }

                    if (request.getParameter("dataPesquisa") != null) {
                        String dataPesquisa = request.getParameter("dataPesquisa");
                        StringTokenizer tok = new StringTokenizer(dataPesquisa, " - ");
                        String d1 = tok.nextToken();
                        String d2 = tok.nextToken();

                        XMLGregorianCalendar calendar1 = getDate(d1);
                        XMLGregorianCalendar calendar2 = getDate(d2);

                        periodo = sdf.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf.format(calendar2.toGregorianCalendar().getTime());
                        dataSelecionada = sdf2.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf2.format(calendar2.toGregorianCalendar().getTime());

                        presencas = ensinoCtrl.listaPresencasTurmaPeriodo(entidade, turma, sdf.format(calendar1.toGregorianCalendar().getTime()), sdf.format(calendar2.toGregorianCalendar().getTime()));
                    } else {
                        presencas = ensinoCtrl.listaPresencasTurmaData(entidade, turma, sdf.format(dataHoje));
                    }

                    List<Disciplina> disciplinas = ensinoCtrl.listaDisciplinas(entidade);

                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("alunos", alunosCurso(inscricoes));
                    request.getSession().setAttribute("periodo", periodo);
                    request.getSession().setAttribute("dataSelecionada", dataSelecionada);
                    request.getSession().setAttribute("presencas", presencas);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário para a marcação de presenças para alunos do curso : "));
                    response.sendRedirect("avl-attendance");
                }
                ;
                break;

                case "processar-presenca": {
                    int idAluno = Integer.parseInt(request.getParameter("idAluno"));
                    int idDisciplina = Integer.parseInt(request.getParameter("idDisciplina"));
                    int faltas = 1;
                    String dataRegisto = request.getParameter("dataRegisto");

                    XMLGregorianCalendar calendar = getDate(dataRegisto);

                    Aluno aluno = ensinoCtrl.buscaAlunoId(idAluno);
                    Disciplina disciplina = ensinoCtrl.buscaDisciplinaId(idDisciplina);

                    Presencas presencas = ensinoCtrl.buscaPresencasAlunoDisciplina(entidade, aluno, disciplina);

                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    if (presencas == null) {
                        presencas = new Presencas();
                        presencas.setAluno(aluno);
                        presencas.setDisciplina(disciplina);
                        presencas.setEntidade(entidade);
                        presencas.setPresFaltas(faltas);
                        presencas.setPresData(calendar);
                        presencas.setTurma(turma);
                        presencas.setEncrypted(true);

                    } else {
                        presencas.setPresFaltas(presencas.getPresFaltas() + faltas);
                    }

                    ensinoCtrl.persistirPresencas(presencas);

                    String msgErro = faltas + " faltas foram adicionadas";

                    if (faltas == 1) {
                        msgErro = "Uma falta foi adicionada";
                    }

                    if (faltas < 0) {
                        if (faltas == -1) {
                            msgErro = "Uma falta foi removida";
                        } else {
                            msgErro = (faltas * -1) + " faltas foram removidas";
                        }
                    }

                    String lg = "Actualizou as faltas para o aluno " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " na disciplina " + encryptUtils.decodeString(disciplina.getDiscDescricao()) + "";
                    if (aluno.getPessoa().getPessSexo().equals("Masculino")) {
                        msgErro += " para o aluno " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " na disciplina " + encryptUtils.decodeString(disciplina.getDiscDescricao()) + "";
                    } else {

                        msgErro += " para a aluna " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " na disciplina " + encryptUtils.decodeString(disciplina.getDiscDescricao()) + "";
                        lg = "Actualizou as faltas para a aluna " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " na disciplina " + encryptUtils.decodeString(disciplina.getDiscDescricao()) + "";
                    }

                    String alerta = "bg-success";

                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                    request.getSession().setAttribute("alunos", (List<Aluno>) request.getSession().getAttribute("alunos"));
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("msgErro", msgErro);

                    controleAcessoCtrl.persistirLog(addLog(usuario, lg));
                    response.sendRedirect("avl-attendance");
                }
                ;
                break;

                case "boletins": {

                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");

                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesCurso(entidade, curso);

                    List<String> semestres = new ArrayList();
                    for (int i = 1; i <= (curso.getCursDuracao() * 2); i++) {
                        semestres.add(i + "º Semestre");
                    }
                    request.getSession().setAttribute("anosLectivos", ensinoCtrl.listasAnosLectivos(entidade));
                    request.getSession().setAttribute("alunos", alunosCurso(inscricoes));
                    request.getSession().setAttribute("internet", internetConnetion.haveInternet());
                    request.getSession().setAttribute("semestres", semestres);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou a lista de boletins para alunos do curso : "));
                    response.sendRedirect("avl-newsletters");
                }
                ;
                break;

                case "emitir-boletin": {
                    int id = Integer.parseInt(request.getParameter("ai"));
                    int idAnoLectivo = Integer.parseInt(request.getParameter("idAnoLectivo"));
                    String semestre = request.getParameter("semestre");

                    Aluno aluno = ensinoCtrl.buscaAlunoId(id);
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    List<Notas> notas = ensinoCtrl.listaNotasAlunoSemestre(entidade, anoLectivo, semestre, aluno);

                    String al = "o aluno";

                    if (!aluno.getPessoa().getPessSexo().equals("Masculino")) {
                        al = "a aluna";
                    }

                    String msgErro = "Boletim de notas submetido com sucesso para " + al + " " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " para o ano " + anoLectivo.getAnolDescricao() + " no " + semestre + "";

                    String alerta = "bg-success";
                    if (!notas.isEmpty()) {
                        int i = 2;

                        String messageTabela = "<p>\n"
                                + " Olá " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + ", \n"
                                + " Abaixo segue o seu boletim de notas referente ao ano <strong>" + anoLectivo.getAnolDescricao() + " no " + semestre + "</strong>.  \n"
                                + "  \n"
                                + "</p>\n"
                                + "\n"
                                + "\n"
                                + "<table cellspacing=0 width= \"520px\" style =\"color:#666;font-size:13px;text-shadow: 1px 0px 0px #fff;background:#eaebec;margin:20px;border:#ccc 1px solid;\n"
                                + "-moz-border-radius:3px;\n"
                                + "	-webkit-border-radius:3px;\n"
                                + "	border-radius:3px;\n"
                                + "\n"
                                + "	-moz-box-shadow: 0 1px 2px #d1d1d1;\n"
                                + "	-webkit-box-shadow: 0 1px 2px #d1d1d1;\n"
                                + "	box-shadow: 0 1px 2px #d1d1d1;\"><!-- cellspacing=0 is important, must stay -->\n"
                                + "	<tr style=\"\n"
                                + "	padding-left:20px;\">\n"
                                + "	\n"
                                + "	<th style=\"padding:21px 25px 22px 25px;border-top:1px solid #fafafa;border-bottom:1px solid #e0e0e0;background: #ededed;background: -webkit-gradient(linear, left top, left bottom, from(#ededed), to(#ebebeb));background: -moz-linear-gradient(top,  #ededed,  #ebebeb);font-size:14px\">Disciplina</th>\n"
                                + "	\n"
                                + "	<th style=\"text-align: center;padding:21px 25px 22px 25px; border-top:1px solid #fafafa; border-bottom:1px solid #e0e0e0;background: #ededed; background: -webkit-gradient(linear, left top, left bottom, from(#ededed), to(#ebebeb));background: -moz-linear-gradient(top,  #ededed,  #ebebeb);font-size:14px\">Nota</th>\n"
                                + "	\n"
                                + "	\n"
                                + "	</tr>\n";

                        for (Notas n : notas) {

                            String cls = "";
                            String color = "33414e";

                            if (i % 2 == 0) {
                                cls = "class=even";
                            }

                            if (n.getNotaMedia() < 10) {
                                color = "E04B4A";

                            }
                            if (n.getNotaMedia() >= 10 && n.getNotaMedia() < 14) {

                                color = "33414e";
                            }

                            if (n.getNotaMedia() > 14) {

                                color = "95b75d";
                            }

                            messageTabela += "\n"
                                    + "	<tr " + cls + " style=\"padding-left:20px; \">\n"
                                    + "	<td style=\"padding:18px;border-top: 1px solid #ffffff;border-bottom:1px solid #e0e0e0;border-left: 1px solid #e0e0e0;	background: #f6f6f6;background: -webkit-gradient(linear, left top, left bottom, from(#f8f8f8), to(#f6f6f6));background: -moz-linear-gradient(top,  #f8f8f8,  #f6f6f6);\">" + n.getDisciplina().getDiscDescricao() + "</td>\n"
                                    + "<td style=\"text-align: center;padding:18px;border-top: 1px solid #ffffff;border-bottom:1px solid #e0e0e0;border-left: 1px solid #e0e0e0;background: #fafafa;background: -webkit-gradient(linear, left top, left bottom, from(#fbfbfb), to(#fafafa));background: -moz-linear-gradient(top,  #fbfbfb,  #fafafa);\"><span style=\"color:#fff;font-size: 13px;line-height: 14px;font-weight: 300;-moz-border-radius: 3px;-webkit-border-radius: 3px;border-radius: 3px;padding: 0px 8px;background-color: #" + color + ";\">" + n.getNotaMedia() + "</span></td>\n"
                                    + "</tr>";
                            i++;
                        }

                        messageTabela += "</table>\n"
                                + "\n"
                                + " \n"
                                + "<p>Obrigado !</p>\n"
                                + "<hr sytle=\"width:30%;\">\n"
                                + "<p style=\"color:#41628b\">\n"
                                + "<i>\n"
                                + entidade.getEntiNome() + " \n"
                                + entidade.getEntiContactos1() + " \n"
                                + entidade.getEntiEndereco() + "\n"
                                + "</i>\n"
                                + "</p>\n"
                                + "";

                        ms.sendMail(aluno.getPessoa().getPessEmail(), "[Boletim de notas]", messageTabela, "");
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Submeteu com sucesso o boletim de notas para " + al + " " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " para o ano " + anoLectivo.getAnolDescricao() + " no " + semestre + ""));

                    } else {

                        msgErro = "Boletim não submentido, " + al + " não contém notas nesse periodo";
                        alerta = "bg-danger";
                    }

                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("msgErro", msgErro);
                    response.sendRedirect("avl-newsletters");

                }
                ;
                break;

                case "observacoes": {

                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");

                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesCurso(entidade, curso);

                    List<String> semestres = new ArrayList();
                    for (int i = 1; i <= (curso.getCursDuracao() * 2); i++) {
                        semestres.add(i + "º Semestre");
                    }
                    request.getSession().setAttribute("avaliacoes", ensinoCtrl.listaAvaliacoes(entidade));
                    request.getSession().setAttribute("alunos", alunosCurso(inscricoes));
                    request.getSession().setAttribute("semestres", semestres);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de observações para alunos do curso : "));
                    response.sendRedirect("avl-comments");
                }
                ;
                break;

                case "adicionarComentario": {
                    int idAluno = Integer.parseInt(request.getParameter("idAluno"));
                    String semestre = request.getParameter("semestre");
                    String observacoes = request.getParameter("observacoes");
                    String comportamento = request.getParameter("comportamento");

                    Aluno aluno = ensinoCtrl.buscaAlunoId(idAluno);
                    AnoLectivo anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entidade);

                    Avaliacao avaliacao = new Avaliacao();
                    avaliacao.setAluno(aluno);
                    avaliacao.setAvalAnoLectivo(Integer.parseInt(anoLectivo.getAnolDescricao()));
                    avaliacao.setAvalComportamento(comportamento);
                    avaliacao.setAvalObservacoes(observacoes);
                    avaliacao.setAvalSemestre(semestre);
                    avaliacao.setEntidade(entidade);

                    ensinoCtrl.persistirAvaliacao(avaliacao);

                    String lg = "Adicionou uma avaliação de " + comportamento + " para o aluno " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " no " + semestre + " de " + anoLectivo.getAnolDescricao() + "";
                    if (!aluno.getPessoa().getPessSexo().equals("Masculino")) {
                        lg = "Adicionou uma avaliação de " + comportamento + " para a aluna " + encryptUtils.decodeString(aluno.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(aluno.getPessoa().getPessApelido()) + " no " + semestre + " de " + anoLectivo.getAnolDescricao() + "";
                    }

                    String msgErro = lg;

                    String alerta = "bg-success";

                    controleAcessoCtrl.persistirLog(addLog(usuario, lg));

                    request.getSession().setAttribute("avaliacoes", ensinoCtrl.listaAvaliacoes(entidade));
                    request.getSession().setAttribute("semestres", (List<String>) request.getSession().getAttribute("semestres"));
                    request.getSession().setAttribute("alunos", (List<Aluno>) request.getSession().getAttribute("alunos"));
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("msgErro", msgErro);
                    response.sendRedirect("avl-comments");

                }
                ;
                break;

                case "notas": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    Calendario calendario = (Calendario) request.getSession().getAttribute("calendario");
                    List<Calendario> calendarios = (List<Calendario>) request.getSession().getAttribute("calendarios");

                    @SuppressWarnings("UnusedAssignment")
                    List<Notas> notas = null;

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    List<Inscricao> inscricoes = null;

                    Disciplina disciplina = null;

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                        calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString(semestre), turma);

                    }

                    if (request.getParameter("idCalendario") == null) {

                        if (!calendarios.isEmpty()) {
                            calendario = calendarios.get(0);
                        }

                    } else {
                        int idCalendario = Integer.parseInt(request.getParameter("idCalendario"));

                        calendario = ensinoCtrl.buscaCalendarioId(idCalendario);
                    }

                    List<Aluno> alunos = alunosCurso(inscricoes);

                    if (calendario != null) {
                        disciplina = calendario.getDisciplina();

                        notas = ensinoCtrl.listaNotasDisciplinaSemestre(entidade, turma, disciplina, anoLectivo, encryptUtils.encodeString(semestre));

                        if (notas == null) {
                            notas = new ArrayList();
                        }

                        if (inscricoes != null) {
                            for (Inscricao i : inscricoes) {
                                Aluno a = i.getAluno();
                                boolean have = checkStudent(notas, i);
                                if (!have) {
                                    Notas n = new Notas();

                                    n.setAluno(a);
                                    n.setAnoLectivo(anoLectivo);
                                    n.setDisciplina(disciplina);
                                    n.setEncrypted(have);
                                    n.setEntidade(entidade);
                                    n.setTurma(turma);
                                    n.setInscricao(i);

                                    notas.add(n);
                                }
                            }
                        }

                    }

                    request.getSession().setAttribute("calendarios", calendarios);
                    request.getSession().setAttribute("disciplina", disciplina);
                    request.getSession().setAttribute("alunos", alunos);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("notas", notas);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("calendario", calendario);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário lançamento de notas para alunos do curso : "));
                    response.sendRedirect("avl-notes");
                }
                ;
                break;

                case "pautas": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    List<Inscricao> inscricoes = null;

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    }

                    Disciplina disciplina = null;

                    List<Calendario> calendarios = null;

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                        calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString("1º TRIMESTRE"), turma);

                    }

                    Calendario calendario = null;
                    if (calendarios != null) {
                        if (!calendarios.isEmpty()) {
                            calendario = calendarios.get(0);
                        }
                    }

                    List<Aluno> alunos = alunosCurso(inscricoes);

                    List<Pauta> pautas = new ArrayList();

                    if (calendario != null) {
                        disciplina = calendario.getDisciplina();

                        List<Notas> notas = ensinoCtrl.listaNotasDisciplinaTurma(entidade, turma, disciplina, anoLectivo);

                        if (inscricoes != null) {
                            for (Inscricao i : inscricoes) {

                                Notas notas1 = getNotas(notas, i, encryptUtils.encodeString("1º TRIMESTRE"));
                                Notas notas2 = getNotas(notas, i, encryptUtils.encodeString("2º TRIMESTRE"));
                                Notas notas3 = getNotas(notas, i, encryptUtils.encodeString("3º TRIMESTRE"));

                                List<Notas> notasPauta = new ArrayList();
                                notasPauta.add(notas1);
                                notasPauta.add(notas2);
                                notasPauta.add(notas3);

                                Pauta pauta = new Pauta();
                                pauta.setInscricao(i);
                                pauta.setNotas(notasPauta);

                                pautas.add(pauta);
                            }
                        }

                    }

                    request.getSession().setAttribute("calendarios", calendarios);
                    request.getSession().setAttribute("disciplina", disciplina);
                    request.getSession().setAttribute("alunos", alunos);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("pautas", pautas);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("calendario", calendario);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário lançamento de notas para alunos do curso : "));
                    response.sendRedirect("avl-guidelines");
                }
                ;
                break;

                case "imprimir-pauta": {

                    request.getSession().setAttribute("calendarios", (List<Calendario>) request.getSession().getAttribute("calendarios"));
                    request.getSession().setAttribute("disciplina", (Disciplina) request.getSession().getAttribute("disciplina"));
                    request.getSession().setAttribute("alunos", (List<Aluno>) request.getSession().getAttribute("alunos"));
                    request.getSession().setAttribute("semestre", request.getSession().getAttribute("semestre").toString());
                    request.getSession().setAttribute("notas", (List<Notas>) request.getSession().getAttribute("notas"));
                    request.getSession().setAttribute("anoLectivo", (AnoLectivo) request.getSession().getAttribute("anoLectivo"));
                    request.getSession().setAttribute("turma", (Turma) request.getSession().getAttribute("turma"));
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                    request.getSession().setAttribute("cursoSelecionado", (Curso) request.getSession().getAttribute("cursoSelecionado"));
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                    request.getSession().setAttribute("calendario", (Calendario) request.getSession().getAttribute("calendario"));

                    response.sendRedirect("print-avl-guidelines");

                }
                ;
                break;

                case "comportamento": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    List<Inscricao> inscricoes = null;

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    }

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de actualização de comportamento"));
                    response.sendRedirect("avl-behavior");
                }
                ;
                break;

                case "actualizar-comportamento": {
                    Turma turma = (Turma) request.getSession().getAttribute("turma");
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    String comp1 = request.getParameter("comp1");
                    String comp2 = request.getParameter("comp2");
                    String comp3 = request.getParameter("comp3");
                    String comp4 = "";

                    Inscricao inscricao = getInscricao(inscricoes, id);
                    inscricao.setInscComp1(encryptUtils.encodeString(comp1));
                    inscricao.setInscComp2(encryptUtils.encodeString(comp2));
                    inscricao.setInscComp3(encryptUtils.encodeString(comp3));
                    inscricao.setInscComp4(encryptUtils.encodeString(comp4));
                    ensinoCtrl.persistirInscricao(inscricao);

                    String ref = encryptUtils.decodeString(inscricao.getInscReferencia());

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    }

                    request.getSession().setAttribute("inscricoes", inscricoes);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Actualizou o comportamento para a inscrição com a ref: " + ref));
                    response.sendRedirect("avl-behavior");
                }
                ;
                break;

                case "folhas": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (anoLectivo == null) {
                        anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entidade);
                    }

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

                    List<Resposta> respostas = null;

                    if (curso != null && anoLectivo != null && disciplina != null) {
                        respostas = ensinoCtrl.listaRespostaDisciplina(entidade, curso, anoLectivo, disciplina);
                    }

                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("disciplinaSelecionada", disciplina);
                    request.getSession().setAttribute("respostas", respostas);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de actualização das folhas de respostas"));
                    response.sendRedirect("avl-answers");
                }
                ;
                break;

                case "registar-respostas": {
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    String msgErro = "Questão adicionada com sucesso a folha de resposta";
                    String alerta = "bg-success";

                    if (curso == null) {
                        msgErro = "Folha de resposta não pode ser definida porque nenhuma classe foi selecionada";
                        alerta = "bg-warning";

                    } else {
                        if (disciplina == null) {
                            msgErro = "Folha de resposta não pode ser definida porque nenhuma disciplina foi selecionada";
                            alerta = "bg-warning";

                        } else {

                            String pergunta = request.getParameter("pergunta");
                            String opcao1 = request.getParameter("opcao1");
                            String opcao2 = request.getParameter("opcao2");
                            String opcao3 = request.getParameter("opcao3");
                            String opcao4 = request.getParameter("opcao4");
                            String categoria = request.getParameter("categoria");
                            String op = request.getParameter("op");

                            String answer = "";

                            switch (op) {
                                case "1":
                                    answer = opcao1;
                                    break;
                                case "2":
                                    answer = opcao2;
                                    break;
                                case "3":
                                    answer = opcao3;
                                    break;
                                case "4":
                                    answer = opcao4;
                                    break;
                            }

                            Resposta resposta = ensinoCtrl.buscaRespostaTodosCriterios(entidade, curso, anoLectivo, disciplina, encryptUtils.encodeString(categoria), encryptUtils.encodeString(pergunta));

                            if (resposta == null) {
                                resposta = new Resposta();
                                resposta.setAnoLectivo(anoLectivo);
                                resposta.setCurso(curso);
                                resposta.setDisciplina(disciplina);
                                resposta.setEncrypted(true);
                                resposta.setEntidade(entidade);
                                resposta.setRespCategoria(encryptUtils.encodeString(categoria));
                                resposta.setRespOpcao1(encryptUtils.encodeString(opcao1));
                                resposta.setRespOpcao2(encryptUtils.encodeString(opcao2));
                                resposta.setRespOpcao3(encryptUtils.encodeString(opcao3));
                                resposta.setRespOpcao4(encryptUtils.encodeString(opcao4));
                                resposta.setRespPergunta(encryptUtils.encodeString(pergunta));
                                resposta.setRespResposta(encryptUtils.encodeString(answer));

                                ensinoCtrl.persistirResposta(resposta);

                                String dis = encryptUtils.decodeString(disciplina.getDiscDescricao());
                                String an = encryptUtils.decodeString(anoLectivo.getAnolDescricao());
                                String cur = encryptUtils.decodeString(curso.getCursDescricao());

                                controleAcessoCtrl.persistirLog(addLog(usuario, "Registou a folha de resposta para a disciplina: " + dis
                                        + ", curso: " + cur + ", ano lectivo: " + an));

                                List<Resposta> respostas = ensinoCtrl.listaRespostaDisciplina(entidade, curso, anoLectivo, disciplina);
                                request.getSession().setAttribute("respostas", respostas);
                            } else {

                                msgErro = "Folha de resposta não inserida, a pergunta já existe registada. Clique em actualizar";
                                alerta = "bg-warning";
                            }
                        }
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("avl-answers");
                }
                ;
                break;

                case "remover-resposta": {

                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Resposta resposta = ensinoCtrl.buscaRespostaId(id);
                    ensinoCtrl.removerResposta(resposta);

                    String msgErro = "Questão removida com sucesso";
                    String alerta = "bg-success";

                    List<Resposta> respostas = ensinoCtrl.listaRespostaDisciplina(entidade, curso, anoLectivo, disciplina);
                    request.getSession().setAttribute("respostas", respostas);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("avl-answers");
                }
                ;
                break;

                case "distribuicao-exame": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    Disciplina disciplina = null;

                    List<SalaExame> salasExame = null;
                    List<Calendario> calendarios = null;

                    if (turma != null) {

                        calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString("1º TRIMESTRE"), turma);

                    }

                    Calendario calendario = null;
                    if (calendarios != null) {
                        if (!calendarios.isEmpty()) {
                            calendario = calendarios.get(0);
                        }
                    }

                    List<Media> medias = null;

                    if (calendario != null) {
                        disciplina = calendario.getDisciplina();

                        medias = ensinoCtrl.listaMediasTurmaDisciplinaApurados(entidade, turma, disciplina);
                        salasExame = ensinoCtrl.listaSalaExameDisciplina(entidade, curso, anoLectivo, disciplina);

                    }

                    request.getSession().setAttribute("calendarios", calendarios);
                    request.getSession().setAttribute("disciplina", disciplina);
                    request.getSession().setAttribute("medias", medias);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("salasExame", salasExame);
                    request.getSession().setAttribute("calendario", calendario);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário lançamento de notas para alunos do curso : "));
                    response.sendRedirect("exam-distribution");
                }
                ;
                break;

                case "atribuir-sala": {

                    String noty_list[] = request.getParameterValues("noty_list");
                    int idSala = Integer.parseInt(request.getParameter("idSala"));

                    String msgErro = "Alunos atribuidos a sala com sucesso.";
                    String alerta = "bg-success";

                    List<Media> medias = (List<Media>) request.getSession().getAttribute("medias");
                    List<SalaExame> salasExame = (List<SalaExame>) request.getSession().getAttribute("salasExame");

                    SalaExame salaExame = getSalaExame(salasExame, idSala);

                    if (noty_list != null) {

                        int rest = salaExame.getSalaeMaxAlunos() - noty_list.length;

                      //  if (rest < 0) {
                            for (String n : noty_list) {

                                Media media = getMedia(medias, Integer.parseInt(n));

                                Exame exame = ensinoCtrl.buscaExame(entidade, media.getAnoLectivo(), "", media.getAluno(), media.getDisciplina());

                                if (exame == null) {
                                    exame = new Exame();
                                    exame.setAluno(media.getAluno());
                                    exame.setAnoLectivo(media.getAnoLectivo());
                                    exame.setDisciplina(media.getDisciplina());
                                    exame.setEncrypted(true);
                                    exame.setEntidade(entidade);
                                    exame.setExamMedia(Math.round((media.getMediMedia() + media.getMediMedia2() + media.getMediMedia3()) / 3));
                                    exame.setInscricao(media.getInscricao());
                                    exame.setExamSemestre("");

                                }

                                exame.setSalaExame(salaExame);

                                ensinoCtrl.persistirExame(exame);

                            }

                            salaExame.setSalaeOcupado(salaExame.getSalaeOcupado() + noty_list.length);
                            ensinoCtrl.persistirSalaExame(salaExame);

                            salasExame = ensinoCtrl.listaSalaExameDisciplina(entidade, salaExame.getCurso(), salaExame.getAnoLectivo(), salaExame.getDisciplina());
                            request.getSession().setAttribute("salasExame", salasExame);

                      /*  } else {

                            msgErro = "Sala em sem lugares disponíveis.";
                            alerta = "bg-warning";
                        }*/
                    } else {

                        msgErro = "Nenhum aluno foi selecionado da lista";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("exam-distribution");
                }
                ;
                break;

                case "lista-exames": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplinaSelecionada");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (anoLectivo == null) {
                        anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entidade);
                    }

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

                    List<Exame> exames = null;
                    List<SalaExame> salasExame = null;
                    SalaExame salaExame = null;

                    if (curso != null && anoLectivo != null && disciplina != null) {
                        salasExame = ensinoCtrl.listaSalaExameDisciplina(entidade, curso, anoLectivo, disciplina);

                    }

                    if (salasExame != null) {
                        if (!salasExame.isEmpty()) {
                            salaExame = salasExame.get(0);
                        }
                    }

                    if (salaExame != null) {
                        exames = ensinoCtrl.listaExamesSala(entidade, salaExame);
                    }

                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("disciplinaSelecionada", disciplina);
                    request.getSession().setAttribute("exames", exames);
                    request.getSession().setAttribute("salasExame", salasExame);
                    request.getSession().setAttribute("salaExame", salaExame);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou a lista de apurados ao exame"));

                    response.sendRedirect("exam-list");
                }
                ;
                break;

                case "actualizar-presencas": {

                    String noty_list[] = request.getParameterValues("noty_list");

                    String msgErro = "Presenças actualizadas com sucesso.";
                    String alerta = "bg-success";

                    List<Exame> exames = (List<Exame>) request.getSession().getAttribute("exames");

                    if (noty_list != null) {

                        for (String n : noty_list) {

                            Exame exame = getExame(exames, Integer.parseInt(n));

                            ensinoCtrl.persistirExame(exame);

                        }

                    } else {

                        msgErro = "Nenhum aluno foi selecionado da lista";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("exam-attendance");
                }
                ;
                break;

                case "importar-notas": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    Calendario calendario = (Calendario) request.getSession().getAttribute("calendario");
                    List<Calendario> calendarios = (List<Calendario>) request.getSession().getAttribute("calendarios");

                    @SuppressWarnings("UnusedAssignment")
                    List<Notas> notas = null;

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    Disciplina disciplina = null;

                    if (turma != null) {
                        calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString(semestre), turma);

                    }

                    if (request.getParameter("idCalendario") == null) {

                        if (!calendarios.isEmpty()) {
                            calendario = calendarios.get(0);
                        }

                    } else {
                        int idCalendario = Integer.parseInt(request.getParameter("idCalendario"));

                        calendario = ensinoCtrl.buscaCalendarioId(idCalendario);
                    }

                    if (calendario != null) {
                        disciplina = calendario.getDisciplina();

                    }

                    request.getSession().setAttribute("calendarios", calendarios);
                    request.getSession().setAttribute("disciplina", disciplina);
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("notas", notas);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("calendario", calendario);

                    response.sendRedirect("avl-notes-import");
                }
                ;
                break;

                case "carregar-ficheiro": {

                    Upload upload = gestaoCtrl.buscaUpload(entidade);

                    String nomeFich = "N/D";

                    if (upload != null) {
                        nomeFich = encryptUtils.decodeString(upload.getUplFile());
                    }

                    System.out.println("NOME FICH:" + nomeFich);

                    String ip = getUrlServer();

                    //COPIA O FICHEIRO PARA A PASTA LOCAL DO SERVIDOR
                    try (BufferedInputStream inputStream = new BufferedInputStream(new URL(ip + "/suc/excel/" + nomeFich).openStream());
                            FileOutputStream fileOS = new FileOutputStream("C:\\import\\segia\\" + nomeFich)) {
                        byte dataLoad[] = new byte[1024];
                        int byteContent;
                        while ((byteContent = inputStream.read(dataLoad, 0, 1024)) != -1) {
                            fileOS.write(dataLoad, 0, byteContent);
                        }
                    } catch (IOException e) {
                        // handles IO exceptions
                    }

                    List<String> lines = excelCtrl.readExel(nomeFich);

                    String msgErro = "";
                    String alerta = "";

                    List<ImpNota> importacoes = null;

                    int i = 0;
                    if (lines != null) {
                        if (lines.isEmpty()) {
                            msgErro = "Não foram encontrados registos no ficheiro selecionado";
                            alerta = "bg-warning";
                        } else {

                            importacoes = new ArrayList();
                            StringTokenizer tok;

                            for (String s : lines) {

                                tok = new StringTokenizer(s, ";");

                                if (tok.hasMoreElements()) {

                                    i++;

                                    if (i > 1) {
                                        String id = tok.nextToken().replace(".0", "");
                                        String codInscricao = tok.nextToken();
                                        String aluno = tok.nextToken();
                                        String teste1 = tok.nextToken();
                                        String teste2 = tok.nextToken();
                                        String teste3 = tok.nextToken();
                                        String teste4 = tok.nextToken();
                                        String teste5 = tok.nextToken();
                                        String teste6 = tok.nextToken();

                                        ImpNota in = new ImpNota();
                                        in.setNomeAluno(aluno);
                                        in.setCodInscricao(codInscricao);
                                        in.setId(id);
                                        in.setTeste1(teste1);
                                        in.setTeste2(teste2);
                                        in.setTeste3(teste3);
                                        in.setTeste4(teste4);
                                        in.setTeste5(teste5);
                                        in.setTeste6(teste6);

                                        importacoes.add(in);
                                    }
                                }
                            }
                        }
                    } else {

                        msgErro = "Não foram encontrados registos no ficheiro selecionado";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("importacoesNotas", importacoes);
                    request.getSession().setAttribute("nomeFich", nomeFich);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("avl-notes-import");
                }
                ;
                break;

                case "confirmar-upload": {

                    List<ImpNota> importacoes = (List<ImpNota>) request.getSession().getAttribute("importacoesNotas");

                    String nomeFich = request.getSession().getAttribute("nomeFich").toString();

                    String msgErro = "Nenhuna nota importada, a lista encontra-se vazia.";
                    String alerta = "bg-warning";

                    List<Notas> notas = new ArrayList();

                    int n = 0;
                    int r = 0;

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    Calendario calendario = (Calendario) request.getSession().getAttribute("calendario");

                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    String semestre = "1º TRIMESTRE";

                    if (request.getSession().getAttribute("semestre") != null) {
                        semestre = request.getSession().getAttribute("semestre").toString();
                    }

                    Disciplina disciplina = null;

                    if (calendario != null) {
                        disciplina = calendario.getDisciplina();
                    }

                    if (importacoes != null) {

                        for (ImpNota imp : importacoes) {

                            String id = imp.getId();
                            String aluno = imp.getNomeAluno();
                            String codInscricao = imp.getCodInscricao();
                            String teste1 = imp.getTeste1();
                            String teste2 = imp.getTeste2();
                            String teste3 = imp.getTeste3();
                            String teste4 = imp.getTeste4();
                            String teste5 = imp.getTeste5();
                            String teste6 = imp.getTeste6();

                            @SuppressWarnings("UnusedAssignment")
                            Notas nota = null;

                            int nACS = 2;
                            int nACP = 1;

                            if (!teste3.equals("-1")) {
                                nACS++;
                                teste3 = "0";
                            }

                            if (!teste4.equals("-1")) {
                                nACS++;
                                teste4 = "0";
                            }

                            if (!teste6.equals("-1")) {
                                nACP++;
                                teste6 = "0";
                            }

                            if (id.equals("0")) {

                                Inscricao inscricao = ensinoCtrl.buscaInscricaoReferencia(entidade, encryptUtils.encodeString(codInscricao));

                                nota = new Notas();
                                nota.setAluno(inscricao.getAluno());
                                nota.setAnoLectivo(anoLectivo);
                                nota.setDisciplina(disciplina);
                                nota.setEncrypted(true);
                                nota.setEntidade(entidade);
                                nota.setTurma(turma);
                                nota.setNotaSemestre(encryptUtils.encodeString(semestre));
                                nota.setInscricao(inscricao);

                            } else {
                                nota = ensinoCtrl.buscaNotasId(Integer.parseInt(id));
                            }

                            if (nota != null) {

                                float mACS = Math.round((Float.parseFloat(teste1) + Float.parseFloat(teste2) + Float.parseFloat(teste3) + Float.parseFloat(teste4)) / nACS);
                                float mACP = Math.round((Float.parseFloat(teste5) + Float.parseFloat(teste6)) / nACP);

                                nota.setNotaTeste1(Float.parseFloat(teste1));
                                nota.setNotaTeste2(Float.parseFloat(teste2));
                                nota.setNotaTeste3(Float.parseFloat(teste3));
                                nota.setNotaTeste4(Float.parseFloat(teste4));
                                nota.setNotaAcp(Float.parseFloat(teste5));
                                nota.setNotaAcp2(Float.parseFloat(teste6));
                                nota.setNotaMedia(Math.round((mACS + mACP) / 2));

                                ensinoCtrl.persistirNotas(nota);

                                float mx = nota.getNotaMedia();
                                Media media = ensinoCtrl.buscaMedia(entidade, anoLectivo, nota.getAluno(), disciplina);

                                if (media == null) {
                                    media = new Media();
                                    media.setAluno(nota.getAluno());
                                    media.setAnoLectivo(anoLectivo);
                                    media.setDisciplina(disciplina);
                                    media.setMedSemestre(encryptUtils.encodeString(semestre));
                                    media.setTurma(turma);
                                    media.setInscricao(nota.getInscricao());
                                    media.setEntidade(entidade);
                                    media.setEncrypted(true);
                                }

                                switch (semestre) {
                                    case "1º TRIMESTRE":
                                        media.setMediMedia(mx);
                                        break;
                                    case "2º TRIMESTRE":
                                        media.setMediMedia2(mx);
                                        break;
                                    case "3º TRIMESTRE":
                                        media.setMediMedia3(mx);
                                        break;
                                }

                                ensinoCtrl.persistirMedia(media);

                                notas.add(nota);
                                n++;
                            }
                        }

                        msgErro = "Carregada(s) com sucesso " + importacoes.size() + " notas. Confirmado(s): " + n;
                        alerta = "bg-success";

                        if (n != 0) {
                            addLog(usuario, "Importou com sucesso " + n + " nota(s) do ficheiro com o nome: " + nomeFich);
                        }

                    }

                    request.getSession().setAttribute("importacoesNotas", null);
                    request.getSession().setAttribute("notasReg", notas);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("avl-notes-import");
                }
                ;
                break;

                case "pautas-anual": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    List<DisciplinaCurso> disciplinasCurso = null;

                    List<PM> pms = new ArrayList();
                    if (curso != null) {
                        turmas = ensinoCtrl.listaTurmasCurso(entidade, curso);

                        disciplinasCurso = ensinoCtrl.listaDisciplinasCursosCurso(entidade, curso);

                        if (!turmas.isEmpty()) {
                            turma = turmas.get(0);
                        }
                    }

                    List<Inscricao> inscricoes = null;

                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    }

                    if (inscricoes != null) {

                        for (Inscricao inscricao : inscricoes) {
                            float medF = 0;
                            String comp = "";
                            List<DN> dns = new ArrayList();

                            PM pm = new PM();
                            pm.setInscricao(inscricao);

                            int i = 0;
                            if (disciplinasCurso != null) {
                                for (DisciplinaCurso dc : disciplinasCurso) {
                                    Media media = ensinoCtrl.buscaMedia(entidade, anoLectivo, inscricao.getAluno(), dc.getDisciplina());
                                    float med = 0;

                                    if (media != null) {
                                        med = (media.getMediMedia() + media.getMediMedia2() + media.getMediMedia3()) / 3;
                                    }

                                    DN dn = new DN();
                                    dn.setDisciplina(dc.getDisciplina());
                                    dn.setMed(med);

                                    dns.add(dn);

                                    medF += med;
                                    i++;
                                }
                            }

                            if (i != 0) {
                                medF = medF / i;
                            }

                            pm.setComportamentoFinal(comp);
                            pm.setDns(dns);
                            pm.setInscricao(inscricao);
                            pm.setMediaFinal(medF);

                            pms.add(pm);

                        }

                    }
                    request.getSession().setAttribute("pms", pms);
                    request.getSession().setAttribute("disciplinasCurso", disciplinasCurso);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou a pauta final de frequência"));
                    response.sendRedirect("avl-guidelines-freq");
                }
                ;
                break;

                case "notas-exame": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    Curso curso = (Curso) request.getSession().getAttribute("cursoSelecionado");
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);

                        request.getSession().setAttribute("cursos", cursos);
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

                    Disciplina disciplina = null;

                    List<SalaExame> salasExame = null;
                    List<Calendario> calendarios = null;

                    if (turma != null) {

                        calendarios = ensinoCtrl.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, encryptUtils.encodeString("1º TRIMESTRE"), turma);

                    }

                    Calendario calendario = null;
                    if (calendarios != null) {
                        if (!calendarios.isEmpty()) {
                            calendario = calendarios.get(0);
                        }
                    }

                    if (calendario != null) {
                        disciplina = calendario.getDisciplina();
                        salasExame = ensinoCtrl.listaSalaExameDisciplina(entidade, curso, anoLectivo, disciplina);

                    }

                    request.getSession().setAttribute("calendarios", calendarios);
                    request.getSession().setAttribute("disciplina", disciplina);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("salasExame", salasExame);
                    request.getSession().setAttribute("calendario", calendario);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou de carregamento de respostas de exam"));
                    response.sendRedirect("exam-notes");
                }
                ;
                break;

                case "carregar-ficheiro-res": {

                    Upload upload = gestaoCtrl.buscaUpload(entidade);

                    String nomeFich = "N/D";

                    if (upload != null) {
                        nomeFich = encryptUtils.decodeString(upload.getUplFile());
                    }

                    System.out.println("NOME FICH:" + nomeFich);

                    String ip = getUrlServer();

                    //COPIA O FICHEIRO PARA A PASTA LOCAL DO SERVIDOR
                    try (BufferedInputStream inputStream = new BufferedInputStream(new URL(ip + "/suc/excel/" + nomeFich).openStream());
                            FileOutputStream fileOS = new FileOutputStream("C:\\import\\segia\\" + nomeFich)) {
                        byte dataLoad[] = new byte[1024];
                        int byteContent;
                        while ((byteContent = inputStream.read(dataLoad, 0, 1024)) != -1) {
                            fileOS.write(dataLoad, 0, byteContent);
                        }
                    } catch (IOException e) {
                        // handles IO exceptions
                    }

                    List<String> lines = excelCtrl.readExel(nomeFich);

                    String msgErro = "";
                    String alerta = "";

                    List<ImpRes> importacoes = null;

                    int i = 0;
                    if (lines != null) {
                        if (lines.isEmpty()) {
                            msgErro = "Não foram encontrados registos no ficheiro selecionado";
                            alerta = "bg-warning";
                        } else {

                            importacoes = new ArrayList();
                            StringTokenizer tok;

                            for (String s : lines) {

                                tok = new StringTokenizer(s, ";");

                                if (tok.hasMoreElements()) {

                                    i++;

                                    if (i > 1) {
                                        String cod = tok.nextToken();
                                        String dis = tok.nextToken().replace(".0", "");

                                        List<String> respostas = new ArrayList();

                                        while (tok.hasMoreElements()) {
                                            respostas.add(tok.nextToken());
                                        }

                                        ImpRes ir = new ImpRes();
                                        ir.setCod(cod);
                                        ir.setDis(dis);
                                        ir.setRespostas(respostas);

                                        importacoes.add(ir);
                                    }
                                }
                            }
                        }
                    } else {

                        msgErro = "Não foram encontrados registos no ficheiro selecionado";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("importacoesRespostas", importacoes);
                    request.getSession().setAttribute("nomeFich", nomeFich);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("exam-notes");
                }
                ;
                break;
            }
        } catch (Exception exception) {

            Data d = new Data();
            d.le_hora();

            ExceptionWriter ew = new ExceptionWriter();

            String datetime = d.getAno() + "_" + d.getMesString() + "_" + d.getDia() + "_" + d.getHora() + d.getMinuto() + d.getSegundo();
            String msg = "Ocorreu um excepção do tipo: " + ew.getStackTrace(exception);
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

    public Notas procuraNotaAlunoSemestre(List<Notas> notasDisciplina, Aluno aluno, String semestre) {
        Notas notas = null;

        for (Notas n : notasDisciplina) {

            System.out.println("ID DO ALUNO NA NOTA : " + n.getAluno().getAlunId());
            if (n.getAluno().getAlunId() == aluno.getAlunId() && n.getNotaSemestre().equals(semestre)) {
                notas = n;
            }
        }
        return notas;
    }

    public List<Notas> actualizaListaNotas(List<Notas> notasTurma, Notas notas) {

        List<Notas> nts = new ArrayList();
        for (Notas n : notasTurma) {

            if (n.getInscricao() != null && notas.getInscricao() != null) {
                if (n.getInscricao().getInscId() != notas.getInscricao().getInscId()) {
                    nts.add(n);
                } else {
                    nts.add(notas);
                }
            }
        }

        return nts;
    }

    public List<Aluno> alunosCurso(List<Inscricao> inscricoes) {
        List<Aluno> alunos = new ArrayList();

        if (inscricoes != null) {
            inscricoes.stream().forEach((i) -> {

                if (!procuraAluno(alunos, i.getAluno())) {
                    alunos.add(i.getAluno());
                }
            });
        }

        return alunos;
    }

    public boolean procuraAluno(List<Aluno> alunos, Aluno aluno) {
        return alunos.stream().anyMatch((a) -> (a.getAlunBadgnumber().equals(aluno.getAlunBadgnumber())));
    }

    public List<Disciplina> disciplinasCurso(List<DisciplinaCurso> disciplinasCurso) {
        List<Disciplina> disciplinas = new ArrayList();

        disciplinasCurso.stream().forEach((dc) -> {
            disciplinas.add(dc.getDisciplina());
        });

        return disciplinas;
    }

    public boolean checkStudent(List<Notas> notas, Inscricao inscricao) {
        boolean check = false;

        for (Notas n : notas) {
            if (n.getInscricao() != null) {
                if (n.getInscricao().getInscId() == inscricao.getInscId()) {
                    check = true;
                }
            }
        }

        return check;
    }

    private Inscricao getInscricao(List<Inscricao> inscricoes, int id) {
        Inscricao inscricao = null;

        if (inscricoes != null) {
            for (Inscricao i : inscricoes) {
                if (i.getInscId() == id) {
                    inscricao = i;
                }
            }
        }

        return inscricao;
    }

    private Notas getNotas(List<Notas> notas, Inscricao inscricao, String trimestre) {
        Notas value = null;

        if (notas != null) {
            for (Notas n : notas) {
                if (n.getInscricao().getInscId() == inscricao.getInscId() && n.getNotaSemestre().equals(trimestre)) {
                    value = n;
                }
            }
        }
        return value;
    }

    private Media getMedia(List<Media> medias, int id) {
        Media media = null;

        if (medias != null) {
            for (Media m : medias) {
                if (m.getMediId() == id) {
                    media = m;
                }
            }
        }

        return media;
    }

    private SalaExame getSalaExame(List<SalaExame> salasExame, int id) {
        SalaExame salaExame = null;

        if (salasExame != null) {
            for (SalaExame s : salasExame) {
                if (s.getSalaeId() == id) {
                    salaExame = s;
                }
            }
        }

        return salaExame;
    }

    private Exame getExame(List<Exame> exames, int id) {
        Exame exame = null;

        if (exames != null) {
            for (Exame e : exames) {
                if (e.getExamId() == id) {
                    exame = e;
                }
            }
        }

        return exame;
    }

    private void updatePresences(List<Exame> exames) {

        if (exames != null) {
            for (Exame e : exames) {

            }
        }
    }

    private String getUrlServer() {
        String urlServer = "localhost";
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\SETTINGS\\ip-upload.txt"))) {
                urlServer = br.readLine();
            }
        } catch (IOException exception) {

        }

        return urlServer;
    }

    private List<String> readFile(String txt) {

        List<String> linhas = new ArrayList();

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(txt))) {
                String linha = br.readLine();

                while (linha != null) {

                    linhas.add(linha);
                    linha = br.readLine();
                }
            }
        } catch (IOException exception) {

        }

        return linhas;
    }
}
