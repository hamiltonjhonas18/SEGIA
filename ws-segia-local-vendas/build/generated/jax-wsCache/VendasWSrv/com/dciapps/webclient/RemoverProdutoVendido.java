
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_produtoVendido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_produtoVendido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produtoVendido" type="{http://webservice.centralserver.co.mz/}produtoVendido" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remover_produtoVendido", propOrder = {
    "produtoVendido"
})
public class RemoverProdutoVendido {

    protected ProdutoVendido produtoVendido;

    /**
     * Gets the value of the produtoVendido property.
     * 
     * @return
     *     possible object is
     *     {@link ProdutoVendido }
     *     
     */
    public ProdutoVendido getProdutoVendido() {
        return produtoVendido;
    }

    /**
     * Sets the value of the produtoVendido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdutoVendido }
     *     
     */
    public void setProdutoVendido(ProdutoVendido value) {
        this.produtoVendido = value;
    }

}
