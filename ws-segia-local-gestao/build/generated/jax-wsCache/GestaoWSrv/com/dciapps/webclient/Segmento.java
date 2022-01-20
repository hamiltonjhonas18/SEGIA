
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="seg_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seg_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seg_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seg_numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmento", propOrder = {
    "encrypted",
    "entidade",
    "segCategoria",
    "segDescricao",
    "segId",
    "segNumero"
})
public class Segmento {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "seg_categoria")
    protected String segCategoria;
    @XmlElement(name = "seg_descricao")
    protected String segDescricao;
    @XmlElement(name = "seg_id")
    protected int segId;
    @XmlElement(name = "seg_numero")
    protected int segNumero;

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
     * Gets the value of the segCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegCategoria() {
        return segCategoria;
    }

    /**
     * Sets the value of the segCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegCategoria(String value) {
        this.segCategoria = value;
    }

    /**
     * Gets the value of the segDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegDescricao() {
        return segDescricao;
    }

    /**
     * Sets the value of the segDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegDescricao(String value) {
        this.segDescricao = value;
    }

    /**
     * Gets the value of the segId property.
     * 
     */
    public int getSegId() {
        return segId;
    }

    /**
     * Sets the value of the segId property.
     * 
     */
    public void setSegId(int value) {
        this.segId = value;
    }

    /**
     * Gets the value of the segNumero property.
     * 
     */
    public int getSegNumero() {
        return segNumero;
    }

    /**
     * Sets the value of the segNumero property.
     * 
     */
    public void setSegNumero(int value) {
        this.segNumero = value;
    }

}
