
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="tema_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tema_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tema_pratica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tema_teorica" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tema", propOrder = {
    "curso",
    "disciplina",
    "encrypted",
    "entidade",
    "escola",
    "temaDescricao",
    "temaId",
    "temaPratica",
    "temaTeorica"
})
public class Tema {

    protected Curso curso;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Escola escola;
    @XmlElement(name = "tema_descricao")
    protected String temaDescricao;
    @XmlElement(name = "tema_id")
    protected int temaId;
    @XmlElement(name = "tema_pratica")
    protected int temaPratica;
    @XmlElement(name = "tema_teorica")
    protected int temaTeorica;

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
     * Gets the value of the disciplina property.
     * 
     * @return
     *     possible object is
     *     {@link Disciplina }
     *     
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    /**
     * Sets the value of the disciplina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disciplina }
     *     
     */
    public void setDisciplina(Disciplina value) {
        this.disciplina = value;
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
     * Gets the value of the escola property.
     * 
     * @return
     *     possible object is
     *     {@link Escola }
     *     
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * Sets the value of the escola property.
     * 
     * @param value
     *     allowed object is
     *     {@link Escola }
     *     
     */
    public void setEscola(Escola value) {
        this.escola = value;
    }

    /**
     * Gets the value of the temaDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemaDescricao() {
        return temaDescricao;
    }

    /**
     * Sets the value of the temaDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemaDescricao(String value) {
        this.temaDescricao = value;
    }

    /**
     * Gets the value of the temaId property.
     * 
     */
    public int getTemaId() {
        return temaId;
    }

    /**
     * Sets the value of the temaId property.
     * 
     */
    public void setTemaId(int value) {
        this.temaId = value;
    }

    /**
     * Gets the value of the temaPratica property.
     * 
     */
    public int getTemaPratica() {
        return temaPratica;
    }

    /**
     * Sets the value of the temaPratica property.
     * 
     */
    public void setTemaPratica(int value) {
        this.temaPratica = value;
    }

    /**
     * Gets the value of the temaTeorica property.
     * 
     */
    public int getTemaTeorica() {
        return temaTeorica;
    }

    /**
     * Sets the value of the temaTeorica property.
     * 
     */
    public void setTemaTeorica(int value) {
        this.temaTeorica = value;
    }

}
