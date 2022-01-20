
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contaCorrente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contaCorrente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://webservice.centralserver.co.mz/}cliente" minOccurs="0"/>
 *         &lt;element name="coco_credito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coco_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="coco_debito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coco_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coco_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coco_saldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
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
@XmlType(name = "contaCorrente", propOrder = {
    "cliente",
    "cocoCredito",
    "cocoData",
    "cocoDebito",
    "cocoDocumento",
    "cocoId",
    "cocoSaldo",
    "encrypted",
    "entidade",
    "usuario"
})
public class ContaCorrente {

    protected Cliente cliente;
    @XmlElement(name = "coco_credito")
    protected double cocoCredito;
    @XmlElement(name = "coco_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cocoData;
    @XmlElement(name = "coco_debito")
    protected double cocoDebito;
    @XmlElement(name = "coco_documento")
    protected String cocoDocumento;
    @XmlElement(name = "coco_id")
    protected int cocoId;
    @XmlElement(name = "coco_saldo")
    protected double cocoSaldo;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Usuario usuario;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the cocoCredito property.
     * 
     */
    public double getCocoCredito() {
        return cocoCredito;
    }

    /**
     * Sets the value of the cocoCredito property.
     * 
     */
    public void setCocoCredito(double value) {
        this.cocoCredito = value;
    }

    /**
     * Gets the value of the cocoData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCocoData() {
        return cocoData;
    }

    /**
     * Sets the value of the cocoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCocoData(XMLGregorianCalendar value) {
        this.cocoData = value;
    }

    /**
     * Gets the value of the cocoDebito property.
     * 
     */
    public double getCocoDebito() {
        return cocoDebito;
    }

    /**
     * Sets the value of the cocoDebito property.
     * 
     */
    public void setCocoDebito(double value) {
        this.cocoDebito = value;
    }

    /**
     * Gets the value of the cocoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCocoDocumento() {
        return cocoDocumento;
    }

    /**
     * Sets the value of the cocoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCocoDocumento(String value) {
        this.cocoDocumento = value;
    }

    /**
     * Gets the value of the cocoId property.
     * 
     */
    public int getCocoId() {
        return cocoId;
    }

    /**
     * Sets the value of the cocoId property.
     * 
     */
    public void setCocoId(int value) {
        this.cocoId = value;
    }

    /**
     * Gets the value of the cocoSaldo property.
     * 
     */
    public double getCocoSaldo() {
        return cocoSaldo;
    }

    /**
     * Sets the value of the cocoSaldo property.
     * 
     */
    public void setCocoSaldo(double value) {
        this.cocoSaldo = value;
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
