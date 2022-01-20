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
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Disciplina;
import com.dciapps.webclient.DisciplinaCurso;
import com.dciapps.webclient.DisciplinaDocente;
import com.dciapps.webclient.Docente;
import com.dciapps.webclient.DocenteTurma;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Turma;
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
@WebServlet(name = "RGlzY2lwbGluYVNlcnZsZXQjRENJ", urlPatterns = {"/RGlzY2lwbGluYVNlcnZsZXQjRENJ"})
public class DisciplinaServlet extends HttpServlet {

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    Entidade entidade;

    Data data = new Data();
    Sender sender = new Sender();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

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

                case "disciplinas": {

                    request.getSession().setAttribute("disciplinas", ensinoCtrl.listaDisciplinas(entidade));
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("disciplina", null);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de registo de disciplinas"));
                    response.sendRedirect("subjects");

                }
                ;
                break;

                case "registar-disciplina": {
                    String descricao = request.getParameter("descricao");
                    int cargaHoraria = Integer.parseInt(request.getParameter("cargaHoraria"));

                    Disciplina disciplina = ensinoCtrl.buscaDisciplinaDescricao(entidade, encryptUtils.encodeString(descricao));

                    String msgErro = "[DISCIPLINA]: " + descricao + "."
                            + "Adicionada com sucesso";

                    String alerta = "bg-success";

                    if (disciplina == null) {
                        disciplina = new Disciplina();
                        disciplina.setDiscDescricao(encryptUtils.encodeString(descricao));
                        disciplina.setDiscCargaHoraria(cargaHoraria);
                        disciplina.setEntidade(entidade);

                        ensinoCtrl.persistirDisciplina(disciplina);

                        request.getSession().setAttribute("disciplinas", ensinoCtrl.listaDisciplinas(entidade));
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso a disciplina com a descrição: " + descricao));
                    } else {
                        msgErro = "[DISCIPLINA]: " + descricao + "."
                                + "Já existe no sistema";

                        alerta = "bg-error";

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou adicionar uma disciplina já existente no sistema com a descrição: " + descricao));
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("subjects");
                }
                ;
                break;

                case "editar-disciplina": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Disciplina disciplina = ensinoCtrl.buscaDisciplinaId(id);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição a disciplina com a descrição :" + disciplina.getDiscDescricao()));

                    request.getSession().setAttribute("disciplina", disciplina);
                    response.sendRedirect("subjects");

                }
                ;
                break;

