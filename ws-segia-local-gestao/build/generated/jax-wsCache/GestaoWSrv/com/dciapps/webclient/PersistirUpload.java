
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_upload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_upload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upload" type="{http://webservice.centralserver.co.mz/}upload" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_upload", propOrder = {
    "upload"
})
public class PersistirUpload {

    protected Upload upload;

    /**
     * Gets the value of the upload property.
     * 
     * @return
     *     possible object is
     *     {@link Upload }
     *     
     */
    public Upload getUpload() {
        return upload;
    }

    /**
     * Sets the value of the upload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Upload }
     *     
     */
    public void setUpload(Upload value) {
        this.upload = value;
    }

}
