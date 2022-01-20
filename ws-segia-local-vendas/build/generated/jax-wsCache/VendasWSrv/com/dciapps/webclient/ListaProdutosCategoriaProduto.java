
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaProdutosCategoriaProduto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaProdutosCategoriaProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="categoriaProduto" type="{http://webservice.centralserver.co.mz/}categoriaProduto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaProdutosCategoriaProduto", propOrder = {
    "entidade",
    "categoriaProduto"
})
public class ListaProdutosCategoriaProduto {

    protected Entidade entidade;
    protected CategoriaProduto categoriaProduto;

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
     * Gets the value of the categoriaProduto property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaProduto }
     *     
     */
    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    /**
     * Sets the value of the categoriaProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaProduto }
     *     
     */
    public void setCategoriaProduto(CategoriaProduto value) {
        this.categoriaProduto = value;
    }

}
