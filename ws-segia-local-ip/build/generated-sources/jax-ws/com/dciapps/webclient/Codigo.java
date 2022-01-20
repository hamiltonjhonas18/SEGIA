
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codigo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codigo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "codigo", propOrder = {
    "codCodigo",
    "codDescricao",
    "codId",
    "encrypted",
    "entidade"
})
public class Codigo {

    @XmlElement(name = "cod_codigo")
    protected String codCodigo;
    @XmlElement(name = "cod_descricao")
    protected String codDescricao;
    @XmlElement(name = "cod_id")
    protected int codId;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the codCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCodigo() {
        return codCodigo;
    }

    /**
     * Sets the value of the codCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCodigo(String value) {
        this.codCodigo = value;
    }

    /**
     * Gets the value of the codDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDescricao() {
        return codDescricao;
    }

    /**
     * Sets the value of the codDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDescricao(String value) {
        this.codDescricao = value;
    }

    /**
     * Gets the value of the codId property.
     * 
     */
    public int getCodId() {
        return codId;
    }

    /**
     * Sets the value of the codId property.
     * 
     */
    public void setCodId(int value) {
        this.codId = value;
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
