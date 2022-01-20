
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diaSemana complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diaSemana">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dias_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dias_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "diaSemana", propOrder = {
    "diasDescricao",
    "diasId",
    "encrypted"
})
public class DiaSemana {

    @XmlElement(name = "dias_descricao")
    protected String diasDescricao;
    @XmlElement(name = "dias_id")
    protected int diasId;
    protected boolean encrypted;

    /**
     * Gets the value of the diasDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiasDescricao() {
        return diasDescricao;
    }

    /**
     * Sets the value of the diasDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiasDescricao(String value) {
        this.diasDescricao = value;
    }

    /**
     * Gets the value of the diasId property.
     * 
     */
    public int getDiasId() {
        return diasId;
    }

    /**
     * Sets the value of the diasId property.
     * 
     */
    public void setDiasId(int value) {
        this.diasId = value;
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
