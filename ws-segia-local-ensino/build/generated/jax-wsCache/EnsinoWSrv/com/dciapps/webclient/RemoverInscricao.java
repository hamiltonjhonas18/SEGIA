
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_inscricao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_inscricao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscricao" type="{http://webservice.centralserver.co.mz/}inscricao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_inscricao", propOrder = {
    "inscricao"
})
public class RemoverInscricao {

    protected Inscricao inscricao;

    /**
     * Gets the value of the inscricao property.
     * 
     * @return
     *     possible object is
     *     {@link Inscricao }
     *     
     */
    public Inscricao getInscricao() {
        return inscricao;
    }

    /**
     * Sets the value of the inscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inscricao }
     *     
     */
    public void setInscricao(Inscricao value) {
        this.inscricao = value;
    }

}
