
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for recibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="factura" type="{http://webservice.centralserver.co.mz/}factura" minOccurs="0"/>
 *         &lt;element name="rec_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rec_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rec_lancamento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rec_mullta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rec_observacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rec_recebemosDe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rec_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rec_total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rec_valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ref_bancoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref_nrDocumentoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recibo", propOrder = {
    "encrypted",
    "entidade",
    "factura",
    "recData",
    "recId",
    "recLancamento",
    "recMullta",
    "recObservacoes",
    "recRecebemosDe",
    "recReferencia",
    "recTotal",
    "recValor",
    "refBancoPagamento",
    "refNrDocumentoPagamento"
})
public class Recibo {

    protected boolean encrypted;
    protected Entidade entidade;
    protected Factura factura;
    @XmlElement(name = "rec_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recData;
    @XmlElement(name = "rec_id")
    protected int recId;
    @XmlElement(name = "rec_lancamento")
    protected long recLancamento;
    @XmlElement(name = "rec_mullta")
    protected double recMullta;
    @XmlElement(name = "rec_observacoes")
    protected String recObservacoes;
    @XmlElement(name = "rec_recebemosDe")
    protected String recRecebemosDe;
    @XmlElement(name = "rec_referencia")
    protected String recReferencia;
    @XmlElement(name = "rec_total")
    protected double recTotal;
    @XmlElement(name = "rec_valor")
    protected double recValor;
    @XmlElement(name = "ref_bancoPagamento")
    protected String refBancoPagamento;
    @XmlElement(name = "ref_nrDocumentoPagamento")
    protected String refNrDocumentoPagamento;

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
     * Gets the value of the recData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecData() {
        return recData;
    }

    /**
     * Sets the value of the recData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecData(XMLGregorianCalendar value) {
        this.recData = value;
    }

    /**
     * Gets the value of the recId property.
     * 
     */
    public int getRecId() {
        return recId;
    }

    /**
     * Sets the value of the recId property.
     * 
     */
    public void setRecId(int value) {
        this.recId = value;
    }

    /**
     * Gets the value of the recLancamento property.
     * 
     */
    public long getRecLancamento() {
        return recLancamento;
    }

    /**
     * Sets the value of the recLancamento property.
     * 
     */
    public void setRecLancamento(long value) {
        this.recLancamento = value;
    }

    /**
     * Gets the value of the recMullta property.
     * 
     */
    public double getRecMullta() {
        return recMullta;
    }

    /**
     * Sets the value of the recMullta property.
     * 
     */
    public void setRecMullta(double value) {
        this.recMullta = value;
    }

    /**
     * Gets the value of the recObservacoes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecObservacoes() {
        return recObservacoes;
    }

    /**
     * Sets the value of the recObservacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecObservacoes(String value) {
        this.recObservacoes = value;
    }

    /**
     * Gets the value of the recRecebemosDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecRecebemosDe() {
        return recRecebemosDe;
    }

    /**
     * Sets the value of the recRecebemosDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecRecebemosDe(String value) {
        this.recRecebemosDe = value;
    }

    /**
     * Gets the value of the recReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecReferencia() {
        return recReferencia;
    }

    /**
     * Sets the value of the recReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecReferencia(String value) {
        this.recReferencia = value;
    }

    /**
     * Gets the value of the recTotal property.
     * 
     */
    public double getRecTotal() {
        return recTotal;
    }

    /**
     * Sets the value of the recTotal property.
     * 
     */
    public void setRecTotal(double value) {
        this.recTotal = value;
    }

    /**
     * Gets the value of the recValor property.
     * 
     */
    public double getRecValor() {
        return recValor;
    }

    /**
     * Sets the value of the recValor property.
     * 
     */
    public void setRecValor(double value) {
        this.recValor = value;
    }

    /**
     * Gets the value of the refBancoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefBancoPagamento() {
        return refBancoPagamento;
    }

    /**
     * Sets the value of the refBancoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefBancoPagamento(String value) {
        this.refBancoPagamento = value;
    }

    /**
     * Gets the value of the refNrDocumentoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNrDocumentoPagamento() {
        return refNrDocumentoPagamento;
    }

    /**
     * Sets the value of the refNrDocumentoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNrDocumentoPagamento(String value) {
        this.refNrDocumentoPagamento = value;
    }

}
