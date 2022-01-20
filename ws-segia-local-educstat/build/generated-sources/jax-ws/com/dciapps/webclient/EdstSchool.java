
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for edstSchool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edstSchool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administrativePostId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="areaId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coordinateX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coordinateY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="localityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yearOpened" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zipId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edstSchool", propOrder = {
    "abbreviation",
    "administrativePostId",
    "areaId",
    "coordinateX",
    "coordinateY",
    "districtId",
    "id",
    "local",
    "localityId",
    "name",
    "oldId",
    "oldName",
    "settlementId",
    "typeId",
    "yearOpened",
    "zipId"
})
public class EdstSchool {

    protected String abbreviation;
    protected Integer administrativePostId;
    protected Integer areaId;
    protected Double coordinateX;
    protected Double coordinateY;
    protected Integer districtId;
    protected int id;
    protected int local;
    protected Integer localityId;
    protected String name;
    protected Integer oldId;
    protected String oldName;
    protected Integer settlementId;
    protected Integer typeId;
    protected Integer yearOpened;
    protected Integer zipId;

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the administrativePostId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdministrativePostId() {
        return administrativePostId;
    }

    /**
     * Sets the value of the administrativePostId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdministrativePostId(Integer value) {
        this.administrativePostId = value;
    }

    /**
     * Gets the value of the areaId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAreaId(Integer value) {
        this.areaId = value;
    }

    /**
     * Gets the value of the coordinateX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordinateX() {
        return coordinateX;
    }

    /**
     * Sets the value of the coordinateX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordinateX(Double value) {
        this.coordinateX = value;
    }

    /**
     * Gets the value of the coordinateY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordinateY() {
        return coordinateY;
    }

    /**
     * Sets the value of the coordinateY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordinateY(Double value) {
        this.coordinateY = value;
    }

    /**
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistrictId(Integer value) {
        this.districtId = value;
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
     * Gets the value of the local property.
     * 
     */
    public int getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     */
    public void setLocal(int value) {
        this.local = value;
    }

    /**
     * Gets the value of the localityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalityId() {
        return localityId;
    }

    /**
     * Sets the value of the localityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalityId(Integer value) {
        this.localityId = value;
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

    /**
     * Gets the value of the oldId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldId() {
        return oldId;
    }

    /**
     * Sets the value of the oldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldId(Integer value) {
        this.oldId = value;
    }

    /**
     * Gets the value of the oldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldName() {
        return oldName;
    }

    /**
     * Sets the value of the oldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldName(String value) {
        this.oldName = value;
    }

    /**
     * Gets the value of the settlementId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettlementId() {
        return settlementId;
    }

    /**
     * Sets the value of the settlementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettlementId(Integer value) {
        this.settlementId = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the yearOpened property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearOpened() {
        return yearOpened;
    }

    /**
     * Sets the value of the yearOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearOpened(Integer value) {
        this.yearOpened = value;
    }

    /**
     * Gets the value of the zipId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZipId() {
        return zipId;
    }

    /**
     * Sets the value of the zipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZipId(Integer value) {
        this.zipId = value;
    }

}
