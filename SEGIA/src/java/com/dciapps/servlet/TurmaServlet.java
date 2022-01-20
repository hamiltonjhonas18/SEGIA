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

import com.dciapps.local.RTurmas;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Horario;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Matricula;
import com.dciapps.webclient.Pagamento;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Referencia;
import com.dciapps.webclient.Sala;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ContabilidadeCtrl;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.dciapps.webclientcontroler.IbanCtrl;
import com.dciapps.webclientcontroler.UtilitariosCtrl;
import com.dciapps.webclientcontroler.VendasCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
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
@WebServlet(name = "VHVybWFTZXJ2bGV0I0RDSQ==", urlPatterns = {"/VHVybWFTZXJ2bGV0I0RDSQ=="})
public class TurmaServlet extends HttpServlet {

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
    ContabilidadeCtrl contabilidadeCtrl = new ContabilidadeCtrl();
    UtilitariosCtrl utilitariosCtrl = new UtilitariosCtrl();
    VendasCtrl vendasCtrl = new VendasCtrl();
    IbanCtrl ibanCtrl = new IbanCtrl();

    Sender sender = new Sender();

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

            entidade = (Entidade) request.getSession().getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) request.getSession().getAttribute("entidade");
            }

            if (request.getSession().getAttribute("codEscola") != null) {
                codEscola = encryptUtils.encodeString(request.getSession().getAttribute("codEscola").toString());
            }
            switch (accao) {

                case "turmas": {

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    Escola escola = ensinoCtrl.buscaEscola(codEscola);

                    if (escola == null) {
                        System.out.println("ESCOLA É NULLA");
                    }

                    if (anoLectivo == null) {
                        System.out.println("ANO LECTIVO É NULLO");
                    }

                    List<Curso> cursos = ensinoCtrl.listaCursos(entidade);
                    List<Turma> turmas = ensinoCtrl.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoes(entidade);
                    List<Horario> horarios = gestaoCtrl.listaHorarios(entidade);
                    List<Sala> salas = ensinoCtrl.listaSalas(entidade);

                    List<RTurmas> rturmas = new ArrayList();

                    if (turmas != null) {
                        for (Turma t : turmas) {

                            String status = "Activa";

                            if (t.getTurmDataFim().toGregorianCalendar().getTime().before(new Date())) {
                                status = "Inactiva";
                            }
                            RTurmas rt = new RTurmas();
                            rt.setInscricoes(getNumInscricoes(inscricoes, t));
                            rt.setTurma(t);
                            rt.setStatus(status);

                            rturmas.add(rt);
                        }
                    }

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário  de turmas"));

                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("horarios", horarios);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("salas", salas);
                    request.getSession().setAttribute("rturmas", rturmas);
                    request.getSession().setAttribute("turma", null);
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("periodo", "");
                    request.getSession().setAttribute("curso", "");
                    request.getSession().setAttribute("horario", "");
                    request.getSession().setAttribute("turno", "");
                    request.getSession().setAttribute("min", 0);
                    request.getSession().setAttribute("max", 0);

                    response.sendRedirect("grades");
                }
                ;
                break;

                case "adicionar-turma": {

                    int idCurso = Integer.parseInt(request.getParameter("idCurso"));
                    int idHorario = Integer.parseInt(request.getParameter("idHorario"));
                    int idSala = Integer.parseInt(request.getParameter("idSala"));
                    int min = Integer.parseInt(request.getParameter("min"));
                    int max = Integer.parseInt(request.getParameter("max"));
                    String turno = request.getParameter("turno");
                    String periodo = request.getParameter("periodo");
                    String descricao = request.getParameter("descricao");

                    StringTokenizer tok = new StringTokenizer(periodo, " - ");
                    String d1 = tok.nextToken();
                    String d2 = tok.nextToken();

                    XMLGregorianCalendar calendar1 = getDate(d1);
                    XMLGregorianCalendar calendar2 = getDate(d2);

                    Curso curso = ensinoCtrl.buscaCursoId(idCurso);

                    Turma turma = ensinoCtrl.buscaTurmaDescricao(entidade, curso, descricao);

                    String msgErro = "Turma adicionada com sucesso";
                    String alerta = "bg-success";

                    String horarioT = "";
                    String cursoT = "";

                    if (turma != null) {
                        msgErro = "Turma já foi associada ao curso";
                        alerta = "bg-warning";
                    } else {

                        AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                        Escola escola = ensinoCtrl.buscaEscola(codEscola);

                        curso.setCursNumTurmas(curso.getCursNumTurmas() + 1);
                        ensinoCtrl.persistirCurso(curso);

                        cursoT = encryptUtils.decodeString(curso.getCursDescricao());

                        String cod = curso.getCursNumTurmas() + "";

                        if (curso.getCursNumTurmas() < 10) {
                            cod = "0" + curso.getCursNumTurmas();
                        }

                        data.le_hora();

                        String ref = encryptUtils.decodeString(curso.getCursCod()) + "-" + data.getAno() + "-" + cod;

                        Horario horario = gestaoCtrl.buscaHorarioId(idHorario);

                        if (!horario.isHoraUsado()) {
                            horario.setHoraUsado(true);

                            gestaoCtrl.persistirHorario(horario);
                        }

                        String descHorario = encryptUtils.decodeString(horario.getHoraInicio()) + " - " + encryptUtils.decodeString(horario.getHoraFim());

                        horarioT = descHorario;

                        Sala sala = ensinoCtrl.buscaSalaId(idSala);

                        turma = new Turma();
                        turma.setCurso(curso);
                        turma.setEncrypted(true);
                        turma.setEntidade(entidade);
                        turma.setTurmDataFim(calendar2);
                        turma.setTurmDataInicio(calendar1);
                        turma.setTurmDescricao(encryptUtils.encodeString(descricao));
                        turma.setTurmHorario(encryptUtils.encodeString(descHorario));
                        turma.setTurmMaxEstudantes(max);
                        turma.setTurmMinEstudantes(min);
                        turma.setTurmTurno(encryptUtils.encodeString(turno));
                        turma.setTurmReferencia(encryptUtils.encodeString(ref));
                        turma.setSala(sala);
                        turma.setEscola(escola);
                        turma.setAnoLectivo(anoLectivo);

                        ensinoCtrl.persistirTurma(turma);

                        Matricula matricula = ensinoCtrl.buscaMatriculaAno(codEscola, encryptUtils.encodeString(calendar1.getYear() + ""), turma.getCurso().getCursDescricao());

                        if (matricula == null) {
                            matricula = new Matricula();
                            matricula.setCodEscola(codEscola);
                            matricula.setMatrAno(encryptUtils.encodeString(data.getAno()));
                            matricula.setMatrClasse(turma.getCurso().getCursDescricao());
                        }

                        matricula.setMatrTurmas(matricula.getMatrTurmas() + 1);
                        ensinoCtrl.persistirMatricula(matricula);

                        List<Turma> turmas = ensinoCtrl.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
                        List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                        List<RTurmas> rturmas = new ArrayList();

                        if (turmas != null) {
                            for (Turma t : turmas) {

                                String status = "Activa";

                                if (t.getTurmDataFim().toGregorianCalendar().getTime().before(new Date())) {
                                    status = "Inactiva";
                                }
                                RTurmas rt = new RTurmas();
                                rt.setInscricoes(getNumInscricoes(inscricoes, t));
                                rt.setTurma(t);
                                rt.setStatus(status);

                                rturmas.add(rt);
                            }
                        }

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou a turma com a descrição: " + descricao));

                        request.getSession().setAttribute("rturmas", rturmas);
                        request.getSession().setAttribute("turmas", turmas);
                        request.getSession().setAttribute("inscricoes", inscricoes);

                        min = 0;
                        max = 0;
                        turno = "";
                        periodo = "";
                        descricao = "";
                    }

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Horario> horarios = (List<Horario>) request.getSession().getAttribute("horarios");

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("horarios", horarios);
                    request.getSession().setAttribute("descricao", descricao);
                    request.getSession().setAttribute("periodo", periodo);
                    request.getSession().setAttribute("curso", cursoT);
                    request.getSession().setAttribute("horario", horarioT);
                    request.getSession().setAttribute("turno", turno);
                    request.getSession().setAttribute("min", min);
                    request.getSession().setAttribute("max", max);

                    response.sendRedirect("grades");
                }
                ;
                break;
                case "remover-turma": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Turma turma = ensinoCtrl.buscaTurmaId(id);

                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);

                    String msgErro = "Turma não pode ser removido, elimine o registo associados a turma";
                    String alerta = "bg-warning";

                    if (inscricoes.isEmpty()) {
                        msgErro = "Turma removida com sucesso";
                        alerta = "bg-success";

                        AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                        Escola escola = ensinoCtrl.buscaEscola(codEscola);

                        ensinoCtrl.removerTurma(turma);

                        XMLGregorianCalendar calendar1 = turma.getTurmDataInicio();

                        Matricula matricula = ensinoCtrl.buscaMatriculaAno(codEscola, encryptUtils.encodeString(calendar1.getYear() + ""), turma.getCurso().getCursDescricao());

                        if (matricula != null) {
                            matricula.setMatrTurmas(matricula.getMatrTurmas() - 1);
                            ensinoCtrl.persistirMatricula(matricula);
                        }
                        String descricao = encryptUtils.decodeString(turma.getTurmDescricao());

                        List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                        List<Turma> turmas = ensinoCtrl.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
                        List<RTurmas> rturmas = new ArrayList();

                        if (turmas != null) {
                            for (Turma t : turmas) {

                                String status = "Activa";

                                if (t.getTurmDataFim().toGregorianCalendar().getTime().before(new Date())) {
                                    status = "Inactiva";
                                }
                                RTurmas rt = new RTurmas();
                                rt.setInscricoes(getNumInscricoes(inscricoes, t));
                                rt.setTurma(t);
                                rt.setStatus(status);

                                rturmas.add(rt);
                            }
                        }

                        request.getSession().setAttribute("cursos", cursos);
                        request.getSession().setAttribute("inscricoes", inscricoes);
                        request.getSession().setAttribute("rturmas", rturmas);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou a turma com a descrição: " + descricao));

                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    response.sendRedirect("grades");
                }
                ;
                break;

                case "editar-turma": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                    List<Horario> horarios = (List<Horario>) request.getSession().getAttribute("horarios");

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Turma turma = ensinoCtrl.buscaTurmaId(id);
                    request.getSession().setAttribute("turma", turma);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição a turma com o id: " + id));

                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("horarios", horarios);
                    request.getSession().setAttribute("turmas", turmas);

                    response.sendRedirect("grades");

                }
                ;
                break;

                case "confirmar-edicao-turma": {

                    int idCurso = Integer.parseInt(request.getParameter("idCurso"));
                    int idHorario = Integer.parseInt(request.getParameter("idHorario"));
                    int idSala = Integer.parseInt(request.getParameter("idSala"));
                    int min = Integer.parseInt(request.getParameter("min"));
                    int max = Integer.parseInt(request.getParameter("max"));
                    String turno = request.getParameter("turno");
                    String periodo = request.getParameter("periodo");
                    String descricao = request.getParameter("descricao");

                    StringTokenizer tok = new StringTokenizer(periodo, " - ");
                    String d1 = tok.nextToken();
                    String d2 = tok.nextToken();

                    XMLGregorianCalendar calendar1 = getDate(d1);
                    XMLGregorianCalendar calendar2 = getDate(d2);

                    Curso curso = ensinoCtrl.buscaCursoId(idCurso);

                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    String msgErro = "Turma actualizada com sucesso";
                    String alerta = "bg-success";

                    Turma turmaCheck = ensinoCtrl.buscaTurmaDescricao(entidade, curso, encryptUtils.encodeString(descricao));

                    if (turmaCheck != null || turma.getTurmDescricao().equals(encryptUtils.encodeString(descricao))) {
                        Horario horario = gestaoCtrl.buscaHorarioId(idHorario);

                        if (!horario.isHoraUsado()) {
                            horario.setHoraUsado(true);

                            gestaoCtrl.persistirHorario(horario);
                        }

                        String descHorario = encryptUtils.decodeString(horario.getHoraInicio()) + " - " + encryptUtils.decodeString(horario.getHoraFim());

                        Sala sala = ensinoCtrl.buscaSalaId(idSala);

                        turma.setCurso(curso);
                        turma.setEncrypted(true);
                        turma.setEntidade(entidade);
                        turma.setTurmDataFim(calendar2);
                        turma.setTurmDataInicio(calendar1);
                        turma.setTurmDescricao(encryptUtils.encodeString(descricao));
                        turma.setTurmHorario(encryptUtils.encodeString(descHorario));
                        turma.setTurmMaxEstudantes(max);
                        turma.setTurmMinEstudantes(min);
                        turma.setTurmTurno(encryptUtils.encodeString(turno));
                        turma.setSala(sala);

                        ensinoCtrl.persistirTurma(turma);

                        List<Turma> turmas = ensinoCtrl.listaTurmas(entidade);
                        List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                        List<RTurmas> rturmas = new ArrayList();

                        if (turmas != null) {
                            for (Turma t : turmas) {

                                String status = "Activa";

                                if (t.getTurmDataFim().toGregorianCalendar().getTime().before(new Date())) {
                                    status = "Inactiva";
                                }
                                RTurmas rt = new RTurmas();
                                rt.setInscricoes(getNumInscricoes(inscricoes, t));
                                rt.setTurma(t);
                                rt.setStatus(status);

                                rturmas.add(rt);
                            }
                        }

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou a turma com a descrição: " + descricao));

                        request.getSession().setAttribute("rturmas", rturmas);
                        request.getSession().setAttribute("turmas", turmas);
                        request.getSession().setAttribute("inscricoes", inscricoes);

                    } else {
                        msgErro = "Turma já existente com essa descrição";
                        alerta = "bg-warning";
                    }

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Horario> horarios = (List<Horario>) request.getSession().getAttribute("horarios");

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("horarios", horarios);

                    response.sendRedirect("grades");

                }
                ;
                break;

                case "cancelar-edicao": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                    List<Horario> horarios = (List<Horario>) request.getSession().getAttribute("horarios");

                    List<RTurmas> rturmas = new ArrayList();

                    if (turmas != null) {
                        for (Turma t : turmas) {

                            String status = "Activa";

                            if (t.getTurmDataFim().toGregorianCalendar().getTime().before(new Date())) {
                                status = "Inactiva";
                            }
                            RTurmas rt = new RTurmas();
                            rt.setInscricoes(getNumInscricoes(inscricoes, t));
                            rt.setTurma(t);
                            rt.setStatus(status);

                            rturmas.add(rt);
                        }
                    }

                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("horarios", horarios);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("rturmas", rturmas);
                    request.getSession().setAttribute("turma", null);
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("periodo", "");
                    request.getSession().setAttribute("curso", "");
                    request.getSession().setAttribute("horario", "");
                    request.getSession().setAttribute("turno", "");
                    request.getSession().setAttribute("min", 0);
                    request.getSession().setAttribute("max", 0);

                    response.sendRedirect("grades");
                }
                ;
                break;

                case "alunos-turma": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Turma turma = ensinoCtrl.buscaTurmaId(id);

                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosTurma(entidade, turma);

                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");

                    int homens = 0;
                    int mulheres = 0;

                    double totalFacturado = 0;
                    double totalCobrado = 0;

                    if (pagamentos != null) {
                        for (Pagamento p : pagamentos) {
                            String estado = encryptUtils.decodeString(p.getPagEstado());

                            if (p.isPagStatus()) {
                                totalCobrado += p.getPagValorPago();
                            }

                            if (!estado.equals("Cancelado")) {
                                totalFacturado += p.getPagValor();
                            }
                        }
                    }

                    if (inscricoes != null) {
                        for (Inscricao i : inscricoes) {
                            String sex = encryptUtils.decodeString(i.getAluno().getPessoa().getPessSexo());

                            if (sex.equals("Masculino")) {
                                homens++;
                            } else {
                                mulheres++;
                            }
                        }
                    }

                    Collections.sort(inscricoes, (Inscricao o1, Inscricao o2) -> {
                        String s1 = encryptUtils.decodeString(o1.getAluno().getPessoa().getPessNome());
                        String s2 = encryptUtils.decodeString(o2.getAluno().getPessoa().getPessNome());

                        return s1.compareToIgnoreCase(s2);
                    });

                    request.getSession().setAttribute("turmas", turmas);

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("turma", turma);

                    request.getSession().setAttribute("homens", homens);
                    request.getSession().setAttribute("mulheres", mulheres);

                    request.getSession().setAttribute("totalFacturado", totalFacturado);
                    request.getSession().setAttribute("totalCobrado", totalCobrado);

                    response.sendRedirect("grade-students");

                }
                ;
                break;

                case "imprimir-turmas": {

                    List<RTurmas> rturmas = (List<RTurmas>) request.getSession().getAttribute("rturmas");

                    request.getSession().setAttribute("rturmas", rturmas);

                    response.sendRedirect("print-grade");

                }
                ;
                break;

                case "imprimir-alunos-turma": {
                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("turma", turma);

                    response.sendRedirect("print-students-grade");

                }
                ;
                break;

                case "imprimir-alunos-turma-2": {
                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("turma", turma);

                    response.sendRedirect("print-students-grade-2");

                }
                ;
                break;

                case "imprimir-alunos-turma-3": {
                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("turma", turma);

                    response.sendRedirect("print-students-grade-3");

                }
                ;
                break;

                case "confirmar-inscricao": {

                    String dataMensalidade = getString(request.getParameter("dataMensalidade"));
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));

                    String noty_list[] = request.getParameterValues("noty_list");

                    int i = 0;
                    String str = "";

                    @SuppressWarnings("UnusedAssignment")
                    String msgErro = "";
                    @SuppressWarnings("UnusedAssignment")
                    String alerta = "";

                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                    Turma turma = ensinoCtrl.buscaTurmaId(idTurma);

                    XMLGregorianCalendar calendarInscricao = getDate(dataMensalidade);

                    if (noty_list != null) {
                        for (String n : noty_list) {

                            i++;

                            AnoLectivo anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entidade);
                            data.le_hora();

                            Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(data.getAno()));
                            referencia.setRefInscricoes(referencia.getRefInscricoes() + 1);

                            vendasCtrl.persistirReferencia(referencia);

                            String anoBagde = data.getAno();

                            String anoTrim = anoBagde.substring(anoBagde.length() - 2, anoBagde.length());

                            Calendar calIns = Calendar.getInstance();
                            calIns.setTime(calendarInscricao.toGregorianCalendar().getTime());
                            calIns.add(Calendar.DATE, 30);

                            GregorianCalendar gcNext = new GregorianCalendar();
                            gcNext.setGregorianChange(calIns.getTime());
                            XMLGregorianCalendar calendarNext = new XMLGregorianCalendarImpl(gcNext);

                            // referencia.setRefInscricoes(referencia.getRefInscricoes() + 1);
                            String refIns = utilitariosCtrl.buscaBadgeNumber(anoTrim + encryptUtils.decodeString(turma.getCurso().getCursCod()), referencia.getRefInscricoes());

                            Inscricao iAux = getInscricao(inscricoes, Integer.parseInt(n));

                            String condicao = encryptUtils.decodeString(iAux.getInscCondicao());

                            String bolseiro = encryptUtils.decodeString(iAux.getAluno().getAlunBolseiro());

                            Pessoa pessoa = iAux.getAluno().getPessoa();

                            str += encryptUtils.decodeString(iAux.getAluno().getAlunBadgnumber()) + ",";

                            String pagamento = "Talão de Depósito";

                            Inscricao inscricao = new Inscricao();
                            inscricao.setAluno(iAux.getAluno());
                            inscricao.setAnoLectivo(anoLectivo);
                            inscricao.setCurso(turma.getCurso());
                            inscricao.setEntidade(entidade);
                            inscricao.setInscDataInscricao(calendarInscricao);
                            inscricao.setInscDataProximoPagamento(calendarNext);
                            inscricao.setTurma(turma);
                            inscricao.setInscOrigem(encryptUtils.encodeString("Sistema"));
                            inscricao.setInscTurno(encryptUtils.encodeString("N/D"));
                            inscricao.setInscSemestre(encryptUtils.encodeString("N/D"));
                            inscricao.setInscNrTransfercia(iAux.getInscNrTransfercia());
                            inscricao.setInscReferencia(encryptUtils.encodeString(refIns));
                            inscricao.setInscAnoLectivo(encryptUtils.encodeString(data.getAno()));
                            inscricao.setInscCondicao(encryptUtils.encodeString(condicao));

                            inscricao.setInscCertificado(iAux.isInscCertificado());
                            inscricao.setInscCopiaBI(iAux.isInscCopiaBI());
                            inscricao.setInscFotos(iAux.isInscFotos());

                            ensinoCtrl.persistirInscricao(inscricao);

                            Aluno aluno = inscricao.getAluno();

                            String categoria = "CONTINUANTE";

                            Matricula matricula = ensinoCtrl.buscaMatriculaAno(codEscola, encryptUtils.encodeString(data.getAno()), turma.getCurso().getCursDescricao());

                            if (matricula == null) {
                                matricula = new Matricula();
                                matricula.setCodEscola(codEscola);
                                matricula.setMatrAno(encryptUtils.encodeString(data.getAno()));
                                matricula.setMatrClasse(turma.getCurso().getCursDescricao());
                            }

                            switch (categoria) {
                                case "NOVO INGRESSO":
                                    matricula.setMatrNovo(matricula.getMatrNovo() + 1);
                                    break;
                                case "CONTINUANTE":
                                    matricula.setMatrContinuante(matricula.getMatrContinuante() + 1);
                                    break;
                                case "REPETENTE":
                                    matricula.setMatrRepetente(matricula.getMatrRepetente() + 1);
                                    break;
                                case "ASSISTENTE":
                                    matricula.setMatrAssistente(matricula.getMatrAssistente() + 1);
                                    break;
                                case "TRANSFERIDO":
                                    matricula.setMatrTransferido(matricula.getMatrTransferido() + 1);
                                    break;
                            }

                            GregorianCalendar gc = new GregorianCalendar();
                            gc.setGregorianChange(new Date());
                            XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                            XMLGregorianCalendar calendarNascimento = aluno.getPessoa().getPessDataNascimento();

                            int idade = 0;

                            if (calendarNascimento != null) {
                                idade = calendarNascimento.getYear() - calendar.getYear();
                            }

                            if (idade >= 0 && idade <= 5) {
                                matricula.setMatrFaixa05(matricula.getMatrFaixa05() + 1);
                            } else if (idade >= 6 && idade <= 10) {
                                matricula.setMatrFaixa610(matricula.getMatrFaixa610() + 1);
                            } else if (idade >= 11 && idade <= 15) {
                                matricula.setMatrFaixa1115(matricula.getMatrFaixa1115() + 1);
                            } else if (idade >= 16 && idade <= 25) {
                                matricula.setMatrFaixa1625(matricula.getMatrFaixa1625() + 1);
                            } else if (idade >= 26 && idade <= 35) {
                                matricula.setMatrFaixa2635(matricula.getMatrFaixa2635() + 1);
                            } else if (idade > 35) {
                                matricula.setMatrFaixa35(matricula.getMatrFaixa35() + 1);
                            }

                            if (aluno.isAlunDeficiente()) {
                                matricula.setMatrVuneraveis(matricula.getMatrVuneraveis() + 1);
                            }

                            String sexo = encryptUtils.decodeString(aluno.getPessoa().getPessSexo());

                            if (sexo.equals("Masculino")) {
                                matricula.setMatrHomens(matricula.getMatrHomens() + 1);
                            } else {
                                matricula.setMatrMulheres(matricula.getMatrMulheres() + 1);
                            }

                            ensinoCtrl.persistirMatricula(matricula);
                        }

                        msgErro = i + " Estudante(s) inscrito(s) com sucesso";
                        alerta = "bg-success";

                        if (!str.isEmpty()) {

                            str = str.substring(0, str.length() - 1);

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Inscreveu com sucesso o estudantes com o id: " + str + ", para a turma: " + idTurma));
                        }

                    } else {
                        msgErro = "Nenhum estudante foi selecionado da lista";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("grade-students");

                }
                ;
                break;

                case "salas": {

                    request.getSession().setAttribute("salas", ensinoCtrl.listaSalas(entidade));
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("sala", null);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de registo de salas"));
                    response.sendRedirect("class-room");

                }
                ;
                break;

                case "registar-sala": {
                    String descricao = request.getParameter("descricao");

                    Sala sala = ensinoCtrl.buscaSalaDescricao(entidade, encryptUtils.encodeString(descricao));

                    String msgErro = "[SALA]: " + descricao + "."
                            + "Adicionada com sucesso";

                    String alerta = "bg-success";

                    if (sala == null) {

                        GregorianCalendar gc = new GregorianCalendar();
                        gc.setGregorianChange(new Date());
                        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                        sala = new Sala();
                        sala.setSalaDescricao(encryptUtils.encodeString(descricao));
                        sala.setEntidade(entidade);
                        sala.setSalaData(calendar);

                        ensinoCtrl.persistirSala(sala);

                        Escola escola = ensinoCtrl.buscaEscola(codEscola);
                        escola.setEscSalas(escola.getEscSalas() + 1);
                        ensinoCtrl.persistirSala(sala);

                        request.getSession().setAttribute("salas", ensinoCtrl.listaSalas(entidade));
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso a sala com a descrição: " + descricao));
                    } else {
                        msgErro = "[SALA]: " + descricao + "."
                                + "Já existe no sistema";

                        alerta = "bg-error";

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou adicionar uma sala já existente no sistema com a descrição: " + descricao));
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("class-room");
                }
                ;
                break;

                case "editar-sala": {
                    int id = Integer.parseInt(request.getParameter("di"));

                    Sala sala = ensinoCtrl.buscaSalaId(id);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição a sala com a descrição :" + sala.getSalaDescricao()));

                    request.getSession().setAttribute("sala", sala);
                    response.sendRedirect("class-room");

                }
                ;
                break;

                case "confirma-editar-sala": {

                    String descricao = request.getParameter("descricao");
                    int id = Integer.parseInt(request.getParameter("di"));

                    Sala sala = ensinoCtrl.buscaSalaId(id);

                    Sala salaCheck = ensinoCtrl.buscaSalaDescricao(entidade, encryptUtils.encodeString(descricao));

                    String descricaoActual = sala.getSalaDescricao();

                    Sala salaAux = new Sala();
                    salaAux.setSalaDescricao(encryptUtils.encodeString(descricao));
                    salaAux.setSalaId(id);

                    String msgErro = "[SALA]: " + descricaoActual + "."
                            + "Alterada com sucesso para nova descrição '" + descricao + "'";

                    String alerta = "bg-success";

                    boolean alterou = false;

                    if (salaCheck != null) { // IF CHECK NOT NULL

                        if (salaCheck.getSalaDescricao().equals(sala.getSalaDescricao())) {// IF CHECK EQUAL WITH THE ORGINAL

                            if (salaAux.getSalaDescricao().equals(sala.getSalaDescricao())) // IF ORGINAL EQUAL WITH AUXLIXAR
                            {

                                msgErro = "";
                                alerta = "";

                            } else { // IF AUXLIXAR NOT EQUAL WITH ORGINAL
                                sala.setSalaDescricao(encryptUtils.encodeString(descricao));
                                alterou = true;
                            }

                        } else { // IF EXISTS
                            msgErro = "[SALA]: " + descricaoActual + "."
                                    + "Não pode alterar a sala para a descrição '" + descricao + "', já existe registado";

                            alerta = "bg-error";

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou adicionar uma sala já existente no sistema com a descrição: " + descricao));
                        }

                    } else // IF CHECK DOESN'T EXIST
                    {
                        sala.setSalaDescricao(encryptUtils.encodeString(descricao));
                        alterou = true;
                    }

                    if (alterou) //IF ORGINAL HAS BEEN CHANGED
                    {
                        ensinoCtrl.persistirSala(sala);

                        request.getSession().setAttribute("salas", ensinoCtrl.listaSalas(entidade));
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso a descrição da sala com id:  " + id));
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("class-room");
                }
                ;
                break;

                case "remover-sala": {
                    int id = Integer.parseInt(request.getParameter("di"));

                    Sala sala = ensinoCtrl.buscaSalaId(id);

                    boolean remove = false;

                    @SuppressWarnings("UnusedAssignment")
                    String msgErro = "";
                    @SuppressWarnings("UnusedAssignment")
                    String alerta = "";

                    if (remove) {

                        ensinoCtrl.removerSala(sala);

                        Escola escola = ensinoCtrl.buscaEscola(codEscola);
                        escola.setEscSalas(escola.getEscSalas() - 1);

                        request.getSession().setAttribute("salas", ensinoCtrl.listaSalas(entidade));
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu a sala com id:  " + id));
                        msgErro = "[SALA]: " + sala.getSalaDescricao() + "."
                                + "Removida com sucesso";

                        alerta = "bg-success";

                    } else {
                        msgErro = "[SALA]: " + sala.getSalaDescricao() + "."
                                + "Não pode ser removida.."
                                + "Desassocie registos de cursos, docontes ligados a sala";

                        alerta = "bg-error";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("class-room");

                }
                ;
                break;

                case "cancelar-edicao-sala": {
                    request.getSession().setAttribute("salas", (List<Sala>) request.getSession().getAttribute("salas"));
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("sala", null);
                    response.sendRedirect("class-room");

                }
                ;
                break;

                case "imprimir-salas": {

                    request.getSession().setAttribute("salas", (List<Sala>) request.getSession().getAttribute("salas"));

                    response.sendRedirect("print-class-room");

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

    public XMLGregorianCalendar getDate(String data) {

        StringTokenizer st = new StringTokenizer(data, "/");

        String dt = st.nextToken();
        if (dt.startsWith("0")) {
            dt = dt.charAt(dt.length() - 1) + "";
        }
        int month = Integer.parseInt(st.nextToken()) - 1;
        int day = Integer.parseInt(dt);
        int year = Integer.parseInt(st.nextToken());

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, day);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        return calendar;
    }

    private int getNumInscricoes(List<Inscricao> inscricoes, Turma turma) {
        int num = 0;

        if (inscricoes != null) {
            for (Inscricao i : inscricoes) {
                if (i.getTurma().getTurmId() == turma.getTurmId()) {
                    num++;
                }
            }
        }

        return num;
    }

    private String getString(String str) {
        String s = str;
        if (s == null) {
            s = "N/D";
        } else if (s.isEmpty()) {
            s = "N/D";
        }

        return s;
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
}
