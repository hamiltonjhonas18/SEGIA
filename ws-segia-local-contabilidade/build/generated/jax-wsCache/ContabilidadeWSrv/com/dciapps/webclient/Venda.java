
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for venda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="venda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://webservice.centralserver.co.mz/}cliente" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="vend_dataVenda" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vend_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vend_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vend_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vend_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "venda", propOrder = {
    "cliente",
    "encrypted",
    "entidade",
    "vendDataVenda",
    "vendDescricao",
    "vendEstado",
    "vendId",
    "vendReferencia"
})
public class Venda {

    protected Cliente cliente;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "vend_dataVenda")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vendDataVenda;
    @XmlElement(name = "vend_descricao")
    protected String vendDescricao;
    @XmlElement(name = "vend_estado")
    protected String vendEstado;
    @XmlElement(name = "vend_id")
    protected int vendId;
    @XmlElement(name = "vend_referencia")
    protected String vendReferencia;

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
     * Gets the value of the vendDataVenda property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVendDataVenda() {
        return vendDataVenda;
    }

    /**
     * Sets the value of the vendDataVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVendDataVenda(XMLGregorianCalendar value) {
        this.vendDataVenda = value;
    }

    /**
     * Gets the value of the vendDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendDescricao() {
        return vendDescricao;
    }

    /**
     * Sets the value of the vendDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendDescricao(String value) {
        this.vendDescricao = value;
    }

    /**
     * Gets the value of the vendEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendEstado() {
        return vendEstado;
    }

    /**
     * Sets the value of the vendEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendEstado(String value) {
        this.vendEstado = value;
    }

    /**
     * Gets the value of the vendId property.
     * 
     */
    public int getVendId() {
        return vendId;
    }

    /**
     * Sets the value of the vendId property.
     * 
     */
    public void setVendId(int value) {
        this.vendId = value;
    }

    /**
     * Gets the value of the vendReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendReferencia() {
        return vendReferencia;
    }

    /**
     * Sets the value of the vendReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendReferencia(String value) {
        this.vendReferencia = value;
    }

}
