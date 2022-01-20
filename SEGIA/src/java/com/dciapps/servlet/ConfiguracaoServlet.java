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
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Nacionalidade;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.dciapps.webclientcontroler.VendasCtrl;
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
@WebServlet(name = "Q29uZmlndXJhY2FvU2VydmxldCNEQ0k=", urlPatterns = {"/Q29uZmlndXJhY2FvU2VydmxldCNEQ0k="})
public class ConfiguracaoServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    VendasCtrl vendasCtrl = new VendasCtrl();

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
            entidade = (Entidade) request.getSession().getAttribute("entidade");

            switch (accao) {

                case "nacionalidades": {

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Entrou no formulário de cadastro de tipos de nationalityo"));
                    request.getSession().setAttribute("nacionalidades", gestaoCtrl.listaNacionalidades());
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("nacionalidade", null);
                    response.sendRedirect("nationality");
                }
                ;
                break;

                case "registar-nacionalidade": {

                    String descricao = request.getParameter("descricao");

                    String msgErro = "[NACIONALIDADE] : " + descricao + " adicionada com sucesso ";
                    String alerta = "bg-success";

                    Nacionalidade nacionalidade = gestaoCtrl.buscarNacionalidadeDescricao(encryptUtils.encodeString(descricao));

                    if (nacionalidade != null) {
                        msgErro = "[NACIONALIDADE] : " + descricao + " já existe registada";
                        alerta = "bg-warning";
                    } else {

                        nacionalidade = new Nacionalidade();
                        nacionalidade.setNaciDescricao(encryptUtils.encodeString(descricao));
                        nacionalidade.setEncrypted(true);

                        gestaoCtrl.persistirNacionalidade(nacionalidade);
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso a nacionalidade com a descrição : " + descricao));
                        request.getSession().setAttribute("nacionalidades", gestaoCtrl.listaNacionalidades());

                        descricao = "";

                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    request.getSession().setAttribute("descricao", descricao);

                    response.sendRedirect("nationality");

                }
                ;
                break;

                case "remover-nacionalidade": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    Nacionalidade nacionalidade = gestaoCtrl.buscarNacionalidadeId(id);

                    List<Pessoa> pessoas = gestaoCtrl.listaPessoasNacionalidade(entidade, nacionalidade);

                    String msgErro = "[NACIONALIDADE]: " + encryptUtils.decodeString(nacionalidade.getNaciDescricao()) + ""
                            + " não pode ser removida, elimine primeiro os membros associados";
                    String alerta = "bg-warning";

                    List<Nacionalidade> nacionalidades = (List<Nacionalidade>) request.getSession().getAttribute("nacionalidades");

                    if (pessoas.isEmpty()) {
                        gestaoCtrl.removerNacionalidade(nacionalidade);

                        msgErro = "[NACIONALIDADE]: " + encryptUtils.decodeString(nacionalidade.getNaciDescricao()) + ""
                                + " removido com sucesso";
                        alerta = "bg-success";

                        nacionalidades = gestaoCtrl.listaNacionalidades();
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso a nacionalidade com a descrição : " + encryptUtils.decodeString(nacionalidade.getNaciDescricao())));
                    }

                    request.getSession().setAttribute("nacionalidades", nacionalidades);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("nationality");
                }
                ;
                break;

                case "editar-nacionalidade": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    Nacionalidade nacionalidade = gestaoCtrl.buscarNacionalidadeId(id);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição a nacionalidade com o id: " + id));

                    request.getSession().setAttribute("nacionalidade", nacionalidade);
                    response.sendRedirect("nationality");
                }
                ;
                break;

                case "confirma-editar-nacionalidade": {

                    String descricao = request.getParameter("descricao");

                    Nacionalidade nacionalidadeCheck = gestaoCtrl.buscarNacionalidadeDescricao(encryptUtils.encodeString(descricao));

                    String msgErro = "Dados da nacionalidade actualizados com sucesso";
                    String alerta = "bg-success";

                    Nacionalidade nacionalidade = (Nacionalidade) request.getSession().getAttribute("nacionalidade");

                    if (nacionalidadeCheck == null || encryptUtils.decodeString(nacionalidade.getNaciDescricao()).equals(descricao)) {

                        nacionalidade.setNaciDescricao(encryptUtils.encodeString(descricao));

                        gestaoCtrl.persistirNacionalidade(nacionalidade);
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso os dados da nacionalidade com o id : " + nacionalidade.getNaciId()));
                        request.getSession().setAttribute("nacionalidades", gestaoCtrl.listaNacionalidades());

                    } else {

                        msgErro = "Já existe uma nacionalidade com essa descrição";
                        alerta = "bg-warning";

                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("nationality");
                }
                ;
                break;

                case "cancelar-edicao-nacionalidade": {
                    request.getSession().setAttribute("nacionalidades", (List<Nacionalidade>) request.getSession().getAttribute("nacionalidades"));
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("nacionalidade", null);
                    response.sendRedirect("nationality");

                }
                ;
                break;

                case "imprimir-nacionalidades": {
                    request.getSession().setAttribute("nacionalidades", (List<Nacionalidade>) request.getSession().getAttribute("nacionalidades"));

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Imprimiu a listagem de nacionalidades"));
                    response.sendRedirect("print-nationality");

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

    private double getNumberFromString(String str) {
        double num = 0;

        if (!str.isEmpty()) {
            num = Double.parseDouble(str.replaceAll(",", "."));
        }

        return num;
    }
}
