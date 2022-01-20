
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="inscricao" type="{http://webservice.centralserver.co.mz/}inscricao" minOccurs="0"/>
 *         &lt;element name="isAcp2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isTeste3" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isTeste4" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nota_acp" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_acp2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_avaliacaoContinua" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nota_media" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota_teste1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_teste2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_teste3" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_teste4" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="nota_trabPratico" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "notas", propOrder = {
    "aluno",
    "anoLectivo",
    "disciplina",
    "encrypted",
    "entidade",
    "inscricao",
    "isAcp2",
    "isTeste3",
    "isTeste4",
    "notaAcp",
    "notaAcp2",
    "notaAvaliacaoContinua",
    "notaId",
    "notaMedia",
    "notaSemestre",
    "notaTeste1",
    "notaTeste2",
    "notaTeste3",
    "notaTeste4",
    "notaTrabPratico",
    "turma"
})
public class Notas {

    protected Aluno aluno;
    protected AnoLectivo anoLectivo;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Inscricao inscricao;
    protected boolean isAcp2;
    protected boolean isTeste3;
    protected boolean isTeste4;
    @XmlElement(name = "nota_acp")
    protected float notaAcp;
    @XmlElement(name = "nota_acp2")
    protected float notaAcp2;
    @XmlElement(name = "nota_avaliacaoContinua")
    protected float notaAvaliacaoContinua;
    @XmlElement(name = "nota_id")
    protected int notaId;
    @XmlElement(name = "nota_media")
    protected float notaMedia;
    @XmlElement(name = "nota_semestre")
    protected String notaSemestre;
    @XmlElement(name = "nota_teste1")
    protected float notaTeste1;
    @XmlElement(name = "nota_teste2")
    protected float notaTeste2;
    @XmlElement(name = "nota_teste3")
    protected float notaTeste3;
    @XmlElement(name = "nota_teste4")
    protected float notaTeste4;
    @XmlElement(name = "nota_trabPratico")
    protected float notaTrabPratico;
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
     * Gets the value of the isAcp2 property.
     * 
     */
    public boolean isIsAcp2() {
        return isAcp2;
    }

    /**
     * Sets the value of the isAcp2 property.
     * 
     */
    public void setIsAcp2(boolean value) {
        this.isAcp2 = value;
    }

    /**
     * Gets the value of the isTeste3 property.
     * 
     */
    public boolean isIsTeste3() {
        return isTeste3;
    }

    /**
     * Sets the value of the isTeste3 property.
     * 
     */
    public void setIsTeste3(boolean value) {
        this.isTeste3 = value;
    }

    /**
     * Gets the value of the isTeste4 property.
     * 
     */
    public boolean isIsTeste4() {
        return isTeste4;
    }

    /**
     * Sets the value of the isTeste4 property.
     * 
     */
    public void setIsTeste4(boolean value) {
        this.isTeste4 = value;
    }

    /**
     * Gets the value of the notaAcp property.
     * 
     */
    public float getNotaAcp() {
        return notaAcp;
    }

    /**
     * Sets the value of the notaAcp property.
     * 
     */
    public void setNotaAcp(float value) {
        this.notaAcp = value;
    }

    /**
     * Gets the value of the notaAcp2 property.
     * 
     */
    public float getNotaAcp2() {
        return notaAcp2;
    }

    /**
     * Sets the value of the notaAcp2 property.
     * 
     */
    public void setNotaAcp2(float value) {
        this.notaAcp2 = value;
    }

    /**
     * Gets the value of the notaAvaliacaoContinua property.
     * 
     */
    public float getNotaAvaliacaoContinua() {
        return notaAvaliacaoContinua;
    }

    /**
     * Sets the value of the notaAvaliacaoContinua property.
     * 
     */
    public void setNotaAvaliacaoContinua(float value) {
        this.notaAvaliacaoContinua = value;
    }

    /**
     * Gets the value of the notaId property.
     * 
     */
    public int getNotaId() {
        return notaId;
    }

    /**
     * Sets the value of the notaId property.
     * 
     */
    public void setNotaId(int value) {
        this.notaId = value;
    }

    /**
     * Gets the value of the notaMedia property.
     * 
     */
    public float getNotaMedia() {
        return notaMedia;
    }

    /**
     * Sets the value of the notaMedia property.
     * 
     */
    public void setNotaMedia(float value) {
        this.notaMedia = value;
    }

    /**
     * Gets the value of the notaSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaSemestre() {
        return notaSemestre;
    }

    /**
     * Sets the value of the notaSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaSemestre(String value) {
        this.notaSemestre = value;
    }

    /**
     * Gets the value of the notaTeste1 property.
     * 
     */
    public float getNotaTeste1() {
        return notaTeste1;
    }

    /**
     * Sets the value of the notaTeste1 property.
     * 
     */
    public void setNotaTeste1(float value) {
        this.notaTeste1 = value;
    }

    /**
     * Gets the value of the notaTeste2 property.
     * 
     */
    public float getNotaTeste2() {
        return notaTeste2;
    }

    /**
     * Sets the value of the notaTeste2 property.
     * 
     */
    public void setNotaTeste2(float value) {
        this.notaTeste2 = value;
    }

    /**
     * Gets the value of the notaTeste3 property.
     * 
     */
    public float getNotaTeste3() {
        return notaTeste3;
    }

    /**
     * Sets the value of the notaTeste3 property.
     * 
     */
    public void setNotaTeste3(float value) {
        this.notaTeste3 = value;
    }

    /**
     * Gets the value of the notaTeste4 property.
     * 
     */
    public float getNotaTeste4() {
        return notaTeste4;
    }

    /**
     * Sets the value of the notaTeste4 property.
     * 
     */
    public void setNotaTeste4(float value) {
        this.notaTeste4 = value;
    }

    /**
     * Gets the value of the notaTrabPratico property.
     * 
     */
    public float getNotaTrabPratico() {
        return notaTrabPratico;
    }

    /**
     * Sets the value of the notaTrabPratico property.
     * 
     */
    public void setNotaTrabPratico(float value) {
        this.notaTrabPratico = value;
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
