
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_segmento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_segmento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmento" type="{http://webservice.centralserver.co.mz/}segmento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_segmento", propOrder = {
    "segmento"
})
public class RemoverSegmento {

    protected Segmento segmento;

    /**
     * Gets the value of the segmento property.
     * 
     * @return
     *     possible object is
     *     {@link Segmento }
     *     
     */
    public Segmento getSegmento() {
        return segmento;
    }

    /**
     * Sets the value of the segmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Segmento }
     *     
     */
    public void setSegmento(Segmento value) {
        this.segmento = value;
    }

}
