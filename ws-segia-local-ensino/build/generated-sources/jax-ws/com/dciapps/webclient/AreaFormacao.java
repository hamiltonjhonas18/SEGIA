
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for areaFormacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="areaFormacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aref_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aref_detalhes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aref_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaFormacao", propOrder = {
    "arefDescricao",
    "arefDetalhes",
    "arefId",
    "encrypted",
    "entidade"
})
public class AreaFormacao {

    @XmlElement(name = "aref_descricao")
    protected String arefDescricao;
    @XmlElement(name = "aref_detalhes")
    protected String arefDetalhes;
    @XmlElement(name = "aref_id")
    protected int arefId;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the arefDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArefDescricao() {
        return arefDescricao;
    }

    /**
     * Sets the value of the arefDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArefDescricao(String value) {
        this.arefDescricao = value;
    }

    /**
     * Gets the value of the arefDetalhes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArefDetalhes() {
        return arefDetalhes;
    }

    /**
     * Sets the value of the arefDetalhes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArefDetalhes(String value) {
        this.arefDetalhes = value;
    }

    /**
     * Gets the value of the arefId property.
     * 
     */
    public int getArefId() {
        return arefId;
    }

    /**
     * Sets the value of the arefId property.
     * 
     */
    public void setArefId(int value) {
        this.arefId = value;
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

}
