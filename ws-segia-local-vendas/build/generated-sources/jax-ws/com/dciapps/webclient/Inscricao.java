
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for inscricao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inscricao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="insc_activa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insc_anoLectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_certificado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insc_comp1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_comp2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_comp3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_comp4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_condicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_copiaBI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insc_dataInscricao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="insc_dataProximoPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="insc_dataUltimoPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="insc_faltas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insc_faltasJustificadas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insc_fotos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insc_notaFinal" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="insc_nrTransfercia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_ppf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insc_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_regular" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insc_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insc_turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turma" type="{http://webservice.centralserver.co.mz/}turma" minOccurs="0"/>
 *         &lt;element name="turno" type="{http://webservice.centralserver.co.mz/}turno" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inscricao", propOrder = {
    "aluno",
    "anoLectivo",
    "curso",
    "entidade",
    "inscActiva",
    "inscAnoLectivo",
    "inscCategoria",
    "inscCertificado",
    "inscComp1",
    "inscComp2",
    "inscComp3",
    "inscComp4",
    "inscCondicao",
    "inscCopiaBI",
    "inscDataInscricao",
    "inscDataProximoPagamento",
    "inscDataUltimoPagamento",
    "inscFaltas",
    "inscFaltasJustificadas",
    "inscFotos",
    "inscId",
    "inscNotaFinal",
    "inscNrTransfercia",
    "inscOrigem",
    "inscPpf",
    "inscReferencia",
    "inscRegular",
    "inscSemestre",
    "inscTurno",
    "turma",
    "turno"
})
public class Inscricao {

