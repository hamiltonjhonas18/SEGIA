
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for departamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="departamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="administracao" type="{http://webservice.centralserver.co.mz/}administracao" minOccurs="0"/>
 *         &lt;element name="dep_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dep_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="nivelPrioridade" type="{http://webservice.centralserver.co.mz/}nivelPrioridade" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departamento", propOrder = {
    "administracao",
    "depId",
    "depNome",
    "encrypted",
    "entidade",
    "nivelPrioridade"
})
public class Departamento {

    protected Administracao administracao;
    @XmlElement(name = "dep_id")
    protected int depId;
    @XmlElement(name = "dep_nome")
    protected String depNome;
    protected boolean encrypted;
    protected Entidade entidade;
    protected NivelPrioridade nivelPrioridade;

    /**
     * Gets the value of the administracao property.
     * 
     * @return
     *     possible object is
     *     {@link Administracao }
     *     
     */
    public Administracao getAdministracao() {
        return administracao;
    }

    /**
     * Sets the value of the administracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Administracao }
     *     
     */
    public void setAdministracao(Administracao value) {
        this.administracao = value;
    }

    /**
     * Gets the value of the depId property.
     * 
     */
    public int getDepId() {
        return depId;
    }

    /**
     * Sets the value of the depId property.
     * 
     */
    public void setDepId(int value) {
        this.depId = value;
    }

    /**
     * Gets the value of the depNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepNome() {
        return depNome;
    }

    /**
     * Sets the value of the depNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepNome(String value) {
        this.depNome = value;
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
     * Gets the value of the nivelPrioridade property.
     * 
     * @return
     *     possible object is
     *     {@link NivelPrioridade }
     *     
     */
    public NivelPrioridade getNivelPrioridade() {
        return nivelPrioridade;
    }

    /**
     * Sets the value of the nivelPrioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelPrioridade }
     *     
     */
    public void setNivelPrioridade(NivelPrioridade value) {
        this.nivelPrioridade = value;
    }

}
