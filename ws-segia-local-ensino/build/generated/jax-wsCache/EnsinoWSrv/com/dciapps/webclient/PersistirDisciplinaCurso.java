
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_disciplinaCurso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_disciplinaCurso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disciplinaCurso" type="{http://webservice.centralserver.co.mz/}disciplinaCurso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_disciplinaCurso", propOrder = {
    "disciplinaCurso"
})
public class PersistirDisciplinaCurso {

    protected DisciplinaCurso disciplinaCurso;

    /**
     * Gets the value of the disciplinaCurso property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplinaCurso }
     *     
     */
    public DisciplinaCurso getDisciplinaCurso() {
        return disciplinaCurso;
    }

    /**
     * Sets the value of the disciplinaCurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplinaCurso }
     *     
     */
    public void setDisciplinaCurso(DisciplinaCurso value) {
        this.disciplinaCurso = value;
    }

}
