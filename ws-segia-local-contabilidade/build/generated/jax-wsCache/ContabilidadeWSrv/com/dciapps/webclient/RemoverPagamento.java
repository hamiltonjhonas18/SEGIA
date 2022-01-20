
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_pagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_pagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagamento" type="{http://webservice.centralserver.co.mz/}pagamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_pagamento", propOrder = {
    "pagamento"
})
public class RemoverPagamento {

    protected Pagamento pagamento;

    /**
     * Gets the value of the pagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Pagamento }
     *     
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

    /**
     * Sets the value of the pagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagamento }
     *     
     */
    public void setPagamento(Pagamento value) {
        this.pagamento = value;
    }

}
