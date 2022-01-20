
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_cor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_cor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cor" type="{http://webservice.centralserver.co.mz/}cor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_cor", propOrder = {
    "cor"
})
public class PersistirCor {

    protected Cor cor;

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link Cor }
     *     
     */
    public Cor getCor() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cor }
     *     
     */
    public void setCor(Cor value) {
        this.cor = value;
    }

}
