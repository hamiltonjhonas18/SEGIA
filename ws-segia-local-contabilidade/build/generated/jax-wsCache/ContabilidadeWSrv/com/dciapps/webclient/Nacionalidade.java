
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nacionalidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nacionalidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="naci_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naci_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nacionalidade", propOrder = {
    "encrypted",
    "naciDescricao",
    "naciId"
})
public class Nacionalidade {

    protected boolean encrypted;
    @XmlElement(name = "naci_descricao")
    protected String naciDescricao;
    @XmlElement(name = "naci_id")
    protected int naciId;

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
     * Gets the value of the naciDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaciDescricao() {
        return naciDescricao;
    }

    /**
     * Sets the value of the naciDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaciDescricao(String value) {
        this.naciDescricao = value;
    }

    /**
     * Gets the value of the naciId property.
     * 
     */
    public int getNaciId() {
        return naciId;
    }

    /**
     * Sets the value of the naciId property.
     * 
     */
    public void setNaciId(int value) {
        this.naciId = value;
    }

}
