
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agenda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agenda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agen_diaSemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agen_hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agen_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="agen_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="turma" type="{http://webservice.centralserver.co.mz/}turma" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenda", propOrder = {
    "agenDiaSemana",
    "agenHora",
    "agenId",
    "agenSemestre",
    "anoLectivo",
    "disciplina",
    "encrypted",
    "entidade",
    "turma"
})
public class Agenda {

    @XmlElement(name = "agen_diaSemana")
    protected String agenDiaSemana;
    @XmlElement(name = "agen_hora")
    protected String agenHora;
    @XmlElement(name = "agen_id")
    protected int agenId;
    @XmlElement(name = "agen_semestre")
    protected String agenSemestre;
    protected AnoLectivo anoLectivo;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Turma turma;

    /**
     * Gets the value of the agenDiaSemana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenDiaSemana() {
        return agenDiaSemana;
    }

    /**
     * Sets the value of the agenDiaSemana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenDiaSemana(String value) {
        this.agenDiaSemana = value;
    }

    /**
     * Gets the value of the agenHora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenHora() {
        return agenHora;
    }

    /**
     * Sets the value of the agenHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenHora(String value) {
        this.agenHora = value;
    }

    /**
     * Gets the value of the agenId property.
     * 
     */
    public int getAgenId() {
        return agenId;
    }

    /**
     * Sets the value of the agenId property.
     * 
     */
    public void setAgenId(int value) {
        this.agenId = value;
    }

    /**
     * Gets the value of the agenSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenSemestre() {
        return agenSemestre;
    }

    /**
     * Sets the value of the agenSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenSemestre(String value) {
        this.agenSemestre = value;
    }

    /**
     * Gets the value of the anoLectivo property.
     * 
     * @return
     *     possible object is
     *     {@link AnoLectivo }
     *     
     */
    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    /**
     * Sets the value of the anoLectivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnoLectivo }
     *     
     */
    public void setAnoLectivo(AnoLectivo value) {
        this.anoLectivo = value;
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
     * Gets the value of the turma property.
     * 
     * @return
     *     possible object is
     *     {@link Turma }
     *     
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * Sets the value of the turma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Turma }
     *     
     */
    public void setTurma(Turma value) {
        this.turma = value;
    }

}
