
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_recibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_recibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recibo" type="{http://webservice.centralserver.co.mz/}recibo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_recibo", propOrder = {
    "recibo"
})
public class PersistirRecibo {

    protected Recibo recibo;

    /**
     * Gets the value of the recibo property.
     * 
     * @return
     *     possible object is
     *     {@link Recibo }
     *     
     */
    public Recibo getRecibo() {
        return recibo;
    }

    /**
     * Sets the value of the recibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recibo }
     *     
     */
    public void setRecibo(Recibo value) {
        this.recibo = value;
    }

}
