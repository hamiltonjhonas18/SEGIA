
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_areaFormacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_areaFormacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaFormacao" type="{http://webservice.centralserver.co.mz/}areaFormacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_areaFormacao", propOrder = {
    "areaFormacao"
})
public class PersistirAreaFormacao {

    protected AreaFormacao areaFormacao;

    /**
     * Gets the value of the areaFormacao property.
     * 
     * @return
     *     possible object is
     *     {@link AreaFormacao }
     *     
     */
    public AreaFormacao getAreaFormacao() {
        return areaFormacao;
    }

    /**
     * Sets the value of the areaFormacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaFormacao }
     *     
     */
    public void setAreaFormacao(AreaFormacao value) {
        this.areaFormacao = value;
    }

}
