
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for itemPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="factura" type="{http://webservice.centralserver.co.mz/}factura" minOccurs="0"/>
 *         &lt;element name="guiaRemessa" type="{http://webservice.centralserver.co.mz/}guiaRemessa" minOccurs="0"/>
 *         &lt;element name="itp_cod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itp_custoVenda" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="itp_desconto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itp_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itp_iva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_precoIva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_precoIvaMedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_precoMedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_precoTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_precoTotalMedio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_precoUnit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itp_quantidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itp_refProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itp_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itp_referenciaFactura" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itp_referenciaGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itp_tipoVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemPedido", propOrder = {
    "encrypted",
    "entidade",
    "factura",
    "guiaRemessa",
    "itpCod",
    "itpCustoVenda",
    "itpData",
    "itpDesconto",
    "itpDescricao",
    "itpId",
    "itpIva",
    "itpPrecoIva",
    "itpPrecoIvaMedio",
    "itpPrecoMedio",
    "itpPrecoTotal",
    "itpPrecoTotalMedio",
    "itpPrecoUnit",
    "itpQuantidade",
    "itpRefProduto",
    "itpReferencia",
    "itpReferenciaFactura",
    "itpReferenciaGuia",
    "itpTipoVenda"
})
public class ItemPedido {

    protected boolean encrypted;
    protected Entidade entidade;
    protected Factura factura;
    protected GuiaRemessa guiaRemessa;
    @XmlElement(name = "itp_cod")
    protected String itpCod;
    @XmlElement(name = "itp_custoVenda")
    protected double itpCustoVenda;
    @XmlElement(name = "itp_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar itpData;
    @XmlElement(name = "itp_desconto")
    protected double itpDesconto;
    @XmlElement(name = "itp_descricao")
    protected String itpDescricao;
    @XmlElement(name = "itp_id")
    protected int itpId;
    @XmlElement(name = "itp_iva")
    protected double itpIva;
    @XmlElement(name = "itp_precoIva")
    protected double itpPrecoIva;
    @XmlElement(name = "itp_precoIvaMedio")
    protected double itpPrecoIvaMedio;
    @XmlElement(name = "itp_precoMedio")
    protected double itpPrecoMedio;
    @XmlElement(name = "itp_precoTotal")
    protected double itpPrecoTotal;
    @XmlElement(name = "itp_precoTotalMedio")
    protected double itpPrecoTotalMedio;
    @XmlElement(name = "itp_precoUnit")
    protected double itpPrecoUnit;
    @XmlElement(name = "itp_quantidade")
    protected int itpQuantidade;
    @XmlElement(name = "itp_refProduto")
    protected int itpRefProduto;
    @XmlElement(name = "itp_referencia")
    protected String itpReferencia;
    @XmlElement(name = "itp_referenciaFactura")
    protected long itpReferenciaFactura;
    @XmlElement(name = "itp_referenciaGuia")
    protected String itpReferenciaGuia;
    @XmlElement(name = "itp_tipoVenda")
    protected String itpTipoVenda;

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
     * Gets the value of the guiaRemessa property.
     * 
     * @return
     *     possible object is
     *     {@link GuiaRemessa }
     *     
     */
    public GuiaRemessa getGuiaRemessa() {
        return guiaRemessa;
    }

    /**
     * Sets the value of the guiaRemessa property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiaRemessa }
     *     
     */
    public void setGuiaRemessa(GuiaRemessa value) {
        this.guiaRemessa = value;
    }

    /**
     * Gets the value of the itpCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItpCod() {
        return itpCod;
    }

    /**
     * Sets the value of the itpCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItpCod(String value) {
        this.itpCod = value;
    }

    /**
     * Gets the value of the itpCustoVenda property.
     * 
     */
    public double getItpCustoVenda() {
        return itpCustoVenda;
    }

    /**
     * Sets the value of the itpCustoVenda property.
     * 
     */
    public void setItpCustoVenda(double value) {
        this.itpCustoVenda = value;
    }

    /**
     * Gets the value of the itpData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItpData() {
        return itpData;
    }

    /**
     * Sets the value of the itpData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItpData(XMLGregorianCalendar value) {
        this.itpData = value;
    }

    /**
     * Gets the value of the itpDesconto property.
     * 
     */
    public double getItpDesconto() {
        return itpDesconto;
    }

    /**
     * Sets the value of the itpDesconto property.
     * 
     */
    public void setItpDesconto(double value) {
        this.itpDesconto = value;
    }

    /**
     * Gets the value of the itpDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItpDescricao() {
        return itpDescricao;
    }

    /**
     * Sets the value of the itpDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItpDescricao(String value) {
        this.itpDescricao = value;
    }

    /**
     * Gets the value of the itpId property.
     * 
     */
    public int getItpId() {
        return itpId;
    }

    /**
     * Sets the value of the itpId property.
     * 
     */
    public void setItpId(int value) {
        this.itpId = value;
    }

    /**
     * Gets the value of the itpIva property.
     * 
     */
    public double getItpIva() {
        return itpIva;
    }

    /**
     * Sets the value of the itpIva property.
     * 
     */
    public void setItpIva(double value) {
        this.itpIva = value;
    }

    /**
     * Gets the value of the itpPrecoIva property.
     * 
     */
    public double getItpPrecoIva() {
        return itpPrecoIva;
    }

    /**
     * Sets the value of the itpPrecoIva property.
     * 
     */
    public void setItpPrecoIva(double value) {
        this.itpPrecoIva = value;
    }

    /**
     * Gets the value of the itpPrecoIvaMedio property.
     * 
     */
    public double getItpPrecoIvaMedio() {
        return itpPrecoIvaMedio;
    }

    /**
     * Sets the value of the itpPrecoIvaMedio property.
     * 
     */
    public void setItpPrecoIvaMedio(double value) {
        this.itpPrecoIvaMedio = value;
    }

    /**
     * Gets the value of the itpPrecoMedio property.
     * 
     */
    public double getItpPrecoMedio() {
        return itpPrecoMedio;
    }

    /**
     * Sets the value of the itpPrecoMedio property.
     * 
     */
    public void setItpPrecoMedio(double value) {
        this.itpPrecoMedio = value;
    }

    /**
     * Gets the value of the itpPrecoTotal property.
     * 
     */
    public double getItpPrecoTotal() {
        return itpPrecoTotal;
    }

    /**
     * Sets the value of the itpPrecoTotal property.
     * 
     */
    public void setItpPrecoTotal(double value) {
        this.itpPrecoTotal = value;
    }

    /**
     * Gets the value of the itpPrecoTotalMedio property.
     * 
     */
    public double getItpPrecoTotalMedio() {
        return itpPrecoTotalMedio;
    }

    /**
     * Sets the value of the itpPrecoTotalMedio property.
     * 
     */
    public void setItpPrecoTotalMedio(double value) {
        this.itpPrecoTotalMedio = value;
    }

    /**
     * Gets the value of the itpPrecoUnit property.
     * 
     */
    public double getItpPrecoUnit() {
        return itpPrecoUnit;
    }

    /**
     * Sets the value of the itpPrecoUnit property.
     * 
     */
    public void setItpPrecoUnit(double value) {
        this.itpPrecoUnit = value;
    }

    /**
     * Gets the value of the itpQuantidade property.
     * 
     */
    public int getItpQuantidade() {
        return itpQuantidade;
    }

    /**
     * Sets the value of the itpQuantidade property.
     * 
     */
    public void setItpQuantidade(int value) {
        this.itpQuantidade = value;
    }

    /**
     * Gets the value of the itpRefProduto property.
     * 
     */
    public int getItpRefProduto() {
        return itpRefProduto;
    }

    /**
     * Sets the value of the itpRefProduto property.
     * 
     */
    public void setItpRefProduto(int value) {
        this.itpRefProduto = value;
    }

    /**
     * Gets the value of the itpReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItpReferencia() {
        return itpReferencia;
    }

    /**
     * Sets the value of the itpReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItpReferencia(String value) {
        this.itpReferencia = value;
    }

    /**
     * Gets the value of the itpReferenciaFactura property.
     * 
     */
    public long getItpReferenciaFactura() {
        return itpReferenciaFactura;
    }

    /**
     * Sets the value of the itpReferenciaFactura property.
     * 
     */
    public void setItpReferenciaFactura(long value) {
        this.itpReferenciaFactura = value;
    }

    /**
     * Gets the value of the itpReferenciaGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItpReferenciaGuia() {
        return itpReferenciaGuia;
    }

    /**
     * Sets the value of the itpReferenciaGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItpReferenciaGuia(String value) {
        this.itpReferenciaGuia = value;
    }

    /**
     * Gets the value of the itpTipoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItpTipoVenda() {
        return itpTipoVenda;
    }

    /**
     * Sets the value of the itpTipoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItpTipoVenda(String value) {
        this.itpTipoVenda = value;
    }

}
