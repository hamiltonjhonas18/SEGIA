<%-- 
    Document   : dc-inefp-partners
    Created on : Feb 11, 2017, 7:30:25 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.Entidade"%>
<%@page import="com.dciapps.webclient.Parceiro"%>
<%@page import="com.dciapps.webclient.Curso"%>
<%@page import="com.dciapps.webclient.AreaFormacao"%>
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
        <title>SEGIA - Parceiros</title>

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

            ModulosUsuario mu = null;
            List<Parceiro> parceiros = null;

            String msgErro = "";
            String alerta = "";
            Entidade entidade = (Entidade) session.getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) session.getAttribute("entidade");
            }

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mu = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                parceiros = (List<Parceiro>) session.getAttribute("parceiros");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                response.setHeader("Refresh", timeout + "; URL =VXN1YXJpb1NlcnZsZXQjRENJ?" + encryptUtils.encodeString("accao#lockscreen&user=" + encryptUtils.decodeString(usuario.getUsuaUsuario())+"&ei="+entidade.getEntiId()));

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

    <body oncontextmenu="return false"  class="navbar-top">



        <!-- Main navbar -->
        <div class="navbar navbar-inverse  navbar-fixed-top">
            <div class="navbar-header">
                <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;"> Sistema Electrónico de Gestão de Informação Académica </h6>

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
                        <form method="post" action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jZG9VcGRhdGU=">
                            <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase btn-labeled btn-labeled-left bg-danger-400 heading-btn">Voltar ao painel principal<b><i class="icon-chevron-left"></i></b></button>
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
                                            <div class="text-size-mini text-muted">
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
                                        <li class="navigation-header"><span>Menu Principal</span> <i class="icon-menu" title="Menu Principal"></i></li>
                                        <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jZ28tYmFjaw=="><i class="icon-home4"></i> <span class="text-bold text-uppercase">Dashboard</span></a></li>

                                        <!-- Gestão -->

                                        <%
                                            if (mu.isMuiGestao()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-database-edit2"></i> <span class="text-bold text-uppercase">Gestão</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiGestaoFormados()) {
                                                %>
                                                <li><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jYWx1bm9z"><i class="icon-profile"></i> Matricular Aluno</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiGestaoFormadores()) {
                                                %>
                                                <li><a href="RG9jZW50ZVNlcnZsZXQjRENJ?YWNjYW8jZG9jZW50ZXM="><i class="icon-reading"></i> Professores</a></li>
                                                    <%
                                                        }
                                                    %>


                                                <%
                                                    if (mu.isMuiGestaoTurmas()) {
                                                %>
                                                <li><a href="VHVybWFTZXJ2bGV0I0RDSQ==?YWNjYW8jdHVybWFz"><i class="icon-table"></i> Turmas</a></li>
                                                    <%
                                                        }
                                                    %>



                                                <%
                                                    if (mu.isMuiGestaoTurmas()) {
                                                %>
                                                <li><a href="SG9yYXJpb1NlcnZsZXQjRENJ?YWNjYW8jaG9yYXJpb3M="><i class="icon-alarm"></i> Horários Entrada</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiGestaoInscricoes()) {
                                                %>
                                                <li><a href="SW5zY3JpY2FvU2VydmxldCNEQ0k=?YWNjYW8jaW5zY3JpY29lcw=="><i class="icon-list3"></i> Matriculas</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <li class="navigation-divider"></li>


                                                <%
                                                    if (mu.isMuiGestaoCentros()) {
                                                %>
                                                <li><a href="Q2VudHJvU2VydmxldCNEQ0k=?YWNjYW8jY2VudHJvcw=="><i class="icon-city"></i> Centros de Formação</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiGestaoParceiros()) {
                                                %>
                                                <li class="active"><a href="UGFyY2Vpcm9TZXJ2bGV0I0RDSQ==?YWNjYW8jcGFyY2Vpcm9z"><i class="icon-briefcase3"></i> Parceiros</a></li>
                                                    <%
                                                        }
                                                    %>

                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /gestão -->

                                        <!-- Cursos -->
                                        <%
                                            if (mu.isMuiCursos()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-books"></i> <span class="text-bold text-uppercase">Classes de Ensino</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiCursosCursos()) {
                                                %>
                                                <li><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jY3Vyc29z"><i class="icon-book"></i> Classes</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiCursosAreasInscricao()) {
                                                %>
                                                <li><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jYXJlYXM="><i class="icon-graduation2"></i> Categorias Ensino</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiCursosModulos()) {
                                                    %>
                                                <li><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jbW9kdWxvcw=="><i class="icon-archive"></i> Módulos</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiCursosCursosCentro()) {
                                                %>
                                                <li><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jY3Vyc29zLWNlbnRybw=="><i class="icon-stack"></i> Cursos para centros</a></li>

                                                <%
                                                    }
                                                %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /cursos -->

                                        <!-- Calendário -->
                                        <%
                                            if (mu.isMuiCalendario()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-calendar52"></i> <span class="text-bold text-uppercase">Calendário</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiCalendarioHorario()) {
                                                %>
                                                <li><a href="Q2FsZW5kYXJpb1NlcnZsZXQjRENJ?YWNjYW8jaG9yYXJpb3M="><i class="icon-calendar2"></i> Horários</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiCalendarioTestes()) {
                                                    %>
                                                <li><a href="Q2FsZW5kYXJpb1NlcnZsZXQjRENJ?YWNjYW8jdGVzdGVz"><i class="icon-calendar52"></i> Avaliações</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiCalendarioExames()) {
                                                %>
                                                <!-- <li><a href="Q2FsZW5kYXJpb1NlcnZsZXQjRENJ?YWNjYW8jZXhhbWVz"><i class="icon-calendar3"></i> Exames</a></li> -->
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiCalendarioRecorrencias()) {
                                                    %>
                                                <!-- <li><a href="Q2FsZW5kYXJpb1NlcnZsZXQjRENJ?YWNjYW8jcmVjb3JyZW5jaWFz"><i class="icon-calendar22"></i> Recorrências</a></li> -->
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /calendário -->

                                        <!-- Avaliação-->
                                        <%
                                            if (mu.isMuiAvaliacao()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-pencil4"></i> <span class="text-bold text-uppercase">Avaliação</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiAvaliacaoNotas()) {
                                                %>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jbm90YXM="><i class="icon-grid-alt"></i> Notas</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiAvaliacaoPautas()) {
                                                %>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcGF1dGFz"><i class="icon-table2"></i> Pauta Trimestral</a></li>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcGF1dGFzLWFudWFs"><i class="icon-grid2"></i> Pauta Freq. Anual</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiAvaliacaoPresencas()) {
                                                    %>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcHJlc2VuY2Fz"><i class="icon-blocked"></i> Presenças</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiAvaliacaoObservacoes()) {
                                                    %>
                                                <li><a href="#"><i class="icon-info3"></i> Observações</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiAvaliacaoBoletins()) {
                                                %>
                                                <li><a href="#"><i class="icon-list3"></i> Boletins</a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /avaliação -->

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
                            <ul class="nav navbar-nav element-active-slate-400">
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-briefcase3 position-left"></i> Gestão de parceiros</span></a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->



                    <div class = "row">

                        <div class = "col-md-12 col-md-offset-0">
                            <!-- Vertical form options -->
                            <div class="col-md-5">


                                <!-- Basic layout-->
                                <%
                                    String act = encryptUtils.encodeString("accao#adicionar-parceiro");
                                %>
                                <form method="post" accept-charset="ISO-8859-1" action="UGFyY2Vpcm9TZXJ2bGV0I0RDSQ==?<%=act%>" class="form-horizontal">


                                    <div class="panel panel-flat">
                                        <div class="panel-heading">
                                            <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Novo Parceiro</h6>
                                            <div class="heading-elements">
                                                <ul class="icons-list">
                                                    <li><a data-action="collapse"></a></li>
                                                    <li><a data-action="reload"></a></li>
                                                    
                                                </ul>
                                            </div>
                                        </div>

                                        <div class="panel-body">



                                            <div class="form-group">
                                                <label class="col-lg-3 control-label text-bold">Descrição: </label>

                                                <div class="col-lg-9">
                                                    <div class="row">

                                                        <div class="input-group col-md-9">
                                                            <span class="input-group-addon"><i class="icon-file-text"></i></span>
                                                            <input type="text" class="form-control" placeholder="Descrição do parceiro ... " name="descricao" required="">
                                                        </div>

                                                    </div>
                                                </div>

                                            </div>



                                            <div class="form-group">
                                                <label class="col-lg-3 control-label text-bold">Pessoa de contacto: </label>

                                                <div class="col-lg-9">
                                                    <div class="row">

                                                        <div class="input-group col-md-9">
                                                            <span class="input-group-addon"><i class="icon-user"></i></span>
                                                            <input type="text" class="form-control" placeholder="Pessoa de contacto ... " name="pessoaContacto" required="">
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>



                                            <div class="form-group">
                                                <label class="col-lg-3 control-label text-bold">Endereço: </label>

                                                <div class="col-lg-9">
                                                    <div class="row">

                                                        <div class="input-group col-md-10">
                                                            <span class="input-group-addon"><i class="icon-location4"></i></span>
                                                            <input type="text" class="form-control" placeholder="Endereço ... " name="endereco" required="">
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>



                                            <div class="form-group">
                                                <label class="col-lg-3 control-label text-bold">Contacto & Nuit: </label>

                                                <div class="col-lg-9">
                                                    <div class="row">

                                                        <div class="col-md-6">
                                                            <input type="text" class="form-control" placeholder="Nuit ... " name="nuit" required="">
                                                        </div>

                                                        <div class="input-group col-md-6">
                                                            <span class="input-group-addon"><i class="icon-phone-outgoing"></i></span>
                                                            <input type="text" class="form-control" placeholder="Contacto ... " name="contacto" required="">
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>





                                            <div class="form-group">
                                                <label class="col-lg-3 control-label text-bold">Área de actuação: </label>

                                                <div class="col-lg-9">
                                                    <div class="row">

                                                        <div class="input-group col-md-9">
                                                            <span class="input-group-addon"><i class="icon-bookmark4"></i></span>
                                                            <input type="text" class="form-control" placeholder="Área de actuação ... " name="areaActuacao" required="">
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>

                                            <div class="text-right">
                                                <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800">Gravar Registo <i class="icon-arrow-right14 position-right"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <!-- /basic layout -->

                            </div>

                            <div class="col-md-7">




                                <!-- Basic responsive configuration -->
                                <div class="panel panel-flat">
                                    <div class="panel-heading">
                                        <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Lista dos parceiros</h6>
                                        <div class="heading-elements">
                                            <ul class="icons-list">
                                                <li><a data-action="collapse"></a></li>
                                                <li><a data-action="reload"></a></li>
                                                
                                            </ul>
                                        </div>
                                    </div>

                                    <table class="table datatable-responsive">
                                        <thead>
                                            <tr>
                                                <th class="text-bold text-uppercase">#</th>
                                                <th class="text-bold text-uppercase">Descrição</th>
                                                <th class="text-bold text-uppercase">Pessoa de Contacto</th>
                                                <th class="text-bold text-uppercase">Contacto</th>
                                                <th class="text-center text-bold text-uppercase text-danger-600">---</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                if (parceiros != null) {
                                                    for (Parceiro p: parceiros) {

                                                        int id = p.getParcId();
                                                        String desc = encryptUtils.decodeString(p.getParcDescricao());
                                                        String pessC = encryptUtils.decodeString(p.getParcPessoaContacto());
                                                        String cont  = encryptUtils.decodeString(p.getParcContacto());

                                                        String actR = encryptUtils.encodeString("accao#remover-parceiro&id=" + id);
                                            %>
                                            <tr>
                                                <td><a href="#"><%=id%></a></td>
                                                <td><%=desc%></td>
                                                <td><%=pessC%></td>
                                                <td><%=cont%></td>
                                                <td class="text-center">
                                                    <ul class="icons-list">

                                                        <li><a href="#" data-toggle="modal" data-target="#modal_rem_<%=id%>"><i class="icon-cancel-circle2 text-danger-800"></i></a></li>



                                                        <!-- Danger modal -->
                                                        <div id="modal_rem_<%=id%>" class="modal fade">
                                                            <div class="modal-dialog">
                                                                <div class="modal-content">
                                                                    <div class="modal-header">
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                        <h6 class="modal-title text-semibold">Confirma a remoção do parceiro com a referência #<%=id%> ?</h6>
                                                                    </div>
                                                                    <div class="modal-body">
                                                                        <h6 class="text-bold text-danger" ><i class="icon-question6 text-danger" style="font-size: 100px"></i></h6>

                                                                    </div>

                                                                    <div class="modal-footer">
                                                                        <button type="button" class="btn text-bold text-uppercase btn-link" data-dismiss="modal">Cancelar</button>

                                                                        <a href="UGFyY2Vpcm9TZXJ2bGV0I0RDSQ==?<%=actR%>" class="btn text-bold text-uppercase btn-danger">Sim, confirmo !</a>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <!-- /default modal -->
                                                    </ul>
                                                </td>


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
                        <!-- /vertical form options -->
                    </div>					

                </div>
                <!-- /main content -->

            </div>
            <!-- /page content -->





            <!-- Footer -->
            <div class="footer text-bold text-grey-300">
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
