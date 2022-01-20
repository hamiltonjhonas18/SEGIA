
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_exame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_exame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exame" type="{http://webservice.centralserver.co.mz/}exame" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_exame", propOrder = {
    "exame"
})
public class RemoverExame {

    protected Exame exame;

    /**
     * Gets the value of the exame property.
     * 
     * @return
     *     possible object is
     *     {@link Exame }
     *     
     */
    public Exame getExame() {
        return exame;
    }

    /**
     * Sets the value of the exame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exame }
     *     
     */
    public void setExame(Exame value) {
        this.exame = value;
    }

}
