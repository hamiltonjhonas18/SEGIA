<%-- 
    Document   : institution
    Created on : Sep 14, 2017, 12:26:26 PM
    Author     : hamil
--%>

<%@page import="com.dciapps.local.School"%>
<%@page import="com.dciapps.webclient.EdstSchoolType"%>
<%@page import="com.dciapps.webclient.EdstAdministrativePost"%>
<%@page import="com.dciapps.webclient.EdstDistrict"%>
<%@page import="com.dciapps.webclient.EdstProvince"%>
<%@page import="com.dciapps.webclient.Resposta"%>
<%@page import="com.dciapps.webclient.Inscricao"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="com.dciapps.webclient.Notas"%>
<%@page import="com.dciapps.webclient.Disciplina"%>
<%@page import="com.dciapps.webclient.Curso"%>
<%@page import="com.dciapps.webclient.Turma"%>
<%@page import="com.dciapps.webclient.Aluno"%>
<%@page import="com.dciapps.webclient.Presencas"%>
<%@page import="com.dciapps.webclient.ModulosUsuario"%>
<%@page import="com.dciapps.webclient.Funcionario"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.localcontroler.StringUtils"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.dciapps.webclient.Usuario"%>
<%@page import="com.dciapps.controller.GenericHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA -  Escolas</title>

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
        <script type="text/javascript" src="assets/js/plugins/tables/datatables/extensions/fixed_columns.min.js"></script>

        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/datepicker.min.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/effects.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/ui/moment/moment.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/daterangepicker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.date.js"></script>
        <script type="text/javascript" src="assets/js/plugins/visualization/echarts/echarts.js"></script>

        <script type="text/javascript" src="assets/js/core/app.js"></script>



        <script type="text/javascript" src="assets/js/pages/form_layouts.js"></script>
        <script type="text/javascript" src="assets/js/pages/datatables_responsive.js"></script>
        <!-- /theme JS files -->


        <%

            int timeout = session.getMaxInactiveInterval();

            GenericHandler gh = new GenericHandler(request, response);
            Usuario usuario = gh.loggedUser();

            String nome = "";
            String fotoPerfil = "";
            String cargo = "";

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            EncryptUtils encryptUtils = new EncryptUtils();

            List<EdstProvince> provincias = null;
            List<EdstDistrict> distritos = null;
            List<EdstAdministrativePost> postosAdministrativos = null;
            List<EdstSchoolType> tipoEscolas = null;
            List<School> schools = null;

            EdstProvince provincia = null;
            EdstDistrict distrito = null;
            EdstSchoolType tipoEscola = null;
            EdstAdministrativePost postoAdministrativo = null;

            String msgErro = "";
            String alerta = "";

            ModulosUsuario mu = null;

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = encryptUtils.decodeString(usuario.getPessoapess().getPessActividade());

                provincia = (EdstProvince) session.getAttribute("provincia");
                distrito = (EdstDistrict) session.getAttribute("distrito");
                tipoEscola = (EdstSchoolType) session.getAttribute("tipoEscola");
                postoAdministrativo = (EdstAdministrativePost) session.getAttribute("postoAdministrativo");

                provincias = (List<EdstProvince>) session.getAttribute("provincias");
                distritos = (List<EdstDistrict>) session.getAttribute("distritos");
                postosAdministrativos = (List<EdstAdministrativePost>) session.getAttribute("postosAdministrativos");
                tipoEscolas = (List<EdstSchoolType>) session.getAttribute("tipoEscolas");
                schools = (List<School>) session.getAttribute("schools");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                mu = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                response.setHeader("Refresh", timeout + "; URL =VXN1YXJpb1NlcnZsZXQjRENJ?" + encryptUtils.encodeString("accao#lockscreen&user=" + encryptUtils.decodeString(usuario.getUsuaUsuario())));

            }
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
                        <form method="post" action="main-dashboard">
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
                    <div class="sidebar-fixed">
                        <div class="sidebar-content">


                            <!-- Main navigation -->
                            <div class="sidebar-category sidebar-category-visible">
                                <div class="category-title h6">
                                    <span class="text-bold text-uppercase">Navegação Principal</span>
                                    <ul class="icons-list">
                                        <li><a href="#" data-action="collapse"></a></li>
                                    </ul>
                                </div>

                                <!-- User menu -->
                                <div class="category-content sidebar-user">
                                    <div class="media">
                                        <a href="#" class="media-left">  <img src="http://<%=ip%>:8081/suc/images/profile-pictures/<%=fotoPerfil%>" alt="<%=nome%>" class="img-circle img-sm"></a>
                                        <div class="media-body">
                                            <span class="media-heading text-semibold"><%=nome%></span>
                                            <div class="text-size-mini text-muted text-italic">
                                                <i class="icon-briefcase text-size-small"></i> <%=cargo%>
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
                                <!-- /user menu -->

                                <div class="category-content no-padding">
                                    <ul class="navigation navigation-main navigation-accordion">

                                        <!-- Main -->
                                        <li class="navigation-header"><span>Main</span> <i class="icon-menu" title="Main pages"></i></li>
                                        <li><a href="TW9kdWxvU2VydmxldCNEQ0k=?YWNjYW8jY29uZmlndXJhY2Fv"><i class="icon-home4"></i> <span class="text-bold text-uppercase">Dashboard</span></a></li>
                                        <li class="nav-item active text-bold text-uppercase"><a href="Q2VudHJvU2VydmxldCNEQ0k=?YWNjYW8jY2VudHJvcw==" class="nav-link"><i class="icon-office"></i> Escolas</a></li>
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
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-city position-left"></i> Escolas</a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->

                    <div class = "row">
                        <!-- Vertical form options -->
                        <div class="col-md-6"> 
                            <!-- Basic layout-->

                            <form method="post" accept-charset="ISO-8859-1" action="Q2VudHJvU2VydmxldCNEQ0k=?YWNjYW8jY2VudHJvcw==">
                                <div class="panel panel-flat">
                                    <div class="panel-body">

                                        <div class="form-group">
                                            <div class="col-lg-12">
                                                <div class="row">

                                                    <div class="col-md-7">

                                                        <select class="select" name="idProvincia">
                                                            <optgroup label="Selecione a provincia">

                                                                <%
                                                                    if (provincias != null) {
                                                                        for (EdstProvince e : provincias) {

                                                                            int id = e.getId();
                                                                            String desc = e.getName();

                                                                            String sel = "";

                                                                            if (provincia != null) {
                                                                                if (id == provincia.getId()) {
                                                                                    sel = "selected";
                                                                                }
                                                                            }
                                                                %>
                                                                <option value="<%=id%>" <%=sel%>><%=desc%></option>
                                                                <%
                                                                        }
                                                                    }
                                                                %>                                                                

                                                            </optgroup>
                                                        </select>
                                                    </div>

                                                    <div class="col-md-3">
                                                        <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn bg-slate-800 btn-labeled text-bold text-uppercase">
                                                            <b><i class="icon-search4 position-right"></i></b> 
                                                            Filtrar Província
                                                        </button>

                                                    </div>

                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </form>
                            <!-- /basic layout -->

                        </div>


                        <!-- Vertical form options -->
                        <div class="col-md-6"> 
                            <!-- Basic layout-->


                            <%                                String act4 = encryptUtils.encodeString("accao#filtrar-distrito&to=institution");
                            %>

                            <form method="post" accept-charset="ISO-8859-1" action="Q2VudHJvU2VydmxldCNEQ0k=?<%=act4%>">
                                <div class="panel panel-flat">
                                    <div class="panel-body">

                                        <div class="form-group">
                                            <div class="col-lg-12">
                                                <div class="row">

                                                    <div class="col-md-7">


                                                        <select class="select" name="idDistrito">
                                                            <optgroup label="Selecione o distrito">

                                                                <%
                                                                    if (distritos != null) {
                                                                        for (EdstDistrict e : distritos) {

                                                                            int id = e.getId();
                                                                            String desc = e.getName();

                                                                            String sel = "";

                                                                            if (distrito != null) {
                                                                                if (id == distrito.getId()) {
                                                                                    sel = "selected";
                                                                                }
                                                                            }
                                                                %>
                                                                <option value="<%=id%>" <%=sel%>><%=desc%></option>
                                                                <%
                                                                        }
                                                                    }
                                                                %>               
                                                            </optgroup>
                                                        </select>
                                                    </div>

                                                    <div class="col-md-3">
                                                        <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn bg-orange-600 btn-labeled text-bold text-uppercase">
                                                            <b><i class="icon-search4 position-right"></i></b> 
                                                            Filtrar Distrito
                                                        </button>

                                                    </div>

                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </form>
                            <!-- /basic layout -->

                        </div>
                        <!-- /vertical form options -->
                    </div>
                    <!-- /row.1-->

                    <!-- User profile -->
                    <div class="row">

                        <%
                            String prov = "";
                            String dist = "";

                            if (provincia != null) {
                                prov = provincia.getName();
                            }

                            if (distrito != null) {
                                dist = distrito.getName();
                            }

                            String act = encryptUtils.encodeString("accao#registar-respostas");
                        %>


                        <div class="col-md-12">
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-bold text-uppercase">Listagem das Escolas <span class="text-danger-600">[<%=prov%> | <%=dist%>]</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">


                                    <table class="table datatable-responsive table-bordered table-striped">
                                        <thead>
                                            <tr>
                                                <th class="text-bold text-uppercase">#</th>
                                                <th class="text-bold text-uppercase">Escola</th>
                                                <th class="text-bold text-uppercase">Abreviatura</th>
                                                <th class="text-bold text-uppercase">Tipo Ensino</th>
                                                <th class="text-bold text-uppercase">Distrito</th>
                                                <th class="text-bold text-uppercase">Zip</th>
                                                <th class="text-bold text-uppercase text-danger">---</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                if (schools != null) {

                                                    for (School s : schools) {

                                                        int id = s.getId();
                                                        String nm = s.getNome();
                                                        String abrev = s.getAbreviatura();
                                                        String tip = s.getTipo();
                                                        String dis = s.getDistrito();
                                                        String posto = s.getPostoAdminstrativo();
                                                        String loc = s.getLocalidade();
                                                        String are = s.getArea();
                                                        String zi = s.getZip();
                                                        int an = s.getAno();
                                                        double coorX = s.getCoorX();
                                                        double coorY = s.getCoorY();
                                                        String key = s.getKey();


                                            %>
                                            <tr>
                                                <td class="text-bold"><a href="#"><%=key%></a></td>
                                                <td class="text-bold"><%=nm%></td>
                                                <td class="text-bold text-danger-600"><%=abrev%></td>
                                                <td><%=tip%></td>
                                                <td><%=dis%></td>
                                                <td><%=zi%></td>

                                                <td>


                                                    <a  href="#" data-toggle="modal" data-target="#modal_info_<%=id%>" data-popup="tooltip" title="Mais detalhes da Escola"><i class="icon-info22 text-primary-600"></i></a>


                                                    <!-- Table modal -->
                                                    <div id="modal_info_<%=id%>" class="modal fade">
                                                        <div class="modal-dialog">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                    <h6 class="modal-title text-bold text-uppercase text-danger"><%=nm%></h6>
                                                                </div>
                                                                <div class="modal-body">

                                                                    <table class="table ">
                                                                        <tbody>
                                                                            <tr>
                                                                                <td class="text-bold text-uppercase">Posto Administrativo</td>
                                                                                <td><%=posto%></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="text-bold text-uppercase">Localidade</td>
                                                                                <td><%=loc%></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="text-bold text-uppercase">Nível de Ensino</td>
                                                                                <td><%=are%></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="text-bold text-uppercase">Ano Integração</td>
                                                                                <td><%=an%></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="text-bold text-uppercase">Longitude</td>
                                                                                <td><%=coorX%></td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="text-bold text-uppercase">Latitude</td>
                                                                                <td><%=coorY%></td>
                                                                            </tr>
                                                                        </tbody>
                                                                    </table>

                                                                </div>

                                                                <div class="modal-footer">
                                                                    <button type="button" class="btn text-bold text-uppercase btn-link" data-dismiss="modal">Fechar</button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- /table modal -->   
                                                </td>

                                            </tr>
                                            <%

                                                    }
                                                }
                                            %>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /row.2 -->

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
