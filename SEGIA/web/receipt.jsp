<%-- 
    Document   :  -receipt
    Created on : Feb 11, 2017, 7:30:25 PM
    Author     : HJC2K8
--%>

<%@page import="com.dciapps.webclient.Cliente"%>
<%@page import="com.dciapps.webclient.Recibo"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.dciapps.webclient.Fornecedor"%>
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
        <title>SEGIA -  Recibos</title>

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
            DecimalFormat df = new DecimalFormat("#,###,##0.00");
            EncryptUtils encryptUtils = new EncryptUtils();

            ModulosUsuario mARKET = null;
            List<Recibo> recibos = null;
            String dataSelecionada = "";
            String periodo = "";

            String msgErro = "";
            String alerta = "";

            if (usuario != null) {

                nome = encryptUtils.decodeString(usuario.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(usuario.getPessoapess().getPessApelido());
                fotoPerfil = usuario.getUsuaFotoperfil();
                cargo = usuario.getTipoUsuariotipu().getTipuDescricao();

                mARKET = (ModulosUsuario) session.getAttribute("modulosUsuarioLogin");

                msgErro = session.getAttribute("msgErro").toString();
                alerta = session.getAttribute("alerta").toString();

                dataSelecionada = session.getAttribute("dataSelecionada").toString();
                periodo = session.getAttribute("periodo").toString();

                recibos = (List<Recibo>) session.getAttribute("recibos");

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
                    <div class="sidebar-fixed">
                        <div class="sidebar-content">






                            <!-- Main navigation -->
                            <div class="sidebar-category sidebar-category-visible">
                                <div class="category-title h6">
                                    <span class="text-bold">Navegação Principal</span>
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
                                        <li><a href="VXN1YXJpb1NlcnZsZXQjRENJ?YWNjYW8jZ28tYmFjaw=="><i class="icon-home4"></i> <span>Dashboard</span></a></li>

                                        <%
                                            if (mARKET.isMuiClientes()) {
                                        %>
                                        <!-- Clientes -->
                                        <li><a href="Q2xpZW50ZVNlcnZsZXQjRENJ?YWNjYW8jY2xpZW50ZXMm"><i class="icon-users2"></i> <span class="text-uppercase">Clientes</span></a></li>
                                        <!-- /clientes -->
                                        <%
                                            }
                                        %>

                                        <%
                                            if (mARKET.isMuiProdutos()) {
                                        %>
                                        <!-- Serviços -->
                                        <li><a href="U2Vydmljb1NlcnZsZXQjRENJ?YWNjYW8jaXRlbnM="><i class="icon-stack"></i> <span class="text-uppercase">Serviços</span></a></li>
                                        <!-- /serviços -->
                                        <%
                                            }
                                        %>


                                        <%
                                            if (mARKET.isMuiVendas()) {
                                        %>
                                        <!-- Vendas -->
                                        <li class="active">
                                            <a href="#"><i class="icon-calculator"></i> <span class="text-bold text-uppercase">Vendas</span></a>
                                            <ul>
                                                <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jdmVuZGFz"><i class="icon-plus-circle2"></i> Venda <span class="label label-danger">Nova</span></a></li>
                                                <li class="navigation-divider"></li>

                                                <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jZW1pdGlyLWZhY3R1cmE="><i class="icon-checkmark-circle"></i> Emitir Recibo</a></li>
                                                <li class="active"><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jcmVjaWJvcw=="><i class="icon-file-presentation2"></i> Recibos</a></li>
                                                <li class="navigation-divider"></li>
                                                <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jZmFjdHVyYXMmY3JpdGVyaW89UHLDsy1Gb3JtYXM="><i class="icon-file-spreadsheet"></i> Pró-Formas</a></li>
                                                <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jZmFjdHVyYXMmY3JpdGVyaW89RW1pdGlkYXM="><i class="icon-cash4"></i> Facturas</a></li>
                                                <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jZmFjdHVyYXMmY3JpdGVyaW89VmVuZGFzIMOgIERpbmhlcmlv"><i class="icon-coins"></i> Vendas à Dinheiro</a></li>
                                                <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jZmFjdHVyYXMmY3JpdGVyaW89Tm90YXMgZGUgQ3LDqWRpdG8="><i class="icon-credit-card2"></i> Notas de Crédito</a></li>
                                                <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jZmFjdHVyYXMmY3JpdGVyaW89Tm90YXMgZGUgRMOpYml0bw=="><i class="icon-upload"></i> Notas de Débito</a></li>
                                            </ul>
                                        </li>
                                        <!-- /vendas -->
                                        <%
                                            }
                                        %>


                                        <%
                                            if (mARKET.isMuiEstatisticas()) {
                                        %>
                                        <li class="navigation-header"><span>Relatórios</span> <i class="icon-calculator2" title="Relatórios"></i></li>


                                        <!-- Estatisticas -->

                                        <li> <a href="RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k=?YWNjYW8jZXh0cmFjdG8tZ2VyYWw="><i class="icon-statistics"></i> <span class="text-bold text-uppercase">Extracto Geral</span></a> </li>

                                        <li>
                                            <a href="#"><i class="icon-user"></i> <span class="text-bold text-uppercase">Relatórios do Cliente</span></a>
                                            <ul>
                                                <li> <a href="RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k=?YWNjYW8jZXh0cmFjdG8tY2xpZW50ZQ=="><i class=" icon-stats-growth2"></i> <span> Conta Corrente</span></a></li>
                                                <li><a href="RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k=?YWNjYW8ja2FyZGV4"> <i class="icon-stairs"></i> <span> Ficha Kardex</span></a></li>
                                                <li> <a href="RXN0YXRpc3RpY2FzU2VydmxldCNEQ0k=?YWNjYW8jYW5hbGlzZS1hbnRpZ3VpZGFkZQ=="><i class="icon-hour-glass2"></i> <span>Análise da antiguidade</span></a> </li>
                                            </ul>
                                        </li>
                                        <!-- /estatisticas -->
                                        <%
                                            }
                                        %>

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
                                <li class="active"><a href="#settings" data-toggle="tab" class="text-bold text-uppercase"><i class="icon-file-presentation2 position-left"></i> Recibos</a></li>
                            </ul>

                        </div>
                    </div>
                    <!-- /toolbar -->




                    <div class = "row">

                        <div class = "col-md-12 col-md-offset-0">
                            <!-- Vertical form options -->
                            <div class="col-md-3">

                                <!-- Basic layout-->
                                <form method="post" action="VmVuZGFTZXJ2bGV0I0RDSQ==?YWNjYW8jcmVjaWJvcw==">
                                    <div class="panel panel-flat">
                                        <div class="panel-heading">
                                            <h6 class="panel-title text-bold text-uppercase">Selecione o Periodo</h6>
                                            <div class="heading-elements">
                                                <ul class="icons-list">
                                                    <li><a data-action="collapse"></a></li>
                                                    <li><a data-action="reload"></a></li>

                                                </ul>
                                            </div>
                                        </div>

                                        <div class="panel-body">


                                            <div class="form-group">
                                                <label class="text-bold text-uppercase">Periodo (Data): </label>

                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="icon-calendar22"></i></span>
                                                    <input type="text" class="form-control daterange-weeknumbers" value="<%=dataSelecionada%>" name="dataPesquisa"> 
                                                </div>
                                            </div>


                                            <div class="text-right">
                                                <button type="submit" onclick="this.disabled='disabled'; this.form.submit();" class="btn text-bold text-uppercase text-uppercase text-bold bg-orange-800">Filtrar Resultados <i class="icon-filter3 position-right"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <!-- /basic layout -->

                            </div>

                            <div class="col-md-9">




                                <!-- Basic responsive configuration -->
                                <div class="panel panel-flat">
                                    <div class="panel-heading">
                                        <h6 class="panel-title text-bold text-uppercase">Extracto dos recibos <span class="text-danger">(<%=periodo%>)</span></h6>
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
                                                <th class = "text-bold text-uppercase">Data</th>
                                                <th class = "text-bold text-uppercase">Factura</th>
                                                <th class = "text-bold text-uppercase">Valor Total</th>
                                                <th class="text-bold text-uppercase text-danger-400">Opções</th>
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <%
                                                if (recibos != null) {

                                                    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
                                                    for (Recibo r : recibos) {

                                                        int id = r.getRecId();
                                                        String nrDoc = encryptUtils.decodeString(r.getRecReferencia());
                                                        String desc = encryptUtils.decodeString(r.getRecObservacoes());
                                                        String cat = encryptUtils.decodeString(r.getFactura().getFactCategorizacao());
                                                        String forn = encryptUtils.decodeString(r.getFactura().getFactReferencia());
                                                        String dte = sdf1.format(r.getRecData().toGregorianCalendar().getTime());
                                                        String val = df.format(r.getRecValor());
                                                        String nuit = "---";

                                                        if (r.getFactura().getVenda() != null) {
                                                            Cliente cliente = r.getFactura().getVenda().getCliente();

                                                            nuit = encryptUtils.decodeString(cliente.getPessoapess().getPessNome()) + " " + encryptUtils.decodeString(cliente.getPessoapess().getPessApelido());
                                                        }

                                                        String actRC = encryptUtils.encodeString("accao#imprimir-recibo&id=" + id);
                                                        String act = encryptUtils.encodeString("accao#remover-recibo&id=" + id);

                                                        String status = "";

                                                        if (r.getFactura().getFactStatus() != null) {
                                                            status = encryptUtils.decodeString(r.getFactura().getFactStatus());
                                                        }
                                            %>
                                            <tr>
                                                <td><a href="#"><%=nrDoc%></a></td>
                                                <td><%=dte%></td>
                                                <td><%=forn%></td>
                                                <td><%=val%></td>
                                                <td class="text-center">
                                                    <ul class="icons-list">
                                                        <li><a href="#" data-toggle="modal" data-target="#modal_<%=id%>"><i class="icon-eye"></i></a></li>

                                                        <%
                                                            if (!status.equals("Cancelado")) {
                                                        %>
                                                        <li><a href="VmVuZGFTZXJ2bGV0I0RDSQ==?<%=actRC%>" target="_blank"><i class="icon-printer4"></i></a></li>

                                                        <%
                                                            }
                                                            if (usuario.getTipoUsuariotipu().getTipuId() == 1) {
                                                        %>

                                                        <li><a href="#" data-toggle="modal" data-target="#modal_rem_<%=id%>"><i class="icon-cancel-circle2 text-danger-800"></i></a></li>



                                                        <!-- Danger modal -->
                                                        <div id="modal_rem_<%=id%>" class="modal fade">
                                                            <div class="modal-dialog">
                                                                <div class="modal-content">
                                                                    <div class="modal-header">
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                        <h6 class="modal-title text-semibold">Confirma a remoção do recibo com a referência #<%=id%> ?</h6>
                                                                    </div>
                                                                    <div class="modal-body">
                                                                        <h6 class="text-bold text-danger" ><i class="icon-question6 text-danger" style="font-size: 100px"></i></h6>

                                                                    </div>

                                                                    <div class="modal-footer">
                                                                        <button type="button" class="btn text-uppercase text-bold btn-link" data-dismiss="modal">Cancelar</button>

                                                                        <a href="VmVuZGFTZXJ2bGV0I0RDSQ==?<%=act%>" class="btn btn-danger text-bold text-uppercase">Sim, confirmo !</a>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <!-- /default modal -->       

                                                        <%
                                                        } else {
                                                        %>
                                                        <li><a href="#"><i class="icon-minus2 text-black"></i></a></li>
                                                                <%
                                                                    }
                                                                %>

                                                    </ul>
                                                </td>


                                                <!-- Modal with consult -->
                                        <div id="modal_<%=id%>" class="modal fade">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="panel-body no-padding-bottom">

                                                        <div class="row">
                                                            <div class="col-md-6 col-lg-9 content-group">
                                                                <span class="text-muted text-bold">Detalhes do Recibo:</span>
                                                                <ul class="list-condensed list-unstyled invoice-payment-details">
                                                                    <li>Nº Documento: <span class="text-semibold"><%=nrDoc%></span></li>
                                                                    <li>Categoria: <span class="text-semibold"><%=cat%></span></li>
                                                                    <li>Factura: <span class="text-semibold"><%=forn%></span></li>
                                                                    <li>Cliente: <span><%=nuit%></span></li>
                                                                    <li>Valor: <span><%=val%></span></li>
                                                                    <li>
                                                                        <div class="content-group">
                                                                            <h6><strong>Observações</strong></h6>
                                                                            <div class="mb-15 mt-15" style="text-align:justify;">
                                                                                <%=desc%>
                                                                            </div>
                                                                        </div>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="modal-footer">
                                                        <button type="button" class="btn text-uppercase text-bold btn-default" data-dismiss="modal">Fechar</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- /modal with consult -->
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
        <script type="text/javascript" src="assets/js/pages/picker_date.js"></script>

    </body>
</html>
