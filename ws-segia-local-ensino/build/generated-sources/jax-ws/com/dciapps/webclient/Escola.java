
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for escola complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="escola">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_escola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esc_alunos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_alunos_homens" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_alunos_mulheres" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_alunos_necessitados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esc_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esc_distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esc_docentes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esc_faixa_05" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_faixa_1115" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_faixa_1625" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_faixa_2635" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_faixa_35" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_faixa_610" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_membros_homens" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_membros_mulheres" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esc_salas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="esc_saldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="esc_turmas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escola", propOrder = {
    "codEscola",
    "escAlunos",
    "escAlunosHomens",
    "escAlunosMulheres",
    "escAlunosNecessitados",
    "escContacto",
    "escDescricao",
    "escDistrito",
    "escDocentes",
    "escEndereco",
    "escFaixa05",
    "escFaixa1115",
    "escFaixa1625",
    "escFaixa2635",
    "escFaixa35",
    "escFaixa610",
    "escId",
    "escMembrosHomens",
    "escMembrosMulheres",
    "escProvincia",
    "escSalas",
    "escSaldo",
    "escTurmas"
})
public class Escola {

    @XmlElement(name = "cod_escola")
    protected String codEscola;
    @XmlElement(name = "esc_alunos")
    protected int escAlunos;
    @XmlElement(name = "esc_alunos_homens")
    protected int escAlunosHomens;
    @XmlElement(name = "esc_alunos_mulheres")
    protected int escAlunosMulheres;
    @XmlElement(name = "esc_alunos_necessitados")
    protected int escAlunosNecessitados;
    @XmlElement(name = "esc_contacto")
    protected String escContacto;
    @XmlElement(name = "esc_descricao")
    protected String escDescricao;
    @XmlElement(name = "esc_distrito")
    protected String escDistrito;
    @XmlElement(name = "esc_docentes")
    protected int escDocentes;
    @XmlElement(name = "esc_endereco")
    protected String escEndereco;
    @XmlElement(name = "esc_faixa_05")
    protected int escFaixa05;
    @XmlElement(name = "esc_faixa_1115")
    protected int escFaixa1115;
    @XmlElement(name = "esc_faixa_1625")
    protected int escFaixa1625;
    @XmlElement(name = "esc_faixa_2635")
    protected int escFaixa2635;
    @XmlElement(name = "esc_faixa_35")
    protected int escFaixa35;
    @XmlElement(name = "esc_faixa_610")
    protected int escFaixa610;
    @XmlElement(name = "esc_id")
    protected int escId;
    @XmlElement(name = "esc_membros_homens")
    protected int escMembrosHomens;
    @XmlElement(name = "esc_membros_mulheres")
    protected int escMembrosMulheres;
    @XmlElement(name = "esc_provincia")
    protected String escProvincia;
    @XmlElement(name = "esc_salas")
    protected int escSalas;
    @XmlElement(name = "esc_saldo")
    protected double escSaldo;
    @XmlElement(name = "esc_turmas")
    protected int escTurmas;

    /**
     * Gets the value of the codEscola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEscola() {
        return codEscola;
    }

    /**
     * Sets the value of the codEscola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEscola(String value) {
        this.codEscola = value;
    }

    /**
     * Gets the value of the escAlunos property.
     * 
     */
    public int getEscAlunos() {
        return escAlunos;
    }

    /**
     * Sets the value of the escAlunos property.
     * 
     */
    public void setEscAlunos(int value) {
        this.escAlunos = value;
    }

    /**
     * Gets the value of the escAlunosHomens property.
     * 
     */
    public int getEscAlunosHomens() {
        return escAlunosHomens;
    }

    /**
     * Sets the value of the escAlunosHomens property.
     * 
     */
    public void setEscAlunosHomens(int value) {
        this.escAlunosHomens = value;
    }

    /**
     * Gets the value of the escAlunosMulheres property.
     * 
     */
    public int getEscAlunosMulheres() {
        return escAlunosMulheres;
    }

    /**
     * Sets the value of the escAlunosMulheres property.
     * 
     */
    public void setEscAlunosMulheres(int value) {
        this.escAlunosMulheres = value;
    }

    /**
     * Gets the value of the escAlunosNecessitados property.
     * 
     */
    public int getEscAlunosNecessitados() {
        return escAlunosNecessitados;
    }

    /**
     * Sets the value of the escAlunosNecessitados property.
     * 
     */
    public void setEscAlunosNecessitados(int value) {
        this.escAlunosNecessitados = value;
    }

