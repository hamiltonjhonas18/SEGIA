
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscaAgendaTodosCriterios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscaAgendaTodosCriterios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="diaSemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turma" type="{http://webservice.centralserver.co.mz/}turma" minOccurs="0"/>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaAgendaTodosCriterios", propOrder = {
    "entidade",
    "diaSemana",
    "horario",
    "semestre",
    "turma",
    "anoLectivo",
    "disciplina"
})
public class BuscaAgendaTodosCriterios {

    protected Entidade entidade;
    protected String diaSemana;
    protected String horario;
    protected String semestre;
    protected Turma turma;
    protected AnoLectivo anoLectivo;
    protected Disciplina disciplina;

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
     * Gets the value of the diaSemana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * Sets the value of the diaSemana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaSemana(String value) {
        this.diaSemana = value;
    }

    /**
     * Gets the value of the horario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Sets the value of the horario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorario(String value) {
        this.horario = value;
    }

    /**
     * Gets the value of the semestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Sets the value of the semestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemestre(String value) {
        this.semestre = value;
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

}
