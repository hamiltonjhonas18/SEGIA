
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_fluxo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_fluxo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fluxo" type="{http://webservice.centralserver.co.mz/}fluxo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_fluxo", propOrder = {
    "fluxo"
})
public class RemoverFluxo {

    protected Fluxo fluxo;

    /**
     * Gets the value of the fluxo property.
     * 
     * @return
     *     possible object is
     *     {@link Fluxo }
     *     
     */
    public Fluxo getFluxo() {
        return fluxo;
    }

    /**
     * Sets the value of the fluxo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fluxo }
     *     
     */
    public void setFluxo(Fluxo value) {
        this.fluxo = value;
    }

}
