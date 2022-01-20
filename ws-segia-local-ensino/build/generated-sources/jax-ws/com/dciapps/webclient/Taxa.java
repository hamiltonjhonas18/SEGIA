
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="taxa_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxa_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taxa_valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxa", propOrder = {
    "encrypted",
    "entidade",
    "taxaDescricao",
    "taxaId",
    "taxaValor"
})
public class Taxa {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "taxa_descricao")
    protected String taxaDescricao;
    @XmlElement(name = "taxa_id")
    protected int taxaId;
    @XmlElement(name = "taxa_valor")
    protected double taxaValor;

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
     * Gets the value of the taxaDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxaDescricao() {
        return taxaDescricao;
    }

    /**
     * Sets the value of the taxaDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxaDescricao(String value) {
        this.taxaDescricao = value;
    }

    /**
     * Gets the value of the taxaId property.
     * 
     */
    public int getTaxaId() {
        return taxaId;
    }

    /**
     * Sets the value of the taxaId property.
     * 
     */
    public void setTaxaId(int value) {
        this.taxaId = value;
    }

    /**
     * Gets the value of the taxaValor property.
     * 
     */
    public double getTaxaValor() {
        return taxaValor;
    }

    /**
     * Sets the value of the taxaValor property.
     * 
     */
    public void setTaxaValor(double value) {
        this.taxaValor = value;
    }

}
