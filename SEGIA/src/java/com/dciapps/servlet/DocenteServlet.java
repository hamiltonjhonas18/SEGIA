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
import com.dciapps.webclient.Area;
import com.dciapps.webclient.AreaFormacao;
import com.dciapps.webclient.DisciplinaDocente;
import com.dciapps.webclient.Docente;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Nacionalidade;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.TipoUsuario;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
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
@WebServlet(name = "RG9jZW50ZVNlcnZsZXQjRENJ", urlPatterns = {"/RG9jZW50ZVNlcnZsZXQjRENJ"})
public class DocenteServlet extends HttpServlet {
    
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
                
                case "docentes": {
                    
                    List<Docente> docentes = ensinoCtrl.listaDocentes(entidade);
                    List<AreaFormacao> areasFormacao = ensinoCtrl.listaAreasFormacao(entidade);
                    List<Area> areas = ensinoCtrl.listaAreas(entidade);
                    
                    request.getSession().setAttribute("docentes", docentes);
                    request.getSession().setAttribute("areasFormacao", areasFormacao);
                    request.getSession().setAttribute("areas", areas);
                    request.getSession().setAttribute("docente", null);
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
                    request.getSession().setAttribute("tipoContrato", "");
                    
                    request.getSession().setAttribute("nivel", "");
                    request.getSession().setAttribute("area", "");
                    request.getSession().setAttribute("especialidade", "");
                    request.getSession().setAttribute("categoria", "");
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de formadores"));
                    
                    response.sendRedirect("teacher");
                }
                ;
                break;
                
                case "registar-docente": {
                    
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
                    String especialidade = getString(request.getParameter("especialidade"));
                    String area = getString(request.getParameter("area"));
                    String categoria = getString(request.getParameter("categoria"));
                    String tipoContrato = getString(request.getParameter("tipoContrato"));
                    String dataValidade = getString(request.getParameter("dataValidade"));
                    
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
                    
                    XMLGregorianCalendar validade = getDate(dataValidade);
                    
                    String msgErro = "[PROFESSOR] : " + nome + " " + apelido + ", "
                            + "adicionado com sucesso.";
                    String alerta = "bg-success";
                    
                    boolean dateGood = dateCurrent(validade.toGregorianCalendar().getTime());
                    
                    if (dateGood) {
                        
                        Pessoa pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                        
                        if (pessoa != null) {
                            msgErro = "[PROFESSOR] : " + nome + " " + apelido + ", "
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
                            
                            pessoa.setPessActividade(encryptUtils.encodeString("Professor"));
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
                            pessoa.setPessTipo("Cliente");
                            pessoa.setPessVicios("");
                            pessoa.setPessNomePai("");
                            pessoa.setPessPais("");
                            
                            gestaoCtrl.persistirPessoa(pessoa);
                            
                            pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                            
                            AreaFormacao areaFormacao = ensinoCtrl.buscaAreaFormacaoDescricao(entidade, encryptUtils.encodeString(area));
                            
                            Docente docente = new Docente();
                            docente.setAreaFormacao(areaFormacao);
                            docente.setDoceEspecialidade(encryptUtils.encodeString(especialidade));
                            docente.setDoceGrauFormacao(encryptUtils.encodeString(nivel));
                            docente.setDoceCategoria(encryptUtils.encodeString(categoria));
                            docente.setDoceTipoContrato(encryptUtils.encodeString(tipoContrato));
                            docente.setDoceValidadeContrato(validade);
                            docente.setEncrypted(true);
                            docente.setEntidade(entidade);
                            docente.setPessoa(pessoa);
                            
                            ensinoCtrl.persistirDocente(docente);
                            
                            Escola escola = ensinoCtrl.buscaEscola(codEscola);
                            
                            escola.setEscDocentes(escola.getEscDocentes() + 1);
                            ensinoCtrl.persistirEscola(escola);
                            
                            if (!email.equals("N/D")) {
                                TipoUsuario tipoUsuario = controleAcessoCtrl.buscaTipoUsuarioDescricao("Docente");
                                
                                Usuario usuarioCliente = new Usuario();
                                usuarioCliente.setEntidade(entidade);
                                usuarioCliente.setPessoapess(pessoa);
                                usuarioCliente.setUsuaSenha(encryptUtils.encodeString(password));
                                usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(email));
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
                                
                                controleAcessoCtrl.persistirUsuario(usuarioCliente);
                                
                            }
                            controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso o professor com o nome: " + (nome + " " + apelido)));
                            
                            List<Docente> docentes = ensinoCtrl.listaDocentes(entidade);
                            List<AreaFormacao> areasFormacao = (List<AreaFormacao>) request.getSession().getAttribute("areasFormacao");
                            
                            request.getSession().setAttribute("docentes", docentes);
                            request.getSession().setAttribute("areasFormacao", areasFormacao);
                            
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
                            especialidade = "";
                            area = "";
                            categoria = "";
                            tipoContrato = "";
                        }
                    } else {
                        
                        msgErro = "Professor não pode ser adicionado, a data do contrato é anterior";
                        alerta = "bg-success";
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
                    request.getSession().setAttribute("especialidade", especialidade);
                    request.getSession().setAttribute("area", area);
                    request.getSession().setAttribute("nivel", nivel);
                    request.getSession().setAttribute("sexo", sexo);
                    request.getSession().setAttribute("provincia", provincia);
                    request.getSession().setAttribute("categoria", categoria);
                    request.getSession().setAttribute("tipoContrato", tipoContrato);
                    
                    response.sendRedirect("teacher");
                }
                ;
                break;
                
