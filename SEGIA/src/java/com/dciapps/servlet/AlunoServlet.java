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

import com.dciapps.local.Estudante;
import com.dciapps.local.HCal;
import com.dciapps.local.ImpAluno;
import com.dciapps.local.Tur;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Agenda;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Avaliacao;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Matricula;
import com.dciapps.webclient.Mensalidade;
import com.dciapps.webclient.Nacionalidade;
import com.dciapps.webclient.Notas;
import com.dciapps.webclient.Pagamento;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Referencia;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.TipoUsuario;
import com.dciapps.webclient.Transferencia;
import com.dciapps.webclient.Turno;
import com.dciapps.webclient.Upload;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclient.Vagas;
import com.dciapps.webclientcontroler.ContabilidadeCtrl;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.dciapps.webclientcontroler.IbanCtrl;
import com.dciapps.webclientcontroler.UtilitariosCtrl;
import com.dciapps.webclientcontroler.VendasCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import mz.co.dciapps.ExcelCtrl;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "QWx1bm9TZXJ2bGV0I0RDSQ==", urlPatterns = {"/QWx1bm9TZXJ2bGV0I0RDSQ=="})
public class AlunoServlet extends HttpServlet {
    
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
    
    ExcelCtrl excelCtrl = new ExcelCtrl();
    
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
                
                case "alunos": {
                    
                    List<Aluno> alunos = ensinoCtrl.listaAlunos(entidade);
                    
                    request.getSession().setAttribute("alunos", alunos);
                    response.sendRedirect("students");
                }
                ;
                break;
                
                case "aluno": {
                    
                    request.getSession().setAttribute("aluno", null);
                    request.getSession().setAttribute("inscricao", null);
                    request.getSession().setAttribute("nome", "");
                    request.getSession().setAttribute("apelido", "");
                    request.getSession().setAttribute("email", "");
                    request.getSession().setAttribute("bi", "");
                    request.getSession().setAttribute("casa", "");
                    request.getSession().setAttribute("nuit", "");
                    request.getSession().setAttribute("contacto", "");
                    request.getSession().setAttribute("endereco", "");
                    request.getSession().setAttribute("quarteirao", "");
                    request.getSession().setAttribute("nivel", "");
                    request.getSession().setAttribute("ocupacao", "");
                    request.getSession().setAttribute("sexo", "");
                    request.getSession().setAttribute("deficiencia", "");
                    request.getSession().setAttribute("categoria", "");
                    request.getSession().setAttribute("bolseiro", "");
                    request.getSession().setAttribute("provincia", "");
                    request.getSession().setAttribute("documento", "");
                    request.getSession().setAttribute("distrito", "");
                    request.getSession().setAttribute("responsavel", "");
                    request.getSession().setAttribute("contactoResponsavel", "");
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de alunos"));
                    
                    response.sendRedirect("student");
                }
                ;
                break;
                
                case "inscrever-aluno": {
                    
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    Escola escola = ensinoCtrl.buscaEscola(codEscola);
                    
                    List<Aluno> alunos = ensinoCtrl.listaAlunosStatus(entidade, encryptUtils.encodeString("Activo"));
                    List<Turma> turmas = ensinoCtrl.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
                    
                    request.getSession().setAttribute("alunos", alunos);
                    request.getSession().setAttribute("turmas", turmas);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário para matricular alunos"));
                    
                    response.sendRedirect("inscription");
                }
                ;
                break;
                
                case "validar-matricula": {
                    
                    AnoLectivo anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entidade);
                    Escola escola = ensinoCtrl.buscaEscola(codEscola);
                    
                    List<Aluno> alunos = ensinoCtrl.listaAlunosStatus(entidade, encryptUtils.encodeString("Por Validar"));
                    List<Turma> turmas = ensinoCtrl.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
                    
                    request.getSession().setAttribute("alunos", alunos);
                    request.getSession().setAttribute("turmas", turmas);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário para validar matriculas online"));
                    
