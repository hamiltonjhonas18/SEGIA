<%-- 
    Document   : dashboard
    Created on : May 30, 2016, 6:21:35 AM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.ModulosUsuario"%>
<%@page import="org.joda.time.Days"%>
<%@page import="org.joda.time.DateTime"%>
<%@page import="org.joda.time.DateTime"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Date"%>
<%@page import="com.dciapps.webclient.Referencia"%>
<%@page import="com.dciapps.webclient.Pessoa"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.webclient.Usuario"%>
<%@page import="com.dciapps.controller.GenericHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head><!DOCTYPE html>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Gestaonline - Configuração & Parametrização</title>


    <!-- Page Description, Author and Keywords -->
    <meta name="description" content="Sistema Electrónico de Gestão de Informação Académica">
    <meta name="author" content="Hamilton Jhonas">
    <meta name="keywords" content="SEGIA, DC Inovaction, Software, Multimedia, Escola, School, Vendas, Stock, Market, Branding, Logo, Hotel, Hotelaria, RH, Recursos Humanos, Controlo de Acesso, Web Design, Web Marketing, Development, Hosting" />

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
    <link href="assets/css/icons/fontawesome/styles.min.css" rel="stylesheet" type="text/css">
    <link href="assets/css/minified/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="assets/css/minified/core.min.css" rel="stylesheet" type="text/css">
    <link href="assets/css/minified/components.min.css" rel="stylesheet" type="text/css">
    <link href="assets/css/minified/colors.min.css" rel="stylesheet" type="text/css">
    <!-- /global stylesheets -->

    <!-- Core JS files -->
    <script type="text/javascript" src="assets/js/plugins/loaders/pace.min.js"></script>
    <script type="text/javascript" src="assets/js/core/libraries/jquery.min.js"></script>
    <script type="text/javascript" src="assets/js/core/libraries/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/loaders/blockui.min.js"></script>
    <!-- /core JS files -->


    <!-- Theme JS files -->
    <script type="text/javascript" src="assets/js/plugins/forms/selects/select2.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/tables/datatables/datatables.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/tables/datatables/extensions/responsive.min.js"></script>

    <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3_tooltip.js"></script>
    <script type="text/javascript" src="assets/js/plugins/forms/styling/switchery.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/forms/selects/bootstrap_multiselect.js"></script>
    <script type="text/javascript" src="assets/js/plugins/ui/moment/moment.min.js"></script>
    <script type="text/javascript" src="assets/js/plugins/pickers/daterangepicker.js"></script>


    <script type="text/javascript" src="assets/js/pages/datatables_responsive.js"></script>
    <script type="text/javascript" src="assets/js/plugins/visualization/echarts/echarts.js"></script>

    <script type="text/javascript" src="assets/js/core/app.js"></script>
    <!-- /theme JS files -->

    <%

        int timeout = session.getMaxInactiveInterval();

        GenericHandler gh = new GenericHandler(request, response);
        Usuario usuario = gh.loggedUser();

        String nome = "";
        String fotoPerfil = "";
        String cargo = "";
        int idUsuario = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        EncryptUtils encryptUtils = new EncryptUtils();

        ModulosUsuario mARKET = null;

        if (usuario != null) {

            nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
            fotoPerfil = usuario.getUsuaFotoperfil();
            cargo = encryptUtils.decodeString(usuario.getPessoapess().getPessActividade());
            idUsuario = usuario.getUsuaId();

            mARKET = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

            response.setHeader("Refresh", timeout + "; URL =VXN1YXJpb1NlcnZsZXQjRENJ?" + encryptUtils.encodeString("accao#lockscreen&user=" + encryptUtils.decodeString(usuario.getUsuaUsuario())));

        }
    %>
</head>

