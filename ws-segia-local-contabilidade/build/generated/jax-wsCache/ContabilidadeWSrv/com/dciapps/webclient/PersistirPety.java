
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_pety complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_pety">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pety" type="{http://webservice.centralserver.co.mz/}pety" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_pety", propOrder = {
    "pety"
})
public class PersistirPety {

    protected Pety pety;

    /**
     * Gets the value of the pety property.
     * 
     * @return
     *     possible object is
     *     {@link Pety }
     *     
     */
    public Pety getPety() {
        return pety;
    }

    /**
     * Sets the value of the pety property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pety }
     *     
     */
    public void setPety(Pety value) {
        this.pety = value;
    }

}
