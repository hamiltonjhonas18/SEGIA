
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_meioPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_meioPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meioPagamento" type="{http://webservice.centralserver.co.mz/}meioPagamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_meioPagamento", propOrder = {
    "meioPagamento"
})
public class PersistirMeioPagamento {

    protected MeioPagamento meioPagamento;

    /**
     * Gets the value of the meioPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link MeioPagamento }
     *     
     */
    public MeioPagamento getMeioPagamento() {
        return meioPagamento;
    }

    /**
     * Sets the value of the meioPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeioPagamento }
     *     
     */
    public void setMeioPagamento(MeioPagamento value) {
        this.meioPagamento = value;
    }

}
