
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sala complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sala">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="sala_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sala_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sala_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sala", propOrder = {
    "encrypted",
    "entidade",
    "escola",
    "salaData",
    "salaDescricao",
    "salaId"
})
public class Sala {

    protected boolean encrypted;
    protected Entidade entidade;
    protected Escola escola;
    @XmlElement(name = "sala_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar salaData;
    @XmlElement(name = "sala_descricao")
    protected String salaDescricao;
    @XmlElement(name = "sala_id")
    protected int salaId;

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
     * Gets the value of the escola property.
     * 
     * @return
     *     possible object is
     *     {@link Escola }
     *     
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * Sets the value of the escola property.
     * 
     * @param value
     *     allowed object is
     *     {@link Escola }
     *     
     */
    public void setEscola(Escola value) {
        this.escola = value;
    }

    /**
     * Gets the value of the salaData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSalaData() {
        return salaData;
    }

    /**
     * Sets the value of the salaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSalaData(XMLGregorianCalendar value) {
        this.salaData = value;
    }

    /**
     * Gets the value of the salaDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaDescricao() {
        return salaDescricao;
    }

    /**
     * Sets the value of the salaDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaDescricao(String value) {
        this.salaDescricao = value;
    }

    /**
     * Gets the value of the salaId property.
     * 
     */
    public int getSalaId() {
        return salaId;
    }

    /**
     * Sets the value of the salaId property.
     * 
     */
    public void setSalaId(int value) {
        this.salaId = value;
    }

}
