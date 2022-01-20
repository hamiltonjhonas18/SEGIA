
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for caixa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caixa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caix_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caix_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departamento" type="{http://webservice.centralserver.co.mz/}departamento" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
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
@XmlType(name = "caixa", propOrder = {
    "caixDescricao",
    "caixId",
    "departamento",
    "encrypted",
    "entidade",
    "usuario"
})
public class Caixa {

    @XmlElement(name = "caix_descricao")
    protected String caixDescricao;
    @XmlElement(name = "caix_id")
    protected int caixId;
    protected Departamento departamento;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Usuario usuario;

    /**
     * Gets the value of the caixDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaixDescricao() {
        return caixDescricao;
    }

    /**
     * Sets the value of the caixDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaixDescricao(String value) {
        this.caixDescricao = value;
    }

    /**
     * Gets the value of the caixId property.
     * 
     */
    public int getCaixId() {
        return caixId;
    }

    /**
     * Sets the value of the caixId property.
     * 
     */
    public void setCaixId(int value) {
        this.caixId = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDepartamento(Departamento value) {
        this.departamento = value;
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
