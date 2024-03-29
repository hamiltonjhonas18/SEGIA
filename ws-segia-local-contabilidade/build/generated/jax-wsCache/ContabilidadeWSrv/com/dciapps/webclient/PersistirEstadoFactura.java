
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_estadoFactura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_estadoFactura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoFactura" type="{http://webservice.centralserver.co.mz/}estadoFactura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_estadoFactura", propOrder = {
    "estadoFactura"
})
public class PersistirEstadoFactura {

    protected EstadoFactura estadoFactura;

    /**
     * Gets the value of the estadoFactura property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoFactura }
     *     
     */
    public EstadoFactura getEstadoFactura() {
        return estadoFactura;
    }

    /**
     * Sets the value of the estadoFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoFactura }
     *     
     */
    public void setEstadoFactura(EstadoFactura value) {
        this.estadoFactura = value;
    }

}
