
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_falta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_falta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="falta" type="{http://webservice.centralserver.co.mz/}faltas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_falta", propOrder = {
    "falta"
})
public class PersistirFalta {

    protected Faltas falta;

    /**
     * Gets the value of the falta property.
     * 
     * @return
     *     possible object is
     *     {@link Faltas }
     *     
     */
    public Faltas getFalta() {
        return falta;
    }

    /**
     * Sets the value of the falta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faltas }
     *     
     */
    public void setFalta(Faltas value) {
        this.falta = value;
    }

}
