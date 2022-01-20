
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_aproveitamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_aproveitamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aproveitamento" type="{http://webservice.centralserver.co.mz/}aproveitamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_aproveitamento", propOrder = {
    "aproveitamento"
})
public class PersistirAproveitamento {

    protected Aproveitamento aproveitamento;

    /**
     * Gets the value of the aproveitamento property.
     * 
     * @return
     *     possible object is
     *     {@link Aproveitamento }
     *     
     */
    public Aproveitamento getAproveitamento() {
        return aproveitamento;
    }

    /**
     * Sets the value of the aproveitamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aproveitamento }
     *     
     */
    public void setAproveitamento(Aproveitamento value) {
        this.aproveitamento = value;
    }

}
