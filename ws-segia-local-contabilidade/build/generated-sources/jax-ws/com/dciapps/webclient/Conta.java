
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://webservice.centralserver.co.mz/}cliente" minOccurs="0"/>
 *         &lt;element name="con_codigo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="con_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="con_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="con_saldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="tipoConta" type="{http://webservice.centralserver.co.mz/}tipoConta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conta", propOrder = {
    "cliente",
    "conCodigo",
    "conId",
    "conNome",
    "conSaldo",
    "encrypted",
    "entidade",
    "tipoConta"
})
public class Conta {

    protected Cliente cliente;
    @XmlElement(name = "con_codigo")
    protected long conCodigo;
    @XmlElement(name = "con_id")
    protected int conId;
    @XmlElement(name = "con_nome")
    protected String conNome;
    @XmlElement(name = "con_saldo")
    protected double conSaldo;
    protected boolean encrypted;
    protected Entidade entidade;
    protected TipoConta tipoConta;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the conCodigo property.
     * 
     */
    public long getConCodigo() {
        return conCodigo;
    }

    /**
     * Sets the value of the conCodigo property.
     * 
     */
    public void setConCodigo(long value) {
        this.conCodigo = value;
    }

    /**
     * Gets the value of the conId property.
     * 
     */
    public int getConId() {
        return conId;
    }

    /**
     * Sets the value of the conId property.
     * 
     */
    public void setConId(int value) {
        this.conId = value;
    }

    /**
     * Gets the value of the conNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConNome() {
        return conNome;
    }

    /**
     * Sets the value of the conNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConNome(String value) {
        this.conNome = value;
    }

    /**
     * Gets the value of the conSaldo property.
     * 
     */
    public double getConSaldo() {
        return conSaldo;
    }

    /**
     * Sets the value of the conSaldo property.
     * 
     */
    public void setConSaldo(double value) {
        this.conSaldo = value;
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
     * Gets the value of the tipoConta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConta }
     *     
     */
    public TipoConta getTipoConta() {
        return tipoConta;
    }

    /**
     * Sets the value of the tipoConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConta }
     *     
     */
    public void setTipoConta(TipoConta value) {
        this.tipoConta = value;
    }

}
