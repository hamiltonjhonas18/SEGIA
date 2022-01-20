
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ref_adenda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_ano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref_banco" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_bordos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_budget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_cliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_compras" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_contrato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_curso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_deposito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_despesa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_diario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_disciplina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_docente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_documento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_entidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref_estudante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_estudanteAprovacoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_estudanteDispensas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_estudanteExclusoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_estudanteReprovacoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_extractoCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_extractoStockArtigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_extractoStockGeral" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_factura" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_facturaProForma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_faltas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_faltasJustificadas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_fecho" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_fornecedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_funcionario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_guia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_guiaAbate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_guiaEntrada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_guiaRemessa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_inscricoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_lancamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_lembrete" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_movimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_notaCredito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_notaDebito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_pagamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_pagamentos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_pety" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_petycash" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_processamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_recibo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_reciboPagamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_requisicao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_requisicaoCheque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_salario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_turma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_vendaDinheiro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ref_vendas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referencia", propOrder = {
    "refAdenda",
    "refAno",
    "refBanco",
    "refBordos",
    "refBudget",
    "refCliente",
    "refCompras",
    "refContrato",
    "refCurso",
    "refDeposito",
    "refDespesa",
    "refDiario",
    "refDisciplina",
    "refDocente",
    "refDocumento",
    "refEntidade",
    "refEstudante",
    "refEstudanteAprovacoes",
    "refEstudanteDispensas",
    "refEstudanteExclusoes",
    "refEstudanteReprovacoes",
    "refExtractoCliente",
    "refExtractoStockArtigo",
    "refExtractoStockGeral",
    "refFactura",
    "refFacturaProForma",
    "refFaltas",
    "refFaltasJustificadas",
    "refFecho",
    "refFornecedor",
    "refFuncionario",
    "refGuia",
    "refGuiaAbate",
    "refGuiaEntrada",
    "refGuiaRemessa",
    "refId",
    "refInscricoes",
    "refLancamento",
    "refLembrete",
    "refMovimento",
    "refNotaCredito",
    "refNotaDebito",
    "refPagamento",
    "refPagamentos",
    "refPety",
    "refPetycash",
    "refProcessamento",
    "refRecibo",
    "refReciboPagamento",
    "refRequisicao",
    "refRequisicaoCheque",
    "refSalario",
    "refTurma",
    "refVendaDinheiro",
    "refVendas"
})
public class Referencia {

