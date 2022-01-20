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
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Browser;
import com.dciapps.webclient.EdstDistrict;
import com.dciapps.webclient.EdstProvince;
import com.dciapps.webclient.EdstSchool;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.ModulosUsuario;
import com.dciapps.webclient.Nacionalidade;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.TipoUsuario;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ContabilidadeCtrl;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EducStatCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.dciapps.webclientcontroler.UtilitariosCtrl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
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
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "VXN1YXJpb1NlcnZsZXQjRENJ", urlPatterns = {"/VXN1YXJpb1NlcnZsZXQjRENJ"})
public class UsuarioServlet extends HttpServlet {

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    UtilitariosCtrl utilitariosCtrl = new UtilitariosCtrl();
    ContabilidadeCtrl contabilidadeCtrl = new ContabilidadeCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    EducStatCtrl educStatCtrl = new EducStatCtrl();

    EncryptUtils encryptUtils = new EncryptUtils();
    StringUtils stringUtils = new StringUtils();

    MailSender ms = new MailSender();
    Sender sender = new Sender();

    Data data = new Data();
    Sistema sistema;
    Entidade entidade;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

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

            request.getSession().setAttribute("nome", "");
            request.getSession().setAttribute("apelido", "");
            request.getSession().setAttribute("email", "");
            request.getSession().setAttribute("sexo", "");
            request.getSession().setAttribute("contacto", "");
            request.getSession().setAttribute("morada", "");
            request.getSession().setAttribute("bairro", "");
            request.getSession().setAttribute("password", "");
            request.getSession().setAttribute("repassword", "");

            switch (accao) {

                case "ip": {

                    request.getSession().setAttribute("ip", getUrlServer());

                    data.le_hora();
                    request.getSession().setAttribute("ano", data.getAno());

                    response.sendRedirect("wellcome");

                }
                ;
                break;
                case "entity": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    entidade = gestaoCtrl.buscarEntidadeId(id);

                    request.getSession().setAttribute("entidade", entidade);

                    response.sendRedirect("VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jc3lz");

                }
                ;
                break;
                case "sys": {
                    sistema = controleAcessoCtrl.buscaSistemaId(1);
                    request.getSession().setAttribute("sistema", sistema);
                    request.getSession().setAttribute("trys", 0);

                    if (sistema.isSistEstado()) {
                        response.sendRedirect("VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jY2hlY2tCcm93c2VyJm5hdmVnYWRvcj1hbnk=");
                    } else {
                        response.sendRedirect("error-manitence");
                    }
                }
                ;
                break;
                case "checkBrowser": {

                    String info = request.getHeader("User-Agent");

                    String ip = request.getRemoteHost();
                    System.out.println("REMOTE HOST: " + ip);

                    InetAddress addr = InetAddress.getByName(request.getRemoteHost());
                    String host = addr.getHostName();
                    System.out.println("HOST LOGADO: " + host);

                    // request.getHeader("VIA");
                    //  request.getHeader("X-FORWARDED-FOR");
                    //Gateway
                    System.out.println(request.getHeader("VIA"));

                    //IP Address
                    System.out.println(request.getHeader("X-FORWARDED-FOR"));

                    info += "<strong><br>IP:" + ip + "<br>HOST:" + host + "</strong>";

                    String navegador = st.nextToken().split("=")[1];
                    Browser browser = null;

                    if (!navegador.equals("novo")) {

                        List<Browser> browsers = controleAcessoCtrl.listaBrowsers(info);

                        if (!browsers.isEmpty()) {
                            System.out.println("BROWSERS COM A INFO SAO: " + browsers.size());
                            browser = (Browser) browsers.get(browsers.size() - 1);

                        }
                    }
                    request.getSession().setAttribute("browser", browser);
                    response.sendRedirect("user-login");
                }
                ;
                break;
                case "responder": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    String resposta = encryptUtils.encodeString(request.getParameter("resposta"));

