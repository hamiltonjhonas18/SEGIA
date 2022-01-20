
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for administracao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="administracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adm_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adm_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empresa" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
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
@XmlType(name = "administracao", propOrder = {
    "admId",
    "admNome",
    "empresa",
    "encrypted"
})
public class Administracao {

    @XmlElement(name = "adm_id")
    protected int admId;
    @XmlElement(name = "adm_nome")
    protected String admNome;
    protected Entidade empresa;
    protected boolean encrypted;

    /**
     * Gets the value of the admId property.
     * 
     */
    public int getAdmId() {
        return admId;
    }

    /**
     * Sets the value of the admId property.
     * 
     */
    public void setAdmId(int value) {
        this.admId = value;
    }

    /**
     * Gets the value of the admNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmNome() {
        return admNome;
    }

    /**
     * Sets the value of the admNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmNome(String value) {
        this.admNome = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEmpresa(Entidade value) {
        this.empresa = value;
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
