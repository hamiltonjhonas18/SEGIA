
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parceiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parceiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="parc_areaActuacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parc_contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parc_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parc_endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parc_nuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parc_pessoaContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parceiro", propOrder = {
    "encrypted",
    "entidade",
    "parcAreaActuacao",
    "parcContacto",
    "parcDescricao",
    "parcEndereco",
    "parcId",
    "parcNuit",
    "parcPessoaContacto"
})
public class Parceiro {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "parc_areaActuacao")
    protected String parcAreaActuacao;
    @XmlElement(name = "parc_contacto")
    protected String parcContacto;
    @XmlElement(name = "parc_descricao")
    protected String parcDescricao;
    @XmlElement(name = "parc_endereco")
    protected String parcEndereco;
    @XmlElement(name = "parc_id")
    protected int parcId;
    @XmlElement(name = "parc_nuit")
    protected String parcNuit;
    @XmlElement(name = "parc_pessoaContacto")
    protected String parcPessoaContacto;

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
     * Gets the value of the parcAreaActuacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcAreaActuacao() {
        return parcAreaActuacao;
    }

    /**
     * Sets the value of the parcAreaActuacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcAreaActuacao(String value) {
        this.parcAreaActuacao = value;
    }

    /**
     * Gets the value of the parcContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcContacto() {
        return parcContacto;
    }

    /**
     * Sets the value of the parcContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcContacto(String value) {
        this.parcContacto = value;
    }

    /**
     * Gets the value of the parcDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcDescricao() {
        return parcDescricao;
    }

    /**
     * Sets the value of the parcDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcDescricao(String value) {
        this.parcDescricao = value;
    }

    /**
     * Gets the value of the parcEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcEndereco() {
        return parcEndereco;
    }

    /**
     * Sets the value of the parcEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcEndereco(String value) {
        this.parcEndereco = value;
    }

    /**
     * Gets the value of the parcId property.
     * 
     */
    public int getParcId() {
        return parcId;
    }

    /**
     * Sets the value of the parcId property.
     * 
     */
    public void setParcId(int value) {
        this.parcId = value;
    }

    /**
     * Gets the value of the parcNuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcNuit() {
        return parcNuit;
    }

    /**
     * Sets the value of the parcNuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcNuit(String value) {
        this.parcNuit = value;
    }

    /**
     * Gets the value of the parcPessoaContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcPessoaContacto() {
        return parcPessoaContacto;
    }

    /**
     * Sets the value of the parcPessoaContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcPessoaContacto(String value) {
        this.parcPessoaContacto = value;
    }

}
