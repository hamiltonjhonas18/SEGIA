
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_escola complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_escola">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_escola", propOrder = {
    "escola"
})
public class PersistirEscola {

    protected Escola escola;

    /**
     * Gets the value of the escola property.
     * 
     * @return
     *     possible object is
     *     {@link Escola }
     *     
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * Sets the value of the escola property.
     * 
     * @param value
     *     allowed object is
     *     {@link Escola }
     *     
     */
    public void setEscola(Escola value) {
        this.escola = value;
    }

}
