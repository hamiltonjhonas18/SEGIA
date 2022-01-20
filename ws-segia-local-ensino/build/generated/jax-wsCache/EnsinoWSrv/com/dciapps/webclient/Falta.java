
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for falta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="falta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_escola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="falt_01" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_02" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_03" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_04" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_05" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_06" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_07" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_08" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_09" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_11" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_12" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_ano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="falt_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_01" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_02" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_03" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_04" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_05" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_06" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_07" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_08" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_09" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_11" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="falt_j_12" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "falta", propOrder = {
    "codEscola",
    "falt01",
    "falt02",
    "falt03",
    "falt04",
    "falt05",
    "falt06",
    "falt07",
    "falt08",
    "falt09",
    "falt10",
    "falt11",
    "falt12",
    "faltAno",
    "faltId",
    "faltJ01",
    "faltJ02",
    "faltJ03",
    "faltJ04",
    "faltJ05",
    "faltJ06",
    "faltJ07",
    "faltJ08",
    "faltJ09",
    "faltJ10",
    "faltJ11",
    "faltJ12"
})
public class Falta {

    @XmlElement(name = "cod_escola")
    protected String codEscola;
    @XmlElement(name = "falt_01")
    protected int falt01;
    @XmlElement(name = "falt_02")
    protected int falt02;
    @XmlElement(name = "falt_03")
    protected int falt03;
    @XmlElement(name = "falt_04")
    protected int falt04;
    @XmlElement(name = "falt_05")
    protected int falt05;
    @XmlElement(name = "falt_06")
    protected int falt06;
    @XmlElement(name = "falt_07")
    protected int falt07;
    @XmlElement(name = "falt_08")
    protected int falt08;
    @XmlElement(name = "falt_09")
    protected int falt09;
    @XmlElement(name = "falt_10")
    protected int falt10;
    @XmlElement(name = "falt_11")
    protected int falt11;
    @XmlElement(name = "falt_12")
    protected int falt12;
    @XmlElement(name = "falt_ano")
    protected String faltAno;
    @XmlElement(name = "falt_id")
    protected int faltId;
    @XmlElement(name = "falt_j_01")
    protected int faltJ01;
    @XmlElement(name = "falt_j_02")
    protected int faltJ02;
    @XmlElement(name = "falt_j_03")
    protected int faltJ03;
    @XmlElement(name = "falt_j_04")
    protected int faltJ04;
    @XmlElement(name = "falt_j_05")
    protected int faltJ05;
    @XmlElement(name = "falt_j_06")
    protected int faltJ06;
    @XmlElement(name = "falt_j_07")
    protected int faltJ07;
    @XmlElement(name = "falt_j_08")
    protected int faltJ08;
    @XmlElement(name = "falt_j_09")
    protected int faltJ09;
    @XmlElement(name = "falt_j_10")
    protected int faltJ10;
    @XmlElement(name = "falt_j_11")
    protected int faltJ11;
    @XmlElement(name = "falt_j_12")
    protected int faltJ12;

    /**
     * Gets the value of the codEscola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEscola() {
        return codEscola;
    }

    /**
     * Sets the value of the codEscola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEscola(String value) {
        this.codEscola = value;
    }

    /**
     * Gets the value of the falt01 property.
     * 
     */
    public int getFalt01() {
        return falt01;
    }

    /**
     * Sets the value of the falt01 property.
     * 
     */
    public void setFalt01(int value) {
        this.falt01 = value;
    }

    /**
     * Gets the value of the falt02 property.
     * 
     */
    public int getFalt02() {
        return falt02;
    }

    /**
     * Sets the value of the falt02 property.
     * 
     */
    public void setFalt02(int value) {
        this.falt02 = value;
    }

    /**
     * Gets the value of the falt03 property.
     * 
     */
    public int getFalt03() {
        return falt03;
    }

    /**
     * Sets the value of the falt03 property.
     * 
     */
    public void setFalt03(int value) {
        this.falt03 = value;
    }

    /**
     * Gets the value of the falt04 property.
     * 
     */
    public int getFalt04() {
        return falt04;
    }

    /**
     * Sets the value of the falt04 property.
     * 
     */
    public void setFalt04(int value) {
        this.falt04 = value;
    }

    /**
     * Gets the value of the falt05 property.
     * 
     */
    public int getFalt05() {
        return falt05;
    }

    /**
     * Sets the value of the falt05 property.
     * 
     */
    public void setFalt05(int value) {
        this.falt05 = value;
    }

    /**
     * Gets the value of the falt06 property.
     * 
     */
    public int getFalt06() {
        return falt06;
    }

    /**
     * Sets the value of the falt06 property.
     * 
     */
    public void setFalt06(int value) {
        this.falt06 = value;
    }

    /**
     * Gets the value of the falt07 property.
     * 
     */
    public int getFalt07() {
        return falt07;
    }

    /**
     * Sets the value of the falt07 property.
     * 
     */
    public void setFalt07(int value) {
        this.falt07 = value;
    }

    /**
     * Gets the value of the falt08 property.
     * 
     */
    public int getFalt08() {
        return falt08;
    }

