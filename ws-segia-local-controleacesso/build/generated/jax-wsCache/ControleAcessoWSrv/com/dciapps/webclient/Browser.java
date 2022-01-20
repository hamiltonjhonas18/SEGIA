
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for browser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="browser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bro_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bro_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bro_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bro_lembre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "browser", propOrder = {
    "broData",
    "broDescricao",
    "broId",
    "broLembre",
    "usuario"
})
public class Browser {

    @XmlElement(name = "bro_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar broData;
    @XmlElement(name = "bro_descricao")
    protected String broDescricao;
    @XmlElement(name = "bro_id")
    protected int broId;
    @XmlElement(name = "bro_lembre")
    protected String broLembre;
    protected Usuario usuario;

    /**
     * Gets the value of the broData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBroData() {
        return broData;
    }

    /**
     * Sets the value of the broData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBroData(XMLGregorianCalendar value) {
        this.broData = value;
    }

    /**
     * Gets the value of the broDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroDescricao() {
        return broDescricao;
    }

    /**
     * Sets the value of the broDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroDescricao(String value) {
        this.broDescricao = value;
    }

    /**
     * Gets the value of the broId property.
     * 
     */
    public int getBroId() {
        return broId;
    }

    /**
     * Sets the value of the broId property.
     * 
     */
    public void setBroId(int value) {
        this.broId = value;
    }

    /**
     * Gets the value of the broLembre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroLembre() {
        return broLembre;
    }

    /**
     * Sets the value of the broLembre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroLembre(String value) {
        this.broLembre = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
