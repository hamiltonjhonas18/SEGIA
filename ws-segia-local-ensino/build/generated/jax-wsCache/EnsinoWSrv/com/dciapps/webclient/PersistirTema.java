
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_tema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_tema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tema" type="{http://webservice.centralserver.co.mz/}tema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_tema", propOrder = {
    "tema"
})
public class PersistirTema {

    protected Tema tema;

    /**
     * Gets the value of the tema property.
     * 
     * @return
     *     possible object is
     *     {@link Tema }
     *     
     */
    public Tema getTema() {
        return tema;
    }

    /**
     * Sets the value of the tema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tema }
     *     
     */
    public void setTema(Tema value) {
        this.tema = value;
    }

}
