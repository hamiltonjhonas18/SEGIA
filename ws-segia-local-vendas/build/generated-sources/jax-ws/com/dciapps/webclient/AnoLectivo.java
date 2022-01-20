
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anoLectivo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anoLectivo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anol_corrente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="anol_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anol_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="anol_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "anoLectivo", propOrder = {
    "anolCorrente",
    "anolDescricao",
    "anolId",
    "anolStatus",
    "encrypted",
    "entidade"
})
public class AnoLectivo {

    @XmlElement(name = "anol_corrente")
    protected boolean anolCorrente;
    @XmlElement(name = "anol_descricao")
    protected String anolDescricao;
    @XmlElement(name = "anol_id")
    protected int anolId;
    @XmlElement(name = "anol_status")
    protected String anolStatus;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the anolCorrente property.
     * 
     */
    public boolean isAnolCorrente() {
        return anolCorrente;
    }

    /**
     * Sets the value of the anolCorrente property.
     * 
     */
    public void setAnolCorrente(boolean value) {
        this.anolCorrente = value;
    }

    /**
     * Gets the value of the anolDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnolDescricao() {
        return anolDescricao;
    }

    /**
     * Sets the value of the anolDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnolDescricao(String value) {
        this.anolDescricao = value;
    }

    /**
     * Gets the value of the anolId property.
     * 
     */
    public int getAnolId() {
        return anolId;
    }

    /**
     * Sets the value of the anolId property.
     * 
     */
    public void setAnolId(int value) {
        this.anolId = value;
    }

    /**
     * Gets the value of the anolStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnolStatus() {
        return anolStatus;
    }

    /**
     * Sets the value of the anolStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnolStatus(String value) {
        this.anolStatus = value;
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
