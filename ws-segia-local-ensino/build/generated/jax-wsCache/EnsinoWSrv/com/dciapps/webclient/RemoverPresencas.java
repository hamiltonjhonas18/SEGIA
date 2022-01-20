
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_presencas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_presencas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="presencas" type="{http://webservice.centralserver.co.mz/}presencas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_presencas", propOrder = {
    "presencas"
})
public class RemoverPresencas {

    protected Presencas presencas;

    /**
     * Gets the value of the presencas property.
     * 
     * @return
     *     possible object is
     *     {@link Presencas }
     *     
     */
    public Presencas getPresencas() {
        return presencas;
    }

    /**
     * Sets the value of the presencas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presencas }
     *     
     */
    public void setPresencas(Presencas value) {
        this.presencas = value;
    }

}
