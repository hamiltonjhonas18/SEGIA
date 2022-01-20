
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_formulariosUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_formulariosUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formulariosUsuario" type="{http://webservice.centralserver.co.mz/}formulariosUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_formulariosUsuario", propOrder = {
    "formulariosUsuario"
})
public class PersistirFormulariosUsuario {

    protected FormulariosUsuario formulariosUsuario;

    /**
     * Gets the value of the formulariosUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link FormulariosUsuario }
     *     
     */
    public FormulariosUsuario getFormulariosUsuario() {
        return formulariosUsuario;
    }

    /**
     * Sets the value of the formulariosUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulariosUsuario }
     *     
     */
    public void setFormulariosUsuario(FormulariosUsuario value) {
        this.formulariosUsuario = value;
    }

}
