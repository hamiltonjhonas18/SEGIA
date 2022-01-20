
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaTelefonica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaTelefonica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="lst_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lst_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lst_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lst_telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaTelefonica", propOrder = {
    "encrypted",
    "entidade",
    "lstCategoria",
    "lstId",
    "lstNome",
    "lstTelefone"
})
public class ListaTelefonica {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "lst_categoria")
    protected String lstCategoria;
    @XmlElement(name = "lst_id")
    protected int lstId;
    @XmlElement(name = "lst_nome")
    protected String lstNome;
    @XmlElement(name = "lst_telefone")
    protected String lstTelefone;

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
     * Gets the value of the lstCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstCategoria() {
        return lstCategoria;
    }

    /**
     * Sets the value of the lstCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstCategoria(String value) {
        this.lstCategoria = value;
    }

    /**
     * Gets the value of the lstId property.
     * 
     */
    public int getLstId() {
        return lstId;
    }

    /**
     * Sets the value of the lstId property.
     * 
     */
    public void setLstId(int value) {
        this.lstId = value;
    }

    /**
     * Gets the value of the lstNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstNome() {
        return lstNome;
    }

    /**
     * Sets the value of the lstNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstNome(String value) {
        this.lstNome = value;
    }

    /**
     * Gets the value of the lstTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstTelefone() {
        return lstTelefone;
    }

    /**
     * Sets the value of the lstTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstTelefone(String value) {
        this.lstTelefone = value;
    }

}