    /**
     * Gets the value of the escContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscContacto() {
        return escContacto;
    }

    /**
     * Sets the value of the escContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscContacto(String value) {
        this.escContacto = value;
    }

    /**
     * Gets the value of the escDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscDescricao() {
        return escDescricao;
    }

    /**
     * Sets the value of the escDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscDescricao(String value) {
        this.escDescricao = value;
    }

    /**
     * Gets the value of the escDistrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscDistrito() {
        return escDistrito;
    }

    /**
     * Sets the value of the escDistrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscDistrito(String value) {
        this.escDistrito = value;
    }

    /**
     * Gets the value of the escDocentes property.
     * 
     */
    public int getEscDocentes() {
        return escDocentes;
    }

    /**
     * Sets the value of the escDocentes property.
     * 
     */
    public void setEscDocentes(int value) {
        this.escDocentes = value;
    }

    /**
     * Gets the value of the escEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscEndereco() {
        return escEndereco;
    }

    /**
     * Sets the value of the escEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscEndereco(String value) {
        this.escEndereco = value;
    }

    /**
     * Gets the value of the escFaixa05 property.
     * 
     */
    public int getEscFaixa05() {
        return escFaixa05;
    }

    /**
     * Sets the value of the escFaixa05 property.
     * 
     */
    public void setEscFaixa05(int value) {
        this.escFaixa05 = value;
    }

    /**
     * Gets the value of the escFaixa1115 property.
     * 
     */
    public int getEscFaixa1115() {
        return escFaixa1115;
    }

    /**
     * Sets the value of the escFaixa1115 property.
     * 
     */
    public void setEscFaixa1115(int value) {
        this.escFaixa1115 = value;
    }

    /**
     * Gets the value of the escFaixa1625 property.
     * 
     */
    public int getEscFaixa1625() {
        return escFaixa1625;
    }

    /**
     * Sets the value of the escFaixa1625 property.
     * 
     */
    public void setEscFaixa1625(int value) {
        this.escFaixa1625 = value;
    }

    /**
     * Gets the value of the escFaixa2635 property.
     * 
     */
    public int getEscFaixa2635() {
        return escFaixa2635;
    }

    /**
     * Sets the value of the escFaixa2635 property.
     * 
     */
    public void setEscFaixa2635(int value) {
        this.escFaixa2635 = value;
    }

    /**
     * Gets the value of the escFaixa35 property.
     * 
     */
    public int getEscFaixa35() {
        return escFaixa35;
    }

    /**
     * Sets the value of the escFaixa35 property.
     * 
     */
    public void setEscFaixa35(int value) {
        this.escFaixa35 = value;
    }

    /**
     * Gets the value of the escFaixa610 property.
     * 
     */
    public int getEscFaixa610() {
        return escFaixa610;
    }

    /**
     * Sets the value of the escFaixa610 property.
     * 
     */
    public void setEscFaixa610(int value) {
        this.escFaixa610 = value;
    }

    /**
     * Gets the value of the escId property.
     * 
     */
    public int getEscId() {
        return escId;
    }

    /**
     * Sets the value of the escId property.
     * 
     */
    public void setEscId(int value) {
        this.escId = value;
    }

    /**
     * Gets the value of the escMembrosHomens property.
     * 
     */
    public int getEscMembrosHomens() {
        return escMembrosHomens;
    }

    /**
     * Sets the value of the escMembrosHomens property.
     * 
     */
    public void setEscMembrosHomens(int value) {
        this.escMembrosHomens = value;
    }

    /**
     * Gets the value of the escMembrosMulheres property.
     * 
     */
    public int getEscMembrosMulheres() {
        return escMembrosMulheres;
    }

    /**
     * Sets the value of the escMembrosMulheres property.
     * 
     */
    public void setEscMembrosMulheres(int value) {
        this.escMembrosMulheres = value;
    }

    /**
     * Gets the value of the escProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscProvincia() {
        return escProvincia;
    }

    /**
     * Sets the value of the escProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscProvincia(String value) {
        this.escProvincia = value;
    }

    /**
     * Gets the value of the escSalas property.
     * 
     */
    public int getEscSalas() {
        return escSalas;
    }

    /**
     * Sets the value of the escSalas property.
     * 
     */
    public void setEscSalas(int value) {
        this.escSalas = value;
    }

    /**
     * Gets the value of the escSaldo property.
     * 
     */
    public double getEscSaldo() {
        return escSaldo;
    }

    /**
     * Sets the value of the escSaldo property.
     * 
     */
    public void setEscSaldo(double value) {
        this.escSaldo = value;
    }

    /**
     * Gets the value of the escTurmas property.
     * 
     */
    public int getEscTurmas() {
        return escTurmas;
    }

    /**
     * Sets the value of the escTurmas property.
     * 
     */
    public void setEscTurmas(int value) {
        this.escTurmas = value;
    }

}
