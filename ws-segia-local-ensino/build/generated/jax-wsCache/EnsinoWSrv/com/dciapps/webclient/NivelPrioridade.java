
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nivelPrioridade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nivelPrioridade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nvp_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nvp_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nivelPrioridade", propOrder = {
    "encrypted",
    "nvpDescricao",
    "nvpId"
})
public class NivelPrioridade {

    protected boolean encrypted;
    @XmlElement(name = "nvp_descricao")
    protected String nvpDescricao;
    @XmlElement(name = "nvp_id")
    protected int nvpId;

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
     * Gets the value of the nvpDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNvpDescricao() {
        return nvpDescricao;
    }

    /**
     * Sets the value of the nvpDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNvpDescricao(String value) {
        this.nvpDescricao = value;
    }

    /**
     * Gets the value of the nvpId property.
     * 
     */
    public int getNvpId() {
        return nvpId;
    }

    /**
     * Sets the value of the nvpId property.
     * 
     */
    public void setNvpId(int value) {
        this.nvpId = value;
    }

}
