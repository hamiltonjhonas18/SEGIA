
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for upload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="upl_file" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upl_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upload", propOrder = {
    "entidade",
    "uplFile",
    "uplId"
})
public class Upload {

    protected Entidade entidade;
    @XmlElement(name = "upl_file")
    protected String uplFile;
    @XmlElement(name = "upl_id")
    protected int uplId;

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidade(Entidade value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the uplFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplFile() {
        return uplFile;
    }

    /**
     * Sets the value of the uplFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplFile(String value) {
        this.uplFile = value;
    }

    /**
     * Gets the value of the uplId property.
     * 
     */
    public int getUplId() {
        return uplId;
    }

    /**
     * Sets the value of the uplId property.
     * 
     */
    public void setUplId(int value) {
        this.uplId = value;
    }

}
