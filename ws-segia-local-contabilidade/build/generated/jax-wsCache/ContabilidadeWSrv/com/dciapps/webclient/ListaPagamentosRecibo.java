
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaPagamentosRecibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaPagamentosRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
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
@XmlType(name = "listaPagamentosRecibo", propOrder = {
    "entidade",
    "reciboPagamento"
})
public class ListaPagamentosRecibo {

    protected Entidade entidade;
    protected ReciboPagamento reciboPagamento;

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidade(Entidade value) {
        this.entidade = value;
    }

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
