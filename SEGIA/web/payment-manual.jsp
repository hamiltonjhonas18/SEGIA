<%-- 
    Document   : payment-manual
    Created on : Feb 8, 2017, 7:04:20 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.Pagamento"%>
<%@page import="com.dciapps.webclient.Turma"%>
<%@page import="com.dciapps.webclient.ModulosUsuario"%>
<%@page import="com.dciapps.webclient.Entidade"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.webclient.Usuario"%>
<%@page import="com.dciapps.controller.GenericHandler"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA - Gerar Pagamentos</title>

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
        <script type="text/javascript" src="assets/js/plugins/forms/styling/switchery.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/selects/bootstrap_multiselect.js"></script>
        <script type="text/javascript" src="assets/js/plugins/ui/moment/moment.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/daterangepicker.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/core.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/wizards/form_wizard/form.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/wizards/form_wizard/form_wizard.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/selects/select2.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
        <script type="text/javascript" src="assets/js/core/libraries/jasny_bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/validation/validate.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/notifications/sweet_alert.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/tables/datatables/datatables.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/tables/datatables/extensions/responsive.min.js"></script>

        <script type="text/javascript" src="assets/js/core/app.js"></script>
        <script type="text/javascript" src="assets/js/pages/components_popups.js"></script>



        <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3_tooltip.js"></script>


        <script type="text/javascript" src="assets/js/plugins/visualization/d3/d3.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/visualization/c3/c3.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/visualization/echarts/echarts.js"></script>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>


        <script type="text/javascript" src="assets/js/pages/wizard_form.js"></script>

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
            SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            EncryptUtils encryptUtils = new EncryptUtils();

            ModulosUsuario mu = null;

            String msgErro = "";
            String alerta = "";
            Entidade entidade = (Entidade) session.getAttribute("entidadeSelecionada");

            List<Pagamento> pagamentos = null;

            if (entidade == null) {
                entidade = (Entidade) session.getAttribute("entidade");
            }

            String mesPesquisa = "";
            String anoPesquisa = "";

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mu = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                pagamentos = (List<Pagamento>) session.getAttribute("pagamentosGerados");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                if (session.getAttribute("mesPesquisa") != null) {
                    mesPesquisa = session.getAttribute("mesPesquisa").toString();
                }

                if (session.getAttribute("anoPesquisa") != null) {
                    anoPesquisa = session.getAttribute("anoPesquisa").toString();
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

    <body  oncontextmenu="return false" class="navbar-top">


        <!-- Main navbar -->
        <div class="navbar navbar-inverse navbar-fixed-top">
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
                            <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase btn-labeled btn-labeled-left bg-danger-400 heading-btn">Voltar ao painel principal<b><i class="icon-chevron-left"></i></b></button>
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


                                        <!-- Contabilidade -->
                                        <%
                                            if (mu.isMuiPagamentos()) {
                                        %>
                                        <li>
                                            <a href="#"><i class="icon-cash"></i> <span class="text-bold text-uppercase">Pagamentos</span></a>
                                            <ul>
                                                <%
                                                    if (mu.isMuiPagamentosTaxas()) {
                                                %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jdGF4YXM="><i class="icon-plus-circle2"></i> Definir Outras Taxas</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiPagamentosPropinas()) {
                                                %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jcHJvcGluYXM="><i class="icon-cash4"></i> Pagamento Matriculas</a></li>
                                                    <%
                                                        }
                                                    %>

                                                <%
                                                    if (mu.isMuiPagamentosPagamentosOnline()) {
                                                %>
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jcGFnYW1lbnRvcy1vbmxpbmU="><i class="icon-earth"></i> Pagamentos Online</a></li>
                                                <li class="active"><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jcGFnYW1lbnRvcy1tYW51YWw="><i class="icon-credit-card"></i> Gerar Pagamentos</a></li>

                                                <!-- Referencias -->
                                                <li>
                                                    <a href="#"><i class="icon-barcode2"></i> <span class="text-bold text-uppercase">Referências</span></a>
                                                    <ul>

                                                        <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jMmEtdmlh" ><i class="icon-copy4"></i>2ª Via</a></li>
                                                        <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jc2l0dWFjYW8tcmVmZXJlbmNpYXM=" ><i class="icon-file-spreadsheet"></i> Visualizar estado</a></li>
                                                        <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jcmVjaWJvc1BhZ2FtZW50b3M=" ><i class="icon-printer2"></i> Recibos Pagamento</a></li>
                                                    </ul>
                                                </li>
                                                <!-- /referencias -->

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
                                                <li class="nav-item"><a href="TW9kdWxvU2VydmxldCNEQ0k=?YWNjYW8jdGVzb3VyYXJpYQ==" class="nav-link"><i class="icon-coins"></i> Resumo Pagamentos</a></li>
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

                                                <li class="nav-item"><a href="QW5vTGVjdGl2b1NlcnZsZXQjRENJ?YWNjYW8jYW5vc0xlY3Rpdm9z" class="nav-link"><i class="icon-list-numbered"></i> Vagas</a></li>


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



                    <!-- Toolbar -->
                    <div class="navbar navbar-default navbar-component navbar-xs">
                        <ul class="nav navbar-nav visible-xs-block">
                            <li class="full-width text-center"><a data-toggle="collapse" data-target="#navbar-filter"><i class="icon-menu7"></i></a></li>
                        </ul>

                        <div class="navbar-collapse collapse" id="navbar-filter">
                            <ul class="nav navbar-nav element-active-slate-400">



                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-credit-card position-left"></i>Gerar pagamentos</a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->




                    <div class="row">

                        <div class="col-md-12"> 
                            <!-- Basic layout-->

                            <form method="post" accept-charset="ISO-8859-1" action="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jZ2VyYXItcGFnYW1lbnRvcw==">
                                <div class="panel panel-flat">
                                    <div class="panel-body">

                                        <div class="form-group">
                                            <div class="col-lg-12">
                                                <div class="row">

                                                    <div class="col-md-2">

                                                        <select class="select" name="mesPesquisa">
                                                            <optgroup label="Selecione o mês">

                                                                <%
                                                                    String ids[] = {"01", "02", "03", "04", "05", "06", "07", "08",
                                                                        "09", "10", "11", "12"};

                                                                    String meses[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN",
                                                                        "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};

                                                                    for (int i = 0; i < ids.length; i++) {

                                                                        String sel = "";

                                                                        if (mesPesquisa.equals(ids[i])) {
                                                                            sel = "selected";
                                                                        }
                                                                %>


                                                                <option value="<%=ids[i]%>" <%=sel%>><%=meses[i]%></option>

                                                                <%
                                                                    }
                                                                %>

                                                            </optgroup>
                                                        </select>
                                                    </div>

                                                    <div class="col-md-2">

                                                        <select class="select" name="anoPesquisa">
                                                            <optgroup label="Selecione o ano">

                                                                <%
                                                                    for (int k = 2010; k <= 2025; k++) {

                                                                        String sel = "";

                                                                        if (anoPesquisa.equals(k + "")) {
                                                                            sel = "selected";
                                                                        }
                                                                %>
                                                                <option value="<%=k%>" <%=sel%>><%=k%></option>
                                                                <%
                                                                    }
                                                                %>
                                                            </optgroup>
                                                        </select>
                                                    </div>

                                                    <div class="col-md-2">
                                                        <input type="number" class="form-control" placeholder="Percentagem ..." name="percentagem" value="100" min="0" max="100">
                                                    </div>


                                                    <div class="col-md-3">

                                                        <select class="select" name="descricao">
                                                            <optgroup label="Selecione a prestação a gerar">

                                                                <%
                                                                    String descs[] = {"Pgto. Inscrição", "Taxa de Exame", "Taxa de Certificado"};

                                                                    for (String d : descs) {


                                                                %>


                                                                <option value="<%=d%>"><%=d%></option>

                                                                <%
                                                                    }
                                                                %>

                                                            </optgroup>
                                                        </select>
                                                    </div>


                                                    <div class="col-md-3">
                                                        <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn bg-grey-800 btn-labeled text-bold text-uppercase">
                                                            <b><i class="icon-calendar52 position-right"></i></b> 
                                                            Gerar Pagamentos
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

                    </div>

                    <div class="row">



                        <div class="col-md-12"> 


                            <!-- Basic responsive configuration -->
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-uppercase">Pagamentos Gerados <span class="text-danger-600">[<%=mesPesquisa + "|" + anoPesquisa%>]</span></h6>
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
                                            <th class="text-bold text-uppercase">Aluno</th>
                                            <th class="text-bold text-uppercase">Descrição</th>
                                            <th class="text-bold text-uppercase">Estado</th>
                                            <th class="text-bold text-uppercase">Periodo</th>
                                            <th class="text-bold text-uppercase">Valor</th>
                                            <th class="text-bold text-uppercase">V. Pago</th>
                                            <th class="text-bold text-uppercase">Comissão</th>
                                            <th class="text-bold text-uppercase">Referência</th>
                                            <th class="text-bold text-uppercase">Dta. Pag</th>
                                            <th class="text-bold text-uppercase text-danger-600">---</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <%                                                    int numReg = 0;

                                            double total = 0;

                                            double totalPago = 0;

                                            double comissoes = 0;

                                            if (pagamentos != null) {

                                                numReg = pagamentos.size();
                                                for (Pagamento p : pagamentos) {

                                                    if (p.getPagRefOnline() != null) {
                                                        int id = p.getPagId();
                                                        String alu = encryptUtils.decodeString(p.getInscricao().getAluno().getAlunBadgnumber())
                                                                + " - "
                                                                + encryptUtils.decodeString(p.getInscricao().getAluno().getPessoa().getPessNome())
                                                                + " " + encryptUtils.decodeString(p.getInscricao().getAluno().getPessoa().getPessApelido());

                                                        String per = sdf2.format(p.getPagData().toGregorianCalendar().getTime());

                                                        String value = df.format(p.getPagValor());
                                                        String valueP = df.format(p.getPagValorPago());
                                                        String ref = encryptUtils.decodeString(p.getPagRefOnline());
                                                        String desc = encryptUtils.decodeString(p.getPagDescricao());

                                                        double com = p.getPagComissao();

                                                        String lbl = "bg-warning-600";

                                                        String status = "Pendente";

                                                        status = encryptUtils.decodeString(p.getPagEstado());

                                                        if (status.equals("Pago")) {
                                                            lbl = "bg-success-800";
                                                        }

                                                        if (status.equals("Pago Parcialmente")) {
                                                            lbl = "bg-success-400";
                                                        }

                                                        if (status.equals("Cancelado")) {
                                                            lbl = "bg-danger-600";
                                                        }

                                                        if (status.equals("Atrasado")) {
                                                            lbl = "bg-slate-600";
                                                        }

                                                        if (status.equals("Pago (Ref.)")) {
                                                            lbl = "bg-teal-600";

                                                        }

                                                        String bgPrint = "bg-danger-400";
                                                        String actP = "#";
                                                        String tar = "";

                                                        if (p.isPagStatus()) {
                                                            status = "Confirmado";
                                                            bgPrint = "bg-success-400";

                                                            actP = "UGFnYW1lbnRvU2VydmxldCNEQ0k=?" + encryptUtils.encodeString("accao#imprimir-pagamento&id=" + id);
                                                            tar = "target ='_blank'";
                                                        }

                                                        String dte = "---";

                                                        if (p.getPagDataPagamento() != null) {
                                                            dte = sdf.format(p.getPagDataPagamento().toGregorianCalendar().getTime());
                                                        }

                                                        totalPago += p.getPagValorPago();

                                                        total += p.getPagValor();

                                                        comissoes += p.getPagComissao();

                                        %>
                                        <tr>
                                            <td><a href="#"><%=id%></a></td>
                                            <td><a href="#"><%=alu%></a></td>
                                            <td class="text-italic"><%=desc%></td>
                                            <td><span class="label <%=lbl%>"><%=status%></span></td>
                                            <td><%=per%></td>
                                            <td><%=value%></td>
                                            <td><%=valueP%></td>
                                            <td class="text-danger-600"><%=df.format(com)%></td>
                                            <td class="text-bold"><%=ref%></td>
                                            <td><%=dte%></td>
                                            <td><a href="<%=actP%>" class="btn <%=bgPrint%>" <%=tar%>><i class="icon-printer"></i></a></td>
                                        </tr>
                                        <%
                                                    }
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
                                                    <th class="text-bold text-uppercase">Número total de registos</th>
                                                    <th class="text-bold text-uppercase">Valor total pagamentos esperados</th>
                                                    <th class="text-bold text-uppercase">Valor total pagamentos feitos</th>
                                                    <th class="text-bold text-uppercase">Valor total das comissões</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td class="text-semibold text-danger-700"><%=numReg%></td>
                                                    <td class="text-semibold text-danger-700"><%=df.format(total)%></td>
                                                    <td class="text-semibold text-danger-700"><%=df.format(totalPago)%></td>
                                                    <td class="text-semibold text-danger-700"><%=df.format(comissoes)%></td>

                                                </tr>

                                            </tbody>
                                        </table>
                                    </div>

                                </div>

                            </div>
                            <!-- /basic responsive configuration -->

                        </div>
                    </div>

                    <!-- Content area -->
                    <div class="content">



                        <!-- Footer -->
                        <div class="footer text-bold text-grey-300">
                            <%
                                String ano = session.getAttribute("ano").toString();
                            %>
                            &copy; <%=ano%>. <a href="#" class="text-bold">SEGIA</a>. Todos os direitos reservados
                        </div>
                        <!-- /footer -->


                    </div>
                    <!-- /content area -->

                </div>
                <!-- /main content -->

            </div>
            <!-- /page content -->

        </div>
        <!-- /page container -->
    </body>
</html>
