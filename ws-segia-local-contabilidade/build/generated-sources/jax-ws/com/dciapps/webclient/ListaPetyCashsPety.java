
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaPetyCashsPety complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaPetyCashsPety">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pety" type="{http://webservice.centralserver.co.mz/}pety" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaPetyCashsPety", propOrder = {
    "entidade",
    "pety"
})
public class ListaPetyCashsPety {

    protected Entidade entidade;
    protected Pety pety;

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
     * Gets the value of the pety property.
     * 
     * @return
     *     possible object is
     *     {@link Pety }
     *     
     */
    public Pety getPety() {
        return pety;
    }

    /**
     * Sets the value of the pety property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pety }
     *     
     */
    public void setPety(Pety value) {
        this.pety = value;
    }

}
