
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cida_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cida_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "cidade", propOrder = {
    "cidaDescricao",
    "cidaId",
    "encrypted"
})
public class Cidade {

    @XmlElement(name = "cida_descricao")
    protected String cidaDescricao;
    @XmlElement(name = "cida_id")
    protected int cidaId;
    protected boolean encrypted;

    /**
     * Gets the value of the cidaDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidaDescricao() {
        return cidaDescricao;
    }

    /**
     * Sets the value of the cidaDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidaDescricao(String value) {
        this.cidaDescricao = value;
    }

    /**
     * Gets the value of the cidaId property.
     * 
     */
    public int getCidaId() {
        return cidaId;
    }

    /**
     * Sets the value of the cidaId property.
     * 
     */
    public void setCidaId(int value) {
        this.cidaId = value;
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
