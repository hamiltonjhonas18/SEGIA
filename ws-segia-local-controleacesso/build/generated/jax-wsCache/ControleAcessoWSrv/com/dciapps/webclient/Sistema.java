
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sistema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sist_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sist_estado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sist_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sist_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sistema", propOrder = {
    "encrypted",
    "sistDescricao",
    "sistEstado",
    "sistId",
    "sistUrl"
})
public class Sistema {

    protected boolean encrypted;
    @XmlElement(name = "sist_descricao")
    protected String sistDescricao;
    @XmlElement(name = "sist_estado")
    protected boolean sistEstado;
    @XmlElement(name = "sist_id")
    protected int sistId;
    @XmlElement(name = "sist_url")
    protected String sistUrl;

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
     * Gets the value of the sistDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistDescricao() {
        return sistDescricao;
    }

    /**
     * Sets the value of the sistDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistDescricao(String value) {
        this.sistDescricao = value;
    }

    /**
     * Gets the value of the sistEstado property.
     * 
     */
    public boolean isSistEstado() {
        return sistEstado;
    }

    /**
     * Sets the value of the sistEstado property.
     * 
     */
    public void setSistEstado(boolean value) {
        this.sistEstado = value;
    }

    /**
     * Gets the value of the sistId property.
     * 
     */
    public int getSistId() {
        return sistId;
    }

    /**
     * Sets the value of the sistId property.
     * 
     */
    public void setSistId(int value) {
        this.sistId = value;
    }

    /**
     * Gets the value of the sistUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistUrl() {
        return sistUrl;
    }

    /**
     * Sets the value of the sistUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistUrl(String value) {
        this.sistUrl = value;
    }

}
