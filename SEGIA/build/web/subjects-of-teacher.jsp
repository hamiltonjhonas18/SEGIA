<%-- 
    Document   : subjects-of-teacher
    Created on : Feb 11, 2017, 7:30:25 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.DisciplinaDocente"%>
<%@page import="com.dciapps.webclient.Docente"%>
<%@page import="com.dciapps.webclient.ModulosUsuario"%>
<%@page import="com.dciapps.webclient.Disciplina"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.webclient.Usuario"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.dciapps.controller.GenericHandler"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA - Disciplinas Docente</title>

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
        <script type="text/javascript" src="assets/js/core/libraries/jquery_ui/interactions.min.js"></script>
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

            int diasRestantes = 0;

            ModulosUsuario mu = null;
            String msgTrial = diasRestantes + " dias restantes";
            String lblTrial = "bg-success-400";
            List<Disciplina> disciplinas = null;
            List<Docente> docentes = null;
            List<DisciplinaDocente> disciplinasDocente = null;
            int numRegistos = 0;
            String msgErro = "";
            String alerta = "";

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mu = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                disciplinas = (List<Disciplina>) session.getAttribute("disciplinas");
                docentes = (List<Docente>) session.getAttribute("docentes");
                disciplinasDocente = (List<DisciplinaDocente>) session.getAttribute("disciplinasDocente");

                diasRestantes = Integer.parseInt(session.getAttribute("diasTrial").toString());

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                msgTrial = diasRestantes + " dias restantes";
                if (diasRestantes <= 5) {
                    lblTrial = "bg-danger-400";
                }

                if (diasRestantes == 1) {
                    msgTrial = "Um dia restante";
                }

                if (disciplinasDocente != null) {
                    numRegistos = disciplinasDocente.size();
                }

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


        <script type="text/javascript" src="assets/js/pages/datatables_responsive.js"></script>
        <script type="text/javascript" src="assets/js/pages/form_layouts.js"></script>

    </head>

    <body oncontextmenu="return false"  >


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
                            <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jdmVyLXBlcmZpbA=="><i class="icon-user-plus"></i> Definição da Conta</a></li>


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
                            <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase text-bold btn-labeled btn-labeled-left bg-danger-400 heading-btn">Voltar ao painel principal<b><i class="icon-chevron-left"></i></b></button>
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
                                                <li><a href="UGFnYW1lbnRvU2VydmxldCNEQ0k=?YWNjYW8jcGFnYW1lbnRvcy1tYW51YWw="><i class="icon-credit-card"></i> Gerar Pagamentos</a></li>

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
                                                <li class="nav-item active"><a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?YWNjYW8jZGlzY2lwbGluYXNEb2NlbnRl" class="nav-link"><i class="icon-user"></i> Disciplinas Professor</a></li>
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
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-user position-left"></i> Gestão de Disciplinas para os docentes </a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->




                    <div class = "row">

                        <div class = "col-md-9 col-md-offset-1">
                            <!-- Vertical form options -->



                            <div class="content-group tab-content-bordered navbar-component">
                                <div class="navbar navbar-inverse bg-slate-800" style="position: relative; z-index: 99;">
                                    <div class="navbar-header">
                                        <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;">Sistema Electrónico de Gestão de Informação Académica </h6>

                                        <ul class="nav navbar-nav pull-right visible-xs-block">
                                            <li><a data-toggle="collapse" data-target="#demo1"><i class="icon-tree5"></i></a></li>
                                        </ul>
                                    </div>

                                    <%
                                        String lst = "";
                                        String act = encryptUtils.encodeString("accao#adicionar-disciplinas-docente");
                                        String vlBtn = "Associar disciplinas";
                                        String lblReg = "Novo Registo";
                                        String icnReg = "icon-file-plus";

                                    %>

                                    <div class="navbar-collapse collapse" id="demo1">
                                        <ul class="nav navbar-nav">
                                            <li class="active">
                                                <a href="#tab-demo1" data-toggle="tab" class="text-bold text-uppercase">
                                                    <i class="<%=icnReg%> position-left"></i>
                                                    <%=lblReg%>
                                                </a>
                                            </li>

                                            <li class="<%=lst%>">
                                                <a href="#tab-demo2" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-files-empty position-left"></i>
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
                                        <form class="form-horizontal" id="form_reg"  method="post" accept-charset="ISO-8859-1" action="RGlzY2lwbGluYVNlcnZsZXQjRENJ?<%=act%>">
                                            <div class="panel panel-flat">
                                                <div class="panel-heading">
                                                    <div class="heading-elements">
                                                        <ul class="icons-list">
                                                            <li><a data-action="collapse"></a></li>
                                                            <li><a data-action="reload"></a></li>

                                                        </ul>
                                                    </div>
                                                </div>

                                                <div class="panel-body">
                                                    <div class="row">

                                                        <div class="col-md-9">
                                                            <fieldset>
                                                                <legend class="text-bold text-uppercase"><i class="icon-link position-left"></i> Selecione as disciplinas à associar</legend>




                                                                <div class="form-group">
                                                                    <label class="col-lg-4 control-label text-bold text-uppercase">Professor:</label>
                                                                    <div class="col-lg-8">
                                                                        <div class="row">
                                                                            <div class="col-md-12">


                                                                                <select data-placeholder="Selecione o docente" class="select" name="idDocente" required="">
                                                                                    <optgroup label="Selecione o docente">
                                                                                        <%
                                                                                            if (docentes != null) {

                                                                                                for (Docente d : docentes) {

                                                                                                    int id = d.getDoceId();
                                                                                                    String desc = encryptUtils.decodeString(d.getPessoa().getPessNome()) + " " + encryptUtils.decodeString(d.getPessoa().getPessApelido());
                                                                                        %>
                                                                                        <option value="<%=id%>"><%=desc%></option>
                                                                                        <%
                                                                                                }
                                                                                            }
                                                                                        %>
                                                                                    </optgroup>
                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="form-group">
                                                                    <label class="col-lg-4 control-label text-bold text-uppercase">Disciplinas:</label>
                                                                    <div class="col-lg-8">
                                                                        <div class="row">
                                                                            <div class="col-md-12">

                                                                                <select data-placeholder="Selecione a(s) disciplina(s)" multiple="multiple" class="select-access-multiple" name="descDisciplinas" required="">
                                                                                    <option></option>
                                                                                    <optgroup label="Selecione a(s) disciplina(s)">

                                                                                        <%
                                                                                            if (disciplinas != null) {
                                                                                                for (Disciplina d : disciplinas) {
                                                                                                    String desc = encryptUtils.decodeString(d.getDiscDescricao());


                                                                                        %>
                                                                                        <option value="<%=desc%>"><%=desc%></option>
                                                                                        <%
                                                                                                }
                                                                                            }
                                                                                        %>
                                                                                    </optgroup>
                                                                                </select>
                                                                            </div>


                                                                        </div>
                                                                    </div>
                                                                </div>

                                                            </fieldset>


                                                            <div>

                                                                <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase text-uppercase text-bold bg-slate-800"><%=vlBtn%> <i class=" icon-shrink7 position-right"></i></button>
                                                            </div>
                                                        </div>
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
                                                <h6 class="panel-title text-bold text-uppercase">Listagem das disciplinas dos docentes</h6>
                                                <div class="heading-elements">
                                                    <ul class="icons-list">
                                                        <li><a data-action="collapse"></a></li>
                                                        <li><a data-action="reload"></a></li>

                                                    </ul>
                                                </div>
                                            </div>



                                            <div class="panel-body">
                                                <p>
                                                    <a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?YWNjYW8jaW1wcmltaXItZGlzY2lwbGluYXMtZG9jZW50ZQ==" target="_blank" class="btn bg-slate-400 btn-labeled btn-lg text-bold text-uppercase">
                                                        <b><i class="icon-printer2"></i></b>
                                                        Imprimir registos
                                                    </a>


                                                </p>

                                            </div>

                                            <table class="table datatable-responsive">
                                                <thead>
                                                    <tr>
                                                        <th class = "text-bold text-uppercase">#</th>
                                                        <th class = "text-bold text-uppercase">Descrição</th>
                                                        <th class = "text-bold text-uppercase">Docente</th>
                                                        <th class="text-bold text-uppercase text-danger-400">Opções</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <%
                                                        if (disciplinasDocente != null) {

                                                            for (DisciplinaDocente dd : disciplinasDocente) {

                                                                int id = dd.getDisdId();

                                                                String s1 = encryptUtils.decodeString(dd.getDisciplina().getDiscDescricao());
                                                                String s2 = encryptUtils.decodeString(dd.getDocente().getPessoa().getPessNome()) + " " + encryptUtils.decodeString(dd.getDocente().getPessoa().getPessApelido());

                                                                String actR = encryptUtils.encodeString("accao#remover-disciplina-docente&ci=" + id);
                                                    %>
                                                    <tr>
                                                        <td><a><%=id%></a></td>
                                                        <td class='text-bold text-danger-400'><%=s1%></td>
                                                        <td class='text-bold'><%=s2%></td>
                                                        <td class="text-center">


                                                            <div class="btn-group">
                                                                <button type="button" class="btn text-uppercase text-bold bg-slate-400 btn-icon dropdown-toggle" data-toggle="dropdown">
                                                                    <i class="icon-menu7"></i> &nbsp;<span class="caret"></span>
                                                                </button>
                                                                <ul class="dropdown-menu dropdown-menu-right" style="width: 12em;
                                                                    height: 3em;
                                                                    line-height: 2em;
                                                                    border: 1px solid #ccc;
                                                                    padding: 0;
                                                                    margin: 0;
                                                                    overflow: scroll;
                                                                    overflow-x: hidden;">


                                                                    <li><a href="#" data-toggle="modal" data-target="#modal_rem_<%=id%>"><i class="icon-cancel-circle2 text-danger-800"></i>Remover registo</a></li>

                                                                </ul>
                                                            </div>



                                                            <!-- Danger modal -->
                                                            <div id="modal_rem_<%=id%>" class="modal fade text-center">
                                                                <div class="modal-dialog">
                                                                    <div class="modal-content">
                                                                        <div class="modal-header">
                                                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                            <h6 class="modal-title text-semibold">Confirma a remoção da disciplina para o docente com a referência #<%=id%> ?</h6>
                                                                        </div>
                                                                        <div class="modal-body">
                                                                            <h6 class="text-bold text-danger" ><i class="icon-question6 text-danger" style="font-size: 100px"></i></h6>

                                                                        </div>

                                                                        <div class="modal-footer">
                                                                            <button type="button" class="btn text-uppercase text-bold btn-link" data-dismiss="modal">Cancelar</button>

                                                                            <a href="RGlzY2lwbGluYVNlcnZsZXQjRENJ?<%=actR%>" class="btn btn-danger text-bold text-uppercase">Sim, confirmo !</a>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <!-- /default modal -->     

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
                    <!-- /vertical form options -->
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
        
        <script>
            /* ------------------------------------------------------------------------------
             *
             *  # Select2 selects
             *
             *  Specific JS code additions for form_select2.html page
             *
             *  Version: 1.0
             *  Latest update: Aug 1, 2015
             *
             * ---------------------------------------------------------------------------- */

            $(function () {


                // Basic examples
                // ------------------------------


                // Select with search
                $('.select-search').select2();


                // Fixed width
                $('.select-fixed').select2({
                    minimumResultsForSearch: "-1",
                    width: 250
                });


                // Minimum input length
                $(".select-minimum").select2({
                    minimumInputLength: 2,
                    minimumResultsForSearch: "-1"
                });


                // Allow clear selection
                $('.select-clear').select2({
                    placeholder: "Select a State",
                    allowClear: true
                });



                // Styling options
                // ------------------------------

                // Custom menu color
                $('.select-menu-color').select2({
                    dropdownCssClass: 'bg-teal'
                });


                // Combine custom colors
                $('.select-menu2-color').select2({
                    dropdownCssClass: 'bg-indigo-400'
                });


                // Multiselect item colors
                $('.select-items-color').select2({
                    formatSelectionCssClass: function (data, container) {
                        return "bg-danger";
                    }
                });


                // Menu border color
                $('.select-border-color').select2({
                    dropdownCssClass: 'border-warning'
                });


                // Tagging support
                $(".select-multiple-tags").select2({
                    width: '100%',
                    tags: ['red', 'green', 'blue', 'cyan', 'brown', 'pink']
                });


                // Maximum input length
                $(".select-multiple-maximum-length").select2({
                    width: '100%',
                    tags: ['red', 'green', 'blue', 'cyan', 'brown', 'pink'],
                    maximumInputLength: 4
                });


                // Tokenization
                $(".select-multiple-tokenization").select2({
                    width: '100%',
                    tags: ['red', 'green', 'blue', 'cyan', 'brown', 'pink'],
                    tokenSeparators: [",", " "]
                });



                // Advanced examples
                // ------------------------------

                // Infinite scroll
                $(".select-remote-data-infinite").select2({
                    placeholder: "Search for a movie",
                    minimumInputLength: 3,
                    ajax: {
                        url: "http://api.rottentomatoes.com/api/public/v1.0/movies.json",
                        dataType: 'jsonp',
                        quietMillis: 100,
                        data: function (term, page) { // page is the one-based page number tracked by Select2
                            return {
                                q: term, //search term
                                page_limit: 10, // page size
                                page: page, // page number
                                apikey: "ju6z9mjyajq2djue3gbvv26t" // please do not use so this example keeps working
                            };
                        },
                        results: function (data, page) {
                            var more = (page * 10) < data.total; // whether or not there are more results available

                            // notice we return the value of more so Select2 knows if more results can be loaded
                            return {results: data.movies, more: more};
                        }
                    },
                    formatResult: movieFormatResult, // omitted for brevity, see the source of this page
                    formatSelection: movieFormatSelection, // omitted for brevity, see the source of this page
                    dropdownCssClass: "bigdrop", // apply css that makes the dropdown taller
                    escapeMarkup: function (m) {
                        return m;
                    } // we do not want to escape markup since we are displaying html in results
                });


                // Sort results
                $('.select-sorting-results').select2({
                    width: '100%',
                    sortResults: function (results, container, query) {
                        if (query.term) {
                            // use the built in javascript sort function
                            return results.sort(function (a, b) {
                                if (a.text.length > b.text.length) {
                                    return 1;
                                } else if (a.text.length < b.text.length) {
                                    return -1;
                                } else {
                                    return 0;
                                }
                            });
                        }
                        return results;
                    }
                });


                // Maximum selections allowed
                $('.select-multiple-maximum').select2({
                    width: '100%',
                    maximumSelectionSize: 3
                });


                //
                // Single select with icons
                //

                // Format icon
                function iconFormat(state) {
                    var originalOption = state.element;
                    return "<i class='icon-" + $(originalOption).data('icon') + "'></i>" + state.text;
                }

                // Initialize with options
                $(".select-icons").select2({
                    formatResult: iconFormat,
                    minimumResultsForSearch: "-1",
                    width: '100%',
                    formatSelection: iconFormat,
                    escapeMarkup: function (m) {
                        return m;
                    }
                });


                //
                // Loading result data
                //

                // Initialize with options
                $(".select-loading-data").select2({
                    minimumInputLength: 1,
                    minimumResultsForSearch: "-1",
                    placeholder: "Select a State",
                    query: function (query) {
                        var data = {results: []}, i, j, s;
                        for (i = 1; i < 5; i++) {
                            s = "";
                            for (j = 0; j < i; j++) {
                                s = s + query.term;
                            }
                            data.results.push({id: query.term + i, text: s});
                        }
                        query.callback(data);
                    }
                });

                // Text key
                $(".select-text-key").select2({
                    placeholder: "Click fto load data",
                    minimumResultsForSearch: "-1",
                    data: [{id: 0, text: 'enhancement'}, {id: 1, text: 'bug'}, {id: 2, text: 'duplicate'}, {id: 3, text: 'invalid'}, {id: 4, text: 'wontfix'}]
                });

                // Data
                var data = [
                    {id: 0, tag: 'enhancement'},
                    {id: 1, tag: 'bug'},
                    {id: 2, tag: 'duplicate'},
                    {id: 3, tag: 'invalid'},
                    {id: 4, tag: 'wontfix'}
                ];

                // Format
                function format(item) {
                    return item.tag;
                }

                // String alternative key
                $(".select-string").select2({
                    placeholder: "Click fto load data",
                    minimumResultsForSearch: "-1",
                    data: {results: data, text: 'tag'},
                    formatSelection: format,
                    formatResult: format
                });

                // As a function
                $(".select-function").select2({
                    placeholder: "Click fto load data",
                    minimumResultsForSearch: "-1",
                    data: {results: data, text: function (item) {
                            return item.tag;
                        }},
                    formatSelection: format,
                    formatResult: format
                });

                // Return a results object
                $(".select-data-function").select2({
                    placeholder: "Click fto load data",
                    minimumResultsForSearch: "-1",
                    data: function () {
                        return {text: 'tag', results: data};
                    },
                    formatSelection: format,
                    formatResult: format
                });


                //
                // Loading remote data
                //

                // Format result
                function movieFormatResult(movie) {
                    var markup = "<table class='movie-result'><tr>";
                    if (movie.posters !== undefined && movie.posters.thumbnail !== undefined) {
                        markup += "<td class='movie-image'><img src='" + movie.posters.thumbnail + "'/></td>";
                    }
                    markup += "<td class='movie-info'><div class='movie-title'>" + movie.title + "</div>";
                    if (movie.critics_consensus !== undefined) {
                        markup += "<div class='movie-synopsis'>" + movie.critics_consensus + "</div>";
                    } else if (movie.synopsis !== undefined) {
                        markup += "<div class='movie-synopsis'>" + movie.synopsis + "</div>";
                    }
                    markup += "</td></tr></table>";
                    return markup;
                }

                // Format selection
                function movieFormatSelection(movie) {
                    return movie.title;
                }

                // Initialize plugin with options
                $(".select-remote-data").select2({
                    placeholder: "Search for a movie",
                    minimumInputLength: 1,
                    ajax: {// Instead of writing the function to execute the request we use Select2's convenient helper
                        url: "http://api.rottentomatoes.com/api/public/v1.0/movies.json",
                        dataType: 'jsonp',
                        data: function (term, page) {
                            return {
                                q: term, // search term
                                page_limit: 10,
                                apikey: "ju6z9mjyajq2djue3gbvv26t" // please do not use so this example keeps working
                            };
                        },
                        results: function (data, page) { // parse the results into the format expected by Select2.

                            // Since we are using custom formatting functions we do not need to alter remote JSON data
                            return {results: data.movies};
                        }
                    },
                    initSelection: function (element, callback) {

                        // The input tag has a value attribute preloaded that points to a preselected movie's id
                        // this function resolves that id attribute to an object that select2 can render
                        // using its formatResult renderer - that way the movie name is shown preselected
                        var id = $(element).val();
                        if (id !== "") {
                            $.ajax("http://api.rottentomatoes.com/api/public/v1.0/movies/" + id + ".json", {
                                data: {
                                    apikey: "ju6z9mjyajq2djue3gbvv26t"
                                },
                                dataType: "jsonp"
                            }).done(function (data) {
                                callback(data);
                            });
                        }
                    },
                    formatResult: movieFormatResult, // omitted for brevity, see the source of this page
                    formatSelection: movieFormatSelection, // omitted for brevity, see the source of this page
                    dropdownCssClass: "bigdrop", // apply css that makes the dropdown taller
                    escapeMarkup: function (m) {
                        return m;
                    } // we do not want to escape markup since we are displaying html in results
                });


                //
                // Programmatic access (single)
                //

                // Initialize plugin
                $('.select-access').select2({
                    minimumResultsForSearch: "-1",
                    placeholder: "Select State..."
                });

                // Methods
                $(".access-get").click(function () {
                    alert("Selected value is: " + $(".select-access").select2("val"));
                });
                $(".access-set").click(function () {
                    $(".select-access").select2("val", "CA");
                });
                $(".access-get2").click(function () {
                    var data = $(".select-access").select2("data");
                    delete data.element;
                    alert("Selected data is: " + JSON.stringify(data));
                });
                $(".access-set2").click(function () {
                    $(".select-access").select2("data", {id: "CA", text: "California"});
                });
                $(".access-open").click(function () {
                    $(".select-access").select2("open");
                });
                $(".access-close").click(function () {
                    $(".select-access").select2("close");
                });


                //
                // Programmatic access (multiple)
                //

                // Initialize
                $(".select-access-multiple").select2({
                    width: '100%',
                    placeholder: "Select a state"
                });

                // Methods
                $(".access-multiple-get").click(function () {
                    alert("Selected value is: " + $(".select-access-multiple").select2("val"));
                });
                $(".access-multiple-set").click(function () {
                    $(".select-access-multiple").select2("val", ["ID", "NV"]);
                });
                $(".access-multiple-get2").click(function () {
                    alert("Selected value is: " + JSON.stringify($(".select-access-multiple").select2("data")));
                });
                $(".access-multiple-set2").click(function () {
                    $(".select-access-multiple").select2("data", [{id: "ID", text: "Idaho"}, {id: "NV", text: "Nevada"}]);
                });
                $(".access-multiple-open").click(function () {
                    $(".select-access-multiple").select2("open");
                });
                $(".access-multiple-close").click(function () {
                    $(".select-access-multiple").select2("close");
                });


                //
                // Reacting to external value changes
                //

                // Initialize
                $(".select-multiple-value-changes").select2({
                    width: '100%'
                });

                // Change values
                $(".change-to-ca").click(function () {
                    $(".select-multiple-value-changes").val("CA").trigger("change");
                });
                $(".change-to-ak-co").click(function () {
                    $(".select-multiple-value-changes").val(["AK", "CO"]).trigger("change");
                });


                //
                // Select lifecycle
                //

                // Initialize with selected options
                $(".select-multiple-lifecycle").val(["AL", "AZ"]).select2({
                    width: '100%'
                });

                // Init on click
                $(".lifecycle-init").click(function () {
                    $(".select-multiple-lifecycle").select2();
                });

                // Destroy on click
                $(".lifecycle-destroy").click(function () {
                    $(".select-multiple-lifecycle").select2("destroy");
                });


                //
                // Drag and drop selected items
                //

                // Initialize with tags
                $(".select-multiple-drag").select2({
                    width: '100%',
                    tags: ['red', 'green', 'blue', 'orange', 'white', 'black', 'purple', 'cyan', 'teal']
                });

                // Add jQuery UI Sortable support
                $(".select-multiple-drag").select2("container").find("ul.select2-choices").sortable({
                    containment: 'parent',
                    start: function () {
                        $(".select-multiple-drag").select2("onSortStart");
                    },
                    update: function () {
                        $(".select-multiple-drag").select2("onSortEnd");
                    }
                });


                //
                // Disabled mode
                //

                // Initialize
                $(".select-multiple-disabled").select2({
                    width: '100%'
                });

                // Methods
                $(".select-multiple-enable").click(function () {
                    $(".select-multiple-disabled").select2("enable", true);
                });
                $(".select-multiple-disable").click(function () {
                    $(".select-multiple-disabled").select2("enable", false);
                });
                $(".select-multiple-readonly").click(function () {
                    $(".select-multiple-disabled").select2("readonly", true);
                });
                $(".select-multiple-writable").click(function () {
                    $(".select-multiple-disabled").select2("readonly", false);
                });


                //
                // Locked selections
                //

                // Data
                var preload_data = [
                    {id: 'user0', text: 'Disabled User', locked: true},
                    {id: 'user1', text: 'Jane Doe'},
                    {id: 'user2', text: 'John Doe', locked: true},
                    {id: 'user3', text: 'Robert Paulson', locked: true},
                    {id: 'user6', text: 'Planet Bob'}
                ];

                // Initialize
                $('.select-multiple-locked').select2({
                    multiple: true,
                    width: '100%',
                    query: function (query) {
                        var data = {results: []};
                        $.each(preload_data, function () {
                            if (query.term.length == 0 || this.text.toUpperCase().indexOf(query.term.toUpperCase()) >= 0) {
                                data.results.push({id: this.id, text: this.text});
                            }
                        });
                        query.callback(data);
                    }
                });

                // Bind data
                $('.select-multiple-locked').select2('data', preload_data);

            });

        </script>
        <script type="text/javascript" src="assets/js/pages/picker_date.js"></script>
    </body>
</html>
