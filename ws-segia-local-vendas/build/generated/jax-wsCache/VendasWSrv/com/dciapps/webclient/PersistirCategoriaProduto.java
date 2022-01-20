
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_categoriaProduto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_categoriaProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "persistir_categoriaProduto", propOrder = {
    "categoriaProduto"
})
public class PersistirCategoriaProduto {

    protected CategoriaProduto categoriaProduto;

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
