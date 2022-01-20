
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formulario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formulario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="form_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="form_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="form_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistema" type="{http://webservice.centralserver.co.mz/}sistema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formulario", propOrder = {
    "formDescricao",
    "formId",
    "formReferencia",
    "sistema"
})
public class Formulario {

    @XmlElement(name = "form_descricao")
    protected String formDescricao;
    @XmlElement(name = "form_id")
    protected int formId;
    @XmlElement(name = "form_referencia")
    protected String formReferencia;
    protected Sistema sistema;

    /**
     * Gets the value of the formDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormDescricao() {
        return formDescricao;
    }

    /**
     * Sets the value of the formDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormDescricao(String value) {
        this.formDescricao = value;
    }

    /**
     * Gets the value of the formId property.
     * 
     */
    public int getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     */
    public void setFormId(int value) {
        this.formId = value;
    }

    /**
     * Gets the value of the formReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormReferencia() {
        return formReferencia;
    }

    /**
     * Sets the value of the formReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormReferencia(String value) {
        this.formReferencia = value;
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

}
