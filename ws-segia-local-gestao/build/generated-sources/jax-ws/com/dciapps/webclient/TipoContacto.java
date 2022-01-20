
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoContacto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoContacto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tipc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipc_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoContacto", propOrder = {
    "encrypted",
    "tipcId",
    "tipcNome"
})
public class TipoContacto {

    protected boolean encrypted;
    @XmlElement(name = "tipc_id")
    protected int tipcId;
    @XmlElement(name = "tipc_nome")
    protected String tipcNome;

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
     * Gets the value of the tipcId property.
     * 
     */
    public int getTipcId() {
        return tipcId;
    }

    /**
     * Sets the value of the tipcId property.
     * 
     */
    public void setTipcId(int value) {
        this.tipcId = value;
    }

    /**
     * Gets the value of the tipcNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipcNome() {
        return tipcNome;
    }

    /**
     * Sets the value of the tipcNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipcNome(String value) {
        this.tipcNome = value;
    }

}
