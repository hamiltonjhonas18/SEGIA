
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for moduloUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moduloUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modu_dataUltimoLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modu_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modu_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modu_visitas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moduloAcesso" type="{http://webservice.centralserver.co.mz/}moduloAcesso" minOccurs="0"/>
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
@XmlType(name = "moduloUsuario", propOrder = {
    "encrypted",
    "moduDataUltimoLogin",
    "moduId",
    "moduReferencia",
    "moduVisitas",
    "moduloAcesso",
    "usuario"
})
public class ModuloUsuario {

    protected boolean encrypted;
    @XmlElement(name = "modu_dataUltimoLogin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moduDataUltimoLogin;
    @XmlElement(name = "modu_id")
    protected int moduId;
    @XmlElement(name = "modu_referencia")
    protected String moduReferencia;
    @XmlElement(name = "modu_visitas")
    protected int moduVisitas;
    protected ModuloAcesso moduloAcesso;
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
     * Gets the value of the moduDataUltimoLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModuDataUltimoLogin() {
        return moduDataUltimoLogin;
    }

    /**
     * Sets the value of the moduDataUltimoLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModuDataUltimoLogin(XMLGregorianCalendar value) {
        this.moduDataUltimoLogin = value;
    }

    /**
     * Gets the value of the moduId property.
     * 
     */
    public int getModuId() {
        return moduId;
    }

    /**
     * Sets the value of the moduId property.
     * 
     */
    public void setModuId(int value) {
        this.moduId = value;
    }

    /**
     * Gets the value of the moduReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuReferencia() {
        return moduReferencia;
    }

    /**
     * Sets the value of the moduReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuReferencia(String value) {
        this.moduReferencia = value;
    }

    /**
     * Gets the value of the moduVisitas property.
     * 
     */
    public int getModuVisitas() {
        return moduVisitas;
    }

    /**
     * Sets the value of the moduVisitas property.
     * 
     */
    public void setModuVisitas(int value) {
        this.moduVisitas = value;
    }

    /**
     * Gets the value of the moduloAcesso property.
     * 
     * @return
     *     possible object is
     *     {@link ModuloAcesso }
     *     
     */
    public ModuloAcesso getModuloAcesso() {
        return moduloAcesso;
    }

    /**
     * Sets the value of the moduloAcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuloAcesso }
     *     
     */
    public void setModuloAcesso(ModuloAcesso value) {
        this.moduloAcesso = value;
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