    @XmlElement(name = "ref_adenda")
    protected int refAdenda;
    @XmlElement(name = "ref_ano")
    protected String refAno;
    @XmlElement(name = "ref_banco")
    protected int refBanco;
    @XmlElement(name = "ref_bordos")
    protected int refBordos;
    @XmlElement(name = "ref_budget")
    protected int refBudget;
    @XmlElement(name = "ref_cliente")
    protected int refCliente;
    @XmlElement(name = "ref_compras")
    protected int refCompras;
    @XmlElement(name = "ref_contrato")
    protected int refContrato;
    @XmlElement(name = "ref_curso")
    protected int refCurso;
    @XmlElement(name = "ref_deposito")
    protected int refDeposito;
    @XmlElement(name = "ref_despesa")
    protected int refDespesa;
    @XmlElement(name = "ref_diario")
    protected int refDiario;
    @XmlElement(name = "ref_disciplina")
    protected int refDisciplina;
    @XmlElement(name = "ref_docente")
    protected int refDocente;
    @XmlElement(name = "ref_documento")
    protected int refDocumento;
    @XmlElement(name = "ref_entidade")
    protected String refEntidade;
    @XmlElement(name = "ref_estudante")
    protected int refEstudante;
    @XmlElement(name = "ref_estudanteAprovacoes")
    protected int refEstudanteAprovacoes;
    @XmlElement(name = "ref_estudanteDispensas")
    protected int refEstudanteDispensas;
    @XmlElement(name = "ref_estudanteExclusoes")
    protected int refEstudanteExclusoes;
    @XmlElement(name = "ref_estudanteReprovacoes")
    protected int refEstudanteReprovacoes;
    @XmlElement(name = "ref_extractoCliente")
    protected int refExtractoCliente;
    @XmlElement(name = "ref_extractoStockArtigo")
    protected int refExtractoStockArtigo;
    @XmlElement(name = "ref_extractoStockGeral")
    protected int refExtractoStockGeral;
    @XmlElement(name = "ref_factura")
    protected int refFactura;
    @XmlElement(name = "ref_facturaProForma")
    protected int refFacturaProForma;
    @XmlElement(name = "ref_faltas")
    protected int refFaltas;
    @XmlElement(name = "ref_faltasJustificadas")
    protected int refFaltasJustificadas;
    @XmlElement(name = "ref_fecho")
    protected int refFecho;
    @XmlElement(name = "ref_fornecedor")
    protected int refFornecedor;
    @XmlElement(name = "ref_funcionario")
    protected int refFuncionario;
    @XmlElement(name = "ref_guia")
    protected int refGuia;
    @XmlElement(name = "ref_guiaAbate")
    protected int refGuiaAbate;
    @XmlElement(name = "ref_guiaEntrada")
    protected int refGuiaEntrada;
    @XmlElement(name = "ref_guiaRemessa")
    protected int refGuiaRemessa;
    @XmlElement(name = "ref_id")
    protected int refId;
    @XmlElement(name = "ref_inscricoes")
    protected int refInscricoes;
    @XmlElement(name = "ref_lancamento")
    protected int refLancamento;
    @XmlElement(name = "ref_lembrete")
    protected int refLembrete;
    @XmlElement(name = "ref_movimento")
    protected int refMovimento;
    @XmlElement(name = "ref_notaCredito")
    protected int refNotaCredito;
    @XmlElement(name = "ref_notaDebito")
    protected int refNotaDebito;
    @XmlElement(name = "ref_pagamento")
    protected int refPagamento;
    @XmlElement(name = "ref_pagamentos")
    protected int refPagamentos;
    @XmlElement(name = "ref_pety")
    protected int refPety;
    @XmlElement(name = "ref_petycash")
    protected int refPetycash;
    @XmlElement(name = "ref_processamento")
    protected int refProcessamento;
    @XmlElement(name = "ref_recibo")
    protected int refRecibo;
    @XmlElement(name = "ref_reciboPagamento")
    protected int refReciboPagamento;
    @XmlElement(name = "ref_requisicao")
    protected int refRequisicao;
    @XmlElement(name = "ref_requisicaoCheque")
    protected int refRequisicaoCheque;
    @XmlElement(name = "ref_salario")
    protected int refSalario;
    @XmlElement(name = "ref_turma")
    protected int refTurma;
    @XmlElement(name = "ref_vendaDinheiro")
    protected int refVendaDinheiro;
    @XmlElement(name = "ref_vendas")
    protected int refVendas;

    /**
     * Gets the value of the refAdenda property.
     * 
     */
    public int getRefAdenda() {
        return refAdenda;
    }

    /**
     * Sets the value of the refAdenda property.
     * 
     */
    public void setRefAdenda(int value) {
        this.refAdenda = value;
    }

    /**
     * Gets the value of the refAno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefAno() {
        return refAno;
    }

    /**
     * Sets the value of the refAno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefAno(String value) {
        this.refAno = value;
    }

    /**
     * Gets the value of the refBanco property.
     * 
     */
    public int getRefBanco() {
        return refBanco;
    }

    /**
     * Sets the value of the refBanco property.
     * 
     */
    public void setRefBanco(int value) {
        this.refBanco = value;
    }

    /**
     * Gets the value of the refBordos property.
     * 
     */
    public int getRefBordos() {
        return refBordos;
    }

    /**
     * Sets the value of the refBordos property.
     * 
     */
    public void setRefBordos(int value) {
        this.refBordos = value;
    }

    /**
     * Gets the value of the refBudget property.
     * 
     */
    public int getRefBudget() {
        return refBudget;
    }

    /**
     * Sets the value of the refBudget property.
     * 
     */
    public void setRefBudget(int value) {
        this.refBudget = value;
    }

    /**
     * Gets the value of the refCliente property.
     * 
     */
    public int getRefCliente() {
        return refCliente;
    }

    /**
     * Sets the value of the refCliente property.
     * 
     */
    public void setRefCliente(int value) {
        this.refCliente = value;
    }

    /**
     * Gets the value of the refCompras property.
     * 
     */
    public int getRefCompras() {
        return refCompras;
    }

    /**
     * Sets the value of the refCompras property.
     * 
     */
    public void setRefCompras(int value) {
        this.refCompras = value;
    }

    /**
     * Gets the value of the refContrato property.
     * 
     */
    public int getRefContrato() {
        return refContrato;
    }

    /**
     * Sets the value of the refContrato property.
     * 
     */
    public void setRefContrato(int value) {
        this.refContrato = value;
    }

    /**
     * Gets the value of the refCurso property.
     * 
     */
    public int getRefCurso() {
        return refCurso;
    }

    /**
     * Sets the value of the refCurso property.
     * 
     */
    public void setRefCurso(int value) {
        this.refCurso = value;
    }

