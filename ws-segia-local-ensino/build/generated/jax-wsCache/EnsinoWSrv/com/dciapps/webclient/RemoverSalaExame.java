
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_salaExame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_salaExame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salaExame" type="{http://webservice.centralserver.co.mz/}salaExame" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_salaExame", propOrder = {
    "salaExame"
})
public class RemoverSalaExame {

    protected SalaExame salaExame;

    /**
     * Gets the value of the salaExame property.
     * 
     * @return
     *     possible object is
     *     {@link SalaExame }
     *     
     */
    public SalaExame getSalaExame() {
        return salaExame;
    }

    /**
     * Sets the value of the salaExame property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaExame }
     *     
     */
    public void setSalaExame(SalaExame value) {
        this.salaExame = value;
    }

}
