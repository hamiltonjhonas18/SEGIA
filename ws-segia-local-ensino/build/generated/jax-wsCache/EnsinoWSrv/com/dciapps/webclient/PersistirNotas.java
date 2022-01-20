
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_notas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_notas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notas" type="{http://webservice.centralserver.co.mz/}notas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_notas", propOrder = {
    "notas"
})
public class PersistirNotas {

    protected Notas notas;

    /**
     * Gets the value of the notas property.
     * 
     * @return
     *     possible object is
     *     {@link Notas }
     *     
     */
    public Notas getNotas() {
        return notas;
    }

    /**
     * Sets the value of the notas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notas }
     *     
     */
    public void setNotas(Notas value) {
        this.notas = value;
    }

}
