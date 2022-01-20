
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agendaContacto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agendaContacto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agc_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cliente" type="{http://webservice.centralserver.co.mz/}cliente" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="fornecedor" type="{http://webservice.centralserver.co.mz/}fornecedor" minOccurs="0"/>
 *         &lt;element name="funcionario" type="{http://webservice.centralserver.co.mz/}funcionario" minOccurs="0"/>
 *         &lt;element name="tipoContacto" type="{http://webservice.centralserver.co.mz/}tipoContacto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agendaContacto", propOrder = {
    "agcDescricao",
    "agcId",
    "cliente",
    "encrypted",
    "entidade",
    "fornecedor",
    "funcionario",
    "tipoContacto"
})
public class AgendaContacto {

    @XmlElement(name = "agc_descricao")
    protected String agcDescricao;
    @XmlElement(name = "agc_id")
    protected int agcId;
    protected Cliente cliente;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Fornecedor fornecedor;
    protected Funcionario funcionario;
    protected TipoContacto tipoContacto;

    /**
     * Gets the value of the agcDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgcDescricao() {
        return agcDescricao;
    }

    /**
     * Sets the value of the agcDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgcDescricao(String value) {
        this.agcDescricao = value;
    }

    /**
     * Gets the value of the agcId property.
     * 
     */
    public int getAgcId() {
        return agcId;
    }

    /**
     * Sets the value of the agcId property.
     * 
     */
    public void setAgcId(int value) {
        this.agcId = value;
    }

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

    /**
     * Gets the value of the tipoContacto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    /**
     * Sets the value of the tipoContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setTipoContacto(TipoContacto value) {
        this.tipoContacto = value;
    }

}
