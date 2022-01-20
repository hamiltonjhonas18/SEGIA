<%-- 
    Document   : dc-inefp-charts-course
    Created on : Apr 9, 2017, 1:23:07 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.Entidade"%>
<%@page import="com.dciapps.webclient.Curso"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.webclient.ModulosUsuario"%>
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
        <title> SEGIA - Estatísticas Por Curso</title>

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
        <script type="text/javascript" src="assets/js/plugins/media/fancybox.min.js"></script>

        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/datepicker.min.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/effects.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/ui/moment/moment.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/daterangepicker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.date.js"></script>


        <script type="text/javascript" src="assets/js/core/app.js"></script>
        <script type="text/javascript" src="assets/js/pages/form_layouts.js"></script>
        <script type="text/javascript" src="assets/js/pages/datatables_responsive.js"></script>
        <script type="text/javascript" src="assets/js/pages/gallery.js"></script>

        <!-- /theme JS files -->

        <%

            int timeout = session.getMaxInactiveInterval();

            GenericHandler gh = new GenericHandler(request, response);
            Usuario usuario = gh.loggedUser();

            String nome = "";
            String fotoPerfil = "";
            String cargo = "";

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            EncryptUtils encryptUtils = new EncryptUtils();

            ModulosUsuario mu = null;
            List<Curso> cursos = null;
            Curso curso = null;

            String msgErro = "";
            String alerta = "";

            String anoSelecionado = "";
            String descCurso = "";

            String lblInscricoes = "";
            String lblMenor18 = "";
            String lbl18_29 = "";
            String lbl30_39 = "";
            String lbl40_49 = "";
            String lbl50_59 = "";
            String lblMaior60 = "";
            int numHomens = 0;
            int numMulheres = 0;
            Entidade entidade = (Entidade) session.getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) session.getAttribute("entidade");
            }

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mu = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                cursos = (List<Curso>) session.getAttribute("cursos");
                curso = (Curso) session.getAttribute("curso");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                anoSelecionado = session.getAttribute("anoSelecionado").toString();

                lblInscricoes = session.getAttribute("lblInscricoes").toString();
                lblMenor18 = session.getAttribute("lblMenor18").toString();
                lbl18_29 = session.getAttribute("lbl18_29").toString();
                lbl30_39 = session.getAttribute("lbl30_39").toString();
                lbl40_49 = session.getAttribute("lbl40_49").toString();
                lbl50_59 = session.getAttribute("lbl50_59").toString();
                lblMaior60 = session.getAttribute("lblMaior60").toString();

                numHomens = Integer.parseInt(session.getAttribute("numHomens").toString());
                numMulheres = Integer.parseInt(session.getAttribute("numMulheres").toString());

                if (curso != null) {
                    descCurso = encryptUtils.decodeString(curso.getCursDescricao());
                }

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

        <!-- velocity animation menu -->
        <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3_tooltip.js"></script>


        <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/visualization/c3/c3.min.js"></script>

        <script type="text/javascript" src="assets/js/plugins/visualization/echarts/echarts.js"></script>


    </head>

    <body oncontextmenu="return false"  class="navbar-top">




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
                        <button onClick="history.back();" class="btn text-bold text-uppercase btn-labeled btn-labeled-left bg-danger-400 heading-btn">Voltar ao painel principal<b><i class="icon-chevron-left"></i></b></button>
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
                                                <li><a href="UGFyY2Vpcm9TZXJ2bGV0I0RDSQ==?YWNjYW8jcGFyY2Vpcm9z"><i class="icon-briefcase3"></i> Parceiros</a></li>
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

                                        <!-- Estatísticas -->
                                        <%
                                            if (mu.isMuiEstatisticas()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-stats-growth"></i> <span class="text-bold text-uppercase">Estatísticas</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiEstatisticasGerais()) {
                                                %>
                                                <li><a href="RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k=?YWNjYW8jZ2VyYWlz"><i class="icon-statistics"></i> Gerais</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiEstatisticasCurso()) {
                                                    %>
                                                <li class="active"><a href="RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k=?YWNjYW8jcG9yLWN1cnNv"><i class="icon-book3"></i> Por Curso</a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /estatísticas -->

                                        <!-- Despesas -->
                                        <%
                                            if (mu.isMuiDespesas()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-coins"></i> <span class="text-bold text-uppercase">Controlo das Despesas</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiDespesasInternas()) {
                                                %>
                                                <li><a href="RGVzcGVzYVNlcnZsZXQjRENJ?YWNjYW8jZGVzcGVzYXM="><i class="icon-archive"></i> Internas</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiDespesasEstoque()) {
                                                    %>
                                                <li><a href="RGVzcGVzYVNlcnZsZXQjRENJ?YWNjYW8jZGVzcGVzYXMtZXN0b3F1ZQ=="><i class="icon-cart-add2"></i> Compras</a></li>
                                                    <%
                                                        }

                                                    %>

                                                <%                                                       if (mu.isMuiFornecedores()) {
                                                %>
                                                <li><a href="Rm9ybmVjZWRvclNlcnZsZXQjRENJ?YWNjYW8jZm9ybmVjZWRvcmVz"><i class="icon-truck"></i> Fornecedores</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiDespesasExtracto()) {
                                                %>
                                                <li><a href="RGVzcGVzYVNlcnZsZXQjRENJ?YWNjYW8jZXh0cmFjdG8="><i class="icon-file-stats"></i> Extracto das Despesas</a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /despesas -->

                                        <!-- Contabilidade -->
                                        <%
                                            if (mu.isMuiPagamentos()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-cash"></i> <span class="text-bold text-uppercase">Gestão dos Pagamentos</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiPagamentosTaxas()) {
                                                %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jdGF4YXM="><i class="icon-plus-circle2"></i> Definir Taxas</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiPagamentosPropinas()) {
                                                %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jcHJvcGluYXM="><i class="icon-cash4"></i> Pagamento de Propinas</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiPagamentosPagamentosOnline()) {
                                                %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jcGFnYW1lbnRvcy1vbmxpbmU="><i class="icon-earth"></i> Pagamentos Online</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiPagamentosOutrosPagamentos()) {
                                                    %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jb3V0cm9zLXBhZ2FtZW50b3M="><i class="icon-coins"></i> Outros Pagamentos</a></li>
                                                    <%
                                                        }
                                                    %>
                                                    <%
                                                        if (mu.isMuiPagamentosSituacaoPagamentos()) {
                                                    %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jc2l0dWFjYW8tcGFnYW1lbnRvcw=="><i class="icon-info22"></i> Situação Pagamentos</a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /contabilidade -->

                                        <!-- Resultados -->
                                        <%
                                            if (mu.isMuiResultados()) {
                                        %>
                                        <li>
                                            <a href="UmVzdWx0YWRvU2VydmxldCNEQ0k=?YWNjYW8jZHJl"><i class="icon-stats-bars2"></i> <span class="text-bold text-uppercase">Mapa de Resultados</span></a>

                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /resultados -->

                                        <!-- Controlo de Acesso -->
                                        <%
                                            if (mu.isMuiUsuarios()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-users2"></i> <span class="text-bold text-uppercase">Controlo de Acesso</span></a>
                                            <ul>

                                                <%
                                                    if (mu.isMuiUsuariosAdd()) {
                                                %>
                                                <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jdXN1YXJpb3M="><i class="icon-user-plus"></i> Utilizadores</a></li>
                                                    <%
                                                        }
                                                    %>


                                                <%
                                                    if (mu.isMuiUsuariosPermissoes()) {
                                                %>
                                                <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jcGVybWlzc29lcw=="><i class="icon-user-lock"></i> Permissões</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiUsuariosLogs()) {
                                                %>
                                                <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jbG9ncw=="><i class="icon-spinner10 spinner"></i> Logs</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiUsuariosStatus()) {
                                                %>
                                                <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jY29uZXhvZXM="><i class="icon-collaboration"></i> Conectados</a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /controlo de acesso -->

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
                                <li class="active text-bold"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-book3 position-left"></i> Ánalise do curso <span class="text-danger">(<%=descCurso%>)</span></a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->


                    <div class="row col-md-offset-4">

                        <div class="col-md-5">


                            <!-- Basic layout-->
                            <form action="#" class="form-horizontal">
                                <div class="panel panel-flat">
                                    <div class="panel-heading">
                                        <h6 class="panel-title text-uppercase text-bold">Periodo de Pesquisa</h6>
                                        <div class="heading-elements">
                                            <ul class="icons-list">
                                                <li><a data-action="collapse"></a></li>
                                                <li><a data-action="reload"></a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="panel-body">

                                        <div class="form-group">
                                            <label class="text-bold text-uppercase">Classe:</label>
                                            <select class="select">
                                                <optgroup label="Selecione a classe">
                                                    <%
                                                        if (cursos != null) {
                                                            for (Curso c : cursos) {
                                                                String sel = "";
                                                                int id = c.getCursId();
                                                                String desc = encryptUtils.decodeString(c.getCursDescricao());

                                                                if (curso != null) {
                                                                    if (c.getCursId() == curso.getCursId()) {
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


                                        <div class="form-group">
                                            <label class="col-lg-3 control-label text-bold">Periodo:</label>
                                            <div class="col-lg-9">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <select class="select">
                                                            <optgroup label="Selecione ano">

                                                                <%
                                                                    for (int i = 2017; i <= 2022; i++) {
                                                                        String sel = "";
                                                                        if (!anoSelecionado.isEmpty()) {
                                                                            if (i == Integer.parseInt(anoSelecionado)) {
                                                                                sel = "selected";
                                                                            }
                                                                        }

                                                                %>
                                                                <option value="<%=i%>" <%=sel%>><%=i%></option>
                                                                <%
                                                                    }
                                                                %>
                                                            </optgroup>
                                                        </select>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>



                                        <div class="text-right">
                                            <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase btn-primary">Filtrar resultados <i class="icon-filter3 position-right"></i></button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <!-- /basic layout -->

                        </div>


                    </div>


                    <div class ="row">

                        <div class = "col-md-6">

                            <!-- Line and bar combination -->
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold  text-bold text-uppercase">Inscrições <span class="text-danger">(<%=descCurso%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                            
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="line_bar1"></div>
                                    </div>
                                </div>
                            </div>
                            <!-- /line and bar combination -->

                        </div>

                        <div class = "col-md-6">

                            <!-- Line and bar combination -->
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Distribuição dos Alunos por Idade <span class="text-danger">(<%=descCurso%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                            
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="line_bar2"></div>
                                    </div>
                                </div>
                            </div>
                            <!-- /line and bar combination -->

                        </div>


                    </div>


                    <div class ="row">

                        <div class = "col-md-6">

                            <!-- Line and bar combination -->
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Avaliação dos alunos <span class="text-danger">(<%=descCurso%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                            
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="line_bar3"></div>
                                    </div>
                                </div>
                            </div>
                            <!-- /line and bar combination -->

                        </div>

                        <div class = "col-md-6">

                            <!-- Line and bar combination -->
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Género <span class="text-danger">(<%=descCurso%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                            
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="line_bar4"></div>
                                    </div>
                                </div>
                            </div>
                            <!-- /line and bar combination -->

                        </div>


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
        <script>

            $(function () {

                // Set paths
                // ------------------------------

                require.config({
                    paths: {
                        echarts: 'assets/js/plugins/visualization/echarts'
                    }
                });



                // Configuration
                // ------------------------------

                require(
                        // Add necessary charts
                                [
                                    'echarts',
                                    'echarts/theme/limitless',
                                    'echarts/chart/line',
                                    'echarts/chart/bar',
                                    'echarts/chart/pie',
                                    'echarts/chart/scatter',
                                    'echarts/chart/k',
                                    'echarts/chart/radar',
                                    'echarts/chart/gauge'
                                ],
                                // Charts setup
                                        function (ec, limitless) {


                                            // Initialize charts
                                            // ------------------------------

                                            var line_bar1 = ec.init(document.getElementById('line_bar1'), limitless);
                                            var line_bar2 = ec.init(document.getElementById('line_bar2'), limitless);
                                            var line_bar4 = ec.init(document.getElementById('line_bar4'), limitless);



                                            // Charts options
                                            // ------------------------------


                                            //
                                            // Qualificações Académicas 
                                            //

                                            line_bar_options1 = {
                                                // Add tooltip
                                                tooltip: {
                                                    trigger: 'axis'
                                                },
                                                // Add legend
                                                legend: {
                                                    data: ['Nº de Inscrições']
                                                },
                                                // Add custom colors
                                                color: ['#EF5350'],
                                                // Enable drag recalculate
                                                calculable: true,
                                                // Horizontal axis
                                                xAxis: [{
                                                        type: 'category',
                                                        data: ['JAN', 'FEV', 'MAR', 'ABR', 'MAI', 'JUN', 'JUL', 'AGO', 'SET', 'OUT', 'NOV', 'DEZ']
                                                    }],
                                                // Vertical axis
                                                yAxis: [{
                                                        type: 'value'
                                                    }],
                                                // Add series
                                                series: [
                                                    {
                                                        name: 'Nº de Inscrições',
                                                        type: 'bar',
                                                        data: [<%=lblInscricoes%>],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true,
                                                                    textStyle: {
                                                                        fontWeight: 500
                                                                    }
                                                                }
                                                            }
                                                        },
                                                        markLine: {
                                                            data: [{type: 'average', name: 'Average'}]
                                                        }
                                                    }
                                                ]
                                            };

                                            line_bar_options2 = {
                                                // Add tooltip
                                                tooltip: {
                                                    trigger: 'axis'
                                                },
                                                // Add legend
                                                legend: {
                                                    data: ['Menor de 18 anos', '18 á 29 anos', '30 á 39 anos', '40 á 49 anos', '50 á 59 anos', 'Maior de 60 anos']
                                                },
                                                // Add custom colors
                                                color: ['#98abc5', '#8a89a6', '#7b6888', '#6b486b', '#a05d56', '#d0743c', '#ff8c00'],
                                                // Enable drag recalculate 
                                                calculable: true,
                                                // Horizontal axis
                                                xAxis: [{
                                                        type: 'category',
                                                        data: ['JAN', 'FEV', 'MAR', 'ABR', 'MAI', 'JUN', 'JUL', 'AGO', 'SET', 'OUT', 'NOV', 'DEZ']
                                                    }],
                                                // Vertical axis
                                                yAxis: [{
                                                        type: 'value'
                                                    }],
                                                // Add series
                                                series: [
                                                    {
                                                        name: 'Menor de 18 anos',
                                                        type: 'bar',
                                                        data: [<%=lblMenor18%>],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true,
                                                                    textStyle: {
                                                                        fontWeight: 500
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    },
                                                    {
                                                        name: '18 á 29 anos',
                                                        type: 'bar',
                                                        data: [<%=lbl18_29%>],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true,
                                                                    textStyle: {
                                                                        fontWeight: 500
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    },
                                                    {
                                                        name: '30 á 39 anos',
                                                        type: 'bar',
                                                        data: [<%=lbl30_39%>],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true,
                                                                    textStyle: {
                                                                        fontWeight: 500
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    },
                                                    {
                                                        name: '40 á 49 anos',
                                                        type: 'bar',
                                                        data: [<%=lbl40_49%>],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true,
                                                                    textStyle: {
                                                                        fontWeight: 500
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    },
                                                    {
                                                        name: '50 á 59 anos',
                                                        type: 'bar',
                                                        data: [<%=lbl50_59%>],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true,
                                                                    textStyle: {
                                                                        fontWeight: 500
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    },
                                                    {
                                                        name: 'Maior de 60 anos',
                                                        type: 'bar',
                                                        data: [<%=lblMaior60%>],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true,
                                                                    textStyle: {
                                                                        fontWeight: 500
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                ]
                                            };


                                            //
                                            // Género
                                            //
                                            line_bar_options4 = {
                                                // Add title
                                                title: {
                                                    text: 'Estatísticas para <%=anoSelecionado%>',
                                                    subtext: 'Curso -  <%=descCurso%>',
                                                    x: 'center'
                                                },
                                                // Add legend
                                                legend: {
                                                    orient: 'vertical',
                                                    x: 'left',
                                                    data: ['Homens', 'Mulheres']
                                                },
                                                // Enable drag recalculate
                                                calculable: true,
                                                // Add series
                                                series: [
                                                    {
                                                        name: 'Genero',
                                                        type: 'pie',
                                                        radius: ['50%', '70%'],
                                                        center: ['50%', '57.5%'],
                                                        itemStyle: {
                                                            normal: {
                                                                label: {
                                                                    show: true
                                                                },
                                                                labelLine: {
                                                                    show: true
                                                                }
                                                            },
                                                            emphasis: {
                                                                label: {
                                                                    show: true,
                                                                    formatter: '{b}' + '\n\n' + '{c} ({d}%)',
                                                                    position: 'center',
                                                                    textStyle: {
                                                                        fontSize: '17',
                                                                        fontWeight: '500'
                                                                    }
                                                                }
                                                            }
                                                        },
                                                        data: [
                                                            {value: <%=numHomens%>, name: 'Homens'},
                                                            {value: <%=numMulheres%>, name: 'Mulheres'}
                                                        ]
                                                    }
                                                ]
                                            };





                                            // Apply options
                                            // ------------------------------

                                            line_bar1.setOption(line_bar_options1);
                                            line_bar2.setOption(line_bar_options2);
                                            line_bar4.setOption(line_bar_options4);


                                            // Resize charts
                                            // ------------------------------

                                            window.onresize = function () {
                                                setTimeout(function () {
                                                    line_bar1.resize();
                                                    line_bar2.resize();
                                                    line_bar4.resize();
                                                }, 200);
                                            };
                                        }
                                );
                            });

        </script>

        <script>

                    $(function () {


// Line chart with regions
// ------------------------------

// Generate chart
                        var chart_line_regions = c3.generate({
                            bindto: '#line_bar3',
                            size: {height: 400},
                            point: {
                                r: 4
                            },
                            color: {
                                pattern: ['#5E35B1', '#E53935']
                            },
                            data: {
                                columns: [
                                    ['Reprovações', 30, 20, 10, 40, 15, 25],
                                    ['Aprovações', 50, 17, 14, 36, 18, 33]
                                ],
                                regions: {
                                    'Reprovações': [{'start': 1, 'end': 2, 'style': 'dashed'}, {'start': 3}],
                                    'Aprovações': [{'end': 3}]
                                }
                            },
                            grid: {
                                y: {
                                    show: true
                                }
                            }
                        });



// Resize chart on sidebar width change
                        $(".sidebar-control").on('click', function () {
                            chart_line_regions.resize();
                        });
                    });

        </script>

        <script type="text/javascript" src="assets/js/pages/picker_date.js"></script>
    </body>
</html>
