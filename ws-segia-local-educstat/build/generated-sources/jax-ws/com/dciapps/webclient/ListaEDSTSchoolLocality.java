
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaEDST_School_Locality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaEDST_School_Locality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaEDST_School_Locality", propOrder = {
    "localityId",
    "limit"
})
public class ListaEDSTSchoolLocality {

    @XmlElement(name = "LocalityId")
    protected int localityId;
    protected int limit;

    /**
     * Gets the value of the localityId property.
     * 
     */
    public int getLocalityId() {
        return localityId;
    }

    /**
     * Sets the value of the localityId property.
     * 
     */
    public void setLocalityId(int value) {
        this.localityId = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
