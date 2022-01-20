
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dir_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dir_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "diario", propOrder = {
    "dirId",
    "dirNome",
    "encrypted",
    "entidade"
})
public class Diario {

    @XmlElement(name = "dir_id")
    protected int dirId;
    @XmlElement(name = "dir_nome")
    protected String dirNome;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the dirId property.
     * 
     */
    public int getDirId() {
        return dirId;
    }

    /**
     * Sets the value of the dirId property.
     * 
     */
    public void setDirId(int value) {
        this.dirId = value;
    }

    /**
     * Gets the value of the dirNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirNome() {
        return dirNome;
    }

    /**
     * Sets the value of the dirNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirNome(String value) {
        this.dirNome = value;
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
