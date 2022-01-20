
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_moduloAcesso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_moduloAcesso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moduloAcesso" type="{http://webservice.centralserver.co.mz/}moduloAcesso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_moduloAcesso", propOrder = {
    "moduloAcesso"
})
public class PersistirModuloAcesso {

    protected ModuloAcesso moduloAcesso;

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

}
