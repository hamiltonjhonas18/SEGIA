
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_mensalidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_mensalidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensalidade" type="{http://webservice.centralserver.co.mz/}mensalidade" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_mensalidade", propOrder = {
    "mensalidade"
})
public class RemoverMensalidade {

    protected Mensalidade mensalidade;

    /**
     * Gets the value of the mensalidade property.
     * 
     * @return
     *     possible object is
     *     {@link Mensalidade }
     *     
     */
    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    /**
     * Sets the value of the mensalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mensalidade }
     *     
     */
    public void setMensalidade(Mensalidade value) {
        this.mensalidade = value;
    }

}
