
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_tipoContacto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_tipoContacto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoContacto" type="{http://webservice.centralserver.co.mz/}tipoContacto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_tipoContacto", propOrder = {
    "tipoContacto"
})
public class PersistirTipoContacto {

    protected TipoContacto tipoContacto;

    /**
     * Gets the value of the tipoContacto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    /**
     * Sets the value of the tipoContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setTipoContacto(TipoContacto value) {
        this.tipoContacto = value;
    }

}
