
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_isencao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_isencao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isencao" type="{http://webservice.centralserver.co.mz/}isencao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_isencao", propOrder = {
    "isencao"
})
public class PersistirIsencao {

    protected Isencao isencao;

    /**
     * Gets the value of the isencao property.
     * 
     * @return
     *     possible object is
     *     {@link Isencao }
     *     
     */
    public Isencao getIsencao() {
        return isencao;
    }

    /**
     * Sets the value of the isencao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Isencao }
     *     
     */
    public void setIsencao(Isencao value) {
        this.isencao = value;
    }

}