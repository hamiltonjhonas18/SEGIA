
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_reciboPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_reciboPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reciboPagamento" type="{http://webservice.centralserver.co.mz/}reciboPagamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_reciboPagamento", propOrder = {
    "reciboPagamento"
})
public class PersistirReciboPagamento {

    protected ReciboPagamento reciboPagamento;

    /**
     * Gets the value of the reciboPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ReciboPagamento }
     *     
     */
    public ReciboPagamento getReciboPagamento() {
        return reciboPagamento;
    }

    /**
     * Sets the value of the reciboPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReciboPagamento }
     *     
     */
    public void setReciboPagamento(ReciboPagamento value) {
        this.reciboPagamento = value;
    }

}
