
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for presencas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="presencas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pres_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pres_faltas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pres_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "presencas", propOrder = {
    "aluno",
    "disciplina",
    "encrypted",
    "entidade",
    "presData",
    "presFaltas",
    "presId",
    "turma"
})
public class Presencas {

    protected Aluno aluno;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "pres_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar presData;
    @XmlElement(name = "pres_faltas")
    protected int presFaltas;
    @XmlElement(name = "pres_id")
    protected int presId;
    protected Turma turma;

    /**
     * Gets the value of the aluno property.
     * 
     * @return
     *     possible object is
     *     {@link Aluno }
     *     
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * Sets the value of the aluno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aluno }
     *     
     */
    public void setAluno(Aluno value) {
        this.aluno = value;
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
     * Gets the value of the presData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPresData() {
        return presData;
    }

    /**
     * Sets the value of the presData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPresData(XMLGregorianCalendar value) {
        this.presData = value;
    }

    /**
     * Gets the value of the presFaltas property.
     * 
     */
    public int getPresFaltas() {
        return presFaltas;
    }

    /**
     * Sets the value of the presFaltas property.
     * 
     */
    public void setPresFaltas(int value) {
        this.presFaltas = value;
    }

    /**
     * Gets the value of the presId property.
     * 
     */
    public int getPresId() {
        return presId;
    }

    /**
     * Sets the value of the presId property.
     * 
     */
    public void setPresId(int value) {
        this.presId = value;
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
