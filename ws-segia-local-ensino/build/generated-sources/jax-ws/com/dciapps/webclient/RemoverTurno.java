
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_turno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_turno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="turno" type="{http://webservice.centralserver.co.mz/}turno" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_turno", propOrder = {
    "turno"
})
public class RemoverTurno {

    protected Turno turno;

    /**
     * Gets the value of the turno property.
     * 
     * @return
     *     possible object is
     *     {@link Turno }
     *     
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * Sets the value of the turno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Turno }
     *     
     */
    public void setTurno(Turno value) {
        this.turno = value;
    }

}