<body oncontextmenu="return false">

    <!-- Main navbar -->
    <div class="navbar navbar-inverse">
        <div class="navbar-header">
            <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;">Sistema Electrónico de Gestão de Informação Académica</h6>

            <ul class="nav navbar-nav visible-xs-block">
                <li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
                <li><a class="sidebar-mobile-main-toggle"><i class="icon-paragraph-justify3"></i></a></li>
            </ul>
        </div>

        <div class="navbar-collapse collapse" id="navbar-mobile">






            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown language-switch">
                    <a class="dropdown-toggle" data-toggle="dropdown">
                        <img src="assets/images/flags/mz.png" class="position-left" alt="">
                        Português
                        <span class="caret"></span>
                    </a>

                    <ul class="dropdown-menu">
                        <li><a class="english"><img src="assets/images/flags/gb.png" alt=""> English</a></li>


                    </ul>
                </li>


                <li class="dropdown dropdown-user">
                    <a class="dropdown-toggle" data-toggle="dropdown">
                        <img src="http://<%=ip%>:8081/suc/images/profile-pictures/<%=fotoPerfil%>" alt="<%=nome%>">
                        <span class="text-bold text-uppercase"><%=nome%></span>
                        <i class="caret"></i>
                    </a>

                    <ul class="dropdown-menu dropdown-menu-right">
                        <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jdmVyLXBlcmZpbA=="><i class="icon-user-plus"></i> Definições da Conta</a></li>


                        <li class="divider"></li>
                        <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jbG9nb3V0"><i class="icon-switch2"></i> Terminar Sessão</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!-- /main navbar -->

    <!-- Page header -->
    <div class="page-header">
        <div class="breadcrumb-line breadcrumb-line-wide">

            <%
                String nmEscola = "";

                if (session.getAttribute("nmEscola") != null) {
                    nmEscola = session.getAttribute("nmEscola").toString();
                }
            %>

            <ul class="breadcrumb">
                <li><a href="#"><i class="icon-home2 position-left"></i> <%=nmEscola%></a></li>
            </ul>
        </div>

        <div class="page-header-content">
            <div class="page-title">
            </div>

            <div class="heading-elements">
                <div class="heading-btn-group">
                    <form method="post" action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jZG9VcGRhdGU=">
                        <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn btn-labeled btn-labeled-left bg-danger-400 heading-btn text-bold text-uppercase">Voltar ao painel principal<b><i class="icon-chevron-left"></i></b></button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- /page header -->


    <!-- Page container -->
    <div class="page-container">

        <!-- Page content -->
        <div class="page-content">





            <!-- Main sidebar -->
            <div class="sidebar sidebar-main">
                <div class="sidebar-content">


                    <!-- Main navigation -->
                    <div class="sidebar-category sidebar-category-visible">
                        <div class="category-title h6">
                            <span>Navegação Principal</span>
                            <ul class="icons-list">
                                <li><a href="#" data-action="collapse"></a></li>
                            </ul>
                        </div>

                        <div class="category-content sidebar-user">
                            <div class="media">
                                <a href="#" class="media-left"><img src="http://<%=ip%>:8081/suc/images/profile-pictures/<%=fotoPerfil%>" class="img-circle img-sm" alt="<%=nome%>"></a>
                                <div class="media-body">
                                    <span class="media-heading text-semibold"><%=nome%></span>
                                    <div class="text-size-mini text-muted">
                                        <i class="icon-briefcase text-size-small"></i> &nbsp;<%=cargo%>
                                    </div>
                                </div>

                                <div class="media-right media-middle">
                                    <ul class="icons-list">
                                        <li>
                                            <a href="#"><i class="icon-cog3"></i></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="category-content no-padding">
                            <ul class="navigation navigation-main navigation-accordion">

                                <!-- Main -->
                                <li class="navigation-header"><span>Main</span> <i class="icon-menu" title="Main pages"></i></li>
                                <li class="active"><a href="TW9kdWxvU2VydmxldCNEQ0k=?YWNjYW8jY29uZmlndXJhY2Fv"><i class="icon-home4"></i> <span class="text-bold text-uppercase">Dashboard</span></a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="Q2VudHJvU2VydmxldCNEQ0k=?YWNjYW8jY2VudHJvcw==" class="nav-link"><i class="icon-office"></i> Escolas</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jY3Vyc29z" class="nav-link"><i class="icon-book"></i> Classes</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jY3Vyc29zLWNlbnRybw=="><i class="icon-stack"></i> Classes por Escola</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?YWNjYW8jZGlzY2lwbGluYXM=" class="nav-link"><i class="icon-book3"></i> Disciplinas</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?YWNjYW8jZGlzY2lwbGluYXNDdXJzbw==" class="nav-link"><i class="icon-archive"></i> Disciplinas por Classe</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jYXJlYXM=" class="nav-link"><i class="icon-graduation2"></i> Categorias Ensino</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="RXNjb2xhU2VydmxldCNEQ0k=?YWNjYW8jZGlyZWN0b3Jlcw==" class="nav-link"><i class="icon-user-tie"></i> Directores Escolas</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jdGF4YXM="><i class="icon-cash"></i> Taxas da Escola</a></li>
                                <li class="nav-item text-bold text-uppercase"><a href="Q29uZmlndXJhY2FvU2VydmxldCNEQ0k=?YWNjYW8jbmFjaW9uYWxpZGFkZXM="><i class="icon-earth"></i> Nacionalidades</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- /main navigation -->

                </div>
            </div>
            <!-- /main sidebar -->



            <!-- Main content -->
            <div class="content-wrapper">


                <!-- Toolbar -->
                <div class="navbar navbar-default navbar-component navbar-xs">
                    <ul class="nav navbar-nav visible-xs-block">
                        <li class="full-width text-center"><a data-toggle="collapse" data-target="#navbar-filter"><i class="icon-menu7"></i></a></li>
                    </ul>

                    <div class="navbar-collapse collapse" id="navbar-filter">
                        <ul class="nav navbar-nav element-active-orange-400">
                            <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-cog2 spinner position-left"></i> Configurações <span class="text-danger-400"> (Painel Principal)</span></a></li>
                        </ul>

                    </div>
                </div>
                <!-- /toolbar -->

                <!-- Main charts -->
                <div class="row">
                    <div class="col-lg-10">

                        <!-- Error wrapper -->
                        <div class="container-fluid text-center">
                            <h1 class="error-title text-center">

                                <center>
                                    <img src="http://<%=ip%>:8081/suc/images/app-icons/governo.png" alt="" class="img-responsive" style="width:50%; max-width: 150px;">

                                </center>

                            </h1>
                            <h6 class="text-bold content-group text-grey-800">
                                REPÚBLICA DE MOÇAMBIQUE<br>
                                MINISTÉRIO DA EDUCAÇÃO E DESENVOLVIMENTO HUMANO
                            </h6>

                            <div class="row">
                                <div class="col-lg-4 col-lg-offset-4 col-sm-6 col-sm-offset-3">
                                    <form  class="main-search">

                                        <div class="row">
                                            <div class="col-sm-12">
                                                <button class="btn text-bold text-uppercase bg-slate-600 btn-block content-group"> CONFIGURAÇÃO E PARAMETRIZAÇÃO</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- /error wrapper -->
                    </div>
                </div>
                <!-- /main charts -->



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

    <script type="text/javascript" src="assets/js/pages/picker_date.js"></script>

</body>
</html>
