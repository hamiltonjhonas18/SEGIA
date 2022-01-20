
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caixa" type="{http://webservice.centralserver.co.mz/}caixa" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="inscricao" type="{http://webservice.centralserver.co.mz/}inscricao" minOccurs="0"/>
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pag_actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pag_categorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_comissao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pag_condicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pag_dataLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pag_dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pag_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_formaPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pag_multa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pag_origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_recibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_refElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_refOnline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pag_status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pag_valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pag_valorPago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pessoa" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *         &lt;element name="reciboPagamento" type="{http://webservice.centralserver.co.mz/}reciboPagamento" minOccurs="0"/>
 *         &lt;element name="turma" type="{http://webservice.centralserver.co.mz/}turma" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagamento", propOrder = {
    "caixa",
    "encrypted",
    "entidade",
    "inscricao",
    "online",
    "pagActual",
    "pagCategorizacao",
    "pagComissao",
    "pagCondicao",
    "pagData",
    "pagDataLimite",
    "pagDataPagamento",
    "pagDescricao",
    "pagEstado",
    "pagFormaPagamento",
    "pagId",
    "pagMulta",
    "pagOrigem",
    "pagPeriodo",
    "pagRecibo",
    "pagRefElectronico",
    "pagRefOnline",
    "pagReferencia",
    "pagStatus",
    "pagValor",
    "pagValorPago",
    "pessoa",
    "reciboPagamento",
    "turma"
})
public class Pagamento {

