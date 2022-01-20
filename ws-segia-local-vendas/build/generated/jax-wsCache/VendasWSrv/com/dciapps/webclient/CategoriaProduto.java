
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoriaProduto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categoriaProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catp_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catp_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catp_estocado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catp_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="catp_numeroArtigos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="catp_referenciaArtigos" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "categoriaProduto", propOrder = {
    "catpCodigo",
    "catpDescricao",
    "catpEstocado",
    "catpId",
    "catpNumeroArtigos",
    "catpReferenciaArtigos",
    "encrypted",
    "entidade"
})
public class CategoriaProduto {

    @XmlElement(name = "catp_codigo")
    protected String catpCodigo;
    @XmlElement(name = "catp_descricao")
    protected String catpDescricao;
    @XmlElement(name = "catp_estocado")
    protected boolean catpEstocado;
    @XmlElement(name = "catp_id")
    protected int catpId;
    @XmlElement(name = "catp_numeroArtigos")
    protected int catpNumeroArtigos;
    @XmlElement(name = "catp_referenciaArtigos")
    protected int catpReferenciaArtigos;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the catpCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatpCodigo() {
        return catpCodigo;
    }

    /**
     * Sets the value of the catpCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatpCodigo(String value) {
        this.catpCodigo = value;
    }

    /**
     * Gets the value of the catpDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatpDescricao() {
        return catpDescricao;
    }

    /**
     * Sets the value of the catpDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatpDescricao(String value) {
        this.catpDescricao = value;
    }

    /**
     * Gets the value of the catpEstocado property.
     * 
     */
    public boolean isCatpEstocado() {
        return catpEstocado;
    }

    /**
     * Sets the value of the catpEstocado property.
     * 
     */
    public void setCatpEstocado(boolean value) {
        this.catpEstocado = value;
    }

    /**
     * Gets the value of the catpId property.
     * 
     */
    public int getCatpId() {
        return catpId;
    }

    /**
     * Sets the value of the catpId property.
     * 
     */
    public void setCatpId(int value) {
        this.catpId = value;
    }

    /**
     * Gets the value of the catpNumeroArtigos property.
     * 
     */
    public int getCatpNumeroArtigos() {
        return catpNumeroArtigos;
    }

    /**
     * Sets the value of the catpNumeroArtigos property.
     * 
     */
    public void setCatpNumeroArtigos(int value) {
        this.catpNumeroArtigos = value;
    }

    /**
     * Gets the value of the catpReferenciaArtigos property.
     * 
     */
    public int getCatpReferenciaArtigos() {
        return catpReferenciaArtigos;
    }

    /**
     * Sets the value of the catpReferenciaArtigos property.
     * 
     */
    public void setCatpReferenciaArtigos(int value) {
        this.catpReferenciaArtigos = value;
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
