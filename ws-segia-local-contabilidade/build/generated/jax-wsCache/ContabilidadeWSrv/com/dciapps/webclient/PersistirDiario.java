
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_diario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_diario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diario" type="{http://webservice.centralserver.co.mz/}diario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_diario", propOrder = {
    "diario"
})
public class PersistirDiario {

    protected Diario diario;

    /**
     * Gets the value of the diario property.
     * 
     * @return
     *     possible object is
     *     {@link Diario }
     *     
     */
    public Diario getDiario() {
        return diario;
    }

    /**
     * Sets the value of the diario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diario }
     *     
     */
    public void setDiario(Diario value) {
        this.diario = value;
    }

}
