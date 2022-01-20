
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for extracto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extracto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="ext_credito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ext_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ext_debito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ext_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ext_movimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext_saldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="factura" type="{http://webservice.centralserver.co.mz/}factura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extracto", propOrder = {
    "encrypted",
    "entidade",
    "extCredito",
    "extData",
    "extDebito",
    "extId",
    "extMovimento",
    "extSaldo",
    "factura"
})
public class Extracto {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "ext_credito")
    protected double extCredito;
    @XmlElement(name = "ext_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar extData;
    @XmlElement(name = "ext_debito")
    protected double extDebito;
    @XmlElement(name = "ext_id")
    protected int extId;
    @XmlElement(name = "ext_movimento")
    protected String extMovimento;
    @XmlElement(name = "ext_saldo")
    protected double extSaldo;
    protected Factura factura;

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
     * Gets the value of the extCredito property.
     * 
     */
    public double getExtCredito() {
        return extCredito;
    }

    /**
     * Sets the value of the extCredito property.
     * 
     */
    public void setExtCredito(double value) {
        this.extCredito = value;
    }

    /**
     * Gets the value of the extData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExtData() {
        return extData;
    }

    /**
     * Sets the value of the extData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExtData(XMLGregorianCalendar value) {
        this.extData = value;
    }

    /**
     * Gets the value of the extDebito property.
     * 
     */
    public double getExtDebito() {
        return extDebito;
    }

    /**
     * Sets the value of the extDebito property.
     * 
     */
    public void setExtDebito(double value) {
        this.extDebito = value;
    }

    /**
     * Gets the value of the extId property.
     * 
     */
    public int getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     * 
     */
    public void setExtId(int value) {
        this.extId = value;
    }

    /**
     * Gets the value of the extMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtMovimento() {
        return extMovimento;
    }

    /**
     * Sets the value of the extMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtMovimento(String value) {
        this.extMovimento = value;
    }

    /**
     * Gets the value of the extSaldo property.
     * 
     */
    public double getExtSaldo() {
        return extSaldo;
    }

    /**
     * Sets the value of the extSaldo property.
     * 
     */
    public void setExtSaldo(double value) {
        this.extSaldo = value;
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

}
