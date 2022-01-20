/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.servlet;

import com.dciapps.local.Recebimento;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Activo;
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Aproveitamento;
import com.dciapps.webclient.Caixa;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Factura;
import com.dciapps.webclient.Falta;
import com.dciapps.webclient.Fluxo;
import com.dciapps.webclient.GuiaRemessa;
import com.dciapps.webclient.ItemPedido;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Matricula;
import com.dciapps.webclient.MeioPagamento;
import com.dciapps.webclient.Pagamento;
import com.dciapps.webclient.Produto;
import com.dciapps.webclient.Recibo;
import com.dciapps.webclient.Referencia;
import com.dciapps.webclient.RegistoFecho;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ContabilidadeCtrl;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.DocumentoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.dciapps.webclientcontroler.UtilitariosCtrl;
import com.dciapps.webclientcontroler.VendasCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "TW9kdWxvU2VydmxldCNEQ0k=", urlPatterns = {"/TW9kdWxvU2VydmxldCNEQ0k="})
public class ModuloServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    UtilitariosCtrl utilitariosCtrl = new UtilitariosCtrl();
    ContabilidadeCtrl contabilidadeCtrl = new ContabilidadeCtrl();
    VendasCtrl vendasCtrl = new VendasCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    DocumentoCtrl documentoCtrl = new DocumentoCtrl();

    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

    Sender sender = new Sender();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    String codEscola;

    @SuppressWarnings("UseSpecificCatch")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            String url = encryptUtils.decodeString(request.getQueryString());
            System.out.println(url);

            StringTokenizer st1 = new StringTokenizer(url, "#");

            System.err.println(st1.nextToken());

            StringTokenizer st = new StringTokenizer(st1.nextToken(), "&");

            // Pega a accao
            String accao = st.nextToken();
            System.err.println(accao);

            request.getSession().setAttribute("alerta", "");
            request.getSession().setAttribute("msgErro", "");

            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            sistema = (Sistema) request.getSession().getAttribute("sistema");

            entidade = (Entidade) request.getSession().getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) request.getSession().getAttribute("entidade");
            }

            if (entidade == null) {
                entidade = (Entidade) request.getSession().getAttribute("entidade");
            }

            if (request.getSession().getAttribute("codEscola") != null) {
                codEscola = encryptUtils.encodeString(request.getSession().getAttribute("codEscola").toString());
            }

            switch (accao) {

                case "configuracao": {
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Acedeu a modulo de configuracao"));
                    response.sendRedirect("dashboard");
                }
                ;
                break;
                case "controlo-acesso": {
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Acedeu a modulo de controlo de acesso"));
                    response.sendRedirect("user-dashboard");
                }
                ;
                break;
                case "registo-academico": {
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Acedeu a modulo do registo academico"));

                    data.le_hora();
                    String ano = data.getAno();

                    Escola escola = ensinoCtrl.buscaEscola(codEscola);

                    AnoLectivo anoLectivo = (AnoLectivo) request.getSession().getAttribute("anoLectivoActivo");

                    List<Curso> cursos = (List<Curso>) request.getSession().getAttribute("cursos");

                    if (cursos == null) {
                        cursos = ensinoCtrl.listaCursos(entidade);
                        request.getSession().setAttribute("cursos", cursos);
                    }

                    List<Aproveitamento> aproveitamentos = ensinoCtrl.listaAproveitamentosAno(codEscola, encryptUtils.encodeString(ano));

                    Falta falta = ensinoCtrl.buscaFaltaAno(codEscola, encryptUtils.encodeString(ano));

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

                    int numMembrosH = 0;
                    int numMembrosF = 0;
                    int numReunioes = 0;

                    String lblFaltas_J = "0,0,0,0,0,0,0,0,0,0,0,0";
                    String lblFaltas_R = "0,0,0,0,0,0,0,0,0,0,0,0";

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

                    if (falta != null) {

                        lblFaltas_J = falta.getFaltJ01() + "," + falta.getFaltJ02() + "," + falta.getFaltJ03() + "," + falta.getFaltJ04() + ","
                                + falta.getFaltJ05() + "," + falta.getFaltJ06() + "," + falta.getFaltJ07() + "," + falta.getFaltJ08()
                                + "," + falta.getFaltJ09() + "," + falta.getFaltJ10() + "," + falta.getFaltJ11() + "," + falta.getFaltJ12();

                        lblFaltas_R = falta.getFalt01() + "," + falta.getFalt02() + "," + falta.getFalt03() + "," + falta.getFalt04() + ","
                                + falta.getFalt05() + "," + falta.getFalt06() + "," + falta.getFalt07() + "," + falta.getFalt08()
                                + "," + falta.getFalt09() + "," + falta.getFalt10() + "," + falta.getFalt11() + "," + falta.getFalt12();

                        numFaltas = falta.getFalt01() + falta.getFalt02() + falta.getFalt03() + falta.getFalt04()
                                + falta.getFalt05() + falta.getFalt06() + falta.getFalt07() + falta.getFalt08()
                                + falta.getFalt09() + falta.getFalt10() + falta.getFalt11() + falta.getFalt12();
                    }

                    String categorias[] = {"NOVO INGRESSO", "CONTINUANTE", "REPETENTE", "ASSISTENTE", "TRANSFERIDO"};

                    if (cursos != null) {
                        for (Curso c : cursos) {
                            lblClasses += "'" + encryptUtils.decodeString(c.getCursDescricao()) + "',";
                        }
                    }

                    boolean fTime = false;

                    List<Matricula> matriculasAno = null;
                    for (String categoria : categorias) {
                        int x = 1;
                        for (int i = Integer.parseInt(ano); i >= Integer.parseInt(ano) - 4; i--) {

                            if (!fTime) {
                                lblAnos += "'" + i + "',";
                            }

                            String values = "";

                            List<Matricula> matriculas = ensinoCtrl.listaMatriculasAno(codEscola, encryptUtils.encodeString(i + ""));

                            if (encryptUtils.encodeString(ano).equals(encryptUtils.encodeString(i + ""))) {
                                matriculasAno = matriculas;
                            }

                            if (cursos != null) {
                                for (Curso c : cursos) {
                                    values += getInscritosCategoriaAno(matriculas, c.getCursDescricao(), categoria) + ",";
                                }
                            }

                            if (!values.isEmpty()) {
                                values = values.substring(0, values.length() - 1);
                            }

                            switch (categoria) {
                                case "NOVO INGRESSO":
                                    lblNovos += i + ": [" + values + "],";
                                    break;
                                case "CONTINUANTE":
                                    lblContinuantes += i + ": [" + values + "],";
                                    break;
                                case "REPETENTE":
                                    lblRepetente += i + ": [" + values + "],";
                                    break;
                                case "ASSISTENTE":
                                    lblAssistentes += i + ": [" + values + "],";
                                    break;
                                case "TRANSFERIDO":
                                    lblTransferidos += i + ": [" + values + "],";
                                    break;

                            }

                            request.getSession().setAttribute("ano" + x, i);
                            x++;
                        }

                        fTime = true;
                    }

                    String aprovs[] = {"ADMITIDOS", "REPROVADOS", "EXCLUÍDOS", "DISPENSADOS"};
                    for (String categoria : aprovs) {

                        if (cursos != null) {
                            for (Curso c : cursos) {

                                int total = getTotalAproveitamentoClasse(aproveitamentos, c.getCursDescricao());
                                int num = getAproveitamentoCategoriaAno(aproveitamentos, c.getCursDescricao(), categoria);

                                int per = 0;

                                if (total != 0) {
                                    per = (int) Math.round((num * 100.0f) / total);
                                }

                                switch (categoria) {
                                    case "ADMITIDOS":
                                        lblAdmitidos += per + ",";
                                        lblAdmitidosPlaceHolder += (100 - per) + ",";
                                        numAprovacoes += num;
                                        break;
                                    case "REPROVADOS":
                                        lblReprovados += per + ",";
                                        lblReprovadosPlaceHolder += (100 - per) + ",";
                                        numReprovacoes += num;
                                        break;
                                    case "EXCLUÍDOS":
                                        lblExcluidos += per + ",";
                                        lblExcluidosPlaceHolder += (100 - per) + ",";
                                        break;
                                    case "DISPENSADOS":
                                        lblDispensados += per + ",";
                                        lblDispensadosPlaceHolder += (100 - per) + ",";
                                        break;

                                }

                            }
                        }

                    }

                    if (escola != null) {
                        numSalas = escola.getEscSalas();
                        numDocentes = escola.getEscDocentes();
                    }

                    List<Matricula> matriculas = matriculasAno;

                    if (matriculas != null) {

                        for (Matricula matricula : matriculas) {
                            if (matricula != null) {
                                numAlunos += matricula.getMatrHomens() + matricula.getMatrMulheres();
                                numAlunosNecessitados += matricula.getMatrVuneraveis();

                                numHomens += matricula.getMatrHomens();
                                numMulheres += matricula.getMatrMulheres();

                                numFaixa05 += matricula.getMatrFaixa05();
                                numFaixa610 += matricula.getMatrFaixa610();
                                numFaixa1115 += matricula.getMatrFaixa1115();
                                numFaixa1625 += matricula.getMatrFaixa1625();
                                numFaixa2635 += matricula.getMatrFaixa2635();
                                numFaixa35 += matricula.getMatrFaixa35();
                                numTurmas += matricula.getMatrTurmas();

                                if (escola != null) {
                                    numMembrosF += escola.getEscMembrosMulheres();
                                    numMembrosH += escola.getEscMembrosHomens();
                                }
                            }
                        }

                    }

                    if (escola != null) {
                        numMembrosF = escola.getEscMembrosMulheres();
                        numMembrosH = escola.getEscMembrosHomens();
                    }

                    if (!lblAnos.isEmpty()) {
                        lblAnos = lblAnos.substring(0, lblAnos.length() - 1);
                    }

                    if (!lblNovos.isEmpty()) {
                        lblNovos = lblNovos.substring(0, lblNovos.length() - 1);
                    }

                    if (!lblContinuantes.isEmpty()) {
                        lblContinuantes = lblContinuantes.substring(0, lblContinuantes.length() - 1);
                    }

                    if (!lblAssistentes.isEmpty()) {
                        lblAssistentes = lblAssistentes.substring(0, lblAssistentes.length() - 1);
                    }

                    if (!lblTransferidos.isEmpty()) {
                        lblTransferidos = lblTransferidos.substring(0, lblTransferidos.length() - 1);
                    }

                    if (!lblRepetente.isEmpty()) {
                        lblRepetente = lblRepetente.substring(0, lblRepetente.length() - 1);
                    }

                    if (!lblClasses.isEmpty()) {
                        lblClasses = lblClasses.substring(0, lblClasses.length() - 1);
                    }

                    if (!lblAdmitidos.isEmpty()) {
                        lblAdmitidos = lblAdmitidos.substring(0, lblAdmitidos.length() - 1);
                    }
                    if (!lblAdmitidosPlaceHolder.isEmpty()) {
                        lblAdmitidosPlaceHolder = lblAdmitidosPlaceHolder.substring(0, lblAdmitidosPlaceHolder.length() - 1);
                    }
                    if (!lblReprovados.isEmpty()) {
                        lblReprovados = lblReprovados.substring(0, lblReprovados.length() - 1);
                    }
                    if (!lblReprovadosPlaceHolder.isEmpty()) {
                        lblReprovadosPlaceHolder = lblReprovadosPlaceHolder.substring(0, lblReprovadosPlaceHolder.length() - 1);
                    }
                    if (!lblExcluidos.isEmpty()) {
                        lblExcluidos = lblExcluidos.substring(0, lblExcluidos.length() - 1);
                    }
                    if (!lblExcluidosPlaceHolder.isEmpty()) {
                        lblExcluidosPlaceHolder = lblExcluidosPlaceHolder.substring(0, lblExcluidosPlaceHolder.length() - 1);
                    }
                    if (!lblDispensados.isEmpty()) {
                        lblDispensados = lblDispensados.substring(0, lblDispensados.length() - 1);
                    }
                    if (!lblDispensadosPlaceHolder.isEmpty()) {
                        lblDispensadosPlaceHolder = lblDispensadosPlaceHolder.substring(0, lblDispensadosPlaceHolder.length() - 1);
                    }

                    request.getSession().setAttribute("lblAdmitidos", lblAdmitidos);
                    request.getSession().setAttribute("lblAdmitidosPlaceHolder", lblAdmitidosPlaceHolder);
                    request.getSession().setAttribute("lblReprovados", lblReprovados);
                    request.getSession().setAttribute("lblReprovadosPlaceHolder", lblReprovadosPlaceHolder);
                    request.getSession().setAttribute("lblExcluidos", lblExcluidos);
                    request.getSession().setAttribute("lblExcluidosPlaceHolder", lblExcluidosPlaceHolder);
                    request.getSession().setAttribute("lblDispensados", lblDispensados);
                    request.getSession().setAttribute("lblDispensadosPlaceHolder", lblDispensadosPlaceHolder);

                    request.getSession().setAttribute("numSalas", numSalas);
                    request.getSession().setAttribute("numAlunos", numAlunos);
                    request.getSession().setAttribute("numAlunosNecessitados", numAlunosNecessitados);
                    request.getSession().setAttribute("numDocentes", numDocentes);
                    request.getSession().setAttribute("numTurmas", numTurmas);

                    request.getSession().setAttribute("numHomens", numHomens);
                    request.getSession().setAttribute("numMulheres", numMulheres);

                    request.getSession().setAttribute("numFaixa05", numFaixa05);
                    request.getSession().setAttribute("numFaixa610", numFaixa610);
                    request.getSession().setAttribute("numFaixa1115", numFaixa1115);
                    request.getSession().setAttribute("numFaixa1625", numFaixa1625);
                    request.getSession().setAttribute("numFaixa2635", numFaixa2635);
                    request.getSession().setAttribute("numFaixa35", numFaixa35);

                    request.getSession().setAttribute("numAprovacoes", numAprovacoes);
                    request.getSession().setAttribute("numReprovacoes", numReprovacoes);
                    request.getSession().setAttribute("numFaltas", numFaltas);

                    request.getSession().setAttribute("lblFaltas_J", lblFaltas_J);
                    request.getSession().setAttribute("lblFaltas_R", lblFaltas_R);

                    request.getSession().setAttribute("lblAnos", lblAnos);
                    request.getSession().setAttribute("lblRepetente", lblRepetente);
                    request.getSession().setAttribute("lblTransferidos", lblTransferidos);
                    request.getSession().setAttribute("lblAssistentes", lblAssistentes);
                    request.getSession().setAttribute("lblContinuantes", lblContinuantes);
                    request.getSession().setAttribute("lblNovos", lblNovos);
                    request.getSession().setAttribute("lblClasses", lblClasses);

                    request.getSession().setAttribute("numMembrosH", numMembrosH);
                    request.getSession().setAttribute("numMembrosF", numMembrosF);
                    request.getSession().setAttribute("numReunioes", numReunioes);

                    request.getSession().setAttribute("escola", escola);

                    response.sendRedirect("school-dashboard");
                }
                ;
                break;

                case "tesouraria": {
                    data.le_hora();

                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosData(entidade, data.getAno());

                    List<Caixa> caixas = vendasCtrl.listaCaixas(entidade);
                    List<MeioPagamento> meiosPagamento = vendasCtrl.listaMeiosPagamento(entidade);
                    String categorias[] = {"1º Pagamento", "Mensalidade", "Taxa de Exame", "Recorrência"};

                    //******************  ÁNALISE DE RECEBIMENTO POR CATEGORIA ********************
                    String lblCategorias = "";
                    String cobradoCategorias = "";
                    String depositadoCategorias = "";
                    String desvioCategorias = "";

                    for (String s : categorias) {
                        lblCategorias += "'" + s + "',";

                        double cobrado = totalCobrancasCategoria(pagamentos, encryptUtils.encodeString(s));
                        double depositado = totalDepositosCategoria(pagamentos, encryptUtils.encodeString(s));

                        cobradoCategorias += cobrado + ",";
                        depositadoCategorias += depositado + ",";

                        int desvio = (int) Math.round(((cobrado - depositado) * 100.0f) / cobrado);

                        desvioCategorias += desvio + ",";

                    }

                    if (!lblCategorias.isEmpty()) {
                        lblCategorias = lblCategorias.substring(0, lblCategorias.length() - 1);
                    }

                    if (!cobradoCategorias.isEmpty()) {
                        cobradoCategorias = cobradoCategorias.substring(0, cobradoCategorias.length() - 1);
                    }

                    if (!depositadoCategorias.isEmpty()) {
                        depositadoCategorias = depositadoCategorias.substring(0, depositadoCategorias.length() - 1);
                    }

                    if (!desvioCategorias.isEmpty()) {
                        desvioCategorias = desvioCategorias.substring(0, desvioCategorias.length() - 1);
                    }

                    request.getSession().setAttribute("lblCategorias", lblCategorias);
                    request.getSession().setAttribute("cobradoCategorias", cobradoCategorias);
                    request.getSession().setAttribute("depositadoCategorias", depositadoCategorias);
                    request.getSession().setAttribute("desvioCategorias", desvioCategorias);
                    //************************* END ÁNALISE DE RECEBIMENTO POR CATEGORIA *************

                    //*************************  ÁNALISE DE RECEBIMENTO POR CAIXA *************
                    String lblCaixa = "";
                    String valoresCaixa = "";
                    double totalCaixa = 0;
                    int num = 0;
                    double mediaCaixa = 0;

                    String meios[] = {"Transferência Bancaria", "Talão de Depósito", "Cheque"};

                    // if (meios != null) {
                    num = meios.length;

                    for (String cx : meios) {

                        lblCaixa += "'" + cx + "',";

                        double valor = totalCobrancasMeio(pagamentos, encryptUtils.encodeString(cx));

                        totalCaixa += valor;

                        valoresCaixa += "{value: " + valor + ", name: '" + cx + "'},";

                    }
                    //  }

                    if (!lblCaixa.isEmpty()) {
                        lblCaixa = lblCaixa.substring(0, lblCaixa.length() - 1);
                    }

                    if (!valoresCaixa.isEmpty()) {
                        valoresCaixa = valoresCaixa.substring(0, valoresCaixa.length() - 1);
                    }

                    if (num != 0) {
                        mediaCaixa = totalCaixa / num;
                    }

                    request.getSession().setAttribute("lblCaixa", lblCaixa);
                    request.getSession().setAttribute("valoresCaixa", valoresCaixa);
                    request.getSession().setAttribute("totalCaixa", totalCaixa);
                    request.getSession().setAttribute("mediaCaixa", mediaCaixa);

                    //************************* END ÁNALISE DE RECEBIMENTO POR CAIXA *************
                    //*************************  ÁNALISE DE RECEBIMENTO POR MEIOS DE PAGAMENTO *************
                    String lblMeiosPagamento = "";
                    String valoresMeiosPagamento = "";
                    List<Recebimento> recebimentos = new ArrayList();
                    double totalDepositos = 0;

                    double totalCobrancas = totalPagamentos(pagamentos);

                    // if (meiosPagamento != null) {
                    for (String mx : meios) {

                        lblMeiosPagamento += "'" + mx + "',";

                        double valorCobrado = totalCobrancasMeioPagamento(pagamentos, encryptUtils.encodeString(mx));
                        double valorDepositado = totalDepositosMeioPagamento(pagamentos, encryptUtils.encodeString(mx));

                        totalDepositos += valorDepositado;

                        valoresMeiosPagamento += "{value: " + valorCobrado + ", name: '" + mx + "'},";

                        double percentagem = Math.round((valorCobrado * 100.0f) / totalCobrancas);

                        Recebimento recebimento = new Recebimento();
                        recebimento.setMeio(mx);
                        recebimento.setPercentegem(percentagem);
                        recebimento.setValorCobrado(valorCobrado);
                        recebimento.setValorDepositado(valorDepositado);

                        recebimentos.add(recebimento);
                    }
                    // }

                    if (!lblMeiosPagamento.isEmpty()) {
                        lblMeiosPagamento = lblMeiosPagamento.substring(0, lblMeiosPagamento.length() - 1);
                    }

                    if (!valoresMeiosPagamento.isEmpty()) {
                        valoresMeiosPagamento = valoresMeiosPagamento.substring(0, valoresMeiosPagamento.length() - 1);
                    }

                    request.getSession().setAttribute("lblMeiosPagamento", lblMeiosPagamento);
                    request.getSession().setAttribute("valoresMeiosPagamento", valoresMeiosPagamento);
                    request.getSession().setAttribute("recebimentos", recebimentos);
                    request.getSession().setAttribute("totalDepositos", totalDepositos);
                    request.getSession().setAttribute("totalCobrancas", totalCobrancas);
                    request.getSession().setAttribute("maiorRecebimento", getMax(recebimentos));

                    //************************* END ÁNALISE DE RECEBIMENTO POR  MEIOS DE PAGAMENTO *************
                    response.sendRedirect("collection-dashboard");
                }
                ;
                break;

                case "avaliacao": {

                    data.le_hora();

                    String ano = data.getAno();

                    List<Curso> cursosRanking = ensinoCtrl.listaTopCursos(entidade);

                    List<Referencia> referencias = vendasCtrl.listaReferencias(codEscola);

                    int numEstudantes = 0;
                    int numDocentes = 0;
                    int numCursos = 0;
                    int numDisciplinas = 0;
                    int numTurmas = 0;

                    int numExclusoes = 0;
                    int numDispensas = 0;
                    int numAprovacoes = 0;
                    int numReprovacoes = 0;

                    Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(ano));

                    for (Referencia r : referencias) {
                        numEstudantes += r.getRefEstudante();
                        numDocentes += r.getRefDocente();
                        numCursos += r.getRefCurso();
                        numDisciplinas += r.getRefDisciplina();
                        numTurmas += r.getRefTurma();

                        numAprovacoes += r.getRefEstudanteAprovacoes();
                        numDispensas += r.getRefEstudanteDispensas();
                        numReprovacoes += r.getRefEstudanteReprovacoes();
                        numExclusoes += r.getRefEstudanteExclusoes();
                    }

                    int pAprovacoes = 0;
                    int pAprovacoesAno = 0;

                    if (numEstudantes != 0) {
                        pAprovacoes = (int) Math.round(((numAprovacoes) * 100.0f) / numEstudantes);
                    }

                    if (referencia != null) {
                        if (referencia.getRefEstudante() != 0) {
                            pAprovacoesAno = (int) Math.round(((referencia.getRefEstudanteAprovacoes()) * 100.0f) / referencia.getRefEstudante());
                        }
                    }

                    String lblAnalise = "{value: " + numAprovacoes + ", name: 'Aprovados (Exame)'},"
                            + "{value: " + numDispensas + ", name: 'Aprovados (Dispensa)'},"
                            + "{value: " + numReprovacoes + ", name: 'Reprovados'},"
                            + "{value: " + numExclusoes + ", name: 'Excluídos'}";

                    String lblFaltas = "";
                    String lblPeriodos = "";
                    String lblAprovacoes = "";
                    String lblReprovacoes = "";
                    String lblDesvio = "";

                    int iAno = Integer.parseInt(ano);
                    int iAA = iAno - 3;
                    for (int i = iAA; i <= iAno; i++) {
                        int num = 0;

                        int numA = 0;
                        int numR = 0;

                        int numE = 0;

                        Referencia ref = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(i + ""));

                        if (ref != null) {
                            num = ref.getRefFaltas();

                            numA = ref.getRefEstudanteAprovacoes();
                            numR = ref.getRefEstudanteReprovacoes();

                            numE = ref.getRefEstudante();
                        }

                        lblFaltas += num + ",";

                        lblPeriodos += "'" + i + "',";

                        lblAprovacoes += numA + ",";
                        lblReprovacoes += numR + ",";

                        int desvio = 0;

                        if (numE != 0) {
                            desvio = (int) Math.round(((numA) * 100.0f) / numE);
                        }

                        lblDesvio += desvio + ",";
                    }

                    if (!lblFaltas.isEmpty()) {
                        lblFaltas = lblFaltas.substring(0, lblFaltas.length() - 1);
                    }

                    if (!lblPeriodos.isEmpty()) {
                        lblPeriodos = lblPeriodos.substring(0, lblPeriodos.length() - 1);
                    }

                    if (!lblAprovacoes.isEmpty()) {
                        lblAprovacoes = lblAprovacoes.substring(0, lblAprovacoes.length() - 1);
                    }

                    if (!lblReprovacoes.isEmpty()) {
                        lblReprovacoes = lblReprovacoes.substring(0, lblReprovacoes.length() - 1);
                    }

                    if (!lblDesvio.isEmpty()) {
                        lblDesvio = lblDesvio.substring(0, lblDesvio.length() - 1);
                    }

                    //GERAIS
                    request.getSession().setAttribute("numEstudantes", numEstudantes);
                    request.getSession().setAttribute("numDocentes", numDocentes);
                    request.getSession().setAttribute("numCursos", numCursos);
                    request.getSession().setAttribute("numDisciplinas", numDisciplinas);
                    request.getSession().setAttribute("numTurmas", numTurmas);

                    //CURSOS
                    request.getSession().setAttribute("cursosRanking", cursosRanking);

                    //ESTATISTICAS
                    request.getSession().setAttribute("lblFaltas", lblFaltas);
                    request.getSession().setAttribute("lblPeriodos", lblPeriodos);
                    request.getSession().setAttribute("lblAprovacoes", lblAprovacoes);
                    request.getSession().setAttribute("lblReprovacoes", lblReprovacoes);
                    request.getSession().setAttribute("lblDesvio", lblDesvio);

                    //AVALIAÇÃO
                    request.getSession().setAttribute("lblAnalise", lblAnalise);
                    request.getSession().setAttribute("pAprovacoes", pAprovacoes);
                    request.getSession().setAttribute("pAprovacoesAno", pAprovacoesAno);

                    response.sendRedirect("rate-dashboard");

                }
                ;
                break;
            }
        } catch (Exception exception) {

            Data d = new Data();
            d.le_hora();
            ExceptionWriter ew = new ExceptionWriter();

            String datetime = d.getAno() + "_" + d.getMes() + "_" + d.getDia() + "_" + d.getHora() + d.getMinuto() + d.getSegundo();
            String msg = "Ocorreu um excepção do tipo:\n" + ew.getStackTrace(exception);
            String assunto = "[Exception]: " + datetime;

            ew.writeToFile(datetime, msg);
            sender.mailException(assunto, datetime, msg);

            response.sendRedirect("error-500");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Log addLog(Usuario u, String desc) {
        data.le_hora();
        Log log = new Log();

        GregorianCalendar gc = new GregorianCalendar();
        gc.setGregorianChange(new Date());
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        log.setLogData(calendar);
        log.setLogHora(data.getHora() + ":" + data.getMinuto() + ":" + data.getSegundo());
        log.setLogDescricao(desc);
        log.setUsuario(u);
        log.setSistema(sistema);
        log.setEntidade(entidade);

        return log;
    }

    //******************* FACTURAS POR CATEGORIA  ******************
    private int getNumberInvoice(List<Factura> facturas, String status) {
        int num = 0;

        for (Factura f : facturas) {
            if (f.getFactStatus().equals(status)) {

                num++;
            }
        }
        return num;
    }

    private double getValueInvoiceStatus(List<Factura> facturas, String status, String periodo) {
        double num = 0;

        for (Factura f : facturas) {
            if (f.getFactStatus().equals(status)) {

                String per = sdf.format(f.getFactData().toGregorianCalendar().getTime());

                if (per.equals(periodo)) {
                    num += f.getFactValortotal();
                }
            }
        }
        return num;
    }

    //****************** FACTURAS POR CATEGORIA  E PERIODO *************
    private int getNumberInvoiceStatus(List<Factura> facturas, String cate, String status) {
        int num = 0;

        for (Factura f : facturas) {

            if (f.getFactTipo().equals(cate)) {
                if (f.getFactStatus().equals(status)) {

                    num++;

                }
            }
        }
        return num;
    }

    private double getValueInvoiceCategory(List<Factura> facturas, String cate, String status) {
        double num = 0;

        for (Factura f : facturas) {

            if (f.getFactTipo().equals(cate)) {
                if (f.getFactStatus().equals(status)) {

                    num += f.getFactValortotal();

                }
            }
        }
        return num;
    }

    private double getAverageValueInvoiceCategory(List<Factura> facturas, String cate, String status) {
        double num = 0;

        for (Factura f : facturas) {

            if (f.getFactTipo().equals(cate)) {
                if (f.getFactStatus().equals(status)) {

                    num += f.getFactValorTotalMedio();

                }
            }
        }
        return num;
    }

    //***************** FLUXO **************
    private int getNumberEntryCategory(List<Fluxo> fluxos, String cate) {
        int num = 0;

        for (Fluxo f : fluxos) {

            if (f.getFluxTipo().equals(cate)) {

                num++;

            }
        }
        return num;
    }

    private double getValueEntryCategoryPeriod(List<Fluxo> fluxos, String cate, String periodo) {
        double num = 0;

        for (Fluxo f : fluxos) {

            if (f.getFluxTipo().equals(cate)) {

                String per = sdf.format(f.getFluxData().toGregorianCalendar().getTime());

                if (per.equals(periodo)) {
                    if (f.getProduto() != null) {
                        num += (f.getFluxQtd() * f.getProduto().getProPreco());
                    }
                }

            }
        }
        return num;
    }

    private double getValueEntryCategory(List<Fluxo> fluxos, String cate) {
        double num = 0;

        for (Fluxo f : fluxos) {

            if (f.getFluxTipo().equals(cate)) {

                if (f.getProduto() != null) {
                    num += (f.getFluxQtd() * f.getProduto().getProPreco());
                }

            }
        }
        return num;
    }

    private int numberOfDaysInMonth(int month, int year) {
        Calendar monthStart = new GregorianCalendar(year, month, 1);
        return monthStart.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    private int getValorAleatorio(int n1, int n2) {
        return (int) (Math.floor(Math.random() * (n2 - n1) + 1) + n1);
    }

    // ************** FACTURAS DE VENDAS *************
    private List<Factura> getInvoicesSale(List<Factura> facturas) {
        List<Factura> invoices = new ArrayList();

        for (Factura f : facturas) {
            String tipo = encryptUtils.decodeString(f.getFactTipo());

            if (tipo.equals("Factura") || tipo.equals("Venda à Dinheiro")) {

                invoices.add(f);
            }
        }

        return invoices;
    }

    private double getPendingValueInvoices(List<Factura> facturas) {

        double value = 0;

        for (Factura f : facturas) {

            String tipo = encryptUtils.decodeString(f.getFactTipo());

            if (tipo.equals("Factura")) {
                value += (f.getFactValortotal() - f.getFactValorProcessado());
            }
        }

        return value;
    }

    private double getValueVD(List<Factura> facturas) {

        double value = 0;

        for (Factura f : facturas) {

            String tipo = encryptUtils.decodeString(f.getFactTipo());

            if (tipo.equals("Venda à Dinheiro")) {
                value += (f.getFactValortotal());
            }
        }

        return value;
    }

    private double getValueLucro(List<Factura> facturas) {

        double value = 0;

        for (Factura f : facturas) {

            String tipo = encryptUtils.decodeString(f.getFactTipo());

            if (tipo.equals("Venda à Dinheiro") || tipo.equals("Factura")) {
                value += (f.getFactValortotal() - f.getFactValorTotalMedio());
            }
        }

        return value;
    }

    //***** ITENS PEDIDOS FACTURAS *****************
    private List<ItemPedido> getItensInvoice(List<Factura> facturas, List<ItemPedido> itensPedidos) {
        List<ItemPedido> items = new ArrayList();

        for (Factura f : facturas) {
            for (ItemPedido ip : itensPedidos) {

                if (ip.getItpReferenciaFactura() == f.getFactId()) {
                    items.add(ip);

                }
            }
        }

        return items;
    }

    //**************** PRODUTOS **************
    private Produto getProductByReference(List<Produto> produtos, String referencia) {
        Produto produto = null;

        for (Produto p : produtos) {
            if (p.getProCodigo().equals(referencia)) {
                produto = p;
            }
        }

        return produto;
    }

    private double getValueProducts(List<Produto> produtos) {
        double value = 0;

        for (Produto p : produtos) {

            if (p.getCategoriaProduto().isCatpEstocado()) {
                value += (p.getProEstoque() * p.getProPrecoCompra());
            }
        }

        return value;
    }

    //********** ACTIVOS ************
    private double getValueAssets(List<Activo> activos) {
        double value = 0;

        for (Activo a : activos) {
            value += a.getActiValor();
        }

        return value;
    }

    //********** REGISTO FECHOS ***********
    private double getValueClosure(List<RegistoFecho> registosFecho) {
        double value = 0;

        for (RegistoFecho rf : registosFecho) {

            value += (rf.getRegfQtd() * rf.getProduto().getProPreco());
        }

        return value;
    }

    private double getValueReceipt(List<Recibo> recibos) {
        double value = 0;

        for (Recibo r : recibos) {
            value += r.getRecValor();
        }
        return value;
    }

    private int getNumberRequest(List<GuiaRemessa> guiasRemessa, String status) {
        int num = 0;

        num = guiasRemessa.stream().filter((f) -> (f.getGuiaStatus().equals(status))).map((_item) -> 1).reduce(num, Integer::sum);
        return num;
    }

    private int getNumberRequestCategory(List<GuiaRemessa> guiasRemessa, String cate, String periodo) {
        int num = 0;

        for (GuiaRemessa gr : guiasRemessa) {
            String dte = sdf.format(gr.getGuiaData().toGregorianCalendar().getTime());

            if (gr.getGuiaStatus().equals(cate)) {

                if (dte.startsWith(periodo)) {
                    num++;
                }
            }
        }
        return num;
    }

    private int getNumberFlowCategory(List<Fluxo> fluxos, String cate, String periodo) {
        int num = 0;

        for (Fluxo f : fluxos) {
            String dte = sdf.format(f.getFluxData().toGregorianCalendar().getTime());

            if (f.getFluxTipo().equals(cate)) {

                if (dte.startsWith(periodo)) {
                    num++;
                }
            }
        }
        return num;
    }

    private void updateFlowtStatus(HttpServletRequest request) {

        List<Fluxo> fluxos = vendasCtrl.listaFluxos(entidade);

        String lblEntradas = "";
        String lblAbates = "";
        String lblSaidas = "";

        String s1 = encryptUtils.encodeString("Saída - Guia");
        String s2 = encryptUtils.encodeString("Saída - Ajuste");
        String s3 = encryptUtils.encodeString("Entrada - Guia");
        String s4 = encryptUtils.encodeString("Saída - Requisição");

        for (int i = 1; i <= 12; i++) {
            String m = i + "";

            if (i < 10) {
                m = "0" + i;
            }

            String per = data.getAno() + "-" + m;

            lblSaidas += (getNumberFlowCategory(fluxos, s1, per) + getNumberFlowCategory(fluxos, s4, per)) + ",";
            lblAbates += getNumberFlowCategory(fluxos, s2, per) + ",";
            lblEntradas += getNumberFlowCategory(fluxos, s3, per) + ",";

        }

        if (!lblSaidas.isEmpty()) {
            lblSaidas = lblSaidas.substring(0, lblSaidas.length() - 1);
        }

        if (!lblAbates.isEmpty()) {
            lblAbates = lblAbates.substring(0, lblAbates.length() - 1);
        }

        if (!lblEntradas.isEmpty()) {
            lblEntradas = lblEntradas.substring(0, lblEntradas.length() - 1);
        }

        request.getSession().setAttribute("lblSaidas", lblSaidas);
        request.getSession().setAttribute("lblAbates", lblAbates);
        request.getSession().setAttribute("lblEntradas", lblEntradas);

    }

    private void updateRequestStatus(HttpServletRequest request) {

        List<GuiaRemessa> guiasRemessa = vendasCtrl.listaGuiasRemessaTipo(entidade, encryptUtils.encodeString("Requisição"));

        @SuppressWarnings("UnusedAssignment")
        int numTotal = 0;

        // long perVolume = Math.round((realVolume * 100.0f) / refVolume);
        int perPendentes = 0;
        int perSuspensas = 0;
        int perCanceladas = 0;
        int perEmitidas = 0;

        String lblPendentes = "";
        String lblSuspensas = "";
        String lblCanceladas = "";
        String lblEmitidas = "";

        if (guiasRemessa != null) {
            numTotal = guiasRemessa.size();

            String s1 = encryptUtils.encodeString("Pendente");
            String s2 = encryptUtils.encodeString("Suspensa");
            String s3 = encryptUtils.encodeString("Cancelada");
            String s4 = encryptUtils.encodeString("Confirmada");

            int numPendentes = getNumberRequest(guiasRemessa, s1);
            int numSuspensas = getNumberRequest(guiasRemessa, s2);
            int numCanceladas = getNumberRequest(guiasRemessa, s3);
            int numConfirmadas = getNumberRequest(guiasRemessa, s4);

            perPendentes = Math.round((numPendentes * 100.0f) / numTotal);
            perSuspensas = Math.round((numSuspensas * 100.0f) / numTotal);
            perCanceladas = Math.round((numCanceladas * 100.0f) / numTotal);
            perEmitidas = Math.round((numConfirmadas * 100.0f) / numTotal);

            data.le_hora();
            for (int i = 1; i <= 12; i++) {
                String m = i + "";

                if (i < 10) {
                    m = "0" + i;
                }

                String per = data.getAno() + "-" + m;

                lblPendentes += getNumberRequestCategory(guiasRemessa, s1, per) + ",";
                lblSuspensas += getNumberRequestCategory(guiasRemessa, s2, per) + ",";
                lblCanceladas += getNumberRequestCategory(guiasRemessa, s3, per) + ",";
                lblEmitidas += getNumberRequestCategory(guiasRemessa, s4, per) + ",";

            }
        }

        if (!lblPendentes.isEmpty()) {
            lblPendentes = lblPendentes.substring(0, lblPendentes.length() - 1);
        }

        if (!lblCanceladas.isEmpty()) {
            lblCanceladas = lblCanceladas.substring(0, lblCanceladas.length() - 1);
        }

        if (!lblSuspensas.isEmpty()) {
            lblSuspensas = lblSuspensas.substring(0, lblSuspensas.length() - 1);
        }

        if (!lblEmitidas.isEmpty()) {
            lblEmitidas = lblEmitidas.substring(0, lblEmitidas.length() - 1);
        }

        request.getSession().setAttribute("lblPendentes", lblPendentes);
        request.getSession().setAttribute("lblCanceladas", lblCanceladas);
        request.getSession().setAttribute("lblSuspensas", lblSuspensas);
        request.getSession().setAttribute("lblEmitidas", lblEmitidas);

        request.getSession().setAttribute("perCanceladas", perCanceladas);
        request.getSession().setAttribute("perEmitidas", perEmitidas);
        request.getSession().setAttribute("perPendentes", perPendentes);
        request.getSession().setAttribute("perSuspensas", perSuspensas);

    }

    public XMLGregorianCalendar getDate(String data) {

        StringTokenizer st = new StringTokenizer(data, "/");
        int month = Integer.parseInt(st.nextToken()) - 1;

        String dt = st.nextToken();
        if (dt.startsWith("0")) {
            dt = dt.charAt(dt.length() - 1) + "";
        }
        int day = Integer.parseInt(dt);
        int year = Integer.parseInt(st.nextToken());

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, day);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        return calendar;
    }

    private int getNumGenero(List<Aluno> alunos, String genero) {
        int num = 0;

        for (Aluno a : alunos) {
            String gen = encryptUtils.decodeString(a.getPessoa().getPessSexo());

            if (gen.equals(genero)) {
                num++;
            }
        }

        return num;
    }

    private int getNumOcupacao(List<Aluno> alunos, String per, String str) {
        int num = 0;

        for (Aluno a : alunos) {
            String act = encryptUtils.decodeString(a.getTurma().getCurso().getAreaFormacao().getArefDescricao());
            String dte = sdf.format(a.getPessoa().getPessDataCadastro().toGregorianCalendar().getTime());

            if (act.equals(str) && dte.startsWith(per)) {
                num++;
            }
        }

        return num;
    }

    private int getNumFormacao(List<Aluno> alunos, String str) {
        int num = 0;

        for (Aluno a : alunos) {
            String niv = encryptUtils.decodeString(a.getAlunNivel());

            if (niv.equals(str)) {
                num++;
            }
        }

        return num;
    }

    private int getNumTipo(List<Aluno> alunos, String str) {
        int num = 0;

        for (Aluno a : alunos) {
            String niv = encryptUtils.decodeString(a.getAlunBolseiro());

            if (niv.equals(str)) {
                num++;
            }
        }

        return num;
    }

    private int getNumComDeficiencia(List<Aluno> alunos) {
        int num = 0;

        for (Aluno a : alunos) {

            if (a.isAlunDeficiente()) {
                num++;
            }
        }

        return num;
    }

    private int getNumSemDeficiencia(List<Aluno> alunos) {
        int num = 0;

        for (Aluno a : alunos) {

            if (!a.isAlunDeficiente()) {
                num++;
            }
        }

        return num;
    }

    private double getTotalPagamentos(List<Pagamento> pagamentos, String descricao) {
        double total = 0;

        if (pagamentos != null) {
            for (Pagamento pagamento : pagamentos) {

                String cat = encryptUtils.decodeString(pagamento.getPagCategorizacao());
                if (cat.equals(descricao)) {
                    total += pagamento.getPagValorPago();
                }
            }
        }
        return total;
    }

    private double getTotalEsperadoPagamentos(List<Pagamento> pagamentos, String descricao) {
        double total = 0;

        if (pagamentos != null) {
            for (Pagamento pagamento : pagamentos) {

                String cat = encryptUtils.decodeString(pagamento.getPagCategorizacao());
                if (cat.equals(descricao)) {
                    total += pagamento.getPagValor();
                }
            }
        }
        return total;
    }

    private double getTotalPagamentos(List<Pagamento> pagamentos) {
        double total = 0;
        if (pagamentos != null) {
            for (Pagamento pagamento : pagamentos) {
                total += pagamento.getPagValor();
            }
        }
        return total;
    }

    private int getNumberInvoiceCategory(List<Factura> facturas, String cate, String periodo) {
        int num = 0;

        for (Factura f : facturas) {
            String dte = sdf.format(f.getFactData().toGregorianCalendar().getTime());

            if (f.getFactStatus().equals(cate)) {

                if (dte.startsWith(periodo)) {
                    num++;
                }
            }
        }
        return num;
    }

    private double getValuePaidCategory(List<Pagamento> pagamentos, String cate) {
        double val = 0;

        for (Pagamento p : pagamentos) {
            if (p.getPagCategorizacao().equals(cate)) {
                val += p.getPagValorPago();
            }
        }

        return val;
    }

    private double getTotalAmountCategory(List<Pagamento> pagamentos, String cate) {
        double val = 0;

        for (Pagamento p : pagamentos) {
            if (p.getPagCategorizacao().equals(cate)) {
                val += p.getPagValor();
            }
        }

        return val;
    }

    private String getMax(List<Recebimento> recebimentos) {
        String max = "";
        double maior = -999;

        for (Recebimento r : recebimentos) {
            if (r.getValorCobrado() > maior) {
                maior = r.getValorCobrado();
                max = r.getMeio();
            }
        }

        return max;
    }

    private double totalCobradoPagamentos(List<Pagamento> pagamentos) {
        double vt = 0;

        for (Pagamento p : pagamentos) {

            if (p.isPagStatus()) {
                vt += p.getPagValorPago();
            }

        }
        return vt;
    }

    private double totalPagamentos(List<Pagamento> pagamentos) {
        double vt = 0;

        for (Pagamento p : pagamentos) {

            vt += p.getPagValor();

        }
        return vt;
    }

    private double totalCobrancasMeioPagamento(List<Pagamento> pagamentos, String meio) {
        double vt = 0;

        for (Pagamento p : pagamentos) {

            if (p.getPagFormaPagamento() != null) {
                if (p.getPagFormaPagamento().equals(meio)) {

                    vt += p.getPagValor();
                }
            }
        }

        return vt;
    }

    private double totalDepositosMeioPagamento(List<Pagamento> pagamentos, String meio) {
        double vt = 0;

        for (Pagamento p : pagamentos) {

            if (p.getPagFormaPagamento() != null) {
                if (p.getPagFormaPagamento().equals(meio)) {

                    vt += p.getPagValorPago();
                }
            }
        }

        return vt;
    }

    private double totalCobrancasCategoria(List<Pagamento> pagamentos, String categoria) {
        double vt = 0;

        for (Pagamento p : pagamentos) {
            if (p.getPagCategorizacao() != null) {
                if (p.getPagCategorizacao().equals(categoria)) {

                    vt += p.getPagValor();
                }
            }
        }
        return vt;
    }

    private double totalDepositosCategoria(List<Pagamento> pagamentos, String categoria) {
        double vt = 0;

        for (Pagamento p : pagamentos) {

            if (p.getPagCategorizacao() != null) {
                if (p.getPagCategorizacao().equals(categoria)) {

                    vt += p.getPagValorPago();
                }
            }
        }
        return vt;
    }

    private double totalCobrancasCaixa(List<Pagamento> pagamentos, Caixa caixa) {
        double vt = 0;

        for (Pagamento p : pagamentos) {

            if (p.getCaixa() != null) {
                if (p.getCaixa().getCaixId() == caixa.getCaixId()) {

                    vt += p.getPagValorPago();
                }
            }
        }

        return vt;
    }

    private double totalCobrancasMeio(List<Pagamento> pagamentos, String meio) {
        double vt = 0;

        for (Pagamento p : pagamentos) {

            if (p.getPagFormaPagamento() != null) {
                if (p.getPagFormaPagamento().equals(meio)) {

                    vt += p.getPagValorPago();
                }
            }
        }

        return vt;
    }

    private int getInscritosCategoriaAno(List<Matricula> matriculas, String classe, String categoria) {
        int num = 0;

        if (matriculas != null) {
            for (Matricula m : matriculas) {
                String desc = m.getMatrClasse();
                //"NOVO INGRESSO", "CONTINUANTE", "REPETENTE", "ASSISTENTE", "TRANSFERIDO"

                if (desc.equals(classe)) {
                    switch (categoria) {
                        case "NOVO INGRESSO":
                            num += m.getMatrNovo();
                            break;
                        case "CONTINUANTE":
                            num += m.getMatrContinuante();
                            break;
                        case "REPETENTE":
                            num += m.getMatrRepetente();
                            break;
                        case "ASSISTENTE":
                            num += m.getMatrAssistente();
                            break;
                        case "TRANSFERIDO":
                            num += m.getMatrTransferido();
                            break;
                    }
                }
            }
        }
        return num;
    }

    private int getAproveitamentoCategoriaAno(List<Aproveitamento> aproveitamentos, String classe, String categoria) {
        int num = 0;

        if (aproveitamentos != null) {
            for (Aproveitamento a : aproveitamentos) {
                String desc = a.getAproCategoria();

                if (desc.equals(classe)) {
                    switch (categoria) {
                        case "ADMITIDOS":
                            num += a.getAproAdmitidos();
                            break;
                        case "REPROVADOS":
                            num += a.getAproReprovados();
                            break;
                        case "DISPENSADOS":
                            num += a.getAproDispensados();
                            break;
                        case "EXCLUÍDOS":
                            num += a.getAproExcluidos();
                            break;
                    }
                }

            }
        }

        return num;
    }

    private int getTotalAproveitamentoClasse(List<Aproveitamento> aproveitamentos, String classe) {
        int num = 0;

        if (aproveitamentos != null) {
            for (Aproveitamento a : aproveitamentos) {
                String desc = a.getAproCategoria();

                if (desc.equals(classe)) {
                    num += a.getAproAdmitidos() + a.getAproReprovados();
                }
            }
        }

        return num;
    }

}
