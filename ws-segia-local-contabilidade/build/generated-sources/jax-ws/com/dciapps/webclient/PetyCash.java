
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for petyCash complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="petyCash">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="funcionario" type="{http://webservice.centralserver.co.mz/}funcionario" minOccurs="0"/>
 *         &lt;element name="pet_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pet_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pet_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pet_saldoAnterior" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pet_valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pety" type="{http://webservice.centralserver.co.mz/}pety" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "petyCash", propOrder = {
    "encrypted",
    "entidade",
    "funcionario",
    "petData",
    "petDescricao",
    "petId",
    "petSaldoAnterior",
    "petValor",
    "pety",
    "usuario"
})
public class PetyCash {

    protected boolean encrypted;
    protected Entidade entidade;
    protected Funcionario funcionario;
    @XmlElement(name = "pet_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar petData;
    @XmlElement(name = "pet_descricao")
    protected String petDescricao;
    @XmlElement(name = "pet_id")
    protected int petId;
    @XmlElement(name = "pet_saldoAnterior")
    protected double petSaldoAnterior;
    @XmlElement(name = "pet_valor")
    protected double petValor;
    protected Pety pety;
    protected Usuario usuario;

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
     * Gets the value of the petData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPetData() {
        return petData;
    }

    /**
     * Sets the value of the petData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPetData(XMLGregorianCalendar value) {
        this.petData = value;
    }

    /**
     * Gets the value of the petDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetDescricao() {
        return petDescricao;
    }

    /**
     * Sets the value of the petDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetDescricao(String value) {
        this.petDescricao = value;
    }

    /**
     * Gets the value of the petId property.
     * 
     */
    public int getPetId() {
        return petId;
    }

    /**
     * Sets the value of the petId property.
     * 
     */
    public void setPetId(int value) {
        this.petId = value;
    }

    /**
     * Gets the value of the petSaldoAnterior property.
     * 
     */
    public double getPetSaldoAnterior() {
        return petSaldoAnterior;
    }

    /**
     * Sets the value of the petSaldoAnterior property.
     * 
     */
    public void setPetSaldoAnterior(double value) {
        this.petSaldoAnterior = value;
    }

    /**
     * Gets the value of the petValor property.
     * 
     */
    public double getPetValor() {
        return petValor;
    }

    /**
     * Sets the value of the petValor property.
     * 
     */
    public void setPetValor(double value) {
        this.petValor = value;
    }

    /**
     * Gets the value of the pety property.
     * 
     * @return
     *     possible object is
     *     {@link Pety }
     *     
     */
    public Pety getPety() {
        return pety;
    }

    /**
     * Sets the value of the pety property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pety }
     *     
     */
    public void setPety(Pety value) {
        this.pety = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
