<%-- 
    Document   : student-register
    Created on : Oct 6, 2019, 10:38:54 PM
    Author     : hamil
--%>

<%@page import="com.dciapps.webclient.Pessoa"%>
<%@page import="com.dciapps.webclient.Aluno"%>
<%@page import="com.dciapps.webclient.Turma"%>
<%@page import="com.dciapps.webclient.Nacionalidade"%>
<%@page import="java.util.List"%>
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
        <title>SEGIA - Pré-Inscrição</title>

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
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900" rel="stylesheet" type="text/css">
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
        <script type="text/javascript" src="assets/js/pages/login.js"></script>
        <!-- /theme JS files -->

        <%

            EncryptUtils encryptUtils = new EncryptUtils();

            String ano = "";

            List<Turma> turmas = null;

            String msgErro = "";
            String alerta = "";
            String lbls = "";

            Aluno aluno = null;

            turmas = (List<Turma>) session.getAttribute("turmas");

            if (session.getAttribute("msgErro") != null) {
                msgErro = session.getAttribute("msgErro").toString();
            }

            if (session.getAttribute("alerta") != null) {
                alerta = session.getAttribute("alerta").toString();
            }

            if (session.getAttribute("ano") != null) {
                ano = session.getAttribute("ano").toString();
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


    <body oncontextmenu="return false"  >


        <!-- Main navbar -->
        <div class="navbar navbar-inverse">
            <div class="navbar-header">
                <h6 class="text-semibold class text-uppercase" style="margin-left: 2em;"> Sistema Electrónico de Gestão de Informação Académica </h6>

                <ul class="nav navbar-nav visible-xs-block">
                    <li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
                    <li><a class="sidebar-mobile-main-toggle"><i class="icon-paragraph-justify3"></i></a></li>
                </ul>
            </div>
        </div>
        <!-- /main navbar -->


        <!-- Page container -->
        <div class="page-container login-container">

            <!-- Page content -->
            <div class="page-content">

                <!-- Main content -->
                <div class="content-wrapper">




                    <div class = "row">

                        <div class = "col-md-12 col-md-offset-0">


                            <%
                                String lst = "";
                                String act = encryptUtils.encodeString("accao#registar-aluno-online");
                                String vlBtn = "Registar Pré-Inscrição";
                                String lblReg = "Novo Registo";
                                String icnReg = "icon-file-plus";
                                String nm = session.getAttribute("nome").toString();
                                String apl = session.getAttribute("apelido").toString();
                                String bi = session.getAttribute("bi").toString();
                                String nuit = session.getAttribute("nuit").toString();
                                String sex = session.getAttribute("sexo").toString();
                                String sM = "checked";
                                String sF = "";
                                String mail = session.getAttribute("email").toString();
                                String cnt = session.getAttribute("contacto").toString();
                                String prov = session.getAttribute("provincia").toString();
                                String quar = session.getAttribute("quarteirao").toString();
                                String casa = session.getAttribute("casa").toString();
                                String end = session.getAttribute("endereco").toString();
                                String doc = session.getAttribute("documento").toString();
                                String distr = session.getAttribute("distrito").toString();
                                String dNas = "";

                                String resp = session.getAttribute("responsavel").toString();
                                String cntResp = session.getAttribute("contactoResponsavel").toString();

                                String bS = "checked";
                                String bN = "";
                                String bI = "";

                                String dS = "";
                                String dN = "checked";

                                String niv = session.getAttribute("nivel").toString();
                                String ocup = session.getAttribute("ocupacao").toString();
                                String cat = session.getAttribute("categoria").toString();

                                String bos = "NORMAL";

                                String tB = "checked";
                                String tD = "";
                                String cH = "";

                                String con = "";

                                String cD = "";
                                String cB = "";
                                String fT = "";

                                if (aluno != null) {
                                    lst = "hide";
                                    act = encryptUtils.encodeString("accao#actualizar-aluno&fi=" + aluno.getAlunId());
                                    vlBtn = "Actualizar Registo";
                                    lblReg = "Actualizar Registo";
                                    icnReg = "icon-pencil4";

                                    niv = encryptUtils.decodeString(aluno.getAlunNivel());
                                    ocup = encryptUtils.decodeString(aluno.getPessoa().getPessActividade());
                                    cat = encryptUtils.decodeString(aluno.getAlunCategoria());

                                    Pessoa pessoa = aluno.getPessoa();

                                    nm = encryptUtils.decodeString(pessoa.getPessNome());
                                    apl = encryptUtils.decodeString(pessoa.getPessApelido());
                                    bi = encryptUtils.decodeString(pessoa.getPessBi());
                                    sex = encryptUtils.decodeString(pessoa.getPessSexo());
                                    mail = encryptUtils.decodeString(pessoa.getPessEmail());
                                    cnt = encryptUtils.decodeString(pessoa.getPessContacto());
                                    nuit = encryptUtils.decodeString(pessoa.getPessNuit());
                                    doc = encryptUtils.decodeString(pessoa.getPessDocumento());
                                    distr = encryptUtils.decodeString(pessoa.getPessDistrito());

                                    resp = encryptUtils.decodeString(pessoa.getPessNomePai());
                                    cntResp = encryptUtils.decodeString(pessoa.getPessNomeMae());

                                    prov = encryptUtils.decodeString(pessoa.getPessProvincia());
                                    quar = encryptUtils.decodeString(pessoa.getPessRua());
                                    casa = encryptUtils.decodeString(pessoa.getPessNumeroCasa());
                                    end = encryptUtils.decodeString(pessoa.getPessBairro());

                                    if (sex.equals("Feminino")) {
                                        sM = "";
                                        sF = "checked";
                                    }

                                    if (!aluno.isAlunDeficiente()) {

                                        dN = "checked";
                                        dS = "";
                                    }

                                    if (aluno.isAlunDeficiente()) {

                                        dN = "";
                                        dS = "checked";
                                    }

                                    bos = encryptUtils.decodeString(aluno.getAlunBolseiro());

                                    if (bos.equals("Bolseiro Parcial")) {
                                        bS = "";
                                        bI = "";
                                        bN = "checked";
                                    }

                                    if (bos.equals("Bolseiro Integral")) {
                                        bS = "";
                                        bI = "checked";
                                        bN = "";
                                    }

                                    if (mail.equals("N/D")) {
                                        mail = "";
                                    }

                                }

                            %>





                            <!-- 2 columns form -->
                            <form class="form-horizontal"   method="post" accept-charset="ISO-8859-1" action="QWx1bm9TZXJ2bGV0I0RDSQ==?<%=act%>">
                                <div class="panel panel-flat">
                                    <div class="panel-heading">
                                        <h6 class="panel-title text-uppercase text-bold text-bold text-uppercase">Informe os dados do aluno</h6>
                                        <div class="heading-elements">
                                            <ul class="icons-list">
                                                <li><a data-action="collapse"></a></li>
                                                <li><a data-action="reload"></a></li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="panel-body">


                                        <div class="row">

                                            <div class="text-center">
                                                <center>	<img src="http://localhost:8081/suc/images/app-icons/governo.png" alt="" class="img-responsive" style="width:50%; max-width: 120px;"></center>
                                                <h5 class="content-group-lg text-bold text-uppercase">Formulário de Pré-Inscrição <small class="display-block">Todos os campos são obrigatórios</small></h5>
                                            </div>




                                            <div class="col-md-6">
                                                <fieldset>
                                                    <legend class="text-semibold"><i class="icon-reading position-left"></i> Dados do aluno</legend>

                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Nome:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-12">
                                                                    <div class="form-group has-feedback has-feedback-right">

                                                                        <input type="text" placeholder="Nome" class="form-control" name="nomeCompleto" value="<%=nm + " " + apl%>" required="">
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
                                                                <div class="col-md-5">
                                                                    <select data-placeholder="Selecione o tipo" class="select" required="" name="documento">
                                                                        <option></option>
                                                                        <%
                                                                            String documentos[] = {"BI", "Passaporte", "DIRE", "Cédula pessoal", "Cartão de eleitor", "Carta de condução", "Outro"};

                                                                            for (String s : documentos) {

                                                                                String sel = "";

                                                                                if (s.equals(doc)) {
                                                                                    sel = "selected";
                                                                                }
                                                                        %>
                                                                        <option value="<%=s%>" <%=sel%>><%=s%></option> 
                                                                        <%
                                                                            }
                                                                        %>
                                                                    </select>
                                                                </div>

                                                                <div class="col-md-7">
                                                                    <div class="form-group has-feedback has-feedback-right">

                                                                        <input type="text" placeholder="BI/DIRE/Passaporte N.º" class="form-control" name="bi" value="<%=bi%>" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>


                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Validade Doc.:</label>
                                                        <div class="col-lg-9">

                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <input type="text" placeholder="Data de Validade" class="form-control mb-15  daterange-single" name="dataValidade">
                                                                </div>

                                                                <div class="col-md-6">
                                                                    <input type="text" placeholder="NUIT" class="form-control" name="nuit" value="<%=nuit%>">
                                                                </div>
                                                            </div>

                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Data Nascimento:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <div class="form-group has-feedback has-feedback-right">

                                                                        <input type="text" placeholder="Data de Nascimento" class="form-control mb-15  daterange-single" name="dataNascimento" value="<%=dNas%>" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Sexo:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">

                                                                <label class="radio-inline">
                                                                    <input type="radio" name="sexo" class="styled" <%=sM%> value="Masculino">
                                                                    Masculino
                                                                </label>

                                                                <label class="radio-inline">
                                                                    <input type="radio" name="sexo" class="styled" <%=sF%> value="Feminino">
                                                                    Feminino
                                                                </label>
                                                            </div>
                                                        </div>
                                                    </div>


                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Contacto:</label>
                                                        <div class="col-lg-9">

                                                            <div class="row">
                                                                <div class="col-md-7">
                                                                    <input type="email" placeholder="E-mail" class="form-control"name="email" value="<%=mail%>">
                                                                </div>

                                                                <div class="col-md-5">
                                                                    <div class="form-group has-feedback has-feedback-right">

                                                                        <input type="text" placeholder="Telefone/telemóvel:" class="form-control" name="contacto" value="<%=cnt%>" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Pai:</label>
                                                        <div class="col-lg-9">

                                                            <div class="row">
                                                                <div class="col-md-7">
                                                                    <div class="form-group has-feedback has-feedback-right">
                                                                        <input type="text" placeholder="Nome do Pai" class="form-control"name="nomePai" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="col-md-5">
                                                                    <div class="form-group has-feedback has-feedback-right">
                                                                        <input type="text" placeholder="Contacto do Pai" class="form-control" name="contactoPai" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <br>
                                                            <div class="row">
                                                                <div class="col-md-7">
                                                                    <input type="text" placeholder="Local Trabalho do Pai" class="form-control"name="localPai" required="">

                                                                </div>

                                                                <div class="col-md-5">
                                                                    <input type="text" placeholder="Profissão do Pai" class="form-control" name="profissaoPai" required="">
                                                                </div>
                                                            </div>


                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Mãe:</label>
                                                        <div class="col-lg-9">

                                                            <div class="row">
                                                                <div class="col-md-7">
                                                                    <div class="form-group has-feedback has-feedback-right">
                                                                        <input type="text" placeholder="Nome do Mãe" class="form-control"name="nomeMae" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="col-md-5">
                                                                    <div class="form-group has-feedback has-feedback-right">
                                                                        <input type="text" placeholder="Contacto da Mãe" class="form-control" name="contactoMae" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <br>
                                                            <div class="row">
                                                                <div class="col-md-7">
                                                                    <input type="text" placeholder="Local Trabalho da Mãe" class="form-control"name="localPai" required="">

                                                                </div>

                                                                <div class="col-md-5">
                                                                    <input type="text" placeholder="Profissão da Mãe" class="form-control" name="profissaoPai" required="">
                                                                </div>
                                                            </div>

                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Encarregado Educação:</label>
                                                        <div class="col-lg-9">

                                                            <div class="row">
                                                                <div class="col-md-7">
                                                                    <div class="form-group has-feedback has-feedback-right">
                                                                        <input type="text" placeholder="Nome do Encarregado Educação" class="form-control"name="responsavel" value="<%=resp%>" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>

                                                                <div class="col-md-5">
                                                                    <div class="form-group has-feedback has-feedback-right">
                                                                        <input type="text" placeholder="Contacto " class="form-control" name="contactoResponsavel" value="<%=cntResp%>" required="">
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
                                                    <legend class="text-semibold"><i class="icon-home5 position-left"></i> ENDEREÇO</legend>


                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Localização:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <select id="make" data-placeholder="Selecione a provincia" class="select" name="provincia" required="">
                                                                        <option></option>
                                                                        <%
                                                                            String provincias[] = {"Cidade de Maputo", "Maputo", "Gaza", "Inhambane", "Manica", "Niassa",
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

                                                                                if (distr.equals(s)) {
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

                                                                        <input type="text" placeholder="Bairro" class="form-control" name="endereco" value="<%=end%>" required="">
                                                                        <div class="form-control-feedback">
                                                                            <i class="icon-regexp2 text-danger"></i>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <br>
                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <input type="text" placeholder="Quarteirão/Talhão" class="form-control mb-15"  name="quarteirao" value="<%=quar%>">
                                                                </div>
                                                                <div class="col-md-6">
                                                                    <input type="text" placeholder="Nº da Casa" class="form-control"  name="casa" value="<%=casa%>">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </fieldset>

                                                <fieldset>
                                                    <legend class="text-semibold"><i class="icon-accessibility position-left"></i> Informação adicional</legend>


                                                    <div class="form-group">
                                                        <label class="col-lg-7 control-label text-bold">Órfão/Vulnerável/Portador de Doença:</label>
                                                        <div class="col-lg-4">
                                                            <div class="row">

                                                                <label class="radio-inline">
                                                                    <input type="radio" name="deficiencia" class="styled" <%=dS%> value="Sim">
                                                                    Sim
                                                                </label>

                                                                <label class="radio-inline">
                                                                    <input type="radio" name="deficiencia" class="styled" <%=dN%> value="Não">
                                                                    Não
                                                                </label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </fieldset>

                                                <fieldset>
                                                    <legend class="text-semibold"><i class="icon-book position-left"></i> Habilitações</legend>


                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Formação:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-8">
                                                                    <div class="mb-15">
                                                                        <select data-placeholder="Selecione a formação" class="select" required="" name="nivel">
                                                                            <option></option>
                                                                            <%
                                                                                String niveis[] = {"Ensino básico", "Ensino médio", "Ensino técnico", "Ensino técnico superior", "Ensino superior"};

                                                                                for (String s : niveis) {

                                                                                    String sel = "";

                                                                                    if (s.equals(niv)) {
                                                                                        sel = "selected";
                                                                                    }
                                                                            %>
                                                                            <option value="<%=s%>" <%=sel%>><%=s%></option> 
                                                                            <%
                                                                                }
                                                                            %>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>


                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Ocupação:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-8">
                                                                    <div class="mb-15">
                                                                        <select data-placeholder="Selecione a ocupação" class="select" required="" name="ocupacao">
                                                                            <option></option>
                                                                            <%
                                                                                String ocupacoes[] = {"Estudante", "Funcionário Público", "Funcionário Privado", "Conta Própria", "Desempregado"};

                                                                                for (String s : ocupacoes) {

                                                                                    String sel = "";

                                                                                    if (s.equals(ocup)) {
                                                                                        sel = "selected";
                                                                                    }
                                                                            %>
                                                                            <option value="<%=s%>" <%=sel%>><%=s%></option> 
                                                                            <%
                                                                                }
                                                                            %>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>


                                                </fieldset>



                                                <fieldset>
                                                    <legend class="text-semibold"><i class="icon-clipboard2 position-left"></i> Inscrição</legend>

                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold"> <i class="icon-regexp2 text-danger"></i> Turma & Horário:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-12">
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

                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Categoria:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-10">
                                                                    <div class="mb-15">
                                                                        <select data-placeholder="Selecione a categoria" class="select" required="" name="categoria">
                                                                            <option></option>
                                                                            <%
                                                                                String categorias[] = {"NOVO INGRESSO", "CONTINUANTE", "REPETENTE", "ASSISTENTE", "TRANSFERIDO"};

                                                                                for (String s : categorias) {

                                                                                    String sel = "";

                                                                                    if (s.equals(cat)) {
                                                                                        sel = "selected";
                                                                                    }
                                                                            %>
                                                                            <option value="<%=s%>" <%=sel%>><%=s%></option> 
                                                                            <%
                                                                                }
                                                                            %>
                                                                        </select>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-lg-3 control-label text-bold">Condição Matrícula:</label>
                                                        <div class="col-lg-9">
                                                            <div class="row">
                                                                <div class="col-md-10">
                                                                    <div class="mb-15">
                                                                        <select data-placeholder="Selecione a condição da matrícula" class="select" required="" name="condicao">
                                                                            <option></option>
                                                                            <%
                                                                                String condicoes[] = {"GLOBAL", "LETRAS", "CIÊNCIAS", "TÉCNICO"};

                                                                                for (String s : condicoes) {

                                                                                    String sel = "";

                                                                                    if (s.equals(con)) {
                                                                                        sel = "selected";
                                                                                    }
                                                                            %>
                                                                            <option value="<%=s%>" <%=sel%>><%=s%></option> 
                                                                            <%
                                                                                }
                                                                            %>
                                                                        </select>
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
                                                if (aluno != null) {
                                                    String actC = encryptUtils.encodeString("accao#cancelar-edicao");
                                            %>
                                            <a href="QWx1bm9TZXJ2bGV0I0RDSQ==?<%=actC%>" class="btn text-bold text-uppercase bg-danger-400 btn-labeled-left ml-10"><i class="icon-cross2"></i> Cancelar edição</a>
                                            <%
                                                }
                                            %>
                                            <button type="submit" onclick="this.disabled = 'disabled'; this.form.submit();" class="btn text-bold text-uppercase  bg-slate-800"><%=vlBtn%> <i class="icon-arrow-right14 position-right"></i></button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <!-- /2 columns form -->
                        </div>
                    </div>	


                </div>
                <!-- /main content -->

            </div>
            <!-- /page content -->

            <!-- Footer -->
            <div class="footer text-bold">
                &copy; <%=ano%>. <a href="#" class="text-bold">SEGIA</a>. Todos os direitos reservados
            </div>
            <!-- /footer -->

        </div>
        <!-- /page container -->




        <script>
            $(function () {

                var dist = '<%=distr%>';
                //setup arrays
                var cars = {
                    "Cidade de Maputo": ['KaMpfumo', 'Nlhamankulu', 'KaMaxaquene', 'KaMavota', 'KaMubukwana', 'KaTembe', 'KaNyaka'],
                    "Maputo": ['Boane', 'Cidade da Matola', 'Magude', 'Marracuene', 'Matutuíne', 'Moamba', 'Namaacha'],
                    "Gaza": ['Bilene - Macia', 'Chibuto', 'Chicualacuala', 'Chigubo', 'Chòkwé', 'Cidade de Xai-Xai', 'Guijá', 'Mabalane', 'Manjacaze - Dingane', 'Xai-Xai Distrito'],
                    "Inhambane": ['Cidade de Maxixe', 'Cidade de Inhambane', 'Funhalouro', 'Govuro', 'Homoíne', 'Inharrime', 'Inhassoro', 'Jangamo', 'Mabote', 'Massinga', 'Morrumbene', 'Panda', 'Vilankulo', 'Zavala'],
                    "Manica": ['Barué', 'Cidade de Chimoio', 'Gondola', 'Guro', 'Muchaze', 'Macossa', 'Manica', 'Mossurize', 'Sussundega', 'Tambara'],
                    "Nampula": ['Angoche', 'Cidade de Nampula', 'Ilha de Moçambique', 'Lalaua', 'Malema', 'Meconta', 'Mecubúri', 'Memba', 'Mongicual', 'Mogovolas', 'Moma', 'Mossuril', 'Muecate', 'Murrupula', 'Nacala - Porto', 'Nacala - Velha', 'Nacarôa', 'Namapa - Eráti', 'Nampula - Distrito', 'Ribaué'],
                    "Niassa": ['Chimbonila', 'Cuamba', 'Lago', 'Lichinga', 'Majune', 'Mandimba', 'Marrupa', 'Maúa', 'Mavago', 'Mecanhelas', 'Mecula', 'Metarica', 'Muembe', 'Ngauma', 'Nipepe', 'Sanga'],
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
