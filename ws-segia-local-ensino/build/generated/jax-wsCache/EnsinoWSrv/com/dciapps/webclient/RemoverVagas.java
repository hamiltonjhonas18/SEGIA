
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_vagas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_vagas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vagas" type="{http://webservice.centralserver.co.mz/}vagas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_vagas", propOrder = {
    "vagas"
})
public class RemoverVagas {

    protected Vagas vagas;

    /**
     * Gets the value of the vagas property.
     * 
     * @return
     *     possible object is
     *     {@link Vagas }
     *     
     */
    public Vagas getVagas() {
        return vagas;
    }

    /**
     * Sets the value of the vagas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vagas }
     *     
     */
    public void setVagas(Vagas value) {
        this.vagas = value;
    }

}