    /**
     * Gets the value of the refDeposito property.
     * 
     */
    public int getRefDeposito() {
        return refDeposito;
    }

    /**
     * Sets the value of the refDeposito property.
     * 
     */
    public void setRefDeposito(int value) {
        this.refDeposito = value;
    }

    /**
     * Gets the value of the refDespesa property.
     * 
     */
    public int getRefDespesa() {
        return refDespesa;
    }

    /**
     * Sets the value of the refDespesa property.
     * 
     */
    public void setRefDespesa(int value) {
        this.refDespesa = value;
    }

    /**
     * Gets the value of the refDiario property.
     * 
     */
    public int getRefDiario() {
        return refDiario;
    }

    /**
     * Sets the value of the refDiario property.
     * 
     */
    public void setRefDiario(int value) {
        this.refDiario = value;
    }

    /**
     * Gets the value of the refDisciplina property.
     * 
     */
    public int getRefDisciplina() {
        return refDisciplina;
    }

    /**
     * Sets the value of the refDisciplina property.
     * 
     */
    public void setRefDisciplina(int value) {
        this.refDisciplina = value;
    }

    /**
     * Gets the value of the refDocente property.
     * 
     */
    public int getRefDocente() {
        return refDocente;
    }

    /**
     * Sets the value of the refDocente property.
     * 
     */
    public void setRefDocente(int value) {
        this.refDocente = value;
    }

    /**
     * Gets the value of the refDocumento property.
     * 
     */
    public int getRefDocumento() {
        return refDocumento;
    }

    /**
     * Sets the value of the refDocumento property.
     * 
     */
    public void setRefDocumento(int value) {
        this.refDocumento = value;
    }

    /**
     * Gets the value of the refEntidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefEntidade() {
        return refEntidade;
    }

    /**
     * Sets the value of the refEntidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefEntidade(String value) {
        this.refEntidade = value;
    }

    /**
     * Gets the value of the refEstudante property.
     * 
     */
    public int getRefEstudante() {
        return refEstudante;
    }

    /**
     * Sets the value of the refEstudante property.
     * 
     */
    public void setRefEstudante(int value) {
        this.refEstudante = value;
    }

    /**
     * Gets the value of the refEstudanteAprovacoes property.
     * 
     */
    public int getRefEstudanteAprovacoes() {
        return refEstudanteAprovacoes;
    }

    /**
     * Sets the value of the refEstudanteAprovacoes property.
     * 
     */
    public void setRefEstudanteAprovacoes(int value) {
        this.refEstudanteAprovacoes = value;
    }

    /**
     * Gets the value of the refEstudanteDispensas property.
     * 
     */
    public int getRefEstudanteDispensas() {
        return refEstudanteDispensas;
    }

    /**
     * Sets the value of the refEstudanteDispensas property.
     * 
     */
    public void setRefEstudanteDispensas(int value) {
        this.refEstudanteDispensas = value;
    }

    /**
     * Gets the value of the refEstudanteExclusoes property.
     * 
     */
    public int getRefEstudanteExclusoes() {
        return refEstudanteExclusoes;
    }

    /**
     * Sets the value of the refEstudanteExclusoes property.
     * 
     */
    public void setRefEstudanteExclusoes(int value) {
        this.refEstudanteExclusoes = value;
    }

    /**
     * Gets the value of the refEstudanteReprovacoes property.
     * 
     */
    public int getRefEstudanteReprovacoes() {
        return refEstudanteReprovacoes;
    }

    /**
     * Sets the value of the refEstudanteReprovacoes property.
     * 
     */
    public void setRefEstudanteReprovacoes(int value) {
        this.refEstudanteReprovacoes = value;
    }

    /**
     * Gets the value of the refExtractoCliente property.
     * 
     */
    public int getRefExtractoCliente() {
        return refExtractoCliente;
    }

    /**
     * Sets the value of the refExtractoCliente property.
     * 
     */
    public void setRefExtractoCliente(int value) {
        this.refExtractoCliente = value;
    }

    /**
     * Gets the value of the refExtractoStockArtigo property.
     * 
     */
    public int getRefExtractoStockArtigo() {
        return refExtractoStockArtigo;
    }

    /**
     * Sets the value of the refExtractoStockArtigo property.
     * 
     */
    public void setRefExtractoStockArtigo(int value) {
        this.refExtractoStockArtigo = value;
    }

    /**
     * Gets the value of the refExtractoStockGeral property.
     * 
     */
    public int getRefExtractoStockGeral() {
        return refExtractoStockGeral;
    }