                    if (usuario.getUsuaRespostaSeguranca().equals(resposta)) {

                        String info = request.getHeader("User-Agent");

                        String ip = request.getRemoteHost();
                        System.out.println("REMOTE HOST: " + ip);

                        InetAddress addr = InetAddress.getByName(request.getRemoteHost());
                        String host = addr.getHostName();
                        System.out.println("HOST LOGADO: " + host);

                        info += "<strong><br>IP:" + ip + "<br>HOST:" + host + "</strong>";

                        //Gateway
                        System.out.println(request.getHeader("VIA"));

                        //IP Address
                        System.out.println(request.getHeader("X-FORWARDED-FOR"));

                        GregorianCalendar gc = new GregorianCalendar();
                        gc.setGregorianChange(new Date());
                        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                        usuario.setUsuaDevice(info);
                        usuario.setUsuaStatusicon("online.png");
                        usuario.setUsuDataUltimaVisita(calendar);
                        usuario.setUsuaOnline("Online");
                        usuario.setUsuaStatus("Online");
                        usuario.setUsuaPresenca(true);
                        usuario.setUsuaTentativasLogin(usuario.getUsuaTentativasLogin() + 1);

                        controleAcessoCtrl.persistirUsuario(usuario);

                        List<Browser> browsers = controleAcessoCtrl.listaBrowsersUsuario(info, usuario.getUsuaId());
                        Browser browser = new Browser();

                        if (browsers.size() > 0) {
                            for (Browser b : browsers) {
                                browser = b;
                            }
                        }
                        browser.setBroDescricao(info);
                        browser.setBroData(calendar);
                        browser.setUsuario(usuario);
                        browser.setBroLembre("off");

                        entidade = (Entidade) request.getSession().getAttribute("entidadeSelecionada");

                        if (entidade == null) {
                            entidade = (Entidade) request.getSession().getAttribute("entidade");
                        }

                        int diasTrial = 0;
                        if (usuario.getEntidade().getEntiDataFinalAssistencia() != null) {
                            Date dtaProx = usuario.getEntidade().getEntiDataFinalAssistencia().toGregorianCalendar().getTime();
                            Date dtaHoje = new Date();
                            diasTrial = Days.daysBetween(new DateTime(dtaHoje), new DateTime(dtaProx)).getDays();
                        }

                        if (diasTrial <= 0) {

                            response.sendRedirect("trial");

                        } else {
                            controleAcessoCtrl.persistirBrowser(browser);
                            controleAcessoCtrl.persistirLog(addLog(usuario, "Logou-se com sucesso no sistema através da resposta de segurança"));
                            controleAcessoCtrl.persistirLog(addLog(usuario, "Respondeu correctamente a sua pergunta de segurança"));

                            ModulosUsuario modulosUsuario = controleAcessoCtrl.buscaModulosUsuario(usuario);

                            request.getSession().setAttribute("entidade", entidade);

                            request.getSession().setAttribute("usuario", usuario);

                            request.getSession().setAttribute("diasTrial", diasTrial);

                            request.getSession().setAttribute("modulosUsuarioLogin", modulosUsuario);

                            response.sendRedirect("user-confirm");
                        }

                    } else {

                        usuario.setUsuaStatusicon("offline.png");
                        usuario.setUsuaOnline("Offline");
                        usuario.setUsuaStatus("Offline");
                        usuario.setUsuaPresenca(false);
                        controleAcessoCtrl.persistirUsuario(usuario);

                        String alerta = "bg-error";
                        String msgErro = "Resposta de segurança incorrecta, tente novamente.";

                        request.getSession().setAttribute("alerta", alerta);
                        request.getSession().setAttribute("msgErro", msgErro);
                        response.sendRedirect("user-question");
                    }
                }
                break;

                case "terminarsessao": {

                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    request.getSession().setAttribute("usuario", usuario);
                    request.getSession().setAttribute("msgErro", "");
                    request.getSession().setAttribute("alerta", "");

                    response.sendRedirect("user-question");
                }
                break;

                case "esqueceu-senha": {

                    response.sendRedirect("user-password-recover");
                }
                break;

                case "login": {

                    request.getSession().removeAttribute("usuario");
                    String utilizador = encryptUtils.encodeString(request.getParameter("email"));
                    String password = encryptUtils.encodeString(request.getParameter("password"));

                    String lembre = request.getParameter("lembre");
                    String alerta = "bg-error";
                    String msgErro = "Login invalido, username ou password incorrectos.";

                    if (lembre == null) {
                        lembre = "off";
                    }

                    Usuario usuario = controleAcessoCtrl.autenticar(utilizador, password);

                    if (usuario != null) {

                        if (usuario.getEntidade().getEntiId() <= 22) {

                            if (usuario.getUsuaTentativasLogin() == 0) {
                                usuario.setUsuaOnline("Online");
                                request.getSession().setAttribute("usuario", usuario);

                                if (usuario.getUsuaEstado().equals("Inactivo")) {
                                    controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou efectuar login estando bloqueado"));
                                    msgErro = "Impossível efectuar o login, a sua conta esta bloqueada";

                                    request.getSession().setAttribute("alerta", alerta);
                                    request.getSession().setAttribute("msgErro", msgErro);
                                    response.sendRedirect("user-blocked");

                                } else {
                                    List<Nacionalidade> nacionalidades = gestaoCtrl.listaNacionalidades();
                                    request.getSession().setAttribute("nacionalidades", nacionalidades);
                                    response.sendRedirect("user-first-login");
                                }
                            } else {

                                int diasTrial = 0;
                                if (usuario.getEntidade().getEntiDataFinalAssistencia() != null) {
                                    Date dtaProx = usuario.getEntidade().getEntiDataFinalAssistencia().toGregorianCalendar().getTime();
                                    Date dtaHoje = new Date();
                                    diasTrial = Days.daysBetween(new DateTime(dtaHoje), new DateTime(dtaProx)).getDays();
                                }

                                if (diasTrial <= 0) {

                                    response.sendRedirect("trial");

                                } else {
                                    alerta = "bg-error";

                                    entidade = (Entidade) request.getSession().getAttribute("entidadeSelecionada");

                                    if (entidade == null) {
                                        entidade = usuario.getEntidade();
                                    }
                                    if (usuario.getUsuaEstado().equals("Inactivo")) {
                                        controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou efectuar login estando bloqueado"));
                                        msgErro = "Impossível efectuar o login, a sua conta esta bloqueada";

                                        request.getSession().setAttribute("alerta", alerta);
                                        request.getSession().setAttribute("msgErro", msgErro);
                                        request.getSession().setAttribute("usuario", usuario);
                                        response.sendRedirect("user-blocked");

                                    } else if (usuario.getUsuaOnline().equals("Online")) {

                                        controleAcessoCtrl.persistirLog(addLog(usuario, "Tentou efectuar login tendo outra sessão aberta"));
                                        msgErro = "Impossível efectuar o login, existe outra sessão com a sua conta aberta.";

                                        request.getSession().setAttribute("alerta", alerta);
                                        request.getSession().setAttribute("msgErro", msgErro);
                                        request.getSession().setAttribute("usuario", usuario);
                                        request.getSession().setAttribute("info", usuario.getUsuaDevice());
                                        response.sendRedirect("user-login-alert");
                                    } else {

                                        String info = request.getHeader("User-Agent");

                                        String ip = request.getRemoteHost();
                                        System.out.println("REMOTE HOST: " + ip);

                                        InetAddress addr = InetAddress.getByName(request.getRemoteHost());
                                        String host = addr.getHostName();
                                        System.out.println("HOST LOGADO: " + host);

                                        info += "<strong><br>IP:" + ip + "<br>HOST:" + host + "</strong>";

                                        GregorianCalendar gc = new GregorianCalendar();
                                        gc.setGregorianChange(new Date());
                                        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                                        usuario.setUsuaDevice(info);
                                        usuario.setUsuaStatusicon("online.png");
                                        usuario.setUsuDataUltimaVisita(calendar);
                                        usuario.setUsuaOnline("Online");
                                        usuario.setUsuaStatus("Online");
                                        usuario.setUsuaPresenca(true);
                                        usuario.setUsuaTentativasLogin(usuario.getUsuaTentativasLogin() + 1);

                                        controleAcessoCtrl.persistirUsuario(usuario);

                                        List<Browser> browsers = controleAcessoCtrl.listaBrowsersUsuario(accao, usuario.getUsuaId());

                                        Browser browser = new Browser();
                                        if (browsers.size() > 0) {
                                            for (Browser b : browsers) {
                                                browser = b;
                                            }
                                        }
                                        browser.setBroData(calendar);
                                        browser.setBroDescricao(info);
                                        browser.setUsuario(usuario);
                                        browser.setBroLembre(lembre);

                                        controleAcessoCtrl.persistirBrowser(browser);

                                        entidade = usuario.getEntidade();
                                        controleAcessoCtrl.persistirLog(addLog(usuario, "Logou-se com sucesso no sistema através o formulário principal"));

                                        ModulosUsuario modulosUsuario = controleAcessoCtrl.buscaModulosUsuario(usuario);

                                        request.getSession().setAttribute("entidade", entidade);

                                        request.getSession().setAttribute("usuario", usuario);

                                        request.getSession().setAttribute("diasTrial", diasTrial);

                                        request.getSession().setAttribute("modulosUsuarioLogin", modulosUsuario);

                                        System.err.println("MEUS DIAS TRIAL: " + diasTrial);

                                        /*  if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")
                                                || usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {
                                            response.sendRedirect("VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jYWRtaW4tc2VsZWN0");
                                      //  } else {*/
                                        doUpdate(request, response, usuario);
                                        // }
                                    }
                                }
                            }
                        } else {
                            response.sendRedirect("error-405");
                        }
                    } else {

                        /* Usuario us = controleAcessoCtrl.buscarUsuario(utilizador);
                         if(us != null)
                         {
                         int trys = Integer.parseInt(request.getSession().getAttribute("trys").toString());
                         trys ++;
                            
                         }*/
                        request.getSession().setAttribute("alerta", alerta);
                        request.getSession().setAttribute("msgErro", msgErro);
                        response.sendRedirect("user-login");
                    }

                }
                ;
                break;

                case "admin-select": {

                    List<Entidade> entidades = gestaoCtrl.listaEntidades();
                    request.getSession().setAttribute("entidades", entidades);

                    response.sendRedirect("admin-instution-select");
                }
                ;
                break;

                case "selecionar-insitituicao": {

                    int idEntidade = Integer.parseInt(st.nextToken().split("=")[1]);

                    Entidade entidadeSelecionada = gestaoCtrl.buscarEntidadeId(idEntidade);

                    System.out.println("ENTIDADE SELECIONADA: " + encryptUtils.decodeString(entidadeSelecionada.getEntiNome()));

                    this.entidade = entidadeSelecionada;

                    request.getSession().setAttribute("entidadeSelecionada", entidadeSelecionada);
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou no login com o id: " + idEntidade));

                    doUpdate(request, response, usuario);
                }
                ;
                break;

                case "logout": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    if (usuario != null) {
                        request.getSession().removeAttribute("usuario");

                        usuario.setUsuaDevice("");
                        usuario.setUsuaStatusicon("offline.png");
                        usuario.setUsuaOnline("Offline");
                        usuario.setUsuaStatus("Offline");
                        usuario.setUsuaPresenca(false);

                        controleAcessoCtrl.persistirUsuario(usuario);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Terminou a sua sessão no sistema"));
                    }
                    response.sendRedirect("VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jY2hlY2tCcm93c2VyJm5hdmVnYWRvcj1hbnk=");
                }
                ;
                break;
                case "recuperar": {
                    String username = encryptUtils.encodeString(request.getParameter("username"));

                    String alerta = "bg-success";
                    String msgErro = " Pedido submetido ! Confira seu e-mail";

                    Usuario usuario = controleAcessoCtrl.buscarUsuario(username);
                    if (usuario != null) {

                        sender.mailPassword(usuario);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou a recuperação da sua senha"));

                    } else {

                        alerta = "bg-warning";
                        msgErro = " Erro ! Utilizador não existe";
                    }

                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("msgErro", msgErro);
                    response.sendRedirect("user-password-recover");

                }
                ;
                break;

                case "lockscreen": {

                    String user = st.nextToken().split("=")[1];
                    int idEntidade = Integer.parseInt(st.nextToken().split("=")[1]);

                    Usuario usuario = controleAcessoCtrl.buscarUsuario(encryptUtils.encodeString(user));

                    if (usuario != null) {

                        System.out.println("Usuario nao é nullo");
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Sessão ficou bloqueada por inactividade"));

                        sistema = controleAcessoCtrl.buscaSistemaDescricao("SIGEFP - Sistema de Gestão de Formação Profissional");
                        request.getSession().setAttribute("sistema", sistema);

                        Entidade entidadeSelecionada = gestaoCtrl.buscarEntidadeId(idEntidade);

                        request.getSession().setAttribute("usuario", usuario);
                        request.getSession().setAttribute("ip", getUrlServer());
                        request.getSession().setAttribute("user", user);
                        request.getSession().setAttribute("entidade", entidadeSelecionada);

                        data.le_hora();
                        request.getSession().setAttribute("ano", data.getAno());
                        response.sendRedirect("user-lockscreen");
                    } else {
                        System.out.println("Usuario é nullo");
                    }
                }
                ;
                break;

                case "login-lockscreen": {

                    String user = st.nextToken().split("=")[1];
                    int idEntidade = Integer.parseInt(st.nextToken().split("=")[1]);

                    System.out.println("==================== USER INFO ============= ");
                    System.out.println("User: " + user);

                    Usuario usuario = controleAcessoCtrl.buscarUsuario(encryptUtils.encodeString(user));
                    String password = encryptUtils.encodeString(request.getParameter("password"));

                    if (usuario != null) {

                        if (usuario.getUsuaSenha().equals(password)) {

                            GregorianCalendar gc = new GregorianCalendar();
                            gc.setGregorianChange(new Date());
                            XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                            usuario.setUsuaStatusicon("online.png");
                            usuario.setUsuDataUltimaVisita(calendar);
                            usuario.setUsuaOnline("Online");
                            usuario.setUsuaStatus("Online");
                            usuario.setUsuaPresenca(true);
                            usuario.setUsuaTentativasLogin(usuario.getUsuaTentativasLogin() + 1);

                            controleAcessoCtrl.persistirUsuario(usuario);

                            entidade = gestaoCtrl.buscarEntidadeId(idEntidade);

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Logou-se com sucesso no sistema através o formulário principal"));

                            request.getSession().setAttribute("entidade", entidade);

                            request.getSession().setAttribute("usuario", usuario);

                            request.getSession().setAttribute("ip", getUrlServer());
                            data.le_hora();
                            request.getSession().setAttribute("ano", data.getAno());

                            System.out.println("A password esta correcta");

                            int diasTrial = 0;
                            if (usuario.getEntidade().getEntiDataFinalAssistencia() != null) {
                                Date dtaProx = usuario.getEntidade().getEntiDataFinalAssistencia().toGregorianCalendar().getTime();
                                Date dtaHoje = new Date();
                                diasTrial = Days.daysBetween(new DateTime(dtaHoje), new DateTime(dtaProx)).getDays();
                            }

                            request.getSession().setAttribute("diasTrial", diasTrial);

                            if (diasTrial <= 0) {

                                response.sendRedirect("trial");

                            } else {

                                /* if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")
                                        || usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {
                                    response.sendRedirect("VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jYWRtaW4tc2VsZWN0");
                                } else {*/
                                doUpdate(request, response, usuario);
                                // }
                            }

                        } else {
                            String alerta = "bg-warning";
                            String msgErro = "Login invalido, username ou password incorrectos.";

                            request.getSession().setAttribute("alerta", alerta);
                            request.getSession().setAttribute("msgErro", msgErro);
                            request.getSession().setAttribute("usuario", usuario);

                            request.getSession().setAttribute("ip", getUrlServer());
                            data.le_hora();
                            request.getSession().setAttribute("ano", data.getAno());

                            System.out.println("A password errada");

                            response.sendRedirect("user-lockscreen");
                        }
                    } else {
                        System.out.println("Usuário é nullo");
                    }
                }
                ;
                break;

                case "doUpdate": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    doUpdate(request, response, usuario);
                }
                ;
                break;

                case "suporte": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    request.getSession().setAttribute("usuario", usuario);
                    response.sendRedirect("support");
                }
                ;
                break;

                case "contacto": {
                    String email = request.getParameter("email");
                    String assunto = request.getParameter("assunto");
                    String mensagem = request.getParameter("mensagem");

                    String msgErro = "A sua mensagem foi enviada com sucesso";
                    String alerta = "alert-success";

                    mensagem += "<br><br>Enviada a partir do endereço: <strong>" + email + "</strong>";
                    ms.sendMail("dcinovaction@gmail.com", "[" + assunto + "]", mensagem, "");

                    // ************** END EMAIL *************
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("support-contact");

                }
                ;
                break;
                case "alterarInformacoes": {

                    String rd = st.nextToken().split("=")[1];

                    String nome = request.getParameter("nome");
                    String apelido = request.getParameter("apelido");
                    String sexo = request.getParameter("sexo");
                    String email = request.getParameter("email");
                    String endereco = request.getParameter("endereco");
                    String contacto = request.getParameter("contacto");
                    String cidade = request.getParameter("cidade");
                    String nacionalidade = request.getParameter("nacionalidade");
                    String naturalidade = request.getParameter("naturalidade");
                    String cPostal = request.getParameter("cPostal");
                    String cargoUser = request.getParameter("cargo");
                    String dataNascimento = request.getParameter("dataNascimento");

                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    Pessoa pessoa = usuario.getPessoapess();

                    Pessoa pessoaCheck = gestaoCtrl.buscarPessoaNomeApelido(usuario.getEntidade(), encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));

                    String msgErro = "";
                    String alerta = "bg-success";

                    boolean isDadosPessoais = true;
                    boolean isAccept = false;

                    if (pessoaCheck != null) {
                        if (pessoaCheck.getPessId() == pessoa.getPessId()) {
                            isAccept = true;
                        }
                    } else {
                        isAccept = true;
                    }

                    if (isAccept) {
                        Nacionalidade nasc = gestaoCtrl.buscarNacionalidadeDescricao(nacionalidade);

                        if (nasc == null) {
                            nasc = new Nacionalidade();
                            nasc.setNaciDescricao(nacionalidade);

                            gestaoCtrl.persistirNacionalidade(nasc);

                            nasc = gestaoCtrl.buscarNacionalidadeDescricao(nacionalidade);
                        }

                        XMLGregorianCalendar calendarDataNascimento = getDate(dataNascimento);

                        pessoa.setPessDataNascimento(calendarDataNascimento);
                        pessoa.setPessActividade(encryptUtils.encodeString(cargoUser));
                        pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                        pessoa.setPessNome(encryptUtils.encodeString(nome));
                        pessoa.setPessEmail(encryptUtils.encodeString(email));
                        pessoa.setPessSexo(encryptUtils.encodeString(sexo));
                        pessoa.setNacionalidadenaci(nasc);
                        pessoa.setPessBairro(encryptUtils.encodeString(endereco));
                        pessoa.setPessContacto(encryptUtils.encodeString(contacto));
                        pessoa.setPessFoto(encryptUtils.encodeString((nome + "-" + apelido + ".jpg").toLowerCase()));
                        pessoa.setPessCPostal(encryptUtils.encodeString(cPostal));
                        pessoa.setPessCidade(encryptUtils.encodeString(cidade));
                        pessoa.setPessProvincia(encryptUtils.encodeString(naturalidade));
                        msgErro += "Seus dados pessoais foram actualizados com sucesso.";

                    } else {
                        isDadosPessoais = false;
                    }

                    if (isDadosPessoais) {

                        gestaoCtrl.persistirPessoa(pessoa);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Actualizou o seu perfil com sucesso"));
                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    if (rd.equals("1")) {
                        request.getSession().setAttribute("usuario", usuario);
                        response.sendRedirect("user-first-login");
                    } else {
                        response.sendRedirect("user-profile");
                    }
                }
                ;
                break;
                case "alterarSeguranca": {

                    String rd = st.nextToken().split("=")[1];

                    String passAntiga = request.getParameter("passAntiga");
                    String passNova = request.getParameter("passNova");
                    String rePassNova = request.getParameter("rePassNova");

                    String perguntaSeguranca = request.getParameter("perguntaSeguranca");
                    String respostaSeguranca = request.getParameter("respostaSeguranca");

                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    String msgErro = "";
                    String alerta = "bg-success";

                    boolean isDadosPassword = true;
                    boolean isPerguntaSeguranca = true;

                    if (!passAntiga.isEmpty() && !passNova.isEmpty() && !rePassNova.isEmpty()) {
                        if (passNova.equals(rePassNova)) {

                            if (!encryptUtils.decodeString(usuario.getUsuaSenha()).equals(passAntiga)) {

                                msgErro += "Senha não alterada! Palavra-passe não corresponde a actual. ";

                            } else if (encryptUtils.decodeString(usuario.getUsuaSenha()).equals(passNova)) {

                                msgErro += "Senha não alterada! Palavra-passe nova igual a actual. ";
                            } else {

                                msgErro += "Senha alterada com sucesso. ";
                                usuario.setUsuaSenha(encryptUtils.encodeString(passNova));
                            }

                        } else {

                            msgErro += "Senha não alterada! A nova Senha e a verificação não coincidem.";
                        }

                    } else {
                        isDadosPassword = false;
                    }

                    if (usuario.getUsuaPerguntaSeguranca() != null) {
                        if (usuario.getUsuaPerguntaSeguranca().equals(perguntaSeguranca) && encryptUtils.decodeString(usuario.getUsuaRespostaSeguranca()).equals(respostaSeguranca)) {
                            isPerguntaSeguranca = false;
                        } else {
                            usuario.setUsuaPerguntaSeguranca(encryptUtils.encodeString(perguntaSeguranca));
                            usuario.setUsuaRespostaSeguranca(encryptUtils.encodeString(respostaSeguranca));

                            msgErro += "Pergunta de Segurança alterada com sucesso";
                        }
                    } else {
                        usuario.setUsuaPerguntaSeguranca(encryptUtils.encodeString(perguntaSeguranca));
                        usuario.setUsuaRespostaSeguranca(encryptUtils.encodeString(respostaSeguranca));

                        msgErro += "Pergunta de Segurança alterada com sucesso";
                    }

                    if (isDadosPassword || isPerguntaSeguranca) {

                        if (rd.equals("1")) {
                            usuario.setUsuaTentativasLogin(1);
                        }
                        controleAcessoCtrl.persistirUsuario(usuario);

                        controleAcessoCtrl.persistirLog(addLog(usuario, "Actualizou o seu perfil com sucesso"));

                    }
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    if (rd.equals("1")) {
                        request.getSession().setAttribute("usuario", usuario);
                        response.sendRedirect("user-first-login");
                    } else {
                        response.sendRedirect("user-profile");
                    }
                }
                ;
                break;

                case "reload-photo": {

                    String user = st.nextToken().split("=")[1];
                    Usuario usuario = controleAcessoCtrl.buscarUsuario(encryptUtils.encodeString(user));
                    String rd = st.nextToken().split("=")[1];

                    request.getSession().setAttribute("usuario", usuario);
                    request.getSession().setAttribute("nacionalidades", (List<Nacionalidade>) request.getSession().getAttribute("nacionalidades"));

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Actualizou a sua foto perfil"));

                    request.getSession().setAttribute("msgErro", "Foto de perfil actualizada com sucesso");
                    request.getSession().setAttribute("alerta", "bg-success");

                    if (rd.equals("1")) {
                        request.getSession().setAttribute("usuario", usuario);
                        response.sendRedirect("user-first-login");
                    } else {
                        response.sendRedirect("user-profile");
                    }
                }
                ;
                break;

                case "ver-perfil": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    request.getSession().setAttribute("nacionalidades", gestaoCtrl.listaNacionalidades());

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou o seu perfil"));

                    request.getSession().setAttribute("msgErro", "");
                    request.getSession().setAttribute("alerta", "");

                    response.sendRedirect("user-profile");
                }
                ;
                break;

                case "entrar-portal": {
                    String modulo = st.nextToken().split("=")[1];

                    request.getSession().setAttribute("modulo", modulo);

                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    doUpdate(request, response, usuario);

                }
                ;
                break;

                case "go-back": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Retornou a pagina para selecionar modulos"));

                    request.getSession().setAttribute("modulo", "");

                    doUpdate(request, response, usuario);

                }
                ;
                break;

                case "logs": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    data.le_hora();

                    @SuppressWarnings("UnusedAssignment")
                    String dataMonitoramento = "";

                    SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");

                    @SuppressWarnings("UnusedAssignment")
                    String periodo = sdf2.format(new Date()) + " - " + sdf2.format(new Date());

                    @SuppressWarnings("UnusedAssignment")
                    String dataSel = "";

                    @SuppressWarnings("UnusedAssignment")
                    List<Log> logs = null;

                    int dias = 0;

                    if (request.getParameter("dataMonitoramento") != null) {
                        dataMonitoramento = request.getParameter("dataMonitoramento");
                        StringTokenizer tok = new StringTokenizer(dataMonitoramento, " - ");
                        String d1 = tok.nextToken();
                        String d2 = tok.nextToken();

                        periodo = dataMonitoramento;

                        if (!d1.equals(d2)) {
                            XMLGregorianCalendar calendar1 = getDate(d1);
                            XMLGregorianCalendar calendar2 = getDate(d2);

                            dias = Days.daysBetween(new DateTime(calendar1.toGregorianCalendar().getTime()), new DateTime(calendar2.toGregorianCalendar().getTime())).getDays();

                            dataSel = sdf.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf.format(calendar2.toGregorianCalendar().getTime());

                            logs = controleAcessoCtrl.listaLogsPeriodo(entidade, sdf.format(calendar1.toGregorianCalendar().getTime()), sdf.format(calendar2.toGregorianCalendar().getTime()));
                        } else {
                            XMLGregorianCalendar calendar1 = getDate(d1);

                            String dataHoje = sdf.format(calendar1.toGregorianCalendar().getTime());
                            dataSel = dataHoje;

                            periodo = sdf2.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf2.format(calendar1.toGregorianCalendar().getTime());

                            logs = controleAcessoCtrl.listaLogsData(entidade, dataHoje);
                        }

                    } else {
                        Calendar cal = Calendar.getInstance();
                        cal.add(Calendar.DATE, -1);

                        String dataHoje = sdf.format(cal.getTime());

                        periodo = sdf2.format(cal.getTime()) + " - " + sdf2.format(cal.getTime());
                        dataSel = dataHoje;

                        logs = controleAcessoCtrl.listaLogsData(entidade, dataHoje);

                    }
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou a lista de actividades dos utilizadores para o periodo :" + periodo));

                    request.getSession().setAttribute("logs", logs);
                    request.getSession().setAttribute("dataSelecionadaLogs", dataSel);
                    request.getSession().setAttribute("periodoLogs", periodo);

                    response.sendRedirect("user-logs");

                }
                ;
                break;

                case "permissoes": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    List<ModulosUsuario> modulosUsuario = controleAcessoCtrl.listaModulosUsuarios(entidade);
                    ModulosUsuario mub = null;

                    if (modulosUsuario != null) {
                        if (!modulosUsuario.isEmpty()) {
                            mub = modulosUsuario.get(0);
                        }
                    }

                    request.getSession().setAttribute("modulosUsuario", modulosUsuario);
                    request.getSession().setAttribute("modulosUsuarioSelecionado", mub);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de actulização de permissões"));

                    response.sendRedirect("user-permissions");

                }
                ;
                break;

                case "usuarios": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    @SuppressWarnings("UnusedAssignment")
                    List<Usuario> usuarios = null;

                    if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {

                        usuarios = controleAcessoCtrl.listaUsuarios();

                    } else {
                        usuarios = controleAcessoCtrl.listaDosUsuariosEntidade(entidade);
                    }

                    List<TipoUsuario> tiposUsuario = controleAcessoCtrl.listaTiposUsuario();
                    List<Entidade> entidades = gestaoCtrl.listaEntidades();

                    request.getSession().setAttribute("usuarios", usuarios);
                    request.getSession().setAttribute("tiposUsuario", tiposUsuario);
                    request.getSession().setAttribute("entidades", entidades);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecinou o formulário de registo de usuários"));

                    response.sendRedirect("user-add");

                }
                ;
                break;

                case "registar-usuario": {
                    int idTipoUsuario = Integer.parseInt(request.getParameter("idTipoUsuario"));
                    int idEntidade = Integer.parseInt(request.getParameter("idEntidade"));
                    String nome = request.getParameter("nome");
                    String apelido = request.getParameter("apelido");
                    String email = request.getParameter("email");

                    String msgErro = "Usuário adicionado com sucesso";
                    String alerta = "bg-success";

                    Usuario us = controleAcessoCtrl.buscarUsuario(encryptUtils.encodeString(email));

                    if (us == null) {

                        Entidade entidadeAdd = gestaoCtrl.buscarEntidadeId(idEntidade);
                        Pessoa pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidadeAdd, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));

                        TipoUsuario tipoUsuario = controleAcessoCtrl.buscaTipoUsuarioId(idTipoUsuario);

                        if (pessoa != null) {
                            if (us.getPessoapess().getPessId() != pessoa.getPessId()) {

                                Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                                addUser(entidadeAdd, pessoa, tipoUsuario);

                                List<Usuario> usuarios = controleAcessoCtrl.listaUsuarios();

                                request.getSession().setAttribute("usuarios", usuarios);

                                controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso o usuário para a pessoa com o ID: " + pessoa.getPessId()));

                            } else {

                                msgErro = "Pessoa já associada a um usuário ao sistema";
                                alerta = "bg-error";
                            }

                        } else {

                            GregorianCalendar gc = new GregorianCalendar();
                            gc.setGregorianChange(new Date());
                            XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                            Nacionalidade nasc = gestaoCtrl.buscarNacionalidadeDescricao("TW/Dp2FtYmljYW5h");

                            pessoa = new Pessoa();
                            pessoa.setEncrypted(true);
                            pessoa.setPessDataCadastro(calendar);
                            pessoa.setPessApelido(encryptUtils.encodeString(apelido));
                            pessoa.setPessNome(encryptUtils.encodeString(nome));
                            pessoa.setPessEmail(encryptUtils.encodeString(email));
                            pessoa.setPessSexo(encryptUtils.encodeString(""));
                            pessoa.setNacionalidadenaci(nasc);
                            pessoa.setPessBairro(encryptUtils.encodeString("ND"));
                            pessoa.setPessContacto(encryptUtils.encodeString("ND"));
                            pessoa.setPessFoto(encryptUtils.encodeString("N/D"));
                            pessoa.setEntidade(entidadeAdd);
                            pessoa.setPessCPostal(encryptUtils.encodeString("258"));
                            pessoa.setPessCidade(encryptUtils.encodeString("N/D"));
                            pessoa.setPessProvincia(encryptUtils.encodeString("N/D"));
                            pessoa.setPessBi(encryptUtils.encodeString("N/D"));
                            pessoa.setPessSector(encryptUtils.encodeString("N/D"));
                            pessoa.setPessLocalTrabalho(encryptUtils.encodeString("N/D"));
                            pessoa.setPessDataEmissaoBi(encryptUtils.encodeString("N/D"));
                            pessoa.setPessDataValidadeBi(encryptUtils.encodeString("N/D"));

                            pessoa.setPessActividade(encryptUtils.encodeString(tipoUsuario.getTipuDescricao()));
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
                            pessoa.setPessTipo(encryptUtils.encodeString(tipoUsuario.getTipuDescricao()));
                            pessoa.setPessVicios("");
                            pessoa.setPessNomePai("");
                            pessoa.setPessNumeroCasa("");
                            pessoa.setPessPais("");
                            pessoa.setPessRua("");
                            pessoa.setPessNuit("");

                            gestaoCtrl.persistirPessoa(pessoa);

                            pessoa = gestaoCtrl.buscarPessoaNomeApelido(entidadeAdd, encryptUtils.encodeString(nome), encryptUtils.encodeString(apelido));

                            addUser(entidadeAdd, pessoa, tipoUsuario);
                            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                            @SuppressWarnings("UnusedAssignment")
                            List<Usuario> usuarios = null;

                            if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {

                                usuarios = controleAcessoCtrl.listaUsuarios();

                            } else {
                                usuarios = controleAcessoCtrl.listaDosUsuariosEntidade(entidade);
                            }

                            request.getSession().setAttribute("usuarios", usuarios);

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso o usuário para a pessoa com o ID: " + pessoa.getPessId()));
                        }

                    } else {
                        msgErro = "Usuário já existe no sistema";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("user-add");
                }
                ;
                break;

                case "alterar-estado": {

                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    String to = st.nextToken().split("=")[1];
                    String user = st.nextToken().split("=")[1];

                    String msgErro = "Usuário activo com sucesso";
                    String alerta = "bg-success";
                    String msg = "Activou com sucesso o usuário: " + user;

                    if (to.equals("Inactivo")) {
                        msgErro = "Usuário bloqueado com sucesso";
                        alerta = "bg-warning";
                        msg = "Bloqueiou com sucesso o usuário: " + user;
                    }

                    Usuario us = controleAcessoCtrl.buscarUsuario(encryptUtils.encodeString(user));
                    us.setUsuaEstado(to);

                    controleAcessoCtrl.persistirUsuario(us);
                    controleAcessoCtrl.persistirLog(addLog(usuario, msg));

                    @SuppressWarnings("UnusedAssignment")
                    List<Usuario> usuarios = null;

                    if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {

                        usuarios = controleAcessoCtrl.listaUsuarios();

                    } else {
                        usuarios = controleAcessoCtrl.listaDosUsuariosEntidade(entidade);
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("usuarios", usuarios);

                    response.sendRedirect("user-add");

                }
                ;
                break;

                case "confirmacao": {
                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    /* if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")
                            || usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {
                        response.sendRedirect("VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jYWRtaW4tc2VsZWN0");
                    } else {*/
                    doUpdate(request, response, usuario);
                    //}

                }
                ;
                break;

                case "actualizar-modulos": {

                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");

                    String m1 = request.getParameter("m1");
                    String m2 = request.getParameter("m2");
                    String m3 = request.getParameter("m3");
                    String m4 = request.getParameter("m4");
                    String m5 = request.getParameter("m5");
                    String m6 = request.getParameter("m6");
                    String m7 = request.getParameter("m7");
                    String m8 = request.getParameter("m8");
                    String m9 = request.getParameter("m9");
                    String m10 = request.getParameter("m10");
                    String m11 = request.getParameter("m11");
                    String m12 = request.getParameter("m12");
                    String m13 = request.getParameter("m13");
                    String m14 = request.getParameter("m14");
                    String m15 = request.getParameter("m15");
                    String m16 = request.getParameter("m16");
                    String m17 = request.getParameter("m17");
                    String m18 = request.getParameter("m18");
                    String m19 = request.getParameter("m19");
                    String m20 = request.getParameter("m20");
                    String m21 = request.getParameter("m21");
                    String m22 = request.getParameter("m22");
                    String m23 = request.getParameter("m23");
                    String m24 = request.getParameter("m24");
                    String m25 = request.getParameter("m25");
                    String m26 = request.getParameter("m26");
                    String m27 = request.getParameter("m27");
                    String m28 = request.getParameter("m28");
                    String m29 = request.getParameter("m29");
                    String m30 = request.getParameter("m30");
                    String m31 = request.getParameter("m31");
                    String m32 = request.getParameter("m32");
                    String m33 = request.getParameter("m33");
                    String m34 = request.getParameter("m34");
                    String m35 = request.getParameter("m35");
                    String m36 = request.getParameter("m36");
                    String m37 = request.getParameter("m37");
                    String m38 = request.getParameter("m38");
                    String m39 = request.getParameter("m39");
                    String m40 = request.getParameter("m40");
                    String m41 = request.getParameter("m41");
                    String m42 = request.getParameter("m42");
                    String m43 = request.getParameter("m43");
                    String m44 = request.getParameter("m44");
                    String m45 = request.getParameter("m45");
                    String m46 = request.getParameter("m46");
                    String m47 = request.getParameter("m47");
                    String m48 = request.getParameter("m48");
                    String m49 = request.getParameter("m49");
                    String m50 = request.getParameter("m50");
                    String m51 = request.getParameter("m51");
                    String m52 = request.getParameter("m52");
                    String m53 = request.getParameter("m53");
                    String m54 = request.getParameter("m54");
                    String m55 = request.getParameter("m55");
                    String m56 = request.getParameter("m56");
                    String m57 = request.getParameter("m57");
                    String m58 = request.getParameter("m58");
                    String m59 = request.getParameter("m59");
                    String m60 = request.getParameter("m60");

                    ModulosUsuario muf = (ModulosUsuario) request.getSession().getAttribute("modulosUsuarioSelecionado");

                    if (m1 != null) {
                        muf.setMuiGestao(true);
                    } else {
                        muf.setMuiGestao(false);
                    }

                    if (m2 != null) {
                        muf.setMuiGestaoFormados(true);
                    } else {
                        muf.setMuiGestaoFormados(false);
                    }

                    if (m3 != null) {
                        muf.setMuiGestaoFormadores(true);
                    } else {

                        muf.setMuiGestaoFormadores(false);
                    }

                    if (m4 != null) {
                        muf.setMuiGestaoTurmas(true);
                    } else {
                        muf.setMuiGestaoTurmas(false);

                    }

                    if (m5 != null) {
                        muf.setMuiGestaoInscricoes(true);
                    } else {
                        muf.setMuiGestaoInscricoes(false);

                    }

                    if (m6 != null) {
                        muf.setMuiGestaoCentros(true);
                    } else {

                        muf.setMuiGestaoCentros(false);
                    }

                    if (m7 != null) {
                        muf.setMuiGestaoParceiros(true);
                    } else {

                        muf.setMuiGestaoParceiros(false);
                    }

                    if (m8 != null) {
                        muf.setMuiCursos(true);
                    } else {

                        muf.setMuiCursos(false);
                    }

                    if (m9 != null) {
                        muf.setMuiCursosCursos(true);
                    } else {

                        muf.setMuiCursosCursos(false);
                    }

                    if (m10 != null) {
                        muf.setMuiCursosAreasInscricao(true);
                    } else {

                        muf.setMuiCursosAreasInscricao(false);
                    }

                    if (m11 != null) {
                        muf.setMuiCursosModulos(true);
                    } else {
                        muf.setMuiCursosModulos(false);
                    }

                    if (m12 != null) {
                        muf.setMuiCursosCursosCentro(true);
                    } else {

                        muf.setMuiCursosCursosCentro(false);
                    }

                    if (m13 != null) {
                        muf.setMuiCalendario(true);
                    } else {
                        muf.setMuiCalendario(false);
                    }

                    if (m14 != null) {
                        muf.setMuiCalendarioHorario(true);
                    } else {

                        muf.setMuiCalendarioHorario(false);
                    }

                    if (m15 != null) {
                        muf.setMuiCalendarioTestes(true);
                    } else {
                        muf.setMuiCalendarioTestes(false);
                    }

                    if (m16 != null) {
                        muf.setMuiCalendarioExames(true);
                    } else {
                        muf.setMuiCalendarioExames(false);
                    }

                    if (m17 != null) {
                        muf.setMuiCalendarioRecorrencias(true);
                    } else {
                        muf.setMuiCalendarioRecorrencias(false);
                    }

                    if (m18 != null) {
                        muf.setMuiAvaliacao(true);
                    } else {

                        muf.setMuiAvaliacao(false);
                    }

                    if (m19 != null) {
                        muf.setMuiAvaliacaoNotas(true);
                    } else {
                        muf.setMuiAvaliacaoNotas(false);
                    }

                    if (m20 != null) {
                        muf.setMuiAvaliacaoPautas(true);
                    } else {

                        muf.setMuiAvaliacaoPautas(false);
                    }

                    if (m21 != null) {
                        muf.setMuiAvaliacaoPresencas(true);
                    } else {

                        muf.setMuiAvaliacaoPresencas(false);
                    }

                    if (m22 != null) {
                        muf.setMuiAvaliacaoObservacoes(true);
                    } else {

                        muf.setMuiAvaliacaoObservacoes(false);
                    }

                    if (m23 != null) {
                        muf.setMuiAvaliacaoBoletins(true);
                    } else {

                        muf.setMuiAvaliacaoBoletins(false);
                    }

                    if (m24 != null) {
                        muf.setMuiEstatisticas(true);
                    } else {
                        muf.setMuiEstatisticas(false);

                    }

                    if (m25 != null) {
                        muf.setMuiEstatisticasGerais(true);
                    } else {

                        muf.setMuiEstatisticasGerais(false);
                    }

                    if (m26 != null) {
                        muf.setMuiEstatisticasCurso(true);
                    } else {

                        muf.setMuiEstatisticasCurso(false);
                    }

                    if (m27 != null) {
                        muf.setMuiDespesas(true);
                    } else {

                        muf.setMuiDespesas(false);
                    }

                    if (m28 != null) {
                        muf.setMuiDespesasEstoque(true);
                    } else {
                        muf.setMuiDespesasEstoque(false);

                    }

                    if (m29 != null) {
                        muf.setMuiDespesasInternas(true);
                    } else {
                        muf.setMuiDespesasInternas(false);
                    }

                    if (m30 != null) {
                        muf.setMuiFornecedores(true);
                    } else {
                        muf.setMuiFornecedores(false);

                    }

                    if (m31 != null) {
                        muf.setMuiDespesasExtracto(true);
                    } else {
                        muf.setMuiDespesasExtracto(false);
                    }

                    if (m32 != null) {
                        muf.setMuiPagamentos(true);
                    } else {
                        muf.setMuiPagamentos(false);
                    }

                    if (m33 != null) {
                        muf.setMuiPagamentosTaxas(true);
                    } else {
                        muf.setMuiPagamentosTaxas(false);
                    }

                    if (m34 != null) {
                        muf.setMuiPagamentosPropinas(true);
                    } else {
                        muf.setMuiPagamentosPropinas(false);
                    }

                    if (m35 != null) {
                        muf.setMuiPagamentosMultas(true);
                    } else {

                        muf.setMuiPagamentosMultas(false);
                    }

                    if (m36 != null) {
                        muf.setMuiPagamentosOutrosPagamentos(true);
                    } else {

                        muf.setMuiPagamentosOutrosPagamentos(false);
                    }

                    if (m37 != null) {
                        muf.setMuiPagamentosPagamentosOnline(true);
                    } else {

                        muf.setMuiPagamentosPagamentosOnline(false);
                    }

                    if (m38 != null) {
                        muf.setMuiPagamentosSituacaoPagamentos(true);
                    } else {
                        muf.setMuiPagamentosSituacaoPagamentos(false);
                    }

                    if (m39 != null) {
                        muf.setMuiResultados(true);
                    } else {

                        muf.setMuiResultados(false);
                    }

                    if (m40 != null) {
                        muf.setMuiUsuarios(true);
                    } else {

                        muf.setMuiUsuarios(false);
                    }
                    if (m41 != null) {
                        muf.setMuiUsuariosAdd(true);
                    } else {

                        muf.setMuiUsuariosAdd(false);
                    }
                    if (m42 != null) {
                        muf.setMuiUsuariosPermissoes(true);
                    } else {

                        muf.setMuiUsuariosPermissoes(false);
                    }
                    if (m43 != null) {
                        muf.setMuiUsuariosLogs(true);
                    } else {

                        muf.setMuiUsuariosLogs(false);
                    }
                    if (m44 != null) {
                        muf.setMuiUsuariosStatus(true);
                    } else {
                        muf.setMuiUsuariosStatus(false);
                    }
                    if (m45 != null) {
                        muf.setMuiContratos(true);
                    } else {
                        muf.setMuiContratos(false);
                    }

                    if (m46 != null) {
                        muf.setMuiRequisicoes(true);
                    } else {
                        muf.setMuiRequisicoes(false);
                    }

                    if (m47 != null) {
                        muf.setMuiAprovacaoDespesas(true);
                    } else {
                        muf.setMuiAprovacaoDespesas(false);
                    }

                    if (m48 != null) {
                        muf.setMuiLembres(true);
                    } else {
                        muf.setMuiLembres(false);
                    }

                    if (m49 != null) {
                        muf.setMuiDisciplinas(true);
                    } else {
                        muf.setMuiDisciplinas(false);
                    }

                    if (m50 != null) {
                        muf.setMuiDisciplinasGestao(true);
                    } else {
                        muf.setMuiDisciplinasGestao(false);
                    }

                    if (m51 != null) {
                        muf.setMuiDisciplinasCurso(true);
                    } else {
                        muf.setMuiDisciplinasCurso(false);
                    }

                    if (m52 != null) {
                        muf.setMuiDisciplinasTurma(true);
                    } else {
                        muf.setMuiDisciplinasTurma(false);
                    }

                    if (m53 != null) {
                        muf.setMuiDisciplinasDocente(true);
                    } else {
                        muf.setMuiDisciplinasDocente(false);
                    }

                    if (m54 != null) {
                        muf.setMuiComercial(true);
                    } else {
                        muf.setMuiComercial(false);
                    }

                    if (m55 != null) {
                        muf.setMuiFinanceiro(true);
                    } else {
                        muf.setMuiFinanceiro(false);
                    }

                    if (m56 != null) {
                        muf.setMuiArmazem(true);
                    } else {
                        muf.setMuiArmazem(false);
                    }

                    if (m57 != null) {
                        muf.setMuiBiblioteca(true);
                    } else {
                        muf.setMuiBiblioteca(false);
                    }

                    if (m58 != null) {
                        muf.setMuiConfiguracao(true);
                    } else {
                        muf.setMuiConfiguracao(false);
                    }

                    if (m59 != null) {
                        muf.setMuiProdutos(true);
                    } else {
                        muf.setMuiProdutos(false);
                    }

                    if (m60 != null) {
                        muf.setMuiGuiasRemessa(true);
                    } else {
                        muf.setMuiGuiasRemessa(false);
                    }

                    controleAcessoCtrl.persitirModulosUsuario(muf);

                    String msgErro = "Permissões do usuário actualizados com sucesso";
                    String alerta = "bg-success";
                    String msg = "Activou com sucesso o usuário: " + encryptUtils.decodeString(muf.getUsuario().getPessoapess().getPessNome());

                    List<ModulosUsuario> modulosUsuario = controleAcessoCtrl.listaModulosUsuarios(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, msg));
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("modulosUsuario", modulosUsuario);

                    response.sendRedirect("user-permissions");

                }
                ;
                break;

                case "selecionar-usuario-permissoes": {

                    int idModuloUsuario = Integer.parseInt(request.getParameter("idModuloUsuario"));

                    ModulosUsuario muf = controleAcessoCtrl.buscaModulosUsuarioId(idModuloUsuario);

                    request.getSession().setAttribute("modulosUsuario", (List<ModulosUsuario>) request.getSession().getAttribute("modulosUsuario"));
                    request.getSession().setAttribute("modulosUsuarioSelecionado", muf);

                    response.sendRedirect("user-permissions");
                }
                ;
                break;

                case "reset-senha": {

                    Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
                    String user = st.nextToken().split("=")[1];

                    Usuario us = controleAcessoCtrl.buscarUsuario(encryptUtils.encodeString(user));

                    String senha = encryptUtils.decodeString(us.getPessoapess().getPessNome()).charAt(0) + "" + encryptUtils.decodeString(us.getPessoapess().getPessApelido());

                    us.setUsuaSenha(encryptUtils.encodeString(senha));
                    us.setUsuaRespostaSeguranca(encryptUtils.encodeString(user));
                    us.setUsuaTentativasLogin(0);

                    String msgErro = "Senha e resposta de segurança redefinidas para o padrão com sucesso, SENHA PADRÃO: " + senha;
                    String alerta = "bg-success";
                    String msg = "Redefiniu a senha para padrão com sucesso do utilizador: " + user;

                    controleAcessoCtrl.persistirUsuario(us);
                    controleAcessoCtrl.persistirLog(addLog(usuario, msg));

                    @SuppressWarnings("UnusedAssignment")
                    List<Usuario> usuarios = null;

                    if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador") || usuario.getTipoUsuariotipu().getTipuDescricao().equals("Administrador")) {

                        usuarios = controleAcessoCtrl.listaUsuarios();

                    } else {
                        usuarios = controleAcessoCtrl.listaDosUsuariosEntidade(entidade);
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("usuarios", usuarios);

                    response.sendRedirect("user-add");

                }
                ;
                break;

                case "conexoes": {
                    List<Usuario> usuarios = controleAcessoCtrl.listaDosUsuariosEntidade(entidade);

                    request.getSession().setAttribute("usuarios", usuarios);
                    request.getSession().setAttribute("msgErro", "");
                    request.getSession().setAttribute("alerta", "");

                    response.sendRedirect("user-status");

                }
                ;
                break;

                case "bloquear-sessao": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Usuario usSession = controleAcessoCtrl.buscarUsuarioId(id);

                    usSession.setUsuaOnline("Offline");
                    usSession.setUsuaPresenca(false);

                    controleAcessoCtrl.persistirUsuario(usSession);

                    List<Usuario> usuarios = controleAcessoCtrl.listaDosUsuariosEntidade(entidade);

                    String msgErro = "Sessão do usuário terminada com sucesso";
                    String alerta = "bg-warning";

                    request.getSession().setAttribute("usuarios", usuarios);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("user-status");
                }
                ;
                break;

                case "users": {

                    request.getSession().setAttribute("ip", getUrlServer());

                    data.le_hora();
                    request.getSession().setAttribute("ano", data.getAno());

                    List<TipoUsuario> tiposUsuario = controleAcessoCtrl.listaTiposUsuario();

                    request.getSession().setAttribute("tiposUsuario", tiposUsuario);
                    request.getSession().setAttribute("msgErro", "");
                    request.getSession().setAttribute("alerta", "");

                    response.sendRedirect("user-registration");
                }
                ;
                break;

                case "redefinir-senha": {
                    String user = st.nextToken().split("=")[1];

                    String passNova = request.getParameter("password");
                    String rePassNova = request.getParameter("repassword");

                    String respostaSeguranca = request.getParameter("respostaSeguranca");

                    Usuario usuario = controleAcessoCtrl.buscarUsuario(user);

                    String msgErro = "Senha alterada com sucesso. ";
                    String alerta = "bg-success";

                    if (passNova.equals(rePassNova)) {

                        if (encryptUtils.encodeString(respostaSeguranca).equals(usuario.getUsuaRespostaSeguranca())) {

                            usuario.setUsuaSenha(encryptUtils.encodeString(passNova));

                            controleAcessoCtrl.persistirUsuario(usuario);
                            controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso a sua senha"));
                        } else {
                            msgErro = "A resposta de segurança introduzida, é incorrecta !";
                            alerta = "bg-warning";
                        }

                    } else {

                        msgErro = "Senha não alterada! A nova Senha e a verificação não coincidem.";
                        alerta = "bg-danger";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("user-password-answer");

                }
                ;
                break;

                case "pre-registo": {

                    request.getSession().setAttribute("ip", getUrlServer());

                    data.le_hora();
                    request.getSession().setAttribute("ano", data.getAno());

                    sistema = controleAcessoCtrl.buscaSistemaId(1);
                    request.getSession().setAttribute("sistema", sistema);

                    int id = 1;
                    entidade = gestaoCtrl.buscarEntidadeId(id);

                    request.getSession().setAttribute("entidade", entidade);

                    if (sistema.isSistEstado()) {
                        String act = "accao#pre-registo";

                        response.sendRedirect("QWx1bm9TZXJ2bGV0I0RDSQ==?" + encryptUtils.encodeString(act));
                    } else {
                        response.sendRedirect("error-manitence");
                    }

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

    private String getString(String str) {
        if (str == null) {
            return "";
        } else {
            return str;
        }
    }

    private Log addLog(Usuario u, String desc) {
        data.le_hora();
        Log log = new Log();

        GregorianCalendar gc = new GregorianCalendar();
        gc.setGregorianChange(new Date());
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        entidade = u.getEntidade();

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
        int month = Integer.parseInt(st.nextToken()) - 1;

        String dt = st.nextToken();
        if (dt.startsWith("0")) {
            dt = dt.charAt(dt.length() - 1) + "";
        }
        int day = Integer.parseInt(dt);
        int year = Integer.parseInt(st.nextToken());

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, day);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        return calendar;
    }

    public boolean haveAccount(List<Usuario> usuarios, Pessoa pessoa) {
        for (Usuario u : usuarios) {
            if (u.getPessoapess().getPessId() == pessoa.getPessId()) {
                return true;
            }
        }

        return false;
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response, Usuario usuario)
            throws ServletException, IOException {

        entidade = (Entidade) request.getSession().getAttribute("entidadeSelecionada");

        int idEsc = 50555;
        int local = 0;
        EdstSchool edstSchool = educStatCtrl.buscaEDSTSchool(idEsc, local);
        EdstProvince edstProvince = null;
        EdstDistrict edstDistrict = null;

        if (edstSchool != null) {
            edstDistrict = educStatCtrl.buscaEDSTDistrict(edstSchool.getDistrictId());
        }

        if (edstDistrict != null) {
            edstProvince = educStatCtrl.buscaEDSTProvince(edstDistrict.getProvinceId());
        }

        String nmEscola = "";

        if (edstSchool != null) {

            String niv = "";

            if (usuario.getTipoUsuariotipu() != null) {
                if (usuario.getTipoUsuariotipu().getNivelAcessoniva() != null) {

                    niv = "<span class = 'text-uppercase'> | <b>TIPO UTILIZADOR:</b> " + usuario.getTipoUsuariotipu().getTipuDescricao() + " | <b>NÍVEL ACESSO:</b> " + usuario.getTipoUsuariotipu().getNivelAcessoniva().getNivaDescricao() + "</span>";
                }
            }

            nmEscola = "<span class = 'text-bold text-danger-600 text-uppercase'> " + edstSchool.getAreaId() + "" + edstSchool.getLocal() + " - " + edstSchool.getName() + "</span>" + niv;
        }

        String codEscola = "51160";
        request.getSession().setAttribute("codEscola", codEscola);
        request.getSession().setAttribute("nmEscola", nmEscola);
        request.getSession().setAttribute("edstSchool", edstSchool);
        request.getSession().setAttribute("edstDistrict", edstDistrict);
        request.getSession().setAttribute("edstProvince", edstProvince);

        if (entidade == null) {
            entidade = (Entidade) request.getSession().getAttribute("entidade");
        }

        data.le_hora();

        AnoLectivo anoLectivo = ensinoCtrl.buscaAnoLectivoDescricao(entidade, encryptUtils.encodeString(data.getAno()));

        if (anoLectivo == null) {
            anoLectivo = new AnoLectivo();
            anoLectivo.setAnolCorrente(true);
            anoLectivo.setAnolDescricao(encryptUtils.encodeString(data.getAno()));
            anoLectivo.setAnolStatus(encryptUtils.encodeString("Activo"));
            anoLectivo.setEncrypted(true);
            anoLectivo.setEntidade(entidade);

            ensinoCtrl.persistirAnoLectivo(anoLectivo);

            anoLectivo = ensinoCtrl.buscaAnoLectivoDescricao(entidade, encryptUtils.encodeString(data.getAno()));

        }
        request.getSession().setAttribute("anoLectivoActivo", anoLectivo);

        String url = "main-dashboard";

        String tp = usuario.getTipoUsuariotipu().getTipuDescricao();

        data.le_hora();

        if (tp.equals("Estudante")) {

            Aluno aluno = ensinoCtrl.buscaAlunoPessoaId(usuario.getPessoapess().getPessId());

            int id = aluno.getAlunId();

            url = "QWx1bm9TZXJ2bGV0I0RDSQ==?" + encryptUtils.encodeString("accao#ficha-aluno&ei=" + id + "&to=portal");
        }

        if (tp.equals("Docente")) {

            url = "teacher-dashboard";
        }

        response.sendRedirect(url);

    }

    private String getUrlServer() {
        String urlServer = "localhost";
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\SETTINGS\\inefp\\ip.txt"))) {
                urlServer = br.readLine();
            }
        } catch (IOException exception) {

        }

        return urlServer;
    }

    private void addUser(Entidade entidadeAdd, Pessoa pessoa, TipoUsuario tipoUsuario) {

        String nome = encryptUtils.decodeString(pessoa.getPessNome());
        String apelido = encryptUtils.decodeString(pessoa.getPessApelido());

        String password = (nome.charAt(0) + "" + stringUtils.unaccent(apelido)).toLowerCase();

        Usuario us = new Usuario();
        us.setEntidade(entidadeAdd);
        us.setPessoapess(pessoa);
        us.setUsuaSenha(encryptUtils.encodeString(password));
        us.setUsuaUsuario(pessoa.getPessEmail());
        us.setUsuaCodigoRegistro(entidadeAdd.getEntiSigla() + "#0" + entidadeAdd.getEntiId());
        us.setUsuaEstado("Inactivo");
        us.setUsuaOnline("Offline");
        us.setUsuaStatus("Offline");
        us.setUsuaPresenca(false);
        us.setUsuaTentativasLogin(0);
        us.setTipoUsuariotipu(tipoUsuario);
        us.setUsuaStatusicon("offline.png");
        us.setUsuaDevice("");
        us.setEncrypted(true);
        us.setUsuaFotoperfil("generic-user.png");

        controleAcessoCtrl.persistirUsuario(us);

        us = controleAcessoCtrl.buscarUsuario(pessoa.getPessEmail());

        ModulosUsuario modulosUsuario = new ModulosUsuario();
        modulosUsuario.setEncrypted(true);
        modulosUsuario.setEntidade(entidadeAdd);
        modulosUsuario.setUsuario(us);

        controleAcessoCtrl.persitirModulosUsuario(modulosUsuario);
    }
}
