
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fornecedor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fornecedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="for_contaGeral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="for_contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="for_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="for_endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="for_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="for_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="for_nuit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fornecedor", propOrder = {
    "encrypted",
    "entidade",
    "forContaGeral",
    "forContacto",
    "forEmail",
    "forEndereco",
    "forId",
    "forNome",
    "forNuit"
})
public class Fornecedor {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "for_contaGeral")
    protected String forContaGeral;
    @XmlElement(name = "for_contacto")
    protected String forContacto;
    @XmlElement(name = "for_email")
    protected String forEmail;
    @XmlElement(name = "for_endereco")
    protected String forEndereco;
    @XmlElement(name = "for_id")
    protected int forId;
    @XmlElement(name = "for_nome")
    protected String forNome;
    @XmlElement(name = "for_nuit")
    protected long forNuit;

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
     * Gets the value of the forContaGeral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForContaGeral() {
        return forContaGeral;
    }

    /**
     * Sets the value of the forContaGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForContaGeral(String value) {
        this.forContaGeral = value;
    }

    /**
     * Gets the value of the forContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForContacto() {
        return forContacto;
    }

    /**
     * Sets the value of the forContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForContacto(String value) {
        this.forContacto = value;
    }

    /**
     * Gets the value of the forEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForEmail() {
        return forEmail;
    }

    /**
     * Sets the value of the forEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForEmail(String value) {
        this.forEmail = value;
    }

    /**
     * Gets the value of the forEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForEndereco() {
        return forEndereco;
    }

    /**
     * Sets the value of the forEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForEndereco(String value) {
        this.forEndereco = value;
    }

    /**
     * Gets the value of the forId property.
     * 
     */
    public int getForId() {
        return forId;
    }

    /**
     * Sets the value of the forId property.
     * 
     */
    public void setForId(int value) {
        this.forId = value;
    }

    /**
     * Gets the value of the forNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForNome() {
        return forNome;
    }

    /**
     * Sets the value of the forNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForNome(String value) {
        this.forNome = value;
    }

    /**
     * Gets the value of the forNuit property.
     * 
     */
    public long getForNuit() {
        return forNuit;
    }

    /**
     * Sets the value of the forNuit property.
     * 
     */
    public void setForNuit(long value) {
        this.forNuit = value;
    }

}
