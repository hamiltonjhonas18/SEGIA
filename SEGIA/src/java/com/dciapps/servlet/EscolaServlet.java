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
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Falta;
import com.dciapps.webclient.Fluxo;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Log;
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

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "RXNjb2xhU2VydmxldCNEQ0k=", urlPatterns = {"/RXNjb2xhU2VydmxldCNEQ0k="})
public class EscolaServlet extends HttpServlet {
    
    Entidade entidade;
    
    Data data = new Data();
    
    Sistema sistema;
    
    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    UtilitariosCtrl utilitariosCtrl = new UtilitariosCtrl();
    ContabilidadeCtrl contabilidadeCtrl = new ContabilidadeCtrl();
    VendasCtrl vendasCtrl = new VendasCtrl();
    IbanCtrl ibanCtrl = new IbanCtrl();
    
    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();
    
    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();
    
    Sender sender = new Sender();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    
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
                
                case "mapa-faltas": {
                    
                    data.le_hora();
                    
                    List<Falta> faltas = ensinoCtrl.listaFaltasAno(codEscola, encryptUtils.encodeString(data.getAno()));
                    
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou o mapa de faltas"));
                    
                    request.getSession().setAttribute("faltas", faltas);
                    response.sendRedirect("fouls-map");
                }
                ;
                break;
                
                case "inscritos-escola": {
                    
                    List<Aluno> alunos = ensinoCtrl.listaAlunos(entidade);
                    
                    request.getSession().setAttribute("alunos", alunos);
                    response.sendRedirect("students");
                }
                ;
                break;
                
