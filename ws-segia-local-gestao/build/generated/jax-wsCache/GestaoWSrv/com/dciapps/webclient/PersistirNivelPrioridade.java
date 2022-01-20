
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_nivelPrioridade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_nivelPrioridade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nivelPrioridade" type="{http://webservice.centralserver.co.mz/}nivelPrioridade" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_nivelPrioridade", propOrder = {
    "nivelPrioridade"
})
public class PersistirNivelPrioridade {

    protected NivelPrioridade nivelPrioridade;

    /**
     * Gets the value of the nivelPrioridade property.
     * 
     * @return
     *     possible object is
     *     {@link NivelPrioridade }
     *     
     */
    public NivelPrioridade getNivelPrioridade() {
        return nivelPrioridade;
    }

    /**
     * Sets the value of the nivelPrioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelPrioridade }
     *     
     */
    public void setNivelPrioridade(NivelPrioridade value) {
        this.nivelPrioridade = value;
    }

}
