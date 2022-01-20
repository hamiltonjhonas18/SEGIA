
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for factura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="factura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caixa" type="{http://webservice.centralserver.co.mz/}caixa" minOccurs="0"/>
 *         &lt;element name="conta" type="{http://webservice.centralserver.co.mz/}contaGeral" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://webservice.centralserver.co.mz/}documento" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="fact_ValorTrocos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_bancoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_cambio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_categorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_condicaoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fact_dataLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fact_dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fact_desconto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_descontoFinaceiro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_documentoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_documentoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_emitida" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fact_emitidoRecibo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fact_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fact_item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_iva" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fact_lancada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fact_motivoIsencao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_nrDocumentoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_numerocartao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fact_numerolancamento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fact_observacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_pedidoCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fact_prestacoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fact_prestacoesPagas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fact_reciboProcessado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fact_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_referenciaRecibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_requisicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fact_valorIncidencia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_valorMulta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_valorPago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_valorProcessado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_valorRecibo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_valorTotalMedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_valoriva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fact_valortotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moeda" type="{http://webservice.centralserver.co.mz/}moeda" minOccurs="0"/>
 *         &lt;element name="pagamento" type="{http://webservice.centralserver.co.mz/}pagamento" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *         &lt;element name="venda" type="{http://webservice.centralserver.co.mz/}venda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "caixa",
    "conta",
    "documento",
    "encrypted",
    "entidade",
    "factValorTrocos",
    "factBancoPagamento",
    "factCambio",
    "factCategorizacao",
    "factCondicaoPagamento",
    "factData",
    "factDataLimite",
    "factDataPagamento",
    "factDesconto",
    "factDescontoFinaceiro",
    "factDocumentoPagamento",
    "factDocumentoReferencia",
    "factEmitida",
    "factEmitidoRecibo",
    "factId",
    "factItem",
    "factIva",
    "factLancada",
    "factMotivoIsencao",
    "factNrDocumentoPagamento",
    "factNumerocartao",
    "factNumerolancamento",
    "factObservacoes",
    "factOrigem",
    "factPedidoCliente",
    "factPrestacoes",
    "factPrestacoesPagas",
    "factReciboProcessado",
    "factReferencia",
    "factReferenciaRecibo",
    "factRequisicao",
    "factStatus",
    "factTipo",
    "factValorIncidencia",
    "factValorMulta",
    "factValorPago",
    "factValorProcessado",
    "factValorRecibo",
    "factValorTotalMedio",
    "factValoriva",
    "factValortotal",
    "moeda",
    "pagamento",
    "usuario",
    "venda"
})
public class Factura {

