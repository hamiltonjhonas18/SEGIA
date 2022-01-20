
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_listaTelefonica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_listaTelefonica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaTelefonica" type="{http://webservice.centralserver.co.mz/}listaTelefonica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_listaTelefonica", propOrder = {
    "listaTelefonica"
})
public class PersistirListaTelefonica {

    protected ListaTelefonica listaTelefonica;

    /**
     * Gets the value of the listaTelefonica property.
     * 
     * @return
     *     possible object is
     *     {@link ListaTelefonica }
     *     
     */
    public ListaTelefonica getListaTelefonica() {
        return listaTelefonica;
    }

    /**
     * Sets the value of the listaTelefonica property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaTelefonica }
     *     
     */
    public void setListaTelefonica(ListaTelefonica value) {
        this.listaTelefonica = value;
    }

}
