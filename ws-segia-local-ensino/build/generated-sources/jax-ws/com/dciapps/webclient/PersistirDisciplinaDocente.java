
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_disciplinaDocente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_disciplinaDocente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disciplinaDocente" type="{http://webservice.centralserver.co.mz/}disciplinaDocente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_disciplinaDocente", propOrder = {
    "disciplinaDocente"
})
public class PersistirDisciplinaDocente {

    protected DisciplinaDocente disciplinaDocente;

    /**
     * Gets the value of the disciplinaDocente property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplinaDocente }
     *     
     */
    public DisciplinaDocente getDisciplinaDocente() {
        return disciplinaDocente;
    }

    /**
     * Sets the value of the disciplinaDocente property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplinaDocente }
     *     
     */
    public void setDisciplinaDocente(DisciplinaDocente value) {
        this.disciplinaDocente = value;
    }

}
