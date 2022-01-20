
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for faltas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faltas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="flt_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flt_dataJustificacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flt_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flt_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flt_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="funcionario" type="{http://webservice.centralserver.co.mz/}funcionario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faltas", propOrder = {
    "encrypted",
    "entidade",
    "fltData",
    "fltDataJustificacao",
    "fltDescricao",
    "fltId",
    "fltStatus",
    "funcionario"
})
public class Faltas {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "flt_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fltData;
    @XmlElement(name = "flt_dataJustificacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fltDataJustificacao;
    @XmlElement(name = "flt_descricao")
    protected String fltDescricao;
    @XmlElement(name = "flt_id")
    protected int fltId;
    @XmlElement(name = "flt_status")
    protected String fltStatus;
    protected Funcionario funcionario;

    /**
     * Gets the value of the encrypted property.
     * 
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     */
    public void setEncrypted(boolean value) {
        this.encrypted = value;
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
     * Gets the value of the fltData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFltData() {
        return fltData;
    }

    /**
     * Sets the value of the fltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFltData(XMLGregorianCalendar value) {
        this.fltData = value;
    }

    /**
     * Gets the value of the fltDataJustificacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFltDataJustificacao() {
        return fltDataJustificacao;
    }

    /**
     * Sets the value of the fltDataJustificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFltDataJustificacao(XMLGregorianCalendar value) {
        this.fltDataJustificacao = value;
    }

    /**
     * Gets the value of the fltDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltDescricao() {
        return fltDescricao;
    }

    /**
     * Sets the value of the fltDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltDescricao(String value) {
        this.fltDescricao = value;
    }

    /**
     * Gets the value of the fltId property.
     * 
     */
    public int getFltId() {
        return fltId;
    }

    /**
     * Sets the value of the fltId property.
     * 
     */
    public void setFltId(int value) {
        this.fltId = value;
    }

    /**
     * Gets the value of the fltStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltStatus() {
        return fltStatus;
    }

    /**
     * Sets the value of the fltStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltStatus(String value) {
        this.fltStatus = value;
    }

    /**
     * Gets the value of the funcionario property.
     * 
     * @return
     *     possible object is
     *     {@link Funcionario }
     *     
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Sets the value of the funcionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Funcionario }
     *     
     */
    public void setFuncionario(Funcionario value) {
        this.funcionario = value;
    }

}
