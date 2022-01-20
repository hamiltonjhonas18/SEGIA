
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cor_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cor_codigoHexaDecimal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cor_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cor_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cor", propOrder = {
    "corCodigo",
    "corCodigoHexaDecimal",
    "corId",
    "corNome",
    "encrypted"
})
public class Cor {

    @XmlElement(name = "cor_codigo")
    protected String corCodigo;
    @XmlElement(name = "cor_codigoHexaDecimal")
    protected String corCodigoHexaDecimal;
    @XmlElement(name = "cor_id")
    protected int corId;
    @XmlElement(name = "cor_nome")
    protected String corNome;
    protected boolean encrypted;

    /**
     * Gets the value of the corCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorCodigo() {
        return corCodigo;
    }

    /**
     * Sets the value of the corCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorCodigo(String value) {
        this.corCodigo = value;
    }

    /**
     * Gets the value of the corCodigoHexaDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorCodigoHexaDecimal() {
        return corCodigoHexaDecimal;
    }

    /**
     * Sets the value of the corCodigoHexaDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorCodigoHexaDecimal(String value) {
        this.corCodigoHexaDecimal = value;
    }

    /**
     * Gets the value of the corId property.
     * 
     */
    public int getCorId() {
        return corId;
    }

    /**
     * Sets the value of the corId property.
     * 
     */
    public void setCorId(int value) {
        this.corId = value;
    }

    /**
     * Gets the value of the corNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorNome() {
        return corNome;
    }

    /**
     * Sets the value of the corNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorNome(String value) {
        this.corNome = value;
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

}
