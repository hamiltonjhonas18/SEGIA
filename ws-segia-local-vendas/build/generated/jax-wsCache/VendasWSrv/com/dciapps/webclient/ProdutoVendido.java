
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for produtoVendido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="produtoVendido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="factura" type="{http://webservice.centralserver.co.mz/}factura" minOccurs="0"/>
 *         &lt;element name="produto" type="{http://webservice.centralserver.co.mz/}produto" minOccurs="0"/>
 *         &lt;element name="prv_ajuste" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_custoVenda" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="prv_desconto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prv_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prv_iva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_precoCusto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_precoMedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_qtd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prv_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prv_tipoVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prv_total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_totalIva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_totalIvaMedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="prv_totalPrecoMedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtoVendido", propOrder = {
    "entidade",
    "factura",
    "produto",
    "prvAjuste",
    "prvCustoVenda",
    "prvData",
    "prvDesconto",
    "prvDescricao",
    "prvId",
    "prvIva",
    "prvPrecoCusto",
    "prvPrecoMedio",
    "prvQtd",
    "prvReferencia",
    "prvTipoVenda",
    "prvTotal",
    "prvTotalIva",
    "prvTotalIvaMedio",
    "prvTotalPrecoMedio"
})
public class ProdutoVendido {

    protected Entidade entidade;
    protected Factura factura;
    protected Produto produto;
    @XmlElement(name = "prv_ajuste")
    protected double prvAjuste;
    @XmlElement(name = "prv_custoVenda")
    protected double prvCustoVenda;
    @XmlElement(name = "prv_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prvData;
    @XmlElement(name = "prv_desconto")
    protected double prvDesconto;
    @XmlElement(name = "prv_descricao")
    protected String prvDescricao;
    @XmlElement(name = "prv_id")
    protected int prvId;
    @XmlElement(name = "prv_iva")
    protected double prvIva;
    @XmlElement(name = "prv_precoCusto")
    protected double prvPrecoCusto;
    @XmlElement(name = "prv_precoMedio")
    protected double prvPrecoMedio;
    @XmlElement(name = "prv_qtd")
    protected int prvQtd;
    @XmlElement(name = "prv_referencia")
    protected String prvReferencia;
    @XmlElement(name = "prv_tipoVenda")
    protected String prvTipoVenda;
    @XmlElement(name = "prv_total")
    protected double prvTotal;
    @XmlElement(name = "prv_totalIva")
    protected double prvTotalIva;
    @XmlElement(name = "prv_totalIvaMedio")
    protected double prvTotalIvaMedio;
    @XmlElement(name = "prv_totalPrecoMedio")
    protected double prvTotalPrecoMedio;

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
     * Gets the value of the factura property.
     * 
     * @return
     *     possible object is
     *     {@link Factura }
     *     
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * Sets the value of the factura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Factura }
     *     
     */
    public void setFactura(Factura value) {
        this.factura = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Sets the value of the produto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProduto(Produto value) {
        this.produto = value;
    }

    /**
     * Gets the value of the prvAjuste property.
     * 
     */
    public double getPrvAjuste() {
        return prvAjuste;
    }

    /**
     * Sets the value of the prvAjuste property.
     * 
     */
    public void setPrvAjuste(double value) {
        this.prvAjuste = value;
    }

    /**
     * Gets the value of the prvCustoVenda property.
     * 
     */
    public double getPrvCustoVenda() {
        return prvCustoVenda;
    }

    /**
     * Sets the value of the prvCustoVenda property.
     * 
     */
    public void setPrvCustoVenda(double value) {
        this.prvCustoVenda = value;
    }

    /**
     * Gets the value of the prvData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrvData() {
        return prvData;
    }

    /**
     * Sets the value of the prvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrvData(XMLGregorianCalendar value) {
        this.prvData = value;
    }

    /**
     * Gets the value of the prvDesconto property.
     * 
     */
    public double getPrvDesconto() {
        return prvDesconto;
    }

    /**
     * Sets the value of the prvDesconto property.
     * 
     */
    public void setPrvDesconto(double value) {
        this.prvDesconto = value;
    }

    /**
     * Gets the value of the prvDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvDescricao() {
        return prvDescricao;
    }

    /**
     * Sets the value of the prvDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvDescricao(String value) {
        this.prvDescricao = value;
    }

    /**
     * Gets the value of the prvId property.
     * 
     */
    public int getPrvId() {
        return prvId;
    }

    /**
     * Sets the value of the prvId property.
     * 
     */
    public void setPrvId(int value) {
        this.prvId = value;
    }

    /**
     * Gets the value of the prvIva property.
     * 
     */
    public double getPrvIva() {
        return prvIva;
    }

    /**
     * Sets the value of the prvIva property.
     * 
     */
    public void setPrvIva(double value) {
        this.prvIva = value;
    }

    /**
     * Gets the value of the prvPrecoCusto property.
     * 
     */
    public double getPrvPrecoCusto() {
        return prvPrecoCusto;
    }

    /**
     * Sets the value of the prvPrecoCusto property.
     * 
     */
    public void setPrvPrecoCusto(double value) {
        this.prvPrecoCusto = value;
    }

    /**
     * Gets the value of the prvPrecoMedio property.
     * 
     */
    public double getPrvPrecoMedio() {
        return prvPrecoMedio;
    }

    /**
     * Sets the value of the prvPrecoMedio property.
     * 
     */
    public void setPrvPrecoMedio(double value) {
        this.prvPrecoMedio = value;
    }

    /**
     * Gets the value of the prvQtd property.
     * 
     */
    public int getPrvQtd() {
        return prvQtd;
    }

    /**
     * Sets the value of the prvQtd property.
     * 
     */
    public void setPrvQtd(int value) {
        this.prvQtd = value;
    }

    /**
     * Gets the value of the prvReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvReferencia() {
        return prvReferencia;
    }

    /**
     * Sets the value of the prvReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvReferencia(String value) {
        this.prvReferencia = value;
    }

    /**
     * Gets the value of the prvTipoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvTipoVenda() {
        return prvTipoVenda;
    }

    /**
     * Sets the value of the prvTipoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvTipoVenda(String value) {
        this.prvTipoVenda = value;
    }

    /**
     * Gets the value of the prvTotal property.
     * 
     */
    public double getPrvTotal() {
        return prvTotal;
    }

    /**
     * Sets the value of the prvTotal property.
     * 
     */
    public void setPrvTotal(double value) {
        this.prvTotal = value;
    }

    /**
     * Gets the value of the prvTotalIva property.
     * 
     */
    public double getPrvTotalIva() {
        return prvTotalIva;
    }

    /**
     * Sets the value of the prvTotalIva property.
     * 
     */
    public void setPrvTotalIva(double value) {
        this.prvTotalIva = value;
    }

    /**
     * Gets the value of the prvTotalIvaMedio property.
     * 
     */
    public double getPrvTotalIvaMedio() {
        return prvTotalIvaMedio;
    }

    /**
     * Sets the value of the prvTotalIvaMedio property.
     * 
     */
    public void setPrvTotalIvaMedio(double value) {
        this.prvTotalIvaMedio = value;
    }

    /**
     * Gets the value of the prvTotalPrecoMedio property.
     * 
     */
    public double getPrvTotalPrecoMedio() {
        return prvTotalPrecoMedio;
    }

    /**
     * Sets the value of the prvTotalPrecoMedio property.
     * 
     */
    public void setPrvTotalPrecoMedio(double value) {
        this.prvTotalPrecoMedio = value;
    }

}
