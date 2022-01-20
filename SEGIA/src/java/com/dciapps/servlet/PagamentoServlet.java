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

import com.dciapps.local.Importacao;
import com.dciapps.local.PInscricao;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Pagamento;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.ReciboPagamento;
import com.dciapps.webclient.Referencia;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Taxa;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Upload;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ContabilidadeCtrl;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.dciapps.webclientcontroler.IbanCtrl;
import com.dciapps.webclientcontroler.VendasCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
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
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "UGFnYW1lbnRvU2VydmxldCNEQ0k=", urlPatterns = {"/UGFnYW1lbnRvU2VydmxldCNEQ0k="})
public class PagamentoServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();
    ContabilidadeCtrl contabilidadeCtrl = new ContabilidadeCtrl();
    VendasCtrl vendasCtrl = new VendasCtrl();
    IbanCtrl ibanCtrl = new IbanCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();

    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

    Sender sender = new Sender();
    DecimalFormat df = new DecimalFormat("#,###,##0.00");

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

            if (request.getSession().getAttribute("codEscola") != null) {
                codEscola = encryptUtils.encodeString(request.getSession().getAttribute("codEscola").toString());
            }

            switch (accao) {

                case "situacao-pagamentos": {

                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoes(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou o ponto de situação dos pagamentos"));

                    request.getSession().setAttribute("inscricoes", inscricoes);

                    response.sendRedirect("payment-stats");
                }
                ;
                break;

                case "notificar-irregulares": {
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    int num = 0;

                    for (Inscricao i : inscricoes) {
                        if (i.getAluno().getPessoa().getPessEmail() != null) {
                            String mail = encryptUtils.decodeString(i.getAluno().getPessoa().getPessEmail());

                            if (!mail.equals("N/D")) {
                                num++;
                            }
                        }
                    }

                    String msgErro = "Notificados " + num + " formandos irregulares";
                    String alerta = "bg-success";

                    if (num == 1) {
                        msgErro = "Notificado um formando irregular";

                    }

                    if (num == 0) {
                        msgErro = "Nenhum formando foi notificado";
                        alerta = "bg-warning";
                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    request.getSession().setAttribute("inscricoes", inscricoes);

                    response.sendRedirect("payment-stats");
                }
                ;
                break;

                case "propinas": {

                    List<Turma> turmas = (List<Turma>) request.getSession().getAttribute("turmas");

                    if (turmas == null) {
                        turmas = ensinoCtrl.listaTurmas(entidade);

                        request.getSession().setAttribute("turmas", turmas);
                    }

                    Turma turma = null;

                    if (request.getParameter("idTurma") != null) {
                        int idTurma = Integer.parseInt(request.getParameter("idTurma"));

                        turma = ensinoCtrl.buscaTurmaId(idTurma);
                    } else {
                        if (!turmas.isEmpty()) {
                            turma = turmas.get(0);
                        }
                    }

                    List<Pagamento> pagamentos = null;
                    List<Inscricao> inscricoes = null;

                    if (turma != null) {
                        //pagamentos = contabilidadeCtrl.listaPagamentosTurma(entidade, turma);
                        inscricoes = ensinoCtrl.listaInscricoesTurma(entidade, turma);
                    }

                    List<PInscricao> pinscricoes = new ArrayList();

                    if (inscricoes != null) {

                        if (!inscricoes.isEmpty()) {
                            Inscricao inscricao = inscricoes.get(0);

                            Aluno aluno = inscricao.getAluno();

                            String bolseiro = encryptUtils.decodeString(aluno.getAlunBolseiro());

                            if (!bolseiro.equals("Bolseiro Integral")) {

                                pagamentos = contabilidadeCtrl.listaPagamentosInscricao(entidade, inscricao);

                                for (Pagamento p : pagamentos) {

                                    if (!p.isPagStatus()) {
                                        PInscricao pi = new PInscricao();
                                        pi.setInscricao(inscricao);
                                        pi.setPagamento(p);

                                        pinscricoes.add(pi);
                                    }
                                }
                            }
                        }

                    }

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de pagamento de propinas"));

                    request.getSession().setAttribute("pinscricoes", pinscricoes);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("inscricoes", inscricoes);

                    response.sendRedirect("payment-due");
                }
                ;
                break;

                case "registar-pagamento": {

                    double valorPago = Double.parseDouble(request.getParameter("valorPago"));
                    String formaPagamento = request.getParameter("formaPagamento");
                    String documento = request.getParameter("documento");

                    String noty_list[] = request.getParameterValues("noty_list");

                    List<PInscricao> pinscricoes = (List<PInscricao>) request.getSession().getAttribute("pinscricoes");

                    int i = 0;
                    String str = "";

                    double totalPagar = 0;
                    double totalPrestacao = 0;
                    double totalMulta = 0;

                    int diasTrial = 0;

                    int multa = 0;

                    @SuppressWarnings("UnusedAssignment")
                    String msgErro = "";
                    @SuppressWarnings("UnusedAssignment")
                    String alerta = "";

                    Inscricao inscricao = null;

                    GregorianCalendar gc = new GregorianCalendar();
                    gc.setGregorianChange(new Date());
                    XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

                    XMLGregorianCalendar calendarProx = null;
                    XMLGregorianCalendar calendarPag = null;

                    if (noty_list != null) {
                        for (String n : noty_list) {

                            PInscricao pInscricao = getPInscricao(pinscricoes, Integer.parseInt(n));

                            Pagamento pagamento = pInscricao.getPagamento();

                            inscricao = pInscricao.getInscricao();

                            double vMulta = 0;

                            Date dataLimite = pagamento.getPagDataLimite().toGregorianCalendar().getTime();

                            if (dataLimite != null) {
                                Date dtaProx = dataLimite;
                                Date dtaHoje = new Date();
                                diasTrial = Days.daysBetween(new DateTime(dtaProx), new DateTime(dtaHoje)).getDays();

                            }

                            System.out.println(diasTrial);

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

                            //TEMPORARIO  
                            multa = 0;

                            if (multa != 0) {
                                vMulta = pagamento.getPagValor() * (multa / 100.f);
                            }

                            totalPagar += pagamento.getPagValor() + vMulta;
                            totalPrestacao += pagamento.getPagValor();
                            totalMulta += vMulta;

                        }

                        if (valorPago < totalPagar) {
                            msgErro = "Valor pago insuficiente. O valor a pagar é de " + df.format(totalPagar) + " MT";
                            alerta = "bg-warning";
                        } else {

                            data.le_hora();
                            String ano = data.getAno();

                            Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(ano));

                            String sgl = encryptUtils.decodeString(entidade.getEntiSigla()).toUpperCase();

                            referencia.setRefReciboPagamento(referencia.getRefReciboPagamento() + 1);

                            vendasCtrl.persistirReferencia(referencia);

                            String refPag = "Recibo Pagamento Nº " + referencia.getRefReciboPagamento() + "/" + sgl + ano;

                            ReciboPagamento reciboPagamento = new ReciboPagamento();

                            reciboPagamento.setEncrypted(true);
                            reciboPagamento.setEntidade(entidade);
                            reciboPagamento.setRecpData(calendar);
                            reciboPagamento.setRecpLancamento(referencia.getRefReciboPagamento());
                            reciboPagamento.setRecpObservacoes(encryptUtils.encodeString("PAGAMENTO REFERENTE A(S) REFERÊNCIA(S) DE PAGAMENTO: " + str));
                            reciboPagamento.setRecpReferencia(encryptUtils.encodeString(refPag));
                            reciboPagamento.setRefBancoPagamento(encryptUtils.encodeString(formaPagamento));
                            reciboPagamento.setRefNrDocumentoPagamento(encryptUtils.encodeString(documento));
                            reciboPagamento.setRecpValor(totalPrestacao);
                            reciboPagamento.setRecpMulta(totalMulta);
                            reciboPagamento.setRecpTotal(valorPago);

                            if (inscricao != null) {

                                Pessoa pessoa = inscricao.getAluno().getPessoa();

                                String nm = encryptUtils.decodeString(pessoa.getPessNome()) + " " + encryptUtils.decodeString(pessoa.getPessApelido());
                                reciboPagamento.setPessoa(pessoa);
                                reciboPagamento.setRecpRecebemosDe(encryptUtils.encodeString(nm));
                                reciboPagamento.setRecpObservacoes(encryptUtils.encodeString("PAGAMENTO REFERENTE A(S) REFERÊNCIA(S) DE PAGAMENTO: " + str + " DA MENSALIDADE NO CURSO " + encryptUtils.decodeString(inscricao.getCurso().getCursDescricao())));

                            }

                            contabilidadeCtrl.persistirReciboPagamento(reciboPagamento);

                            reciboPagamento = contabilidadeCtrl.buscaReciboPagamentoReferencia(entidade, encryptUtils.encodeString(refPag));

                            for (String n : noty_list) {

                                PInscricao pInscricao = getPInscricao(pinscricoes, Integer.parseInt(n));

                                Pagamento pagamento = pInscricao.getPagamento();

                                double vMulta = 0;

                                Date dataLimite = pagamento.getPagDataLimite().toGregorianCalendar().getTime();

                                if (dataLimite != null) {
                                    Date dtaProx = dataLimite;
                                    Date dtaHoje = new Date();
                                    diasTrial = Days.daysBetween(new DateTime(dtaProx), new DateTime(dtaHoje)).getDays();

                                }

                                System.out.println(diasTrial);

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
                                    vMulta = pagamento.getPagValor() * (multa / 100.f);
                                }

                                double vPre = pagamento.getPagValor() + vMulta;

                                double vPago = vPre;

                                System.out.println("VALOR PRESTAÇÃO: " + df.format(vPre) + " MT");

                                System.out.println("VALOR MULTA: " + df.format(vMulta) + " MT");

                                System.err.println("==== 1º CENÁRIO");

                                pagamento.setPagActual(true);
                                pagamento.setPagDataPagamento(calendar);
                                pagamento.setPagCondicao(encryptUtils.encodeString("Pago na totalidade"));
                                pagamento.setPagEstado(encryptUtils.encodeString("Pago"));
                                pagamento.setPagFormaPagamento(encryptUtils.encodeString(formaPagamento));
                                pagamento.setPagRecibo(encryptUtils.encodeString(documento));
                                pagamento.setPagStatus(true);
                                pagamento.setPagValorPago(vPago);
                                pagamento.setPagMulta(vMulta);
                                pagamento.setReciboPagamento(reciboPagamento);

                                contabilidadeCtrl.persistirPagamento(pagamento);

                                calendarProx = pagamento.getPagDataLimite();
                                calendarPag = pagamento.getPagData();

                                System.out.println("VALOR PAGO: " + df.format(vPre) + " MT");

                                i++;

                                str += encryptUtils.decodeString(pagamento.getPagRefOnline()) + ",";

                            }
                            double vRes = valorPago - totalPagar;

                            if (vRes > 0) {

                                if (inscricao != null) {
                                    Pessoa pessoa = inscricao.getAluno().getPessoa();

                                    List<Pagamento> pagamentosAux = contabilidadeCtrl.listaPagamentosPendentesCliente(entidade, pessoa);

                                    Pagamento pAux = getProximoPagamentoNaoPago(pagamentosAux, inscricao);

                                    if (pAux != null) {
                                        pAux.setPagValor(pAux.getPagValor() - vRes);
                                        contabilidadeCtrl.persistirPagamento(pAux);

                                        calendarProx = pAux.getPagDataLimite();
                                        calendarPag = pAux.getPagData();

                                    }

                                }
                            }

                            msgErro = i + " Pagamento(s) liquidado(s) com sucesso";
                            alerta = "bg-success";

                        }

                        if (alerta.equals("bg-success")) {

                            if (inscricao != null) {

                                if (calendarPag != null) {
                                    inscricao.setInscDataUltimoPagamento(calendar);

                                    inscricao.setInscDataProximoPagamento(calendarProx);

                                    Aluno aluno = inscricao.getAluno();

                                    aluno.setAlunDataProximoPagamento(calendarProx);

                                    Date dHoje = new Date();
                                    Date dProximo = calendarPag.toGregorianCalendar().getTime();

                                    if (dProximo.after(dHoje) || dProximo.equals(dHoje)) {

                                        aluno.setAlunStatus(encryptUtils.encodeString("Activo"));

                                        ensinoCtrl.persistirAluno(aluno);

                                    }

                                    ensinoCtrl.persistirInscricao(inscricao);

                                }
                            }
                        }

                        if (!str.isEmpty()) {

                            str = str.substring(0, str.length() - 1);

                            controleAcessoCtrl.persistirLog(addLog(usuario, "Liquidou com sucesso os pagamentos com o id: " + str));

                        }

                    }

                    Turma turma = (Turma) request.getSession().getAttribute("turma");
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    pinscricoes = new ArrayList();

                    if (inscricoes != null) {

                        if (!inscricoes.isEmpty()) {

                            if (inscricao != null) {

                                Aluno aluno = inscricao.getAluno();

                                String bolseiro = encryptUtils.decodeString(aluno.getAlunBolseiro());

                                if (!bolseiro.equals("Bolseiro Integral")) {

                                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosInscricao(entidade, inscricao);

                                    for (Pagamento p : pagamentos) {

                                        if (!p.isPagStatus()) {
                                            PInscricao pi = new PInscricao();
                                            pi.setInscricao(inscricao);
                                            pi.setPagamento(p);

                                            pinscricoes.add(pi);
                                        }
                                    }
                                }

                            }
                        }

                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("pinscricoes", pinscricoes);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("inscricao", inscricao);
                    response.sendRedirect("payment-due");

                }
                ;
                break;

                case "filtrar-aluno": {

                    Turma turma = (Turma) request.getSession().getAttribute("turma");
                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");

                    int id = Integer.parseInt(request.getParameter("idAluno"));

                    List<PInscricao> pinscricoes = new ArrayList();

                    if (inscricoes != null) {

                        if (!inscricoes.isEmpty()) {
                            Inscricao inscricao = getInsicricao(inscricoes, id);

                            Aluno aluno = inscricao.getAluno();

                            String bolseiro = encryptUtils.decodeString(aluno.getAlunBolseiro());

                            if (!bolseiro.equals("Bolseiro Integral")) {

                                List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosInscricao(entidade, inscricao);

                                for (Pagamento p : pagamentos) {

                                    if (!p.isPagStatus()) {
                                        PInscricao pi = new PInscricao();
                                        pi.setInscricao(inscricao);
                                        pi.setPagamento(p);

                                        pinscricoes.add(pi);
                                    }
                                }
                            }
                        }

                    }

                    request.getSession().setAttribute("pinscricoes", pinscricoes);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("inscricoes", inscricoes);
                    response.sendRedirect("payment-due");
                }
                ;
                break;

                case "outros-pagamentos": {

                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoes(entidade);
                    List<Taxa> taxas = ensinoCtrl.listaTaxas(entidade);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Solicitou o formulário de registo de outras taxas de pagamento"));

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("taxas", taxas);

                    response.sendRedirect("payment-exchange");
                }
                ;
                break;

                case "adicionar-pagamento": {

                    String descricao = request.getParameter("descricao");
                    double valor = Double.parseDouble(request.getParameter("valor"));
                    int idInscricao = Integer.parseInt(request.getParameter("idInscricao"));
                    int idTaxa = Integer.parseInt(request.getParameter("idTaxa"));

                    String dataPagamento = request.getParameter("dataPagamento");
                    String documento = request.getParameter("documento");
                    String formaPagamento = request.getParameter("formaPagamento");

                    Taxa taxa = ensinoCtrl.buscaTaxaId(idTaxa);

                    List<Inscricao> inscricoes = (List<Inscricao>) request.getSession().getAttribute("inscricoes");
                    List<Taxa> taxas = (List<Taxa>) request.getSession().getAttribute("taxas");

                    double valorTaxa = 0;

                    String msgErro = "Pagamento adicionado com sucesso";
                    String alerta = "bg-success";

                    if (taxa != null) {

                        String tipoTaxa = encryptUtils.decodeString(taxa.getTaxaDescricao());
                        valorTaxa = taxa.getTaxaValor();

                        if (valor < valorTaxa) {
                            msgErro = "Valor introduzido insuficiente, o valor aceita para a " + tipoTaxa.toLowerCase() + " é igual ou siperior á " + df.format(valorTaxa);
                            alerta = "bg-warning";
                        } else {
                            XMLGregorianCalendar calendarPag = getDate(dataPagamento);

                            Inscricao inscricao = getInsicricao(inscricoes, idInscricao);

                            data.le_hora();
                            String ano = data.getAno();

                            Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(ano));

                            String sgl = encryptUtils.decodeString(entidade.getEntiSigla()).toUpperCase();

                            referencia.setRefPagamento(referencia.getRefPagamento() + 1);

                            vendasCtrl.persistirReferencia(referencia);

                            String refPag = "Pagamento Nº " + referencia.getRefPagamento() + "/" + sgl + ano;

                            Pagamento p = new Pagamento();
                            p.setEncrypted(true);
                            p.setEntidade(entidade);
                            p.setOnline(false);
                            p.setPagDescricao(encryptUtils.encodeString(tipoTaxa + ": " + descricao));
                            p.setPagOrigem(encryptUtils.encodeString("Sistema"));
                            p.setPagCondicao(encryptUtils.encodeString("Pago na totalidade"));
                            p.setPagEstado(encryptUtils.encodeString("Pago"));
                            p.setPagData(calendarPag);
                            p.setPagCategorizacao(encryptUtils.encodeString(tipoTaxa));
                            p.setPagValor(valorTaxa);
                            p.setPagValorPago(valor);
                            p.setPagFormaPagamento(encryptUtils.encodeString(formaPagamento));
                            p.setPagRecibo(encryptUtils.encodeString(documento));
                            p.setPagStatus(true);
                            p.setPessoa(inscricao.getAluno().getPessoa());
                            p.setInscricao(inscricao);
                            p.setTurma(inscricao.getTurma());
                            p.setPagReferencia(encryptUtils.encodeString(refPag));

                            contabilidadeCtrl.persistirPagamento(p);

                            p = contabilidadeCtrl.buscaPagamentoDescricao(entidade, encryptUtils.encodeString(refPag));

                            String codigo = encryptUtils.decodeString(inscricao.getAluno().getAlunBadgnumber());

                            String enti = "98100";

                            SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
                            SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");

                            String dte = sdf.format(p.getPagData().toGregorianCalendar().getTime());
                            StringTokenizer st2 = new StringTokenizer(dte, "/");

                            String mes = st2.nextToken();
                            String anoRef = st2.nextToken();
                            String montante = (p.getPagValor() * 100) + "";

                            String dataLimite = sdf2.format(new Date());

                            if (p.getPagDataLimite() != null) {
                                dataLimite = sdf2.format(p.getPagDataLimite().toGregorianCalendar().getTime());
                            }

                            String ref = ibanCtrl.referenciaPagamento(enti, codigo, mes, anoRef, dataLimite, montante);

                            //  ref = ref.substring(1, ref.length());
                            System.out.println(ref + "  | T: " + ref.length());

                            p.setPagRefOnline(encryptUtils.encodeString(ref));

                            contabilidadeCtrl.persistirPagamento(p);

                        }

                    }

                    request.getSession().setAttribute("inscricoes", inscricoes);
                    request.getSession().setAttribute("taxas", taxas);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("payment-exchange");

                }
                ;
                break;

                case "filtrar-periodo": {
                    String anoPesquisa = request.getParameter("anoPesquisa");
                    String mesPesquisa = request.getParameter("mesPesquisa");

                    Turma turma = (Turma) request.getSession().getAttribute("turma");

                    List<Pagamento> pagamentos = (List<Pagamento>) request.getSession().getAttribute("todosPagamentosTurma");

                    if (pagamentos == null) {
                        if (turma != null) {
                            pagamentos = contabilidadeCtrl.listaPagamentosTurma(entidade, turma);
                        }
                    }

                    List<Pagamento> pagamentosTemp = null;

                    if (pagamentos != null) {
                        pagamentosTemp = getPagamentosPeriodo(pagamentos, (anoPesquisa + "-" + mesPesquisa));
                    }

                    request.getSession().setAttribute("pagamentosTurma", pagamentosTemp);
                    request.getSession().setAttribute("todosPagamentosTurma", pagamentos);
                    request.getSession().setAttribute("turma", turma);
                    request.getSession().setAttribute("anoPesquisa", anoPesquisa);
                    request.getSession().setAttribute("mesPesquisa", mesPesquisa);

                    response.sendRedirect("payment-online");
                }
                ;
                break;

                case "pagamentos-online": {

                    response.sendRedirect("payment-online");
                }
                ;
                break;

                case "carregar-ficheiro": {

                    Upload upload = gestaoCtrl.buscaUpload(entidade);

                    String nomeFich = "N/D";

                    if (upload != null) {
                        nomeFich = encryptUtils.decodeString(upload.getUplFile());
                    }

                    System.out.println("NOME FICH:" + nomeFich);

                    String ip = getUrlServer();

                    //COPIA O FICHEIRO PARA A PASTA LOCAL DO SERVIDOR
                    try (BufferedInputStream inputStream = new BufferedInputStream(new URL("http://" + ip + ":8081/suc/txt/pagamentos/" + nomeFich).openStream());
                            FileOutputStream fileOS = new FileOutputStream("C:\\import\\pagamentos\\" + nomeFich)) {
                        byte dataLoad[] = new byte[1024];
                        int byteContent;
                        while ((byteContent = inputStream.read(dataLoad, 0, 1024)) != -1) {
                            fileOS.write(dataLoad, 0, byteContent);
                        }
                    } catch (IOException e) {
                        // handles IO exceptions
                    }

                    List<String> linhas = readFile("C:\\import\\pagamentos\\" + nomeFich);

                    String msgErro = "";
                    String alerta = "";

                    List<Importacao> importacoes = new ArrayList();

                    if (linhas != null) {
                        @SuppressWarnings("UnusedAssignment")
                        String header = "";
                        @SuppressWarnings("UnusedAssignment")
                        String footer = "";

                        if (!linhas.isEmpty()) {
                            int size = linhas.size();

                            header = linhas.get(0).substring(1, linhas.get(0).length());
                            footer = linhas.get(size - 2).substring(1, linhas.get(size - 2).length());;

                            System.out.println("============= HEADER");
                            System.out.println(header);

                            String enti = header.substring(0, 5);
                            String dataCriacaoFicheiro = header.substring(5, 13);

                            String dia = dataCriacaoFicheiro.substring(0, 2);
                            String mes = dataCriacaoFicheiro.substring(2, 4);
                            String ano = dataCriacaoFicheiro.substring(4, dataCriacaoFicheiro.length());

                            String idFicheiro = header.substring(13, header.length());

                            System.out.println("Entidade: " + enti);
                            System.out.println("Data criação: " + dataCriacaoFicheiro + " - (" + dia + "/" + mes + "/" + ano + ")");
                            System.out.println("Id Ficheiro: " + idFicheiro);

                            if (size > 1) {

                                System.out.println("============= OUTRAS LINHAS");
                                for (int i = 1; i < size - 2; i++) {

                                    String str = linhas.get(i).substring(1, linhas.get(i).length());

                                    System.out.println("====== PAGAMENTO " + i);
                                    System.out.println(str);

                                    String test = "01875081156 0000000000572000 0000000000000500 20072017 185300 0000000";

                                    String referencia = str.substring(0, 11);
                                    String valor = str.substring(11, 27);
                                    String comissao = str.substring(27, 43);
                                    String dte = str.substring(43, 51);
                                    String diaX = dte.substring(0, 2);
                                    String mesX = dte.substring(2, 4);
                                    String anoX = dte.substring(4, dte.length());

                                    String hora = str.substring(51, 57);
                                    String horaX = hora.substring(0, 2);
                                    String minX = hora.substring(2, 4);
                                    String segX = hora.substring(4, hora.length());

                                    System.out.println("Referência: " + referencia);
                                    System.out.println("Valor: " + valor + " - (" + df.format(Double.parseDouble(valor) / 100) + ")");
                                    System.out.println("Comissao: " + comissao + " - (" + df.format(Double.parseDouble(comissao) / 100) + ")");
                                    System.out.println("Data: " + dte + " - (" + diaX + "/" + mesX + "/" + anoX + ")");
                                    System.out.println("hora: " + hora + " - (" + horaX + ":" + minX + ":" + segX + ")");

                                    Importacao importacao = new Importacao();
                                    importacao.setComissao(Double.parseDouble(comissao) / 100);
                                    importacao.setData(diaX + "/" + mesX + "/" + anoX);
                                    importacao.setHora(horaX + ":" + minX + ":" + segX);
                                    importacao.setRef(referencia);
                                    importacao.setValor(Double.parseDouble(valor) / 100);

                                    importacoes.add(importacao);

                                }
                            }

                            System.out.println("============= FOOTER");
                            System.out.println(footer);

                            String strRegistos = footer.substring(1, 7);
                            int numRegitos = Integer.parseInt(strRegistos);
                            System.out.println("Número total de registos: " + strRegistos + " - (" + numRegitos + ")");

                            String strPagamentos = footer.substring(8, 23);
                            double totalPagamentos = Double.parseDouble(strPagamentos) / 100;
                            System.out.println("Valor total pagamentos feitos: " + strPagamentos + " - (" + df.format(totalPagamentos) + ")");

                            String strComissao = footer.substring(23, footer.length());
                            double totalComissao = Double.parseDouble(strComissao) / 100;
                            System.out.println("Valor total das comissões: " + strComissao + " - (" + df.format(totalComissao) + ")");

                        }
                    }
                    request.getSession().setAttribute("importacoes", importacoes);
                    request.getSession().setAttribute("nomeFich", nomeFich);

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("payment-online");
                }
                ;
                break;

                case "situacao-referencias": {

                    data.le_hora();

                    String anoPesquisa = data.getAno();
                    String mesPesquisa = data.getMesId();

                    if (request.getParameter("anoPesquisa") != null) {
                        anoPesquisa = request.getParameter("anoPesquisa");
                    }

                    if (request.getParameter("mesPesquisa") != null) {
                        mesPesquisa = request.getParameter("mesPesquisa");
                    }

                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosData(entidade, anoPesquisa + "-" + mesPesquisa);

                    request.getSession().setAttribute("pagamentosPeriodo", pagamentos);
                    request.getSession().setAttribute("anoPesquisa", anoPesquisa);
                    request.getSession().setAttribute("mesPesquisa", mesPesquisa);

                    response.sendRedirect("payment-ref-status");
                }
                ;
                break;

                case "2a-via": {

                    data.le_hora();

                    String anoPesquisa = data.getAno();
                    String mesPesquisa = data.getMesId();

                    if (request.getParameter("anoPesquisa") != null) {
                        anoPesquisa = request.getParameter("anoPesquisa");
                    }

                    if (request.getParameter("mesPesquisa") != null) {
                        mesPesquisa = request.getParameter("mesPesquisa");
                    }

                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosData(entidade, anoPesquisa + "-" + mesPesquisa);

                    request.getSession().setAttribute("pagamentosPeriodo", pagamentos);
                    request.getSession().setAttribute("anoPesquisa", anoPesquisa);
                    request.getSession().setAttribute("mesPesquisa", mesPesquisa);

                    response.sendRedirect("payment-sec-way");
                }
                ;
                break;

                case "gerar-2a-via": {

                    data.le_hora();

                    String anoPesquisa = data.getAno();
                    String mesPesquisa = data.getMesId();

                    if (request.getSession().getAttribute("anoPesquisa") != null) {
                        anoPesquisa = request.getSession().getAttribute("anoPesquisa").toString();
                    }

                    if (request.getSession().getAttribute("anoPesquisa") != null) {
                        mesPesquisa = request.getSession().getAttribute("mesPesquisa").toString();
                    }

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Pagamento pagamento = contabilidadeCtrl.buscaPagamentoId(id);
                    pagamento.setPagEstado(encryptUtils.encodeString("Cancelado"));

                    contabilidadeCtrl.persistirPagamento(pagamento);

                    String dataPagamento = request.getParameter("dataPagamento");
                    double multa = Double.parseDouble(request.getParameter("multa"));

                    double valor = pagamento.getPagValor();
                    multa = valor * (multa / 100.0f);

                    XMLGregorianCalendar calendar = getDate(dataPagamento);

                    Calendar calLimite = Calendar.getInstance();
                    calLimite.setTime(calendar.toGregorianCalendar().getTime());
                    calLimite.add(Calendar.DATE, 15);

                    GregorianCalendar gcLimite = new GregorianCalendar();
                    gcLimite.setGregorianChange(calLimite.getTime());
                    XMLGregorianCalendar calendarLimite = new XMLGregorianCalendarImpl(gcLimite);

                    String sgl = encryptUtils.decodeString(entidade.getEntiSigla()).toUpperCase();

                    Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(data.getAno()));

                    referencia.setRefPagamento(referencia.getRefPagamento() + 1);

                    String refPag = "Pagamento Nº " + referencia.getRefPagamento() + "/" + sgl + data.getAno();

                    Pagamento p = new Pagamento();
                    p.setEncrypted(true);
                    p.setEntidade(entidade);
                    p.setOnline(false);
                    p.setPagDescricao(pagamento.getPagDescricao());
                    p.setPagOrigem(encryptUtils.encodeString("Sistema"));
                    p.setPagCondicao(encryptUtils.encodeString("Pendente"));
                    p.setPagEstado(encryptUtils.encodeString("Pendente"));
                    p.setPagReferencia(encryptUtils.encodeString(refPag));
                    p.setPagData(calendar);
                    p.setPagDataLimite(calendarLimite);
                    p.setPagCategorizacao(pagamento.getPagCategorizacao());
                    p.setPagValor(valor + multa);
                    p.setPagStatus(false);
                    p.setPessoa(pagamento.getPessoa());

                    contabilidadeCtrl.persistirPagamento(p);

                    p = contabilidadeCtrl.buscaPagamentoDescricao(entidade, encryptUtils.encodeString(refPag));

                    String codigo = encryptUtils.decodeString(pagamento.getInscricao().getAluno().getAlunBadgnumber());

                    String enti = "98100";

                    SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
                    SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyy");

                    String dte = sdf.format(p.getPagData().toGregorianCalendar().getTime());
                    StringTokenizer st2 = new StringTokenizer(dte, "/");

                    String mes = st2.nextToken();
                    String ano = st2.nextToken();
                    String montante = (p.getPagValor() * 100) + "";

                    String dataLimite = sdf2.format(new Date());

                    if (p.getPagDataLimite() != null) {
                        dataLimite = sdf2.format(p.getPagDataLimite().toGregorianCalendar().getTime());
                    }

                    String ref = enti + codigo + mes + montante;

                    int pi = 0;

                    for (int x = 0; x < ref.length(); x++) {
                        int si = Character.getNumericValue(ref.charAt(x)) + pi;
                        pi = (si * 10) % 97;

                    }

                    int pn = (pi * 10) % 97;

                    System.out.println("PN: " + pn);

                    String chk = (98 - pn) + "";

                    if ((98 - pn) < 10) {
                        chk = "0" + (98 - pn);
                    }

                    String referenciaFinal = codigo + mes + chk;

                    System.out.println(referenciaFinal + "  | T: " + referenciaFinal.length());

                    p.setInscricao(pagamento.getInscricao());

                    if (pagamento.getInscricao().getTurma() != null) {
                        p.setTurma(pagamento.getInscricao().getTurma());
                    }

                    p.setPagRefOnline(encryptUtils.encodeString(referenciaFinal));

                    contabilidadeCtrl.persistirPagamento(p);

                    vendasCtrl.persistirReferencia(referencia);

                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosData(entidade, anoPesquisa + "-" + mesPesquisa);

                    String msgErro = "Referência: " + ref + ", gerada com sucesso";
                    String alerta = "bg-success";

                    request.getSession().setAttribute("pagamentosPeriodo", pagamentos);
                    request.getSession().setAttribute("anoPesquisa", anoPesquisa);
                    request.getSession().setAttribute("mesPesquisa", mesPesquisa);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("payment-sec-way");

                }
                ;
                break;

                case "taxas": {

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou a actualização de taxas"));

                    List<Taxa> taxas = ensinoCtrl.listaTaxas(entidade);

                    request.getSession().setAttribute("taxa", null);
                    request.getSession().setAttribute("taxas", taxas);
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("valor", "");

                    response.sendRedirect("payment-tax");

                }
                ;
                break;

                case "registar-taxa": {

                    String descricao = getString(request.getParameter("descricao"));
                    String valor = getString(request.getParameter("valor"));

                    String msgErro = "[TAXA] : " + descricao + " adicionada com sucesso ";
                    String alerta = "bg-success";

                    Taxa taxa = ensinoCtrl.buscaTaxaDescricao(entidade, encryptUtils.encodeString(descricao));

                    if (taxa != null) {
                        msgErro = "[TAXA] : " + descricao + " já existe registada";
                        alerta = "bg-warning";
                    } else {

                        taxa = new Taxa();
                        taxa.setTaxaValor(Double.parseDouble(valor));
                        taxa.setTaxaDescricao(encryptUtils.encodeString(descricao));
                        taxa.setEntidade(entidade);
                        taxa.setEncrypted(true);

                        ensinoCtrl.persistirTaxa(taxa);
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Adicionou com sucesso a taxa com a descrição : " + descricao));
                        request.getSession().setAttribute("taxas", ensinoCtrl.listaTaxas(entidade));

                        descricao = "";
                        valor = "";

                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    request.getSession().setAttribute("descricao", descricao);
                    request.getSession().setAttribute("valor", valor);

                    response.sendRedirect("payment-tax");

                }
                ;
                break;

                case "remover-taxa": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    Taxa taxa = ensinoCtrl.buscaTaxaId(id);

                    String msgErro = "[TAXA]: " + encryptUtils.decodeString(taxa.getTaxaDescricao()) + ""
                            + " removida com sucesso";
                    String alerta = "bg-success";

                    ensinoCtrl.removerTaxa(taxa);

                    List<Taxa> taxas = ensinoCtrl.listaTaxas(entidade);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Removeu com sucesso o familia equipamento com a descrição : " + encryptUtils.decodeString(taxa.getTaxaDescricao())));

                    request.getSession().setAttribute("taxas", taxas);
                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("payment-tax");
                }
                ;
                break;

                case "editar-taxa": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);
                    Taxa taxa = ensinoCtrl.buscaTaxaId(id);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Selecionou para edição a taxa com o id: " + id));

                    request.getSession().setAttribute("taxa", taxa);
                    response.sendRedirect("payment-tax");
                }
                ;
                break;

                case "confirma-editar-taxa": {

                    String descricao = getString(request.getParameter("descricao"));
                    String valor = getString(request.getParameter("valor"));

                    Taxa taxaCheck = ensinoCtrl.buscaTaxaDescricao(entidade, encryptUtils.encodeString(descricao));

                    String msgErro = "Dados do taxa actualizados com sucesso";
                    String alerta = "bg-success";

                    Taxa taxa = (Taxa) request.getSession().getAttribute("taxa");

                    if (taxaCheck == null || encryptUtils.decodeString(taxa.getTaxaDescricao()).equals(descricao)) {

                        taxa.setTaxaDescricao(encryptUtils.encodeString(descricao));
                        taxa.setTaxaValor(Double.parseDouble(valor));

                        ensinoCtrl.persistirTaxa(taxa);
                        controleAcessoCtrl.persistirLog(addLog(usuario, "Alterou com sucesso os dados da taxa com o id : " + taxa.getTaxaId()));
                        request.getSession().setAttribute("taxas", ensinoCtrl.listaTaxas(entidade));

                    } else {

                        msgErro = "Já existe um taxa com essa descrição";
                        alerta = "bg-warning";

                    }

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);

                    response.sendRedirect("payment-tax");
                }
                ;
                break;

                case "cancelar-edicao-taxa": {
                    request.getSession().setAttribute("taxas", (List<Taxa>) request.getSession().getAttribute("taxas"));
                    request.getSession().setAttribute("descricao", "");
                    request.getSession().setAttribute("valor", "");
                    request.getSession().setAttribute("taxa", null);
                    response.sendRedirect("payment-tax");

                }
                ;
                break;

                case "imprimir-taxas": {
                    request.getSession().setAttribute("taxas", (List<Taxa>) request.getSession().getAttribute("taxas"));

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Imprimiu a listagem das taxas"));
                    response.sendRedirect("print-payment-tax");

                }
                ;
                break;

                case "imprimir-pagamento": {

                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    Pagamento pagamento = contabilidadeCtrl.buscaPagamentoId(id);

                    String ref = encryptUtils.decodeString(pagamento.getPagReferencia());

                    request.getSession().setAttribute("pagamento", pagamento);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Imprimiu o pagamento com a referência: " + ref));

                    response.sendRedirect("print-receipt-2");
                }
                ;
                break;

                case "recibosPagamentos": {

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

                    @SuppressWarnings("UnusedAssignment")
                    List<ReciboPagamento> recibosPagamentos = null;
                    Date dataHoje = new Date();
                    String periodo = sdf.format(dataHoje);
                    String dataSelecionada = sdf2.format(dataHoje) + " - " + sdf2.format(dataHoje);

                    if (request.getParameter("dataPesquisa") != null) {
                        String dataPesquisa = request.getParameter("dataPesquisa");
                        StringTokenizer tok = new StringTokenizer(dataPesquisa, " - ");
                        String d1 = tok.nextToken();
                        String d2 = tok.nextToken();

                        XMLGregorianCalendar calendar1 = getDate(d1);
                        XMLGregorianCalendar calendar2 = getDate(d2);

                        periodo = sdf.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf.format(calendar2.toGregorianCalendar().getTime());
                        dataSelecionada = sdf2.format(calendar1.toGregorianCalendar().getTime()) + " - " + sdf2.format(calendar2.toGregorianCalendar().getTime());

                        recibosPagamentos = contabilidadeCtrl.listaRecibosPagamentosPeriodo(entidade, sdf.format(calendar1.toGregorianCalendar().getTime()), sdf.format(calendar2.toGregorianCalendar().getTime()));
                    } else {
                        recibosPagamentos = contabilidadeCtrl.listaRecibosPagamentosData(entidade, sdf.format(dataHoje));
                    }

                    request.getSession().setAttribute("recibosPagamentos", recibosPagamentos);
                    request.getSession().setAttribute("periodo", periodo);
                    request.getSession().setAttribute("dataSelecionada", dataSelecionada);

                    controleAcessoCtrl.persistirLog(addLog(usuario, "Visualizou o extracto de recibos de pagamentos para o periodo : " + periodo));

                    response.sendRedirect("receipt-2");
                }
                ;
                break;

                case "imprimir-reciboPagamento": {
                    int id = Integer.parseInt(st.nextToken().split("=")[1]);

                    ReciboPagamento reciboPagamento = contabilidadeCtrl.buscaReciboPagamentoId(id);

                    String nomeCli = "sem cliente";

                    Aluno aluno = null;

                    if (reciboPagamento.getPessoa() != null) {
                        nomeCli = encryptUtils.decodeString(reciboPagamento.getPessoa().getPessNome());

                        aluno = ensinoCtrl.buscaAlunoPessoaId(reciboPagamento.getPessoa().getPessId());
                    }

                    nomeCli = nomeCli.replace(' ', '_');

                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");

                    Date dataF = reciboPagamento.getRecpData().toGregorianCalendar().getTime();
                    String sgl = encryptUtils.decodeString(reciboPagamento.getEntidade().getEntiSigla()).toUpperCase();

                    long lancamento = reciboPagamento.getRecpLancamento();

                    List<Pagamento> pagamentos = contabilidadeCtrl.listaPagamentosRecibo(entidade, reciboPagamento);

                    String title = "rc_n" + lancamento + "_" + (sgl + "" + sdf1.format(dataF)) + "_Original_" + nomeCli + "_" + sdf.format(new Date());

                    request.getSession().setAttribute("reciboPagamento", reciboPagamento);
                    request.getSession().setAttribute("aluno", aluno);
                    request.getSession().setAttribute("pagamentos", pagamentos);
                    request.getSession().setAttribute("title", title);
                    controleAcessoCtrl.persistirLog(addLog(usuario, "Imprimiu o recibo de pagamento com o id  : " + id));

                    response.sendRedirect("print-receipt-3");
                }
                ;
                break;

                case "pagamentos-manual": {
                    response.sendRedirect("payment-manual");
                }
                ;
                break;

                case "gerar-pagamentos": {

                    String mesPesquisa = getString(request.getParameter("mesPesquisa"));
                    String anoPesquisa = getString(request.getParameter("anoPesquisa"));
                    int percentagem = Integer.parseInt(getString(request.getParameter("percentagem")));
                    String descricao = getString(request.getParameter("descricao"));

                    String dataPagamento = "05/" + mesPesquisa + "/" + anoPesquisa;

                    List<Inscricao> inscricoes = ensinoCtrl.listaInscricoesAno(entidade, encryptUtils.encodeString(anoPesquisa));

                    List<Pagamento> pagamentos = new ArrayList();
                    int i = 0;

                    if (inscricoes != null) {
                        for (Inscricao inscricao : inscricoes) {
                            XMLGregorianCalendar calendarPag = getDate(dataPagamento);

                            i++;

                            data.le_hora();
                            String ano = data.getAno();

                            Referencia referencia = vendasCtrl.buscaReferencia(codEscola, encryptUtils.encodeString(ano));

                            String sgl = encryptUtils.decodeString(entidade.getEntiSigla()).toUpperCase();

                            referencia.setRefPagamento(referencia.getRefPagamento() + 1);

                            vendasCtrl.persistirReferencia(referencia);

                            String refPag = "Pagamento Nº " + referencia.getRefPagamento() + "/" + sgl + ano;

                            double custo = inscricao.getTurma().getCurso().getCursPreco();

                            custo = (custo * percentagem) / 100;

                            Pagamento p = new Pagamento();
                            p.setEncrypted(true);
                            p.setEntidade(entidade);
                            p.setOnline(false);
                            p.setPagDescricao(encryptUtils.encodeString(descricao));
                            p.setPagOrigem(encryptUtils.encodeString("Sistema"));
                            p.setPagCondicao(encryptUtils.encodeString("Pendente"));
                            p.setPagEstado(encryptUtils.encodeString("Pendente"));
                            p.setPagData(calendarPag);
                            p.setPagCategorizacao(encryptUtils.encodeString("Mensalidade"));
                            p.setPagValor(custo);
                            p.setPagStatus(true);
                            p.setPessoa(inscricao.getAluno().getPessoa());
                            p.setInscricao(inscricao);
                            p.setTurma(inscricao.getTurma());
                            p.setPagReferencia(encryptUtils.encodeString(refPag));

                            contabilidadeCtrl.persistirPagamento(p);

                            p = contabilidadeCtrl.buscaPagamentoDescricao(entidade, encryptUtils.encodeString(refPag));

                            String codigo = encryptUtils.decodeString(inscricao.getAluno().getAlunBadgnumber());

                            String enti = "98100";

                            SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
                            SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");

                            String dte = sdf.format(p.getPagData().toGregorianCalendar().getTime());
                            StringTokenizer st2 = new StringTokenizer(dte, "/");

                            String mes = st2.nextToken();
                            String anoRef = st2.nextToken();
                            String montante = (p.getPagValor() * 100) + "";

                            String dataLimite = sdf2.format(new Date());

                            if (p.getPagDataLimite() != null) {
                                dataLimite = sdf2.format(p.getPagDataLimite().toGregorianCalendar().getTime());
                            }

                            String ref = ibanCtrl.referenciaPagamento(enti, codigo, mes, anoRef, dataLimite, montante);

                            //  ref = ref.substring(1, ref.length());
                            System.out.println(ref + "  | T: " + ref.length());

                            p.setPagRefOnline(encryptUtils.encodeString(ref));

                            contabilidadeCtrl.persistirPagamento(p);

                            pagamentos.add(p);
                        }
                    }

                    String msgErro = "Gerado(s) " + i + " pagamentos com sucesso";
                    String alerta = "bg-success";

                    request.getSession().setAttribute("msgErro", msgErro);
                    request.getSession().setAttribute("alerta", alerta);
                    request.getSession().setAttribute("pagamentosGerados", pagamentos);

                    response.sendRedirect("payment-manual");
                }
                ;
                break;

            }
        } catch (Exception exception) {

            Data d = new Data();
            d.le_hora();

            ExceptionWriter ew = new ExceptionWriter();

            String datetime = d.getAno() + "_" + d.getMesString() + "_" + d.getDia() + "_" + d.getHora() + d.getMinuto() + d.getSegundo();
            String msg = "Ocorreu um excepção do tipo:<br>" + ew.getStackTrace(exception);
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

    public XMLGregorianCalendar getDate(String data) {

        StringTokenizer st = new StringTokenizer(data, "/");
        String dt = st.nextToken();
        if (dt.startsWith("0")) {
            dt = dt.charAt(dt.length() - 1) + "";
        }
        int day = Integer.parseInt(dt);
        int month = Integer.parseInt(st.nextToken()) - 1;
        int year = Integer.parseInt(st.nextToken());

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month, day);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        return calendar;
    }

    private Pagamento getProximoPagamentoNaoPago(List<Pagamento> pagamentos, Inscricao inscricao) {
        Pagamento pagamento = null;

        for (Pagamento pm : pagamentos) {

            if (!pm.isPagStatus()) {
                if (pm.getInscricao().getInscReferencia().equals(inscricao.getInscReferencia())) {

                    String estado = "";

                    if (pm.getPagEstado() != null) {
                        estado = encryptUtils.decodeString(pm.getPagEstado());
                    }

                    if (!estado.equals("Cancelado")) {
                        pagamento = pm;

                        break;
                    }

                }
            }
        }
        return pagamento;
    }

    private PInscricao getPInscricao(List<PInscricao> pinscricoes, int id) {
        PInscricao pInscricao = null;

        for (PInscricao pi : pinscricoes) {

            if (pi.getPagamento() != null) {
                if (pi.getPagamento().getPagId() == id) {
                    pInscricao = pi;
                }
            }
        }

        return pInscricao;
    }

    private Inscricao getInsicricao(List<Inscricao> inscricoes, int id) {
        Inscricao inscricao = null;

        for (Inscricao i : inscricoes) {
            if (i.getInscId() == id) {
                inscricao = i;
            }
        }
        return inscricao;
    }

    private List<Pagamento> getPagamentosTurma(List<Pagamento> pagamentos, Turma turma) {
        List<Pagamento> values = new ArrayList();

        for (Pagamento p : pagamentos) {
            if (p.getTurma() != null) {
                if (p.getTurma().getTurmId() == turma.getTurmId()) {
                    values.add(p);
                }
            }
        }

        return values;
    }

    private List<Pagamento> getPagamentosPeriodo(List<Pagamento> pagamentos, String periodo) {
        List<Pagamento> values = new ArrayList();

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM");

        for (Pagamento p : pagamentos) {

            String dte = sdf2.format(p.getPagData().toGregorianCalendar().getTime());

            if (dte.equals(periodo)) {
                values.add(p);
            }
        }

        return values;
    }

    private String getUrlServer() {
        String urlServer = "localhost";
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\SETTINGS\\ip.txt"))) {
                urlServer = br.readLine();
            }
        } catch (IOException exception) {

        }

        return urlServer;
    }

    private List<String> readFile(String txt) {

        List<String> linhas = new ArrayList();

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(txt))) {
                String linha = br.readLine();

                while (linha != null) {

                    linhas.add(linha);
                    linha = br.readLine();
                }
            }
        } catch (IOException exception) {

        }

        return linhas;
    }

    private String getString(String str) {
        String s = str;
        if (s == null) {
            s = "N/D";
        } else if (s.isEmpty()) {
            s = "N/D";
        }

        return s.toUpperCase();
    }

    private Inscricao getInscricao(List<Inscricao> inscricoes, int id) {
        Inscricao inscricao = null;

        for (Inscricao i : inscricoes) {
            if (i.getInscId() == id) {
                inscricao = i;
            }
        }

        return inscricao;
    }

}
