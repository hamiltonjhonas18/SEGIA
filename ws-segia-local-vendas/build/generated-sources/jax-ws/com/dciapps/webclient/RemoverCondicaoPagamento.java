
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_condicaoPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_condicaoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condicaoPagamento" type="{http://webservice.centralserver.co.mz/}condicaoPagamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_condicaoPagamento", propOrder = {
    "condicaoPagamento"
})
public class RemoverCondicaoPagamento {

    protected CondicaoPagamento condicaoPagamento;

    /**
     * Gets the value of the condicaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link CondicaoPagamento }
     *     
     */
    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    /**
     * Sets the value of the condicaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondicaoPagamento }
     *     
     */
    public void setCondicaoPagamento(CondicaoPagamento value) {
        this.condicaoPagamento = value;
    }

}
