
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaAproveitamentosAno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaAproveitamentosAno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaAproveitamentosAno", propOrder = {
    "entidade",
    "ano"
})
public class ListaAproveitamentosAno {

    protected String entidade;
    protected String ano;

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidade(String value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the ano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno() {
        return ano;
    }

    /**
     * Sets the value of the ano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno(String value) {
        this.ano = value;
    }

}
