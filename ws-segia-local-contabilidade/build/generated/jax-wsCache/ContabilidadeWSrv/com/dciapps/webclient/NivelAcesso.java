
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nivelAcesso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nivelAcesso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="niva_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="niva_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nivelAcesso", propOrder = {
    "encrypted",
    "entidade",
    "nivaDescricao",
    "nivaId"
})
public class NivelAcesso {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "niva_descricao")
    protected String nivaDescricao;
    @XmlElement(name = "niva_id")
    protected int nivaId;

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
     * Gets the value of the nivaDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivaDescricao() {
        return nivaDescricao;
    }

    /**
     * Sets the value of the nivaDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivaDescricao(String value) {
        this.nivaDescricao = value;
    }

    /**
     * Gets the value of the nivaId property.
     * 
     */
    public int getNivaId() {
        return nivaId;
    }

    /**
     * Sets the value of the nivaId property.
     * 
     */
    public void setNivaId(int value) {
        this.nivaId = value;
    }

}
