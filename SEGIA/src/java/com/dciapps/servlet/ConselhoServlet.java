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
import com.dciapps.webclient.Doc;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Nacionalidade;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Sala;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.DocumentoCtrl;
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
@WebServlet(name = "Q29uc2VsaG9TZXJ2bGV0I0RDSQ==", urlPatterns = {"/Q29uc2VsaG9TZXJ2bGV0I0RDSQ=="})
public class ConselhoServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    DocumentoCtrl documentoCtrl = new DocumentoCtrl();

    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

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

                case "membros": {

                    List<Pessoa> pessoas = gestaoCtrl.listaPessoasTipo(entidade, "Membro");

                    request.getSession().setAttribute("pessoas", pessoas);
                    request.getSession().setAttribute("pessoa", null);
                    request.getSession().setAttribute("nome", "");
                    request.getSession().setAttribute("apelido", "");
                    request.getSession().setAttribute("sexo", "");
                    request.getSession().setAttribute("email", "");
                    request.getSession().setAttribute("bi", "");
                    request.getSession().setAttribute("nuit", "");
                    request.getSession().setAttribute("casa", "");
                    request.getSession().setAttribute("contacto", "");
                    request.getSession().setAttribute("endereco", "");
                    request.getSession().setAttribute("quarteirao", "");
                    request.getSession().setAttribute("provincia", "");
                    request.getSession().setAttribute("distrito", "");
                    request.getSession().setAttribute("actividade", "");

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de registos de membros"));

                    response.sendRedirect("members");
                }
                ;
                break;

                case "registar-membro": {


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
                    String actividade = getString(request.getParameter("actividade"));

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

                    String msgErro = "[MEMBRO CONSELHO ESCOLA] : " + nome + " " + apelido + ", "
                            + "adicionado com sucesso.";
                    String alerta = "bg-success";

                    Pessoa pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));

                    if (pessoa != null) {
                        msgErro = "[MEMBRO CONSELHO ESCOLA] : " + nome + " " + apelido + ", "
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

                        pessoa.setPessActividade(encryptUtils.encodeString(actividade));
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
                        pessoa.setPessNomeMae("");
                        pessoa.setPessRaca("");
                        pessoa.setPessRelegiao("");
                        pessoa.setPessOrigemRegisto("Sistema");
                        pessoa.setPessSinais("");
                        pessoa.setPessSkills("");
                        pessoa.setPessSobre("");
                        pessoa.setPessTipo("Membro");
                        pessoa.setPessVicios("");
                        pessoa.setPessNomePai("");
                        pessoa.setPessPais("");

                        gestaoCtrl.persistirPessoa(pessoa);

                        Escola escola = (Escola) request.getSession().getAttribute("escola");

                        if (escola != null) {
                            if (sexo.equals("Masculino")) {
                                escola.setEscMembrosHomens(escola.getEscMembrosHomens() + 1);
                            } else {
                                escola.setEscMembrosMulheres(escola.getEscMembrosMulheres() + 1);
                            }

                            ensinoCtrl.persistirEscola(escola);
                        }

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso o membro do conselho de escola com o nome: " + (nome + " " + apelido)));

                        List<Pessoa> pessoas = gestaoCtrl.listaPessoasTipo(entidade, "Membro");
                        request.getSession().setAttribute("pessoas", pessoas);

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
                        actividade = "";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    request.getSession().setAttribute("nome", nome);
                    request.getSession().setAttribute("apelido", apelido);
                    request.getSession().setAttribute("email", email);
                    request.getSession().setAttribute("bi", bi);
                    request.getSession().setAttribute("casa", casa);
                    request.getSession().setAttribute("nuit", nuit);
                    request.getSession().setAttribute("contacto", contacto);
                    request.getSession().setAttribute("endereco", endereco);
                    request.getSession().setAttribute("quarteirao", quarteirao);
                    request.getSession().setAttribute("actividade", actividade);
                    request.getSession().setAttribute("sexo", sexo);
                    request.getSession().setAttribute("provincia", provincia);

                    response.sendRedirect("members");
                }
                ;
                break;

                case "remover-membro": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Pessoa pessoa = gestaoCtrl.buscarPessoaId(id);

                    Escola escola = (Escola) request.getSession().getAttribute("escola");

                    String sexo = encryptUtils.decodeString(pessoa.getPessSexo());

                    if (escola != null) {
                        if (sexo.equals("Masculino")) {
                            escola.setEscMembrosHomens(escola.getEscMembrosHomens() - 1);
                        } else {
                            escola.setEscMembrosMulheres(escola.getEscMembrosMulheres() - 1);
                        }

                        ensinoCtrl.persistirEscola(escola);
                    }

                    gestaoCtrl.removerPessoa(pessoa);

                    List<Pessoa> pessoas = gestaoCtrl.listaPessoasTipo(entidade, "Membro");
                    request.getSession().setAttribute("pessoas", pessoas);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o membro do conselho de escola com id:  " + id));

                    String nome = encryptUtils.decodeString(pessoa.getPessNome());
                    String apelido = encryptUtils.decodeString(pessoa.getPessApelido());

                    String msgErro = "[MEMBRO CONSELHO ESCOLA] : " + nome + " " + apelido + ", "
                            + "removido com sucesso.";
                    String alerta = "bg-success";

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("members");

                }
                ;
                break;

                case "editar-membro": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Pessoa pessoa = gestaoCtrl.buscarPessoaId(id);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição o membro com o id: " + id));

                    request.getSession().setAttribute("pessoa", pessoa);

                    response.sendRedirect("members");
                }
                ;
                break;

                case "actualizar-membro": {

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
                    String actividade = getString(request.getParameter("actividade"));

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

                    String msgErro = "Dados do membro alterados com sucesso.";
                    String alerta = "bg-success";

                    Pessoa pessoa = (Pessoa) request.getSession().getAttribute("pessoa");

                    String nomePess = encryptUtils.decodeString(pessoa.getPessNome());
                    String apelidoPess = encryptUtils.decodeString(pessoa.getPessApelido());

                    if (nomePess.equals(nome) && apelidoPess.equals(apelido)) {

                        String password = (nome.charAt(0) + "" + stringUtils.unaccent(apelido)).toLowerCase();

                        pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                        pessoa.setPessNome(encryptUtils.encodeString(nome));
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
                        pessoa.setPessActividade(encryptUtils.encodeString(actividade));

                        if (!email.equals("N/D")) {
                            pessoa.setPessEmail(encryptUtils.encodeString(email));
                        }

                        gestaoCtrl.persistirPessoa(pessoa);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso o membro com o id : " + pessoa.getPessId()));

                        List<Pessoa> pessoas = gestaoCtrl.listaPessoasTipo(entidade, "Membro");
                        request.getSession().setAttribute("pessoas", pessoas);

                    } else {

                        Pessoa pessoaCheck = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));

                        if (pessoaCheck != null) {

                            msgErro = "Já existe um membro com o nome indicado.";
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
                            pessoa.setPessActividade(encryptUtils.encodeString(actividade));

                            gestaoCtrl.persistirPessoa(pessoa);

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso o membro com o id : " + pessoa.getPessId()));

                            List<Pessoa> pessoas = gestaoCtrl.listaPessoasTipo(entidade, "Membro");
                            request.getSession().setAttribute("pessoas", pessoas);

                        }
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("members");
                }
                ;
                break;

                case "cancelar-edicao": {

                    List<Pessoa> pessoas = (List<Pessoa>) request.getSession().getAttribute("pessoas");

                    request.getSession().setAttribute("pessoas", pessoas);
                    request.getSession().setAttribute("pessoa", null);
                    request.getSession().setAttribute("nome", "");
                    request.getSession().setAttribute("apelido", "");
                    request.getSession().setAttribute("sexo", "");
                    request.getSession().setAttribute("email", "");
                    request.getSession().setAttribute("bi", "");
                    request.getSession().setAttribute("nuit", "");
                    request.getSession().setAttribute("casa", "");
                    request.getSession().setAttribute("contacto", "");
                    request.getSession().setAttribute("endereco", "");
                    request.getSession().setAttribute("quarteirao", "");
                    request.getSession().setAttribute("provincia", "");
                    request.getSession().setAttribute("distrito", "");
                    request.getSession().setAttribute("actividade", "");

                    response.sendRedirect("members");
                }
                ;
                break;

                case "imprimir-membros": {
                    List<Pessoa> pessoas = (List<Pessoa>) request.getSession().getAttribute("pessoas");

                    request.getSession().setAttribute("pessoas", pessoas);
                    response.sendRedirect("print-members");

                }
                ;
                break;

                case "documento": {

                    request.getSession().setAttribute("doc", null);
                    response.sendRedirect("document");
                }
                ;
                break;

                case "registar-documento": {

                    String tipo = getString(request.getParameter("tipo"));
                    String assunto = getString(request.getParameter("assunto"));
                    String destinatario = getString(request.getParameter("destinatario"));
                    String texto = getString(request.getParameter("texto"));

                    Escola escola = ensinoCtrl.buscaEscola(codEscola);

                    String msgErro = tipo + " registado(a) com sucesso";
                    String alerta = "bg-success";

                    GregorianCalendar gc = new GregorianCalendar();
                    gc.setGregorianChange(new Date());
                    XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                    Doc doc = new Doc();
                    doc.setDocAssunto(encryptUtils.encodeString(assunto));
                    doc.setDocData(calendar);
                    doc.setDocTexto(encryptUtils.encodeString(texto));
                    doc.setDocTipo(encryptUtils.encodeString(tipo));
                    doc.setDocDestinatario(encryptUtils.encodeString(destinatario));
                    doc.setEncrypted(true);
                    doc.setEntidade(entidade);
                    doc.setUsuario(usuario);
                    doc.setEscola(escola);

                    documentoCtrl.persistirDoc(doc);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("document");

                }
                ;
                break;

                case "documentos": {
                    @SuppressWarnings("UnusedAssignment")
                    List<Doc> docs = null;
                    Date dataHoje = new Date();
                    String periodo = sdf.format(dataHoje);
                    String dataSelecionada = sdf2.format(dataHoje) + " - " + sdf2.format(dataHoje);

                    if (request.getParameter("dataPesquisa") != null) {
                        String dataPesquisa = request.getParameter("dataPesquisa");
                        StringTokenizer tok = new StringTokenizer(dataPesquisa, " - ");
                        String d1 = tok.nextToken();
                        String d2 = d1;

                        if (tok.hasMoreTokens()) {
                            d2 = tok.nextToken();
                        }

                        XMLGregorianCalendar calendar1 = getDate(d1);
                        XMLGregorianCalendar calendar2 = getDate(d2);

                        periodo = sdf.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf.format(calendar2.toGregorianCalendar().getTime());
                        dataSelecionada = sdf2.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf2.format(calendar2.toGregorianCalendar().getTime());

                        docs = documentoCtrl.listaDocsPeriodo(entidade, sdf.format(calendar1.toGregorianCalendar().getTime()), sdf.format(calendar2.toGregorianCalendar().getTime()));

                    } else {

                        docs = documentoCtrl.listaDocsData(entidade, sdf.format(dataHoje));
                    }

                    request.getSession().setAttribute("docs", docs);
                    request.getSession().setAttribute("periodo", periodo);
                    request.getSession().setAttribute("dataSelecionada", dataSelecionada);

                    response.sendRedirect("documents");
                }
                ;
                break;

                case "editar-documento": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Doc doc = documentoCtrl.buscaDocId(id);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição o documento com o ID: " + id));

                    request.getSession().setAttribute("doc", doc);

                    response.sendRedirect("document");
                }
                ;
                break;

                case "remover-documento": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Doc doc = documentoCtrl.buscaDocId(id);

                    String assunto = encryptUtils.decodeString(doc.getDocAssunto());
                    String tipo = encryptUtils.decodeString(doc.getDocTipo());
                    documentoCtrl.removerDoc(doc);

                    List<Doc> docs = (List<Doc>) request.getSession().getAttribute("docs");
                    List<Doc> aux = updateDocs(docs, doc);

                    String msgErro = tipo + " registado(a) com sucesso";
                    String alerta = "bg-success";

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o documento com o assunto: " + assunto));

                    request.getSession().setAttribute("doc", doc);
                    request.getSession().setAttribute("docs", aux);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("documents");
                }
                ;
                break;

                case "imprimir-documento": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Doc doc = documentoCtrl.buscaDocId(id);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para impressão o documento com o ID: " + id));

                    request.getSession().setAttribute("doc", doc);

                    response.sendRedirect("print-document");
                }
                ;
                break;

                case "actualizar-documento": {

                    String tipo = getString(request.getParameter("tipo"));
                    String assunto = getString(request.getParameter("assunto"));
                    String destinatario = getString(request.getParameter("destinatario"));
                    String texto = getString(request.getParameter("texto"));

                    String msgErro = "Documento actualizado com sucesso";
                    String alerta = "bg-success";

                    Doc doc = (Doc) request.getSession().getAttribute("doc");

                    doc.setDocAssunto(encryptUtils.encodeString(assunto));
                    doc.setDocTexto(encryptUtils.encodeString(texto));
                    doc.setDocTipo(encryptUtils.encodeString(tipo));
                    doc.setDocDestinatario(encryptUtils.encodeString(destinatario));
                    doc.setEncrypted(true);
                    doc.setEntidade(entidade);

                    documentoCtrl.persistirDoc(doc);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("document");

                }
                ;
                break;

                case "cancelar-edicao-documento": {

                    request.getSession().setAttribute("doc", null);
                    response.sendRedirect("document");
                }
                ;
                break;

                case "convocar": {
                    List<Pessoa> membros = gestaoCtrl.listaPessoasTipo(entidade, "Membro");
                    List<Sala> salas = ensinoCtrl.listaSalas(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de registo de convocatórias"));

                    request.getSession().setAttribute("membros", membros);
                    request.getSession().setAttribute("salas", salas);
                    request.getSession().setAttribute("pontos", null);
                    request.getSession().setAttribute("convoados", null);

                    response.sendRedirect("announcement");
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

    private List<Doc> updateDocs(List<Doc> docs, Doc doc) {
        List<Doc> values = new ArrayList();

        if (docs != null) {
            for (Doc d : docs) {
                if (d.getDocId() != doc.getDocId()) {
                    values.add(d);
                }
            }
        }
        return values;
    }
}
