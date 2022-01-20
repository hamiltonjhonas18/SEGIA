
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_boletim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_boletim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boletim" type="{http://webservice.centralserver.co.mz/}boletim" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_boletim", propOrder = {
    "boletim"
})
public class PersistirBoletim {

    protected Boletim boletim;

    /**
     * Gets the value of the boletim property.
     * 
     * @return
     *     possible object is
     *     {@link Boletim }
     *     
     */
    public Boletim getBoletim() {
        return boletim;
    }

    /**
     * Sets the value of the boletim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boletim }
     *     
     */
    public void setBoletim(Boletim value) {
        this.boletim = value;
    }

}
