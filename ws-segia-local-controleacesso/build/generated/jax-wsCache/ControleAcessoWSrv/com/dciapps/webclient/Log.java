
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for log complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="log">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="log_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="log_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="log_hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="log_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sistema" type="{http://webservice.centralserver.co.mz/}sistema" minOccurs="0"/>
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
@XmlType(name = "log", propOrder = {
    "encrypted",
    "entidade",
    "logData",
    "logDescricao",
    "logHora",
    "logId",
    "sistema",
    "usuario"
})
public class Log {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "log_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar logData;
    @XmlElement(name = "log_descricao")
    protected String logDescricao;
    @XmlElement(name = "log_hora")
    protected String logHora;
    @XmlElement(name = "log_id")
    protected int logId;
    protected Sistema sistema;
    protected Usuario usuario;

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
     * Gets the value of the logData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLogData() {
        return logData;
    }

    /**
     * Sets the value of the logData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLogData(XMLGregorianCalendar value) {
        this.logData = value;
    }

    /**
     * Gets the value of the logDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogDescricao() {
        return logDescricao;
    }

    /**
     * Sets the value of the logDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogDescricao(String value) {
        this.logDescricao = value;
    }

    /**
     * Gets the value of the logHora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogHora() {
        return logHora;
    }

    /**
     * Sets the value of the logHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogHora(String value) {
        this.logHora = value;
    }

    /**
     * Gets the value of the logId property.
     * 
     */
    public int getLogId() {
        return logId;
    }

    /**
     * Sets the value of the logId property.
     * 
     */
    public void setLogId(int value) {
        this.logId = value;
    }

    /**
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistema(Sistema value) {
        this.sistema = value;
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
