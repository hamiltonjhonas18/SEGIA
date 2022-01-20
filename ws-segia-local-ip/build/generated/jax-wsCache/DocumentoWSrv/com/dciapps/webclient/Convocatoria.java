
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for convocatoria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convocatoria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conv_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conv_acta" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="conv_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="conv_dataReuniao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="conv_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="presidente" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *         &lt;element name="sala" type="{http://webservice.centralserver.co.mz/}sala" minOccurs="0"/>
 *         &lt;element name="secretario" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convocatoria", propOrder = {
    "conv1",
    "conv10",
    "conv2",
    "conv3",
    "conv4",
    "conv5",
    "conv6",
    "conv7",
    "conv8",
    "conv9",
    "convActa",
    "convData",
    "convDataReuniao",
    "convId",
    "entidade",
    "escola",
    "presidente",
    "sala",
    "secretario"
})
public class Convocatoria {

    @XmlElement(name = "conv_1")
    protected String conv1;
    @XmlElement(name = "conv_10")
    protected String conv10;
    @XmlElement(name = "conv_2")
    protected String conv2;
    @XmlElement(name = "conv_3")
    protected String conv3;
    @XmlElement(name = "conv_4")
    protected String conv4;
    @XmlElement(name = "conv_5")
    protected String conv5;
    @XmlElement(name = "conv_6")
    protected String conv6;
    @XmlElement(name = "conv_7")
    protected String conv7;
    @XmlElement(name = "conv_8")
    protected String conv8;
    @XmlElement(name = "conv_9")
    protected String conv9;
    @XmlElement(name = "conv_acta")
    protected boolean convActa;
    @XmlElement(name = "conv_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar convData;
    @XmlElement(name = "conv_dataReuniao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar convDataReuniao;
    @XmlElement(name = "conv_id")
    protected int convId;
    protected Entidade entidade;
    protected Escola escola;
    protected Pessoa presidente;
    protected Sala sala;
    protected Pessoa secretario;

    /**
     * Gets the value of the conv1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv1() {
        return conv1;
    }

    /**
     * Sets the value of the conv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv1(String value) {
        this.conv1 = value;
    }

    /**
     * Gets the value of the conv10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv10() {
        return conv10;
    }

    /**
     * Sets the value of the conv10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv10(String value) {
        this.conv10 = value;
    }

    /**
     * Gets the value of the conv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv2() {
        return conv2;
    }

    /**
     * Sets the value of the conv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv2(String value) {
        this.conv2 = value;
    }

    /**
     * Gets the value of the conv3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv3() {
        return conv3;
    }

    /**
     * Sets the value of the conv3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv3(String value) {
        this.conv3 = value;
    }

    /**
     * Gets the value of the conv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv4() {
        return conv4;
    }

    /**
     * Sets the value of the conv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv4(String value) {
        this.conv4 = value;
    }

    /**
     * Gets the value of the conv5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv5() {
        return conv5;
    }

    /**
     * Sets the value of the conv5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv5(String value) {
        this.conv5 = value;
    }

    /**
     * Gets the value of the conv6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv6() {
        return conv6;
    }

    /**
     * Sets the value of the conv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv6(String value) {
        this.conv6 = value;
    }

    /**
     * Gets the value of the conv7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv7() {
        return conv7;
    }

    /**
     * Sets the value of the conv7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv7(String value) {
        this.conv7 = value;
    }

    /**
     * Gets the value of the conv8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv8() {
        return conv8;
    }

    /**
     * Sets the value of the conv8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv8(String value) {
        this.conv8 = value;
    }

    /**
     * Gets the value of the conv9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConv9() {
        return conv9;
    }

    /**
     * Sets the value of the conv9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConv9(String value) {
        this.conv9 = value;
    }

    /**
     * Gets the value of the convActa property.
     * 
     */
    public boolean isConvActa() {
        return convActa;
    }

    /**
     * Sets the value of the convActa property.
     * 
     */
    public void setConvActa(boolean value) {
        this.convActa = value;
    }

    /**
     * Gets the value of the convData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvData() {
        return convData;
    }

    /**
     * Sets the value of the convData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvData(XMLGregorianCalendar value) {
        this.convData = value;
    }

    /**
     * Gets the value of the convDataReuniao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvDataReuniao() {
        return convDataReuniao;
    }

    /**
     * Sets the value of the convDataReuniao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvDataReuniao(XMLGregorianCalendar value) {
        this.convDataReuniao = value;
    }

    /**
     * Gets the value of the convId property.
     * 
     */
    public int getConvId() {
        return convId;
    }

    /**
     * Sets the value of the convId property.
     * 
     */
    public void setConvId(int value) {
        this.convId = value;
    }

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
     * Gets the value of the escola property.
     * 
     * @return
     *     possible object is
     *     {@link Escola }
     *     
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * Sets the value of the escola property.
     * 
     * @param value
     *     allowed object is
     *     {@link Escola }
     *     
     */
    public void setEscola(Escola value) {
        this.escola = value;
    }

    /**
     * Gets the value of the presidente property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPresidente() {
        return presidente;
    }

    /**
     * Sets the value of the presidente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPresidente(Pessoa value) {
        this.presidente = value;
    }

    /**
     * Gets the value of the sala property.
     * 
     * @return
     *     possible object is
     *     {@link Sala }
     *     
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * Sets the value of the sala property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sala }
     *     
     */
    public void setSala(Sala value) {
        this.sala = value;
    }

    /**
     * Gets the value of the secretario property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getSecretario() {
        return secretario;
    }

    /**
     * Sets the value of the secretario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setSecretario(Pessoa value) {
        this.secretario = value;
    }

}
