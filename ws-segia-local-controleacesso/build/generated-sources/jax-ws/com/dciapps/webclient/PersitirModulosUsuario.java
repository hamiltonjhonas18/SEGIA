
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persitir_modulosUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persitir_modulosUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modulosUsuario" type="{http://webservice.centralserver.co.mz/}modulosUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persitir_modulosUsuario", propOrder = {
    "modulosUsuario"
})
public class PersitirModulosUsuario {

    protected ModulosUsuario modulosUsuario;

    /**
     * Gets the value of the modulosUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link ModulosUsuario }
     *     
     */
    public ModulosUsuario getModulosUsuario() {
        return modulosUsuario;
    }

    /**
     * Sets the value of the modulosUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModulosUsuario }
     *     
     */
    public void setModulosUsuario(ModulosUsuario value) {
        this.modulosUsuario = value;
    }

}
