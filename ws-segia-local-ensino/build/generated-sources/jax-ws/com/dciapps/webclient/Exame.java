
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="exam_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exam_media" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="exam_naRecorrencia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exam_nota" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="exam_notaFinal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="exam_presenca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exam_recorrencia" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="exam_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inscricao" type="{http://webservice.centralserver.co.mz/}inscricao" minOccurs="0"/>
 *         &lt;element name="salaExame" type="{http://webservice.centralserver.co.mz/}salaExame" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exame", propOrder = {
    "aluno",
    "anoLectivo",
    "disciplina",
    "encrypted",
    "entidade",
    "examId",
    "examMedia",
    "examNaRecorrencia",
    "examNota",
    "examNotaFinal",
    "examPresenca",
    "examRecorrencia",
    "examSemestre",
    "inscricao",
    "salaExame"
})
public class Exame {

    protected Aluno aluno;
    protected AnoLectivo anoLectivo;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "exam_id")
    protected int examId;
    @XmlElement(name = "exam_media")
    protected float examMedia;
    @XmlElement(name = "exam_naRecorrencia")
    protected boolean examNaRecorrencia;
    @XmlElement(name = "exam_nota")
    protected float examNota;
    @XmlElement(name = "exam_notaFinal")
    protected float examNotaFinal;
    @XmlElement(name = "exam_presenca")
    protected boolean examPresenca;
    @XmlElement(name = "exam_recorrencia")
    protected float examRecorrencia;
    @XmlElement(name = "exam_semestre")
    protected String examSemestre;
    protected Inscricao inscricao;
    protected SalaExame salaExame;

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
     * Gets the value of the examId property.
     * 
     */
    public int getExamId() {
        return examId;
    }

    /**
     * Sets the value of the examId property.
     * 
     */
    public void setExamId(int value) {
        this.examId = value;
    }

    /**
     * Gets the value of the examMedia property.
     * 
     */
    public float getExamMedia() {
        return examMedia;
    }

    /**
     * Sets the value of the examMedia property.
     * 
     */
    public void setExamMedia(float value) {
        this.examMedia = value;
    }

    /**
     * Gets the value of the examNaRecorrencia property.
     * 
     */
    public boolean isExamNaRecorrencia() {
        return examNaRecorrencia;
    }

    /**
     * Sets the value of the examNaRecorrencia property.
     * 
     */
    public void setExamNaRecorrencia(boolean value) {
        this.examNaRecorrencia = value;
    }

    /**
     * Gets the value of the examNota property.
     * 
     */
    public float getExamNota() {
        return examNota;
    }

    /**
     * Sets the value of the examNota property.
     * 
     */
    public void setExamNota(float value) {
        this.examNota = value;
    }

    /**
     * Gets the value of the examNotaFinal property.
     * 
     */
    public float getExamNotaFinal() {
        return examNotaFinal;
    }

    /**
     * Sets the value of the examNotaFinal property.
     * 
     */
    public void setExamNotaFinal(float value) {
        this.examNotaFinal = value;
    }

    /**
     * Gets the value of the examPresenca property.
     * 
     */
    public boolean isExamPresenca() {
        return examPresenca;
    }

    /**
     * Sets the value of the examPresenca property.
     * 
     */
    public void setExamPresenca(boolean value) {
        this.examPresenca = value;
    }

    /**
     * Gets the value of the examRecorrencia property.
     * 
     */
    public float getExamRecorrencia() {
        return examRecorrencia;
    }

    /**
     * Sets the value of the examRecorrencia property.
     * 
     */
    public void setExamRecorrencia(float value) {
        this.examRecorrencia = value;
    }

    /**
     * Gets the value of the examSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExamSemestre() {
        return examSemestre;
    }

    /**
     * Sets the value of the examSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExamSemestre(String value) {
        this.examSemestre = value;
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
     * Gets the value of the salaExame property.
     * 
     * @return
     *     possible object is
     *     {@link SalaExame }
     *     
     */
    public SalaExame getSalaExame() {
        return salaExame;
    }

    /**
     * Sets the value of the salaExame property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaExame }
     *     
     */
    public void setSalaExame(SalaExame value) {
        this.salaExame = value;
    }

}