    /**
     * Sets the value of the refExtractoStockGeral property.
     * 
     */
    public void setRefExtractoStockGeral(int value) {
        this.refExtractoStockGeral = value;
    }

    /**
     * Gets the value of the refFactura property.
     * 
     */
    public int getRefFactura() {
        return refFactura;
    }

    /**
     * Sets the value of the refFactura property.
     * 
     */
    public void setRefFactura(int value) {
        this.refFactura = value;
    }

    /**
     * Gets the value of the refFacturaProForma property.
     * 
     */
    public int getRefFacturaProForma() {
        return refFacturaProForma;
    }

    /**
     * Sets the value of the refFacturaProForma property.
     * 
     */
    public void setRefFacturaProForma(int value) {
        this.refFacturaProForma = value;
    }

    /**
     * Gets the value of the refFaltas property.
     * 
     */
    public int getRefFaltas() {
        return refFaltas;
    }

    /**
     * Sets the value of the refFaltas property.
     * 
     */
    public void setRefFaltas(int value) {
        this.refFaltas = value;
    }

    /**
     * Gets the value of the refFaltasJustificadas property.
     * 
     */
    public int getRefFaltasJustificadas() {
        return refFaltasJustificadas;
    }

    /**
     * Sets the value of the refFaltasJustificadas property.
     * 
     */
    public void setRefFaltasJustificadas(int value) {
        this.refFaltasJustificadas = value;
    }

    /**
     * Gets the value of the refFecho property.
     * 
     */
    public int getRefFecho() {
        return refFecho;
    }

    /**
     * Sets the value of the refFecho property.
     * 
     */
    public void setRefFecho(int value) {
        this.refFecho = value;
    }

    /**
     * Gets the value of the refFornecedor property.
     * 
     */
    public int getRefFornecedor() {
        return refFornecedor;
    }

    /**
     * Sets the value of the refFornecedor property.
     * 
     */
    public void setRefFornecedor(int value) {
        this.refFornecedor = value;
    }

    /**
     * Gets the value of the refFuncionario property.
     * 
     */
    public int getRefFuncionario() {
        return refFuncionario;
    }

    /**
     * Sets the value of the refFuncionario property.
     * 
     */
    public void setRefFuncionario(int value) {
        this.refFuncionario = value;
    }

    /**
     * Gets the value of the refGuia property.
     * 
     */
    public int getRefGuia() {
        return refGuia;
    }

    /**
     * Sets the value of the refGuia property.
     * 
     */
    public void setRefGuia(int value) {
        this.refGuia = value;
    }

    /**
     * Gets the value of the refGuiaAbate property.
     * 
     */
    public int getRefGuiaAbate() {
        return refGuiaAbate;
    }

    /**
     * Sets the value of the refGuiaAbate property.
     * 
     */
    public void setRefGuiaAbate(int value) {
        this.refGuiaAbate = value;
    }

    /**
     * Gets the value of the refGuiaEntrada property.
     * 
     */
    public int getRefGuiaEntrada() {
        return refGuiaEntrada;
    }

    /**
     * Sets the value of the refGuiaEntrada property.
     * 
     */
    public void setRefGuiaEntrada(int value) {
        this.refGuiaEntrada = value;
    }

    /**
     * Gets the value of the refGuiaRemessa property.
     * 
     */
    public int getRefGuiaRemessa() {
        return refGuiaRemessa;
    }