                case "aproveitamento-pedagogico": {
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
                    
                    String desc = "";
                    if (curso != null) {
                        turmas = ensinoCtrl.listaTurmasCurso(entidade, curso);
                        desc = encryptUtils.decodeString(curso.getCursDescricao());
                        
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
                    
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o mapa de aproveitamento para o curso : " + desc));
                    response.sendRedirect("apr-map");
                    
                }
                ;
                break;
                
                case "melhores-alunos": {
                    
                    @SuppressWarnings("UnusedAssignment")
                    AnoLectivo anoLectivo = null;
                    data.le_hora();
                    String anoSel = data.getAno();
                    if (request.getParameter("ano") == null) {
                        
                        anoLectivo = ensinoCtrl.buscaAnoLectivoDescricao(entidade, encryptUtils.encodeString(anoSel));
                    } else {
                        anoSel = request.getParameter("ano");
                        anoLectivo = ensinoCtrl.buscaAnoLectivoDescricao(entidade, encryptUtils.encodeString(anoSel));
                    }
                    
                    List<Inscricao> inscricoes = null;
                    if (anoLectivo != null) {
                        inscricoes = ensinoCtrl.listaInscricoesMelhoresAno(entidade, anoLectivo, 10);
                        
                    }
                    request.getSession().setAttribute("inscricoesTop10", inscricoes);
                    
                    request.getSession().setAttribute("anoSel", anoSel);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou a lista dos melhores alunos para o ano : " + anoSel));
                    
                    response.sendRedirect("apr-rate");
                }
                ;
                break;
                
                case "alunos-necessitados": {
                    Escola escola = ensinoCtrl.buscaEscola(codEscola);
                    List<Aluno> alunos = ensinoCtrl.listaAlunosEscolaNecessitados(entidade, escola);
                    
                    request.getSession().setAttribute("alunosNecessitados", alunos);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou a lista dos alunos necessitados"));
                    
                    response.sendRedirect("students-needy");
                }
                ;
                break;
                
                case "material-distribuido": {
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
                    
                    String desc = "";
                    if (curso != null) {
                        turmas = ensinoCtrl.listaTurmasCurso(entidade, curso);
                        desc = encryptUtils.decodeString(curso.getCursDescricao());
                        
                        if (!turmas.isEmpty()) {
                            turma = turmas.get(0);
                        }
                    }
                    
                    List<Inscricao> inscricoes = null;
                    
                    @SuppressWarnings("UnusedAssignment")
                    List<Fluxo> fluxos = null;
                    Date dataHoje = new Date();
                    String periodo = sdf.format(dataHoje);
                    String dataSelecionada = sdf2.format(dataHoje) + " - " + sdf2.format(dataHoje);
                    
                    if (turma != null) {
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                        
                        if (request.getParameter("dataPesquisa") != null) {
                            String dataPesquisa = request.getParameter("dataPesquisa");
                            StringTokenizer tok = new StringTokenizer(dataPesquisa, " - ");
                            String d1 = tok.nextToken();
                            String d2 = tok.nextToken();
                            
                            XMLGregorianCalendar calendar1 = getDate(d1);
                            XMLGregorianCalendar calendar2 = getDate(d2);
                            
                            periodo = sdf.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf.format(calendar2.toGregorianCalendar().getTime());
                            dataSelecionada = sdf2.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf2.format(calendar2.toGregorianCalendar().getTime());
                            
                            fluxos = vendasCtrl.listaFluxoTurmaPeriodo(entidade, turma, sdf.format(calendar1.toGregorianCalendar().getTime()), sdf.format(calendar2.toGregorianCalendar().getTime()));
                        } else {
                            fluxos = vendasCtrl.listaFluxoTurmaData(entidade, turma, sdf.format(dataHoje));
                        }
                        
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou o histórico de material distribuido para a turma: " + encryptUtils.decodeString(turma.getTurmDescricao()) + " para o periodo: " + periodo));
                        
                    }
                    
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("periodo", periodo);
                    request.getSession().setAttribute("dataSelecionada", dataSelecionada);
                    request.getSession().setAttribute("fluxos", fluxos);
                    
                    response.sendRedirect("materials");
                    
                }
                ;
                break;
                
                case "historico-distribuicao": {
                    
                    @SuppressWarnings("UnusedAssignment")
                    List<Fluxo> fluxos = null;
                    Date dataHoje = new Date();
                    String periodo = sdf.format(dataHoje);
                    String dataSelecionada = sdf2.format(dataHoje) + " - " + sdf2.format(dataHoje);
                    
                    Turma turma = (Turma) request.getSession().getAttribute("turma");
                    
                    if (turma != null) {
                        if (request.getParameter("dataPesquisa") != null) {
                            String dataPesquisa = request.getParameter("dataPesquisa");
                            StringTokenizer tok = new StringTokenizer(dataPesquisa, " - ");
                            String d1 = tok.nextToken();
                            String d2 = tok.nextToken();
                            
                            XMLGregorianCalendar calendar1 = getDate(d1);
                            XMLGregorianCalendar calendar2 = getDate(d2);
                            
                            periodo = sdf.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf.format(calendar2.toGregorianCalendar().getTime());
                            dataSelecionada = sdf2.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf2.format(calendar2.toGregorianCalendar().getTime());
                            
                            fluxos = vendasCtrl.listaFluxoTurmaPeriodo(entidade, turma, sdf.format(calendar1.toGregorianCalendar().getTime()), sdf.format(calendar2.toGregorianCalendar().getTime()));
                        } else {
                            fluxos = vendasCtrl.listaFluxoTurmaData(entidade, turma, sdf.format(dataHoje));
                        }
                        
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou o histórico de material distribuido para a turma: " + encryptUtils.decodeString(turma.getTurmDescricao()) + " para o periodo: " + periodo));
                    }
                    
                    request.getSession().setAttribute("fluxos", fluxos);
                    request.getSession().setAttribute("periodo", periodo);
                    request.getSession().setAttribute("dataSelecionada", dataSelecionada);
                    
                    response.sendRedirect("materials");
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
    
    private String getString(String str) {
        String s = str;
        if (s == null) {
            s = "N/D";
        } else if (s.isEmpty()) {
            s = "N/D";
        }
        
        return s;
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
    
}
