
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_agendaContacto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_agendaContacto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agendaContacto" type="{http://webservice.centralserver.co.mz/}agendaContacto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_agendaContacto", propOrder = {
    "agendaContacto"
})
public class PersistirAgendaContacto {

    protected AgendaContacto agendaContacto;

    /**
     * Gets the value of the agendaContacto property.
     * 
     * @return
     *     possible object is
     *     {@link AgendaContacto }
     *     
     */
    public AgendaContacto getAgendaContacto() {
        return agendaContacto;
    }

    /**
     * Sets the value of the agendaContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgendaContacto }
     *     
     */
    public void setAgendaContacto(AgendaContacto value) {
        this.agendaContacto = value;
    }

}
