
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cliente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clie_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clie_contaGeral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clie_funcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clie_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clie_nid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clie_saldoCredito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="clie_saldoDebito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pessoapess" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "clieCategoria",
    "clieContaGeral",
    "clieFuncao",
    "clieId",
    "clieNid",
    "clieSaldoCredito",
    "clieSaldoDebito",
    "encrypted",
    "entidade",
    "pessoapess"
})
public class Cliente {

    @XmlElement(name = "clie_categoria")
    protected String clieCategoria;
    @XmlElement(name = "clie_contaGeral")
    protected String clieContaGeral;
    @XmlElement(name = "clie_funcao")
    protected String clieFuncao;
    @XmlElement(name = "clie_id")
    protected int clieId;
    @XmlElement(name = "clie_nid")
    protected int clieNid;
    @XmlElement(name = "clie_saldoCredito")
    protected double clieSaldoCredito;
    @XmlElement(name = "clie_saldoDebito")
    protected double clieSaldoDebito;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Pessoa pessoapess;

    /**
     * Gets the value of the clieCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClieCategoria() {
        return clieCategoria;
    }

    /**
     * Sets the value of the clieCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClieCategoria(String value) {
        this.clieCategoria = value;
    }

    /**
     * Gets the value of the clieContaGeral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClieContaGeral() {
        return clieContaGeral;
    }

    /**
     * Sets the value of the clieContaGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClieContaGeral(String value) {
        this.clieContaGeral = value;
    }

    /**
     * Gets the value of the clieFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClieFuncao() {
        return clieFuncao;
    }

    /**
     * Sets the value of the clieFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClieFuncao(String value) {
        this.clieFuncao = value;
    }

    /**
     * Gets the value of the clieId property.
     * 
     */
    public int getClieId() {
        return clieId;
    }

    /**
     * Sets the value of the clieId property.
     * 
     */
    public void setClieId(int value) {
        this.clieId = value;
    }

    /**
     * Gets the value of the clieNid property.
     * 
     */
    public int getClieNid() {
        return clieNid;
    }

    /**
     * Sets the value of the clieNid property.
     * 
     */
    public void setClieNid(int value) {
        this.clieNid = value;
    }

    /**
     * Gets the value of the clieSaldoCredito property.
     * 
     */
    public double getClieSaldoCredito() {
        return clieSaldoCredito;
    }

    /**
     * Sets the value of the clieSaldoCredito property.
     * 
     */
    public void setClieSaldoCredito(double value) {
        this.clieSaldoCredito = value;
    }

    /**
     * Gets the value of the clieSaldoDebito property.
     * 
     */
    public double getClieSaldoDebito() {
        return clieSaldoDebito;
    }

    /**
     * Sets the value of the clieSaldoDebito property.
     * 
     */
    public void setClieSaldoDebito(double value) {
        this.clieSaldoDebito = value;
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
     * Gets the value of the pessoapess property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoapess() {
        return pessoapess;
    }

    /**
     * Sets the value of the pessoapess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoapess(Pessoa value) {
        this.pessoapess = value;
    }

}
