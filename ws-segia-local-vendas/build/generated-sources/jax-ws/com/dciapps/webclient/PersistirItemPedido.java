
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_itemPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_itemPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemPedido" type="{http://webservice.centralserver.co.mz/}itemPedido" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_itemPedido", propOrder = {
    "itemPedido"
})
public class PersistirItemPedido {

    protected ItemPedido itemPedido;

    /**
     * Gets the value of the itemPedido property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedido }
     *     
     */
    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    /**
     * Sets the value of the itemPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedido }
     *     
     */
    public void setItemPedido(ItemPedido value) {
        this.itemPedido = value;
    }

}
