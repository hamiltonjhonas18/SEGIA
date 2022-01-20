
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_caixa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_caixa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caixa" type="{http://webservice.centralserver.co.mz/}caixa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_caixa", propOrder = {
    "caixa"
})
public class PersistirCaixa {

    protected Caixa caixa;

    /**
     * Gets the value of the caixa property.
     * 
     * @return
     *     possible object is
     *     {@link Caixa }
     *     
     */
    public Caixa getCaixa() {
        return caixa;
    }

    /**
     * Sets the value of the caixa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caixa }
     *     
     */
    public void setCaixa(Caixa value) {
        this.caixa = value;
    }

}
