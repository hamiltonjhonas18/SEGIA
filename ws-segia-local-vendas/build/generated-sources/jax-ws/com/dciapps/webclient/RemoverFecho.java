
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_fecho complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_fecho">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecho" type="{http://webservice.centralserver.co.mz/}fecho" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_fecho", propOrder = {
    "fecho"
})
public class RemoverFecho {

    protected Fecho fecho;

    /**
     * Gets the value of the fecho property.
     * 
     * @return
     *     possible object is
     *     {@link Fecho }
     *     
     */
    public Fecho getFecho() {
        return fecho;
    }

    /**
     * Sets the value of the fecho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fecho }
     *     
     */
    public void setFecho(Fecho value) {
        this.fecho = value;
    }

}
