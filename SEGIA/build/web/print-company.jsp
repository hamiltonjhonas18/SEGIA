<%-- 
    Document   :  -print-company
    Created on : Jun 22, 2017, 6:29:37 PM
    Author     : HJC2K8
--%>

<%@page import="org.joda.time.Days"%>
<%@page import="org.joda.time.DateTime"%>
<%@page import="org.joda.time.DateTime"%>
<%@page import="com.dciapps.webclient.Entidade"%>
<%@page import="com.dciapps.local.LEntidade"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.dciapps.webclient.Usuario"%>
<%@page import="com.dciapps.controller.GenericHandler"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA - Listagem das Empresas</title>

        <!-- Page Description, Author and Keywords -->
        <meta name="description" content="Sistema Electrónico de Gestão de Informação Académica">
        <meta name="author" content="Hamilton Jhonas">
        <meta name="keywords" content="SEGIA, DC Inovaction, Software, Multimedia, Escola, School, Vendas, Stock, Market, Branding, Logo, Hotel, Hotelaria, RH, Recursos Humanos, Controle de Acesso, Web Design, Web Marketing, Development, Hosting" />

        <!-- Favicon -->  <link href="https://fonts.googleapis.com/css?family=Poppins:400,300,100,500,700,900" rel="stylesheet" type="text/css">
        <%
            String ip = "localhost";

            if (session.getAttribute("ip") != null) {
                ip = session.getAttribute("ip").toString();
            } else {
                response.sendRedirect("startup");
            }
        %>
        <link rel="shortcut icon" href="http://<%=ip%>:8081/suc/images/favicons/governo/apple-touch-icon.png">




        <style type="text/css">

            body
            {
                font-family: Poppins;
                font-size: 8px;
                text-align:justify;
            }
            @page {
                counter-increment: page;
                counter-reset: page 1;
                @top-right {
                    content: "Page " counter(page) " of " counter(pages);


                    white-space: nowrap; 
                    z-index: 20px;
                    -moz-border-radius: 5px; 
                    -moz-box-shadow: 0px 0px 4px #222;  
                    background-image: -moz-linear-gradient(top, #eeeeee, #cccccc);  
                    background-image: -moz-linear-gradient(top, #eeeeee, #cccccc); 

                }


            }


            .customers {
                border-collapse: collapse;
                width: 100%;
            }

            .customers td, #customers th {
                border: 1px solid #ddd;
                padding: 7px;
                font-size: 7px;
            }

            .customers tr:nth-child(even){background-color: #f2f2f2;}

            .customers tr:hover {background-color: #ddd;}

            .customers th {
                padding-top: 10px;
                padding-bottom: 10px;
                text-align: left;
                background-color: #4CAF50;
                color: white;
            }

        </style>
        <%

            int timeout = session.getMaxInactiveInterval();

            GenericHandler gh = new GenericHandler(request, response);
            Usuario usuario = gh.loggedUser();

            String nome = "";
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            EncryptUtils encryptUtils = new EncryptUtils();

            List<LEntidade> lentidades = null;

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());

                lentidades = (List<LEntidade>) session.getAttribute("lentidades");

                response.setHeader("Refresh", timeout + "; URL =VXN1YXJpb1NlcnZsZXQjRENJ?" + encryptUtils.encodeString("accao#lockscreen&user=" + encryptUtils.decodeString(usuario.getUsuaUsuario())));

            }
        %>
    </head>

    <body onload="window.print();" oncontextmenu="return false">
        <table width="100%" border="0">

            <thead>
                <tr>
                    <th  style="font-weight:normal; text-align:left;">

            <table >
                <tr><td><img width="135px" height="135px" style="margin-left:-20px;" src="http://<%=ip%>:8081/suc/images/app-icons/gestaonline-logo.png"/></td></tr>
                <tr>
                    <td style="font-size:10px;"> <b> GESTAONLINE S.A</b> </td>
                </tr>
                <tr>
                    <td style="max-width:300px;"> Av. 25 de Setembro, Prédio Santos Gil nº 1509, 2º andar D, Porta nº 8,<br>Moçambique </td>
                </tr>
                <tr><td><br></td></tr>
                <tr>
                    <td> Tel: +258 21 084 973</td>
                </tr>
                <tr>
                    <td> info@gestaonline.co.mz | suporte@gestaonline.co.mz | comercial@gestaonline.co.mz</td>
                </tr>
            </table>


        </th>
    </tr>

    <tr>

        <th scope="col" colspan="8">
    <table width="100%">
        <tr>
            <td><br></td>
        </tr>
        <tr>
            <td style="font-weight:bold; font-size:12px;">LISTAGEM DAS EMPRESAS SIMPLEX</td>
        </tr>
        <tr>
            <td><hr style="font-weight:bold; height:3px; color:#000; background-color:#000;"></td>
        </tr>
        <tr>
            <td><br></td>
        </tr>
        <tr>
            <td>
                <table width="100%">

                </table>
            </td>
        </tr>
    </table>
</th>
</tr>
</thead>

<tbody>

    <tr>
        <td scope="col" colspan="8">

            <table width="100%" class="customers">


                <thead>

                    <tr>
                        <td style="text-align:left;border-bottom:3pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">#</td>
                        <td style="text-align:left;border-bottom:5pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">Descrição</td>
                        <td style="text-align:left;border-bottom:5pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">PESSOA DE CONTACTO</td>
                        <td style="text-align:left;border-bottom:5pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">contacto</td>
                        <td style="text-align:left;border-bottom:5pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">endereço</td>
                        <td style="text-align:left;border-bottom:5pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">ass. ini</td>
                        <td style="text-align:left;border-bottom:5pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">ass.fim</td>
                        <td style="text-align:left;border-bottom:5pt solid #666; border-width:medium; text-transform:uppercase; font-weight:bold;">situação</td>

                    </tr>

                </thead>
                <tbody>
                    <%
                        if (lentidades != null) {
                            for (LEntidade le : lentidades) {

                                Entidade e = le.getEntidade();

                                int id = e.getEntiId();

                                String s1 = encryptUtils.decodeString(e.getEntiNome());
                                String s2 = encryptUtils.decodeString(e.getEntiPessoaContacto());
                                String s3 = encryptUtils.decodeString(e.getEntiContactos1());
                                String s4 = encryptUtils.decodeString(e.getEntiEndereco());
                                String s5 = "---";
                                String s6 = "---";
                                String s7 = "---";

                                int diasTrial = -1;
                                String lbl = "666666";

                                if (e.getEntiDataInicioAssitencia() != null) {
                                    s5 = sdf2.format(e.getEntiDataInicioAssitencia().toGregorianCalendar().getTime());

                                }
                                if (e.getEntiDataFinalAssistencia() != null) {

                                    Date dtaProx = e.getEntiDataFinalAssistencia().toGregorianCalendar().getTime();
                                    Date dtaHoje = new Date();
                                    diasTrial = Days.daysBetween(new DateTime(dtaHoje), new DateTime(dtaProx)).getDays();

                                    s7 = diasTrial + " dias restantes";
                                    if (diasTrial >= 6 && diasTrial < 15) {
                                        lbl = "FB8C00";
                                    }

                                    if (diasTrial >= 0 && diasTrial < 6) {
                                        lbl = "E53935";
                                    }

                                    if (diasTrial > 15) {
                                        lbl = "43A047";
                                    }

                                    if (diasTrial == 1) {
                                        s7 = diasTrial + " dia restante";
                                    }

                                    if (diasTrial < 0) {
                                        s7 = "Suspenso á " + (diasTrial * -1) + " dias";
                                    }

                                    s6 = sdf2.format(e.getEntiDataFinalAssistencia().toGregorianCalendar().getTime());
                                }

                    %>
                    <tr>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin;display: table-cell;vertical-align: middle;"><%=id%></td>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin; max-width:300px;"><%=s1%></td>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin; max-width:300px;"><%=s2%></td>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin;display: table-cell;vertical-align: middle;"><%=s3%></td>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin; max-width:300px;"><%=s4%></td>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin;display: table-cell;vertical-align: middle;"><%=s5%></td>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin;display: table-cell;vertical-align: middle;"><%=s6%></td>
                        <td style="text-align:left;border-right:0.01em  solid #bababa; border-width:0.01em thin;display: table-cell;vertical-align: middle; color: #ffffff !important; background-color: #<%=lbl%> !important"><%=s7%></td>
                    </tr>
                    <%              }
                        }
                    %>

                </tbody>
            </table>
        </td>
    </tr>
</tbody>


<tfoot>

    <tr>
        <td scope="col" colspan="8" style="height:40px;"></td>
    </tr>
    <tr>
        <td  scope="col" colspan="8" ><hr style="font-weight:bold; height:3px; color:#000; background-color:#000;"></td>
    </tr>



    <tr>
        <td scope="col" colspan="8" style="height:10px;"></td>
    </tr>

    <tr>
        <td scope="col" colspan="8">
            Data de Impressão: <%=sdf.format(new Date())%> <br>
            Documento processado por computador © SEGIA/ Impresso por: <%=nome.toUpperCase()%>
        </td>
    </tr>
</tfoot>
</table>
</body>

<script>

    <%
        String clock = request.getParameter("clock");
        if (clock
                == null) {
            clock = "30";
        }
    %>
    var timeout = <%=clock%>;
    function timer()
    {
        if (--timeout > 0)
        {
            window.setTimeout("timer()", 1000);
        }
        else
        {
            window.close();
            ///disable submit-button etc
        }
    }
    //-->
</script>

<script>

    timer();
    //-->
</script>
</html>
