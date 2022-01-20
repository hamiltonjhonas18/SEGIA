
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disciplina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disciplina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disc_cargaHoraria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disc_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disc_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disc_grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disc_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "disciplina", propOrder = {
    "discCargaHoraria",
    "discCodigo",
    "discDescricao",
    "discGrupo",
    "discId",
    "discSemestre",
    "encrypted",
    "entidade"
})
public class Disciplina {

    @XmlElement(name = "disc_cargaHoraria")
    protected int discCargaHoraria;
    @XmlElement(name = "disc_codigo")
    protected String discCodigo;
    @XmlElement(name = "disc_descricao")
    protected String discDescricao;
    @XmlElement(name = "disc_grupo")
    protected String discGrupo;
    @XmlElement(name = "disc_id")
    protected int discId;
    @XmlElement(name = "disc_semestre")
    protected String discSemestre;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the discCargaHoraria property.
     * 
     */
    public int getDiscCargaHoraria() {
        return discCargaHoraria;
    }

    /**
     * Sets the value of the discCargaHoraria property.
     * 
     */
    public void setDiscCargaHoraria(int value) {
        this.discCargaHoraria = value;
    }

    /**
     * Gets the value of the discCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscCodigo() {
        return discCodigo;
    }

    /**
     * Sets the value of the discCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscCodigo(String value) {
        this.discCodigo = value;
    }

    /**
     * Gets the value of the discDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscDescricao() {
        return discDescricao;
    }

    /**
     * Sets the value of the discDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscDescricao(String value) {
        this.discDescricao = value;
    }

    /**
     * Gets the value of the discGrupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscGrupo() {
        return discGrupo;
    }

    /**
     * Sets the value of the discGrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscGrupo(String value) {
        this.discGrupo = value;
    }

    /**
     * Gets the value of the discId property.
     * 
     */
    public int getDiscId() {
        return discId;
    }

    /**
     * Sets the value of the discId property.
     * 
     */
    public void setDiscId(int value) {
        this.discId = value;
    }

    /**
     * Gets the value of the discSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscSemestre() {
        return discSemestre;
    }

    /**
     * Sets the value of the discSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscSemestre(String value) {
        this.discSemestre = value;
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
