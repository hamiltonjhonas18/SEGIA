<%-- 
    Document   : user-logs
    Created on : Feb 11, 2017, 7:30:25 PM
    Author     : HJC2K8
--%>

<%@page import="java.util.List"%>
<%@page import="com.dciapps.webclient.Log"%>
<%@page import="com.dciapps.webclient.Usuario"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.dciapps.controller.GenericHandler"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page import="com.dciapps.webclient.ModulosUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA - Logs</title>

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

        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/datepicker.min.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/effects.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/ui/moment/moment.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/daterangepicker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.date.js"></script>

        <script type="text/javascript" src="assets/js/core/app.js"></script>



        <script type="text/javascript" src="assets/js/pages/form_layouts.js"></script>
        <script type="text/javascript" src="assets/js/pages/datatables_responsive.js"></script>
        <script type="text/javascript" src="assets/js/pages/picker_date.js"></script>
        <!-- /theme JS files -->

        <%

            int timeout = session.getMaxInactiveInterval();

            GenericHandler gh = new GenericHandler(request, response);
            Usuario usuario = gh.loggedUser();

            String nome = "";
            String fotoPerfil = "";
            String cargo = "";

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
            EncryptUtils encryptUtils = new EncryptUtils();

            ModulosUsuario mARKET = null;
            List<Log> logs = null;

            String dataSelecionada = "";
            String periodo = "";

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mARKET = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                logs = (List<Log>) session.getAttribute("logs");

                dataSelecionada = session.getAttribute("dataSelecionadaLogs").toString();
                periodo = session.getAttribute("periodoLogs").toString();

                response.setHeader("Refresh", timeout + "; URL =VXN1YXJpb1NlcnZsZXQjRENJ?" + encryptUtils.encodeString("accao#lockscreen&user=" + encryptUtils.decodeString(usuario.getUsuaUsuario())));

            }
        %>

    </head>

    <body oncontextmenu="return false"  class="navbar-top">



        <!-- Main navbar -->
        <div class="navbar navbar-inverse  navbar-fixed-top">
            <div class="navbar-header">
                <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;">Sistema Electrónico de Gestão de Informação Académica </h6>

                <ul class="nav navbar-nav visible-xs-block">
                    <li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
                    <li><a class="sidebar-mobile-main-toggle"><i class="icon-paragraph-justify3"></i></a></li>
                </ul>
            </div>

            <div class="navbar-collapse collapse" id="navbar-mobile">
                <ul class="nav navbar-nav">
                    <li><a class="sidebar-control sidebar-main-toggle hidden-xs"><i class="icon-paragraph-justify3"></i></a></li>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown language-switch">
                        <a class="dropdown-toggle" data-toggle="dropdown">
                            <img src="assets/images/flags/mz.png" class="position-left" alt="">
                            Português
                            <span class="caret"></span>
                        </a>


                        <!-- <ul class="dropdown-menu">
                             <li><a class="english"><img src="assets/images/flags/gb.png" alt=""> English</a></li>
                         </ul> -->
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
                            <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jbG9nb3V0I0RDSQ=="><i class="icon-switch2"></i> Terminar Sessão</a></li>
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
                            <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase text-uppercase text-bold btn-labeled btn-labeled-left bg-danger-400 heading-btn">Voltar ao painel principal<b><i class="icon-chevron-left"></i></b></button>
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


                        <!-- REQUISIÇÕES -->
                        <div class="sidebar-category">
                            <div class="category-title">
                                <span><B>GESTÃO DE UTILIZADORES</B></span>
                                <ul class="icons-list">
                                    <li><a href="#" data-action="collapse"></a></li>
                                </ul>
                            </div>

                            <div class="category-content">
                                <div class="row">
                                    <div class="col-xs-12">
                                        <form action="TW9kdWxvU2VydmxldCNEQ0k=?YWNjYW8jY29udHJvbG8tYWNlc3Nv" method="post">
                                            <button class="btn  bg-slate-800 btn-block btn-float btn-float-lg" type="submit"><i class="icon-meter-fast"></i> <span class="text-bold text-uppercase">Painel Principal</span></button>
                                        </form>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12">
                                        <br>
                                        <form action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jdXN1YXJpb3M=" method="post">
                                            <button class="btn  bg-slate-800 btn-block btn-float btn-float-lg" type="submit"><i class="icon-user-plus"></i> <span class="text-bold text-uppercase">Utilizadores</span></button>
                                        </form>
                                    </div>
                                </div>

                                <div class="row">

                                    <div class="col-xs-12">
                                        <br>

                                        <form action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jcGVybWlzc29lcw==" method="post">
                                            <button class="btn  bg-slate-800 btn-block btn-float btn-float-lg" type="submit"><i class="icon-user-lock"></i> <span class="text-bold text-uppercase">Permissões</span></button>
                                        </form>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-xs-12">
                                        <br>

                                        <form action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jbG9ncw==" method="post">
                                            <button class="btn bg-orange-600 btn-block btn-float btn-float-lg" type="submit"><i class="icon-spinner10 spinner"></i> <span class="text-bold text-uppercase">Logs</span></button>
                                        </form>
                                    </div>
                                    <div class="col-xs-12">
                                        <br>

                                        <form action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jY29uZXhvZXM=" method="post">
                                            <button class="btn  bg-slate-800 btn-block btn-float btn-float-lg" type="submit"><i class="icon-collaboration"></i> <span class="text-bold text-uppercase">Conectados</span></button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /requisições -->

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
                            <ul class="nav navbar-nav element-active-slate-400">
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-spinner10 spinner position-left"></i> Actividades dos Utilizadores</a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->


                    <div class="row">


                        <div class="col-md-3">

                            <!-- Basic layout-->
                            <form  class="form-horizontal" method="post" accept-charset="ISO-8859-1" action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jbG9ncw==">
                                <div class="panel panel-flat">
                                    <div class="panel-heading">
                                        <h6 class="panel-title text-bold text-uppercase">Selecione o Periodo</h6>
                                        <div class="heading-elements">
                                            <ul class="icons-list">
                                                <li><a data-action="collapse"></a></li>
                                                <li><a data-action="reload"></a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="panel-body">

                                        <div class="form-group">
                                            <label class="text-bold text-uppercase">Periodo (Data): </label>

                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="icon-calendar22"></i></span>
                                                <input type="text" class="form-control daterange-weeknumbers" name="dataMonitoramento" required="" <%=periodo%>> 
                                            </div>
                                        </div>


                                        <div class="text-right">
                                            <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase text-uppercase text-bold bg-orange-800">Filtrar resultados <i class="icon-filter3 position-right"></i></button>

                                        </div>

                                    </div>
                                </div>
                            </form>
                            <!-- /basic layout -->

                        </div>

                        <div class="col-md-9">

                            <!-- Basic responsive configuration -->
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-bold text-uppercase">Actividades do usuário <span class="text-danger">(<%=dataSelecionada%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>

                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    A lista de registos abaixo é composta pelas actividades realizadas pelos usuários dentro do sistema <code><b>SEGIA - </b></code>,  nesta lista podem ser encontrados   registos de <code>login</code>,  <code>insersões</code>, <code>pesquisas</code>, etc. 
                                </div>

                                <table class="table datatable-responsive">
                                    <thead>
                                        <tr>
                                            <th class = "text-bold text-uppercase">#</th>
                                            <th class = "text-bold text-uppercase">Data e Hora</th>
                                            <th class = "text-bold text-uppercase">Usuário</th>
                                            <th class = "text-bold text-uppercase">Descrição</th>
                                        </tr>
                                    </thead>
                                    <tbody>


                                        <%
                                            if (logs != null) {

                                                for (Log l : logs) {
                                                    String desc = l.getLogDescricao();
                                                    String hor = sdf.format(l.getLogData().toGregorianCalendar().getTime());
                                                    String nm = encryptUtils.decodeString(l.getUsuario().getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(l.getUsuario().getPessoapess().getPessApelido());
                                                    int id = l.getLogId();
                                        %>
                                        <tr>
                                            <td><a href="#"><%=id%></a></td>
                                            <td><%=hor%></td>
                                            <td><%=nm%></td>
                                            <td><%=desc%></td>
                                        </tr>
                                        <%
                                                }
                                            }
                                        %>

                                    </tbody>
                                </table>
                            </div>
                            <!-- /basic responsive configuration -->
                        </div>

                    </div>
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
