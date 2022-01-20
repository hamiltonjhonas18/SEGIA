
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contaGeral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contaGeral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctg_conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctg_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctg_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ctg_raiz" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaGeral", propOrder = {
    "ctgConta",
    "ctgDescricao",
    "ctgId",
    "ctgRaiz",
    "encrypted",
    "entidade"
})
public class ContaGeral {

    @XmlElement(name = "ctg_conta")
    protected String ctgConta;
    @XmlElement(name = "ctg_descricao")
    protected String ctgDescricao;
    @XmlElement(name = "ctg_id")
    protected int ctgId;
    @XmlElement(name = "ctg_raiz")
    protected boolean ctgRaiz;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the ctgConta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgConta() {
        return ctgConta;
    }

    /**
     * Sets the value of the ctgConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgConta(String value) {
        this.ctgConta = value;
    }

    /**
     * Gets the value of the ctgDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgDescricao() {
        return ctgDescricao;
    }

    /**
     * Sets the value of the ctgDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgDescricao(String value) {
        this.ctgDescricao = value;
    }

    /**
     * Gets the value of the ctgId property.
     * 
     */
    public int getCtgId() {
        return ctgId;
    }

    /**
     * Sets the value of the ctgId property.
     * 
     */
    public void setCtgId(int value) {
        this.ctgId = value;
    }

    /**
     * Gets the value of the ctgRaiz property.
     * 
     */
    public boolean isCtgRaiz() {
        return ctgRaiz;
    }

    /**
     * Sets the value of the ctgRaiz property.
     * 
     */
    public void setCtgRaiz(boolean value) {
        this.ctgRaiz = value;
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

}
