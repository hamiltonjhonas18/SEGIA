
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_sumario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_sumario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sumario" type="{http://webservice.centralserver.co.mz/}sumario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_sumario", propOrder = {
    "sumario"
})
public class PersistirSumario {

    protected Sumario sumario;

    /**
     * Gets the value of the sumario property.
     * 
     * @return
     *     possible object is
     *     {@link Sumario }
     *     
     */
    public Sumario getSumario() {
        return sumario;
    }

    /**
     * Sets the value of the sumario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sumario }
     *     
     */
    public void setSumario(Sumario value) {
        this.sumario = value;
    }

}
