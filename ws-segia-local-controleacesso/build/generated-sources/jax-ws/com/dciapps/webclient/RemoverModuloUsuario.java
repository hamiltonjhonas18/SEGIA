
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_moduloUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_moduloUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moduloUsuario" type="{http://webservice.centralserver.co.mz/}moduloUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_moduloUsuario", propOrder = {
    "moduloUsuario"
})
public class RemoverModuloUsuario {

    protected ModuloUsuario moduloUsuario;

    /**
     * Gets the value of the moduloUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link ModuloUsuario }
     *     
     */
    public ModuloUsuario getModuloUsuario() {
        return moduloUsuario;
    }

    /**
     * Sets the value of the moduloUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuloUsuario }
     *     
     */
    public void setModuloUsuario(ModuloUsuario value) {
        this.moduloUsuario = value;
    }

}
