
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscaAlunoBagdnumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscaAlunoBagdnumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="badgnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaAlunoBagdnumber", propOrder = {
    "badgnumber"
})
public class BuscaAlunoBagdnumber {

    protected String badgnumber;

    /**
     * Gets the value of the badgnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadgnumber() {
        return badgnumber;
    }

    /**
     * Sets the value of the badgnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadgnumber(String value) {
        this.badgnumber = value;
    }

}
