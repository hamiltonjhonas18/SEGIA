
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_extractoContaGeral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_extractoContaGeral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extractoContaGeral" type="{http://webservice.centralserver.co.mz/}extractoContaGeral" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_extractoContaGeral", propOrder = {
    "extractoContaGeral"
})
public class RemoverExtractoContaGeral {

    protected ExtractoContaGeral extractoContaGeral;

    /**
     * Gets the value of the extractoContaGeral property.
     * 
     * @return
     *     possible object is
     *     {@link ExtractoContaGeral }
     *     
     */
    public ExtractoContaGeral getExtractoContaGeral() {
        return extractoContaGeral;
    }

    /**
     * Sets the value of the extractoContaGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtractoContaGeral }
     *     
     */
    public void setExtractoContaGeral(ExtractoContaGeral value) {
        this.extractoContaGeral = value;
    }

}
