
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscaConvocado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscaConvocado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convocatoria" type="{http://webservice.centralserver.co.mz/}convocatoria" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaConvocado", propOrder = {
    "convocatoria",
    "pessoa"
})
public class BuscaConvocado {

    protected Convocatoria convocatoria;
    protected Pessoa pessoa;

    /**
     * Gets the value of the convocatoria property.
     * 
     * @return
     *     possible object is
     *     {@link Convocatoria }
     *     
     */
    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    /**
     * Sets the value of the convocatoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convocatoria }
     *     
     */
    public void setConvocatoria(Convocatoria value) {
        this.convocatoria = value;
    }

    /**
     * Gets the value of the pessoa property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Sets the value of the pessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoa(Pessoa value) {
        this.pessoa = value;
    }

}
