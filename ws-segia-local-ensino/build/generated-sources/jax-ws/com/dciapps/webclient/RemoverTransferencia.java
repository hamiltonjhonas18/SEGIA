
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_transferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_transferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferencia" type="{http://webservice.centralserver.co.mz/}transferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_transferencia", propOrder = {
    "transferencia"
})
public class RemoverTransferencia {

    protected Transferencia transferencia;

    /**
     * Gets the value of the transferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Transferencia }
     *     
     */
    public Transferencia getTransferencia() {
        return transferencia;
    }

    /**
     * Sets the value of the transferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transferencia }
     *     
     */
    public void setTransferencia(Transferencia value) {
        this.transferencia = value;
    }

}
