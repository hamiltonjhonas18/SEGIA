
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moeda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moeda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="moe_cambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moe_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moe_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moeda", propOrder = {
    "encrypted",
    "entidade",
    "moeCambio",
    "moeId",
    "moeNome"
})
public class Moeda {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "moe_cambio")
    protected Double moeCambio;
    @XmlElement(name = "moe_id")
    protected int moeId;
    @XmlElement(name = "moe_nome")
    protected String moeNome;

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
     * Gets the value of the moeCambio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMoeCambio() {
        return moeCambio;
    }

    /**
     * Sets the value of the moeCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMoeCambio(Double value) {
        this.moeCambio = value;
    }

    /**
     * Gets the value of the moeId property.
     * 
     */
    public int getMoeId() {
        return moeId;
    }

    /**
     * Sets the value of the moeId property.
     * 
     */
    public void setMoeId(int value) {
        this.moeId = value;
    }

    /**
     * Gets the value of the moeNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeNome() {
        return moeNome;
    }

    /**
     * Sets the value of the moeNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeNome(String value) {
        this.moeNome = value;
    }

}