    /**
     * Sets the value of the refGuiaRemessa property.
     * 
     */
    public void setRefGuiaRemessa(int value) {
        this.refGuiaRemessa = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     */
    public int getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     */
    public void setRefId(int value) {
        this.refId = value;
    }

    /**
     * Gets the value of the refInscricoes property.
     * 
     */
    public int getRefInscricoes() {
        return refInscricoes;
    }

    /**
     * Sets the value of the refInscricoes property.
     * 
     */
    public void setRefInscricoes(int value) {
        this.refInscricoes = value;
    }

    /**
     * Gets the value of the refLancamento property.
     * 
     */
    public int getRefLancamento() {
        return refLancamento;
    }

    /**
     * Sets the value of the refLancamento property.
     * 
     */
    public void setRefLancamento(int value) {
        this.refLancamento = value;
    }

    /**
     * Gets the value of the refLembrete property.
     * 
     */
    public int getRefLembrete() {
        return refLembrete;
    }

    /**
     * Sets the value of the refLembrete property.
     * 
     */
    public void setRefLembrete(int value) {
        this.refLembrete = value;
    }

    /**
     * Gets the value of the refMovimento property.
     * 
     */
    public int getRefMovimento() {
        return refMovimento;
    }

    /**
     * Sets the value of the refMovimento property.
     * 
     */
    public void setRefMovimento(int value) {
        this.refMovimento = value;
    }

    /**
     * Gets the value of the refNotaCredito property.
     * 
     */
    public int getRefNotaCredito() {
        return refNotaCredito;
    }

    /**
     * Sets the value of the refNotaCredito property.
     * 
     */
    public void setRefNotaCredito(int value) {
        this.refNotaCredito = value;
    }

    /**
     * Gets the value of the refNotaDebito property.
     * 
     */
    public int getRefNotaDebito() {
        return refNotaDebito;
    }

    /**
     * Sets the value of the refNotaDebito property.
     * 
     */
    public void setRefNotaDebito(int value) {
        this.refNotaDebito = value;
    }

    /**
     * Gets the value of the refPagamento property.
     * 
     */
    public int getRefPagamento() {
        return refPagamento;
    }

    /**
     * Sets the value of the refPagamento property.
     * 
     */
    public void setRefPagamento(int value) {
        this.refPagamento = value;
    }

    /**
     * Gets the value of the refPagamentos property.
     * 
     */
    public int getRefPagamentos() {
        return refPagamentos;
    }

    /**
     * Sets the value of the refPagamentos property.
     * 
     */
    public void setRefPagamentos(int value) {
        this.refPagamentos = value;
    }

    /**
     * Gets the value of the refPety property.
     * 
     */
    public int getRefPety() {
        return refPety;
    }

    /**
     * Sets the value of the refPety property.
     * 
     */
    public void setRefPety(int value) {
        this.refPety = value;
    }

    /**
     * Gets the value of the refPetycash property.
     * 
     */
    public int getRefPetycash() {
        return refPetycash;
    }

    /**
     * Sets the value of the refPetycash property.
     * 
     */
    public void setRefPetycash(int value) {
        this.refPetycash = value;
    }

    /**
     * Gets the value of the refProcessamento property.
     * 
     */
    public int getRefProcessamento() {
        return refProcessamento;
    }

    /**
     * Sets the value of the refProcessamento property.
     * 
     */
    public void setRefProcessamento(int value) {
        this.refProcessamento = value;
    }

    /**
     * Gets the value of the refRecibo property.
     * 
     */
    public int getRefRecibo() {
        return refRecibo;
    }

    /**
     * Sets the value of the refRecibo property.
     * 
     */
    public void setRefRecibo(int value) {
        this.refRecibo = value;
    }

    /**
     * Gets the value of the refReciboPagamento property.
     * 
     */
    public int getRefReciboPagamento() {
        return refReciboPagamento;
    }

    /**
     * Sets the value of the refReciboPagamento property.
     * 
     */
    public void setRefReciboPagamento(int value) {
        this.refReciboPagamento = value;
    }

    /**
     * Gets the value of the refRequisicao property.
     * 
     */
    public int getRefRequisicao() {
        return refRequisicao;
    }

    /**
     * Sets the value of the refRequisicao property.
     * 
     */
    public void setRefRequisicao(int value) {
        this.refRequisicao = value;
    }

    /**
     * Gets the value of the refRequisicaoCheque property.
     * 
     */
    public int getRefRequisicaoCheque() {
        return refRequisicaoCheque;
    }

    /**
     * Sets the value of the refRequisicaoCheque property.
     * 
     */
    public void setRefRequisicaoCheque(int value) {
        this.refRequisicaoCheque = value;
    }

    /**
     * Gets the value of the refSalario property.
     * 
     */
    public int getRefSalario() {
        return refSalario;
    }

    /**
     * Sets the value of the refSalario property.
     * 
     */
    public void setRefSalario(int value) {
        this.refSalario = value;
    }

    /**
     * Gets the value of the refTurma property.
     * 
     */
    public int getRefTurma() {
        return refTurma;
    }

    /**
     * Sets the value of the refTurma property.
     * 
     */
    public void setRefTurma(int value) {
        this.refTurma = value;
    }

    /**
     * Gets the value of the refVendaDinheiro property.
     * 
     */
    public int getRefVendaDinheiro() {
        return refVendaDinheiro;
    }

    /**
     * Sets the value of the refVendaDinheiro property.
     * 
     */
    public void setRefVendaDinheiro(int value) {
        this.refVendaDinheiro = value;
    }

    /**
     * Gets the value of the refVendas property.
     * 
     */
    public int getRefVendas() {
        return refVendas;
    }

    /**
     * Sets the value of the refVendas property.
     * 
     */
    public void setRefVendas(int value) {
        this.refVendas = value;
    }

}
