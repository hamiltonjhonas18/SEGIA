
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for firma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="firma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="firm_contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firm_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firm_endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firm_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firma", propOrder = {
    "encrypted",
    "entidade",
    "firmContacto",
    "firmDescricao",
    "firmEndereco",
    "firmId"
})
public class Firma {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "firm_contacto")
    protected String firmContacto;
    @XmlElement(name = "firm_descricao")
    protected String firmDescricao;
    @XmlElement(name = "firm_endereco")
    protected String firmEndereco;
    @XmlElement(name = "firm_id")
    protected int firmId;

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
     * Gets the value of the firmContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmContacto() {
        return firmContacto;
    }

    /**
     * Sets the value of the firmContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmContacto(String value) {
        this.firmContacto = value;
    }

    /**
     * Gets the value of the firmDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmDescricao() {
        return firmDescricao;
    }

    /**
     * Sets the value of the firmDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmDescricao(String value) {
        this.firmDescricao = value;
    }

    /**
     * Gets the value of the firmEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmEndereco() {
        return firmEndereco;
    }

    /**
     * Sets the value of the firmEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmEndereco(String value) {
        this.firmEndereco = value;
    }

    /**
     * Gets the value of the firmId property.
     * 
     */
    public int getFirmId() {
        return firmId;
    }

    /**
     * Sets the value of the firmId property.
     * 
     */
    public void setFirmId(int value) {
        this.firmId = value;
    }

}
