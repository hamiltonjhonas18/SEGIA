
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_tipoConta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_tipoConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "persistir_tipoConta", propOrder = {
    "tipoConta"
})
public class PersistirTipoConta {

    protected TipoConta tipoConta;

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
