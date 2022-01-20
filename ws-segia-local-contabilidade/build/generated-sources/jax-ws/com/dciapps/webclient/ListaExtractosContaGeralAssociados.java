
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaExtractosContaGeralAssociados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaExtractosContaGeralAssociados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="contaGeral" type="{http://webservice.centralserver.co.mz/}contaGeral" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaExtractosContaGeralAssociados", propOrder = {
    "entidade",
    "contaGeral"
})
public class ListaExtractosContaGeralAssociados {

    protected Entidade entidade;
    protected ContaGeral contaGeral;

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
     * Gets the value of the contaGeral property.
     * 
     * @return
     *     possible object is
     *     {@link ContaGeral }
     *     
     */
    public ContaGeral getContaGeral() {
        return contaGeral;
    }

    /**
     * Sets the value of the contaGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaGeral }
     *     
     */
    public void setContaGeral(ContaGeral value) {
        this.contaGeral = value;
    }

}
