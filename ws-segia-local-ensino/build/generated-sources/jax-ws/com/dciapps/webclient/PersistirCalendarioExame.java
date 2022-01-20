
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_calendarioExame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_calendarioExame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendarioExame" type="{http://webservice.centralserver.co.mz/}calendarioExame" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_calendarioExame", propOrder = {
    "calendarioExame"
})
public class PersistirCalendarioExame {

    protected CalendarioExame calendarioExame;

    /**
     * Gets the value of the calendarioExame property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarioExame }
     *     
     */
    public CalendarioExame getCalendarioExame() {
        return calendarioExame;
    }

    /**
     * Sets the value of the calendarioExame property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarioExame }
     *     
     */
    public void setCalendarioExame(CalendarioExame value) {
        this.calendarioExame = value;
    }

}
