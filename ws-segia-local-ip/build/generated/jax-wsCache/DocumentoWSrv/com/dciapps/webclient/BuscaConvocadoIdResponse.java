
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscaConvocadoIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscaConvocadoIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.centralserver.co.mz/}convocado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaConvocadoIdResponse", propOrder = {
    "_return"
})
public class BuscaConvocadoIdResponse {

    @XmlElement(name = "return")
    protected Convocado _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Convocado }
     *     
     */
    public Convocado getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convocado }
     *     
     */
    public void setReturn(Convocado value) {
        this._return = value;
    }

}
