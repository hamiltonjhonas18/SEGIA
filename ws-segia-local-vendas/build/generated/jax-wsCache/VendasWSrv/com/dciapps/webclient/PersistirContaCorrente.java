
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_contaCorrente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_contaCorrente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contaCorrente" type="{http://webservice.centralserver.co.mz/}contaCorrente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_contaCorrente", propOrder = {
    "contaCorrente"
})
public class PersistirContaCorrente {

    protected ContaCorrente contaCorrente;

    /**
     * Gets the value of the contaCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link ContaCorrente }
     *     
     */
    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    /**
     * Sets the value of the contaCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaCorrente }
     *     
     */
    public void setContaCorrente(ContaCorrente value) {
        this.contaCorrente = value;
    }

}