    protected Caixa caixa;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Inscricao inscricao;
    protected boolean online;
    @XmlElement(name = "pag_actual")
    protected boolean pagActual;
    @XmlElement(name = "pag_categorizacao")
    protected String pagCategorizacao;
    @XmlElement(name = "pag_comissao")
    protected double pagComissao;
    @XmlElement(name = "pag_condicao")
    protected String pagCondicao;
    @XmlElement(name = "pag_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pagData;
    @XmlElement(name = "pag_dataLimite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pagDataLimite;
    @XmlElement(name = "pag_dataPagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pagDataPagamento;
    @XmlElement(name = "pag_descricao")
    protected String pagDescricao;
    @XmlElement(name = "pag_estado")
    protected String pagEstado;
    @XmlElement(name = "pag_formaPagamento")
    protected String pagFormaPagamento;
    @XmlElement(name = "pag_id")
    protected int pagId;
    @XmlElement(name = "pag_multa")
    protected double pagMulta;
    @XmlElement(name = "pag_origem")
    protected String pagOrigem;
    @XmlElement(name = "pag_periodo")
    protected String pagPeriodo;
    @XmlElement(name = "pag_recibo")
    protected String pagRecibo;
    @XmlElement(name = "pag_refElectronico")
    protected String pagRefElectronico;
    @XmlElement(name = "pag_refOnline")
    protected String pagRefOnline;
    @XmlElement(name = "pag_referencia")
    protected String pagReferencia;
    @XmlElement(name = "pag_status")
    protected boolean pagStatus;
    @XmlElement(name = "pag_valor")
    protected double pagValor;
    @XmlElement(name = "pag_valorPago")
    protected double pagValorPago;
    protected Pessoa pessoa;
    protected ReciboPagamento reciboPagamento;
    protected Turma turma;

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
     * Gets the value of the inscricao property.
     * 
     * @return
     *     possible object is
     *     {@link Inscricao }
     *     
     */
    public Inscricao getInscricao() {
        return inscricao;
    }

    /**
     * Sets the value of the inscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inscricao }
     *     
     */
    public void setInscricao(Inscricao value) {
        this.inscricao = value;
    }

    /**
     * Gets the value of the online property.
     * 
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     */
    public void setOnline(boolean value) {
        this.online = value;
    }

    /**
     * Gets the value of the pagActual property.
     * 
     */
    public boolean isPagActual() {
        return pagActual;
    }

    /**
     * Sets the value of the pagActual property.
     * 
     */
    public void setPagActual(boolean value) {
        this.pagActual = value;
    }

    /**
     * Gets the value of the pagCategorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagCategorizacao() {
        return pagCategorizacao;
    }

    /**
     * Sets the value of the pagCategorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagCategorizacao(String value) {
        this.pagCategorizacao = value;
    }

    /**
     * Gets the value of the pagComissao property.
     * 
     */
    public double getPagComissao() {
        return pagComissao;
    }

    /**
     * Sets the value of the pagComissao property.
     * 
     */
    public void setPagComissao(double value) {
        this.pagComissao = value;
    }

    /**
     * Gets the value of the pagCondicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagCondicao() {
        return pagCondicao;
    }

    /**
     * Sets the value of the pagCondicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagCondicao(String value) {
        this.pagCondicao = value;
    }

    /**
     * Gets the value of the pagData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPagData() {
        return pagData;
    }

    /**
     * Sets the value of the pagData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPagData(XMLGregorianCalendar value) {
        this.pagData = value;
    }

    /**
     * Gets the value of the pagDataLimite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPagDataLimite() {
        return pagDataLimite;
    }

    /**
     * Sets the value of the pagDataLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPagDataLimite(XMLGregorianCalendar value) {
        this.pagDataLimite = value;
    }

    /**
     * Gets the value of the pagDataPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPagDataPagamento() {
        return pagDataPagamento;
    }

    /**
     * Sets the value of the pagDataPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPagDataPagamento(XMLGregorianCalendar value) {
        this.pagDataPagamento = value;
    }

    /**
     * Gets the value of the pagDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagDescricao() {
        return pagDescricao;
    }

    /**
     * Sets the value of the pagDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagDescricao(String value) {
        this.pagDescricao = value;
    }

    /**
     * Gets the value of the pagEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagEstado() {
        return pagEstado;
    }

    /**
     * Sets the value of the pagEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagEstado(String value) {
        this.pagEstado = value;
    }

    /**
     * Gets the value of the pagFormaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagFormaPagamento() {
        return pagFormaPagamento;
    }

    /**
     * Sets the value of the pagFormaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagFormaPagamento(String value) {
        this.pagFormaPagamento = value;
    }

    /**
     * Gets the value of the pagId property.
     * 
     */
    public int getPagId() {
        return pagId;
    }

    /**
     * Sets the value of the pagId property.
     * 
     */
    public void setPagId(int value) {
        this.pagId = value;
    }

    /**
     * Gets the value of the pagMulta property.
     * 
     */
    public double getPagMulta() {
        return pagMulta;
    }

    /**
     * Sets the value of the pagMulta property.
     * 
     */
    public void setPagMulta(double value) {
        this.pagMulta = value;
    }

    /**
     * Gets the value of the pagOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagOrigem() {
        return pagOrigem;
    }

    /**
     * Sets the value of the pagOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagOrigem(String value) {
        this.pagOrigem = value;
    }

    /**
     * Gets the value of the pagPeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagPeriodo() {
        return pagPeriodo;
    }

    /**
     * Sets the value of the pagPeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagPeriodo(String value) {
        this.pagPeriodo = value;
    }

    /**
     * Gets the value of the pagRecibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagRecibo() {
        return pagRecibo;
    }

    /**
     * Sets the value of the pagRecibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagRecibo(String value) {
        this.pagRecibo = value;
    }

    /**
     * Gets the value of the pagRefElectronico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagRefElectronico() {
        return pagRefElectronico;
    }

    /**
     * Sets the value of the pagRefElectronico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagRefElectronico(String value) {
        this.pagRefElectronico = value;
    }

    /**
     * Gets the value of the pagRefOnline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagRefOnline() {
        return pagRefOnline;
    }

    /**
     * Sets the value of the pagRefOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagRefOnline(String value) {
        this.pagRefOnline = value;
    }

    /**
     * Gets the value of the pagReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagReferencia() {
        return pagReferencia;
    }

    /**
     * Sets the value of the pagReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagReferencia(String value) {
        this.pagReferencia = value;
    }

    /**
     * Gets the value of the pagStatus property.
     * 
     */
    public boolean isPagStatus() {
        return pagStatus;
    }

    /**
     * Sets the value of the pagStatus property.
     * 
     */
    public void setPagStatus(boolean value) {
        this.pagStatus = value;
    }

    /**
     * Gets the value of the pagValor property.
     * 
     */
    public double getPagValor() {
        return pagValor;
    }

    /**
     * Sets the value of the pagValor property.
     * 
     */
    public void setPagValor(double value) {
        this.pagValor = value;
    }

    /**
     * Gets the value of the pagValorPago property.
     * 
     */
    public double getPagValorPago() {
        return pagValorPago;
    }

    /**
     * Sets the value of the pagValorPago property.
     * 
     */
    public void setPagValorPago(double value) {
        this.pagValorPago = value;
    }

    /**
     * Gets the value of the pessoa property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Sets the value of the pessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoa(Pessoa value) {
        this.pessoa = value;
    }

    /**
     * Gets the value of the reciboPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ReciboPagamento }
     *     
     */
    public ReciboPagamento getReciboPagamento() {
        return reciboPagamento;
    }

    /**
     * Sets the value of the reciboPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReciboPagamento }
     *     
     */
    public void setReciboPagamento(ReciboPagamento value) {
        this.reciboPagamento = value;
    }

    /**
     * Gets the value of the turma property.
     * 
     * @return
     *     possible object is
     *     {@link Turma }
     *     
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * Sets the value of the turma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Turma }
     *     
     */
    public void setTurma(Turma value) {
        this.turma = value;
    }

}
