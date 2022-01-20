
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_petyCash complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_petyCash">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="petyCash" type="{http://webservice.centralserver.co.mz/}petyCash" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_petyCash", propOrder = {
    "petyCash"
})
public class RemoverPetyCash {

    protected PetyCash petyCash;

    /**
     * Gets the value of the petyCash property.
     * 
     * @return
     *     possible object is
     *     {@link PetyCash }
     *     
     */
    public PetyCash getPetyCash() {
        return petyCash;
    }

    /**
     * Sets the value of the petyCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetyCash }
     *     
     */
    public void setPetyCash(PetyCash value) {
        this.petyCash = value;
    }

}
