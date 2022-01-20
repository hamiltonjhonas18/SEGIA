
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for guiaRemessa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guiaRemessa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://webservice.centralserver.co.mz/}cliente" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="factura" type="{http://webservice.centralserver.co.mz/}factura" minOccurs="0"/>
 *         &lt;element name="fornecedor" type="{http://webservice.centralserver.co.mz/}fornecedor" minOccurs="0"/>
 *         &lt;element name="guia_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="guia_dataAprovacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="guia_designado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guia_detalhes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guia_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guia_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guia_numeroLancamento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="guia_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guia_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guia_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *         &lt;element name="usuario2" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaRemessa", propOrder = {
    "cliente",
    "entidade",
    "factura",
    "fornecedor",
    "guiaData",
    "guiaDataAprovacao",
    "guiaDesignado",
    "guiaDetalhes",
    "guiaDocumento",
    "guiaId",
    "guiaNumeroLancamento",
    "guiaReferencia",
    "guiaStatus",
    "guiaTipo",
    "usuario",
    "usuario2"
})
public class GuiaRemessa {

    protected Cliente cliente;
    protected Entidade entidade;
    protected Factura factura;
    protected Fornecedor fornecedor;
    @XmlElement(name = "guia_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guiaData;
    @XmlElement(name = "guia_dataAprovacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guiaDataAprovacao;
    @XmlElement(name = "guia_designado")
    protected String guiaDesignado;
    @XmlElement(name = "guia_detalhes")
    protected String guiaDetalhes;
    @XmlElement(name = "guia_documento")
    protected String guiaDocumento;
    @XmlElement(name = "guia_id")
    protected int guiaId;
    @XmlElement(name = "guia_numeroLancamento")
    protected long guiaNumeroLancamento;
    @XmlElement(name = "guia_referencia")
    protected String guiaReferencia;
    @XmlElement(name = "guia_status")
    protected String guiaStatus;
    @XmlElement(name = "guia_tipo")
    protected String guiaTipo;
    protected Usuario usuario;
    protected Usuario usuario2;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
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
     * Gets the value of the fornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link Fornecedor }
     *     
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * Sets the value of the fornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fornecedor }
     *     
     */
    public void setFornecedor(Fornecedor value) {
        this.fornecedor = value;
    }

    /**
     * Gets the value of the guiaData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuiaData() {
        return guiaData;
    }

    /**
     * Sets the value of the guiaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuiaData(XMLGregorianCalendar value) {
        this.guiaData = value;
    }

    /**
     * Gets the value of the guiaDataAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuiaDataAprovacao() {
        return guiaDataAprovacao;
    }

    /**
     * Sets the value of the guiaDataAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuiaDataAprovacao(XMLGregorianCalendar value) {
        this.guiaDataAprovacao = value;
    }

    /**
     * Gets the value of the guiaDesignado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaDesignado() {
        return guiaDesignado;
    }

    /**
     * Sets the value of the guiaDesignado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaDesignado(String value) {
        this.guiaDesignado = value;
    }

    /**
     * Gets the value of the guiaDetalhes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaDetalhes() {
        return guiaDetalhes;
    }

    /**
     * Sets the value of the guiaDetalhes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaDetalhes(String value) {
        this.guiaDetalhes = value;
    }

    /**
     * Gets the value of the guiaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaDocumento() {
        return guiaDocumento;
    }

    /**
     * Sets the value of the guiaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaDocumento(String value) {
        this.guiaDocumento = value;
    }

    /**
     * Gets the value of the guiaId property.
     * 
     */
    public int getGuiaId() {
        return guiaId;
    }

    /**
     * Sets the value of the guiaId property.
     * 
     */
    public void setGuiaId(int value) {
        this.guiaId = value;
    }

    /**
     * Gets the value of the guiaNumeroLancamento property.
     * 
     */
    public long getGuiaNumeroLancamento() {
        return guiaNumeroLancamento;
    }

    /**
     * Sets the value of the guiaNumeroLancamento property.
     * 
     */
    public void setGuiaNumeroLancamento(long value) {
        this.guiaNumeroLancamento = value;
    }

    /**
     * Gets the value of the guiaReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaReferencia() {
        return guiaReferencia;
    }

    /**
     * Sets the value of the guiaReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaReferencia(String value) {
        this.guiaReferencia = value;
    }

    /**
     * Gets the value of the guiaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaStatus() {
        return guiaStatus;
    }

    /**
     * Sets the value of the guiaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaStatus(String value) {
        this.guiaStatus = value;
    }

    /**
     * Gets the value of the guiaTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaTipo() {
        return guiaTipo;
    }

    /**
     * Sets the value of the guiaTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaTipo(String value) {
        this.guiaTipo = value;
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
     * Gets the value of the usuario2 property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario2() {
        return usuario2;
    }

    /**
     * Sets the value of the usuario2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario2(Usuario value) {
        this.usuario2 = value;
    }

}