    /**
     * Sets the value of the falt08 property.
     * 
     */
    public void setFalt08(int value) {
        this.falt08 = value;
    }

    /**
     * Gets the value of the falt09 property.
     * 
     */
    public int getFalt09() {
        return falt09;
    }

    /**
     * Sets the value of the falt09 property.
     * 
     */
    public void setFalt09(int value) {
        this.falt09 = value;
    }

    /**
     * Gets the value of the falt10 property.
     * 
     */
    public int getFalt10() {
        return falt10;
    }

    /**
     * Sets the value of the falt10 property.
     * 
     */
    public void setFalt10(int value) {
        this.falt10 = value;
    }

    /**
     * Gets the value of the falt11 property.
     * 
     */
    public int getFalt11() {
        return falt11;
    }

    /**
     * Sets the value of the falt11 property.
     * 
     */
    public void setFalt11(int value) {
        this.falt11 = value;
    }

    /**
     * Gets the value of the falt12 property.
     * 
     */
    public int getFalt12() {
        return falt12;
    }

    /**
     * Sets the value of the falt12 property.
     * 
     */
    public void setFalt12(int value) {
        this.falt12 = value;
    }

    /**
     * Gets the value of the faltAno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaltAno() {
        return faltAno;
    }

    /**
     * Sets the value of the faltAno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaltAno(String value) {
        this.faltAno = value;
    }

    /**
     * Gets the value of the faltId property.
     * 
     */
    public int getFaltId() {
        return faltId;
    }

    /**
     * Sets the value of the faltId property.
     * 
     */
    public void setFaltId(int value) {
        this.faltId = value;
    }

    /**
     * Gets the value of the faltJ01 property.
     * 
     */
    public int getFaltJ01() {
        return faltJ01;
    }

    /**
     * Sets the value of the faltJ01 property.
     * 
     */
    public void setFaltJ01(int value) {
        this.faltJ01 = value;
    }

    /**
     * Gets the value of the faltJ02 property.
     * 
     */
    public int getFaltJ02() {
        return faltJ02;
    }

    /**
     * Sets the value of the faltJ02 property.
     * 
     */
    public void setFaltJ02(int value) {
        this.faltJ02 = value;
    }

    /**
     * Gets the value of the faltJ03 property.
     * 
     */
    public int getFaltJ03() {
        return faltJ03;
    }

    /**
     * Sets the value of the faltJ03 property.
     * 
     */
    public void setFaltJ03(int value) {
        this.faltJ03 = value;
    }

    /**
     * Gets the value of the faltJ04 property.
     * 
     */
    public int getFaltJ04() {
        return faltJ04;
    }

    /**
     * Sets the value of the faltJ04 property.
     * 
     */
    public void setFaltJ04(int value) {
        this.faltJ04 = value;
    }

    /**
     * Gets the value of the faltJ05 property.
     * 
     */
    public int getFaltJ05() {
        return faltJ05;
    }

    /**
     * Sets the value of the faltJ05 property.
     * 
     */
    public void setFaltJ05(int value) {
        this.faltJ05 = value;
    }

    /**
     * Gets the value of the faltJ06 property.
     * 
     */
    public int getFaltJ06() {
        return faltJ06;
    }

    /**
     * Sets the value of the faltJ06 property.
     * 
     */
    public void setFaltJ06(int value) {
        this.faltJ06 = value;
    }

    /**
     * Gets the value of the faltJ07 property.
     * 
     */
    public int getFaltJ07() {
        return faltJ07;
    }

    /**
     * Sets the value of the faltJ07 property.
     * 
     */
    public void setFaltJ07(int value) {
        this.faltJ07 = value;
    }

    /**
     * Gets the value of the faltJ08 property.
     * 
     */
    public int getFaltJ08() {
        return faltJ08;
    }

    /**
     * Sets the value of the faltJ08 property.
     * 
     */
    public void setFaltJ08(int value) {
        this.faltJ08 = value;
    }

    /**
     * Gets the value of the faltJ09 property.
     * 
     */
    public int getFaltJ09() {
        return faltJ09;
    }

    /**
     * Sets the value of the faltJ09 property.
     * 
     */
    public void setFaltJ09(int value) {
        this.faltJ09 = value;
    }

    /**
     * Gets the value of the faltJ10 property.
     * 
     */
    public int getFaltJ10() {
        return faltJ10;
    }

    /**
     * Sets the value of the faltJ10 property.
     * 
     */
    public void setFaltJ10(int value) {
        this.faltJ10 = value;
    }

    /**
     * Gets the value of the faltJ11 property.
     * 
     */
    public int getFaltJ11() {
        return faltJ11;
    }

    /**
     * Sets the value of the faltJ11 property.
     * 
     */
    public void setFaltJ11(int value) {
        this.faltJ11 = value;
    }

    /**
     * Gets the value of the faltJ12 property.
     * 
     */
    public int getFaltJ12() {
        return faltJ12;
    }

    /**
     * Sets the value of the faltJ12 property.
     * 
     */
    public void setFaltJ12(int value) {
        this.faltJ12 = value;
    }

}
