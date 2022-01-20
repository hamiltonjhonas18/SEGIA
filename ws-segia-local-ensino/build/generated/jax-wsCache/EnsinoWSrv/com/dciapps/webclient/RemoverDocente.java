
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_docente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_docente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docente" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_docente", propOrder = {
    "docente"
})
public class RemoverDocente {

    protected Docente docente;

    /**
     * Gets the value of the docente property.
     * 
     * @return
     *     possible object is
     *     {@link Docente }
     *     
     */
    public Docente getDocente() {
        return docente;
    }

    /**
     * Sets the value of the docente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docente }
     *     
     */
    public void setDocente(Docente value) {
        this.docente = value;
    }

}