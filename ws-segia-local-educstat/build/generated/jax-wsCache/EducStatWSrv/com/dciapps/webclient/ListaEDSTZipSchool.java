
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaEDST_Zip_School complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaEDST_Zip_School">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeadQuarterSchoolId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "listaEDST_Zip_School", propOrder = {
    "headQuarterSchoolId",
    "limit"
})
public class ListaEDSTZipSchool {

    @XmlElement(name = "HeadQuarterSchoolId")
    protected int headQuarterSchoolId;
    protected int limit;

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
