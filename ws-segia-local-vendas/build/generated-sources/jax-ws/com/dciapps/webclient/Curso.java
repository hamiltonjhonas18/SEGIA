
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for curso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="curso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaFormacao" type="{http://webservice.centralserver.co.mz/}areaFormacao" minOccurs="0"/>
 *         &lt;element name="curs_aprovacoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curs_cod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curs_custoInscricao" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="curs_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curs_duracao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curs_exame" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="curs_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curs_inscritos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curs_numPrestacoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curs_numTurmas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curs_preco" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="curs_reprovacoes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curs_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "curso", propOrder = {
    "areaFormacao",
    "cursAprovacoes",
    "cursCod",
    "cursCustoInscricao",
    "cursDescricao",
    "cursDuracao",
    "cursExame",
    "cursId",
    "cursInscritos",
    "cursNumPrestacoes",
    "cursNumTurmas",
    "cursPreco",
    "cursReprovacoes",
    "cursTipo",
    "encrypted",
    "entidade"
})
public class Curso {

    protected AreaFormacao areaFormacao;
    @XmlElement(name = "curs_aprovacoes")
    protected int cursAprovacoes;
    @XmlElement(name = "curs_cod")
    protected String cursCod;
    @XmlElement(name = "curs_custoInscricao")
    protected double cursCustoInscricao;
    @XmlElement(name = "curs_descricao")
    protected String cursDescricao;
    @XmlElement(name = "curs_duracao")
    protected int cursDuracao;
    @XmlElement(name = "curs_exame")
    protected boolean cursExame;
    @XmlElement(name = "curs_id")
    protected int cursId;
    @XmlElement(name = "curs_inscritos")
    protected int cursInscritos;
    @XmlElement(name = "curs_numPrestacoes")
    protected int cursNumPrestacoes;
    @XmlElement(name = "curs_numTurmas")
    protected int cursNumTurmas;
    @XmlElement(name = "curs_preco")
    protected double cursPreco;
    @XmlElement(name = "curs_reprovacoes")
    protected int cursReprovacoes;
    @XmlElement(name = "curs_tipo")
    protected String cursTipo;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the areaFormacao property.
     * 
     * @return
     *     possible object is
     *     {@link AreaFormacao }
     *     
     */
    public AreaFormacao getAreaFormacao() {
        return areaFormacao;
    }

    /**
     * Sets the value of the areaFormacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaFormacao }
     *     
     */
    public void setAreaFormacao(AreaFormacao value) {
        this.areaFormacao = value;
    }

    /**
     * Gets the value of the cursAprovacoes property.
     * 
     */
    public int getCursAprovacoes() {
        return cursAprovacoes;
    }

    /**
     * Sets the value of the cursAprovacoes property.
     * 
     */
    public void setCursAprovacoes(int value) {
        this.cursAprovacoes = value;
    }

    /**
     * Gets the value of the cursCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursCod() {
        return cursCod;
    }

    /**
     * Sets the value of the cursCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursCod(String value) {
        this.cursCod = value;
    }

    /**
     * Gets the value of the cursCustoInscricao property.
     * 
     */
    public double getCursCustoInscricao() {
        return cursCustoInscricao;
    }

    /**
     * Sets the value of the cursCustoInscricao property.
     * 
     */
    public void setCursCustoInscricao(double value) {
        this.cursCustoInscricao = value;
    }

    /**
     * Gets the value of the cursDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursDescricao() {
        return cursDescricao;
    }

    /**
     * Sets the value of the cursDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursDescricao(String value) {
        this.cursDescricao = value;
    }

    /**
     * Gets the value of the cursDuracao property.
     * 
     */
    public int getCursDuracao() {
        return cursDuracao;
    }

    /**
     * Sets the value of the cursDuracao property.
     * 
     */
    public void setCursDuracao(int value) {
        this.cursDuracao = value;
    }

    /**
     * Gets the value of the cursExame property.
     * 
     */
    public boolean isCursExame() {
        return cursExame;
    }

    /**
     * Sets the value of the cursExame property.
     * 
     */
    public void setCursExame(boolean value) {
        this.cursExame = value;
    }

    /**
     * Gets the value of the cursId property.
     * 
     */
    public int getCursId() {
        return cursId;
    }

    /**
     * Sets the value of the cursId property.
     * 
     */
    public void setCursId(int value) {
        this.cursId = value;
    }

    /**
     * Gets the value of the cursInscritos property.
     * 
     */
    public int getCursInscritos() {
        return cursInscritos;
    }

    /**
     * Sets the value of the cursInscritos property.
     * 
     */
    public void setCursInscritos(int value) {
        this.cursInscritos = value;
    }

    /**
     * Gets the value of the cursNumPrestacoes property.
     * 
     */
    public int getCursNumPrestacoes() {
        return cursNumPrestacoes;
    }

    /**
     * Sets the value of the cursNumPrestacoes property.
     * 
     */
    public void setCursNumPrestacoes(int value) {
        this.cursNumPrestacoes = value;
    }

    /**
     * Gets the value of the cursNumTurmas property.
     * 
     */
    public int getCursNumTurmas() {
        return cursNumTurmas;
    }

    /**
     * Sets the value of the cursNumTurmas property.
     * 
     */
    public void setCursNumTurmas(int value) {
        this.cursNumTurmas = value;
    }

    /**
     * Gets the value of the cursPreco property.
     * 
     */
    public double getCursPreco() {
        return cursPreco;
    }

    /**
     * Sets the value of the cursPreco property.
     * 
     */
    public void setCursPreco(double value) {
        this.cursPreco = value;
    }

    /**
     * Gets the value of the cursReprovacoes property.
     * 
     */
    public int getCursReprovacoes() {
        return cursReprovacoes;
    }

    /**
     * Sets the value of the cursReprovacoes property.
     * 
     */
    public void setCursReprovacoes(int value) {
        this.cursReprovacoes = value;
    }

    /**
     * Gets the value of the cursTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursTipo() {
        return cursTipo;
    }

    /**
     * Sets the value of the cursTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursTipo(String value) {
        this.cursTipo = value;
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
