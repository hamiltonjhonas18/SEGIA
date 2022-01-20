
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for registoFecho complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registoFecho">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="fecho" type="{http://webservice.centralserver.co.mz/}fecho" minOccurs="0"/>
 *         &lt;element name="produto" type="{http://webservice.centralserver.co.mz/}produto" minOccurs="0"/>
 *         &lt;element name="regf_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="regf_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regf_qtd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registoFecho", propOrder = {
    "entidade",
    "fecho",
    "produto",
    "regfData",
    "regfId",
    "regfQtd"
})
public class RegistoFecho {

    protected Entidade entidade;
    protected Fecho fecho;
    protected Produto produto;
    @XmlElement(name = "regf_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regfData;
    @XmlElement(name = "regf_id")
    protected int regfId;
    @XmlElement(name = "regf_qtd")
    protected int regfQtd;

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
     * Gets the value of the fecho property.
     * 
     * @return
     *     possible object is
     *     {@link Fecho }
     *     
     */
    public Fecho getFecho() {
        return fecho;
    }

    /**
     * Sets the value of the fecho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fecho }
     *     
     */
    public void setFecho(Fecho value) {
        this.fecho = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Sets the value of the produto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProduto(Produto value) {
        this.produto = value;
    }

    /**
     * Gets the value of the regfData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegfData() {
        return regfData;
    }

    /**
     * Sets the value of the regfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegfData(XMLGregorianCalendar value) {
        this.regfData = value;
    }

    /**
     * Gets the value of the regfId property.
     * 
     */
    public int getRegfId() {
        return regfId;
    }

    /**
     * Sets the value of the regfId property.
     * 
     */
    public void setRegfId(int value) {
        this.regfId = value;
    }

    /**
     * Gets the value of the regfQtd property.
     * 
     */
    public int getRegfQtd() {
        return regfQtd;
    }

    /**
     * Sets the value of the regfQtd property.
     * 
     */
    public void setRegfQtd(int value) {
        this.regfQtd = value;
    }

}
