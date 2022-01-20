
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for extractoContaGeral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extractoContaGeral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contaGeral" type="{http://webservice.centralserver.co.mz/}contaGeral" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="extc_credito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="extc_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extc_debito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="extc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="extc_movimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extc_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lancamento" type="{http://webservice.centralserver.co.mz/}lancamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extractoContaGeral", propOrder = {
    "contaGeral",
    "encrypted",
    "entidade",
    "extcCredito",
    "extcData",
    "extcDebito",
    "extcId",
    "extcMovimento",
    "extcReferencia",
    "lancamento"
})
public class ExtractoContaGeral {

    protected ContaGeral contaGeral;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "extc_credito")
    protected double extcCredito;
    @XmlElement(name = "extc_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar extcData;
    @XmlElement(name = "extc_debito")
    protected double extcDebito;
    @XmlElement(name = "extc_id")
    protected int extcId;
    @XmlElement(name = "extc_movimento")
    protected String extcMovimento;
    @XmlElement(name = "extc_referencia")
    protected String extcReferencia;
    protected Lancamento lancamento;

    /**
     * Gets the value of the contaGeral property.
     * 
     * @return
     *     possible object is
     *     {@link ContaGeral }
     *     
     */
    public ContaGeral getContaGeral() {
        return contaGeral;
    }

    /**
     * Sets the value of the contaGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaGeral }
     *     
     */
    public void setContaGeral(ContaGeral value) {
        this.contaGeral = value;
    }

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
     * Gets the value of the extcCredito property.
     * 
     */
    public double getExtcCredito() {
        return extcCredito;
    }

    /**
     * Sets the value of the extcCredito property.
     * 
     */
    public void setExtcCredito(double value) {
        this.extcCredito = value;
    }

    /**
     * Gets the value of the extcData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExtcData() {
        return extcData;
    }

    /**
     * Sets the value of the extcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExtcData(XMLGregorianCalendar value) {
        this.extcData = value;
    }

    /**
     * Gets the value of the extcDebito property.
     * 
     */
    public double getExtcDebito() {
        return extcDebito;
    }

    /**
     * Sets the value of the extcDebito property.
     * 
     */
    public void setExtcDebito(double value) {
        this.extcDebito = value;
    }

    /**
     * Gets the value of the extcId property.
     * 
     */
    public int getExtcId() {
        return extcId;
    }

    /**
     * Sets the value of the extcId property.
     * 
     */
    public void setExtcId(int value) {
        this.extcId = value;
    }

    /**
     * Gets the value of the extcMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtcMovimento() {
        return extcMovimento;
    }

    /**
     * Sets the value of the extcMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtcMovimento(String value) {
        this.extcMovimento = value;
    }

    /**
     * Gets the value of the extcReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtcReferencia() {
        return extcReferencia;
    }

    /**
     * Sets the value of the extcReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtcReferencia(String value) {
        this.extcReferencia = value;
    }

    /**
     * Gets the value of the lancamento property.
     * 
     * @return
     *     possible object is
     *     {@link Lancamento }
     *     
     */
    public Lancamento getLancamento() {
        return lancamento;
    }

    /**
     * Sets the value of the lancamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lancamento }
     *     
     */
    public void setLancamento(Lancamento value) {
        this.lancamento = value;
    }

}
