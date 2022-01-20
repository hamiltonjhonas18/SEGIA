<%-- 
    Document   : dc-user-login
    Created on : May 27, 2016, 7:25:52 AM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.Sistema"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page import="com.dciapps.webclient.Browser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA - Login</title>

        <!-- Page Description, Author and Keywords -->
        <meta name="description" content="Sistema Electrónico de Gestão de Informação Académica">
        <meta name="author" content="Hamilton Jhonas">
        <meta name="keywords" content="SEGIA, DC Inovaction, Software, Multimedia, Escola, School, Vendas, Stock, Market, Branding, Logo, Hotel, Hotelaria, RH, Recursos Humanos, Controle de Acesso, Web Design, Web Marketing, Development, Hosting" />

        <!-- Favicon -->
        <%
            String ip = "localhost";

            if (session.getAttribute("ip") != null) {
                ip = session.getAttribute("ip").toString();
                Sistema sistema = (Sistema) session.getAttribute("sistema");

                if (!sistema.isSistEstado()) {
                    response.sendRedirect("error-manitence");
                }

            } else {
                response.sendRedirect("startup");
            }
        %>
        <link rel="shortcut icon" href="http://<%=ip%>:8081/suc/images/favicons/governo/apple-touch-icon.png">


        <!-- Global stylesheets -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:400,300,100,500,700,900" rel="stylesheet" type="text/css">
        <link href="assets/css/icons/icomoon/styles.css" rel="stylesheet" type="text/css">
        <link href="assets/css/minified/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="assets/css/minified/core.min.css" rel="stylesheet" type="text/css">
        <link href="assets/css/minified/components.min.css" rel="stylesheet" type="text/css">
        <link href="assets/css/minified/colors.min.css" rel="stylesheet" type="text/css">
        <link href="assets/css/minified/bg.css" rel="stylesheet" type="text/css">
        <!-- /global stylesheets -->

        <!-- Core JS files -->
        <script type="text/javascript" src="assets/js/plugins/loaders/pace.min.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/jquery.min.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/loaders/blockui.min.js"></script>
        <!-- /core JS files -->


        <!-- Theme JS files -->
        <script type="text/javascript" src="assets/js/core/app.js"></script>
        <!-- /theme JS files -->

        <%

            String msgErro = session.getAttribute("msgErro").toString();
            String alerta = session.getAttribute("alerta").toString();

            Browser browser = null;
            EncryptUtils encryptUtils = new EncryptUtils();
        %>

        <!-- START NOTIFICATION -->


        <!-- /Notification JS files -->
        <script type="text/javascript" src="assets/js/plugins/notifications/jgrowl.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/notifications/sweet_alert.min.js"></script>
        <!-- /Notification JS files -->
        <script>

            jQuery(function () {

                // Defaults override - hide "close all" button
                $.jGrowl.defaults.closer = false;

                var erro = '<%=msgErro%>';
                var bg = '<%=alerta%>';
                var hd = "Notificação do Sistema";
                var cl = "#66BB6A";
                var tp = "success";

                if (bg !== '')
                {
                    /*$.jGrowl(erro, {
                     position: 'center',
                     header: hd,
                     theme: bg
                     });*/

                    if (bg === 'bg-error')
                    {
                        cl = "#EF5350";
                        tp = "error";
                    }

                    if (bg === 'bg-warning')
                    {
                        cl = "#FF7043";
                        tp = "warning";
                    }


                    swal({
                        title: hd,
                        text: erro,
                        confirmButtonColor: cl,
                        type: tp,
                        timer: 5000
                    });
                }


            });
        </script>	
        <!-- END NOTIFICATION -->
    </head>

    <body oncontextmenu="return false">


        <!-- Main navbar -->
        <div class="navbar navbar-inverse">
            <div class="navbar-header">
                <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;"> Sistema Electrónico de Gestão de Informação Académica </h6>

                <ul class="nav navbar-nav pull-right visible-xs-block">
                    <li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
                </ul>
            </div>

            <div class="navbar-collapse collapse" id="navbar-mobile">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="#">
                            <i class="icon-display4"></i> <span class="visible-xs-inline-block position-right"></span>
                        </a>
                    </li>

                    <li>
                        <a href="#">
                            <i class="icon-user-tie"></i> <span class="visible-xs-inline-block position-right"> </span>
                        </a>
                    </li>

                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-cog3"></i>
                            <span class="visible-xs-inline-block position-right"> </span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- /main navbar -->


        <!-- Page container -->
        <div class="page-container login-container">

            <!-- Page content -->
            <div class="page-content">

                <!-- Main content -->
                <div class="content-wrapper">

                    <!-- Simple login form -->
                    <form method="post" accept-charset="ISO-8859-1" action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jbG9naW4=">
                        <div class="panel panel-body login-form">
                            <center>	<img src="http://<%=ip%>:8081/suc/images/app-icons/governo.png" alt="" class="img-responsive" style="width:50%; max-width: 72px;">

                                <small class="text-bold"><br>REPÚBLICA DE MOÇAMBIQUE<br></small>
                                
                                
                                <small>
                                    MINISTÉRIO DA EDUCAÇÃO E <br> DESENVOLVIMENTO HUMANO</small>
                            </center>

                            <div class="text-center">
                                <%

                                    String user = "";
                                    String password = "";
                                    String chk = "";
                                    String nome = "Efectue o seu login";
                                    if (browser != null) {

                                        chk = "readonly";
                                        nome = encryptUtils.decodeString(browser.getUsuario().getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(browser.getUsuario().getPessoapess().getPessApelido());
                                        user = encryptUtils.decodeString(browser.getUsuario().getUsuaUsuario());

                                        if (browser.getBroLembre().equals("on")) {
                                            password = browser.getUsuario().getUsuaSenha();
                                            chk = "checked";
                                        }

                                %>
                                <div class="thumb thumb-rounded" style="width:100px; height: 100px">
                                    <img src="http://<%=ip%>:8081/suc/images/profile-pictures/<%=browser.getUsuario().getUsuaFotoperfil()%>" alt="">
                                    <div class="caption-overflow">
                                        <span>
                                            <a href="#" class="btn text-bold text-uppercase border-white btn-flat btn-icon btn-rounded btn-xs"><i class="icon-collaboration"></i></a>
                                            <a href="#" class="btn text-bold text-uppercase border-white btn-flat btn-icon btn-rounded btn-xs ml-5"><i class="icon-question7"></i></a>
                                        </span>
                                    </div>
                                </div>
                                <%                                } else {
                                %>

                                <div class="icon-object border-slate-300 text-slate-300"><i class="icon-reading"></i></div>
                                    <%
                                        }
                                    %>
                                <h6 class="content-group"><%=nome%> <small class="display-block">Introduza as suas credenciais abaixo</small></h6>
                            </div>

                            <div class="form-group has-feedback has-feedback-left">
                                <input type="text" class="form-control" placeholder="Username"  name="email" required="" value="<%=user%>" <%=chk%>>
                                <div class="form-control-feedback">
                                    <i class="icon-user text-muted"></i>
                                </div>

                                <%
                                    if (!user.isEmpty()) {
                                %>
                                <span class="help-block text-teal"><i class="icon-arrow-resize7 position-left"></i> <a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jY2hlY2tCcm93c2VyJm5hdmVnYWRvcj1ub3Zv">Usar uma conta diferente</a></span>
                                <%
                                    }
                                %>

                            </div>

                            <div class="form-group has-feedback has-feedback-left">
                                <input type="password" class="form-control" placeholder="Password" name="password" required=""/>
                                <div class="form-control-feedback">
                                    <i class="icon-lock2 text-muted"></i>
                                </div>
                            </div>

                            <div class="form-group">
                                <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800 btn-block">Iniciar a sessão <i class="icon-circle-right2 position-right"></i></button>
                            </div>

                            <div class="text-center">
                                <a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jZXNxdWVjZXUtc2VuaGE=">Recupere a sua senha</a>
                            </div>
                        </div>
                    </form>
                    <!-- /simple login form -->

                </div>
                <!-- /main content -->

            </div>
            <!-- /page content -->


            <!-- Footer -->
            <div class="footer text-bold">
                <%
                    String ano = session.getAttribute("ano").toString();
                %>
                &copy; <%=ano%>. <a href="#" class="text-bold">SEGIA</a>. Todos os direitos reservados
            </div>
            <!-- /footer -->

        </div>
        <!-- /page container -->

    </body>
</html>
