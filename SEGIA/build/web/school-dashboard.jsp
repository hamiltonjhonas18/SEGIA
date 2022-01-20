<%-- 
    Document   : dc-inefp-dashboard
    Created on : Feb 8, 2017, 7:04:20 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.Escola"%>
<%@page import="com.dciapps.webclient.Entidade"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.dciapps.local.Resultado"%>
<%@page import="java.util.List"%>
<%@page import="com.dciapps.webclient.ModulosUsuario"%>
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
        <title>SEGIA - Dashboard (Registo Acadêmico)</title>

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
        <script type="text/javascript" src="assets/js/plugins/forms/styling/switchery.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/selects/bootstrap_multiselect.js"></script>
        <script type="text/javascript" src="assets/js/plugins/ui/moment/moment.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/pickers/daterangepicker.js"></script>



        <script src="global_assets/js/plugins/visualization/d3/d3.min.js"></script>
        <script src="global_assets/js/plugins/visualization/d3/d3_tooltip.js"></script>
        <script src="global_assets/js/plugins/visualization/echarts/echarts.min.js"></script>

        <script type="text/javascript" src="assets/js/core/app.js"></script>
        <script type="text/javascript" src="assets/js/pages/components_popups.js"></script>
        <script type="text/javascript" src="assets/js/pages/form_layouts.js"></script>




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

            int numSalas = 0;
            int numAlunos = 0;
            int numAlunosNecessitados = 0;
            int numDocentes = 0;
            int numTurmas = 0;

            int numHomens = 0;
            int numMulheres = 0;

            int numAprovacoes = 0;
            int numReprovacoes = 0;
            int numFaltas = 0;

            int numFaixa05 = 0;
            int numFaixa610 = 0;
            int numFaixa1115 = 0;
            int numFaixa1625 = 0;
            int numFaixa2635 = 0;
            int numFaixa35 = 0;

            String lblFaltas_J = "";
            String lblFaltas_S = "";
            String lblFaltas_R = "";

            int numMembros = 0;
            int numMembrosH = 0;
            int numMembrosF = 0;
            int numReunioes = 0;

            ModulosUsuario mu = null;
            Entidade entidade = (Entidade) session.getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) session.getAttribute("entidade");
            }

            String prov = "";
            List<Escola> escolas = null;
            Escola escola = null;

            String ano = session.getAttribute("ano").toString();

            String lblAnos = "";

            String lblNovos = "";
            String lblContinuantes = "";
            String lblRepetente = "";
            String lblAssistentes = "";
            String lblTransferidos = "";
            String lblClasses = "";

            String lblAdmitidos = "";
            String lblAdmitidosPlaceHolder = "";
            String lblReprovados = "";
            String lblReprovadosPlaceHolder = "";
            String lblExcluidos = "";
            String lblExcluidosPlaceHolder = "";
            String lblDispensados = "";
            String lblDispensadosPlaceHolder = "";

            String ano1 = "";
            String ano2 = "";
            String ano3 = "";
            String ano4 = "";
            String ano5 = "";

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                numSalas = Integer.parseInt(session.getAttribute("numSalas").toString());
                numTurmas = Integer.parseInt(session.getAttribute("numTurmas").toString());
                numAlunos = Integer.parseInt(session.getAttribute("numAlunos").toString());
                numAlunosNecessitados = Integer.parseInt(session.getAttribute("numAlunosNecessitados").toString());
                numDocentes = Integer.parseInt(session.getAttribute("numDocentes").toString());

                numHomens = Integer.parseInt(session.getAttribute("numHomens").toString());
                numMulheres = Integer.parseInt(session.getAttribute("numMulheres").toString());

                numAprovacoes = Integer.parseInt(session.getAttribute("numAprovacoes").toString());
                numReprovacoes = Integer.parseInt(session.getAttribute("numReprovacoes").toString());
                numFaltas = Integer.parseInt(session.getAttribute("numFaltas").toString());

                numFaixa05 = Integer.parseInt(session.getAttribute("numFaixa05").toString());
                numFaixa610 = Integer.parseInt(session.getAttribute("numFaixa610").toString());
                numFaixa1115 = Integer.parseInt(session.getAttribute("numFaixa1115").toString());
                numFaixa1625 = Integer.parseInt(session.getAttribute("numFaixa1625").toString());
                numFaixa2635 = Integer.parseInt(session.getAttribute("numFaixa2635").toString());
                numFaixa35 = Integer.parseInt(session.getAttribute("numFaixa35").toString());

                numMembrosH = Integer.parseInt(session.getAttribute("numMembrosH").toString());
                numMembrosF = Integer.parseInt(session.getAttribute("numMembrosF").toString());
                numReunioes = Integer.parseInt(session.getAttribute("numReunioes").toString());

                numMembros = numMembrosH + numMembrosF;

                lblFaltas_J = session.getAttribute("lblFaltas_J").toString();
                lblFaltas_R = session.getAttribute("lblFaltas_R").toString();

                lblNovos = session.getAttribute("lblNovos").toString();
                lblContinuantes = session.getAttribute("lblContinuantes").toString();
                lblRepetente = session.getAttribute("lblRepetente").toString();
                lblAssistentes = session.getAttribute("lblAssistentes").toString();
                lblTransferidos = session.getAttribute("lblTransferidos").toString();
                lblClasses = session.getAttribute("lblClasses").toString();
                lblAnos = session.getAttribute("lblAnos").toString();

                lblAdmitidos = session.getAttribute("lblAdmitidos").toString();
                lblAdmitidosPlaceHolder = session.getAttribute("lblAdmitidosPlaceHolder").toString();
                lblReprovados = session.getAttribute("lblReprovados").toString();
                lblReprovadosPlaceHolder = session.getAttribute("lblReprovadosPlaceHolder").toString();
                lblExcluidos = session.getAttribute("lblExcluidos").toString();
                lblExcluidosPlaceHolder = session.getAttribute("lblExcluidosPlaceHolder").toString();
                lblDispensados = session.getAttribute("lblDispensados").toString();
                lblDispensadosPlaceHolder = session.getAttribute("lblDispensadosPlaceHolder").toString();

                ano1 = session.getAttribute("ano1").toString();
                ano2 = session.getAttribute("ano2").toString();
                ano3 = session.getAttribute("ano3").toString();
                ano4 = session.getAttribute("ano4").toString();
                ano5 = session.getAttribute("ano5").toString();

                if (lblFaltas_J.isEmpty()) {
                    lblFaltas_J = "0,0,0,0,0,0,0,0,0,0,0,0";
                }
                if (lblFaltas_S.isEmpty()) {
                    lblFaltas_S = "0,0,0,0,0,0,0,0,0,0,0,0";
                }
                if (lblFaltas_R.isEmpty()) {
                    lblFaltas_R = "0,0,0,0,0,0,0,0,0,0,0,0";
                }

                mu = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");
                escola = (Escola) session.getAttribute("escola");
                escolas = (List<Escola>) session.getAttribute("escolas");

                response.setHeader("Refresh", timeout + "; URL =VXN1YXJpb1NlcnZsZXQjRENJ?" + encryptUtils.encodeString("accao#lockscreen&user=" + encryptUtils.decodeString(usuario.getUsuaUsuario()) + "&ei=" + entidade.getEntiId()));

            }
        %>

    </head>
    <body   class="navbar-top">


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
                                        <li class="navigation-header"><span>Menu Principal</span> <i class="icon-menu" title="Menu Principal"></i></li>
                                        <li><a href="TW9kdWxvU2VydmxldCNEQ0k=?YWNjYW8jcmVnaXN0by1hY2FkZW1pY28="><i class="icon-home4"></i> <span class="text-bold text-uppercase">Dashboard</span></a></li>

                                        <!-- GESTÃO -->
                                        <%
                                            if (mu.isMuiGestao()) {
                                        %>
                                        <li class="nav-item active">
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
                                                        <li><a href="QXZhbGlhY2FvU2VydmxldCNEQ0k=?YWNjYW8jcHJlc2VuZXNhcy1leGFtZQ=="><i class="icon-checkmark-circle"></i> Marcar Presenças</a></li>
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
                            <ul class="nav navbar-nav element-active-orange-400">
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-book position-left"></i> Registo Académico  <span class="text-danger-400"> (Painel Principal)</span>  </a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->


                    <h6 class="content-group text-bold">
                        AVALIAÇÃO PEDAGÓGICA
                        <small class="display-block text-bold">Informação estatística da escola</small>
                    </h6>


                    <!-- Estatisticas Gerais -->
                    <div class="row">

                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body">
                                <div class="media">
                                    <div class="media-left">
                                        <i class="icon-home7" style="font-size: 60px;"></i>
                                    </div>

                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numSalas%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">SALAS</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body">
                                <div class="media">
                                    <div class="media-left">
                                        <i class="icon-list3" style="font-size: 60px;"></i>
                                    </div>

                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numTurmas%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">TURMAS</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body">
                                <div class="media">
                                    <div class="media-left">
                                        <i class="icon-reading" style="font-size: 60px;"></i>
                                    </div>

                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numDocentes%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">PROFESSORES</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body">
                                <div class="media">
                                    <div class="media-left">
                                        <i class="icon-users" style="font-size: 60px;"></i>
                                    </div>

                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numAlunos%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">ALUNOS</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /estatisticas gerais -->



                    <!-- Estatisticas Aproveitamento -->
                    <div class="row">
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body bg-orange-400">
                                <div class="media">
                                    <div class="media-left">
                                        <i class="icon-users2" style="font-size: 60px;"></i>
                                    </div>

                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numAlunosNecessitados%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">ALUNOS NECESSITADOS</p>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body">
                                <div class="media">
                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numFaltas%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">FALTAS</p>
                                    </div>
                                    <div class="media-left">
                                        <i class="icon-cancel-circle2 text-danger" style="font-size: 60px;"></i>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body bg-success-400">
                                <div class="media">
                                    <div class="media-left">
                                        <i class="icon-clipboard5" style="font-size: 60px;"></i>
                                    </div>

                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numAprovacoes%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">Nº DE APROVAÇÕES</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-body bg-danger-400">
                                <div class="media">


                                    <div class="media-body">
                                        <h6 class="media-heading text-bold"  style="font-size: 25px;"><%=numReprovacoes%></h6>
                                        <p class="text-muted text-uppercase text-size-large text-bold">Nº DE REPROVAÇÕES</p>
                                    </div>

                                    <div class="media-left">
                                        <i class="icon-spam" style="font-size: 60px;"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /estatisticas aproveitamento -->


                    <!-- Row Genero & Idade -->
                    <div class="row">
                        <div class="col-md-6">
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold">Alunos Por Genero <span class="text-danger-600">(<%=ano%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="pie_basic"></div>
                                    </div>
                                </div>
                            </div>
                        </div>


                        <div class="col-md-6">
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold">Alunos Por Faixa Etária <span class="text-danger-600">(<%=ano%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="pie_donut"></div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /row genero & idade -->


                    <!-- Row matriculas -->
                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold">Resumo das Matriculas por Classe <span class="text-danger-600">(<%=ano%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="columns_timeline"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /row matriculas -->


                    <!-- Row aproveitamento -->
                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold">Rácio de Aproveitamento por classe <span class="text-danger-600">(<%=ano%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="bars_float"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /row aproveitamento -->



                    <!-- Row Faltas -->
                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-flat">
                                <div class="panel-heading">
                                    <h6 class="panel-title text-uppercase text-bold text-bold">Resumo de Faltas <span class="text-danger-600">(<%=ano%>)</span></h6>
                                    <div class="heading-elements">
                                        <ul class="icons-list">
                                            <li><a data-action="collapse"></a></li>
                                            <li><a data-action="reload"></a></li>
                                        </ul>
                                    </div>
                                </div>

                                <div class="panel-body">
                                    <div class="chart-container">
                                        <div class="chart has-fixed-height" id="columns_clustered"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /row faltas -->


                    <!-- Content area -->
                    <div class="content">



                        <!-- Footer -->
                        <div class="footer text-bold">
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

        <script>
            /* ------------------------------------------------------------------------------
             *
             *  # Echarts - Column and Waterfall charts
             *
             *  Demo JS code for echarts_columns_waterfalls.html page
             *
             * ---------------------------------------------------------------------------- */


            // Setup module
            // ------------------------------

            /* ------------------------------------------------------------------------------
             *
             *  # Echarts - Column and Waterfall charts
             *
             *  Demo JS code for echarts_columns_waterfalls.html page
             *
             * ---------------------------------------------------------------------------- */


// Setup module
// ------------------------------

            var EchartsColumnsWaterfalls = function () {


                //
                // Setup module components
                //

                // Column and waterfall charts
                var _columnsWaterfallsExamples = function () {
                    if (typeof echarts == 'undefined') {
                        console.warn('Warning - echarts.min.js is not loaded.');
                        return;
                    }

                    // Define elements
                    var columns_clustered_element = document.getElementById('columns_clustered');


                    //
                    // Charts configuration
                    //

                    // Stacked clustered columns
                    if (columns_clustered_element) {

                        // Initialize chart
                        var columns_clustered = echarts.init(columns_clustered_element);


                        //
                        // Chart config
                        //

                        // Options
                        columns_clustered.setOption({

                            // Define colors
                            color: ['#2ec7c9', '#b6a2de', '#5ab1ef', '#ffb980', '#d87a80'],

                            // Global text styles
                            textStyle: {
                                fontFamily: 'Poppins, Arial, Verdana, sans-serif',
                                fontSize: 13
                            },

                            // Chart animation duration
                            animationDuration: 750,

                            // Setup grid
                            grid: {
                                left: 0,
                                right: 5,
                                top: 55,
                                bottom: 0,
                                containLabel: true
                            },

                            // Add legend
                            legend: {
                                data: [
                                    'Registadas', '',
                                    'Justificadas'
                                ],
                                itemHeight: 2,
                                itemGap: 8,
                                textStyle: {
                                    padding: [0, 10]
                                }
                            },

                            // Add tooltip
                            tooltip: {
                                trigger: 'axis',
                                backgroundColor: 'rgba(0,0,0,0.75)',
                                padding: [10, 15],
                                textStyle: {
                                    fontSize: 13,
                                    fontFamily: 'Poppins, sans-serif'
                                }
                            },

                            // Horizontal axis
                            xAxis: [
                                {
                                    type: 'category',
                                    data: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
                                    axisLabel: {
                                        color: '#333'
                                    },
                                    axisLine: {
                                        lineStyle: {
                                            color: '#999'
                                        }
                                    },
                                    splitLine: {
                                        show: true,
                                        lineStyle: {
                                            color: '#eee',
                                            type: 'dashed'
                                        }
                                    }
                                },
                                {
                                    type: 'category',
                                    axisLine: {show: false},
                                    axisTick: {show: false},
                                    axisLabel: {show: false},
                                    splitArea: {show: false},
                                    splitLine: {show: false},
                                    data: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez']
                                }
                            ],

                            // Vertical axis
                            yAxis: [{
                                    type: 'value',
                                    axisLabel: {
                                        color: '#333',
                                        formatter: '{value}'
                                    },
                                    axisLine: {
                                        lineStyle: {
                                            color: '#999'
                                        }
                                    },
                                    splitLine: {
                                        lineStyle: {
                                            color: ['#eee']
                                        }
                                    },
                                    splitArea: {
                                        show: true,
                                        areaStyle: {
                                            color: ['rgba(250,250,250,0.1)', 'rgba(0,0,0,0.01)']
                                        }
                                    }
                                }],

                            // Add series
                            series: [
                                {
                                    name: 'Justificadas',
                                    type: 'bar',
                                    z: 2,
                                    itemStyle: {
                                        normal: {
                                            color: '#F44336',
                                            label: {
                                                show: true,
                                                padding: 5,
                                                position: 'top',
                                                textStyle: {
                                                    color: '#fff',
                                                    fontSize: 12
                                                }
                                            }
                                        }
                                    },
                                    data: [<%=lblFaltas_J%>]
                                },
                                {
                                    name: 'Registadas',
                                    type: 'bar',
                                    z: 1,
                                    xAxisIndex: 1,
                                    itemStyle: {
                                        normal: {
                                            color: '#E57373',
                                            label: {
                                                show: true,
                                                padding: 5,
                                                position: 'top'
                                            }
                                        }
                                    },
                                    data: [<%=lblFaltas_R%>]
                                }
                            ]
                        });
                    }

                    //
                    // Resize charts
                    //

                    // Resize function
                    var triggerChartResize = function () {
                        columns_clustered_element && columns_clustered.resize();
                    };

                    // On sidebar width change
                    $(document).on('click', '.sidebar-control', function () {
                        setTimeout(function () {
                            triggerChartResize();
                        }, 0);
                    });

                    // On window resize
                    var resizeCharts;
                    window.onresize = function () {
                        clearTimeout(resizeCharts);
                        resizeCharts = setTimeout(function () {
                            triggerChartResize();
                        }, 200);
                    };
                };


                //
                // Return objects assigned to module
                //

                return {
                    init: function () {
                        _columnsWaterfallsExamples();
                    }
                }
            }();



            var EchartsBarsTornados = function () {


                //
                // Setup module components
                //

                // Bar and tornado charts
                var _barsTornadosExamples = function () {
                    if (typeof echarts == 'undefined') {
                        console.warn('Warning - echarts.min.js is not loaded.');
                        return;
                    }

                    // Define elements
                    var bars_float_element = document.getElementById('bars_float');


                    //
                    // Charts configuration
                    //

                    // Floating bars
                    if (bars_float_element) {

                        // Initialize chart
                        var bars_float = echarts.init(bars_float_element);


                        //
                        // Chart config
                        //

                        // Variables
                        var placeHoledStyle = {
                            normal: {
                                barBorderColor: 'transparent',
                                color: 'transparent'
                            }
                        };
                        var dataStyle = {
                            normal: {
                                barBorderRadius: 3,
                                label: {
                                    show: true,
                                    position: 'insideLeft',
                                    formatter: '{c}%',
                                    textStyle: {
                                        padding: 5
                                    }
                                }
                            }
                        };

                        // Options
                        bars_float.setOption({

                            // Define colors
                            color: ['#4DB6AC', '#E57373', '#D32F2F', '#388E3C'],

                            // Global text styles
                            textStyle: {
                                fontFamily: 'Poppins, Arial, Verdana, sans-serif',
                                fontSize: 13
                            },

                            // Chart animation duration
                            animationDuration: 750,

                            // Setup grid
                            grid: {
                                left: 5,
                                right: 10,
                                top: 35,
                                bottom: 0,
                                containLabel: true
                            },

                            // Add legend
                            legend: {
                                data: ['ADMITIDOS', 'REPROVADOS', 'EXCLUÍDOS', 'DISPENSADOS'],
                                itemHeight: 8,
                                itemGap: 20,
                                textStyle: {
                                    padding: [0, 5]
                                }
                            },

                            // Add tooltip
                            tooltip: {
                                trigger: 'axis',
                                backgroundColor: 'rgba(0,0,0,0.75)',
                                padding: [10, 15],
                                textStyle: {
                                    fontSize: 13,
                                    fontFamily: 'Poppins, sans-serif'
                                },
                                axisPointer: {
                                    type: 'shadow',
                                    shadowStyle: {
                                        color: 'rgba(0,0,0,0.025)'
                                    }
                                },
                                formatter: '<div class="mb-1">{b}</div>{a0}: {c0}%<br/>{a2}: {c2}%<br/>{a4}: {c4}%<br/>{a6}: {c6}%'
                            },

                            // Horizontal axis
                            xAxis: [{
                                    type: 'value',
                                    axisLabel: {
                                        color: '#333'
                                    },
                                    axisLine: {
                                        lineStyle: {
                                            color: '#999'
                                        }
                                    },
                                    splitLine: {
                                        show: true,
                                        lineStyle: {
                                            color: '#eee',
                                            type: 'dashed'
                                        }
                                    }
                                }],

                            // Vertical axis
                            yAxis: [{
                                    type: 'category',
                                    data: [<%=lblClasses%>],
                                    axisLabel: {
                                        color: '#333'
                                    },
                                    axisLine: {
                                        lineStyle: {
                                            color: '#999'
                                        }
                                    },
                                    splitLine: {
                                        show: true,
                                        lineStyle: {
                                            color: '#eee'
                                        }
                                    },
                                    splitArea: {
                                        show: true,
                                        areaStyle: {
                                            color: ['rgba(250,250,250,0.1)', 'rgba(0,0,0,0.015)']
                                        }
                                    }
                                }],

                            // Add series
                            series: [
                                {
                                    name: 'ADMITIDOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: dataStyle,
                                    data: [<%=lblAdmitidos%>]
                                },
                                {
                                    name: 'ADMITIDOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: placeHoledStyle,
                                    data: [<%=lblAdmitidosPlaceHolder%>]
                                },
                                {
                                    name: 'REPROVADOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: dataStyle,
                                    data: [<%=lblReprovados%>]
                                },
                                {
                                    name: 'REPROVADOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: placeHoledStyle,
                                    data: [<%=lblReprovadosPlaceHolder%>]
                                },
                                {
                                    name: 'EXCLUÍDOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: dataStyle,
                                    data: [<%=lblExcluidos%>]
                                },
                                {
                                    name: 'EXCLUÍDOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: placeHoledStyle,
                                    data: [<%=lblExcluidosPlaceHolder%>]
                                },
                                {
                                    name: 'DISPENSADOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: dataStyle,
                                    data: [<%=lblDispensados%>]
                                },
                                {
                                    name: 'DISPENSADOS',
                                    type: 'bar',
                                    stack: 'Total',
                                    itemStyle: placeHoledStyle,
                                    data: [<%=lblDispensadosPlaceHolder%>]
                                }
                            ]
                        });
                    }


                    //
                    // Resize charts
                    //

                    // Resize function
                    var triggerChartResize = function () {
                        bars_float_element && bars_float.resize();
                    };

                    // On sidebar width change
                    $(document).on('click', '.sidebar-control', function () {
                        setTimeout(function () {
                            triggerChartResize();
                        }, 0);
                    });

                    // On window resize
                    var resizeCharts;
                    window.onresize = function () {
                        clearTimeout(resizeCharts);
                        resizeCharts = setTimeout(function () {
                            triggerChartResize();
                        }, 200);
                    };
                };


                //
                // Return objects assigned to module
                //

                return {
                    init: function () {
                        _barsTornadosExamples();
                    }
                }
            }();


            var EchartsPiesDonuts = function () {


                //
                // Setup module components
                //

                // Pie and donut charts
                var _piesDonutsExamples = function () {
                    if (typeof echarts == 'undefined') {
                        console.warn('Warning - echarts.min.js is not loaded.');
                        return;
                    }

                    // Define elements
                    var pie_basic_element = document.getElementById('pie_basic');
                    var pie_donut_element = document.getElementById('pie_donut');


                    //
                    // Charts configuration
                    //

                    // Basic pie chart
                    if (pie_basic_element) {

                        // Initialize chart
                        var pie_basic = echarts.init(pie_basic_element);


                        //
                        // Chart config
                        //

                        // Options
                        pie_basic.setOption({

                            // Colors
                            color: [
                                '#EC407A', '#0288D1', '#5ab1ef', '#ffb980', '#d87a80',
                                '#8d98b3', '#e5cf0d', '#97b552', '#95706d', '#dc69aa',
                                '#07a2a4', '#9a7fd1', '#588dd5', '#f5994e', '#c05050',
                                '#59678c', '#c9ab00', '#7eb00a', '#6f5553', '#c14089'
                            ],

                            // Global text styles
                            textStyle: {
                                fontFamily: 'Poppins, Arial, Verdana, sans-serif',
                                fontSize: 13
                            },

                            // Add title
                            title: {
                                text: 'Nº Total Por Genero',
                                subtext: 'Análise de Alunos por Genero',
                                left: 'center',
                                textStyle: {
                                    fontSize: 17,
                                    fontWeight: 500
                                },
                                subtextStyle: {
                                    fontSize: 12
                                }
                            },

                            // Add tooltip
                            tooltip: {
                                trigger: 'item',
                                backgroundColor: 'rgba(0,0,0,0.75)',
                                padding: [10, 15],
                                textStyle: {
                                    fontSize: 13,
                                    fontFamily: 'Poppins, sans-serif'
                                },
                                formatter: "{a} <br/>{b}: {c} ({d}%)"
                            },

                            // Add legend
                            legend: {
                                orient: 'vertical',
                                top: 'center',
                                left: 0,
                                data: ['Feminino', 'Masculino'],
                                itemHeight: 8,
                                itemWidth: 8
                            },

                            // Add series
                            series: [{
                                    name: 'Nº de Alunos',
                                    type: 'pie',
                                    radius: '70%',
                                    center: ['50%', '57.5%'],
                                    itemStyle: {
                                        normal: {
                                            borderWidth: 1,
                                            borderColor: '#fff'
                                        }
                                    },
                                    data: [
                                        {value: <%=numMulheres%>, name: 'Feminino'},
                                        {value: <%=numHomens%>, name: 'Masculino'}
                                    ]
                                }]
                        });
                    }

                    // Basic donut chart
                    if (pie_donut_element) {

                        // Initialize chart
                        var pie_donut = echarts.init(pie_donut_element);


                        //
                        // Chart config
                        //

                        // Options
                        pie_donut.setOption({

                            // Colors
                            color: [
                                '#26A69A', '#E64A19', '#D81B60', '#37474F', '#1976D2', '#3949AB'
                            ],

                            // Global text styles
                            textStyle: {
                                fontFamily: 'Poppins, Arial, Verdana, sans-serif',
                                fontSize: 13
                            },

                            // Add title
                            title: {
                                text: 'Nº Total Por Faixa Etária',
                                subtext: 'Análise de Matriculas por Faixa Etária',
                                left: 'center',
                                textStyle: {
                                    fontSize: 17,
                                    fontWeight: 500
                                },
                                subtextStyle: {
                                    fontSize: 12
                                }
                            },

                            // Add tooltip
                            tooltip: {
                                trigger: 'item',
                                backgroundColor: 'rgba(0,0,0,0.75)',
                                padding: [10, 15],
                                textStyle: {
                                    fontSize: 13,
                                    fontFamily: 'Poppins, sans-serif'
                                },
                                formatter: "{a} <br/>{b}: {c} ({d}%)"
                            },

                            // Add legend
                            legend: {
                                orient: 'vertical',
                                top: 'center',
                                left: 0,
                                data: ['0-5 anos', '6-10 anos', '11-15 anos', '16-25 anos', '26-35 anos', '> 35 anos'],
                                itemHeight: 8,
                                itemWidth: 8
                            },

                            // Add series
                            series: [{
                                    name: 'Nº de Alunos',
                                    type: 'pie',
                                    radius: ['50%', '70%'],
                                    center: ['50%', '57.5%'],
                                    itemStyle: {
                                        normal: {
                                            borderWidth: 1,
                                            borderColor: '#fff'
                                        }
                                    },
                                    data: [
                                        {value: <%=numFaixa05%>, name: '0-5 anos'},
                                        {value: <%=numFaixa610%>, name: '6-10 anos'},
                                        {value: <%=numFaixa1115%>, name: '11-15 anos'},
                                        {value: <%=numFaixa1625%>, name: '16-25 anos'},
                                        {value: <%=numFaixa2635%>, name: '26-35 anos'},
                                        {value: <%=numFaixa35%>, name: '> 35 anos'}
                                    ]
                                }]
                        });
                    }

// Define elements
                    var columns_timeline_element = document.getElementById('columns_timeline');


                    //
                    // Charts configuration
                    //

                    // Columns timeline
                    if (columns_timeline_element) {

                        // Initialize chart
                        var columns_timeline = echarts.init(columns_timeline_element);


                        //
                        // Chart config
                        //

                        // Demo data
                        var dataMap = {};
                        dataMap.lbl1 = ({<%=lblNovos%>});
                        dataMap.lbl2 = ({<%=lblContinuantes%>});
                        dataMap.lbl3 = ({<%=lblRepetente%>});
                        dataMap.lbl4 = ({<%=lblAssistentes%>});
                        dataMap.lbl5 = ({<%=lblTransferidos%>});


                        // Options
                        columns_timeline.setOption({

                            // Setup timeline
                            timeline: {
                                axisType: 'category',
                                data: [<%=lblAnos%>],
                                left: 0,
                                right: 0,
                                bottom: 0,
                                label: {
                                    normal: {
                                        fontFamily: 'Poppins, Arial, Verdana, sans-serif',
                                        fontSize: 11
                                    }
                                },
                                autoPlay: true,
                                playInterval: 3000
                            },

                            // Config
                            options: [
                                {

                                    // Define colors
                                    color: ['#4DB6AC', '#FFB74D', '#E57373', '#888888', '#03A9F4'],

                                    // Global text styles
                                    textStyle: {
                                        fontFamily: 'Poppins, Arial, Verdana, sans-serif',
                                        fontSize: 13
                                    },

                                    // Chart animation duration
                                    animationDuration: 750,

                                    // Setup grid
                                    grid: {
                                        left: 10,
                                        right: 10,
                                        top: 35,
                                        bottom: 60,
                                        containLabel: true
                                    },

                                    // Add legend
                                    legend: {
                                        data: ['NOVO INGRESSO', 'CONTINUANTE', 'REPETENTE', 'ASSISTENTE', 'TRANSFERIDO'],
                                        itemHeight: 8,
                                        itemGap: 20
                                    },

                                    // Tooltip
                                    tooltip: {
                                        trigger: 'axis',
                                        backgroundColor: 'rgba(0,0,0,0.75)',
                                        padding: [10, 15],
                                        textStyle: {
                                            fontSize: 13,
                                            fontFamily: 'Poppins, sans-serif'
                                        },
                                        axisPointer: {
                                            type: 'shadow',
                                            shadowStyle: {
                                                color: 'rgba(0,0,0,0.025)'
                                            }
                                        }
                                    },

                                    // Horizontal axis
                                    xAxis: [{
                                            type: 'category',
                                            data: [<%=lblClasses%>],
                                            axisLabel: {
                                                color: '#333'
                                            },
                                            axisLine: {
                                                lineStyle: {
                                                    color: '#999'
                                                }
                                            },
                                            splitLine: {
                                                show: true,
                                                lineStyle: {
                                                    color: '#eee',
                                                    type: 'dashed'
                                                }
                                            },
                                            splitArea: {
                                                show: true,
                                                areaStyle: {
                                                    color: ['rgba(250,250,250,0.1)', 'rgba(0,0,0,0.015)']
                                                }
                                            }
                                        }],

                                    // Vertical axis
                                    yAxis: [
                                        {
                                            type: 'value',
                                            name: 'Nr.',
                                            axisLabel: {
                                                color: '#333'
                                            },
                                            axisLine: {
                                                lineStyle: {
                                                    color: '#999'
                                                }
                                            },
                                            splitLine: {
                                                show: true,
                                                lineStyle: {
                                                    color: '#eee'
                                                }
                                            }
                                        },
                                        {
                                            type: 'value',
                                            axisLabel: {
                                                color: '#333'
                                            },
                                            axisLine: {
                                                lineStyle: {
                                                    color: '#999'
                                                }
                                            },
                                            splitLine: {
                                                show: true,
                                                lineStyle: {
                                                    color: '#f5f5f5'
                                                }
                                            }
                                        }
                                    ],

                                    // Add series
                                    series: [
                                        {
                                            name: 'NOVO INGRESSO',
                                            type: 'bar',
                                            data: dataMap.lbl1['<%=ano1%>']
                                        },
                                        {
                                            name: 'CONTINUANTE',
                                            yAxisIndex: 1,
                                            type: 'bar',
                                            data: dataMap.lbl2['<%=ano1%>']
                                        },
                                        {
                                            name: 'REPETENTE',
                                            yAxisIndex: 1,
                                            type: 'bar',
                                            data: dataMap.lbl3['<%=ano1%>']
                                        },
                                        {
                                            name: 'ASSISTENTE',
                                            yAxisIndex: 1,
                                            type: 'bar',
                                            data: dataMap.lbl4['<%=ano1%>']
                                        },
                                        {
                                            name: 'TRANSFERIDO',
                                            yAxisIndex: 1,
                                            type: 'bar',
                                            data: dataMap.lbl5['<%=ano1%>']
                                        }
                                    ]
                                },

                                // 2018 data
                                {
                                    series: [
                                        {data: dataMap.lbl1['<%=ano2%>']},
                                        {data: dataMap.lbl2['<%=ano2%>']},
                                        {data: dataMap.lbl3['<%=ano2%>']},
                                        {data: dataMap.lbl4['<%=ano2%>']},
                                        {data: dataMap.lbl5['<%=ano2%>']}
                                    ]
                                },

                                // 2019 data
                                {
                                    series: [
                                        {data: dataMap.lbl1['<%=ano3%>']},
                                        {data: dataMap.lbl2['<%=ano3%>']},
                                        {data: dataMap.lbl3['<%=ano3%>']},
                                        {data: dataMap.lbl4['<%=ano3%>']},
                                        {data: dataMap.lbl5['<%=ano3%>']}
                                    ]
                                },

                                // 2020 data
                                {
                                    series: [
                                        {data: dataMap.lbl1['<%=ano4%>']},
                                        {data: dataMap.lbl2['<%=ano4%>']},
                                        {data: dataMap.lbl3['<%=ano4%>']},
                                        {data: dataMap.lbl4['<%=ano4%>']},
                                        {data: dataMap.lbl5['<%=ano4%>']}
                                    ]
                                },

                                // 2021 data
                                {
                                    series: [
                                        {data: dataMap.lbl1['<%=ano5%>']},
                                        {data: dataMap.lbl2['<%=ano5%>']},
                                        {data: dataMap.lbl3['<%=ano5%>']},
                                        {data: dataMap.lbl4['<%=ano5%>']},
                                        {data: dataMap.lbl5['<%=ano5%>']}
                                    ]
                                }
                            ]
                        });
                    }




                    //
                    // Resize charts
                    //

                    // Resize function
                    var triggerChartResize = function () {
                        pie_basic_element && pie_basic.resize();
                        pie_donut_element && pie_donut.resize();
                    };

                    // On sidebar width change
                    $(document).on('click', '.sidebar-control', function () {
                        setTimeout(function () {
                            triggerChartResize();
                        }, 0);
                    });

                    // On window resize
                    var resizeCharts;
                    window.onresize = function () {
                        clearTimeout(resizeCharts);
                        resizeCharts = setTimeout(function () {
                            triggerChartResize();
                        }, 200);
                    };
                };


                //
                // Return objects assigned to module
                //

                return {
                    init: function () {
                        _piesDonutsExamples();
                    }
                }
            }();



            // Initialize module
            // ------------------------------

            document.addEventListener('DOMContentLoaded', function () {
                EchartsColumnsWaterfalls.init();
                EchartsBarsTornados.init();
                EchartsPiesDonuts.init();
            });


        </script>


    </body>
</html>
