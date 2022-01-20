
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_acta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_acta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acta" type="{http://webservice.centralserver.co.mz/}acta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_acta", propOrder = {
    "acta"
})
public class PersistirActa {

    protected Acta acta;

    /**
     * Gets the value of the acta property.
     * 
     * @return
     *     possible object is
     *     {@link Acta }
     *     
     */
    public Acta getActa() {
        return acta;
    }

    /**
     * Sets the value of the acta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acta }
     *     
     */
    public void setActa(Acta value) {
        this.acta = value;
    }

}