                case "confirma-editar-disciplina": {

                    String descricao = request.getParameter("descricao");
                    int cargaHoraria = Integer.parseInt(request.getParameter("cargaHoraria"));

                    Disciplina disciplina = (Disciplina) request.getSession().getAttribute("disciplina");

                    Disciplina disciplinaCheck = ensinoCtrl.buscaDisciplinaDescricao(entidade, encryptUtils.encodeString(descricao));

                    String descricaoActual = encryptUtils.decodeString(disciplina.getDiscDescricao());

                    Disciplina disciplinaAux = new Disciplina();
                    disciplinaAux.setDiscDescricao(encryptUtils.encodeString(descricao));
                    disciplinaAux.setDiscCargaHoraria(cargaHoraria);
                    disciplinaAux.setDiscId(disciplina.getDiscId());

                    String msgErro = "[DISCIPLINA]: " + descricaoActual + "."
                            + "Alterada com sucesso para nova descrição: " + descricao + "";

                    String alerta = "bg-success";

                    boolean alterou = false;

                    if (disciplinaCheck != null) { // IF CHECK NOT NULL

                        if (disciplinaCheck.getDiscDescricao().equals(disciplina.getDiscDescricao())) {// IF CHECK EQUAL WITH THE ORGINAL

                            if (disciplinaAux.getDiscDescricao().equals(disciplina.getDiscDescricao())) // IF ORGINAL EQUAL WITH AUXLIXAR
                            {

                                if (disciplinaAux.getDiscCargaHoraria() != disciplina.getDiscCargaHoraria()) {
                                    disciplina.setDiscCargaHoraria(cargaHoraria);
                                    alterou = true;

                                    msgErro = "Alterada com sucesso a carga horária.";

                                } else {

                                    msgErro = "";
                                    alerta = "";
                                }

                            } else { // IF AUXLIXAR NOT EQUAL WITH ORGINAL
                                disciplina.setDiscDescricao(encryptUtils.encodeString(descricao));
                                disciplina.setDiscCargaHoraria(cargaHoraria);
                                alterou = true;
                            }

                        } else { // IF EXISTS
                            msgErro = "[DISCIPLINA]: " + descricaoActual + "."
                                    + "Não pode alterar a disciplina para a descrição :" + descricao + ", já existe registado";

                            alerta = "bg-error";

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou adicionar uma disciplina já existente no sistema com a descrição: " + descricao));
                        }

                    } else // IF CHECK DOESN'T EXIST
                    {
                        disciplina.setDiscDescricao(encryptUtils.encodeString(descricao));
                        disciplina.setDiscCargaHoraria(cargaHoraria);
                        alterou = true;
                    }

                    if (alterou) //IF ORGINAL HAS BEEN CHANGED
                    {
                        ensinoCtrl.persistirDisciplina(disciplina);

                        request.getSession().setAttribute("disciplinas", ensinoCtrl.listaDisciplinas(entidade));
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso a descrição da disciplina com id:  " + disciplina.getDiscId()));
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("subjects");
                }
                ;
                break;

                case "remover-disciplina": {
                    int id = Integer.parseInt(request.getParameter("di"));

                    Disciplina disciplina = ensinoCtrl.buscaDisciplinaId(id);

                    List<DisciplinaCurso> discplinasCursos = ensinoCtrl.listaDisciplinasCursos(entidade);

                    @SuppressWarnings("UnusedAssignment")
                    String msgErro = "";
                    @SuppressWarnings("UnusedAssignment")
                    String alerta = "";

                    if (discplinasCursos.isEmpty()) {

                        ensinoCtrl.removerDisciplina(disciplina);

                        request.getSession().setAttribute("disciplinas", ensinoCtrl.listaDisciplinas(entidade));
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu a disciplina com id:  " + id));
                        msgErro = "[DISCIPLINA]: " + disciplina.getDiscDescricao() + "."
                                + "Removida com sucesso";

                        alerta = "bg-success";

                    } else {
                        msgErro = "[DISCIPLINA]: " + disciplina.getDiscDescricao() + "."
                                + "Não pode ser removida.."
                                + "Desassocie registos de cursos, docontes ligados ao disciplina";

                        alerta = "bg-error";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("subjects");

                }
                ;
                break;

                case "cancelar-edicao-disciplina": {
                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("disciplina", null);
                    response.sendRedirect("subjects");

                }
                ;
                break;

                case "imprimir-disciplinas": {

                    request.getSession().setAttribute("disciplinas", (List<Disciplina>) request.getSession().getAttribute("disciplinas"));

                    response.sendRedirect("print-subjects");

                }
                ;
                break;

                case "disciplinasCurso": {

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                    }

                    if (disciplinas == null) {
                        disciplinas = ensinoCtrl.listaDisciplinas(entidade);
                    }

                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("disciplinasCurso", ensinoCtrl.listaDisciplinasCursos(entidade));

                    response.sendRedirect("subjects-of-course");

                }
                ;
                break;

                case "adicionar-disciplinas-curso": {
                    String semestre = request.getParameter("semestre");
                    String descDisciplinas[] = request.getParameterValues("descDisciplinas");
                    int idCurso = Integer.parseInt(request.getParameter("idCurso"));

                    Curso curso = ensinoCtrl.buscaCursoId(idCurso);

                    String nm = "";
                    if (curso != null) {
                        System.out.println("EI O CURSO NAO É NULLO");

                        nm = encryptUtils.decodeString(curso.getCursDescricao());
                    } else {
                        System.out.println("ESTE CURSO É NULLO");

                    }

                    int numAdd = 0;
                    int numRepeat = 0;
                    List<DisciplinaCurso> disciplinasCurso = ensinoCtrl.listaDisciplinasCursosCurso(entidade, curso);

                    for (String desc : descDisciplinas) {
                        if (existeDisciplinasNoCurso(disciplinasCurso, encryptUtils.encodeString(desc))) {
                            numRepeat++;
                        } else {
                            numAdd++;
                            Disciplina disciplina = ensinoCtrl.buscaDisciplinaDescricao(entidade, encryptUtils.encodeString(desc));

                            DisciplinaCurso disciplinaCurso = new DisciplinaCurso();
                            disciplinaCurso.setCurso(curso);
                            disciplinaCurso.setDisciplina(disciplina);
                            disciplinaCurso.setDisdSemestre(semestre);
                            disciplinaCurso.setEntidade(entidade);

                            ensinoCtrl.persistirDisciplinaCurso(disciplinaCurso);
                        }
                    }

                    String msgErro = "Adicionada(s) " + numAdd + " disciplina(s) . "
                            + "Repetida(s) " + numRepeat + " disciplina(s) não adicionadas";
                    String alerta = "bg-success";

                    if (numAdd > 0) {
                        String msg = numAdd + " novas disciplinas";
                        if (numAdd == 1) {
                            msg = "uma nova disciplina";
                        }
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou " + msg + " ao curso :  " + nm));

                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("disciplinasCurso", ensinoCtrl.listaDisciplinasCursos(entidade));

                    response.sendRedirect("subjects-of-course");
                }
                ;
                break;

                case "remover-disciplina-curso": {
                    int id = Integer.parseInt(request.getParameter("di"));

                    DisciplinaCurso disciplinaCurso = ensinoCtrl.buscaDisciplinaCursoId(id);

                    ensinoCtrl.removerDisciplinaCurso(disciplinaCurso);

                    String msgErro = "Disciplina '" + disciplinaCurso.getDisciplina().getDiscDescricao() + "' removida com sucesso do curso  '" + disciplinaCurso.getCurso().getCursDescricao() + "'";
                    String alerta = "bg-success";

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("disciplinasCurso", ensinoCtrl.listaDisciplinasCursosCurso(entidade, disciplinaCurso.getCurso()));

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso a disciplina '" + disciplinaCurso.getDisciplina().getDiscDescricao() + "' do curso :  " + disciplinaCurso.getCurso().getCursDescricao()));

                    response.sendRedirect("subjects-of-course");

                }
                ;
                break;

                case "imprimir-disciplinas-curso": {

                    request.getSession().setAttribute("disciplinasCurso", (List<DisciplinaCurso>) request.getSession().getAttribute("disciplinasCurso"));

                    response.sendRedirect("print-subjects-course");

                }
                ;
                break;

                case "disciplinasDocente": {

                    List<Docente> docentes = (List<Docente>) request.getSession().getAttribute("docentes");
                    List<Disciplina> disciplinas = (List<Disciplina>) request.getSession().getAttribute("disciplinas");

                    if (docentes == null) {
                        docentes = ensinoCtrl.listaDocentes(entidade);
                    }

                    if (disciplinas == null) {
                        disciplinas = ensinoCtrl.listaDisciplinas(entidade);
                    }

                    request.getSession().setAttribute("disciplinas", disciplinas);
                    request.getSession().setAttribute("docentes", docentes);
                    request.getSession().setAttribute("disciplinasDocente", ensinoCtrl.listaDisciplinasDocentes(entidade));

                    response.sendRedirect("subjects-of-teacher");

                }
                ;
                break;

                case "adicionar-disciplinas-docente": {
                    String descDisciplinas[] = request.getParameterValues("descDisciplinas");
                    int idDocente = Integer.parseInt(request.getParameter("idDocente"));

                    Docente docente = ensinoCtrl.buscaDocenteId(idDocente);

                    int numAdd = 0;
                    int numRepeat = 0;

                    List<DisciplinaDocente> disciplinasDocente = ensinoCtrl.listaDisciplinasDocentesDocente(entidade, docente);

                    for (String desc : descDisciplinas) {
                        if (existeDisciplinasNoDocente(disciplinasDocente, encryptUtils.encodeString(desc))) {
                            numRepeat++;
                        } else {
                            numAdd++;
                            Disciplina disciplina = ensinoCtrl.buscaDisciplinaDescricao(entidade, encryptUtils.encodeString(desc));

                            DisciplinaDocente disciplinaDocente = new DisciplinaDocente();
                            disciplinaDocente.setDocente(docente);
                            disciplinaDocente.setDisciplina(disciplina);
                            disciplinaDocente.setEntidade(entidade);

                            ensinoCtrl.persistirDisciplinaDocente(disciplinaDocente);
                        }
                    }

                    String msgErro = "Adicionada(s) " + numAdd + " disciplina(s) . "
                            + "Repetida(s) " + numRepeat + " disciplina(s) não adicionadas";
                    String alerta = "bg-success";

                    if (numAdd > 0) {
                        String msg = numAdd + " novas disciplinas";
                        if (numAdd == 1) {
                            msg = "uma nova disciplina";
                        }
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou " + msg + " ao docente :  " + encryptUtils.decodeString(docente.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(docente.getPessoa().getPessApelido())));

                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("disciplinasDocente", ensinoCtrl.listaDisciplinasDocentes(entidade));

                    response.sendRedirect("subjects-of-teacher");
                }
                ;
                break;

                case "remover-disciplina-docente": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    DisciplinaDocente disciplinaDocente = ensinoCtrl.buscaDisciplinaDocenteId(id);

                    Docente docente = disciplinaDocente.getDocente();

                    ensinoCtrl.removerDisciplinaDocente(disciplinaDocente);

                    String msgErro = "Disciplina desassociada com sucesso";
                    String alerta = "bg-success";

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("disciplinasDocente", ensinoCtrl.listaDisciplinasDocentes(entidade));

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso a disciplina '" + encryptUtils.decodeString(disciplinaDocente.getDisciplina().getDiscDescricao()) + "' do docente :  " + encryptUtils.decodeString(docente.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(docente.getPessoa().getPessApelido())));

                    response.sendRedirect("subjects-of-teacher");

                }
                ;
                break;

                case "imprimir-disciplinas-docente": {

                    request.getSession().setAttribute("disciplinasDocente", (List<DisciplinaDocente>) request.getSession().getAttribute("disciplinasDocente"));

                    response.sendRedirect("print-subjects-teacher");

                }
                ;
                break;

                case "docentesTurma": {

                    List<Docente> docentes = (List<Docente>) request.getSession().getAttribute("docentes");
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");

                    if (docentes == null) {
                        docentes = ensinoCtrl.listaDocentes(entidade);
                    }

                    if (turmas == null) {
                        turmas = ensinoCtrl.listaTurmas(entidade);
                    }

                    request.getSession().setAttribute("docentes", docentes);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("docentesTurma", ensinoCtrl.listaDocentesTurmas(entidade));

                    response.sendRedirect("teachers-of-grade");

                }
                ;
                break;

                case "adicionar-docentes-turma": {
                    String descDocentes[] = request.getParameterValues("descDocentes");
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));

                    Turma turma = ensinoCtrl.buscaTurmaId(idTurma);

                    int numAdd = 0;
                    int numRepeat = 0;

                    List<DocenteTurma> docentesTurma = ensinoCtrl.listaDocentesTurmasTurma(entidade, turma);

                    for (String desc : descDocentes) {
                        if (existeDocentesNaTurma(docentesTurma, desc)) {
                            numRepeat++;
                        } else {
                            numAdd++;

                            StringTokenizer st2 = new StringTokenizer(desc);

                            String nm = "";

                            int size = st2.countTokens();

                            for (int i = 0; i < size - 1; i++) {
                                nm += st2.nextToken() + " ";

                            }

                            if (!nm.isEmpty()) {
                                nm = nm.substring(0, nm.length() - 1);
                            }

                            String ap = st2.nextToken();

                            Pessoa pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nm), encryptUtils.encodeString(ap));

                            Docente docente = ensinoCtrl.buscaDocentePessoaId(pessoa.getPessId());

                            DocenteTurma docenteTurma = new DocenteTurma();
                            docenteTurma.setTurma(turma);
                            docenteTurma.setDocente(docente);
                            docenteTurma.setEntidade(entidade);

                            ensinoCtrl.persistirDocenteTurma(docenteTurma);
                        }
                    }

                    String msgErro = "Adicionado(s) " + numAdd + " docente(s) . "
                            + "Repetido(s) " + numRepeat + " docente(s) não adicionados";
                    String alerta = "bg-success";

                    if (numAdd > 0) {
                        String msg = numAdd + " novos docentes";
                        if (numAdd == 1) {
                            msg = "uma novo docente";
                        }
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou " + msg + " a turma :  " + encryptUtils.decodeString(turma.getTurmDescricao())));

                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("docentesTurma", ensinoCtrl.listaDocentesTurmas(entidade));

                    response.sendRedirect("teachers-of-grade");
                }
                ;
                break;

                case "remover-docente-turma": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    DocenteTurma docenteTurma = ensinoCtrl.buscaDocenteTurmaId(id);

                    Docente docente = docenteTurma.getDocente();

                    ensinoCtrl.removerDocenteTurma(docenteTurma);

                    String msgErro = "Docente desassociado com sucesso";
                    String alerta = "bg-success";

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("docentesTurma", ensinoCtrl.listaDocentesTurmas(entidade));

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o docente '" + encryptUtils.decodeString(docente.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(docente.getPessoa().getPessApelido()) + "' da turma :  " + encryptUtils.decodeString(docenteTurma.getTurma().getTurmDescricao())));

                    response.sendRedirect("teachers-of-grade");

                }
                ;
                break;

                case "imprimir-docentes-turma": {

                    request.getSession().setAttribute("docentesTurma", (List<DocenteTurma>) request.getSession().getAttribute("docentesTurma"));

                    response.sendRedirect("print-teachers-grade");

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

    private boolean existeDisciplinasNoCurso(List<DisciplinaCurso> disciplinasCurso, String descricao) {
        return disciplinasCurso.stream().anyMatch((dc) -> (dc.getDisciplina().getDiscDescricao().equals(descricao)));
    }

    private boolean existeDisciplinasNoDocente(List<DisciplinaDocente> disciplinasDocente, String descricao) {
        return disciplinasDocente.stream().anyMatch((dc) -> (dc.getDisciplina().getDiscDescricao().equals(descricao)));
    }

    private boolean existeDocentesNaTurma(List<DocenteTurma> docentesTurma, String nome) {

        StringTokenizer st2 = new StringTokenizer(nome);

        String nm = "";

        int size = st2.countTokens();

        for (int i = 0; i < size - 1; i++) {
            nm += st2.nextToken() + " ";

        }

        if (!nm.isEmpty()) {
            nm = nm.substring(0, nm.length() - 1);
        }
        String ap = st2.nextToken();

        boolean exists = false;

        for (DocenteTurma dt : docentesTurma) {
            if (dt.getDocente().getPessoa().getPessNome().equals(encryptUtils.encodeString(nm))
                    && dt.getDocente().getPessoa().getPessApelido().equals(encryptUtils.encodeString(ap))) {
                exists = true;
            }
        }

        return exists;
    }
}
