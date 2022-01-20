
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_cidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_cidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cidade" type="{http://webservice.centralserver.co.mz/}cidade" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_cidade", propOrder = {
    "cidade"
})
public class PersistirCidade {

    protected Cidade cidade;

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link Cidade }
     *     
     */
    public Cidade getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidade }
     *     
     */
    public void setCidade(Cidade value) {
        this.cidade = value;
    }

}
