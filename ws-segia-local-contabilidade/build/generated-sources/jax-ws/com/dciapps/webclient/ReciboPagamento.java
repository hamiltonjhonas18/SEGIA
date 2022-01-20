
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reciboPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reciboPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *         &lt;element name="recp_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recp_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recp_lancamento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recp_multa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="recp_observacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recp_recebemosDe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recp_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recp_total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="recp_valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ref_bancoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref_nrDocumentoPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reciboPagamento", propOrder = {
    "encrypted",
    "entidade",
    "pessoa",
    "recpData",
    "recpId",
    "recpLancamento",
    "recpMulta",
    "recpObservacoes",
    "recpRecebemosDe",
    "recpReferencia",
    "recpTotal",
    "recpValor",
    "refBancoPagamento",
    "refNrDocumentoPagamento"
})
public class ReciboPagamento {

    protected boolean encrypted;
    protected Entidade entidade;
    protected Pessoa pessoa;
    @XmlElement(name = "recp_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recpData;
    @XmlElement(name = "recp_id")
    protected int recpId;
    @XmlElement(name = "recp_lancamento")
    protected long recpLancamento;
    @XmlElement(name = "recp_multa")
    protected double recpMulta;
    @XmlElement(name = "recp_observacoes")
    protected String recpObservacoes;
    @XmlElement(name = "recp_recebemosDe")
    protected String recpRecebemosDe;
    @XmlElement(name = "recp_referencia")
    protected String recpReferencia;
    @XmlElement(name = "recp_total")
    protected double recpTotal;
    @XmlElement(name = "recp_valor")
    protected double recpValor;
    @XmlElement(name = "ref_bancoPagamento")
    protected String refBancoPagamento;
    @XmlElement(name = "ref_nrDocumentoPagamento")
    protected String refNrDocumentoPagamento;

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
     * Gets the value of the pessoa property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Sets the value of the pessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoa(Pessoa value) {
        this.pessoa = value;
    }

    /**
     * Gets the value of the recpData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecpData() {
        return recpData;
    }

    /**
     * Sets the value of the recpData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecpData(XMLGregorianCalendar value) {
        this.recpData = value;
    }

    /**
     * Gets the value of the recpId property.
     * 
     */
    public int getRecpId() {
        return recpId;
    }

    /**
     * Sets the value of the recpId property.
     * 
     */
    public void setRecpId(int value) {
        this.recpId = value;
    }

    /**
     * Gets the value of the recpLancamento property.
     * 
     */
    public long getRecpLancamento() {
        return recpLancamento;
    }

    /**
     * Sets the value of the recpLancamento property.
     * 
     */
    public void setRecpLancamento(long value) {
        this.recpLancamento = value;
    }

    /**
     * Gets the value of the recpMulta property.
     * 
     */
    public double getRecpMulta() {
        return recpMulta;
    }

    /**
     * Sets the value of the recpMulta property.
     * 
     */
    public void setRecpMulta(double value) {
        this.recpMulta = value;
    }

    /**
     * Gets the value of the recpObservacoes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecpObservacoes() {
        return recpObservacoes;
    }

    /**
     * Sets the value of the recpObservacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecpObservacoes(String value) {
        this.recpObservacoes = value;
    }

    /**
     * Gets the value of the recpRecebemosDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecpRecebemosDe() {
        return recpRecebemosDe;
    }

    /**
     * Sets the value of the recpRecebemosDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecpRecebemosDe(String value) {
        this.recpRecebemosDe = value;
    }

    /**
     * Gets the value of the recpReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecpReferencia() {
        return recpReferencia;
    }

    /**
     * Sets the value of the recpReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecpReferencia(String value) {
        this.recpReferencia = value;
    }

    /**
     * Gets the value of the recpTotal property.
     * 
     */
    public double getRecpTotal() {
        return recpTotal;
    }

    /**
     * Sets the value of the recpTotal property.
     * 
     */
    public void setRecpTotal(double value) {
        this.recpTotal = value;
    }

    /**
     * Gets the value of the recpValor property.
     * 
     */
    public double getRecpValor() {
        return recpValor;
    }

    /**
     * Sets the value of the recpValor property.
     * 
     */
    public void setRecpValor(double value) {
        this.recpValor = value;
    }

    /**
     * Gets the value of the refBancoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefBancoPagamento() {
        return refBancoPagamento;
    }

    /**
     * Sets the value of the refBancoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefBancoPagamento(String value) {
        this.refBancoPagamento = value;
    }

    /**
     * Gets the value of the refNrDocumentoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNrDocumentoPagamento() {
        return refNrDocumentoPagamento;
    }

    /**
     * Sets the value of the refNrDocumentoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNrDocumentoPagamento(String value) {
        this.refNrDocumentoPagamento = value;
    }

}
