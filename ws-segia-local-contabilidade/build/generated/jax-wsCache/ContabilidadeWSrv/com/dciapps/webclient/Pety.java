
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pety complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pety">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pety_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pety_periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pety_valorrestante" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pety_valortotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pety", propOrder = {
    "encrypted",
    "entidade",
    "petyId",
    "petyPeriodo",
    "petyValorrestante",
    "petyValortotal"
})
public class Pety {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "pety_id")
    protected int petyId;
    @XmlElement(name = "pety_periodo")
    protected String petyPeriodo;
    @XmlElement(name = "pety_valorrestante")
    protected double petyValorrestante;
    @XmlElement(name = "pety_valortotal")
    protected double petyValortotal;

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
     * Gets the value of the petyId property.
     * 
     */
    public int getPetyId() {
        return petyId;
    }

    /**
     * Sets the value of the petyId property.
     * 
     */
    public void setPetyId(int value) {
        this.petyId = value;
    }

    /**
     * Gets the value of the petyPeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetyPeriodo() {
        return petyPeriodo;
    }

    /**
     * Sets the value of the petyPeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetyPeriodo(String value) {
        this.petyPeriodo = value;
    }

    /**
     * Gets the value of the petyValorrestante property.
     * 
     */
    public double getPetyValorrestante() {
        return petyValorrestante;
    }

    /**
     * Sets the value of the petyValorrestante property.
     * 
     */
    public void setPetyValorrestante(double value) {
        this.petyValorrestante = value;
    }

    /**
     * Gets the value of the petyValortotal property.
     * 
     */
    public double getPetyValortotal() {
        return petyValortotal;
    }

    /**
     * Sets the value of the petyValortotal property.
     * 
     */
    public void setPetyValortotal(double value) {
        this.petyValortotal = value;
    }

}