    protected Caixa caixa;
    protected ContaGeral conta;
    protected Documento documento;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "fact_ValorTrocos")
    protected double factValorTrocos;
    @XmlElement(name = "fact_bancoPagamento")
    protected String factBancoPagamento;
    @XmlElement(name = "fact_cambio")
    protected double factCambio;
    @XmlElement(name = "fact_categorizacao")
    protected String factCategorizacao;
    @XmlElement(name = "fact_condicaoPagamento")
    protected String factCondicaoPagamento;
    @XmlElement(name = "fact_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar factData;
    @XmlElement(name = "fact_dataLimite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar factDataLimite;
    @XmlElement(name = "fact_dataPagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar factDataPagamento;
    @XmlElement(name = "fact_desconto")
    protected double factDesconto;
    @XmlElement(name = "fact_descontoFinaceiro")
    protected double factDescontoFinaceiro;
    @XmlElement(name = "fact_documentoPagamento")
    protected String factDocumentoPagamento;
    @XmlElement(name = "fact_documentoReferencia")
    protected String factDocumentoReferencia;
    @XmlElement(name = "fact_emitida")
    protected boolean factEmitida;
    @XmlElement(name = "fact_emitidoRecibo")
    protected boolean factEmitidoRecibo;
    @XmlElement(name = "fact_id")
    protected int factId;
    @XmlElement(name = "fact_item")
    protected String factItem;
    @XmlElement(name = "fact_iva")
    protected boolean factIva;
    @XmlElement(name = "fact_lancada")
    protected boolean factLancada;
    @XmlElement(name = "fact_motivoIsencao")
    protected String factMotivoIsencao;
    @XmlElement(name = "fact_nrDocumentoPagamento")
    protected String factNrDocumentoPagamento;
    @XmlElement(name = "fact_numerocartao")
    protected long factNumerocartao;
    @XmlElement(name = "fact_numerolancamento")
    protected long factNumerolancamento;
    @XmlElement(name = "fact_observacoes")
    protected String factObservacoes;
    @XmlElement(name = "fact_origem")
    protected String factOrigem;
    @XmlElement(name = "fact_pedidoCliente")
    protected int factPedidoCliente;
    @XmlElement(name = "fact_prestacoes")
    protected int factPrestacoes;
    @XmlElement(name = "fact_prestacoesPagas")
    protected int factPrestacoesPagas;
    @XmlElement(name = "fact_reciboProcessado")
    protected boolean factReciboProcessado;
    @XmlElement(name = "fact_referencia")
    protected String factReferencia;
    @XmlElement(name = "fact_referenciaRecibo")
    protected String factReferenciaRecibo;
    @XmlElement(name = "fact_requisicao")
    protected String factRequisicao;
    @XmlElement(name = "fact_status")
    protected String factStatus;
    @XmlElement(name = "fact_tipo")
    protected String factTipo;
    @XmlElement(name = "fact_valorIncidencia")
    protected double factValorIncidencia;
    @XmlElement(name = "fact_valorMulta")
    protected double factValorMulta;
    @XmlElement(name = "fact_valorPago")
    protected double factValorPago;
    @XmlElement(name = "fact_valorProcessado")
    protected double factValorProcessado;
    @XmlElement(name = "fact_valorRecibo")
    protected double factValorRecibo;
    @XmlElement(name = "fact_valorTotalMedio")
    protected double factValorTotalMedio;
    @XmlElement(name = "fact_valoriva")
    protected double factValoriva;
    @XmlElement(name = "fact_valortotal")
    protected double factValortotal;
    protected Moeda moeda;
    protected Pagamento pagamento;
    protected Usuario usuario;
    protected Venda venda;

    /**
     * Gets the value of the caixa property.
     * 
     * @return
     *     possible object is
     *     {@link Caixa }
     *     
     */
    public Caixa getCaixa() {
        return caixa;
    }

    /**
     * Sets the value of the caixa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caixa }
     *     
     */
    public void setCaixa(Caixa value) {
        this.caixa = value;
    }

    /**
     * Gets the value of the conta property.
     * 
     * @return
     *     possible object is
     *     {@link ContaGeral }
     *     
     */
    public ContaGeral getConta() {
        return conta;
    }

    /**
     * Sets the value of the conta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaGeral }
     *     
     */
    public void setConta(ContaGeral value) {
        this.conta = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     */
    public void setEncrypted(boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidade(Entidade value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the factValorTrocos property.
     * 
     */
    public double getFactValorTrocos() {
        return factValorTrocos;
    }

    /**
     * Sets the value of the factValorTrocos property.
     * 
     */
    public void setFactValorTrocos(double value) {
        this.factValorTrocos = value;
    }

    /**
     * Gets the value of the factBancoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactBancoPagamento() {
        return factBancoPagamento;
    }

    /**
     * Sets the value of the factBancoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactBancoPagamento(String value) {
        this.factBancoPagamento = value;
    }

    /**
     * Gets the value of the factCambio property.
     * 
     */
    public double getFactCambio() {
        return factCambio;
    }

    /**
     * Sets the value of the factCambio property.
     * 
     */
    public void setFactCambio(double value) {
        this.factCambio = value;
    }

    /**
     * Gets the value of the factCategorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactCategorizacao() {
        return factCategorizacao;
    }

    /**
     * Sets the value of the factCategorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactCategorizacao(String value) {
        this.factCategorizacao = value;
    }

    /**
     * Gets the value of the factCondicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactCondicaoPagamento() {
        return factCondicaoPagamento;
    }

    /**
     * Sets the value of the factCondicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactCondicaoPagamento(String value) {
        this.factCondicaoPagamento = value;
    }

    /**
     * Gets the value of the factData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFactData() {
        return factData;
    }

    /**
     * Sets the value of the factData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFactData(XMLGregorianCalendar value) {
        this.factData = value;
    }

    /**
     * Gets the value of the factDataLimite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFactDataLimite() {
        return factDataLimite;
    }

    /**
     * Sets the value of the factDataLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFactDataLimite(XMLGregorianCalendar value) {
        this.factDataLimite = value;
    }

    /**
     * Gets the value of the factDataPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFactDataPagamento() {
        return factDataPagamento;
    }

    /**
     * Sets the value of the factDataPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFactDataPagamento(XMLGregorianCalendar value) {
        this.factDataPagamento = value;
    }

    /**
     * Gets the value of the factDesconto property.
     * 
     */
    public double getFactDesconto() {
        return factDesconto;
    }

    /**
     * Sets the value of the factDesconto property.
     * 
     */
    public void setFactDesconto(double value) {
        this.factDesconto = value;
    }

    /**
     * Gets the value of the factDescontoFinaceiro property.
     * 
     */
    public double getFactDescontoFinaceiro() {
        return factDescontoFinaceiro;
    }

    /**
     * Sets the value of the factDescontoFinaceiro property.
     * 
     */
    public void setFactDescontoFinaceiro(double value) {
        this.factDescontoFinaceiro = value;
    }

    /**
     * Gets the value of the factDocumentoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactDocumentoPagamento() {
        return factDocumentoPagamento;
    }

    /**
     * Sets the value of the factDocumentoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactDocumentoPagamento(String value) {
        this.factDocumentoPagamento = value;
    }

    /**
     * Gets the value of the factDocumentoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactDocumentoReferencia() {
        return factDocumentoReferencia;
    }

    /**
     * Sets the value of the factDocumentoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactDocumentoReferencia(String value) {
        this.factDocumentoReferencia = value;
    }

    /**
     * Gets the value of the factEmitida property.
     * 
     */
    public boolean isFactEmitida() {
        return factEmitida;
    }

    /**
     * Sets the value of the factEmitida property.
     * 
     */
    public void setFactEmitida(boolean value) {
        this.factEmitida = value;
    }

    /**
     * Gets the value of the factEmitidoRecibo property.
     * 
     */
    public boolean isFactEmitidoRecibo() {
        return factEmitidoRecibo;
    }

    /**
     * Sets the value of the factEmitidoRecibo property.
     * 
     */
    public void setFactEmitidoRecibo(boolean value) {
        this.factEmitidoRecibo = value;
    }

    /**
     * Gets the value of the factId property.
     * 
     */
    public int getFactId() {
        return factId;
    }

    /**
     * Sets the value of the factId property.
     * 
     */
    public void setFactId(int value) {
        this.factId = value;
    }

    /**
     * Gets the value of the factItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactItem() {
        return factItem;
    }

    /**
     * Sets the value of the factItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactItem(String value) {
        this.factItem = value;
    }

    /**
     * Gets the value of the factIva property.
     * 
     */
    public boolean isFactIva() {
        return factIva;
    }

    /**
     * Sets the value of the factIva property.
     * 
     */
    public void setFactIva(boolean value) {
        this.factIva = value;
    }

    /**
     * Gets the value of the factLancada property.
     * 
     */
    public boolean isFactLancada() {
        return factLancada;
    }

    /**
     * Sets the value of the factLancada property.
     * 
     */
    public void setFactLancada(boolean value) {
        this.factLancada = value;
    }

    /**
     * Gets the value of the factMotivoIsencao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactMotivoIsencao() {
        return factMotivoIsencao;
    }

    /**
     * Sets the value of the factMotivoIsencao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactMotivoIsencao(String value) {
        this.factMotivoIsencao = value;
    }

    /**
     * Gets the value of the factNrDocumentoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactNrDocumentoPagamento() {
        return factNrDocumentoPagamento;
    }

    /**
     * Sets the value of the factNrDocumentoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactNrDocumentoPagamento(String value) {
        this.factNrDocumentoPagamento = value;
    }

    /**
     * Gets the value of the factNumerocartao property.
     * 
     */
    public long getFactNumerocartao() {
        return factNumerocartao;
    }

    /**
     * Sets the value of the factNumerocartao property.
     * 
     */
    public void setFactNumerocartao(long value) {
        this.factNumerocartao = value;
    }

    /**
     * Gets the value of the factNumerolancamento property.
     * 
     */
    public long getFactNumerolancamento() {
        return factNumerolancamento;
    }

    /**
     * Sets the value of the factNumerolancamento property.
     * 
     */
    public void setFactNumerolancamento(long value) {
        this.factNumerolancamento = value;
    }

    /**
     * Gets the value of the factObservacoes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactObservacoes() {
        return factObservacoes;
    }

    /**
     * Sets the value of the factObservacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactObservacoes(String value) {
        this.factObservacoes = value;
    }

    /**
     * Gets the value of the factOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactOrigem() {
        return factOrigem;
    }

    /**
     * Sets the value of the factOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactOrigem(String value) {
        this.factOrigem = value;
    }

    /**
     * Gets the value of the factPedidoCliente property.
     * 
     */
    public int getFactPedidoCliente() {
        return factPedidoCliente;
    }

    /**
     * Sets the value of the factPedidoCliente property.
     * 
     */
    public void setFactPedidoCliente(int value) {
        this.factPedidoCliente = value;
    }

    /**
     * Gets the value of the factPrestacoes property.
     * 
     */
    public int getFactPrestacoes() {
        return factPrestacoes;
    }

    /**
     * Sets the value of the factPrestacoes property.
     * 
     */
    public void setFactPrestacoes(int value) {
        this.factPrestacoes = value;
    }

    /**
     * Gets the value of the factPrestacoesPagas property.
     * 
     */
    public int getFactPrestacoesPagas() {
        return factPrestacoesPagas;
    }

    /**
     * Sets the value of the factPrestacoesPagas property.
     * 
     */
    public void setFactPrestacoesPagas(int value) {
        this.factPrestacoesPagas = value;
    }

    /**
     * Gets the value of the factReciboProcessado property.
     * 
     */
    public boolean isFactReciboProcessado() {
        return factReciboProcessado;
    }

    /**
     * Sets the value of the factReciboProcessado property.
     * 
     */
    public void setFactReciboProcessado(boolean value) {
        this.factReciboProcessado = value;
    }

    /**
     * Gets the value of the factReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactReferencia() {
        return factReferencia;
    }

    /**
     * Sets the value of the factReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactReferencia(String value) {
        this.factReferencia = value;
    }

    /**
     * Gets the value of the factReferenciaRecibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactReferenciaRecibo() {
        return factReferenciaRecibo;
    }

    /**
     * Sets the value of the factReferenciaRecibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactReferenciaRecibo(String value) {
        this.factReferenciaRecibo = value;
    }

    /**
     * Gets the value of the factRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactRequisicao() {
        return factRequisicao;
    }

    /**
     * Sets the value of the factRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactRequisicao(String value) {
        this.factRequisicao = value;
    }

    /**
     * Gets the value of the factStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactStatus() {
        return factStatus;
    }

    /**
     * Sets the value of the factStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactStatus(String value) {
        this.factStatus = value;
    }

    /**
     * Gets the value of the factTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactTipo() {
        return factTipo;
    }

    /**
     * Sets the value of the factTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactTipo(String value) {
        this.factTipo = value;
    }

    /**
     * Gets the value of the factValorIncidencia property.
     * 
     */
    public double getFactValorIncidencia() {
        return factValorIncidencia;
    }

    /**
     * Sets the value of the factValorIncidencia property.
     * 
     */
    public void setFactValorIncidencia(double value) {
        this.factValorIncidencia = value;
    }

    /**
     * Gets the value of the factValorMulta property.
     * 
     */
    public double getFactValorMulta() {
        return factValorMulta;
    }

    /**
     * Sets the value of the factValorMulta property.
     * 
     */
    public void setFactValorMulta(double value) {
        this.factValorMulta = value;
    }

    /**
     * Gets the value of the factValorPago property.
     * 
     */
    public double getFactValorPago() {
        return factValorPago;
    }

    /**
     * Sets the value of the factValorPago property.
     * 
     */
    public void setFactValorPago(double value) {
        this.factValorPago = value;
    }

    /**
     * Gets the value of the factValorProcessado property.
     * 
     */
    public double getFactValorProcessado() {
        return factValorProcessado;
    }

    /**
     * Sets the value of the factValorProcessado property.
     * 
     */
    public void setFactValorProcessado(double value) {
        this.factValorProcessado = value;
    }

    /**
     * Gets the value of the factValorRecibo property.
     * 
     */
    public double getFactValorRecibo() {
        return factValorRecibo;
    }

    /**
     * Sets the value of the factValorRecibo property.
     * 
     */
    public void setFactValorRecibo(double value) {
        this.factValorRecibo = value;
    }

    /**
     * Gets the value of the factValorTotalMedio property.
     * 
     */
    public double getFactValorTotalMedio() {
        return factValorTotalMedio;
    }

    /**
     * Sets the value of the factValorTotalMedio property.
     * 
     */
    public void setFactValorTotalMedio(double value) {
        this.factValorTotalMedio = value;
    }

    /**
     * Gets the value of the factValoriva property.
     * 
     */
    public double getFactValoriva() {
        return factValoriva;
    }

    /**
     * Sets the value of the factValoriva property.
     * 
     */
    public void setFactValoriva(double value) {
        this.factValoriva = value;
    }

    /**
     * Gets the value of the factValortotal property.
     * 
     */
    public double getFactValortotal() {
        return factValortotal;
    }

    /**
     * Sets the value of the factValortotal property.
     * 
     */
    public void setFactValortotal(double value) {
        this.factValortotal = value;
    }

    /**
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Gets the value of the pagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Pagamento }
     *     
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

    /**
     * Sets the value of the pagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagamento }
     *     
     */
    public void setPagamento(Pagamento value) {
        this.pagamento = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the venda property.
     * 
     * @return
     *     possible object is
     *     {@link Venda }
     *     
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * Sets the value of the venda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Venda }
     *     
     */
    public void setVenda(Venda value) {
        this.venda = value;
    }

}
