
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_calendario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_calendario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendario" type="{http://webservice.centralserver.co.mz/}calendario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_calendario", propOrder = {
    "calendario"
})
public class PersistirCalendario {

    protected Calendario calendario;

    /**
     * Gets the value of the calendario property.
     * 
     * @return
     *     possible object is
     *     {@link Calendario }
     *     
     */
    public Calendario getCalendario() {
        return calendario;
    }

    /**
     * Sets the value of the calendario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendario }
     *     
     */
    public void setCalendario(Calendario value) {
        this.calendario = value;
    }

}
