
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for media complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="media">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="inscricao" type="{http://webservice.centralserver.co.mz/}inscricao" minOccurs="0"/>
 *         &lt;element name="med_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medi_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="medi_media" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="medi_media2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="medi_media3" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "media", propOrder = {
    "aluno",
    "anoLectivo",
    "disciplina",
    "encrypted",
    "entidade",
    "inscricao",
    "medSemestre",
    "mediId",
    "mediMedia",
    "mediMedia2",
    "mediMedia3",
    "turma"
})
public class Media {

    protected Aluno aluno;
    protected AnoLectivo anoLectivo;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Inscricao inscricao;
    @XmlElement(name = "med_semestre")
    protected String medSemestre;
    @XmlElement(name = "medi_id")
    protected int mediId;
    @XmlElement(name = "medi_media")
    protected float mediMedia;
    @XmlElement(name = "medi_media2")
    protected float mediMedia2;
    @XmlElement(name = "medi_media3")
    protected float mediMedia3;
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
     * Gets the value of the inscricao property.
     * 
     * @return
     *     possible object is
     *     {@link Inscricao }
     *     
     */
    public Inscricao getInscricao() {
        return inscricao;
    }

    /**
     * Sets the value of the inscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inscricao }
     *     
     */
    public void setInscricao(Inscricao value) {
        this.inscricao = value;
    }

    /**
     * Gets the value of the medSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedSemestre() {
        return medSemestre;
    }

    /**
     * Sets the value of the medSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedSemestre(String value) {
        this.medSemestre = value;
    }

    /**
     * Gets the value of the mediId property.
     * 
     */
    public int getMediId() {
        return mediId;
    }

    /**
     * Sets the value of the mediId property.
     * 
     */
    public void setMediId(int value) {
        this.mediId = value;
    }

    /**
     * Gets the value of the mediMedia property.
     * 
     */
    public float getMediMedia() {
        return mediMedia;
    }

    /**
     * Sets the value of the mediMedia property.
     * 
     */
    public void setMediMedia(float value) {
        this.mediMedia = value;
    }

    /**
     * Gets the value of the mediMedia2 property.
     * 
     */
    public float getMediMedia2() {
        return mediMedia2;
    }

    /**
     * Sets the value of the mediMedia2 property.
     * 
     */
    public void setMediMedia2(float value) {
        this.mediMedia2 = value;
    }

    /**
     * Gets the value of the mediMedia3 property.
     * 
     */
    public float getMediMedia3() {
        return mediMedia3;
    }

    /**
     * Sets the value of the mediMedia3 property.
     * 
     */
    public void setMediMedia3(float value) {
        this.mediMedia3 = value;
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
