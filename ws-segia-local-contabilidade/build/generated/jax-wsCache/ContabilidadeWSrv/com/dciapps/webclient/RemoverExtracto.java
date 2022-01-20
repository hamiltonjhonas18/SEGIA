
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_extracto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_extracto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extracto" type="{http://webservice.centralserver.co.mz/}extracto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_extracto", propOrder = {
    "extracto"
})
public class RemoverExtracto {

    protected Extracto extracto;

    /**
     * Gets the value of the extracto property.
     * 
     * @return
     *     possible object is
     *     {@link Extracto }
     *     
     */
    public Extracto getExtracto() {
        return extracto;
    }

    /**
     * Sets the value of the extracto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extracto }
     *     
     */
    public void setExtracto(Extracto value) {
        this.extracto = value;
    }

}
