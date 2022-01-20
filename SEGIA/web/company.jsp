<%-- 
    Document   :  -company
    Created on : Feb 11, 2017, 7:30:25 PM
    Author     : HJC2K8
--%>

<%@page import="java.util.Date"%>
<%@page import="org.joda.time.Days"%>
<%@page import="org.joda.time.DateTime"%>
<%@page import="com.dciapps.webclient.Pessoa"%>
<%@page import="com.dciapps.webclient.Banco"%>
<%@page import="com.dciapps.local.LEntidade"%>
<%@page import="com.dciapps.webclient.Entidade"%>
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
        <title>SEGIA - Empresas</title>

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

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            EncryptUtils encryptUtils = new EncryptUtils();

            ModulosUsuario mARKET = null;
            List<LEntidade> lentidades = null;
            LEntidade lentidade = null;

            String msgErro = "";
            String alerta = "";
            int numRegistos = 0;

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mARKET = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                lentidades = (List<LEntidade>) session.getAttribute("lentidades");
                lentidade = (LEntidade) session.getAttribute("lentidadeAdd");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                if (lentidades != null) {
                    numRegistos = lentidades.size();
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
    </head>

    <body oncontextmenu="return false"  class="navbar-top">



        <!-- Main navbar -->
        <div class="navbar navbar-inverse  navbar-fixed-top">
            <div class="navbar-header">
                <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;">Sistema Electrónico de Gestão de Informação Académica</h6>

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


                    <!-- Main navigation -->
                    <div class="sidebar-category sidebar-category-visible">
                        <div class="category-title h6">
                            <span>Navegação Principal</span>
                            <ul class="icons-list">
                                <li><a href="#" data-action="collapse"></a></li>
                            </ul>
                        </div>

                        <div class="category-content sidebar-user">
                            <div class="media">
                                <a href="#" class="media-left"><img src="http://<%=ip%>:8081/suc/images/profile-pictures/<%=fotoPerfil%>" class="img-circle img-sm" alt="<%=nome%>"></a>
                                <div class="media-body">
                                    <span class="media-heading text-semibold"><%=nome%></span>
                                    <div class="text-size-mini text-muted">
                                        <i class="icon-briefcase text-size-small"></i> &nbsp;<%=cargo%>
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

                        <div class="category-content no-padding">
                            <ul class="navigation navigation-main navigation-accordion">

                                <!-- Main -->
                                <li class="navigation-header"><span>Main</span> <i class="icon-menu" title="Main pages"></i></li>
                                <li><a href="TW9kdWxvU2VydmxldCNEQ0k=?YWNjYW8jY29uZmlndXJhY2Fv"><i class="icon-home4"></i> <span class="text-bold text-uppercase">Dashboard</span></a></li>
                                    <%
                                        if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {
                                    %>
                                <li class='active'> <a href="RW1wcmVzYVNlcnZsZXQjRENJ?YWNjYW8jZW1wcmVzYXM="><i class="icon-city"></i> <span class="text-bold text-uppercase">Empresas</span></a> </li>
                                    <%
                                        }
                                    %>
                                <li> <a href="QmFuY29TZXJ2bGV0I0RDSQ==?YWNjYW8jY29udGFz"><i class="icon-library2"></i> <span class="text-bold text-uppercase">Bancos</span></a> </li>
                                <li> <a href="SXNlbmNhb1NlcnZsZXQjRENJ?YWNjYW8jaXNlbmNvZXM="><i class="icon-percent"></i> <span class="text-bold text-uppercase">Motivos de isenção</span></a> </li>


                                <%
                                    if (mARKET.isMuiFormasPagamento()) {
                                %>
                                <!-- Formas de Pagamento -->
                                <li> <a href="Q29uZGljYW9QYWdhbWVudG9TZXJ2bGV0I0RDSQ==?YWNjYW8jY29uZGljb2VzLXBhZ2FtZW50bw=="><i class="icon-cash"></i> <span class="text-bold text-uppercase">Condições de pagamento</span></a> </li>
                                <li><a href="Rm9ybWFQYWdhbWVudG9TZXJ2bGV0I0RDSQ==?YWNjYW8jZm9ybWFzLXBhZ2FtZW50bw=="><i class="icon-credit-card"></i> <span class="text-bold text-uppercase"> Formas de pagamento</span></a></li>
                                <!-- /formas pagamento -->
                                <%
                                    }
                                %>

                                <li> <a href="RW1wcmVzYVNlcnZsZXQjRENJ?YWNjYW8jZGVmaW5pci1jYXBpdGFs"><i class="icon-wallet"></i> <span class="text-bold text-uppercase">Definir Capital</span></a> </li>

                                
                                
                                
                                
                                <li> <a href="Q29uZmlndXJhY2FvU2VydmxldCNEQ0k=?YWNjYW8jbmFjaW9uYWxpZGFkZXM="><i class="icon-earth"></i> <span class="text-bold text-uppercase">Nacionalidades</span></a> </li>
                            </ul>
                        </div>
                    </div>
                    <!-- /main navigation -->

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
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-city position-left"></i> Gestão de Empresas</span></a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->




                    <div class = "row">

                        <div class = "col-md-12 col-md-offset-0">



                            <div class="content-group tab-content-bordered navbar-component">
                                <div class="navbar navbar-inverse bg-slate-800" style="position: relative; z-index: 99;">
                                    <div class="navbar-header">
                                        <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;">Sistema Electrónico de Gestão de Informação Académica</h6>

                                        <ul class="nav navbar-nav pull-right visible-xs-block">
                                            <li><a data-toggle="collapse" data-target="#demo1"><i class="icon-tree5"></i></a></li>
                                        </ul>
                                    </div>

                                    <%
                                        String lst = "";
                                        String act = encryptUtils.encodeString("accao#registar-empresa");
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
                                        String sgl = session.getAttribute("sigla").toString();
                                        String dteI = session.getAttribute("dataInicioAssitencia").toString();
                                        String dteF = session.getAttribute("dataFimAssistencia").toString();

                                        String pnom = session.getAttribute("nomePessoaContacto").toString();
                                        String papel = session.getAttribute("apelidoPessoaContacto").toString();
                                        String pmail = session.getAttribute("emailPessoaContacto").toString();
                                        String pact = session.getAttribute("actividadePessoaContacto").toString();

                                        String bnom = session.getAttribute("nomeBanco").toString();
                                        String bnib = session.getAttribute("nibBanco").toString();
                                        String bcont = session.getAttribute("contaBanco").toString();
                                        String bmoe = session.getAttribute("moedaBanco").toString();

                                        String iva = session.getAttribute("iva").toString();

                                        if (lentidade != null) {

                                            Entidade entidade = lentidade.getEntidade();
                                            Banco banco = lentidade.getBanco();
                                            Pessoa pessoa = lentidade.getPessoa();

                                            lst = "hide";
                                            act = encryptUtils.encodeString("accao#actualizar-empresa&fi=" + entidade.getEntiId());
                                            vlBtn = "Actualizar Registo";
                                            lblReg = "Actualizar Registo";
                                            icnReg = "icon-pencil4";

                                            nm = encryptUtils.decodeString(entidade.getEntiNome());
                                            nt = encryptUtils.decodeString(entidade.getEntiNuit());
                                            mail = encryptUtils.decodeString(entidade.getEntiEmail());
                                            web = encryptUtils.decodeString(entidade.getEntiDominio());
                                            cnt = encryptUtils.decodeString(entidade.getEntiContactos1());
                                            cnt2 = encryptUtils.decodeString(entidade.getEntiContactos2());
                                            cnt3 = encryptUtils.decodeString(entidade.getEntiContactos3());
                                            end = encryptUtils.decodeString(entidade.getEntiEndereco());
                                            dist = encryptUtils.decodeString(entidade.getEntiDistrito());
                                            del = encryptUtils.decodeString(entidade.getEntiDelegacao());
                                            prov = encryptUtils.decodeString(entidade.getEntiProvincia());
                                            idn = encryptUtils.decodeString(entidade.getEntiLicenca());
                                            sgl = encryptUtils.decodeString(entidade.getEntiSigla());

                                            if (entidade.getEntiDataInicioAssitencia() != null) {
                                                dteI = sdf.format(entidade.getEntiDataInicioAssitencia().toGregorianCalendar().getTime());
                                            }

                                            if (entidade.getEntiDataFinalAssistencia() != null) {
                                                dteF = sdf.format(entidade.getEntiDataFinalAssistencia().toGregorianCalendar().getTime());
                                            }

                                            pact = encryptUtils.decodeString(pessoa.getPessActividade());
                                            papel = encryptUtils.decodeString(pessoa.getPessApelido());
                                            pnom = encryptUtils.decodeString(pessoa.getPessNome());
                                            pmail = encryptUtils.decodeString(pessoa.getPessEmail());

                                            bnom = encryptUtils.decodeString(banco.getBncNome());
                                            bnib = encryptUtils.decodeString(banco.getBncNib());
                                            bcont = encryptUtils.decodeString(banco.getBncConta());
                                            bmoe = encryptUtils.decodeString(banco.getBncMoeda());

                                            iva = entidade.getEntiIva() + "";

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
                                        <form class="form-horizontal"   method="post" accept-charset="ISO-8859-1" action="RW1wcmVzYVNlcnZsZXQjRENJ?<%=act%>">
                                            <div class="panel panel-flat">
                                                <div class="panel-heading">
                                                    <h6 class="panel-title text-bold text-uppercase">Informe os dados da empresa</h6>
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
                                                                <legend class="text-semibold"><i class="icon-office position-left"></i> Dados da Empresa</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Descrição:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-9">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Descrição da empresa ..." class="form-control" name="descricao" value="<%=nm%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>

                                                                            <div class="col-md-3">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Sigla ..." class="form-control"  name="sigla" value="<%=sgl%>">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Identificação:</label>
                                                                    <div class="col-lg-9">

                                                                        <div class="row">
                                                                            <div class="col-md-7">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Nº da licença" class="form-control"  name="identificacao" value="<%=idn%>">

                                                                                </div>
                                                                            </div>

                                                                            <div class="col-md-5">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="number" placeholder="NUIT" class="form-control" name="nuit" value="<%=nt%>" required="">
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
                                                                <legend class="text-semibold"><i class="icon-calendar52 position-left"></i> LICENÇA</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Inicio - Fim:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <input type="text" placeholder="Data de inicio ..." class="form-control mb-15  daterange-single" name="dataInicioAssitencia">
                                                                            </div>
                                                                            <div class="col-md-6">
                                                                                <input type="text" placeholder="Data de fim ..." class="form-control mb-15  daterange-single" name="dataFimAssistencia">
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>


                                                            </fieldset>

                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-home5 position-left"></i> ENDEREÇO</legend>


                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Localização:</label>


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



                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-envelop5 position-left"></i> Contacto Electrónico</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Mail:</label>
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

                                                        <div class="col-md-6">

                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-address-book position-left"></i> Contacto Telefónico</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Contacto:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">

                                                                                <div class="form-group has-feedback has-feedback-right">
                                                                                    <input type="text" placeholder="Telefone" class="form-control mb-15" name="contacto" value="<%=cnt%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>

                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <input type="text" placeholder="Fax" class="form-control mb-15" name="fax" value="<%=cnt3%>">
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold"></label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">

                                                                            <div class="col-md-6">
                                                                                <input type="text" placeholder="Celular" class="form-control" name="celular" value="<%=cnt2%>">
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                            </fieldset>


                                                            <fieldset>
                                                                <legend class="text-semibold"><i class="icon-reading position-left"></i> PESSOA DE CONTACTO</legend>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Dados pessoais:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Nome ..." class="form-control" name="nomePessoaContacto" value="<%=pnom%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Apelido ..." class="form-control"  name="apelidoPessoaContacto" value="<%=papel%>">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold"></label>
                                                                    <div class="col-lg-9">

                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="email" placeholder="Endereço electrónico" class="form-control"  name="emailPessoaContacto" value="<%=pmail%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Actividade" class="form-control" name="actividadePessoaContacto" value="<%=pact%>" required="">
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
                                                                <legend class="text-semibold"><i class="icon-home5 position-left"></i> DADOS BANCARIOS</legend>
                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Detalhes Bancarios:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">


                                                                                    <select   data-placeholder="Selecione um banco" class="select" name="nomeBanco" required="">
                                                                                        <option></option>

                                                                                        <%
                                                                                            String bancos[] = {"Millennium Bim", "BCI", "Barclays", "FNB", "Standard Bank", "Moza Banco", "BancABC", "Letshego", "Banco Terra", "Banco Mais", "BNI", "Banco Único"};

                                                                                            for (String s : bancos) {
                                                                                                String sel = "";

                                                                                                if (bnom.equals(s)) {
                                                                                                    sel = "selected";
                                                                                                }
                                                                                        %>
                                                                                        <option value ="<%=s%>" <%=sel%>><%=s%></option>
                                                                                        <%
                                                                                            }
                                                                                        %>
                                                                                    </select>    

                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>


                                                                                </div>
                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="NIB da conta ..." class="form-control"  name="nibBanco" value="<%=bnib%>">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold"></label>
                                                                    <div class="col-lg-9">

                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="text" placeholder="Conta Bancaria ..." class="form-control"  name="contaBanco" value="<%=bcont%>" required="">
                                                                                    <div class="form-control-feedback">
                                                                                        <i class="icon-regexp2 text-danger"></i>
                                                                                    </div>
                                                                                </div>
                                                                            </div>

                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <select   data-placeholder="Selecione uma moeda" class="select" name="moedaBanco" required="">
                                                                                        <option></option>

                                                                                        <%
                                                                                            String moedas[] = {"MT", "ZAR", "USD", "EUR"};

                                                                                            for (String s : moedas) {
                                                                                                String sel = "";

                                                                                                if (bmoe.equals(s)) {
                                                                                                    sel = "selected";
                                                                                                }
                                                                                        %>
                                                                                        <option value ="<%=s%>" <%=sel%>><%=s%></option>
                                                                                        <%
                                                                                            }
                                                                                        %>
                                                                                    </select> 

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
                                                                <legend class="text-semibold"><i class="icon-percent position-left"></i> TAXA DO IVA</legend>
                                                                <div class="form-group">
                                                                    <label class="col-lg-3 control-label text-bold">Defina a taxa do iva:</label>
                                                                    <div class="col-lg-9">
                                                                        <div class="row">
                                                                            <div class="col-md-6">
                                                                                <div class="form-group has-feedback has-feedback-right">

                                                                                    <input type="number" placeholder="Taxa do iva ..." class="form-control"  name="iva" value="<%=iva%>">
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

                                                    </div>


                                                    <div class="text-left">
                                                        <i class="icon-regexp2 text-danger"></i> -  <span class="text-semibold text-muted">Campos de preenchimento obrigatório</span>
                                                    </div>

                                                    <div class="text-right">
                                                        <%
                                                            if (lentidade != null) {
                                                                String actC = encryptUtils.encodeString("accao#cancelar-edicao");
                                                        %>
                                                        <a href="RW1wcmVzYVNlcnZsZXQjRENJ?<%=actC%>" class="btn bg-danger-400 btn-labeled-left ml-10"><i class="icon-cross2"></i> Cancelar edição</a>
                                                        <%
                                                            }
                                                        %>
                                                        <%
                                                            if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {
                                                        %>
                                                        <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase text-uppercase text-bold bg-orange-800"><%=vlBtn%> <i class="icon-arrow-right14 position-right"></i></button>

                                                        <%
                                                            }
                                                        %>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                        <!-- /2 columns form -->


                                    </div>

                                    <div class="tab-pane fade has-padding" id="tab-demo2">



                                        <div class="panel-body">
                                            <p>
                                                <a href="RW1wcmVzYVNlcnZsZXQjRENJ?YWNjYW8jaW1wcmltaXItZW1wcmVzYXM=" target="_blank" class="btn bg-orange-400 btn-labeled text-bold text-uppercase">
                                                    <b><i class="icon-printer2"></i></b>
                                                    Imprimir registos
                                                </a>
                                                <a href="RW1wcmVzYVNlcnZsZXQjRENJ?YWNjYW8jZW52aWFyLWVtcHJlc2Fz" class="btn bg-slate-800 btn-labeled text-bold text-uppercase">
                                                    <b><i class="icon-envelop5"></i></b>
                                                    Enviar cópia por e-mail
                                                </a>


                                            </p>

                                        </div>





                                        <!-- Basic responsive configuration -->
                                        <div class="panel panel-flat">
                                            <div class="panel-heading">
                                                <h6 class="panel-title text-bold text-uppercase">Lista das empresas</h6>
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
                                                        <th class = "text-bold text-uppercase">#</th>
                                                        <th class = "text-bold text-uppercase">Descrição</th>
                                                        <th class = "text-bold text-uppercase">Pessoa de contacto</th>
                                                        <th class = "text-bold text-uppercase">Contacto</th>
                                                        <th class = "text-bold text-uppercase">Endereço</th>
                                                        <th class = "text-bold text-uppercase">Ass. Inicio</th>
                                                        <th class = "text-bold text-uppercase">Ass. Fim</th>
                                                        <th class = "text-bold text-uppercase">Situação</th>
                                                        <th class="text-bold text-uppercase text-danger-400">Opções</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <%
                                                        if (lentidades != null) {
                                                            for (LEntidade le : lentidades) {

                                                                Entidade e = le.getEntidade();

                                                                int id = e.getEntiId();

                                                                String s1 = encryptUtils.decodeString(e.getEntiNome());
                                                                String s2 = encryptUtils.decodeString(e.getEntiPessoaContacto());
                                                                String s3 = encryptUtils.decodeString(e.getEntiContactos1());
                                                                String s4 = encryptUtils.decodeString(e.getEntiEndereco());
                                                                String s5 = "---";
                                                                String s6 = "---";
                                                                String s7 = "---";

                                                                int diasTrial = -1;
                                                                String lbl = "bg-grey-600";

                                                                if (e.getEntiDataInicioAssitencia() != null) {
                                                                    s5 = sdf2.format(e.getEntiDataInicioAssitencia().toGregorianCalendar().getTime());

                                                                }
                                                                if (e.getEntiDataFinalAssistencia() != null) {

                                                                    Date dtaProx = e.getEntiDataFinalAssistencia().toGregorianCalendar().getTime();
                                                                    Date dtaHoje = new Date();
                                                                    diasTrial = Days.daysBetween(new DateTime(dtaHoje), new DateTime(dtaProx)).getDays();

                                                                    s7 = diasTrial + " dias restantes";
                                                                    if (diasTrial >= 6 && diasTrial < 15) {
                                                                        lbl = "bg-orange-600";
                                                                    }

                                                                    if (diasTrial >= 0 && diasTrial < 6) {
                                                                        lbl = "bg-danger-600";
                                                                    }

                                                                    if (diasTrial > 15) {
                                                                        lbl = "bg-success-600";
                                                                    }

                                                                    if (diasTrial == 1) {
                                                                        s7 = diasTrial + " dia restante";
                                                                    }

                                                                    if (diasTrial < 0) {
                                                                        s7 = "Suspenso á " + (diasTrial * -1) + " dias";
                                                                    }

                                                                    s6 = sdf2.format(e.getEntiDataFinalAssistencia().toGregorianCalendar().getTime());
                                                                }

                                                                String actE = encryptUtils.encodeString("accao#editar-empresa&ei=" + id);
                                                                String actR = encryptUtils.encodeString("accao#remover-empresa&ei=" + id);
                                                                String actI = encryptUtils.encodeString("accao#memoria-descritiva&ei=" + id);

                                                    %>
                                                    <tr>
                                                        <td><a href="#"><%=id%></a></td>
                                                        <td class="text-bold"><%=s1%></td>
                                                        <td><%=s2%></td>
                                                        <td><a href="#"><%=s3%></a></td>
                                                        <td><%=s4%></td>
                                                        <td><%=s5%></td>
                                                        <td><%=s6%></td>
                                                        <td><span class="label <%=lbl%>"><%=s7%></span></td>
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

                                                                    <li><a href="RW1wcmVzYVNlcnZsZXQjRENJ?<%=actI%>" target="_blank"><i class="icon-stack4"></i> Memó. Descritiva</a></li>
                                                                        <%
                                                                            if (usuario.getTipoUsuariotipu().getTipuDescricao().equals("Super Administrador")) {
                                                                        %>

                                                                    <li class="divider"></li>
                                                                    <li><a href="RW1wcmVzYVNlcnZsZXQjRENJ?<%=actE%>"><i class="icon-database-edit2 text-blue-800"></i> Editar registo</a></li>

                                                                    <li><a href="#" data-toggle="modal" data-target="#modal_rem_<%=id%>"><i class="icon-cancel-circle2 text-danger-800"></i>Remover registo</a></li>

                                                                    <%
                                                                        }
                                                                    %>
                                                                </ul>
                                                            </div>


                                                            <!-- Danger modal -->
                                                            <div id="modal_rem_<%=id%>" class="modal fade  text-center">
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
                                                                            <button type="button" class="btn text-uppercase text-bold btn-link" data-dismiss="modal">Cancelar</button>

                                                                            <a href="RW1wcmVzYVNlcnZsZXQjRENJ?<%=actR%>" class="btn btn-danger text-bold text-uppercase">Sim, confirmo !</a>

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
