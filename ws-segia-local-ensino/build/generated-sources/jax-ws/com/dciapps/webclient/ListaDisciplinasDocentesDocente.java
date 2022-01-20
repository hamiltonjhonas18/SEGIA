
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaDisciplinasDocentesDocente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaDisciplinasDocentesDocente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
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
@XmlType(name = "listaDisciplinasDocentesDocente", propOrder = {
    "entidade",
    "docente"
})
public class ListaDisciplinasDocentesDocente {

    protected Entidade entidade;
    protected Docente docente;

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidade(Entidade value) {
        this.entidade = value;
    }

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
