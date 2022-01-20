
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for boletim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boletim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bole_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bole_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bole_periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bole_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="inscricao" type="{http://webservice.centralserver.co.mz/}inscricao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boletim", propOrder = {
    "boleDescricao",
    "boleId",
    "bolePeriodo",
    "boleStatus",
    "encrypted",
    "entidade",
    "inscricao"
})
public class Boletim {

    @XmlElement(name = "bole_descricao")
    protected String boleDescricao;
    @XmlElement(name = "bole_id")
    protected int boleId;
    @XmlElement(name = "bole_periodo")
    protected String bolePeriodo;
    @XmlElement(name = "bole_status")
    protected String boleStatus;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Inscricao inscricao;

    /**
     * Gets the value of the boleDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoleDescricao() {
        return boleDescricao;
    }

    /**
     * Sets the value of the boleDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoleDescricao(String value) {
        this.boleDescricao = value;
    }

    /**
     * Gets the value of the boleId property.
     * 
     */
    public int getBoleId() {
        return boleId;
    }

    /**
     * Sets the value of the boleId property.
     * 
     */
    public void setBoleId(int value) {
        this.boleId = value;
    }

    /**
     * Gets the value of the bolePeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolePeriodo() {
        return bolePeriodo;
    }

    /**
     * Sets the value of the bolePeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolePeriodo(String value) {
        this.bolePeriodo = value;
    }

    /**
     * Gets the value of the boleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoleStatus() {
        return boleStatus;
    }

    /**
     * Sets the value of the boleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoleStatus(String value) {
        this.boleStatus = value;
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

    /**
     * Gets the value of the inscricao property.
     * 
     * @return
     *     possible object is
     *     {@link Inscricao }
     *     
     */
    public Inscricao getInscricao() {
        return inscricao;
    }

    /**
     * Sets the value of the inscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inscricao }
     *     
     */
    public void setInscricao(Inscricao value) {
        this.inscricao = value;
    }

}
