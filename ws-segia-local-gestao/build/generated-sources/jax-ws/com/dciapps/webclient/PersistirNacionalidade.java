
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_nacionalidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_nacionalidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nacionalidade" type="{http://webservice.centralserver.co.mz/}nacionalidade" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_nacionalidade", propOrder = {
    "nacionalidade"
})
public class PersistirNacionalidade {

    protected Nacionalidade nacionalidade;

    /**
     * Gets the value of the nacionalidade property.
     * 
     * @return
     *     possible object is
     *     {@link Nacionalidade }
     *     
     */
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Sets the value of the nacionalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nacionalidade }
     *     
     */
    public void setNacionalidade(Nacionalidade value) {
        this.nacionalidade = value;
    }

}
