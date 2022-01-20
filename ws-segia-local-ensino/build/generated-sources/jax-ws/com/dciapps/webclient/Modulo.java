
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="modu_credito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="modu_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modu_durcao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modu_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modu_preco" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modulo", propOrder = {
    "curso",
    "encrypted",
    "entidade",
    "moduCredito",
    "moduDescricao",
    "moduDurcao",
    "moduId",
    "moduPreco"
})
public class Modulo {

    protected Curso curso;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "modu_credito")
    protected double moduCredito;
    @XmlElement(name = "modu_descricao")
    protected String moduDescricao;
    @XmlElement(name = "modu_durcao")
    protected int moduDurcao;
    @XmlElement(name = "modu_id")
    protected int moduId;
    @XmlElement(name = "modu_preco")
    protected double moduPreco;

    /**
     * Gets the value of the curso property.
     * 
     * @return
     *     possible object is
     *     {@link Curso }
     *     
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Sets the value of the curso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Curso }
     *     
     */
    public void setCurso(Curso value) {
        this.curso = value;
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
     * Gets the value of the moduCredito property.
     * 
     */
    public double getModuCredito() {
        return moduCredito;
    }

    /**
     * Sets the value of the moduCredito property.
     * 
     */
    public void setModuCredito(double value) {
        this.moduCredito = value;
    }

    /**
     * Gets the value of the moduDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuDescricao() {
        return moduDescricao;
    }

    /**
     * Sets the value of the moduDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuDescricao(String value) {
        this.moduDescricao = value;
    }

    /**
     * Gets the value of the moduDurcao property.
     * 
     */
    public int getModuDurcao() {
        return moduDurcao;
    }

    /**
     * Sets the value of the moduDurcao property.
     * 
     */
    public void setModuDurcao(int value) {
        this.moduDurcao = value;
    }

    /**
     * Gets the value of the moduId property.
     * 
     */
    public int getModuId() {
        return moduId;
    }

    /**
     * Sets the value of the moduId property.
     * 
     */
    public void setModuId(int value) {
        this.moduId = value;
    }

    /**
     * Gets the value of the moduPreco property.
     * 
     */
    public double getModuPreco() {
        return moduPreco;
    }

    /**
     * Sets the value of the moduPreco property.
     * 
     */
    public void setModuPreco(double value) {
        this.moduPreco = value;
    }

}
