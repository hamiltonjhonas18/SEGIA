
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_lancamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_lancamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lancamento" type="{http://webservice.centralserver.co.mz/}lancamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_lancamento", propOrder = {
    "lancamento"
})
public class PersistirLancamento {

    protected Lancamento lancamento;

    /**
     * Gets the value of the lancamento property.
     * 
     * @return
     *     possible object is
     *     {@link Lancamento }
     *     
     */
    public Lancamento getLancamento() {
        return lancamento;
    }

    /**
     * Sets the value of the lancamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lancamento }
     *     
     */
    public void setLancamento(Lancamento value) {
        this.lancamento = value;
    }

}