                    response.sendRedirect("inscriptions-online");
                }
                ;
                break;
                
                case "registar-aluno": {
                    
                    String nomeCompleto = getString(request.getParameter("nomeCompleto"));
                    String nome = "";
                    String apelido = "";
                    String sexo = getString(request.getParameter("sexo"));
                    String email = getString(request.getParameter("email"));
                    String bi = getString(request.getParameter("bi"));
                    String casa = getString(request.getParameter("casa"));
                    String nuit = getString(request.getParameter("nuit"));
                    String contacto = getString(request.getParameter("contacto"));
                    String endereco = getString(request.getParameter("endereco"));
                    String provincia = getString(request.getParameter("provincia"));
                    String quarteirao = getString(request.getParameter("quarteirao"));
                    String nivel = getString(request.getParameter("nivel"));
                    String ocupacao = getString(request.getParameter("ocupacao"));
                    String categoria = getString(request.getParameter("categoria"));
                    String deficiencia = getString(request.getParameter("deficiencia"));
                    String bolseiro = getString(request.getParameter("bolseiro"));
                    String dataMensalidade = request.getParameter("dataMensalidade");
                    String dataNascimento = request.getParameter("dataNascimento");
                    String documento = getString(request.getParameter("documento"));
                    String distrito = getString(request.getParameter("distrito"));
                    String responsavel = getString(request.getParameter("responsavel"));
                    String contactoResponsavel = getString(request.getParameter("contactoResponsavel"));
                    String condicao = getString(request.getParameter("condicao"));
                    String fotos = getString(request.getParameter("fotos"));
                    String certificado = getString(request.getParameter("certificado"));
                    String copiaBI = getString(request.getParameter("copiaBI"));
                    
                    String validadeDocumento = getString(request.getParameter("validadeDocumento"));
                    String nomeMae = getString(request.getParameter("nomeMae"));
                    String profissaoMae = getString(request.getParameter("profissaoMae"));
                    String contactoMae = getString(request.getParameter("contactoMae"));
                    String trabalhoMae = getString(request.getParameter("trabalhoMae"));
                    
                    String nomePai = getString(request.getParameter("nomePai"));
                    String profissaoPai = getString(request.getParameter("profissaoPai"));
                    String contactoPai = getString(request.getParameter("contactoPai"));
                    String trabalhoPai = getString(request.getParameter("trabalhoPai"));
                    
                    StringTokenizer st2 = new StringTokenizer(nomeCompleto);
                    
                    Escola escola = ensinoCtrl.buscaEscola(codEscola);
                    
                    int i = 0;
                    while (st2.hasMoreElements()) {
                        
                        if (st2.countTokens() - 1 == i) {
                            apelido = st2.nextToken();
                        } else {
                            nome += st2.nextToken() + " ";
                        }
                    }
                    
                    if (!nome.isEmpty()) {
                        nome = nome.substring(0, nome.length() - 1);
                    }
                    
                    String msgErro = "[ESTUDANTE] : " + nome + " " + apelido + ", "
                            + "adicionado com sucesso.";
                    String alerta = "bg-success";
                    
                    Pessoa pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                    
                    boolean ft = false;
                    boolean cer = false;
                    boolean cbi = false;
                    
                    if (!fotos.equals("N/D")) {
                        ft = true;
                    }
                    
                    if (!certificado.equals("N/D")) {
                        cer = true;
                    }
                    
                    if (!copiaBI.equals("N/D")) {
                        cbi = true;
                    }
                    
                    if (pessoa != null) {
                        msgErro = "[ESTUDANTE] : " + nome + " " + apelido + ", "
                                + "já existe no sistema.";
                        
                        alerta = "bg-warning";
                    } else {
                        
                        GregorianCalendar gc = new GregorianCalendar();
                        gc.setGregorianChange(new Date());
                        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);
                        
                        Nacionalidade nasc = gestaoCtrl.buscarNacionalidadeDescricao("TW/Dp2FtYmljYW5h");
                        
                        String password = (nome.charAt(0) + "" + stringUtils.unaccent(apelido)).toLowerCase();
                        pessoa = new Pessoa();
                        pessoa.setEncrypted(true);
                        pessoa.setPessDataCadastro(calendar);
                        pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                        pessoa.setPessNome(encryptUtils.encodeString(nome));
                        pessoa.setPessEmail(encryptUtils.encodeString(email));
                        pessoa.setPessSexo(encryptUtils.encodeString(sexo));
                        pessoa.setNacionalidadenaci(nasc);
                        pessoa.setPessBairro(encryptUtils.encodeString(endereco));
                        pessoa.setPessContacto(encryptUtils.encodeString(contacto));
                        pessoa.setPessFoto(encryptUtils.encodeString((password + ".jpg").toLowerCase()));
                        pessoa.setEntidade(entidade);
                        pessoa.setPessRua(encryptUtils.encodeString(quarteirao));
                        pessoa.setPessNumeroCasa(encryptUtils.encodeString(casa));
                        pessoa.setPessProvincia(encryptUtils.encodeString(provincia));
                        pessoa.setPessBi(encryptUtils.encodeString(bi));
                        pessoa.setPessNuit(encryptUtils.encodeString(nuit));
                        pessoa.setPessDocumento(encryptUtils.encodeString(documento));
                        pessoa.setPessDistrito(encryptUtils.encodeString(distrito));
                        pessoa.setPessDataNascimento(getDate(dataNascimento));
                        
                        pessoa.setPessDataValidadeBi(encryptUtils.encodeString(validadeDocumento));
                        pessoa.setPessResponsavel(encryptUtils.encodeString(responsavel));
                        
                        pessoa.setPessNomeMae(encryptUtils.encodeString(nomeMae));
                        pessoa.setPessProfissaoMae(encryptUtils.encodeString(profissaoMae));
                        pessoa.setPessContactoMae(encryptUtils.encodeString(contactoMae));
                        pessoa.setPessTrabalhoMae(encryptUtils.encodeString(trabalhoMae));
                        
                        pessoa.setPessNomePai(encryptUtils.encodeString(nomePai));
                        pessoa.setPessProfissaoPai(encryptUtils.encodeString(profissaoPai));
                        pessoa.setPessContactoPai(encryptUtils.encodeString(contactoPai));
                        pessoa.setPessTrabalhoPai(encryptUtils.encodeString(trabalhoPai));
                        
                        pessoa.setPessActividade(encryptUtils.encodeString(ocupacao));
                        
                        pessoa.setPessAltura((float) 0);
                        pessoa.setPessEducacao("");
                        pessoa.setPessEstadoCivil("");
                        pessoa.setPessGeneroActividae("");
                        pessoa.setPessGeneroAlimentacao("");
                        pessoa.setPessGeneroBebida("");
                        pessoa.setPessGeneroCultura("");
                        pessoa.setPessGeneroEntretenimento("");
                        pessoa.setPessGeneroMusica("");
                        pessoa.setPessHobbie("");
                        pessoa.setPessLingua("");
                        pessoa.setPessRaca("");
                        pessoa.setPessRelegiao("");
                        pessoa.setPessOrigemRegisto("Sistema");
                        pessoa.setPessSinais("");
                        pessoa.setPessSkills("");
                        pessoa.setPessSobre("");
                        pessoa.setPessTipo(encryptUtils.encodeString("Estudante"));
                        pessoa.setPessVicios("");
                        pessoa.setPessPais("");
                        
                        gestaoCtrl.persistirPessoa(pessoa);
                        
                        pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                        
                        data.le_hora();
                        
                        escola.setEscAlunos(escola.getEscAlunos() + 1);
                        
                        if (sexo.equals("Masculino")) {
                            escola.setEscAlunosHomens(escola.getEscAlunosHomens() + 1);
                        } else {
                            escola.setEscAlunosMulheres(escola.getEscAlunosMulheres() + 1);
                        }
                        
                        ensinoCtrl.persistirEscola(escola);
                        
                        String anoBagde = data.getAno();
                        
                        String anoTrim = anoBagde.substring(anoBagde.length() - 2, anoBagde.length());
                        
                        String badgenumber = utilitariosCtrl.buscaBadgeNumber(anoTrim + "00", escola.getEscAlunos());
                        
                        Aluno aluno = new Aluno();
                        aluno.setAlunBadgnumber(encryptUtils.encodeString(badgenumber));
                        aluno.setAlunDataInscricao(null);
                        aluno.setAlunStatus(encryptUtils.encodeString("Activo"));
                        aluno.setEncrypted(true);
                        aluno.setEntidade(entidade);
                        aluno.setPessoa(pessoa);
                        aluno.setAlunBolseiro(encryptUtils.encodeString(bolseiro));
                        aluno.setAlunNivel(encryptUtils.encodeString(nivel));
                        aluno.setAlunCategoria(encryptUtils.encodeString(categoria));
                        aluno.setAlunDeficiente(true);
                        if (deficiencia.equals("Não")) {
                            aluno.setAlunDeficiente(false);
                        }
                        
                        ensinoCtrl.persistirAluno(aluno);
                        
                        TipoUsuario tipoUsuario = controleAcessoCtrl.buscaTipoUsuarioDescricao("Estudante");
                        
                        Usuario usuarioCliente = new Usuario();
                        usuarioCliente.setEntidade(entidade);
                        usuarioCliente.setPessoapess(pessoa);
                        usuarioCliente.setUsuaSenha(encryptUtils.encodeString(password));
                        usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(badgenumber));
                        usuarioCliente.setUsuaCodigoRegistro(entidade.getEntiSigla() + "#0" + entidade.getEntiId());
                        usuarioCliente.setUsuaEstado("Activo");
                        usuarioCliente.setUsuaOnline("Offline");
                        usuarioCliente.setUsuaStatus("Offline");
                        usuarioCliente.setUsuaPresenca(false);
                        usuarioCliente.setUsuaTentativasLogin(0);
                        usuarioCliente.setTipoUsuariotipu(tipoUsuario);
                        usuarioCliente.setUsuaStatusicon("offline.png");
                        usuarioCliente.setUsuaDevice("");
                        usuarioCliente.setEncrypted(true);
                        usuarioCliente.setUsuaFotoperfil("generic-user.png");
                        
                        controleAcessoCtrl.persistirUsuario(usuarioCliente);
                        
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso o estudante com o nome: " + (nome + " " + apelido)));
                        
                        nome = "";
                        apelido = "";
                        sexo = "";
                        email = "";
                        bi = "";
                        casa = "";
                        nuit = "";
                        contacto = "";
                        endereco = "";
                        provincia = "";
                        quarteirao = "";
                        nivel = "";
                        bolseiro = "";
                        ocupacao = "";
                        documento = "";
                        distrito = "";
                        responsavel = "";
                        contactoResponsavel = "";
                        deficiencia = "";
                        categoria = "";
                        condicao = "";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    request.getSession().setAttribute("nome", nome);
                    request.getSession().setAttribute("apelido", apelido);
                    request.getSession().setAttribute("email", email);
                    request.getSession().setAttribute("bi", bi);
                    request.getSession().setAttribute("casa", casa);
                    request.getSession().setAttribute("nuit", nuit);
                    request.getSession().setAttribute("categoria", categoria);
                    request.getSession().setAttribute("deficiencia", deficiencia);
                    request.getSession().setAttribute("contacto", contacto);
                    request.getSession().setAttribute("endereco", endereco);
                    request.getSession().setAttribute("quarteirao", quarteirao);
                    request.getSession().setAttribute("especialidade", bolseiro);
                    request.getSession().setAttribute("ocupacao", ocupacao);
                    request.getSession().setAttribute("nivel", nivel);
                    request.getSession().setAttribute("sexo", sexo);
                    request.getSession().setAttribute("provincia", provincia);
                    request.getSession().setAttribute("documento", documento);
                    request.getSession().setAttribute("distrito", distrito);
                    request.getSession().setAttribute("responsavel", responsavel);
                    request.getSession().setAttribute("contactoResponsavel", contactoResponsavel);
                    request.getSession().setAttribute("condicao", condicao);
                    request.getSession().setAttribute("aluno", null);
                    request.getSession().setAttribute("inscricao", null);
                    
                    response.sendRedirect("student");
                }
                ;
                break;
                
                case "remover-aluno": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    
                    Aluno aluno = ensinoCtrl.buscaAlunoId(id);
                    List<Notas> notas = ensinoCtrl.listaNotasAluno(entidade, aluno);
                    
                    String msgErro = "Estudante "
                            + "não pode ser removido. "
                            + "Desassocie registos ligados ao centro.";
                    
                    String alerta = "bg-warning";
                    
                    String badgenumber = encryptUtils.decodeString(aluno.getAlunBadgnumber());
                    
                    if (notas.isEmpty()) {
                        
                        aluno.setAlunStatus(encryptUtils.encodeString("Removido"));
                        ensinoCtrl.persistirAluno(aluno);
                        // ensinoCtrl.removerAluno(aluno);

                        List<Aluno> alunos = ensinoCtrl.listaAlunos(entidade);
                        List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                        
                        request.getSession().setAttribute("alunos", alunos);
                        request.getSession().setAttribute("turmas", turmas);
                        
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o estudante com id:  " + badgenumber));
                        msgErro = "Formador "
                                + "removido com sucesso";
                        
                        alerta = "bg-success";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("aluno", null);
                    request.getSession().setAttribute("inscricao", null);
                    
                    response.sendRedirect("student");
                    
                }
                ;
                break;
                
                case "editar-aluno": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    
                    Aluno aluno = ensinoCtrl.buscaAlunoId(id);
                    
                    Inscricao inscricao = null;
                    
                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesAluno(entidade, aluno);
                    
                    if (!inscricoes.isEmpty()) {
                        inscricao = inscricoes.get(0);
                    }
                    
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição o contracto com o id: " + id));
                    
                    request.getSession().setAttribute("aluno", aluno);
                    request.getSession().setAttribute("inscricao", inscricao);
                    
                    response.sendRedirect("student");
                }
                ;
                break;
                
                case "actualizar-aluno": {
                    
                    String nomeCompleto = getString(request.getParameter("nomeCompleto"));
                    String nome = "";
                    String apelido = "";
                    String sexo = getString(request.getParameter("sexo"));
                    String email = getString(request.getParameter("email"));
                    String bi = getString(request.getParameter("bi"));
                    String casa = getString(request.getParameter("casa"));
                    String nuit = getString(request.getParameter("nuit"));
                    String contacto = getString(request.getParameter("contacto"));
                    String endereco = getString(request.getParameter("endereco"));
                    String provincia = getString(request.getParameter("provincia"));
                    String quarteirao = getString(request.getParameter("quarteirao"));
                    String nivel = getString(request.getParameter("nivel"));
                    String categoria = getString(request.getParameter("categoria"));
                    String deficiencia = getString(request.getParameter("deficiencia"));
                    String ocupacao = getString(request.getParameter("ocupacao"));
                    String documento = getString(request.getParameter("documento"));
                    String distrito = getString(request.getParameter("distrito"));
                    String bolseiro = getString(request.getParameter("bolseiro"));
                    String dataNascimento = getString(request.getParameter("dataNascimento"));
                    String responsavel = getString(request.getParameter("responsavel"));
                    String contactoResponsavel = getString(request.getParameter("contactoResponsavel"));
                    
                    String fotos = getString(request.getParameter("fotos"));
                    String certificado = getString(request.getParameter("certificado"));
                    String copiaBI = getString(request.getParameter("copiaBI"));
                    
                    String validadeDocumento = getString(request.getParameter("validadeDocumento"));
                    String nomeMae = getString(request.getParameter("nomeMae"));
                    String profissaoMae = getString(request.getParameter("profissaoMae"));
                    String contactoMae = getString(request.getParameter("contactoMae"));
                    String trabalhoMae = getString(request.getParameter("trabalhoMae"));
                    
                    String nomePai = getString(request.getParameter("nomePai"));
                    String profissaoPai = getString(request.getParameter("profissaoPai"));
                    String contactoPai = getString(request.getParameter("contactoPai"));
                    String trabalhoPai = getString(request.getParameter("trabalhoPai"));
                    
                    StringTokenizer st2 = new StringTokenizer(nomeCompleto);
                    
                    int i = 0;
                    while (st2.hasMoreElements()) {
                        
                        if (st2.countTokens() - 1 == i) {
                            apelido = st2.nextToken();
                        } else {
                            nome += st2.nextToken() + " ";
                        }
                    }
                    
                    if (!nome.isEmpty()) {
                        nome = nome.substring(0, nome.length() - 1);
                    }
                    
                    boolean ft = false;
                    boolean cer = false;
                    boolean cbi = false;
                    
                    if (!fotos.equals("N/D")) {
                        ft = true;
                    }
                    
                    if (!certificado.equals("N/D")) {
                        cer = true;
                    }
                    
                    if (!copiaBI.equals("N/D")) {
                        cbi = true;
                    }
                    
                    String msgErro = "Dados do estudante alterados com sucesso.";
                    String alerta = "bg-success";
                    
                    Aluno aluno = (Aluno) request.getSession().getAttribute("aluno");
                    
                    aluno.setAlunBolseiro(encryptUtils.encodeString(bolseiro));
                    aluno.setAlunNivel(encryptUtils.encodeString(nivel));
                    aluno.setAlunCategoria(encryptUtils.encodeString(categoria));
                    
                    if (deficiencia.equals("Não")) {
                        aluno.setAlunDeficiente(false);
                    } else {
                        aluno.setAlunDeficiente(true);
                    }
                    
                    ensinoCtrl.persistirAluno(aluno);
                    
                    String badgenumber = encryptUtils.decodeString(aluno.getAlunBadgnumber());
                    
                    Pessoa pessoa = aluno.getPessoa();
                    
                    String nomePess = encryptUtils.decodeString(pessoa.getPessNome());
                    String apelidoPess = encryptUtils.decodeString(pessoa.getPessApelido());
                    
                    if (nomePess.equals(nome) && apelidoPess.equals(apelido)) {
                        
                        String password = (nome.charAt(0) + "" + stringUtils.unaccent(apelido)).toLowerCase();
                        
                        pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                        pessoa.setPessNome(encryptUtils.encodeString(nome));
                        pessoa.setPessEmail(encryptUtils.encodeString(email));
                        pessoa.setPessSexo(encryptUtils.encodeString(sexo));
                        pessoa.setPessBairro(encryptUtils.encodeString(endereco));
                        pessoa.setPessContacto(encryptUtils.encodeString(contacto));
                        pessoa.setPessFoto(encryptUtils.encodeString((password + ".jpg").toLowerCase()));
                        pessoa.setEntidade(entidade);
                        pessoa.setPessRua(encryptUtils.encodeString(quarteirao));
                        pessoa.setPessNumeroCasa(encryptUtils.encodeString(casa));
                        pessoa.setPessProvincia(encryptUtils.encodeString(provincia));
                        pessoa.setPessBi(encryptUtils.encodeString(bi));
                        pessoa.setPessDocumento(encryptUtils.encodeString(documento));
                        pessoa.setPessDistrito(encryptUtils.encodeString(distrito));
                        pessoa.setPessNuit(encryptUtils.encodeString(nuit));
                        pessoa.setPessActividade(encryptUtils.encodeString(ocupacao));
                        pessoa.setPessDataNascimento(getDate(dataNascimento));
                        
                        pessoa.setPessDataValidadeBi(encryptUtils.encodeString(validadeDocumento));
                        pessoa.setPessResponsavel(encryptUtils.encodeString(responsavel));
                        
                        pessoa.setPessNomeMae(encryptUtils.encodeString(nomeMae));
                        pessoa.setPessProfissaoMae(encryptUtils.encodeString(profissaoMae));
                        pessoa.setPessContactoMae(encryptUtils.encodeString(contactoMae));
                        pessoa.setPessTrabalhoMae(encryptUtils.encodeString(trabalhoMae));
                        
                        pessoa.setPessNomePai(encryptUtils.encodeString(nomePai));
                        pessoa.setPessProfissaoPai(encryptUtils.encodeString(profissaoPai));
                        pessoa.setPessContactoPai(encryptUtils.encodeString(contactoPai));
                        pessoa.setPessTrabalhoPai(encryptUtils.encodeString(trabalhoPai));
                        
                        pessoa.setPessActividade(encryptUtils.encodeString(ocupacao));
                        gestaoCtrl.persistirPessoa(pessoa);
                        Usuario usuarioCliente = controleAcessoCtrl.buscarUsuario(aluno.getAlunBadgnumber());
                        
                        if (usuarioCliente != null) {
                            usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(badgenumber));
                            usuarioCliente.setUsuaSenha(encryptUtils.encodeString(password));
                            
                            controleAcessoCtrl.persistirUsuario(usuarioCliente);
                        }
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso o estudante com o id : " + badgenumber));
                        
                        List<Aluno> alunos = ensinoCtrl.listaAlunos(entidade);
                        
                        request.getSession().setAttribute("alunos", alunos);
                        
                    } else {
                        
                        Pessoa pessoaCheck = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                        
                        if (pessoaCheck != null) {
                            
                            msgErro = "Já existe um estudante com o nome indicado.";
                            alerta = "bg-warning";
                        } else {
                            
                            String password = (nome.charAt(0) + "" + stringUtils.unaccent(apelido)).toLowerCase();
                            
                            pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                            pessoa.setPessNome(encryptUtils.encodeString(nome));
                            pessoa.setPessEmail(encryptUtils.encodeString(email));
                            pessoa.setPessSexo(encryptUtils.encodeString(sexo));
                            pessoa.setPessBairro(encryptUtils.encodeString(endereco));
                            pessoa.setPessContacto(encryptUtils.encodeString(contacto));
                            pessoa.setPessFoto(encryptUtils.encodeString((password + ".jpg").toLowerCase()));
                            pessoa.setEntidade(entidade);
                            pessoa.setPessRua(encryptUtils.encodeString(quarteirao));
                            pessoa.setPessNumeroCasa(encryptUtils.encodeString(casa));
                            pessoa.setPessProvincia(encryptUtils.encodeString(provincia));
                            pessoa.setPessBi(encryptUtils.encodeString(bi));
                            pessoa.setPessNuit(encryptUtils.encodeString(nuit));
                            
                            gestaoCtrl.persistirPessoa(pessoa);
                            Usuario usuarioCliente = controleAcessoCtrl.buscarUsuario(aluno.getAlunBadgnumber());
                            
                            if (usuarioCliente == null) {
                                
                                TipoUsuario tipoUsuario = controleAcessoCtrl.buscaTipoUsuarioDescricao("Estudante");
                                
                                usuarioCliente = new Usuario();
                                usuarioCliente.setEntidade(entidade);
                                usuarioCliente.setPessoapess(pessoa);
                                usuarioCliente.setUsuaSenha(encryptUtils.encodeString(password));
                                usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(badgenumber));
                                usuarioCliente.setUsuaCodigoRegistro(entidade.getEntiSigla() + "#0" + entidade.getEntiId());
                                usuarioCliente.setUsuaEstado("Inactivo");
                                usuarioCliente.setUsuaOnline("Offline");
                                usuarioCliente.setUsuaStatus("Offline");
                                usuarioCliente.setUsuaPresenca(false);
                                usuarioCliente.setUsuaTentativasLogin(0);
                                usuarioCliente.setTipoUsuariotipu(tipoUsuario);
                                usuarioCliente.setUsuaStatusicon("offline.png");
                                usuarioCliente.setUsuaDevice("");
                                usuarioCliente.setEncrypted(true);
                                
                                usuarioCliente.setUsuaFotoperfil("generic-user.png");
                            }
                            
                            controleAcessoCtrl.persistirUsuario(usuarioCliente);
                            
                            controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso o estudante com o id : " + badgenumber));
                            
                        }
                    }
                    
                    request.getSession().setAttribute("aluno", aluno);
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("student");
                }
                ;
                break;
                
                case "cancelar-edicao": {
                    
                    List<Aluno> alunos = (List<Aluno>) request.getSession().getAttribute("alunos");
                    
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    
                    request.getSession().setAttribute("alunos", alunos);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("aluno", null);
                    request.getSession().setAttribute("inscricao", null);
                    request.getSession().setAttribute("nome", "");
                    request.getSession().setAttribute("apelido", "");
                    request.getSession().setAttribute("email", "");
                    request.getSession().setAttribute("bi", "");
                    request.getSession().setAttribute("casa", "");
                    request.getSession().setAttribute("nuit", "");
                    request.getSession().setAttribute("contacto", "");
                    request.getSession().setAttribute("endereco", "");
                    request.getSession().setAttribute("quarteirao", "");
                    request.getSession().setAttribute("nivel", "");
                    request.getSession().setAttribute("ocupacao", "");
                    request.getSession().setAttribute("sexo", "");
                    request.getSession().setAttribute("deficiencia", "");
                    request.getSession().setAttribute("categoria", "");
                    request.getSession().setAttribute("bolseiro", "");
                    request.getSession().setAttribute("provincia", "");
                    request.getSession().setAttribute("documento", "");
                    request.getSession().setAttribute("distrito", "");
                    request.getSession().setAttribute("responsavel", "");
                    request.getSession().setAttribute("contactoResponsavel", "");
                    
                    response.sendRedirect("student");
                }
                ;
                break;
                
                case "ficha-aluno": {
                    
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    String to = st.nextToken().split("=")[1];
                    
                    Aluno aluno = ensinoCtrl.buscaAlunoId(id);
                    
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    
                    if (turmas == null) {
                        turmas = ensinoCtrl.listaTurmas(entidade);
                    }
                    
                    @SuppressWarnings("UnusedAssignment")
                    Pessoa pessoa = null;
                    @SuppressWarnings("UnusedAssignment")
                    List<Inscricao> inscricoes = null;
                    @SuppressWarnings("UnusedAssignment")
                    List<Avaliacao> avaliacoes = null;
                    @SuppressWarnings("UnusedAssignment")
                    List<Notas> notas = null;
                    @SuppressWarnings("UnusedAssignment")
                    Turno turno = null;
                    int faltas = 0;
                    @SuppressWarnings("UnusedAssignment")
                    float notaMaxima = 0;
                    @SuppressWarnings("UnusedAssignment")
                    float notaMinima = 0;
                    @SuppressWarnings("UnusedAssignment")
                    float mediaActual = 0;
                    String comportamento = "Não definido";
                    @SuppressWarnings("UnusedAssignment")
                    Usuario usuarioAluno = null;
                    
                    Turma turma = null;
                    
                    turno = ensinoCtrl.buscaTurnoId(id);
                    pessoa = aluno.getPessoa();
                    
                    usuarioAluno = controleAcessoCtrl.buscarUsuario(aluno.getAlunBadgnumber());
                    
                    inscricoes = ensinoCtrl.listaInscricoesAluno(entidade, aluno);
                    avaliacoes = ensinoCtrl.listaAvaliacoesAluno(entidade, aluno);
                    notas = ensinoCtrl.listaNotasAluno(entidade, aluno);
                    
                    if (avaliacoes != null) {
                        if (!avaliacoes.isEmpty()) {
                            comportamento = avaliacoes.get(0).getAvalComportamento();
                        }
                    }
                    
                    if (inscricoes != null) {
                        
                        if (!inscricoes.isEmpty()) {
                            Inscricao inscricao = inscricoes.get(inscricoes.size() - 1);
                            
                            request.getSession().setAttribute("inscricao", inscricao);
                            turma = inscricao.getTurma();
                        }
                    }
                    
                    notaMaxima = getMaximaNota(notas);
                    notaMinima = getMinimaNota(notas);
                    mediaActual = getMediaActual(notas);
                    
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    
                    String semestre = "1º TRIMESTRE";
                    
                    data.le_hora();
                    
                    int mes = Integer.parseInt(data.getMes());
                    
                    if (mes > 6) {
                        semestre = "2º TRIMESTRE";
                    }
                    
                    if (turma != null) {
                        List<Agenda> agendas = ensinoCtrl.listaAgendaTurmaSemestre(entidade, anoLectivo, encryptUtils.encodeString(semestre), turma);
                        
                        List<HCal> hCals = fillCalendar(agendas, semestre);
                        
                        request.getSession().setAttribute("agendas", agendas);
                        request.getSession().setAttribute("hCals", hCals);
                    }
                    
                    request.getSession().setAttribute("usuarioAluno", usuarioAluno);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("semestre", semestre);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("turno", turno);
                    request.getSession().setAttribute("notas", notas);
                    request.getSession().setAttribute("aluno", aluno);
                    request.getSession().setAttribute("faltas", faltas);
                    request.getSession().setAttribute("comportamento", comportamento);
                    request.getSession().setAttribute("notaMaxima", notaMaxima);
                    request.getSession().setAttribute("notaMinima", notaMinima);
                    request.getSession().setAttribute("mediaActual", mediaActual);
                    
                    if (pessoa != null) {
                        request.getSession().setAttribute("pagamentos", contabilidadeCtrl.listaPagamentosCliente(entidade, pessoa));
                    }
                    
                    String badgnumber = encryptUtils.decodeString(aluno.getAlunBadgnumber());
                    
                    String msg = "Visualizou a ficha do aluno com o numero: " + badgnumber;
                    
                    if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Aluno")) {
                        msg = "O aluno com o numero " + badgnumber + " visualizou a sua ficha";
                    }
                    controleAcessoCtrl.persistirLog(addLog(usuario, msg));
                    
                    if (!to.equals("portal")) {
                        response.sendRedirect("student-file");
                    } else {
                        response.sendRedirect("student-dashboard");
                    }
                }
                ;
                break;
                
                case "imprimir-certificado": {
                    
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    
                    Aluno aluno = ensinoCtrl.buscaAlunoId(id);
                    
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    
                    data.le_hora();
                    String ano = data.getAno();
                    
                    if (anoLectivo == null) {
                        anoLectivo = ensinoCtrl.buscaAnoLectivoDescricao(entidade, encryptUtils.encodeString(ano));
                    }
                    
                    String semestre = "1º TRIMESTRE";
                    
                    Inscricao inscricao = ensinoCtrl.buscaInscricaoAnoLectivoSemestre(entidade, anoLectivo, encryptUtils.encodeString(semestre), aluno);
                    
                    List<Notas> notas = ensinoCtrl.listaNotasAluno(entidade, aluno);
                    
                    request.getSession().setAttribute("inscricao", inscricao);
                    request.getSession().setAttribute("notas", notas);
                    request.getSession().setAttribute("aluno", aluno);
                    
                    response.sendRedirect("print-certificate");
                }
                ;
                break;
                
                case "imprimir-pagamentos": {
                    
                    request.getSession().setAttribute("aluno", (Aluno) request.getSession().getAttribute("aluno"));
                    request.getSession().setAttribute("pagamentos", (List<Pagamento>) request.getSession().getAttribute("pagamentos"));
                    response.sendRedirect("print-extract-student");
                }
                ;
                break;
                
                case "imprimir-alunos": {
                    
                    request.getSession().setAttribute("alunos", (List<Aluno>) request.getSession().getAttribute("alunos"));
                    response.sendRedirect("print-student");
                }
                ;
                break;
                
                case "alertar-status-aluno": {
                    
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    String to = st.nextToken().split("=")[1];
                    
                    Aluno aluno = ensinoCtrl.buscaAlunoId(id);
                    
                    aluno.setAlunStatus(encryptUtils.encodeString(to));
                    
                    ensinoCtrl.persistirAluno(aluno);
                    
                    Usuario usuarioAluno = controleAcessoCtrl.buscarUsuario(aluno.getAlunBadgnumber());
                    
                    if (to.equals("Regular")) {
                        if (usuarioAluno != null) {
                            usuarioAluno.setUsuaStatus("Activo");
                            
                            controleAcessoCtrl.persistirUsuario(usuario);
                        }
                    } else {
                        if (usuarioAluno != null) {
                            usuarioAluno.setUsuaStatus("Inactivo");
                            
                            controleAcessoCtrl.persistirUsuario(usuario);
                        }
                    }
                    
                    String msgErro = "Estado do estudante alterado com sucesso";
                    String alerta = "bg-success";
                    
                    List<Aluno> alunos = ensinoCtrl.listaAlunos(entidade);
                    
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou o estado do estudante com id: " + id + " para: " + to));
                    
                    request.getSession().setAttribute("alunos", alunos);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("student");
                }
                ;
                break;
                
                case "matriculados": {
                    response.sendRedirect("SW5zY3JpY2FvU2VydmxldCNEQ0k=?YWNjYW8jaW5zY3JpY29lcw==");
                }
                ;
                break;
                
                case "pre-registo": {
                    
                    AnoLectivo anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entidade);
                    Escola escola = ensinoCtrl.buscaEscola(codEscola);
                    List<Turma> turmas = ensinoCtrl.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
                    
                    request.getSession().setAttribute("aluno", null);
                    request.getSession().setAttribute("inscricao", null);
                    request.getSession().setAttribute("nome", "");
                    request.getSession().setAttribute("apelido", "");
                    request.getSession().setAttribute("email", "");
                    request.getSession().setAttribute("bi", "");
                    request.getSession().setAttribute("casa", "");
                    request.getSession().setAttribute("nuit", "");
                    request.getSession().setAttribute("contacto", "");
                    request.getSession().setAttribute("endereco", "");
                    request.getSession().setAttribute("quarteirao", "");
                    request.getSession().setAttribute("nivel", "");
                    request.getSession().setAttribute("ocupacao", "");
                    request.getSession().setAttribute("sexo", "");
                    request.getSession().setAttribute("deficiencia", "");
                    request.getSession().setAttribute("categoria", "");
                    request.getSession().setAttribute("bolseiro", "");
                    request.getSession().setAttribute("provincia", "");
                    request.getSession().setAttribute("documento", "");
                    request.getSession().setAttribute("distrito", "");
                    request.getSession().setAttribute("responsavel", "");
                    request.getSession().setAttribute("contactoResponsavel", "");
                    request.getSession().setAttribute("turmas", turmas);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de alunos"));
                    
                    response.sendRedirect("student-register");
                }
                ;
                break;
                
                case "registar-aluno-online": {
                    
                    String nomeCompleto = getString(request.getParameter("nomeCompleto"));
                    String nome = "";
                    String apelido = "";
                    String sexo = getString(request.getParameter("sexo"));
                    String email = getString(request.getParameter("email"));
                    String bi = getString(request.getParameter("bi"));
                    String casa = getString(request.getParameter("casa"));
                    String nuit = getString(request.getParameter("nuit"));
                    String contacto = getString(request.getParameter("contacto"));
                    String endereco = getString(request.getParameter("endereco"));
                    String provincia = getString(request.getParameter("provincia"));
                    String quarteirao = getString(request.getParameter("quarteirao"));
                    String nivel = getString(request.getParameter("nivel"));
                    String ocupacao = getString(request.getParameter("ocupacao"));
                    String categoria = getString(request.getParameter("categoria"));
                    String deficiencia = getString(request.getParameter("deficiencia"));
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));
                    String bolseiro = getString(request.getParameter("bolseiro"));
                    String dataMensalidade = request.getParameter("dataMensalidade");
                    String dataNascimento = request.getParameter("dataNascimento");
                    String documento = getString(request.getParameter("documento"));
                    String distrito = getString(request.getParameter("distrito"));
                    String responsavel = getString(request.getParameter("responsavel"));
                    String contactoResponsavel = getString(request.getParameter("contactoResponsavel"));
                    String pagamento = getString(request.getParameter("pagamento"));
                    String condicao = getString(request.getParameter("condicao"));
                    String fotos = getString(request.getParameter("fotos"));
                    String certificado = getString(request.getParameter("certificado"));
                    String copiaBI = getString(request.getParameter("copiaBI"));
                    
                    StringTokenizer st2 = new StringTokenizer(nomeCompleto);
                    
                    int i = 0;
                    while (st2.hasMoreElements()) {
                        
                        if (st2.countTokens() - 1 == i) {
                            apelido = st2.nextToken();
                        } else {
                            nome += st2.nextToken() + " ";
                        }
                    }
                    
                    if (!nome.isEmpty()) {
                        nome = nome.substring(0, nome.length() - 1);
                    }
                    
                    String msgErro = "Pedido de Matricula adicionado com sucesso.";
                    String alerta = "bg-success";
                    
                    Pessoa pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                    
                    boolean ft = false;
                    boolean cer = false;
                    boolean cbi = false;
                    
                    if (!fotos.equals("N/D")) {
                        ft = true;
                    }
                    
                    if (!certificado.equals("N/D")) {
                        cer = true;
                    }
                    
                    if (!copiaBI.equals("N/D")) {
                        cbi = true;
                    }
                    
                    if (pessoa != null) {
                        msgErro = "[ESTUDANTE] : " + nome + " " + apelido + ", "
                                + "já existe no sistema.";
                        
                        alerta = "bg-warning";
                    } else {
                        
                        GregorianCalendar gc = new GregorianCalendar();
                        gc.setGregorianChange(new Date());
                        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);
                        
                        XMLGregorianCalendar calendarInscricao = calendar;
                        
                        Nacionalidade nasc = gestaoCtrl.buscarNacionalidadeDescricao("TW/Dp2FtYmljYW5h");
                        
                        List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                        Turma turma = getTurma(turmas, idTurma);
                        
                        String password = (nome.charAt(0) + "" + stringUtils.unaccent(apelido)).toLowerCase();
                        pessoa = new Pessoa();
                        pessoa.setEncrypted(true);
                        pessoa.setPessDataCadastro(calendar);
                        pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                        pessoa.setPessNome(encryptUtils.encodeString(nome));
                        pessoa.setPessEmail(encryptUtils.encodeString(email));
                        pessoa.setPessSexo(encryptUtils.encodeString(sexo));
                        pessoa.setNacionalidadenaci(nasc);
                        pessoa.setPessBairro(encryptUtils.encodeString(endereco));
                        pessoa.setPessContacto(encryptUtils.encodeString(contacto));
                        pessoa.setPessFoto(encryptUtils.encodeString((password + ".jpg").toLowerCase()));
                        pessoa.setEntidade(entidade);
                        pessoa.setPessRua(encryptUtils.encodeString(quarteirao));
                        pessoa.setPessNumeroCasa(encryptUtils.encodeString(casa));
                        pessoa.setPessProvincia(encryptUtils.encodeString(provincia));
                        pessoa.setPessBi(encryptUtils.encodeString(bi));
                        pessoa.setPessNuit(encryptUtils.encodeString(nuit));
                        pessoa.setPessDocumento(encryptUtils.encodeString(documento));
                        pessoa.setPessDistrito(encryptUtils.encodeString(distrito));
                        pessoa.setPessDataNascimento(getDate(dataNascimento));
                        
                        pessoa.setPessActividade(encryptUtils.encodeString(ocupacao));
                        pessoa.setPessAltura((float) 0);
                        pessoa.setPessEducacao("");
                        pessoa.setPessEstadoCivil("");
                        pessoa.setPessGeneroActividae("");
                        pessoa.setPessGeneroAlimentacao("");
                        pessoa.setPessGeneroBebida("");
                        pessoa.setPessGeneroCultura("");
                        pessoa.setPessGeneroEntretenimento("");
                        pessoa.setPessGeneroMusica("");
                        pessoa.setPessHobbie("");
                        pessoa.setPessLingua("");
                        pessoa.setPessNomeMae(encryptUtils.encodeString(contactoResponsavel));
                        pessoa.setPessRaca("");
                        pessoa.setPessRelegiao("");
                        pessoa.setPessOrigemRegisto("Sistema");
                        pessoa.setPessSinais("");
                        pessoa.setPessSkills("");
                        pessoa.setPessSobre("");
                        pessoa.setPessTipo(encryptUtils.encodeString("Estudante"));
                        pessoa.setPessVicios("");
                        pessoa.setPessNomePai(encryptUtils.encodeString(responsavel));
                        pessoa.setPessPais("");
                        
                        gestaoCtrl.persistirPessoa(pessoa);
                        
                        pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                        
                        Aluno aluno = new Aluno();
                        aluno.setAlunDataInscricao(calendarInscricao);
                        aluno.setAlunStatus(encryptUtils.encodeString("Por Validar"));
                        aluno.setEncrypted(true);
                        aluno.setEntidade(entidade);
                        aluno.setPessoa(pessoa);
                        aluno.setAlunBolseiro(encryptUtils.encodeString(bolseiro));
                        aluno.setAlunNivel(encryptUtils.encodeString(nivel));
                        aluno.setAlunCategoria(encryptUtils.encodeString(categoria));
                        aluno.setAlunDeficiente(true);
                        aluno.setTurma(turma);
                        if (deficiencia.equals("Não")) {
                            aluno.setAlunDeficiente(false);
                        }
                        
                        ensinoCtrl.persistirAluno(aluno);
                        
                        nome = "";
                        apelido = "";
                        sexo = "";
                        email = "";
                        bi = "";
                        casa = "";
                        nuit = "";
                        contacto = "";
                        endereco = "";
                        provincia = "";
                        quarteirao = "";
                        nivel = "";
                        bolseiro = "";
                        ocupacao = "";
                        documento = "";
                        distrito = "";
                        responsavel = "";
                        contactoResponsavel = "";
                        deficiencia = "";
                        categoria = "";
                        condicao = "";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    request.getSession().setAttribute("nome", nome);
                    request.getSession().setAttribute("apelido", apelido);
                    request.getSession().setAttribute("email", email);
                    request.getSession().setAttribute("bi", bi);
                    request.getSession().setAttribute("casa", casa);
                    request.getSession().setAttribute("nuit", nuit);
                    request.getSession().setAttribute("categoria", categoria);
                    request.getSession().setAttribute("deficiencia", deficiencia);
                    request.getSession().setAttribute("contacto", contacto);
                    request.getSession().setAttribute("endereco", endereco);
                    request.getSession().setAttribute("quarteirao", quarteirao);
                    request.getSession().setAttribute("especialidade", bolseiro);
                    request.getSession().setAttribute("ocupacao", ocupacao);
                    request.getSession().setAttribute("nivel", nivel);
                    request.getSession().setAttribute("sexo", sexo);
                    request.getSession().setAttribute("provincia", provincia);
                    request.getSession().setAttribute("documento", documento);
                    request.getSession().setAttribute("distrito", distrito);
                    request.getSession().setAttribute("responsavel", responsavel);
                    request.getSession().setAttribute("contactoResponsavel", contactoResponsavel);
                    request.getSession().setAttribute("condicao", condicao);
                    request.getSession().setAttribute("aluno", null);
                    request.getSession().setAttribute("inscricao", null);
                    
                    response.sendRedirect("student-register");
                }
                ;
                break;
                
                case "matricular-aluno": {
                    List<Aluno> alunos = (List<Aluno>) request.getSession().getAttribute("alunos");
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    
                    int id = Integer.parseInt(request.getParameter("idAluno"));
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));
                    String semestre = "N/D";
                    
                    Turma turma = getTurma(turmas, idTurma);
                    Aluno aluno = getAluno(alunos, id);
                    String fotos = getString(request.getParameter("fotos"));
                    String certificado = getString(request.getParameter("certificado"));
                    String copiaBI = getString(request.getParameter("copiaBI"));
                    String pagamento = getString(request.getParameter("pagamento"));
                    String condicao = getString(request.getParameter("condicao"));
                    String categoria = getString(request.getParameter("categoria"));
                    
                    boolean ft = false;
                    boolean cer = false;
                    boolean cbi = false;
                    
                    if (!fotos.equals("N/D")) {
                        ft = true;
                    }
                    
                    if (!certificado.equals("N/D")) {
                        cer = true;
                    }
                    
                    if (!copiaBI.equals("N/D")) {
                        cbi = true;
                    }
                    
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    
                    String msgErro = "Aluno inscrito com sucesso";
                    String alerta = "bg-success";
                    
                    Inscricao inscricao = ensinoCtrl.buscaInscricaoAnoLectivoSemestre(entidade, anoLectivo, encryptUtils.encodeString(semestre), aluno);
                    if (inscricao == null) {
                        data.le_hora();
                        
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
                        
                        Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(data.getAno()));
                        referencia.setRefInscricoes(referencia.getRefInscricoes() + 1);
                        vendasCtrl.persistirReferencia(referencia);
                        
                        Calendar calIns = Calendar.getInstance();
                        calIns.setTime(calendar.toGregorianCalendar().getTime());
                        calIns.add(Calendar.DATE, 30);
                        
                        GregorianCalendar gcNext = new GregorianCalendar();
                        gcNext.setGregorianChange(calIns.getTime());
                        XMLGregorianCalendar calendarNext = new XMLGregorianCalendarImpl(gcNext);

                        // referencia.setRefInscricoes(referencia.getRefInscricoes() + 1);
                        String anoBagde = data.getAno();
                        
                        String anoTrim = anoBagde.substring(anoBagde.length() - 2, anoBagde.length());
                        
                        String refIns = utilitariosCtrl.buscaBadgeNumber(anoTrim + encryptUtils.decodeString(turma.getCurso().getCursCod()), referencia.getRefInscricoes());
                        
                        inscricao = new Inscricao();
                        inscricao.setAluno(aluno);
                        inscricao.setAnoLectivo(anoLectivo);
                        inscricao.setCurso(turma.getCurso());
                        inscricao.setEntidade(entidade);
                        inscricao.setInscDataInscricao(calendar);
                        inscricao.setInscDataProximoPagamento(calendarNext);
                        inscricao.setTurma(turma);
                        inscricao.setInscOrigem(encryptUtils.encodeString("Sistema"));
                        inscricao.setInscTurno(encryptUtils.encodeString("N/D"));
                        inscricao.setInscSemestre(encryptUtils.encodeString(semestre));
                        inscricao.setInscNrTransfercia(encryptUtils.encodeString(pagamento));
                        inscricao.setInscReferencia(encryptUtils.encodeString(refIns));
                        inscricao.setInscAnoLectivo(encryptUtils.encodeString(data.getAno()));
                        inscricao.setInscCondicao(encryptUtils.encodeString(condicao));
                        inscricao.setInscCategoria(aluno.getAlunCategoria());
                        
                        inscricao.setInscCertificado(cer);
                        inscricao.setInscCopiaBI(cbi);
                        inscricao.setInscFotos(ft);
                        
                        ensinoCtrl.persistirInscricao(inscricao);
                        
                        aluno.setTurma(turma);
                        ensinoCtrl.persistirAluno(aluno);
                        
                    } else {
                        msgErro = "O aluno já se encontra inscrito para essa classe";
                        alerta = "bg-warning";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("inscription");
                }
                ;
                break;
                
                case "confirma-matricula": {
                    List<Aluno> alunos = (List<Aluno>) request.getSession().getAttribute("alunos");
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));
                    String semestre = "N/D";
                    
                    Turma turma = getTurma(turmas, idTurma);
                    Aluno aluno = getAluno(alunos, id);
                    String fotos = getString(request.getParameter("fotos"));
                    String certificado = getString(request.getParameter("certificado"));
                    String copiaBI = getString(request.getParameter("copiaBI"));
                    String pagamento = getString(request.getParameter("pagamento"));
                    String condicao = getString(request.getParameter("condicao"));
                    String categoria = "NOVO INGRESSO";
                    
                    boolean ft = false;
                    boolean cer = false;
                    boolean cbi = false;
                    
                    if (!fotos.equals("N/D")) {
                        ft = true;
                    }
                    
                    if (!certificado.equals("N/D")) {
                        cer = true;
                    }
                    
                    if (!copiaBI.equals("N/D")) {
                        cbi = true;
                    }
                    
                    AnoLectivo anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entidade);
                    
                    String msgErro = "Matricula validada com sucesso";
                    String alerta = "bg-success";
                    
                    Inscricao inscricao = ensinoCtrl.buscaInscricaoAnoLectivoSemestre(entidade, anoLectivo, encryptUtils.encodeString(semestre), aluno);
                    if (inscricao == null) {
                        
                        int rest = turma.getTurmMaxEstudantes() - (turma.getTurmNumOcupado() + 1);
                        if (rest >= 0) {
                            turma.setTurmNumOcupado(turma.getTurmNumOcupado() + 1);
                            ensinoCtrl.persistirTurma(turma);
                            
                            data.le_hora();
                            
                            GregorianCalendar gc = new GregorianCalendar();
                            gc.setGregorianChange(new Date());
                            XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);
                            
                            Calendar calIns = Calendar.getInstance();
                            calIns.setTime(calendar.toGregorianCalendar().getTime());
                            calIns.add(Calendar.DATE, 30);
                            
                            GregorianCalendar gcNext = new GregorianCalendar();
                            gcNext.setGregorianChange(calIns.getTime());
                            XMLGregorianCalendar calendarNext = new XMLGregorianCalendarImpl(gcNext);
                            
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
                            
                            Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(data.getAno()));
                            referencia.setRefInscricoes(referencia.getRefInscricoes() + 1);
                            
                            vendasCtrl.persistirReferencia(referencia);
                            
                            String anoBagde = data.getAno();
                            
                            String anoTrim = anoBagde.substring(anoBagde.length() - 2, anoBagde.length());
                            
                            String badgenumber = utilitariosCtrl.buscaBadgeNumber(anoTrim + "00", referencia.getRefInscricoes());
                            aluno.setAlunBadgnumber(encryptUtils.encodeString(badgenumber));
                            aluno.setAlunStatus(encryptUtils.encodeString("Activo"));
                            ensinoCtrl.persistirAluno(aluno);
                            
                            String refIns = utilitariosCtrl.buscaBadgeNumber(anoTrim + encryptUtils.decodeString(turma.getCurso().getCursCod()), referencia.getRefInscricoes());
                            
                            inscricao = new Inscricao();
                            inscricao.setAluno(aluno);
                            inscricao.setAnoLectivo(anoLectivo);
                            inscricao.setCurso(turma.getCurso());
                            inscricao.setEntidade(entidade);
                            inscricao.setInscDataInscricao(calendar);
                            inscricao.setInscDataProximoPagamento(calendarNext);
                            inscricao.setTurma(turma);
                            inscricao.setInscOrigem(encryptUtils.encodeString("Sistema"));
                            inscricao.setInscTurno(encryptUtils.encodeString("N/D"));
                            inscricao.setInscSemestre(encryptUtils.encodeString(semestre));
                            inscricao.setInscNrTransfercia(encryptUtils.encodeString(pagamento));
                            inscricao.setInscReferencia(encryptUtils.encodeString(refIns));
                            inscricao.setInscAnoLectivo(encryptUtils.encodeString(data.getAno()));
                            inscricao.setInscCondicao(encryptUtils.encodeString(condicao));
                            inscricao.setInscCategoria(aluno.getAlunCategoria());
                            
                            inscricao.setInscCertificado(cer);
                            inscricao.setInscCopiaBI(cbi);
                            inscricao.setInscFotos(ft);
                            
                            ensinoCtrl.persistirInscricao(inscricao);
                            
                            alunos = ensinoCtrl.listaAlunosStatus(entidade, encryptUtils.encodeString("Por Validar"));
                            
                            request.getSession().setAttribute("alunos", alunos);
                            
                        } else {
                            
                            msgErro = "A turma selecionada já se encontra cheia";
                            alerta = "bg-warning";
                        }
                        
                    } else {
                        msgErro = "O aluno já se encontra inscrito para essa classe";
                        alerta = "bg-warning";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("inscriptions-online");
                }
                ;
                break;
                
                case "filtrar-turma": {
                    
                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");
                    String to = st.nextToken().split("=")[1];
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));
                    
                    Turma turma = ensinoCtrl.buscaTurmaId(idTurma);
                    
                    switch (to) {
                        case "transfer-to-class": {
                            
                            List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                            
                            request.getSession().setAttribute("inscricoes", inscricoes);
                        }
                        ;
                        break;
                    }
                    
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("cursos", (List<Curso>) request.getSession().getAttribute("cursos"));
                    request.getSession().setAttribute("cursoSelecionado", (Curso) request.getSession().getAttribute("cursoSelecionado"));
                    request.getSession().setAttribute("turmas", (List<Turma>) request.getSession().getAttribute("turmas"));
                    
                    response.sendRedirect(to);
                }
                ;
                break;
                
                case "transferir-turma": {
                    
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
                    
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário para a transferência de alunos para as turmas"));
                    response.sendRedirect("transfer-to-class");
                }
                ;
                break;
                
                case "transferir-matricula-t": {
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");
                    
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    int idTurma = Integer.parseInt(request.getParameter("idTurma"));
                    
                    Turma turma = getTurma(turmas, idTurma);
                    Inscricao inscricao = getInscricao(inscricoes, id);
                    
                    String tur = encryptUtils.decodeString(turma.getTurmDescricao());
                    String an = encryptUtils.decodeString(inscricao.getAluno().getPessoa().getPessNome()) + " " + encryptUtils.decodeString(inscricao.getAluno().getPessoa().getPessApelido());
                    
                    int rest = turma.getTurmMaxEstudantes() - (turma.getTurmNumOcupado() + 1);
                    String msgErro = "Aluno transferido com sucesso para a turma: " + tur;
                    String alerta = "bg-success";
                    
                    if (rest >= 0) {
                        
                        Turma turmaAux = inscricao.getTurma();
                        turmaAux.setTurmNumOcupado(turma.getTurmNumOcupado() - 1);
                        ensinoCtrl.persistirTurma(turmaAux);
                        
                        turma.setTurmNumOcupado(turma.getTurmNumOcupado() + 1);
                        ensinoCtrl.persistirTurma(turma);
                        
                        inscricao.setTurma(turma);
                        inscricao.setInscCategoria(encryptUtils.encodeString("TRANSFERIDO"));
                        ensinoCtrl.persistirInscricao(inscricao);
                        
                        Aluno aluno = inscricao.getAluno();
                        aluno.setTurma(turma);
                        aluno.setAlunCategoria(encryptUtils.encodeString("TRANSFERIDO"));
                        
                        ensinoCtrl.persistirAluno(aluno);
                        
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Transferiu com sucesso o(a) aluno(a)" + an + ", para a turma : " + tur));
                        
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                        
                        request.getSession().setAttribute("cursoSelecionado", turma.getCurso());
                        request.getSession().setAttribute("turma", turma);
                        request.getSession().setAttribute("inscricoes", inscricoes);
                        
                    } else {
                        
                        msgErro = "A turma selecionada já se encontra cheia";
                        alerta = "bg-warning";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("transfer-to-class");
                    
                }
                ;
                break;
                
                case "transferir-escola": {
                    
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
                    
                    List<Entidade> entidades = gestaoCtrl.listaEntidades();
                    String lblVagas = "";
                    
                    for (Entidade e : entidades) {
                        List<Vagas> vagas = ensinoCtrl.listaVagasAnoLectivo(e, anoLectivo);
                        
                        String label = getLabel(vagas, e);
                        
                        if (!label.isEmpty()) {
                            lblVagas += "\"" + encryptUtils.decodeString(e.getEntiNome()) + "\": [" + label + "],";
                        }
                        
                    }
                    
                    if (!lblVagas.isEmpty()) {
                        lblVagas = lblVagas.substring(0, lblVagas.length() - 1);
                    }
                    
                    request.getSession().setAttribute("anoLectivo", anoLectivo);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("turmas", turmas);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("lblVagas", lblVagas);
                    request.getSession().setAttribute("entidades", entidades);
                    
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário para a transferência de alunos para a escola"));
                    response.sendRedirect("transfer-to-school");
                }
                ;
                break;
                
                case "transferir-matricula-e": {
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                    
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    
                    String escola = request.getParameter("escola");
                    String classe = request.getParameter("classe");
                    
                    Inscricao inscricao = getInscricao(inscricoes, id);
                    
                    StringTokenizer st2 = new StringTokenizer(classe, "-");
                    
                    String cur = st2.nextToken();
                    
                    System.out.println("CURSO: " + cur);
                    
                    String an = encryptUtils.decodeString(inscricao.getAluno().getPessoa().getPessNome()) + " " + encryptUtils.decodeString(inscricao.getAluno().getPessoa().getPessApelido());
                    
                    String msgErro = "Aluno transferido com sucesso para a turma: " + escola;
                    String alerta = "bg-success";
                    
                    Entidade entiEscola = gestaoCtrl.buscarEntidadeNome(encryptUtils.encodeString(escola));
                    
                    if (entidade.getEntiId() != entiEscola.getEntiId()) {
                        
                        AnoLectivo anoLectivo = ensinoCtrl.buscaAnoLectivoActivo(entiEscola);
                        
                        if (anoLectivo != null) {
                            
                            Curso curso = ensinoCtrl.buscaCursoDescricao(entiEscola, cur);
                            Vagas vagas = ensinoCtrl.buscaVagasAnoLectivoCurso(entidade, anoLectivo, curso);
                            
                            if (vagas != null) {
                                
                                GregorianCalendar gc = new GregorianCalendar();
                                gc.setGregorianChange(new Date());
                                XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);
                                
                                Transferencia transferencia = new Transferencia();
                                transferencia.setAluno(inscricao.getAluno());
                                transferencia.setEntidade(entidade);
                                transferencia.setEntidade2(entiEscola);
                                transferencia.setTransData(calendar);
                                transferencia.setTransStatus("AGUARDA VALIDAÇÃO");
                                
                                controleAcessoCtrl.persistirLog(addLog(usuario, "Resgistou com sucesso a transferencia do(a) aluno(a)" + an + ", para a escola : " + escola));
                                
                            } else {
                                
                                msgErro = "O aluno não pode ser transferido, a escola não tem vagas disponíveis.";
                                alerta = "bg-warning";
                            }
                        } else {
                            msgErro = "O aluno não pode ser transferido, a escola não tem o ano lectivo activo.";
                            alerta = "bg-warning";
                        }
                        request.getSession().setAttribute("inscricoes", inscricoes);
                        
                    } else {
                        
                        msgErro = "O aluno não pode ser transferido para a mesma escola";
                        alerta = "bg-warning";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("transfer-to-school");
                    
                }
                ;
                break;
                
                case "importar": {
                    response.sendRedirect("student-import");
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
                    
                    List<ImpAluno> importacoes = null;
                    
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
                                    
                                    String nomeCompleto = tok.nextToken();
                                    String documento = tok.nextToken();
                                    String bi = tok.nextToken();
                                    String validadeDocumento = tok.nextToken();
                                    String dataNascimento = tok.nextToken();
                                    String nuit = tok.nextToken();
                                    String sexo = tok.nextToken();
                                    String provincia = tok.nextToken();
                                    String endereco = tok.nextToken();
                                    String deficiencia = tok.nextToken();
                                    String responsavel = tok.nextToken();
                                    String contactoResponsavel = tok.nextToken();
                                    String email = tok.nextToken();
                                    
                                    String nomePai = tok.nextToken();
                                    String contactoPai = tok.nextToken();
                                    String profissaoPai = tok.nextToken();
                                    String trabalhoPai = tok.nextToken();
                                    
                                    String nomeMae = tok.nextToken();
                                    String contactoMae = tok.nextToken();
                                    String profissaoMae = tok.nextToken();
                                    String trabalhoMae = tok.nextToken();
                                    
                                    String nivel = tok.nextToken();
                                    String ocupacao = tok.nextToken();
                                    
                                    ImpAluno ia = new ImpAluno();
                                    ia.setBi(bi);
                                    ia.setContactoMae(contactoMae);
                                    ia.setContactoPai(contactoPai);
                                    ia.setContactoResponsavel(contactoResponsavel);
                                    ia.setDataNascimento(dataNascimento);
                                    ia.setDataNascimento(dataNascimento);
                                    ia.setDeficiencia(deficiencia);
                                    ia.setDocumento(documento);
                                    ia.setEmail(email);
                                    ia.setEndereco(endereco);
                                    ia.setNivel(nivel);
                                    ia.setNomeCompleto(nomeCompleto);
                                    ia.setNomeMae(nomeMae);
                                    ia.setNomePai(nomePai);
                                    ia.setNuit(nuit);
                                    ia.setOcupacao(ocupacao);
                                    ia.setProfissaoMae(profissaoMae);
                                    ia.setProfissaoPai(profissaoPai);
                                    ia.setProvincia(provincia);
                                    ia.setResponsavel(responsavel);
                                    ia.setSexo(sexo);
                                    ia.setTrabalhoMae(trabalhoMae);
                                    ia.setTrabalhoPai(trabalhoPai);
                                    ia.setValidadeDocumento(validadeDocumento);
                                    
                                    importacoes.add(ia);
                                }
                            }
                        }
                    } else {
                        
                        msgErro = "Não foram encontrados registos no ficheiro selecionado";
                        alerta = "bg-warning";
                    }
                    
                    request.getSession().setAttribute("importacoesAluno", importacoes);
                    request.getSession().setAttribute("nomeFich", nomeFich);
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("student-import");
                }
                ;
                break;
                
                case "confirmar-upload": {
                    
                    List<ImpAluno> importacoes = (List<ImpAluno>) request.getSession().getAttribute("importacoesAluno");
                    
                    String nomeFich = request.getSession().getAttribute("nomeFich").toString();
                    
                    String msgErro = "Nenhum aluno importado, a lista encontra-se vazia.";
                    String alerta = "bg-warning";
                    int n = 0;
                    int r = 0;
                    
                    List<Aluno> alunos = new ArrayList();
                    
                    Escola escola = ensinoCtrl.buscaEscola(codEscola);
                    
                    if (importacoes != null) {
                        
                        for (ImpAluno imp : importacoes) {
                            
                            String nomeCompleto = imp.getNomeCompleto();
                            String documento = imp.getDocumento();
                            String bi = imp.getBi();
                            String validadeDocumento = imp.getValidadeDocumento();
                            String dataNascimento = imp.getDataNascimento();
                            String nuit = imp.getNuit();
                            String sexo = imp.getSexo();
                            String provincia = imp.getProvincia();
                            String endereco = imp.getEndereco();
                            String deficiencia = imp.getDeficiencia();
                            String responsavel = imp.getResponsavel();
                            String contactoResponsavel = imp.getContactoResponsavel();
                            String email = imp.getEmail();
                            
                            String nomePai = imp.getNomePai();
                            String contactoPai = imp.getContactoPai();
                            String profissaoPai = imp.getProfissaoPai();
                            String trabalhoPai = imp.getTrabalhoPai();
                            
                            String nomeMae = imp.getNomeMae();
                            String contactoMae = imp.getContactoMae();
                            String profissaoMae = imp.getProfissaoMae();
                            String trabalhoMae = imp.getTrabalhoMae();
                            
                            String nivel = imp.getNivel();
                            String ocupacao = imp.getOcupacao();
                            
                            StringTokenizer st2 = new StringTokenizer(nomeCompleto);
                            String nome = "";
                            String apelido = "";
                            int i = 0;
                            while (st2.hasMoreElements()) {
                                
                                if (st2.countTokens() - 1 == i) {
                                    apelido = st2.nextToken();
                                } else {
                                    nome += st2.nextToken() + " ";
                                }
                            }
                            
                            if (!nome.isEmpty()) {
                                nome = nome.substring(0, nome.length() - 1);
                            }
                            
                            Pessoa pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                            
                            boolean ft = false;
                            boolean cer = false;
                            boolean cbi = false;
                            
                            if (pessoa != null) {
                                r++;
                            } else {
                                
                                n++;
                                GregorianCalendar gc = new GregorianCalendar();
                                gc.setGregorianChange(new Date());
                                XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);
                                
                                Nacionalidade nasc = gestaoCtrl.buscarNacionalidadeDescricao("TW/Dp2FtYmljYW5h");
                                
                                String password = (nome.charAt(0) + "" + stringUtils.unaccent(apelido)).toLowerCase();
                                pessoa = new Pessoa();
                                pessoa.setEncrypted(true);
                                pessoa.setPessDataCadastro(calendar);
                                pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                                pessoa.setPessNome(encryptUtils.encodeString(nome));
                                pessoa.setPessEmail(encryptUtils.encodeString(email));
                                pessoa.setPessSexo(encryptUtils.encodeString(sexo));
                                pessoa.setNacionalidadenaci(nasc);
                                pessoa.setPessBairro(encryptUtils.encodeString(endereco));
                                pessoa.setPessContacto(encryptUtils.encodeString(contactoResponsavel));
                                pessoa.setPessFoto(encryptUtils.encodeString((password + ".jpg").toLowerCase()));
                                pessoa.setEntidade(entidade);
                                pessoa.setPessRua("");
                                pessoa.setPessNumeroCasa("");
                                pessoa.setPessProvincia(encryptUtils.encodeString(provincia));
                                pessoa.setPessBi(encryptUtils.encodeString(bi));
                                pessoa.setPessNuit(encryptUtils.encodeString(nuit));
                                pessoa.setPessDocumento(encryptUtils.encodeString(documento));
                                pessoa.setPessDistrito("");
                                pessoa.setPessDataNascimento(getDateImport(dataNascimento));
                                
                                pessoa.setPessDataValidadeBi(encryptUtils.encodeString(validadeDocumento));
                                pessoa.setPessResponsavel(encryptUtils.encodeString(responsavel));
                                
                                pessoa.setPessNomeMae(encryptUtils.encodeString(nomeMae));
                                pessoa.setPessProfissaoMae(encryptUtils.encodeString(profissaoMae));
                                pessoa.setPessContactoMae(encryptUtils.encodeString(contactoMae));
                                pessoa.setPessTrabalhoMae(encryptUtils.encodeString(trabalhoMae));
                                
                                pessoa.setPessNomePai(encryptUtils.encodeString(nomePai));
                                pessoa.setPessProfissaoPai(encryptUtils.encodeString(profissaoPai));
                                pessoa.setPessContactoPai(encryptUtils.encodeString(contactoPai));
                                pessoa.setPessTrabalhoPai(encryptUtils.encodeString(trabalhoPai));
                                
                                pessoa.setPessActividade(encryptUtils.encodeString(ocupacao));
                                
                                gestaoCtrl.persistirPessoa(pessoa);
                                
                                pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                                
                                data.le_hora();
                                
                                escola.setEscAlunos(escola.getEscAlunos() + 1);
                                
                                if (sexo.equals("Masculino")) {
                                    escola.setEscAlunosHomens(escola.getEscAlunosHomens() + 1);
                                } else {
                                    escola.setEscAlunosMulheres(escola.getEscAlunosMulheres() + 1);
                                }
                                
                                ensinoCtrl.persistirEscola(escola);
                                
                                String anoBagde = data.getAno();
                                
                                String anoTrim = anoBagde.substring(anoBagde.length() - 2, anoBagde.length());
                                
                                String badgenumber = utilitariosCtrl.buscaBadgeNumber(anoTrim + "00", escola.getEscAlunos());
                                
                                Aluno aluno = new Aluno();
                                aluno.setAlunBadgnumber(encryptUtils.encodeString(badgenumber));
                                aluno.setAlunStatus(encryptUtils.encodeString("Activo"));
                                aluno.setEncrypted(true);
                                aluno.setEntidade(entidade);
                                aluno.setPessoa(pessoa);
                                aluno.setAlunBolseiro(encryptUtils.encodeString("NORMAL"));
                                aluno.setAlunNivel(encryptUtils.encodeString(nivel));
                                aluno.setAlunCategoria(encryptUtils.encodeString("NOVO INGRESSO"));
                                aluno.setAlunDeficiente(true);
                                if (deficiencia.equals("Não")) {
                                    aluno.setAlunDeficiente(false);
                                }
                                
                                ensinoCtrl.persistirAluno(aluno);
                                
                                alunos.add(aluno);
                                
                                TipoUsuario tipoUsuario = controleAcessoCtrl.buscaTipoUsuarioDescricao("Estudante");
                                
                                Usuario usuarioCliente = new Usuario();
                                usuarioCliente.setEntidade(entidade);
                                usuarioCliente.setPessoapess(pessoa);
                                usuarioCliente.setUsuaSenha(encryptUtils.encodeString(password));
                                usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(badgenumber));
                                usuarioCliente.setUsuaCodigoRegistro(entidade.getEntiSigla() + "#0" + entidade.getEntiId());
                                usuarioCliente.setUsuaEstado("Activo");
                                usuarioCliente.setUsuaOnline("Offline");
                                usuarioCliente.setUsuaStatus("Offline");
                                usuarioCliente.setUsuaPresenca(false);
                                usuarioCliente.setUsuaTentativasLogin(0);
                                usuarioCliente.setTipoUsuariotipu(tipoUsuario);
                                usuarioCliente.setUsuaStatusicon("offline.png");
                                usuarioCliente.setUsuaDevice("");
                                usuarioCliente.setEncrypted(true);
                                usuarioCliente.setUsuaFotoperfil("generic-user.png");
                                
                                controleAcessoCtrl.persistirUsuario(usuarioCliente);
                                
                            }
                            
                            msgErro = "Carregado(s) com sucesso " + importacoes.size() + " alunos(s). Novos: " + n + ", Repetidos: " + r;
                            alerta = "bg-success";
                            
                            if (n != 0) {
                                addLog(usuario, "Importou com sucesso " + n + " aluno(s) do ficheiro com o nome: " + nomeFich);
                            }
                        }
                    }
                    request.getSession().setAttribute("importacoesAluno", null);
                    request.getSession().setAttribute("alunosReg", alunos);
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("student-import");
                    
                }
                ;
                break;
                
                case "distribuicao-automatica": {
                    
                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");
                    List<Aluno> alunos = (List<Aluno>) request.getSession().getAttribute("alunos");
                    
                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                    }
                    
                    if (alunos == null) {
                        alunos = ensinoCtrl.listaAlunos(entidade);
                    }
                    
                    Curso curso = null;
                    
                    if (request.getParameter("idCurso") != null) {
                        curso = getCurso(cursos, Integer.parseInt(request.getParameter("idCurso")));
                    }
                    
                    List<Estudante> estudantes = fillEstudantes(alunos);
                    
                    int max = 30;
                    String criterio = "SEQUENCIAL";
                    
                    if (request.getParameter("max") != null) {
                        max = Integer.parseInt(request.getParameter("max"));
                    }
                    
                    if (request.getParameter("criterio") != null) {
                        criterio = request.getParameter("criterio");
                    }
                    
                    int index = 0;
                    
                    int num = 1;
                    int numEstudantes = 0;
                    
                    if (estudantes.size() > max) {
                        num = (int) Math.round(estudantes.size() / max);
                        
                        int resto = estudantes.size() - (num * max);
                        
                        if (resto != 0) {
                            num++;
                        }
                    }
                    
                    switch (criterio) {
                        case "ALFABÉTICO": {
                            
                            Collections.sort(estudantes, (Estudante o1, Estudante o2) -> {
                                String s1 = o1.getNome();
                                String s2 = o2.getNome();
                                
                                return s1.compareToIgnoreCase(s2);
                            });
                            
                        }
                        ;
                        break;
                        
                        case "IDADE": {
                            
                            Collections.sort(estudantes, (Estudante o1, Estudante o2) -> {
                                String s1 = o1.getIdade() + "";
                                String s2 = o2.getIdade() + "";
                                
                                if (o1.getIdade() < 10) {
                                    s1 = "0" + o1.getIdade();
                                }
                                
                                if (o2.getIdade() < 10) {
                                    s2 = "0" + o2.getIdade();
                                }
                                
                                return s1.compareToIgnoreCase(s2);
                            });
                        }
                        ;
                        break;
                    }
                    
                    List<Tur> turs = new ArrayList();
                    
                    for (int i = 1; i <= num; i++) {
                        
                        Tur tur = new Tur();
                        tur.setDescricao("TURMA " + i);
                        
                        List<Estudante> estudantesAux = new ArrayList();
                        
                        while (numEstudantes < max) {
                            
                            if (index <= estudantes.size() - 1) {
                                Estudante e = estudantes.get(index);
                                
                                estudantesAux.add(e);
                            }
                            numEstudantes++;
                            index++;
                            
                        }
                        
                        tur.setEstudantes(estudantesAux);
                        turs.add(tur);
                        
                        if (numEstudantes == max) {
                            numEstudantes = 0;
                        }
                    }
                    
                    request.getSession().setAttribute("turs", turs);
                    request.getSession().setAttribute("max", max);
                    request.getSession().setAttribute("cursos", cursos);
                    request.getSession().setAttribute("alunos", alunos);
                    request.getSession().setAttribute("cursoSelecionado", curso);
                    request.getSession().setAttribute("criterio", criterio);
                    
                    response.sendRedirect("student-dist");
                    
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
    
    public XMLGregorianCalendar getDateImport(String data) {
        
        XMLGregorianCalendar calendar = null;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date d = sdf1.parse(data);
            GregorianCalendar gc = new GregorianCalendar();
            gc.setGregorianChange(d);
            calendar = new XMLGregorianCalendarImpl(gc);
        } catch (ParseException ex) {
            
        }
        
        return calendar;
    }
    
    private float getMaximaNota(List<Notas> notas) {
        float n = 0;
        if (notas != null) {
            for (Notas n1 : notas) {
                float media = n1.getNotaMedia();
                
                if (n < media) {
                    n = media;
                }
            }
        }
        return n;
    }
    
    private float getMinimaNota(List<Notas> notas) {
        float n = 0;
        if (notas != null) {
            for (Notas n1 : notas) {
                float media = n1.getNotaMedia();
                
                if (media < n) {
                    n = media;
                }
            }
        }
        return n;
    }
    
    private float getMediaActual(List<Notas> notas) {
        float n = 0;
        
        float mediaTotal = 0;
        if (notas != null) {
            for (Notas n1 : notas) {
                float media = n1.getNotaMedia();
                
                if (media > 0) {
                    n++;
                    mediaTotal += mediaTotal;
                }
            }
        }
        return Math.round((mediaTotal / n));
    }
    
    private Inscricao getInscricaoActual(List<Inscricao> inscricoes) {
        Inscricao inscricao = null;
        
        for (Inscricao i : inscricoes) {
            if (i.isInscActiva()) {
                inscricao = i;
                break;
            }
        }
        
        return inscricao;
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
    
    private Aluno getAluno(List<Aluno> alunos, int id) {
        Aluno aluno = null;
        
        if (alunos != null) {
            for (Aluno a : alunos) {
                if (a.getAlunId() == id) {
                    aluno = a;
                }
            }
        }
        
        return aluno;
    }
    
    private Turma getTurma(List<Turma> turmas, int id) {
        Turma turma = null;
        
        if (turmas != null) {
            for (Turma t : turmas) {
                if (t.getTurmId() == id) {
                    turma = t;
                }
            }
        }
        
        return turma;
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
    
    private Curso getCurso(List<Curso> cursos, int id) {
        Curso curso = null;
        
        if (cursos != null) {
            for (Curso c : cursos) {
                if (c.getCursId() == id) {
                    curso = c;
                }
            }
        }
        
        return curso;
    }
    
    private String getLabel(List<Vagas> vagas, Entidade e) {
        String lbl = "";
        
        if (vagas != null) {
            for (Vagas v : vagas) {
                if (v.getEntidade().getEntiId() == e.getEntiId()) {
                    lbl += "'" + encryptUtils.decodeString(v.getCurso().getCursDescricao()) + "-(" + (v.getVagaTotal() - v.getVagaPreechidas()) + " vagas)',";
                }
            }
        }
        
        if (!lbl.isEmpty()) {
            lbl = lbl.substring(0, lbl.length() - 1);
        }
        
        return lbl;
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
    
    private String getDocument(String id) {
        String value = "";
        
        switch (id) {
            case "1.0":
                value = "BI";
                break;
            case "2.0":
                value = "Passaporte";
                break;
            case "3.0":
                value = "DIRE";
                break;
            case "4.0":
                value = "Cédula pessoal";
                break;
            case "5.0":
                value = "Cartão de eleitor";
                break;
            case "6.0":
                value = "Carta de condução";
                break;
            case "7.0":
                value = "Outro";
                break;
        }
        
        return value;
    }
    
    private List<Estudante> fillEstudantes(List<Aluno> alunos) {
        List<Estudante> estudantes = new ArrayList();
        
        int i = 0;
        
        if (alunos != null) {
            for (Aluno a : alunos) {
                i++;
                Estudante e = new Estudante();
                e.setId(encryptUtils.decodeString(a.getAlunBadgnumber()));
                e.setNome(encryptUtils.decodeString(a.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(a.getPessoa().getPessApelido()));
                
                LocalDate birthDate = new LocalDate(a.getPessoa().getPessDataNascimento().getYear(), a.getPessoa().getPessDataNascimento().getMonth(), a.getPessoa().getPessDataNascimento().getDay());
                
                LocalDate now = new LocalDate();
                Years age = Years.yearsBetween(birthDate, now);
                
                e.setIdade(age.getYears());
                
                estudantes.add(e);
            }
        }
        
        return estudantes;
    }
    
}