                case "remover-docente": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    
                    Docente docente = ensinoCtrl.buscaDocenteId(id);
                    List<DisciplinaDocente> disciplinasDocente = ensinoCtrl.listaDisciplinasDocentesDocente(entidade, docente);
                    
                    String msgErro = "Professor "
                            + "não pode ser removido. "
                            + "Desassocie registos ligados ao centro.";
                    
                    String alerta = "bg-warning";
                    
                    if (disciplinasDocente.isEmpty()) {
                        ensinoCtrl.removerDocente(docente);
                        
                        Escola escola = ensinoCtrl.buscaEscola(codEscola);
                        escola.setEscDocentes(escola.getEscDocentes() - 1);
                        ensinoCtrl.persistirEscola(escola);
                        
                        List<Docente> docentes = ensinoCtrl.listaDocentes(entidade);
                        List<AreaFormacao> areasFormacao = (List<AreaFormacao>) request.getSession().getAttribute("areasFormacao");
                        
                        request.getSession().setAttribute("docentes", docentes);
                        request.getSession().setAttribute("areasFormacao", areasFormacao);
                        
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o professor com id:  " + id));
                        msgErro = "Professor "
                                + "removido com sucesso";
                        
                        alerta = "bg-success";
                    }
                    
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("teacher");
                    
                }
                ;
                break;
                
                case "editar-docente": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    
                    Docente docente = ensinoCtrl.buscaDocenteId(id);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição o professor com o id: " + id));
                    
                    request.getSession().setAttribute("docente", docente);
                    
                    response.sendRedirect("teacher");
                }
                ;
                break;
                
                case "actualizar-docente": {
                    
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
                    String especialidade = getString(request.getParameter("especialidade"));
                    String area = getString(request.getParameter("area"));
                    String categoria = getString(request.getParameter("categoria"));
                    String tipoContrato = getString(request.getParameter("tipoContrato"));
                    String dataValidade = getString(request.getParameter("dataValidade"));
                    
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
                    
                    String msgErro = "Dados do professor alterados com sucesso.";
                    String alerta = "bg-success";
                    
                    AreaFormacao areaFormacao = ensinoCtrl.buscaAreaFormacaoDescricao(entidade, encryptUtils.encodeString(area));
                    Docente docente = (Docente) request.getSession().getAttribute("docente");
                    
                    XMLGregorianCalendar validade = getDate(dataValidade);
                    
                    boolean dateGood = dateCurrent(validade.toGregorianCalendar().getTime());
                    
                    if (dateGood) {
                        
                        docente.setAreaFormacao(areaFormacao);
                        docente.setDoceEspecialidade(encryptUtils.encodeString(especialidade));
                        docente.setDoceGrauFormacao(encryptUtils.encodeString(nivel));
                        docente.setDoceCategoria(encryptUtils.encodeString(categoria));
                        docente.setDoceTipoContrato(encryptUtils.encodeString(tipoContrato));
                        docente.setDoceValidadeContrato(validade);
                        
                        ensinoCtrl.persistirDocente(docente);
                        
                        request.getSession().setAttribute("docente", docente);
                        
                        Pessoa pessoa = docente.getPessoa();
                        
                        String nomePess = encryptUtils.decodeString(pessoa.getPessNome());
                        String apelidoPess = encryptUtils.decodeString(pessoa.getPessApelido());
                        
                        if (nomePess.equals(nome) && apelidoPess.equals(apelido)) {
                            
                            String mailUsuario = pessoa.getPessEmail();
                            
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
                            
                            if (!email.equals("N/D")) {
                                pessoa.setPessEmail(encryptUtils.encodeString(email));
                            }
                            
                            gestaoCtrl.persistirPessoa(pessoa);
                            
                            if (!email.equals("N/D")) {
                                Usuario usuarioCliente = controleAcessoCtrl.buscarUsuario(mailUsuario);
                                usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(email));
                                usuarioCliente.setUsuaSenha(encryptUtils.encodeString(password));
                                
                                controleAcessoCtrl.persistirUsuario(usuarioCliente);
                            }
                            controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso o professor com o id : " + docente.getDoceId()));
                            
                            List<Docente> docentes = ensinoCtrl.listaDocentes(entidade);
                            
                            request.getSession().setAttribute("docentes", docentes);
                            
                        } else {
                            
                            Pessoa pessoaCheck = gestaoCtrl.buscarPessoaNomeApelido(entidade, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));
                            
                            if (pessoaCheck != null) {
                                
                                msgErro = "Já existe um formador com o nome indicado.";
                                alerta = "bg-warning";
                            } else {
                                
                                String mailUsuario = pessoa.getPessEmail();
                                
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
                                
                                if (!mailUsuario.equals("N/D")) {
                                    Usuario usuarioCliente = controleAcessoCtrl.buscarUsuario(mailUsuario);
                                    
                                    if (usuarioCliente != null) {
                                        usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(email));
                                    } else {
                                        
                                        TipoUsuario tipoUsuario = controleAcessoCtrl.buscaTipoUsuarioDescricao("Docente");
                                        
                                        usuarioCliente = new Usuario();
                                        usuarioCliente.setEntidade(entidade);
                                        usuarioCliente.setPessoapess(pessoa);
                                        usuarioCliente.setUsuaSenha(encryptUtils.encodeString(password));
                                        usuarioCliente.setUsuaUsuario(encryptUtils.encodeString(email));
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
                                    
                                }
                                
                                controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso o professor com o id : " + docente.getDoceId()));
                                
                                List<Docente> docentes = ensinoCtrl.listaDocentes(entidade);
                                List<AreaFormacao> areasFormacao = (List<AreaFormacao>) request.getSession().getAttribute("areasFormacao");
                                
                                request.getSession().setAttribute("docentes", docentes);
                                request.getSession().setAttribute("areasFormacao", areasFormacao);
                                
                            }
                        }
                        
                    } else {
                        msgErro = "Professor não pode ser adicionado, a data do contrato é anterior";
                        alerta = "bg-success";
                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    
                    response.sendRedirect("teacher");
                }
                ;
                break;
                
                case "cancelar-edicao": {
                    
                    List<Docente> docentes = (List<Docente>) request.getSession().getAttribute("docentes");
                    
                    List<AreaFormacao> areasFormacao = (List<AreaFormacao>) request.getSession().getAttribute("areasFormacao");
                    
                    request.getSession().setAttribute("docentes", docentes);
                    request.getSession().setAttribute("areasFormacao", areasFormacao);
                    request.getSession().setAttribute("docente", null);
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
                    request.getSession().setAttribute("area", "");
                    request.getSession().setAttribute("especialidade", "");
                    request.getSession().setAttribute("sexo", "");
                    request.getSession().setAttribute("provincia", "");
                    
                    response.sendRedirect("teacher");
                }
                ;
                break;
                
                case "imprimir-docentes": {
                    List<Docente> docentes = (List<Docente>) request.getSession().getAttribute("docentes");
                    
                    request.getSession().setAttribute("docentes", docentes);
                    response.sendRedirect("print-teacher");
                    
                }
                ;
                break;
                
                case "carga-horaria": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    
                    Docente docente = ensinoCtrl.buscaDocenteId(id);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou a carga horária do professor com o id: " + id));
                    
                    List<DisciplinaDocente> disciplinasDocente = ensinoCtrl.listaDisciplinasDocentesDocente(entidade, docente);
                    
                    request.getSession().setAttribute("disciplinasDocente", disciplinasDocente);
                    request.getSession().setAttribute("docente", docente);
                    
                    response.sendRedirect("teacher-grades");
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
    
    private boolean dateCurrent(Date day) {
        return !day.before(new Date());
    }
}
