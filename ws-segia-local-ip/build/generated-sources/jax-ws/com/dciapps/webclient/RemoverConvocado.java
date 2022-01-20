
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_convocado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_convocado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convocado" type="{http://webservice.centralserver.co.mz/}convocado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_convocado", propOrder = {
    "convocado"
})
public class RemoverConvocado {

    protected Convocado convocado;

    /**
     * Gets the value of the convocado property.
     * 
     * @return
     *     possible object is
     *     {@link Convocado }
     *     
     */
    public Convocado getConvocado() {
        return convocado;
    }

    /**
     * Sets the value of the convocado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convocado }
     *     
     */
    public void setConvocado(Convocado value) {
        this.convocado = value;
    }

}
