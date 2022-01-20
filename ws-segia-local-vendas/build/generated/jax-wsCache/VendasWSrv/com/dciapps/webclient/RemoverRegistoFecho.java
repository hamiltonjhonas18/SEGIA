
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_registoFecho complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_registoFecho">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registoFecho" type="{http://webservice.centralserver.co.mz/}registoFecho" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_registoFecho", propOrder = {
    "registoFecho"
})
public class RemoverRegistoFecho {

    protected RegistoFecho registoFecho;

    /**
     * Gets the value of the registoFecho property.
     * 
     * @return
     *     possible object is
     *     {@link RegistoFecho }
     *     
     */
    public RegistoFecho getRegistoFecho() {
        return registoFecho;
    }

    /**
     * Sets the value of the registoFecho property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistoFecho }
     *     
     */
    public void setRegistoFecho(RegistoFecho value) {
        this.registoFecho = value;
    }

}
