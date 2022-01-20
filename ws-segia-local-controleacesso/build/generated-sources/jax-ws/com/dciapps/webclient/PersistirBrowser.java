
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_browser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_browser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="browser" type="{http://webservice.centralserver.co.mz/}browser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_browser", propOrder = {
    "browser"
})
public class PersistirBrowser {

    protected Browser browser;

    /**
     * Gets the value of the browser property.
     * 
     * @return
     *     possible object is
     *     {@link Browser }
     *     
     */
    public Browser getBrowser() {
        return browser;
    }

    /**
     * Sets the value of the browser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Browser }
     *     
     */
    public void setBrowser(Browser value) {
        this.browser = value;
    }

}
