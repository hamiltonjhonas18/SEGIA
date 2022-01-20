
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_avaliacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_avaliacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avaliacao" type="{http://webservice.centralserver.co.mz/}avaliacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_avaliacao", propOrder = {
    "avaliacao"
})
public class PersistirAvaliacao {

    protected Avaliacao avaliacao;

    /**
     * Gets the value of the avaliacao property.
     * 
     * @return
     *     possible object is
     *     {@link Avaliacao }
     *     
     */
    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    /**
     * Sets the value of the avaliacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Avaliacao }
     *     
     */
    public void setAvaliacao(Avaliacao value) {
        this.avaliacao = value;
    }

}
