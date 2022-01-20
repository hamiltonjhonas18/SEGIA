
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoConta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="tip_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tip_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConta", propOrder = {
    "encrypted",
    "entidade",
    "tipId",
    "tipNome"
})
public class TipoConta {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "tip_id")
    protected int tipId;
    @XmlElement(name = "tip_nome")
    protected String tipNome;

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
     * Gets the value of the tipId property.
     * 
     */
    public int getTipId() {
        return tipId;
    }

    /**
     * Sets the value of the tipId property.
     * 
     */
    public void setTipId(int value) {
        this.tipId = value;
    }

    /**
     * Gets the value of the tipNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipNome() {
        return tipNome;
    }

    /**
     * Sets the value of the tipNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipNome(String value) {
        this.tipNome = value;
    }

}
