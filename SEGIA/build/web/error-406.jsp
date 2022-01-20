<%-- 
    Document   : dc-error-406
    Created on : Jun 1, 2016, 12:56:13 PM
    Author     : HJC2K8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA - Acesso Negado</title>

        <!-- Page Description, Author and Keywords -->
        <meta name="description" content="Sistema Electrónico de Gestão de Informação Académica">
        <meta name="author" content="Hamilton Jhonas">
        <meta name="keywords" content="SEGIA, DC Inovaction, Software, Multimedia, Escola, School, Vendas, Stock, Market, Branding, Logo, Hotel, Hotelaria, RH, Recursos Humanos, Controle de Acesso, Web Design, Web Marketing, Development, Hosting" />

        <!-- Favicon -->
        <%
            String ip = "localhost";

            if (session.getAttribute("ip") != null) {
                ip = session.getAttribute("ip").toString();
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

    </head>

    <body oncontextmenu="return false">

        <video poster="assets/images/vd-login.png" id="bgvid" playsinline autoplay muted loop>
            <source src="assets/videos/demo.webm" type="video/webm">
            <source src="assets/videos/demo.mp4" type="video/mp4">
        </video>

        <script>
            (function () {
                /**
                 * Video element
                 * @type {HTMLElement}
                 */
                var video = document.getElementById("my-video");

                /**
                 * Check if video can play, and play it
                 */
                video.addEventListener("canplay", function () {
                    video.play();
                });
            })();
        </script>

        <!-- Main navbar -->
        <div class="navbar navbar-inverse">
            <div class="navbar-header">
                <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;"> Sistema Electrónico de Gestão de Informação Académica </h6>

                <ul class="nav navbar-nav pull-right visible-xs-block">
                    <li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
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


                    <!-- Error wrapper -->
                    <div class="container-fluid text-center">
                        <h1 class="error-title"><i class="icon-user-cancel text-warning-600" style="font-size:150px"></i></h1>
                        <h6 class="text-semibold content-group text-grey-800">A sua conta não tem permissão para aceder a este módulo !<br>Volte a página de login ou contacte-nos atráves do endereço <a href='mailto:support@dcinovaction.com'><strong>support@dcinovaction.com</strong></a><br><center>Obrigado!</center> </h6>

                        <div class="row">
                            <div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3">
                                <form  class="main-search">

                                    <div class="row">
                                        <div class="col-sm-6  col-sm-offset-3">
                                            <a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jY2hlY2tCcm93c2VyJm5hdmVnYWRvcj1hbnk=" class="btn text-bold text-uppercase bg-primary-600 btn-block content-group"><i class="icon-circle-left2 position-left"></i> Voltar ao login</a>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- /error wrapper -->

                </div>
                <!-- /main content -->

            </div>
            <!-- /page content -->


            <!-- Footer -->
            <div class="footer text-bold">
                <%
                    String ano = "---";
                    
                    if(session.getAttribute("ano") != null)
                    {
                        ano = session.getAttribute("ano").toString();
                    }
                %>
                &copy; <%=ano%>. <a href="#" class="text-bold">SEGIA</a>. Todos os direitos reservados
            </div>
            <!-- /footer -->

        </div>
        <!-- /page container -->

    </body>
</html>
