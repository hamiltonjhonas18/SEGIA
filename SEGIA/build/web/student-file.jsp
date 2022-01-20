<%-- 
    Document   : dc-inefp-student-file
    Created on : Apr 4, 2017, 3:24:18 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.local.HCal"%>
<%@page import="com.dciapps.local.HCal"%>
<%@page import="org.joda.time.Days"%>
<%@page import="org.joda.time.DateTime"%>
<%@page import="java.util.Date"%>
<%@page import="com.dciapps.webclient.Entidade"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.dciapps.webclient.Pagamento"%>
<%@page import="com.dciapps.webclient.Mensalidade"%>
<%@page import="com.dciapps.webclient.Notas"%>
<%@page import="com.dciapps.webclient.Turno"%>
<%@page import="com.dciapps.webclient.Inscricao"%>
<%@page import="com.dciapps.webclient.Aluno"%>
<%@page import="com.dciapps.webclient.Turma"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.webclient.ModulosUsuario"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
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
        <title> SEGIA - Ficha do Aluno</title>


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
        <script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/styling/switchery.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/styling/switch.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/tables/datatables/datatables.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/tables/datatables/extensions/responsive.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/selects/select2.min.js"></script>

        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/datepicker.min.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/effects.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/ui/moment/moment.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/daterangepicker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/pickadate/picker.date.js"></script>

        <script type="text/javascript" src="assets/js/pages/form_layouts.js"></script>

        <script type="text/javascript" src="assets/js/core/app.js"></script>
        <!-- /theme JS files -->

        <!-- /theme JS files -->

        <!-- Velocity animation  menu -->
        <script type="text/javascript" src="assets/js/plugins/velocity/velocity.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/velocity/velocity.ui.min.js"></script>
        <script>

            $(function () {

                // Animated dropdowns
                // ------------------------------

                //
                // Velocity animations
                //

                // Open
                $('.dropdown-velocity, .btn-group-velocity').on('show.bs.dropdown', function (e) {
                    $(this).find('.dropdown-menu').velocity('transition.slideUpIn', {
                        duration: 200
                    });
                });

                // Close
                $('.dropdown-velocity, .btn-group-velocity').on('hide.bs.dropdown', function (e) {
                    $(this).find('.dropdown-menu').velocity('transition.slideLeftOut', {
                        duration: 200,
                        complete: function () {
                            $(this).removeAttr('style');
                        }
                    });
                });

            });

        </script>

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

            ModulosUsuario mu = null;
            Aluno aluno = null;
            List<Turma> turmas = null;
            List<Inscricao> inscricoes = null;
            Inscricao inscricao = null;
            Turno turno = null;
            List<Notas> notas = null;
            Mensalidade mensalidade = null;
            Usuario usuarioAluno = null;
            List<HCal> hCals = null;
            Turma turma = null;

            int diasRestantes = 0;
            int faltas = 0;

            String comportamento = "";
            String semestre = "";
            float notaMaxima = 0;
            float notaMinima = 0;
            float mediaActual = 0;

            List<Pagamento> pagamentos = null;

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

                turmas = (List<Turma>) session.getAttribute("turmas");
                inscricoes = (List<Inscricao>) session.getAttribute("inscricoes");
                notas = (List<Notas>) session.getAttribute("notas");
                pagamentos = (List<Pagamento>) session.getAttribute("pagamentos");

                aluno = (Aluno) session.getAttribute("aluno");
                mensalidade = (Mensalidade) session.getAttribute("mensalidade");
                usuarioAluno = (Usuario) session.getAttribute("usuarioAluno");
                hCals = (List<HCal>) session.getAttribute("hCals");
                hCals = (List<HCal>) session.getAttribute("hCals");
                turma = (Turma) session.getAttribute("turma");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();
                comportamento = session.getAttribute("comportamento").toString();

                if (inscricoes != null) {
                    if (!inscricoes.isEmpty()) {
                        inscricao = inscricoes.get(0);
                    }
                }

                if (session.getAttribute("semestre") != null) {
                    semestre = session.getAttribute("semestre").toString();
                }

                response.setHeader("Refresh", timeout + "; URL =VXN1YXJpb1NlcnZsZXQjRENJ?" + encryptUtils.encodeString("accao#lockscreen&user=" + encryptUtils.decodeString(usuario.getUsuaUsuario()) + "&ei=" + entidade.getEntiId()));

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
                        <button type="button" onclick="history.back();" class="btn text-bold text-uppercase btn-labeled btn-labeled-left bg-danger-400 heading-btn">Voltar a lista de estudantes<b><i class="icon-users4"></i></b></button>

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
                                        <li class="navigation-header"><span>Menu Principal</span> <i class="icon-menu" title="Menu Principal"></i></li>
                                        <li><a href="TW9kdWxvU2VydmxldCNEQ0k=?YWNjYW8jcmVnaXN0by1hY2FkZW1pY28="><i class="icon-home4"></i> <span class="text-bold text-uppercase">Dashboard</span></a></li>

                                        <!-- GESTÃO -->
                                        <%
                                            if (mu.isMuiGestao()) {
                                        %>
                                        <li class="nav-item">
                                            <a href="#" class="nav-link"><i class="icon-database-edit2"></i> <span class="text-bold text-uppercase">Gestão da Escola</span></a>

                                            <ul class="nav nav-group-sub" data-submenu-title="Gestão">
                                                <%
                                                    if (mu.isMuiGestaoFormados()) {
                                                %>
                                                <li class="nav-item"><a href="QW5vTGVjdGl2b1NlcnZsZXQjRENJ?YWNjYW8jYW5vc0xlY3Rpdm9z" class="nav-link"><i class="icon-list-numbered"></i> Vagas</a></li>
                                                <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jYWx1bm8=" class="nav-link"><i class="icon-user-plus"></i> Registar Aluno</a></li>
                                                <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jaW1wb3J0YXI=" class="nav-link"><i class="icon-file-upload"></i> Importar Alunos</a></li>
                                                <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jYWx1bm9z" class="nav-link"><i class="icon-users2"></i> Listagem Alunos</a></li>
                                                <li>
                                                    <a href="#"><i class="icon-profile"></i> <span class="text-bold text-orange-600 text-uppercase">Matriculas</span></a>
                                                    <ul>
                                                        <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jaW5zY3JldmVyLWFsdW5v" class="nav-link"><i class="icon-profile"></i> Matricular Aluno</a></li>
                                                        <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jZGlzdHJpYnVpY2FvLWF1dG9tYXRpY2E=" class="nav-link"><i class="icon-align-right"></i> Distribuir Turmas</a></li>
                                                        <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jdmFsaWRhci1tYXRyaWN1bGE=" class="nav-link"><i class="icon-user-check"></i> Matriculas Online</a></li>
                                                        <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jbWF0cmljdWxhZG9z" class="nav-link"><i class="icon-collaboration"></i> Alunos Matriculados</a></li>
                                                    </ul>
                                                </li>
                                                <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jdHJhbnNmZXJpci1lc2NvbGE=" class="nav-link"><i class="icon-transmission"></i> Transferir para Escola</a></li>
                                                <li class="nav-item"><a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jdHJhbnNmZXJpci10dXJtYQ==" class="nav-link"><i class="icon-flip-vertical4"></i> Transferir para Turma</a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /gestão -->

                                        <!-- PLANOS ANUAIS -->
                                        <%
                                            if (mu.isMuiGestao()) {
                                        %>
                                        <li class="nav-item nav-item-submenu">
                                            <a href="#" class="nav-link"><i class="icon-book"></i> <span class="text-bold text-uppercase">Sumários/Planos aula</span></a>

                                            <ul class="nav nav-group-sub" data-submenu-title="Planos Temáticos">

                                                <li>
                                                    <a href="#"><i class="icon-archive"></i> <span class="text-bold text-orange-600 text-uppercase">Sumários</span></a>
                                                    <ul>
                                                        <li class="nav-item"><a href="UGxhbm9zU2VydmxldCNEQ0k=?YWNjYW8jdGVtYXM=" class="nav-link"><i class="icon-target"></i> Definir Tema</a></li>
                                                        <li class="nav-item"><a href="UGxhbm9zU2VydmxldCNEQ0k=?YWNjYW8jcGxhbm90ZW1hdGljbw==" class="nav-link"><i class="icon-clipboard3"></i> Visualizar Sumários</a></li>
                                                    </ul>
                                                </li>

                                                <li>
                                                    <a href="#"><i class="icon-bookmark"></i> <span class="text-bold text-orange-600 text-uppercase">PLANOS DE AULAS</span></a>
                                                    <ul>
                                                        <li class="nav-item"><a href="UGxhbm9zU2VydmxldCNEQ0k=?YWNjYW8jcGxhbm9z" class="nav-link"><i class="icon-pencil6"></i> Definir Plano</a></li>
                                                        <li class="nav-item"><a href="UGxhbm9zU2VydmxldCNEQ0k=?YWNjYW8jcGxhbm9hdWxh" class="nav-link"><i class="icon-books"></i> Visualizar Planos</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /planos anuais -->

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
                                                <li><a href="Q2FsZW5kYXJpb1NlcnZsZXQjRENJ?YWNjYW8jY2FsZW5kYXJpby1leGFtZQ=="><i class="icon-calendar"></i> Exames</a></li>
                                                <li><a href="Q2FsZW5kYXJpb1NlcnZsZXQjRENJ?YWNjYW8janVyaXM="><i class="icon-users"></i> Jurís Exame</a></li>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jZm9saGFz"><i class="icon-checkbox-checked"></i> Folhas de Resposta</a></li>
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
                                                <li>
                                                    <a href="#"><i class="icon-pencil-ruler"></i> <span class="text-bold text-orange-600 text-uppercase">GESTÃO DE NOTAS</span></a>
                                                    <ul>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jbm90YXM="><i class="icon-grid-alt"></i> Lançar Notas</a></li>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jaW1wb3J0YXItbm90YXM="><i class="icon-upload10"></i> Importar Notas</a></li>
                                                    </ul>
                                                </li>

                                                <li>
                                                    <a href="#"><i class="icon-stack-text"></i> <span class="text-bold text-orange-600 text-uppercase">GESTÃO DE EXAMES</span></a>
                                                    <ul>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jZGlzdHJpYnVpY2FvLWV4YW1l"><i class="icon-split"></i> Distribuição Alunos</a></li>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jbGlzdGEtZXhhbWVz"><i class="icon-sort-alpha-asc"></i> Candidatos Exame</a></li>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcHJlc2VuZXNhcy1leGFtZQ=="><i class="icon-checkmark-circle"></i>Marcar Presenças</a></li>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jbm90YXMtZXhhbWU="><i class="icon-check"></i> Carregar Respostas</a></li>
                                                    </ul>
                                                </li>
                                                <%
                                                    }

                                                    if (mu.isMuiAvaliacaoPautas()) {
                                                %>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcGF1dGFz"><i class="icon-table2"></i> Pauta Trimestral</a></li>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcGF1dGFzLWFudWFs"><i class="icon-grid2"></i> Pauta Freq. Anual</a></li>
                                                    <%
                                                        }

                                                        if (mu.isMuiAvaliacaoPresencas()) {
                                                    %>
                                                <li>
                                                    <a href="#"><i class="icon-spam"></i> <span class="text-bold text-orange-600 text-uppercase">Assiduidade</span></a>
                                                    <ul>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcHJlc2VuY2Fz"><i class="icon-blocked"></i> Faltas</a></li>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jaW1wb3J0YXItZmFsdGFz"><i class="icon-upload"></i> Importar Faltas</a></li>
                                                    </ul>
                                                </li>
                                                <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jY29tcG9ydGFtZW50bw=="><i class="icon-info3"></i> Comportamento</a></li>
                                                    <%
                                                        }

                                                        if (mu.isMuiAvaliacaoBoletins()) {
                                                    %>
                                                <li>
                                                    <a href="#"><i class="icon-certificate"></i> <span class="text-bold text-orange-600 text-uppercase">Certificados</span></a>
                                                    <ul>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jY2VydGlmaWNhZG9z"><i class="icon-stack-picture"></i> Emitir Certificado</a></li>
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jdmFsaWRhci1jZXJ0aWZpY2Fkbw=="><i class="icon-checkmark3"></i>  <span>Validar Pedido</span></a></li>
                                                    </ul>
                                                </li>
                                                <%
                                                    }
                                                %>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /avaliação -->

                                        <!-- CONSELHO DE ESCOLA -->
                                        <%
                                            if (mu.isMuiGestao()) {
                                        %>
                                        <li class="nav-item nav-item-submenu">
                                            <a href="#" class="nav-link"><i class="icon-collaboration"></i> <span class="text-bold text-uppercase">Conselho de Escola</span></a>

                                            <ul class="nav nav-group-sub" data-submenu-title="Conselho de Escola">
                                                <li class="nav-item"><a href="Q29uc2VsaG9TZXJ2bGV0I0RDSQ==?YWNjYW8jbWVtYnJvcw==" class="nav-link"><i class="icon-users2"></i> Membros</a></li>
                                                <li class="nav-item"><a href="Q29uc2VsaG9TZXJ2bGV0I0RDSQ==?YWNjYW8jZG9jdW1lbnRv" class="nav-link"><i class="icon-file-text2"></i> Emitir Notificação</a></li>
                                                <li class="nav-item"><a href="Q29uc2VsaG9TZXJ2bGV0I0RDSQ==?YWNjYW8jZG9jdW1lbnRvcw==" class="nav-link"><i class="icon-stack-text"></i> Notificações Emitidas</a></li>
                                            </ul>
                                        </li>
                                        <%
                                            }
                                        %>
                                        <!-- /conselho de escola -->

                                        <!-- RELATÓRIOS -->
                                        <li class="nav-item nav-item-submenu">
                                            <a href="#" class="nav-link"><i class="icon-stats-bars4"></i> <span class="text-bold text-uppercase">Relatórios</span></a>

                                            <ul class="nav nav-group-sub" data-submenu-title="Relatórios">
                                                

                                                <li class="nav-item"><a href="RXNjb2xhU2VydmxldCNEQ0k=?YWNjYW8jbWFwYS1mYWx0YXM=" class="nav-link"><i class="icon-spam"></i> Mapa de Faltas</a></li>
                                                <li class="nav-item"><a href="RXNjb2xhU2VydmxldCNEQ0k=?YWNjYW8jYXByb3ZlaXRhbWVudG8tcGVkYWdvZ2ljbw==" class="nav-link"><i class="icon-stack-check"></i> Aproveitamento</a></li>
                                                <li class="nav-item"><a href="RXNjb2xhU2VydmxldCNEQ0k=?YWNjYW8jbWF0ZXJpYWwtZGlzdHJpYnVpZG8=" class="nav-link"><i class="icon-design"></i> Material Distribuído</a></li>
                                                <li class="nav-item"><a href="RXNjb2xhU2VydmxldCNEQ0k=?YWNjYW8jbWVsaG9yZXMtYWx1bm9z" class="nav-link"><i class="icon-podium"></i> Melhores Alunos</a></li>
                                                <li class="nav-item"><a href="RXNjb2xhU2VydmxldCNEQ0k=?YWNjYW8jYWx1bm9zLW5lY2Vzc2l0YWRvcw==" class="nav-link"><i class="icon-collaboration"></i> Alunos Vulneráveis</a></li>
                                                <li class="nav-item"><a href="UGxhbm9zU2VydmxldCNEQ0k=?YWNjYW8jZXhlY3VjYW8tcGxhbm9z" class="nav-link"><i class="icon-clippy"></i> Execução dos Planos</a></li>
                                            </ul>
                                        </li>
                                        <!-- /relatórios -->

                                        <!-- PARAMETRIZAÇÃO -->

                                        <%
                                            if (mu.isMuiConfiguracao()) {
                                        %>
                                        <li class="nav-item nav-item-submenu">
                                            <a href="#" class="nav-link"><i class="icon-keyboard"></i> <span class="text-bold text-uppercase">Parametrização</span></a>

                                            <ul class="nav nav-group-sub" data-submenu-title="Parametrização">
                                                <%
                                                    if (mu.isMuiCursosAreasInscricao()) {
                                                %>
                                                <li class="nav-item"><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jYXJlYXM=" class="nav-link"><i class="icon-graduation2"></i> Categorias de Ensino</a></li>
                                                    <%
                                                        }

                                                        if (mu.isMuiCursosCursos()) {
                                                    %>
                                                <li class="nav-item"><a href="Q3Vyc29TZXJ2bGV0I0RDSQ==?YWNjYW8jY3Vyc29z" class="nav-link"><i class="icon-book"></i> Classes</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <li class="nav-item"><a href="Q2VudHJvU2VydmxldCNEQ0k=?YWNjYW8jY2VudHJvcw==" class="nav-link"><i class="icon-office"></i> Escolas</a></li>

                                                <li class="nav-item"><a href="RXNjb2xhU2VydmxldCNEQ0k=?YWNjYW8jZGlyZWN0b3Jlcw==" class="nav-link"><i class="icon-user-tie"></i> Directores das Escolas</a></li>

                                                <%
                                                    if (mu.isMuiGestaoFormadores()) {
                                                %>
                                                <li class="nav-item"><a href="RG9jZW50ZVNlcnZsZXQjRENJ?YWNjYW8jZG9jZW50ZXM=" class="nav-link"><i class="icon-reading"></i> Professores</a></li>
                                                    <%
                                                        }

                                                        if (mu.isMuiGestaoTurmas()) {
                                                    %>

                                                <li class="nav-item"><a href="VHVybWFTZXJ2bGV0I0RDSQ==?YWNjYW8jc2FsYXM=" class="nav-link"><i class="icon-home7"></i> Salas</a></li>
                                                <li class="nav-item"><a href="SG9yYXJpb1NlcnZsZXQjRENJ?YWNjYW8jaG9yYXJpb3M=" class="nav-link"><i class="icon-alarm"></i> Horários de Entrada</a></li>
                                                <li class="nav-item"><a href="VHVybWFTZXJ2bGV0I0RDSQ==?YWNjYW8jdHVybWFz" class="nav-link"><i class="icon-table"></i> Turmas</a></li>
                                                    <%
                                                        }

                                                        if (mu.isMuiDisciplinasGestao()) {
                                                    %>
                                                <li class="nav-item"><a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?YWNjYW8jZGlzY2lwbGluYXM=" class="nav-link"><i class="icon-book3"></i> Disciplinas</a></li>

                                                <%
                                                    }

                                                    if (mu.isMuiDisciplinasTurma()) {
                                                %>

                                                <li class="nav-item"><a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?YWNjYW8jZG9jZW50ZXNUdXJtYQ==" class="nav-link"><i class="icon-list3"></i> Turmas Professor</a></li>

                                                <%
                                                    }

                                                    if (mu.isMuiDisciplinasDocente()) {
                                                %>
                                                <li class="nav-item"><a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?YWNjYW8jZGlzY2lwbGluYXNEb2NlbnRl" class="nav-link"><i class="icon-user"></i> Disciplinas Professor</a></li>
                                                    <%
                                                        }
                                                    %>
                                            </ul>
                                        </li>

                                        <%
                                            }
                                        %>
                                        <!-- /parametrização -->

                                        <li class="nav-item">
                                            <a href="#" class="nav-link">
                                                <i class="icon-question3"></i>
                                                <span class = "text-uppercase text-bold">
                                                    FAQ
                                                </span>
                                            </a>
                                        </li>
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

                    <% if (inscricao != null) {

                            String primeiroNome = encryptUtils.decodeString(aluno.getPessoa().getPessNome());
                            String apelido = encryptUtils.decodeString(aluno.getPessoa().getPessApelido());
                            String email = encryptUtils.decodeString(aluno.getPessoa().getPessEmail());
                            String contacto = encryptUtils.decodeString(aluno.getPessoa().getPessContacto());
                            String endereco = encryptUtils.decodeString(aluno.getPessoa().getPessBairro());
                            String dataNascimento = "";
                            String dis = "readonly";
                            String fp = usuarioAluno.getUsuaFotoperfil();
                            String ocupacao = encryptUtils.decodeString(aluno.getPessoa().getPessActividade());

                            if (aluno.getPessoa().getPessDataNascimento() != null) {
                                dataNascimento = sdf.format(aluno.getPessoa().getPessDataNascimento().toGregorianCalendar().getTime());
                            }
                            String nacionalidade = "";

                            if (aluno.getPessoa().getNacionalidadenaci() != null) {
                                nacionalidade = encryptUtils.decodeString(aluno.getPessoa().getNacionalidadenaci().getNaciDescricao());
                            }
                            String naturalidade = encryptUtils.decodeString(aluno.getPessoa().getPessProvincia());
                            String sexo = encryptUtils.decodeString(aluno.getPessoa().getPessSexo());
                            String cidade = encryptUtils.decodeString(aluno.getPessoa().getPessBairro());
                            String cPostal = encryptUtils.decodeString(aluno.getPessoa().getPessRua()) + " / " + encryptUtils.decodeString(aluno.getPessoa().getPessNumeroCasa());

                            String tipoUsuario = usuarioAluno.getTipoUsuariotipu().getTipuDescricao();
                            String dataCriacao = sdf.format(usuarioAluno.getPessoapess().getPessDataCadastro().toGregorianCalendar().getTime());
                            String ultimoLogin = "Não definido";

                            String bi = encryptUtils.decodeString(aluno.getPessoa().getPessBi());
                            String nuit = encryptUtils.decodeString(aluno.getPessoa().getPessNuit());

                            if (usuarioAluno.getUsuDataUltimaVisita() != null) {
                                ultimoLogin = sdf.format(usuarioAluno.getUsuDataUltimaVisita().toGregorianCalendar().getTime());
                            }

                            String lblEstado = "bg-success-600";

                            String estado = usuarioAluno.getUsuaEstado();

                            if (estado.equals("Inactivo")) {
                                lblEstado = "bg-danger-600";
                            }

                            int nrAcessos = usuarioAluno.getUsuaTentativasLogin();

                            String curso = encryptUtils.decodeString(inscricao.getCurso().getCursDescricao());
                            String horario = encryptUtils.decodeString(inscricao.getTurma().getTurmHorario());

                            String dataUlt = "---";
                            String dataIns = sdf.format(inscricao.getInscDataInscricao().toGregorianCalendar().getTime());

                            if (inscricao.getInscDataUltimoPagamento() != null) {
                                dataUlt = sdf.format(inscricao.getInscDataUltimoPagamento().toGregorianCalendar().getTime());
                            }


                    %>  

                    <!-- Toolbar -->
                    <div class="navbar navbar-default navbar-component navbar-xs">
                        <ul class="nav navbar-nav visible-xs-block">
                            <li class="full-width text-center"><a data-toggle="collapse" data-target="#navbar-filter"><i class="icon-menu7"></i></a></li>
                        </ul>

                        <div class="navbar-collapse collapse" id="navbar-filter">
                            <ul class="nav navbar-nav element-active-slate-400">
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-profile position-left"></i> Ficha do Aluno</a></li>
                                <li><a href="#documentos" data-toggle="tab"  class="text-bold text-uppercase"><i class="icon-copy4 position-left"></i> Documentos</a></li>
                                <li><a href="#inscricoes" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-profile position-left" class="text-bold text-uppercase"></i> Inscrições</a></li>
                                <li><a href="#pagamentos" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-cash4 position-left" class="text-bold text-uppercase"></i> Pagamentos</a></li>
                                <li><a href="#notas" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-file-text position-left" class="text-bold text-uppercase"></i> Avaliações</a></li>
                                <li><a href="#avaliacao" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-info22 position-left" class="text-bold text-uppercase"></i> Outras Informações</a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->

                    <div class = "row">

                        <div class = "col-md-12 col-md-offset-0">

                            <!-- User profile -->
                            <div class="row">


                                <div class="col-lg-3">

                                    <!-- User thumbnail -->
                                    <div class="thumbnail">
                                        <div class="thumb thumb-rounded thumb-slide">
                                            <img src="http://<%=ip%>:8081/suc/images/profile-pictures/<%=fp%>" alt="">
                                            <div class="caption">
                                                <span>
                                                    <a href="#" class="btn text-bold text-uppercase bg-success-400 btn-icon btn-xs" data-popup="lightbox"><i class="icon-plus2"></i></a>
                                                    <a href="#" class="btn text-bold text-uppercase bg-success-400 btn-icon btn-xs"><i class="icon-link"></i></a>
                                                </span>
                                            </div>
                                        </div>

                                        <div class="caption text-center">
                                            <h6 class="text-semibold no-margin"><%=primeiroNome + " " + apelido%> <small class="display-block"><%=ocupacao%></small></h6>
                                            <ul class="icons-list mt-15">
                                                <li><a href="#" data-popup="tooltip" title="Google Drive"><i class="icon-google-drive"></i></a></li>
                                                <li><a href="#" data-popup="tooltip" title="Twitter"><i class="icon-twitter"></i></a></li>
                                                <li><a href="#" data-popup="tooltip" title="Github"><i class="icon-github"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <!-- /user thumbnail -->

                                    <!-- Navigation -->
                                    <div class="panel panel-flat">
                                        <div class="panel-heading">
                                            <h6 class="panel-title text-uppercase text-bold text-blue-800 text-bold">Resumo do usuário</h6>
                                        </div>

                                        <div class="list-group list-group-borderless no-padding-top">

                                            <a href="#" class="list-group-item"><i class="icon-users4"></i> <b>Grupo</b> <span class="badge bg-gray pull-right"><%=tipoUsuario%></span></a>
                                            <a href="#" class="list-group-item"><i class="icon-info22"></i> <b>Estado</b> <span class="badge <%=lblEstado%> pull-right"><%=estado%></span></a>
                                            <a href="#" class="list-group-item"><i class="icon-calendar2"></i> <b>Data de Criação</b>  <span class="badge bg-success pull-right"><%=dataCriacao%></span></a>
                                            <a href="#" class="list-group-item"><i class="icon-calendar52"></i>  <b>Data do Últ. Login</b>  <span class="badge bg-danger pull-right"><%=ultimoLogin%></span></a>
                                            <a href="#" class="list-group-item"><i class="icon-info22"></i>  <b>Nº Logins</b>  <span class="badge bg-teal gray pull-right"><%=nrAcessos%></span></a>

                                        </div>
                                    </div>
                                    <!-- /navigation -->


                                    <!-- Acompanhamento -->
                                    <div class="panel panel-flat">
                                        <div class="panel-heading">
                                            <h6 class="panel-title text-uppercase text-bold text-bold text-blue-800">Resumo da Inscrição</h6>
                                        </div>

                                        <div class="list-group list-group-borderless no-padding-top">

                                            <a href="#" class="list-group-item"> <span class="badge bg-slate-800"><%=curso%></span></a><br>
                                            <a href="#" class="list-group-item"><i class="icon-sort-time-asc"></i>  <strong>Data de inscrição</strong>  <span class="badge bg-teal pull-right"><%=dataIns%></span></a>
                                            <a href="#" class="list-group-item"><i class="icon-watch2"></i> <strong>Horário</strong>  <span class="badge bg-blue-700 pull-right"><%=horario%></span></a>
                                            <a href="#" class="list-group-item"><i class="icon-calendar22"></i> <strong>Último Pagamento</strong>  <span class="badge bg-brown pull-right"><%=dataUlt%></span></a>
                                            <a href="#" class="list-group-item"><i class="icon-exclamation"></i>  <strong>Dias Prox. Pagamento</strong>  <span class="badge bg-danger gray pull-right"><%=diasRestantes%></span></a>

                                        </div>
                                    </div>
                                    <!-- /acompanhamento -->

                                </div>


                                <div class="col-lg-9">
                                    <div class="tabbable">
                                        <div class="tab-content">


                                            <div class="tab-pane fade active in" id="settings">

                                                <!-- Profile info -->
                                                <div class="panel panel-flat">
                                                    <div class="panel-heading">
                                                        <h6 class="panel-title text-uppercase text-bold text-bold">Informações pessoais</h6>
                                                        <div class="heading-elements">
                                                            <ul class="icons-list">
                                                                <li><a data-action="collapse"></a></li>
                                                                <li><a data-action="reload"></a></li>

                                                            </ul>
                                                        </div>
                                                    </div>


                                                    <div class="panel-body">
                                                        <br>
                                                        <form >
                                                            <div class="form-group">
                                                                <div class="row">
                                                                    <div class="col-md-6">
                                                                        <label>Nome</label>
                                                                        <input type="text" class="form-control" value="<%=primeiroNome%>" class="form-control" disabled>
                                                                    </div>
                                                                    <div class="col-md-6">
                                                                        <label>Apelido</label>
                                                                        <input type="text" value="<%=apelido%>" class="form-control" disabled>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="form-group">
                                                                <div class="row">
                                                                    <div class="col-md-6">
                                                                        <label>Data de nascimento</label>
                                                                        <input type="text" class="form-control daterange-single" value="<%=dataNascimento%>" disabled>
                                                                    </div>
                                                                    <div class="col-md-6">
                                                                        <label>Sexo</label>
                                                                        <div class="row col-md-offset-0">

                                                                            <label class="radio-inline">
                                                                                <input type="radio" name="radio-inline-left" class="styled" checked="checked">
                                                                                <%=sexo%>
                                                                            </label>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="form-group">
                                                                <div class="row">
                                                                    <div class="col-md-6">
                                                                        <label>Nº Identificação</label>
                                                                        <input type="text" value="<%=bi%>" class="form-control"  disabled>
                                                                    </div>
                                                                    <div class="col-md-6">
                                                                        <label>Nuit</label>
                                                                        <input type="text" value="<%=nuit%>" class="form-control" disabled>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="form-group">
                                                                <div class="row">
                                                                    <div class="col-md-4">
                                                                        <label>Bairro</label>
                                                                        <input type="text" value="<%=cidade%>" class="form-control" disabled>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <label>Estado/Provincia</label>
                                                                        <input type="text" value="<%=naturalidade%>" class="form-control" disabled>
                                                                    </div>
                                                                    <div class="col-md-4">
                                                                        <label>Casa & Quarteirão</label>
                                                                        <input type="text" value="<%=cPostal%>" class="form-control" disabled>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="form-group">
                                                                <div class="row">
                                                                    <div class="col-md-6">
                                                                        <label>Email</label>
                                                                        <input type="text" readonly="readonly" value="<%=email%>" class="form-control" disabled>
                                                                    </div>
                                                                    <div class="col-md-6">
                                                                        <label>Nacionalidade</label><input type="text" value="<%=nacionalidade%>" class="form-control"  disabled>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="form-group">
                                                                <div class="row">
                                                                    <div class="col-md-6">
                                                                        <label>Contacto #</label>
                                                                        <input type="text" value="<%=contacto%>" class="form-control"  disabled>
                                                                    </div>
                                                                    <div class="col-md-6">
                                                                        <label>Endereço</label>
                                                                        <input type="text" value="<%=endereco%>" class="form-control" disabled>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                                <!-- /profile info -->

                                                <div class ="row">
                                                    <div class="col-md-4">

                                                        <div class="panel panel-body border-top-blue text-center">
                                                            <div class="text-center">
                                                                <div class="icon-object border-blue text-blue-600"><i class="icon-list3"></i></div>
                                                                <p class="content-group-sm text-muted text-uppercase text-bold">Histórico de Pagamentos</p>
                                                            </div>
                                                            <br>
                                                            <button type="button" class="btn text-bold text-uppercase bg-blue-600 btn-labeled btn-rounded" data-toggle="modal" data-target="#modal_pagamentos"><b><i class="icon-list3"></i></b> Ver histórico</button>
                                                        </div>
                                                    </div>

                                                    <div class="col-md-4">

                                                        <div class="panel panel-body border-top-danger text-center">
                                                            <div class="text-center">
                                                                <div class="icon-object border-danger text-danger-600"><i class="icon-book2"></i></div>
                                                                <p class="content-group-sm text-muted text-uppercase text-bold">Adicionar Inscrição</p>
                                                            </div>
                                                            <br>
                                                            <button type="button" class="btn text-bold text-uppercase bg-danger-600 btn-labeled btn-rounded" data-toggle="modal" data-target="#modal_inscricao"><b><i class="icon-accessibility"></i></b>Inscrever estudante</button>
                                                        </div>
                                                    </div>

                                                    <div class="col-md-4">

                                                        <div class="panel panel-body border-top-teal text-center">
                                                            <div class="text-center">
                                                                <div class="icon-object border-teal text-teal-600"><i class="icon-plus-circle2"></i></div>
                                                                <p class="content-group-sm text-muted text-uppercase text-bold">Nova Mensalidade</p>
                                                            </div>
                                                            <br>
                                                            <button type="button" class="btn text-bold text-uppercase bg-teal-600 btn-labeled btn-rounded" data-toggle="modal" data-target="#modal_indisponivel"><b><i class="icon-plus-circle2"></i></b> Adicionar mensalidade</button>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>




                                            <div class="tab-pane fade" id="inscricoes">


                                                <div class="col-md-12">




                                                    <!-- Basic responsive configuration -->
                                                    <div class="panel panel-flat">
                                                        <div class="panel-heading">
                                                            <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Inscrições do estudante</h6>
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
                                                                    <th class="text-bold text-uppercase">Ano</th>
                                                                    <th class="text-bold text-uppercase">Classe</th>
                                                                    <th class="text-bold text-uppercase">Horário</th>
                                                                    <th class="text-bold text-uppercase">Estado</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>

                                                                <%
                                                                    if (inscricoes != null) {

                                                                        int x = 0;

                                                                        for (Inscricao i : inscricoes) {
                                                                            String lbl = "label-default";
                                                                            String txt = "---";

                                                                            x++;

                                                                            if (x == 1) {
                                                                                lbl = "label-success";
                                                                                txt = "Corrente";
                                                                            }

                                                                            String ref = encryptUtils.decodeString(i.getInscReferencia());
                                                                            String ano = encryptUtils.decodeString(i.getInscAnoLectivo());
                                                                            String curs = encryptUtils.decodeString(i.getCurso().getCursDescricao());
                                                                            String hor = encryptUtils.decodeString(i.getTurma().getTurmHorario());

                                                                %>
                                                                <tr>
                                                                    <td><a href="#"><%=ref%></a></td>
                                                                    <td><a href="#"><%=ano%></a></td>
                                                                    <td><%=curs%></td>
                                                                    <td><%=hor%></td>
                                                                    <td><span class="label <%=lbl%>"><%=txt%></span></td>
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




                                            <div class="tab-pane fade" id="pagamentos">



                                                <div class = "row">

                                                    <div class = "row">
                                                        <!-- Vertical form options -->
                                                        <div class="col-md-4">

                                                            <!-- Basic layout-->
                                                            <form action="#">
                                                                <div class="panel panel-flat">
                                                                    <div class="panel-heading">
                                                                        <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Selecione o Periodo</h6>
                                                                        <div class="heading-elements">
                                                                            <ul class="icons-list">
                                                                                <li><a data-action="collapse"></a></li>
                                                                                <li><a data-action="reload"></a></li>

                                                                            </ul>
                                                                        </div>
                                                                    </div>

                                                                    <div class="panel-body">


                                                                        <div class="form-group">
                                                                            <label>Periodo (Data): </label>

                                                                            <div class="input-group">
                                                                                <span class="input-group-addon"><i class="icon-calendar22"></i></span>
                                                                                <input type="text" class="form-control daterange-weeknumbers"> 
                                                                            </div>
                                                                        </div>


                                                                        <div class="text-right">
                                                                            <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800">Filtrar Resultados <i class="icon-filter3 position-right"></i></button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </form>
                                                            <!-- /basic layout -->

                                                        </div>

                                                    </div>

                                                    <div class= "row">

                                                        <div class="col-md-12">



                                                            <!-- Basic responsive configuration -->
                                                            <div class="panel panel-flat">
                                                                <div class="panel-heading">
                                                                    <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Histórico de pagamentos</h6>
                                                                    <div class="heading-elements">
                                                                        <ul class="icons-list">
                                                                            <li><a data-action="collapse"></a></li>
                                                                            <li><a data-action="reload"></a></li>

                                                                        </ul>
                                                                    </div>
                                                                </div>


                                                                <div class="panel-body">
                                                                    <p>
                                                                        <a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jaW1wcmltaXItcGFnYW1lbnRvcw==" target="_blank" class="btn bg-slate-400 btn-labeled btn-lg text-bold text-uppercase">
                                                                            <b><i class="icon-printer2"></i></b>
                                                                            Imprimir registos
                                                                        </a>

                                                                </div>

                                                                <table class="table datatable-responsive">
                                                                    <thead>
                                                                        <tr>
                                                                            <th class="text-bold text-uppercase">#</th>
                                                                            <th class="text-bold text-uppercase">REF.</th>
                                                                            <th class="text-bold text-uppercase">Descrição</th>
                                                                            <th class="text-bold text-uppercase">valor</th>
                                                                            <th class="text-bold text-uppercase">Data Lim.</th>
                                                                            <th class="text-bold text-uppercase">Data Pag.</th>
                                                                            <th class="text-bold text-uppercase">v. Multa</th>
                                                                            <th class="text-bold text-uppercase">v. Pago</th>
                                                                            <th class="text-bold text-uppercase">Recibo</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>

                                                                        <%
                                                                            double totalPago = 0;
                                                                            double totalPrestacoes = 0;
                                                                            double totalMultas = 0;

                                                                            if (pagamentos != null) {
                                                                                for (Pagamento p : pagamentos) {

                                                                                    int id = p.getPagId();
                                                                                    String ref = encryptUtils.decodeString(p.getPagRefOnline());
                                                                                    String desc = encryptUtils.decodeString(p.getPagDescricao());

                                                                                    String status = "Pendente";
                                                                                    String lblStatus = "bg-orange-600";

                                                                                    String bgPrint = "bg-danger-400";
                                                                                    String actP = "#";
                                                                                    String tar = "";

                                                                                    if (p.isPagStatus()) {
                                                                                        status = "Confirmado";
                                                                                        lblStatus = "bg-success-600";
                                                                                        bgPrint = "bg-success-400";

                                                                                        actP = "UGFnYW1lbnRvU2VydmxldCNEQ0k=?" + encryptUtils.encodeString("accao#imprimir-pagamento&id=" + id);
                                                                                        tar = "target ='_blank'";
                                                                                    }

                                                                                    String dte = sdf.format(p.getPagData().toGregorianCalendar().getTime());;
                                                                                    String dteL = "---";

                                                                                    String dteP = "---";

                                                                                    if (p.getPagDataPagamento() != null) {
                                                                                        dteP = sdf.format(p.getPagDataPagamento().toGregorianCalendar().getTime());
                                                                                    }

                                                                                    String valor = df.format(p.getPagValor());
                                                                                    String valorPago = df.format(p.getPagValorPago());

                                                                                    double vMulta = 0;

                                                                                    int diasTrial = 0;

                                                                                    int multa = 0;

                                                                                    if (p.getPagDataLimite() != null) {
                                                                                        Date dtaProx = p.getPagDataLimite().toGregorianCalendar().getTime();
                                                                                        Date dtaHoje = new Date();
                                                                                        diasTrial = Days.daysBetween(new DateTime(dtaProx), new DateTime(dtaHoje)).getDays();

                                                                                        dteL = sdf.format(p.getPagDataLimite().toGregorianCalendar().getTime());

                                                                                    }

                                                                                    String lblD = "bg-success-300";
                                                                                    if (diasTrial > 0) {

                                                                                        lblD = "bg-danger-300";
                                                                                    }

                                                                                    if (diasTrial > 0 && diasTrial <= 10) {
                                                                                        multa = 10;
                                                                                    }

                                                                                    if (diasTrial > 10 && diasTrial <= 20) {
                                                                                        multa = 20;
                                                                                    }

                                                                                    if (diasTrial > 20 && diasTrial < 30) {
                                                                                        multa = 20;
                                                                                    }

                                                                                    if (diasTrial >= 20) {
                                                                                        multa = 30;
                                                                                    }
                                                                                    
                                                                                    multa = 0;

                                                                                    if (multa != 0) {
                                                                                        vMulta = p.getPagValor() * (multa / 100.f);
                                                                                    }
                                                                                    totalPrestacoes += p.getPagValor();

                                                                                    totalMultas += vMulta;

                                                                                    if (p.isPagStatus()) {
                                                                                        totalPago += p.getPagValorPago();
                                                                                    }

                                                                        %>
                                                                        <tr>
                                                                            <td><a href="#"><%=id%></a></td>
                                                                            <td><small><a href="#"><%=ref%></a></small></td>
                                                                            <td><%=desc%> - <br><span class="label <%=lblStatus%>"><%=status%></span></td>

                                                                            <td><%=valor%></td>
                                                                            <td><span class="label <%=lblD%>"><%=dte + " á " + dteL%></span></td>
                                                                            <td><span class="label bg-slate-400"><%=dteP%></span></td>
                                                                            <td  class="text-danger-600"><%=df.format(vMulta) + " - (" + multa + "%)"%></td>
                                                                            <td class="text-bold"><%=valorPago%></td>
                                                                            <td><a href="<%=actP%>" class="btn <%=bgPrint%>" <%=tar%>><i class="icon-printer"></i></a></td>
                                                                        </tr>
                                                                        <%
                                                                                }
                                                                            }
                                                                        %>
                                                                    </tbody>
                                                                </table>

                                                                <div class="panel-footer">

                                                                    <div class="table-responsive">
                                                                        <table class="table">
                                                                            <thead>
                                                                                <tr>
                                                                                    <th class="text-bold text-uppercase">Total Prestações</th>
                                                                                    <th class="text-bold text-uppercase">Total Multas</th>
                                                                                    <th class="text-bold text-uppercase">Total Pago</th>
                                                                                    <th class="text-bold text-uppercase">Total Saldo</th>
                                                                                </tr>
                                                                            </thead>
                                                                            <tbody>
                                                                                <tr>
                                                                                    <td class="text-semibold text-danger-700"><%=df.format(totalPrestacoes)%></td>
                                                                                    <td class="text-semibold text-danger-700"><%=df.format(totalMultas)%></td>
                                                                                    <td class="text-semibold text-danger-700"><%=df.format(totalPago)%></td>
                                                                                    <td class="text-semibold text-danger-700"><%=df.format(totalPrestacoes + totalMultas - totalPago)%></td>

                                                                                </tr>

                                                                            </tbody>
                                                                        </table>
                                                                    </div>

                                                                </div>
                                                            </div>
                                                            <!-- /basic responsive configuration -->

                                                        </div>
                                                    </div>
                                                    <!-- /vertical form options -->
                                                </div>	

                                            </div>


                                            <div class="tab-pane fade" id="notas">


                                                <div class="row col-md-offset-2">

                                                    <div class="col-md-8">


                                                        <!-- Basic layout-->
                                                        <form action="#" class="form-horizontal">
                                                            <div class="panel panel-flat">
                                                                <div class="panel-heading">
                                                                    <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Periodo de Pesquisa</h6>
                                                                    <div class="heading-elements">
                                                                        <ul class="icons-list">
                                                                            <li><a data-action="collapse"></a></li>
                                                                            <li><a data-action="reload"></a></li>
                                                                        </ul>
                                                                    </div>
                                                                </div>

                                                                <div class="panel-body">


                                                                    <div class="form-group">
                                                                        <label class="col-lg-3 control-label text-bold">Inscrição:</label>
                                                                        <div class="col-lg-6">

                                                                            <select class="select">
                                                                                <optgroup label="Selecione a inscrição">

                                                                                    <%
                                                                                        if (inscricoes != null) {

                                                                                            for (Inscricao i : inscricoes) {
                                                                                                int id = i.getInscId();
                                                                                                String ref = encryptUtils.decodeString(i.getInscReferencia());
                                                                                    %>
                                                                                    <option value="<%=id%>"><%=ref%></option>
                                                                                    <%
                                                                                            }
                                                                                        }
                                                                                    %>
                                                                                </optgroup>
                                                                            </select>
                                                                        </div>
                                                                    </div>


                                                                    <div class="form-group">
                                                                        <label class="col-lg-3 control-label">Grupo:</label>
                                                                        <div class="col-lg-9">
                                                                            <div class="row">

                                                                                <label class="radio-inline">
                                                                                    <input type="radio" name="grupo" class="styled"  value="Avaliações Normais">
                                                                                    Avaliações Normais
                                                                                </label>

                                                                                <label class="radio-inline">
                                                                                    <input type="radio" name="grupo" class="styled" value="Exames" checked>
                                                                                    Exames
                                                                                </label>
                                                                            </div>
                                                                        </div>
                                                                    </div>



                                                                    <div class="text-right">
                                                                        <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800">Filtrar resultados <i class="icon-filter3 position-right"></i></button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </form>
                                                        <!-- /basic layout -->

                                                    </div>


                                                </div>



                                                <div class= "row">

                                                    <div class="col-md-12">





                                                        <!-- Basic responsive configuration -->
                                                        <div class="panel panel-flat">
                                                            <div class="panel-heading">
                                                                <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Histórico de notas dos exames da <span class="text-danger">#REF</span></h6>
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
                                                                        <th class="text-bold text-uppercase">Disciplina</th>
                                                                        <th class="text-uppercase text-bold">Nota</th>
                                                                        <th class="text-uppercase text-bold">1º Epoca</th>
                                                                        <th class="text-uppercase text-bold">Recorrência</th>
                                                                        <th class="text-uppercase text-bold">Média</th>
                                                                        <th class="text-uppercase text-bold">A. Final</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>

                                                                    <tr>
                                                                        <td><a href="#">001</a></td>
                                                                        <td><a href="#">---</a></td>
                                                                        <td class="text-center"><span class="label bg-grey-600">--</span></td>
                                                                        <td class="text-center"><span class="label bg-grey-600">---</span></td>
                                                                        <td class="text-center"><span class="label bg-slate-800">---</span></td>
                                                                        <td class="text-center"><span class="label bg-grey-600">---</span></td>
                                                                        <td class="text-center"><span class="label bg-success-600">---</span></td>
                                                                    </tr>

                                                                </tbody>
                                                            </table>
                                                        </div>
                                                        <!-- /basic responsive configuration -->

                                                    </div>
                                                </div>

                                            </div>





                                            <div class="tab-pane fade" id="documentos">

                                                <div class ="row">
                                                    <div class="col-md-6">

                                                        <!-- Basic table -->
                                                        <div class="panel panel-flat">
                                                            <div class="panel-heading">
                                                                <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Documentos apresentados</h6>
                                                                <div class="heading-elements">
                                                                    <ul class="icons-list">
                                                                        <li><a data-action="collapse"></a></li>
                                                                        <li><a data-action="reload"></a></li>

                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <div class="table-responsive">
                                                                <table class="table">
                                                                    <thead>
                                                                        <tr>
                                                                            <th class="text-bold text-uppercase">Descrição</th>
                                                                            <th class="text-bold text-uppercase">---</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>

                                                                        <%
                                                                            String iD = "";
                                                                            String iB = "";
                                                                            String iF = "";

                                                                            if (inscricao != null) {
                                                                                if (inscricao.isInscCertificado()) {
                                                                                    iD = "checked";
                                                                                }
                                                                                if (inscricao.isInscCopiaBI()) {
                                                                                    iB = "checked";
                                                                                }
                                                                                if (inscricao.isInscFotos()) {
                                                                                    iF = "checked";
                                                                                }
                                                                            }
                                                                        %>

                                                                        <tr>
                                                                            <td><i class="icon-file-text"></i> <b>Certificado/ Declaração Provisória</b></td>
                                                                            <td>
                                                                                <input type="checkbox" data-on-color="success" data-off-color="danger" data-on-text="SIM" data-off-text="NÃO" class="switch" <%=iD%> disabled>
                                                                            </td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-copy3"></i> <b>Cópia do BI</b></td>
                                                                            <td>
                                                                                <input type="checkbox" data-on-color="success" data-off-color="danger" data-on-text="SIM" data-off-text="NÃO" class="switch" <%=iB%> disabled>
                                                                            </td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-stack-picture"></i> <b>Fotos</b></td>
                                                                            <td>
                                                                                <input type="checkbox" data-on-color="success" data-off-color="danger" data-on-text="SIM" data-off-text="NÃO" class="switch" <%=iF%> disabled>

                                                                            </td>
                                                                        </tr>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </div>
                                                        <!-- /basic table -->

                                                    </div>
                                                </div>
                                            </div>


                                            <div class="tab-pane fade" id="avaliacao">

                                                <div class ="row">
                                                    <div class="col-md-6 col-md-offset-2">


                                                        <!-- Basic table -->
                                                        <div class="panel panel-flat">
                                                            <div class="panel-heading">
                                                                <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Avaliação</h6>
                                                                <div class="heading-elements">
                                                                    <ul class="icons-list">
                                                                        <li><a data-action="collapse"></a></li>
                                                                        <li><a data-action="reload"></a></li>

                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <div class="table-responsive">
                                                                <table class="table">
                                                                    <thead>
                                                                        <tr>
                                                                            <th class="text-bold text-uppercase">Descrição</th>
                                                                            <th class="text-bold text-uppercase">Detalhes</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                        <tr>
                                                                            <td><i class="icon-brain"></i> <b>Comportamento</b></td>
                                                                            <td><span class="label label-success"><%=comportamento%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-arrow-up-right32"></i> <b>Melhor Nota</b></td>
                                                                            <td><span class="label label-success"><%=df.format(notaMaxima)%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-arrow-down-left32"></i> <b>Pior Nota</b></td>
                                                                            <td><span class="label label-default"><%=df.format(notaMinima)%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-medal"></i> <b>Média Actual</b></td>
                                                                            <td><span class="label label-success"><%=df.format(mediaActual)%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-spam"></i> <b>Faltas</b></td>
                                                                            <td><span class="label label-danger"><%=faltas%></span></td>
                                                                        </tr>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </div>
                                                        <!-- /basic table -->
                                                    </div>

                                                </div>


                                                <!-- row.3 -->
                                                <div class ="row">


                                                    <%
                                                        String ref = "";
                                                        String dd = "";
                                                        String tur = "";
                                                        String cur = "";
                                                        String hor = "";
                                                        String dI = "";
                                                        String dF = "";
                                                        String min = "";
                                                        String max = "";

                                                        String dias[] = {"SEGUNDA-FEIRA", "TERÇA-FEIRA", "QUARTA-FEIRA", "QUINTA-FEIRA", "SEXTA-FEIRA", "SABÁDO"};

                                                        String horarios[] = {"07:00 - 07:45", "07:50 - 08:35", "08:40 - 09:25", "09:45 - 10:30", "10:35 - 11:20", "11:25 - 12:10",
                                                            "12:15 - 13:00", "13:05 - 13:50", "14:45 - 15:30", "15:45 - 16:30", "16:35 - 17:20", "17:25 - 18:10"};

                                                        if (turma != null) {

                                                            ref = encryptUtils.decodeString(turma.getTurmReferencia());
                                                            dd = encryptUtils.decodeString(turma.getTurmDescricao());
                                                            tur = encryptUtils.decodeString(turma.getTurmTurno());
                                                            hor = encryptUtils.decodeString(turma.getTurmHorario());
                                                            cur = encryptUtils.decodeString(turma.getCurso().getCursCod())
                                                                    + " - " + encryptUtils.decodeString(turma.getCurso().getCursDescricao());

                                                            dI = sdf.format(turma.getTurmDataInicio().toGregorianCalendar().getTime());
                                                            dF = sdf.format(turma.getTurmDataFim().toGregorianCalendar().getTime());

                                                            min = turma.getTurmMinEstudantes() + "";
                                                            max = turma.getTurmMaxEstudantes() + "";
                                                        }
                                                    %>

                                                    <div class="col-md-12">
                                                        <!-- Bordered panel body table -->
                                                        <div class="panel panel-flat">
                                                            <div class="panel-heading">
                                                                <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Horário Actual <span class="text-danger-600">[<%=cur + "|" + dd + "|" + semestre%>]</span></h6>
                                                                <div class="heading-elements">
                                                                    <ul class="icons-list">
                                                                        <li><a data-action="collapse"></a></li>
                                                                        <li><a data-action="reload"></a></li>

                                                                    </ul>
                                                                </div>
                                                            </div>

                                                            <div class="panel-body">

                                                                <p>
                                                                    <a href="Q2FsZW5kYXJpb1NlcnZsZXQjRENJ?YWNjYW8jaW1wcmltaXItaG9yYXJpbw==" target="_blank" class="btn  bg-slate-800 btn-labeled btn-lg text-bold text-uppercase">
                                                                        <b><i class="icon-printer2"></i></b>
                                                                        Imprimir horário
                                                                    </a>

                                                                </p>

                                                                <div class="table-responsive">
                                                                    <table class="table table-bordered table-framed table-responsive">
                                                                        <thead>
                                                                            <tr>
                                                                                <th class="text-bold text-uppercase"></th>

                                                                                <%                                                        for (String d : dias) {
                                                                                %>
                                                                                <th class="text-bold text-uppercase"><%=d%></th>
                                                                                    <%
                                                                                        }
                                                                                    %>
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>

                                                                            <%
                                                                                if (hCals != null) {
                                                                                    for (HCal hc : hCals) {

                                                                                        String h = hc.getHorario();
                                                                            %>
                                                                            <tr>
                                                                                <td><%=h%></td>

                                                                                <%
                                                                                    List<String> aulas = hc.getAulas();

                                                                                    for (String disx : aulas) {

                                                                                        if (!disx.equals("")) {
                                                                                %>
                                                                                <td><%=disx%></td>
                                                                                <%
                                                                                } else {
                                                                                %>
                                                                                <td class="bg-success-300 text-success-300">--</td>

                                                                                <%
                                                                                        }
                                                                                    }
                                                                                %>

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
                                                        <!-- /bordered panel body table -->

                                                    </div>
                                                </div>
                                                <!-- /row.3 -->

                                            </div>


                                        </div>
                                    </div>
                                </div>


                            </div>
                            <!-- /user profile -->

                            <!-- Modal Pagamentos -->
                            <div id="modal_pagamentos" class="modal fade">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">

                                        <div class="modal-body">



                                            <!-- Basic responsive configuration -->
                                            <div class="panel panel-flat">
                                                <div class="panel-heading">
                                                    <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Histórico de pagamentos</h6>
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
                                                            <th class="text-bold text-uppercase">Data Pagamento</th>
                                                            <th class="text-bold text-uppercase">Valor</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>

                                                        <%
                                                            if (pagamentos != null) {

                                                                for (Pagamento p : pagamentos) {
                                                                    int id = p.getPagId();
                                                                    String desc = encryptUtils.decodeString(p.getPagDescricao());
                                                                    String dte = "---";
                                                                    String val = df.format(p.getPagValor());
                                                                    String status = "Pendente";
                                                                    String lblStatus = "bg-orange-600";

                                                                    String bgPrint = "bg-danger-700";
                                                                    String actP = "#";
                                                                    String tar = "";

                                                                    if (p.isPagStatus()) {
                                                                        status = "Confirmado";
                                                                        lblStatus = "bg-success-600";
                                                                        bgPrint = "bg-success-700";

                                                                        actP = "UGFnYW1lbnRvU2VydmxldCNEQ0k=?" + encryptUtils.encodeString("imprimir-pagamento&id=" + id);
                                                                        tar = "_blank";
                                                                    }

                                                                    if (p.getPagDataPagamento() != null) {
                                                                        dte = sdf.format(p.getPagDataPagamento().toGregorianCalendar().getTime());
                                                                    }
                                                        %>
                                                        <tr>
                                                            <td><a href="#"><%=id%></a></td>
                                                            <td><a href="#"><%=desc%> - <span class="label <%=lblStatus%>"><%=status%></a></td>

                                                            <td><span class="label bg-slate-400"><%=dte%></span></td>
                                                            <td><%=val%></td>
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

                                        <div class="modal-footer">
                                            <button type="button" class="btn text-bold text-uppercase btn-danger" data-dismiss="modal"><i class="icon-chevron-down"></i>  Fechar</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- /modal pagamentos -->

                            <!-- Alterar plano -->
                            <div id="modal_inscricao" class="modal fade">
                                <div class="modal-dialog">
                                    <div class="modal-content">

                                        <div class="modal-body">


                                            <!-- 2 columns form -->

                                            <form action="#" method="post" accept-charset="ISO-8859-1" class="form-horizontal">
                                                <div class="panel panel-flat">
                                                    <div class="panel-heading">
                                                        <h6 class="panel-title text-uppercase text-bold text-bold">Inscrever estudante em uma nova turma</h6>

                                                    </div>

                                                    <div class="panel-body">
                                                        <div class="row">


                                                            <div class="col-md-12">



                                                                <fieldset>
                                                                    <legend class="text-semibold"><i class="icon-clipboard2 position-left"></i> Inscrição</legend>

                                                                    <div class="form-group">
                                                                        <label class="col-lg-3 control-label">Data:</label>
                                                                        <div class="col-lg-9">
                                                                            <div class="row">
                                                                                <div class="col-md-5">
                                                                                    <input type="text" placeholder="Data da inscrição" class="form-control mb-15  daterange-single" name="dataMensalidade">
                                                                                </div>

                                                                                <div class="col-md-7">
                                                                                    <select data-placeholder="Selecione a turma" class="select" name="idTurma" required="">
                                                                                        <option></option>
                                                                                        <%
                                                                                            if (turmas != null) {
                                                                                                for (Turma t : turmas) {

                                                                                                    int id = t.getTurmId();

                                                                                                    String desc = encryptUtils.decodeString(t.getTurmDescricao()) + "|" + encryptUtils.decodeString(t.getCurso().getCursDescricao()) + "|" + encryptUtils.decodeString(t.getTurmHorario());

                                                                                                    String sel = "";
                                                                                                    if (aluno != null) {
                                                                                                        if (t.getTurmId() == aluno.getAlunTurno()) {
                                                                                                            sel = "selected";
                                                                                                        }
                                                                                                    }
                                                                                        %>
                                                                                        <option value="<%=id%>" <%=sel%> class="text-bold"><%=desc%></option> 
                                                                                        <%
                                                                                                }
                                                                                            }
                                                                                        %>
                                                                                    </select>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>


                                                                </fieldset>
                                                            </div>

                                                        </div>

                                                        <div class="text-right">
                                                            <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800">Actualizar Info <i class="icon-reload-alt position-right"></i></button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </form>
                                            <!-- /2 columns form -->
                                        </div>

                                        <div class="modal-footer">
                                            <button type="button" class="btn text-bold text-uppercase btn-danger" data-dismiss="modal"><i class="icon-chevron-down"></i>  Fechar</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- /alterar plano -->





                            <!-- Recurso Indisponivel -->
                            <div id="modal_indisponivel" class="modal fade">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h6 class="modal-title text-bold">Notificação do Sistema</h6>
                                        </div>

                                        <div class="modal-body text-center">
                                            <h1 class="error-title"><i class="icon-spinner2 spinner text-teal-400" style="font-size:200px"></i></h1>
                                            <h6 class="text-bold content-group text-teal-400">Módulo indisponível !</h6>
                                            <h6 class="text-semibold text-justify">A nossa equipe de desenvolvimento encontra-se no momento a trabalhar para disponibilizar o recurso solicitado, em breve irá notifica-lo para a utilização do mesmo !</h6>
                                        </div>

                                        <div class="modal-footer">
                                            <button type="button" class="btn text-bold text-uppercase btn-danger" data-dismiss="modal"><i class="icon-chevron-down"></i>  Fechar</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- /recurso indisponivel -->

                        </div>
                        <!-- /vertical form options -->
                    </div>					


                    <%    }
                    %>
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


        <script type="text/javascript">
            /* ------------------------------------------------------------------------------
             *
             *  # Styled checkboxes, radios and file input
             *
             *  Specific JS code additions for form_checkboxes_radios.html page
             *
             *  Version: 1.0
             *  Latest update: Aug 1, 2015
             *
             * ---------------------------------------------------------------------------- */

            $(function () {


                //
                // Contextual colors
                //

                // Primary
                $(".control-primary").uniform({
                    radioClass: 'choice',
                    wrapperClass: 'border-primary-600 text-primary-800'
                });

                // Danger
                $(".control-danger").uniform({
                    radioClass: 'choice',
                    wrapperClass: 'border-danger-600 text-danger-800'
                });

                // Success
                $(".control-success").uniform({
                    radioClass: 'choice',
                    wrapperClass: 'border-success-600 text-success-800'
                });

                // Warning
                $(".control-warning").uniform({
                    radioClass: 'choice',
                    wrapperClass: 'border-warning-600 text-warning-800'
                });

                // Info
                $(".control-info").uniform({
                    radioClass: 'choice',
                    wrapperClass: 'border-info-600 text-info-800'
                });

                // Custom color
                $(".control-custom").uniform({
                    radioClass: 'choice',
                    wrapperClass: 'border-indigo-600 text-indigo-800'
                });



                // Bootstrap switch
                // ------------------------------

                $(".switch").bootstrapSwitch();

            });


        </script>

        <script type="text/javascript" src="assets/js/pages/picker_date.js"></script>
    </body>
</html>
