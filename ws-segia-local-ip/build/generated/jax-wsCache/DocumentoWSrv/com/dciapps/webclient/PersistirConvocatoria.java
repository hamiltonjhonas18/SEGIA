
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_convocatoria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_convocatoria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convocatoria" type="{http://webservice.centralserver.co.mz/}convocatoria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_convocatoria", propOrder = {
    "convocatoria"
})
public class PersistirConvocatoria {

    protected Convocatoria convocatoria;

    /**
     * Gets the value of the convocatoria property.
     * 
     * @return
     *     possible object is
     *     {@link Convocatoria }
     *     
     */
    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    /**
     * Sets the value of the convocatoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convocatoria }
     *     
     */
    public void setConvocatoria(Convocatoria value) {
        this.convocatoria = value;
    }

}
