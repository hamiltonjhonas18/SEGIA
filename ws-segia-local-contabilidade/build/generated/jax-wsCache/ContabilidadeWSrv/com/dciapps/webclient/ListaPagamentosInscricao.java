
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaPagamentosInscricao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaPagamentosInscricao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://webservice.centralserver.co.mz/}inscricao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaPagamentosInscricao", propOrder = {
    "entidade",
    "pessoa"
})
public class ListaPagamentosInscricao {

    protected Entidade entidade;
    protected Inscricao pessoa;

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
     * Gets the value of the pessoa property.
     * 
     * @return
     *     possible object is
     *     {@link Inscricao }
     *     
     */
    public Inscricao getPessoa() {
        return pessoa;
    }

    /**
     * Sets the value of the pessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inscricao }
     *     
     */
    public void setPessoa(Inscricao value) {
        this.pessoa = value;
    }

}
