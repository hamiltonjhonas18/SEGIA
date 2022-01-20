
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_sala complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_sala">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sala" type="{http://webservice.centralserver.co.mz/}sala" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_sala", propOrder = {
    "sala"
})
public class RemoverSala {

    protected Sala sala;

    /**
     * Gets the value of the sala property.
     * 
     * @return
     *     possible object is
     *     {@link Sala }
     *     
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * Sets the value of the sala property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sala }
     *     
     */
    public void setSala(Sala value) {
        this.sala = value;
    }

}
