
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_docenteTurma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_docenteTurma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docenteTurma" type="{http://webservice.centralserver.co.mz/}docenteTurma" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_docenteTurma", propOrder = {
    "docenteTurma"
})
public class PersistirDocenteTurma {

    protected DocenteTurma docenteTurma;

    /**
     * Gets the value of the docenteTurma property.
     * 
     * @return
     *     possible object is
     *     {@link DocenteTurma }
     *     
     */
    public DocenteTurma getDocenteTurma() {
        return docenteTurma;
    }

    /**
     * Sets the value of the docenteTurma property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocenteTurma }
     *     
     */
    public void setDocenteTurma(DocenteTurma value) {
        this.docenteTurma = value;
    }

}
