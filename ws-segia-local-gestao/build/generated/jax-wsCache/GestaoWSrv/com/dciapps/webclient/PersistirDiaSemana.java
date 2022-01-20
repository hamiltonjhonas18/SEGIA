
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_diaSemana complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_diaSemana">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diaSemana" type="{http://webservice.centralserver.co.mz/}diaSemana" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_diaSemana", propOrder = {
    "diaSemana"
})
public class PersistirDiaSemana {

    protected DiaSemana diaSemana;

    /**
     * Gets the value of the diaSemana property.
     * 
     * @return
     *     possible object is
     *     {@link DiaSemana }
     *     
     */
    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    /**
     * Sets the value of the diaSemana property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiaSemana }
     *     
     */
    public void setDiaSemana(DiaSemana value) {
        this.diaSemana = value;
    }

}
