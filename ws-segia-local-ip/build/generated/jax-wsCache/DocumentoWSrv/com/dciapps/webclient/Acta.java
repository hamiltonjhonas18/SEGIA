
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for acta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acta_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acta_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acta_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="acta_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convocatoria" type="{http://webservice.centralserver.co.mz/}convocatoria" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acta", propOrder = {
    "actaData",
    "actaDescricao",
    "actaId",
    "actaReferencia",
    "convocatoria",
    "entidade",
    "escola"
})
public class Acta {

    @XmlElement(name = "acta_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actaData;
    @XmlElement(name = "acta_descricao")
    protected String actaDescricao;
    @XmlElement(name = "acta_id")
    protected int actaId;
    @XmlElement(name = "acta_referencia")
    protected String actaReferencia;
    protected Convocatoria convocatoria;
    protected Entidade entidade;
    protected Escola escola;

    /**
     * Gets the value of the actaData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActaData() {
        return actaData;
    }

    /**
     * Sets the value of the actaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActaData(XMLGregorianCalendar value) {
        this.actaData = value;
    }

    /**
     * Gets the value of the actaDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActaDescricao() {
        return actaDescricao;
    }

    /**
     * Sets the value of the actaDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActaDescricao(String value) {
        this.actaDescricao = value;
    }

    /**
     * Gets the value of the actaId property.
     * 
     */
    public int getActaId() {
        return actaId;
    }

    /**
     * Sets the value of the actaId property.
     * 
     */
    public void setActaId(int value) {
        this.actaId = value;
    }

    /**
     * Gets the value of the actaReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActaReferencia() {
        return actaReferencia;
    }

    /**
     * Sets the value of the actaReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActaReferencia(String value) {
        this.actaReferencia = value;
    }

    /**
     * Gets the value of the convocatoria property.
     * 
     * @return
     *     possible object is
     *     {@link Convocatoria }
     *     
     */
    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    /**
     * Sets the value of the convocatoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convocatoria }
     *     
     */
    public void setConvocatoria(Convocatoria value) {
        this.convocatoria = value;
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

}
