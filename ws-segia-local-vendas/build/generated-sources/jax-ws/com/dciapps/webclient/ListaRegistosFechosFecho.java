
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaRegistosFechosFecho complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaRegistosFechosFecho">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="fecho" type="{http://webservice.centralserver.co.mz/}fecho" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaRegistosFechosFecho", propOrder = {
    "entidade",
    "fecho"
})
public class ListaRegistosFechosFecho {

    protected Entidade entidade;
    protected Fecho fecho;

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
     * Gets the value of the fecho property.
     * 
     * @return
     *     possible object is
     *     {@link Fecho }
     *     
     */
    public Fecho getFecho() {
        return fecho;
    }

    /**
     * Sets the value of the fecho property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fecho }
     *     
     */
    public void setFecho(Fecho value) {
        this.fecho = value;
    }

}
