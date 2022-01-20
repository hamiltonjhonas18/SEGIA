
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaContasTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaContasTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="tipoConta" type="{http://webservice.centralserver.co.mz/}tipoConta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaContasTipo", propOrder = {
    "entidade",
    "tipoConta"
})
public class ListaContasTipo {

    protected Entidade entidade;
    protected TipoConta tipoConta;

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
     * Gets the value of the tipoConta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConta }
     *     
     */
    public TipoConta getTipoConta() {
        return tipoConta;
    }

    /**
     * Sets the value of the tipoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConta }
     *     
     */
    public void setTipoConta(TipoConta value) {
        this.tipoConta = value;
    }

}
