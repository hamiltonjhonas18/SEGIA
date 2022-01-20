
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estadoFactura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="estadoFactura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="estf_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estf_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estadoFactura", propOrder = {
    "encrypted",
    "estfDescricao",
    "estfId"
})
public class EstadoFactura {

    protected boolean encrypted;
    @XmlElement(name = "estf_descricao")
    protected String estfDescricao;
    @XmlElement(name = "estf_id")
    protected int estfId;

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
     * Gets the value of the estfDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstfDescricao() {
        return estfDescricao;
    }

    /**
     * Sets the value of the estfDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstfDescricao(String value) {
        this.estfDescricao = value;
    }

    /**
     * Gets the value of the estfId property.
     * 
     */
    public int getEstfId() {
        return estfId;
    }

    /**
     * Sets the value of the estfId property.
     * 
     */
    public void setEstfId(int value) {
        this.estfId = value;
    }

}
