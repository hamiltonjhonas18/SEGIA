
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_nivelAcesso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_nivelAcesso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nivelAcesso" type="{http://webservice.centralserver.co.mz/}nivelAcesso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_nivelAcesso", propOrder = {
    "nivelAcesso"
})
public class PersistirNivelAcesso {

    protected NivelAcesso nivelAcesso;

    /**
     * Gets the value of the nivelAcesso property.
     * 
     * @return
     *     possible object is
     *     {@link NivelAcesso }
     *     
     */
    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    /**
     * Sets the value of the nivelAcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelAcesso }
     *     
     */
    public void setNivelAcesso(NivelAcesso value) {
        this.nivelAcesso = value;
    }

}
