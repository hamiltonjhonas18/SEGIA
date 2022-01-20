
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_venda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_venda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="venda" type="{http://webservice.centralserver.co.mz/}venda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_venda", propOrder = {
    "venda"
})
public class PersistirVenda {

    protected Venda venda;

    /**
     * Gets the value of the venda property.
     * 
     * @return
     *     possible object is
     *     {@link Venda }
     *     
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * Sets the value of the venda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Venda }
     *     
     */
    public void setVenda(Venda value) {
        this.venda = value;
    }

}
