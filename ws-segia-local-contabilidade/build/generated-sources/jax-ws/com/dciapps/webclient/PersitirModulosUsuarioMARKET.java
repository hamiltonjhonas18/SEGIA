
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persitir_modulosUsuarioMARKET complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persitir_modulosUsuarioMARKET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modulosUsuarioMARKET" type="{http://webservice.centralserver.co.mz/}modulosUsuarioMARKET" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persitir_modulosUsuarioMARKET", propOrder = {
    "modulosUsuarioMARKET"
})
public class PersitirModulosUsuarioMARKET {

    protected ModulosUsuarioMARKET modulosUsuarioMARKET;

    /**
     * Gets the value of the modulosUsuarioMARKET property.
     * 
     * @return
     *     possible object is
     *     {@link ModulosUsuarioMARKET }
     *     
     */
    public ModulosUsuarioMARKET getModulosUsuarioMARKET() {
        return modulosUsuarioMARKET;
    }

    /**
     * Sets the value of the modulosUsuarioMARKET property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModulosUsuarioMARKET }
     *     
     */
    public void setModulosUsuarioMARKET(ModulosUsuarioMARKET value) {
        this.modulosUsuarioMARKET = value;
    }

}
