
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for activo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acti_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="acti_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acti_especificacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acti_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="acti_referenciaDocumentoCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acti_valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="acti_vidaUtil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="fornecedor" type="{http://webservice.centralserver.co.mz/}fornecedor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activo", propOrder = {
    "actiData",
    "actiDescricao",
    "actiEspecificacoes",
    "actiId",
    "actiReferenciaDocumentoCompra",
    "actiValor",
    "actiVidaUtil",
    "encrypted",
    "entidade",
    "fornecedor"
})
public class Activo {

    @XmlElement(name = "acti_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actiData;
    @XmlElement(name = "acti_descricao")
    protected String actiDescricao;
    @XmlElement(name = "acti_especificacoes")
    protected String actiEspecificacoes;
    @XmlElement(name = "acti_id")
    protected int actiId;
    @XmlElement(name = "acti_referenciaDocumentoCompra")
    protected String actiReferenciaDocumentoCompra;
    @XmlElement(name = "acti_valor")
    protected double actiValor;
    @XmlElement(name = "acti_vidaUtil")
    protected int actiVidaUtil;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Fornecedor fornecedor;

    /**
     * Gets the value of the actiData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiData() {
        return actiData;
    }

    /**
     * Sets the value of the actiData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiData(XMLGregorianCalendar value) {
        this.actiData = value;
    }

    /**
     * Gets the value of the actiDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiDescricao() {
        return actiDescricao;
    }

    /**
     * Sets the value of the actiDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiDescricao(String value) {
        this.actiDescricao = value;
    }

    /**
     * Gets the value of the actiEspecificacoes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiEspecificacoes() {
        return actiEspecificacoes;
    }

    /**
     * Sets the value of the actiEspecificacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiEspecificacoes(String value) {
        this.actiEspecificacoes = value;
    }

    /**
     * Gets the value of the actiId property.
     * 
     */
    public int getActiId() {
        return actiId;
    }

    /**
     * Sets the value of the actiId property.
     * 
     */
    public void setActiId(int value) {
        this.actiId = value;
    }

    /**
     * Gets the value of the actiReferenciaDocumentoCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiReferenciaDocumentoCompra() {
        return actiReferenciaDocumentoCompra;
    }

    /**
     * Sets the value of the actiReferenciaDocumentoCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiReferenciaDocumentoCompra(String value) {
        this.actiReferenciaDocumentoCompra = value;
    }

    /**
     * Gets the value of the actiValor property.
     * 
     */
    public double getActiValor() {
        return actiValor;
    }

    /**
     * Sets the value of the actiValor property.
     * 
     */
    public void setActiValor(double value) {
        this.actiValor = value;
    }

    /**
     * Gets the value of the actiVidaUtil property.
     * 
     */
    public int getActiVidaUtil() {
        return actiVidaUtil;
    }

    /**
     * Sets the value of the actiVidaUtil property.
     * 
     */
    public void setActiVidaUtil(int value) {
        this.actiVidaUtil = value;
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
     * Gets the value of the fornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link Fornecedor }
     *     
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * Sets the value of the fornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fornecedor }
     *     
     */
    public void setFornecedor(Fornecedor value) {
        this.fornecedor = value;
    }

}
