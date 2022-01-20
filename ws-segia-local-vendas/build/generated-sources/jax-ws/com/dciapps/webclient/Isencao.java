
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isencao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="isencao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="isen_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isen_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isen_detalhes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isen_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isencao", propOrder = {
    "encrypted",
    "entidade",
    "isenCodigo",
    "isenDescricao",
    "isenDetalhes",
    "isenId"
})
public class Isencao {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "isen_codigo")
    protected String isenCodigo;
    @XmlElement(name = "isen_descricao")
    protected String isenDescricao;
    @XmlElement(name = "isen_detalhes")
    protected String isenDetalhes;
    @XmlElement(name = "isen_id")
    protected int isenId;

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
     * Gets the value of the isenCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsenCodigo() {
        return isenCodigo;
    }

    /**
     * Sets the value of the isenCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsenCodigo(String value) {
        this.isenCodigo = value;
    }

    /**
     * Gets the value of the isenDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsenDescricao() {
        return isenDescricao;
    }

    /**
     * Sets the value of the isenDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsenDescricao(String value) {
        this.isenDescricao = value;
    }

    /**
     * Gets the value of the isenDetalhes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsenDetalhes() {
        return isenDetalhes;
    }

    /**
     * Sets the value of the isenDetalhes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsenDetalhes(String value) {
        this.isenDetalhes = value;
    }

    /**
     * Gets the value of the isenId property.
     * 
     */
    public int getIsenId() {
        return isenId;
    }

    /**
     * Sets the value of the isenId property.
     * 
     */
    public void setIsenId(int value) {
        this.isenId = value;
    }

}
