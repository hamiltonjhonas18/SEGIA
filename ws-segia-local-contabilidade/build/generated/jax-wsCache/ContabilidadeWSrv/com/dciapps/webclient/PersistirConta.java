
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_conta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_conta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conta" type="{http://webservice.centralserver.co.mz/}conta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_conta", propOrder = {
    "conta"
})
public class PersistirConta {

    protected Conta conta;

    /**
     * Gets the value of the conta property.
     * 
     * @return
     *     possible object is
     *     {@link Conta }
     *     
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * Sets the value of the conta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conta }
     *     
     */
    public void setConta(Conta value) {
        this.conta = value;
    }

}
