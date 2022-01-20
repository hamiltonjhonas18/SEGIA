
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaClientesLimite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaClientesLimite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaClientesLimite", propOrder = {
    "funcao",
    "limite"
})
public class ListaClientesLimite {

    protected String funcao;
    protected int limite;

    /**
     * Gets the value of the funcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Sets the value of the funcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncao(String value) {
        this.funcao = value;
    }

    /**
     * Gets the value of the limite property.
     * 
     */
    public int getLimite() {
        return limite;
    }

    /**
     * Sets the value of the limite property.
     * 
     */
    public void setLimite(int value) {
        this.limite = value;
    }

}