    protected Aluno aluno;
    protected AnoLectivo anoLectivo;
    protected Curso curso;
    protected Entidade entidade;
    @XmlElement(name = "insc_activa")
    protected boolean inscActiva;
    @XmlElement(name = "insc_anoLectivo")
    protected String inscAnoLectivo;
    @XmlElement(name = "insc_categoria")
    protected String inscCategoria;
    @XmlElement(name = "insc_certificado")
    protected boolean inscCertificado;
    @XmlElement(name = "insc_comp1")
    protected String inscComp1;
    @XmlElement(name = "insc_comp2")
    protected String inscComp2;
    @XmlElement(name = "insc_comp3")
    protected String inscComp3;
    @XmlElement(name = "insc_comp4")
    protected String inscComp4;
    @XmlElement(name = "insc_condicao")
    protected String inscCondicao;
    @XmlElement(name = "insc_copiaBI")
    protected boolean inscCopiaBI;
    @XmlElement(name = "insc_dataInscricao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inscDataInscricao;
    @XmlElement(name = "insc_dataProximoPagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inscDataProximoPagamento;
    @XmlElement(name = "insc_dataUltimoPagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inscDataUltimoPagamento;
    @XmlElement(name = "insc_faltas")
    protected int inscFaltas;
    @XmlElement(name = "insc_faltasJustificadas")
    protected int inscFaltasJustificadas;
    @XmlElement(name = "insc_fotos")
    protected boolean inscFotos;
    @XmlElement(name = "insc_id")
    protected int inscId;
    @XmlElement(name = "insc_notaFinal")
    protected float inscNotaFinal;
    @XmlElement(name = "insc_nrTransfercia")
    protected String inscNrTransfercia;
    @XmlElement(name = "insc_origem")
    protected String inscOrigem;
    @XmlElement(name = "insc_ppf")
    protected boolean inscPpf;
    @XmlElement(name = "insc_referencia")
    protected String inscReferencia;
    @XmlElement(name = "insc_regular")
    protected boolean inscRegular;
    @XmlElement(name = "insc_semestre")
    protected String inscSemestre;
    @XmlElement(name = "insc_turno")
    protected String inscTurno;
    protected Turma turma;
    protected Turno turno;

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
     * Gets the value of the inscActiva property.
     * 
     */
    public boolean isInscActiva() {
        return inscActiva;
    }

    /**
     * Sets the value of the inscActiva property.
     * 
     */
    public void setInscActiva(boolean value) {
        this.inscActiva = value;
    }

    /**
     * Gets the value of the inscAnoLectivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscAnoLectivo() {
        return inscAnoLectivo;
    }

    /**
     * Sets the value of the inscAnoLectivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscAnoLectivo(String value) {
        this.inscAnoLectivo = value;
    }

    /**
     * Gets the value of the inscCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscCategoria() {
        return inscCategoria;
    }

    /**
     * Sets the value of the inscCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscCategoria(String value) {
        this.inscCategoria = value;
    }

    /**
     * Gets the value of the inscCertificado property.
     * 
     */
    public boolean isInscCertificado() {
        return inscCertificado;
    }

    /**
     * Sets the value of the inscCertificado property.
     * 
     */
    public void setInscCertificado(boolean value) {
        this.inscCertificado = value;
    }

    /**
     * Gets the value of the inscComp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscComp1() {
        return inscComp1;
    }

    /**
     * Sets the value of the inscComp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscComp1(String value) {
        this.inscComp1 = value;
    }

    /**
     * Gets the value of the inscComp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscComp2() {
        return inscComp2;
    }

    /**
     * Sets the value of the inscComp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscComp2(String value) {
        this.inscComp2 = value;
    }

    /**
     * Gets the value of the inscComp3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscComp3() {
        return inscComp3;
    }

    /**
     * Sets the value of the inscComp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscComp3(String value) {
        this.inscComp3 = value;
    }

    /**
     * Gets the value of the inscComp4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscComp4() {
        return inscComp4;
    }

    /**
     * Sets the value of the inscComp4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscComp4(String value) {
        this.inscComp4 = value;
    }

    /**
     * Gets the value of the inscCondicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscCondicao() {
        return inscCondicao;
    }

    /**
     * Sets the value of the inscCondicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscCondicao(String value) {
        this.inscCondicao = value;
    }

    /**
     * Gets the value of the inscCopiaBI property.
     * 
     */
    public boolean isInscCopiaBI() {
        return inscCopiaBI;
    }

    /**
     * Sets the value of the inscCopiaBI property.
     * 
     */
    public void setInscCopiaBI(boolean value) {
        this.inscCopiaBI = value;
    }

    /**
     * Gets the value of the inscDataInscricao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInscDataInscricao() {
        return inscDataInscricao;
    }

    /**
     * Sets the value of the inscDataInscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInscDataInscricao(XMLGregorianCalendar value) {
        this.inscDataInscricao = value;
    }

    /**
     * Gets the value of the inscDataProximoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInscDataProximoPagamento() {
        return inscDataProximoPagamento;
    }

    /**
     * Sets the value of the inscDataProximoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInscDataProximoPagamento(XMLGregorianCalendar value) {
        this.inscDataProximoPagamento = value;
    }

    /**
     * Gets the value of the inscDataUltimoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInscDataUltimoPagamento() {
        return inscDataUltimoPagamento;
    }

    /**
     * Sets the value of the inscDataUltimoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInscDataUltimoPagamento(XMLGregorianCalendar value) {
        this.inscDataUltimoPagamento = value;
    }

    /**
     * Gets the value of the inscFaltas property.
     * 
     */
    public int getInscFaltas() {
        return inscFaltas;
    }

    /**
     * Sets the value of the inscFaltas property.
     * 
     */
    public void setInscFaltas(int value) {
        this.inscFaltas = value;
    }

    /**
     * Gets the value of the inscFaltasJustificadas property.
     * 
     */
    public int getInscFaltasJustificadas() {
        return inscFaltasJustificadas;
    }

    /**
     * Sets the value of the inscFaltasJustificadas property.
     * 
     */
    public void setInscFaltasJustificadas(int value) {
        this.inscFaltasJustificadas = value;
    }

    /**
     * Gets the value of the inscFotos property.
     * 
     */
    public boolean isInscFotos() {
        return inscFotos;
    }

    /**
     * Sets the value of the inscFotos property.
     * 
     */
    public void setInscFotos(boolean value) {
        this.inscFotos = value;
    }

    /**
     * Gets the value of the inscId property.
     * 
     */
    public int getInscId() {
        return inscId;
    }

    /**
     * Sets the value of the inscId property.
     * 
     */
    public void setInscId(int value) {
        this.inscId = value;
    }

    /**
     * Gets the value of the inscNotaFinal property.
     * 
     */
    public float getInscNotaFinal() {
        return inscNotaFinal;
    }

    /**
     * Sets the value of the inscNotaFinal property.
     * 
     */
    public void setInscNotaFinal(float value) {
        this.inscNotaFinal = value;
    }

    /**
     * Gets the value of the inscNrTransfercia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscNrTransfercia() {
        return inscNrTransfercia;
    }

    /**
     * Sets the value of the inscNrTransfercia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscNrTransfercia(String value) {
        this.inscNrTransfercia = value;
    }

    /**
     * Gets the value of the inscOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscOrigem() {
        return inscOrigem;
    }

    /**
     * Sets the value of the inscOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscOrigem(String value) {
        this.inscOrigem = value;
    }

    /**
     * Gets the value of the inscPpf property.
     * 
     */
    public boolean isInscPpf() {
        return inscPpf;
    }

    /**
     * Sets the value of the inscPpf property.
     * 
     */
    public void setInscPpf(boolean value) {
        this.inscPpf = value;
    }

    /**
     * Gets the value of the inscReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscReferencia() {
        return inscReferencia;
    }

    /**
     * Sets the value of the inscReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscReferencia(String value) {
        this.inscReferencia = value;
    }

    /**
     * Gets the value of the inscRegular property.
     * 
     */
    public boolean isInscRegular() {
        return inscRegular;
    }

    /**
     * Sets the value of the inscRegular property.
     * 
     */
    public void setInscRegular(boolean value) {
        this.inscRegular = value;
    }

    /**
     * Gets the value of the inscSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscSemestre() {
        return inscSemestre;
    }

    /**
     * Sets the value of the inscSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscSemestre(String value) {
        this.inscSemestre = value;
    }

    /**
     * Gets the value of the inscTurno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscTurno() {
        return inscTurno;
    }

    /**
     * Sets the value of the inscTurno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscTurno(String value) {
        this.inscTurno = value;
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
     * Gets the value of the turno property.
     * 
     * @return
     *     possible object is
     *     {@link Turno }
     *     
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * Sets the value of the turno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Turno }
     *     
     */
    public void setTurno(Turno value) {
        this.turno = value;
    }

}
