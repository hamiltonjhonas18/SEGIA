<%-- 
    Document   : dc-error-400
    Created on : Jun 1, 2016, 1:05:33 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.local.HCal"%>
<%@page import="org.joda.time.Days"%>
<%@page import="org.joda.time.DateTime"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.dciapps.webclient.Pagamento"%>
<%@page import="com.dciapps.webclient.Mensalidade"%>
<%@page import="com.dciapps.webclient.Notas"%>
<%@page import="com.dciapps.webclient.Turno"%>
<%@page import="com.dciapps.webclient.Inscricao"%>
<%@page import="com.dciapps.webclient.Turma"%>
<%@page import="com.dciapps.webclient.Aluno"%>
<%@page import="com.dciapps.webclient.Entidade"%>
<%@page import="com.dciapps.localcontroler.Data"%>
<%@page import="com.dciapps.localcontroler.EncryptUtils"%>
<%@page import="com.dciapps.webclient.Usuario"%>
<%@page import="com.dciapps.controller.GenericHandler"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SEGIA - Portal do Aluno</title>

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
        <!-- /core JS files -->

        <!-- Theme JS files -->
        <script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/styling/switchery.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/styling/switch.min.js"></script>
        <script type="text/javascript" src="assets/js/plugins/forms/selects/select2.min.js"></script>
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

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            EncryptUtils encryptUtils = new EncryptUtils();

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
            float notaMaxima = 0;
            float notaMinima = 0;
            float mediaActual = 0;

            List<Pagamento> pagamentos = null;

            String msgErro = "";
            String alerta = "";
            String semestre = "";
            
            Entidade entidade = (Entidade) session.getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) session.getAttribute("entidade");
            }

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = encryptUtils.decodeString(usuario.getPessoapess().getPessActividade());

                turmas = (List<Turma>) session.getAttribute("turmas");
                inscricoes = (List<Inscricao>) session.getAttribute("inscricoes");
                notas = (List<Notas>) session.getAttribute("notas");
                pagamentos = (List<Pagamento>) session.getAttribute("pagamentos");

                aluno = (Aluno) session.getAttribute("aluno");
                mensalidade = (Mensalidade) session.getAttribute("mensalidade");
                usuarioAluno = (Usuario) session.getAttribute("usuarioAluno");
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
    </head>

    <body oncontextmenu="return false" >


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
                        <form method="post" action="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jbG9nb3V0I0RDSQ==">
                            <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase btn-labeled btn-labeled-left bg-danger-400 heading-btn">Terminar a sessão<b><i class="icon-switch"></i></b></button>
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


                <!-- Main content -->
                <div class="content-wrapper">


                    <% if (usuario != null) {

                            String primeiroNome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome());
                            String apelido = encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                            String email = encryptUtils.decodeString(usuario.getPessoapess().getPessEmail());
                            String contacto = encryptUtils.decodeString(usuario.getPessoapess().getPessContacto());
                            String endereco = encryptUtils.decodeString(usuario.getPessoapess().getPessBairro());
                            String dataNascimento = "";
                            String dis = "";

                            if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Aluno")) {
                                dis = "readonly";
                            }

                            if (usuario.getPessoapess().getPessDataNascimento() != null) {
                                dataNascimento = sdf.format(usuario.getPessoapess().getPessDataNascimento().toGregorianCalendar().getTime());
                            }
                            String nacionalidade = "";

                            if (usuario.getPessoapess().getNacionalidadenaci() != null) {
                                nacionalidade = encryptUtils.decodeString(usuario.getPessoapess().getNacionalidadenaci().getNaciDescricao());
                            }
                            String naturalidade = encryptUtils.decodeString(usuario.getPessoapess().getPessProvincia());
                            String sexo = encryptUtils.decodeString(usuario.getPessoapess().getPessSexo());
                            String cidade = encryptUtils.decodeString(usuario.getPessoapess().getPessBairro());
                            String cPostal = encryptUtils.decodeString(usuario.getPessoapess().getPessRua()) + " / " + encryptUtils.decodeString(usuario.getPessoapess().getPessNumeroCasa());

                            String tipoUsuario = usuario.getTipoUsuariotipu().getTipuDescricao();
                            String dataCriacao = sdf.format(usuario.getPessoapess().getPessDataCadastro().toGregorianCalendar().getTime());
                            String ultimoLogin = "Não definido";

                            String bi = encryptUtils.decodeString(usuario.getPessoapess().getPessBi());
                            String nuit = encryptUtils.decodeString(usuario.getPessoapess().getPessNuit());

                            if (usuario.getUsuDataUltimaVisita() != null) {
                                ultimoLogin = sdf.format(usuario.getUsuDataUltimaVisita().toGregorianCalendar().getTime());
                            }

                            String lblEstado = "bg-success";

                            String estado = usuario.getUsuaEstado();

                            if (estado.equals("Inactivo")) {
                                lblEstado = "bg-danger";
                            }

                            int nrAcessos = usuario.getUsuaTentativasLogin();


                    %>        




                    <!-- Toolbar -->
                    <div class="navbar navbar-default navbar-component navbar-xs">
                        <ul class="nav navbar-nav visible-xs-block">
                            <li class="full-width text-center"><a data-toggle="collapse" data-target="#navbar-filter"><i class="icon-menu7"></i></a></li>
                        </ul>

                        <div class="navbar-collapse collapse" id="navbar-filter">
                            <ul class="nav navbar-nav element-active-slate-400">
                                <li class="active"><a href="#settings" data-toggle="tab"  class="text-bold text-uppercase"><i class="icon-profile position-left"></i> Ficha do Aluno</a></li>
                                <li><a href="#documentos" data-toggle="tab"  class="text-bold text-uppercase"><i class="icon-copy4 position-left"></i> Documentos</a></li>
                                <li><a href="#inscricoes" data-toggle="tab"  class="text-bold text-uppercase"><i class="icon-list3 position-left"></i> Inscrições</a></li>
                                <li><a href="#pagamentos" data-toggle="tab"  class="text-bold text-uppercase"><i class="icon-cash4 position-left"></i> Pagamentos</a></li>

                                <%                                    if (estado.equals("Activo")) {
                                %>
                                <li><a href="#notas" data-toggle="tab"  class="text-bold text-uppercase"><i class="icon-file-text position-left"></i> Avaliações</a></li>
                                <li><a href="#avaliacao" data-toggle="tab"  class="text-bold text-uppercase"><i class="icon-info22 position-left"></i> Outras Informações</a></li>  
                                    <%
                                        }
                                    %>

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
                                            <img src="http://<%=ip%>:8081/suc/images/profile-pictures/<%=fotoPerfil%>" alt="<%=nome%>">
                                            <div class="caption">
                                                <span>
                                                    <a href="#" class="btn text-bold text-uppercase bg-success-400 btn-icon btn-xs" data-popup="lightbox"><i class="icon-plus2"></i></a>
                                                    <a href="#" class="btn text-bold text-uppercase bg-success-400 btn-icon btn-xs"><i class="icon-link"></i></a>
                                                </span>
                                            </div>
                                        </div>

                                        <div class="caption text-center">
                                            <h6 class="text-semibold no-margin"><%=nome%><small class="display-block"><%=cargo%></small></h6>
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


                                            </div>




                                            <div class="tab-pane fade" id="inscricoes">


                                                <div class="col-md-9 col-md-offset-1">






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
                                                                            <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800">Filtrar Resultados <i class="icon-filter3 position-right"></i></button>
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
                                                                        <a href="QWx1bm9TZXJ2bGV0I0RDSQ==?YWNjYW8jaW1wcmltaXItcGFnYW1lbnRvcw==" target="_blank" class="btn bg-orange-400 btn-labeled btn-lg text-bold text-uppercase">
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

                                                                                    String status = "Confirmado";
                                                                                    String lblStatus = "bg-success-600";

                                                                                    if (!p.isPagStatus()) {
                                                                                        status = "Pendente";
                                                                                        lblStatus = "bg-orange-600";
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
                                                                        <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800">Filtrar resultados <i class="icon-filter3 position-right"></i></button>
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
                                                    <div class="col-md-6">


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
                                                    <div class="col-md-6">


                                                        <%
                                                            if (inscricao != null) {

                                                                String curso = encryptUtils.decodeString(inscricao.getCurso().getCursDescricao());
                                                                String horario = encryptUtils.decodeString(inscricao.getTurma().getTurmHorario());

                                                                String dataUlt = "---";
                                                                String dataIns = sdf.format(inscricao.getInscDataInscricao().toGregorianCalendar().getTime());

                                                                int diasTrial = 0;

                                                                if (inscricao.getInscDataUltimoPagamento() != null) {
                                                                    Date dtaProx = inscricao.getInscDataUltimoPagamento().toGregorianCalendar().getTime();
                                                                    dataUlt = sdf.format(dtaProx);
                                                                    Date dtaHoje = new Date();
                                                                    diasTrial = Days.daysBetween(new DateTime(dtaHoje), new DateTime(dtaProx)).getDays();

                                                                }

                                                                String bg = "bg-danger-800";

                                                                if (diasTrial > 0 && diasTrial < 7) {
                                                                    bg = "bg-danger-600";
                                                                }

                                                                if (diasTrial >= 7 && diasTrial <= 15) {
                                                                    bg = "bg-warning-600";
                                                                }

                                                                if (diasTrial > 15) {
                                                                    bg = "bg-success-600";
                                                                }
                                                        %>
                                                        <!-- Basic table -->
                                                        <div class="panel panel-flat">
                                                            <div class="panel-heading">
                                                                <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Resumo da Inscrição</h6>
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
                                                                            <td><i class="icon-books"></i>  <b>Curso</b></td>
                                                                            <td><span class="badge bg-slate-800 pull-right"><%=curso%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-sort-time-asc"></i>  <b>Data de inscrição</b></td>
                                                                            <td><span class="badge bg-slate-800 pull-right"><%=dataIns%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-watch2"></i> <b>Horário</b></td>
                                                                            <td><span class="badge bg-slate-800 pull-right"><%=horario%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-calendar22"></i> <b>Último Pagamento</b> </td>
                                                                            <td><span class="badge bg-slate-800 pull-right"><%=dataUlt%></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td><i class="icon-exclamation"></i>  <b>Dias Prox. Pagamento</b></td>
                                                                            <td><span class="badge <%=bg%> gray pull-right"><%=diasTrial%></span></td>
                                                                        </tr>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </div>
                                                        <!-- /basic table -->

                                                        <%
                                                            }
                                                        %>
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



                        </div>
                        <!-- /vertical form options -->
                    </div>					


                    <%
                        }
                    %>

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

</html>
