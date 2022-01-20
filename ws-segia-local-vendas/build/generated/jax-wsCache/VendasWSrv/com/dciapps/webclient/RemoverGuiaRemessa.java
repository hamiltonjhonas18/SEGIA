
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_guiaRemessa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_guiaRemessa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guiaRemessa" type="{http://webservice.centralserver.co.mz/}guiaRemessa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_guiaRemessa", propOrder = {
    "guiaRemessa"
})
public class RemoverGuiaRemessa {

    protected GuiaRemessa guiaRemessa;

    /**
     * Gets the value of the guiaRemessa property.
     * 
     * @return
     *     possible object is
     *     {@link GuiaRemessa }
     *     
     */
    public GuiaRemessa getGuiaRemessa() {
        return guiaRemessa;
    }

    /**
     * Sets the value of the guiaRemessa property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiaRemessa }
     *     
     */
    public void setGuiaRemessa(GuiaRemessa value) {
        this.guiaRemessa = value;
    }

}
