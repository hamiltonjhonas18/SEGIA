
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_formulario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_formulario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formulario" type="{http://webservice.centralserver.co.mz/}formulario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_formulario", propOrder = {
    "formulario"
})
public class PersistirFormulario {

    protected Formulario formulario;

    /**
     * Gets the value of the formulario property.
     * 
     * @return
     *     possible object is
     *     {@link Formulario }
     *     
     */
    public Formulario getFormulario() {
        return formulario;
    }

    /**
     * Sets the value of the formulario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formulario }
     *     
     */
    public void setFormulario(Formulario value) {
        this.formulario = value;
    }

}
