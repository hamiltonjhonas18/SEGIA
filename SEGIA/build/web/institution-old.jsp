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
        <title>SEGIA - Escolas</title>

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
            List<Entidade> entidades = null;
            Entidade entidadeAdd = null;

            String msgErro = "";
            String alerta = "";
            int numRegistos = 0;
            Entidade entidade = (Entidade) session.getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) session.getAttribute("entidade");
            }

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mu = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                entidades = (List<Entidade>) session.getAttribute("entidades");
                entidadeAdd = (Entidade) session.getAttribute("entidadeAdd");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                if (entidades != null) {
                    numRegistos = entidades.size();
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

                                                <li class="nav-item active"><a href="Q2VudHJvU2VydmxldCNEQ0k=?YWNjYW8jY2VudHJvcw==" class="nav-link"><i class="icon-office"></i> Escolas</a></li>

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


                    <!-- Toolbar -->
                    <div class="navbar navbar-default navbar-component navbar-xs">
                        <ul class="nav navbar-nav visible-xs-block">
                            <li class="full-width text-center"><a data-toggle="collapse" data-target="#navbar-filter"><i class="icon-menu7"></i></a></li>
                        </ul>

                        <div class="navbar-collapse collapse" id="navbar-filter">
                            <ul class="nav navbar-nav element-active-slate-400">
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-city position-left"></i> Gestão de Centros de Formação</span></a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->




                    <div class = "row">

                        <div class = "col-md-12 col-md-offset-0">



                            <div class="content-group tab-content-bordered navbar-component">
                                <div class="navbar navbar-inverse bg-slate-800" style="position: relative; z-index: 99;">
                                    <div class="navbar-header">
                                        <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;"> Sistema Electrónico de Gestão de Informação Académica </h6>

                                        <ul class="nav navbar-nav pull-right visible-xs-block">
                                            <li><a data-toggle="collapse" data-target="#demo1"><i class="icon-tree5"></i></a></li>
                                        </ul>
                                    </div>

                                    <%
                                        String lst = "";
                                        String act = encryptUtils.encodeString("accao#registar-centro");
                                        String vlBtn = "Gravar Registo";
                                        String lblReg = "Novo Registo";
                                        String icnReg = "icon-file-plus";
                                        String nm = session.getAttribute("descricao").toString();
                                        String nt = session.getAttribute("nuit").toString();
                                        String mail = session.getAttribute("email").toString();
                                        String web = session.getAttribute("dominio").toString();
                                        String cnt = session.getAttribute("contacto").toString();
                                        String cnt2 = session.getAttribute("celular").toString();
                                        String cnt3 = session.getAttribute("fax").toString();
                                        String end = session.getAttribute("endereco").toString();
                                        String dist = session.getAttribute("distrito").toString();
                                        String del = session.getAttribute("delegacao").toString();
                                        String prov = session.getAttribute("provincia").toString();
                                        String idn = session.getAttribute("identificacao").toString();
                                        String pcon = session.getAttribute("pessoaContacto").toString();

                                        if (entidadeAdd != null) {
                                            lst = "hide";
                                            act = encryptUtils.encodeString("accao#actualizar-centro&ei=" + entidadeAdd.getEntiId());
                                            vlBtn = "Actualizar Registo";
                                            lblReg = "Actualizar Registo";
                                            icnReg = "icon-pencil4";

                                            nm = encryptUtils.decodeString(entidadeAdd.getEntiNome());
                                            nt = encryptUtils.decodeString(entidadeAdd.getEntiNuit());
                                            mail = encryptUtils.decodeString(entidadeAdd.getEntiEmail());
                                            web = encryptUtils.decodeString(entidadeAdd.getEntiDominio());
                                            cnt = encryptUtils.decodeString(entidadeAdd.getEntiContactos1());
                                            cnt2 = encryptUtils.decodeString(entidadeAdd.getEntiContactos2());
                                            cnt3 = encryptUtils.decodeString(entidadeAdd.getEntiContactos3());
                                            end = encryptUtils.decodeString(entidadeAdd.getEntiEndereco());
                                            dist = encryptUtils.decodeString(entidadeAdd.getEntiDistrito());
                                            del = encryptUtils.decodeString(entidadeAdd.getEntiDelegacao());
                                            prov = encryptUtils.decodeString(entidadeAdd.getEntiProvincia());
                                            idn = encryptUtils.decodeString(entidadeAdd.getEntiLicenca());
                                            pcon = encryptUtils.decodeString(entidadeAdd.getEntiPessoaContacto());

                                        }
                                    %>

                                    <div class="navbar-collapse collapse" id="demo1">
                                        <ul class="nav navbar-nav">
                                            <li class="active">
                                                <a href="#tab-demo1" data-toggle="tab" class="text-bold text-uppercase" class="text-bold text-uppercase">
                                                    <i class="<%=icnReg%> position-left"></i>
                                                    <%=lblReg%>
                                                </a>
                                            </li>

                                            <li class="<%=lst%>">
                                                <a href="#tab-demo2" data-toggle="tab" class="text-bold text-uppercase" class="text-bold text-uppercase"><i class="icon-files-empty position-left"></i>
                                                    Lista de Registos
                                                    <span class="badge bg-danger-800 badge-inline position-right"><%=numRegistos%></span>
                                                </a>
                                            </li>
                                        </ul>

                                    </div>
                                </div>


                                <div class="tab-content">
                                    <div class="tab-pane fade active in has-padding" id="tab-demo1">



                                        <!-- 2 columns form -->
                                        <form class="form-horizontal"   method="post" accept-charset="ISO-8859-1" action="Q2VudHJvU2VydmxldCNEQ0k=?<%=act%>">
                                            <div class="panel panel-flat">
                                                <div class="panel-heading">
                                                    <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Informe os dados do centro de formação</h6>
                                                    <div class="heading-elements">
                                                        <ul class="icons-list">
                                                            <li><a data-action="collapse"></a></li>
                                                            <li><a data-action="reload"></a></li>
                                                            
                                                        </ul>
                                                    </div>
                                                </div>

                                                <div class="panel-body">
                                                    <div class="row">

                                                        <div class="col-md-6">
                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-office position-left"></i> Dados do Centro de formação</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label">Descrição:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-11">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Descrição do centro de formação ..." class="form-control" name="descricao" value="<%=nm%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label">Identificação:</label>
                                                                    <div class="col-lg-9">

                                                                        <div class="row">
                                                                            <div class="col-md-7">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Nº da licença" class="form-control"  name="identificacao" value="<%=idn%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>

                                                                            <div class="col-md-5">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="NUIT" class="form-control" name="nuit" value="<%=nt%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>


                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label">Pessoa de contacto:</label>
                                                                    <div class="col-lg-9">

                                                                        <div class="row">
                                                                            <div class="col-md-9">

                                                                                <div class="form-group has-feedback has-feedback-right">
                                                                                    <input type="text" placeholder="Nome da pessoa de contacto ..." class="form-control" name="pessoaContacto" value="<%=pcon%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>

                                                            </fieldset>

                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-home5 position-left"></i> ENDEREÇO</legend>


                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label">Localização:</label>


                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <select id="make" data-placeholder="Selecione a provincia" class="select" name="provincia" required="">
                                                                                    <option></option>
                                                                                    <%
                                                                                        String provincias[] = {"Cidade de Maputo", "Maputo", "Gaza", "Inhambane", "Manica",
                                                                                            "Nampula", "Sofala", "Tete", "Zambézia", "Cabo Delgado"};

                                                                                        for (String s : provincias) {
                                                                                            String sel = "";

                                                                                            if (prov.equals(s)) {
                                                                                                sel = "selected";
                                                                                            }
                                                                                    %>
                                                                                    <option value ="<%=s%>" <%=sel%>><%=s%></option>
                                                                                    <%
                                                                                        }
                                                                                    %>
                                                                                </select>

                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <select id="models"  data-placeholder="Selecione o distrito" class="select" name="distrito" required="">
                                                                                    <option></option>

                                                                                    <%
                                                                                        String distritos[] = {"KaMpfumo", "Nlhamankulu", "KaMaxaquene", "KaMavota", "KaMubukwana", "KaTembe", "KaNyaka"};

                                                                                        for (String s : distritos) {
                                                                                            String sel = "";

                                                                                            if (dist.equals(s)) {
                                                                                                sel = "selected";
                                                                                            }
                                                                                    %>
                                                                                    <option value ="<%=s%>" <%=sel%>><%=s%></option>
                                                                                    <%
                                                                                        }
                                                                                    %>
                                                                                </select>       
                                                                            </div>
                                                                        </div>
                                                                        <br>
                                                                        <div class="row">
                                                                            <div class="col-md-12">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Endereço" class="form-control" name="endereco" value="<%=end%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <br>
                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">
                                                                                    <input type="text" placeholder="Delegação" class="form-control" name="delegacao" value="<%=del%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </fieldset>

                                                        </div>

                                                        <div class="col-md-6">

                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-address-book position-left"></i> Contacto Telefónico</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label">Contacto:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">

                                                                                <div class="form-group has-feedback has-feedback-right">
                                                                                    <input type="text" placeholder="Telefone" class="form-control mb-15" name="contacto" value="<%=cnt%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>

                                                                                <input type="text" placeholder="Celular" class="form-control" name="celular" value="<%=cnt2%>">
                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <input type="text" placeholder="Fax" class="form-control mb-15" name="fax" value="<%=cnt3%>">
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                            </fieldset>

                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-envelop5 position-left"></i> Contacto Electrónico</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label">Mail:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <input type="email" placeholder="Endereço de E-mail" class="form-control mb-15" name="email" value="<%=mail%>">
                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <input type="text" placeholder="Página Web" class="form-control mb-15" name="dominio" value="<%=web%>">
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                            </fieldset>

                                                        </div>

                                                    </div>


                                                    <div class="text-left">
                                                        <i class="icon-regexp2 text-danger"></i> -  <span class="text-semibold text-muted">Campos de preenchimento obrigatório</span>
                                                    </div>

                                                    <div class="text-right">
                                                        <%
                                                            if (entidadeAdd != null) {
                                                                String actC = encryptUtils.encodeString("accao#cancelar-edicao");
                                                        %>
                                                        <a href="Q2VudHJvU2VydmxldCNEQ0k=?<%=actC%>" class="btn text-bold text-uppercase bg-danger-400 btn-labeled-left ml-10"><i class="icon-cross2"></i> Cancelar edição</a>
                                                        <%
                                                            }
                                                        %>
                                                        <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800"><%=vlBtn%> <i class="icon-arrow-right14 position-right"></i></button>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                        <!-- /2 columns form -->


                                    </div>

                                    <div class="tab-pane fade has-padding" id="tab-demo2">







                                        <!-- Basic responsive configuration -->
                                        <div class="panel panel-flat">
                                            <div class="panel-heading">
                                                <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Lista dos centros de formação</h6>
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
                                                        <th class="text-bold text-uppercase">Descrição</th>
                                                        <th class="text-bold text-uppercase">Pessoa de contacto</th>
                                                        <th class="text-bold text-uppercase">Contacto</th>
                                                        <th class="text-bold text-uppercase">Endereço</th>
                                                        <th class="text-center text-bold text-uppercase text-danger-600">---</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <%
                                                        if (entidades != null) {
                                                            for (Entidade e : entidades) {

                                                                int id = e.getEntiId();

                                                                String s1 = encryptUtils.decodeString(e.getEntiNome());
                                                                String s2 = encryptUtils.decodeString(e.getEntiPessoaContacto());
                                                                String s3 = encryptUtils.decodeString(e.getEntiContactos1());
                                                                String s4 = encryptUtils.decodeString(e.getEntiEndereco());

                                                                String actE = encryptUtils.encodeString("accao#editar-centro&ei=" + id);
                                                                String actR = encryptUtils.encodeString("accao#remover-centro&ei=" + id);

                                                    %>
                                                    <tr>
                                                        <td class="text-bold"><%=s1%></td>
                                                        <td><%=s2%></td>
                                                        <td><a href="#"><%=s3%></a></td>
                                                        <td><%=s4%></td>
                                                        <td class="text-center">


                                                            <div class="btn text-bold text-uppercase-group">
                                                                <button type="button" class="btn text-bold text-uppercase bg-slate dropdown-toggle" data-toggle="dropdown"><span class="caret"></span></button>
                                                                <ul class="dropdown-menu dropdown-menu-right">

                                                                    <%
                                                                        if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")
                                                                                || usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador") || usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {
                                                                    %>

                                                                    <li><a href="Q2VudHJvU2VydmxldCNEQ0k=?<%=actE%>"><i class="icon-database-edit2 text-blue-800"></i> Editar registo</a></li>

                                                                    <li><a  href="#" data-toggle="modal" data-target="#modal_rem_<%=id%>"><i class="icon-cancel-circle2 text-danger-800"></i> Remover registo</a></li>
                                                                        <%
                                                                            }
                                                                        %>
                                                                </ul>
                                                                <!-- Danger modal -->
                                                                <div id="modal_rem_<%=id%>" class="modal fade">
                                                                    <div class="modal-dialog">
                                                                        <div class="modal-content">
                                                                            <div class="modal-header">
                                                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                                <h6 class="modal-title text-semibold">Confirma a remoção do centro com a referência #<%=id%> ?</h6>
                                                                            </div>
                                                                            <div class="modal-body">
                                                                                <h6 class="text-bold text-danger" ><i class="icon-question6 text-danger" style="font-size: 100px"></i></h6>

                                                                            </div>

                                                                            <div class="modal-footer">
                                                                                <button type="button" class="btn text-bold text-uppercase btn-link" data-dismiss="modal">Cancelar</button>

                                                                                <a href="Q2VudHJvU2VydmxldCNEQ0k=?<%=actR%>" class="btn text-bold text-uppercase btn-danger">Sim, confirmo !</a>

                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <!-- /default modal -->    
                                                            </div>
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
                            </div>

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

                var dist = '<%=dist%>';
                //setup arrays
                var cars = {
                    "Cidade de Maputo": ['KaMpfumo', 'Nlhamankulu', 'KaMaxaquene', 'KaMavota', 'KaMubukwana', 'KaTembe', 'KaNyaka'],
                    "Maputo": ['Boane', 'Cidade da Matola', 'Magude', 'Marracuene', 'Matutuíne', 'Moamba', 'Namaacha'],
                    "Gaza": ['Bilene - Macia', 'Chibuto', 'Chicualacuala', 'Chigubo', 'Chòkwé', 'Cidade de Xai-Xai', 'Guijá', 'Mabalane', 'Manjacaze - Dingane', 'Xai-Xai Distrito'],
                    "Inhambane": ['Cidade de Maxixe', 'Cidade de Inhambane', 'Funhalouro', 'Govuro', 'Homoíne', 'Inharrime', 'Inhassoro', 'Jangamo', 'Mabote', 'Massinga', 'Morrumbene', 'Panda', 'Vilankulo', 'Zavala'],
                    "Manica": ['Barué', 'Cidade de Chimoio', 'Gondola', 'Guro', 'Muchaze', 'Macossa', 'Manica', 'Mossurize', 'Sussundega', 'Tambara'],
                    "Nampula": ['Angoche', 'Cidade de Nampula', 'Ilha de Moçambique', 'Lalaua', 'Malema', 'Meconta', 'Mecubúri', 'Memba', 'Mongicual', 'Mogovolas', 'Moma', 'Mossuril', 'Muecate', 'Murrupula', 'Nacala - Porto', 'Nacala - Velha', 'Nacarôa', 'Namapa - Eráti', 'Nampula - Distrito', 'Ribaué'],
                    "Niassa": ['Cidade de Lichinga', 'Nacarôa', 'Magude', 'Marracuene', 'Matutuíne', 'Moamba', 'Namaacha'],
                    "Sofala": ['Búzi', 'Caia', 'Magude', 'Chemba', 'Cheringoma', 'Chibabava', 'Cidade da Beira', 'Dondo', 'Gorongosa', 'Machanga', 'Marromeu', 'Maríngue', 'Muanza', 'Nhamatanda'],
                    "Tete": ['Angónia', 'Cahora Bassa', 'Changara', 'Chifunde', 'Chiúta', 'Cidade de Tete', 'Macanga', 'Marávia', 'Moatize', 'Mutarara', 'Mágoé', 'Tsangano', 'Zumbo'],
                    "Zambézia": ['Alto Molócué', 'Chinde', 'Cidade de Quelimane', 'Gilé', 'Gurué', 'Ile', 'Inhassunge', 'Lugela', 'Maganja da Costa', 'Milange', 'Mocuba', 'Mopeia', 'Morrumbala', 'Namacurra', 'Namarrói', 'Nicoadala', 'Pebane'],
                    "Cabo Delgado": ['Ancuabe', 'Balama', 'Chiúre', 'Cidade de Pemba', 'Ibo', 'Macomia', 'Mecúfi', 'Mocímboa da Praia', 'Montepuez', 'Mueda', 'Muidumbe', 'Namuno', 'Nangade', 'Pemba - Metuge', 'Quissanga']
                };

                $('#make').change(function () {
                    $("#models").html(""); //clear existing options
                    var newOptions = cars[this.value]; //finds the array w/the name of the selected value
                    //populate the new options
                    for (var i = 0; i < newOptions.length; i++) {

                        if (newOptions[i] === dist)
                        {
                            $("#models").append("<option value='" + newOptions[i] + "' selected>" + newOptions[i] + "</option>");
                        } else
                        {
                            $("#models").append("<option value='" + newOptions[i] + "'>" + newOptions[i] + "</option>");
                        }
                    }
                    $('#models').prop('disabled', false); //enable the dropdown
                });
            });
        </script>

        <script type="text/javascript" src="assets/js/pages/picker_date.js"></script>
    </body>
</html>