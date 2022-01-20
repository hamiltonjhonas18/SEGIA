
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planoDeConta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="planoDeConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pdc_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdc_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="planoDeConta" type="{http://webservice.centralserver.co.mz/}planoDeConta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planoDeConta", propOrder = {
    "encrypted",
    "entidade",
    "pdcCodigo",
    "pdcDescricao",
    "pdcId",
    "planoDeConta"
})
public class PlanoDeConta {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "pdc_codigo")
    protected String pdcCodigo;
    @XmlElement(name = "pdc_descricao")
    protected String pdcDescricao;
    @XmlElement(name = "pdc_id")
    protected int pdcId;
    protected PlanoDeConta planoDeConta;

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
     * Gets the value of the pdcCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdcCodigo() {
        return pdcCodigo;
    }

    /**
     * Sets the value of the pdcCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdcCodigo(String value) {
        this.pdcCodigo = value;
    }

    /**
     * Gets the value of the pdcDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdcDescricao() {
        return pdcDescricao;
    }

    /**
     * Sets the value of the pdcDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdcDescricao(String value) {
        this.pdcDescricao = value;
    }

    /**
     * Gets the value of the pdcId property.
     * 
     */
    public int getPdcId() {
        return pdcId;
    }

    /**
     * Sets the value of the pdcId property.
     * 
     */
    public void setPdcId(int value) {
        this.pdcId = value;
    }

    /**
     * Gets the value of the planoDeConta property.
     * 
     * @return
     *     possible object is
     *     {@link PlanoDeConta }
     *     
     */
    public PlanoDeConta getPlanoDeConta() {
        return planoDeConta;
    }

    /**
     * Sets the value of the planoDeConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanoDeConta }
     *     
     */
    public void setPlanoDeConta(PlanoDeConta value) {
        this.planoDeConta = value;
    }

}
