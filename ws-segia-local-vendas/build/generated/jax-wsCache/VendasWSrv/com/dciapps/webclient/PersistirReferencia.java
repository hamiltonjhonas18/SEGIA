
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_referencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_referencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencia" type="{http://webservice.centralserver.co.mz/}referencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_referencia", propOrder = {
    "referencia"
})
public class PersistirReferencia {

    protected Referencia referencia;

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link Referencia }
     *     
     */
    public Referencia getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referencia }
     *     
     */
    public void setReferencia(Referencia value) {
        this.referencia = value;
    }

}
