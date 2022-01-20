
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for edstZip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edstZip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="headQuarterSchoolId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edstZip", propOrder = {
    "districtId",
    "headQuarterSchoolId",
    "id",
    "name"
})
public class EdstZip {

    protected int districtId;
    protected int headQuarterSchoolId;
    protected int id;
    protected String name;

    /**
     * Gets the value of the districtId property.
     * 
     */
    public int getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     */
    public void setDistrictId(int value) {
        this.districtId = value;
    }

    /**
     * Gets the value of the headQuarterSchoolId property.
     * 
     */
    public int getHeadQuarterSchoolId() {
        return headQuarterSchoolId;
    }

    /**
     * Sets the value of the headQuarterSchoolId property.
     * 
     */
    public void setHeadQuarterSchoolId(int value) {
        this.headQuarterSchoolId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
