
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for calendario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calendario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="cale_acp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_acp2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_acp2Limite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_acpLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_exame" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_exameLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_haveAcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cale_haveExame" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cale_haveTeste3" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cale_haveTeste4" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cale_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cale_recorrencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_recorrenciaLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cale_teste1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_teste1Limite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_teste2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_teste2Limite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_teste3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_teste3Limite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_teste4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cale_teste4Limite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="docente" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="juri1" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
 *         &lt;element name="juri2" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
 *         &lt;element name="juri3" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
 *         &lt;element name="juri4" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
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
@XmlType(name = "calendario", propOrder = {
    "anoLectivo",
    "caleAcp",
    "caleAcp2",
    "caleAcp2Limite",
    "caleAcpLimite",
    "caleExame",
    "caleExameLimite",
    "caleHaveAcp",
    "caleHaveExame",
    "caleHaveTeste3",
    "caleHaveTeste4",
    "caleId",
    "caleRecorrencia",
    "caleRecorrenciaLimite",
    "caleSemestre",
    "caleTeste1",
    "caleTeste1Limite",
    "caleTeste2",
    "caleTeste2Limite",
    "caleTeste3",
    "caleTeste3Limite",
    "caleTeste4",
    "caleTeste4Limite",
    "curso",
    "disciplina",
    "docente",
    "encrypted",
    "entidade",
    "juri1",
    "juri2",
    "juri3",
    "juri4",
    "turma"
})
public class Calendario {

    protected AnoLectivo anoLectivo;
    @XmlElement(name = "cale_acp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleAcp;
    @XmlElement(name = "cale_acp2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleAcp2;
    @XmlElement(name = "cale_acp2Limite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleAcp2Limite;
    @XmlElement(name = "cale_acpLimite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleAcpLimite;
    @XmlElement(name = "cale_exame")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleExame;
    @XmlElement(name = "cale_exameLimite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleExameLimite;
    @XmlElement(name = "cale_haveAcp")
    protected boolean caleHaveAcp;
    @XmlElement(name = "cale_haveExame")
    protected boolean caleHaveExame;
    @XmlElement(name = "cale_haveTeste3")
    protected boolean caleHaveTeste3;
    @XmlElement(name = "cale_haveTeste4")
    protected boolean caleHaveTeste4;
    @XmlElement(name = "cale_id")
    protected int caleId;
    @XmlElement(name = "cale_recorrencia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleRecorrencia;
    @XmlElement(name = "cale_recorrenciaLimite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleRecorrenciaLimite;
    @XmlElement(name = "cale_semestre")
    protected String caleSemestre;
    @XmlElement(name = "cale_teste1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste1;
    @XmlElement(name = "cale_teste1Limite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste1Limite;
    @XmlElement(name = "cale_teste2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste2;
    @XmlElement(name = "cale_teste2Limite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste2Limite;
    @XmlElement(name = "cale_teste3")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste3;
    @XmlElement(name = "cale_teste3Limite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste3Limite;
    @XmlElement(name = "cale_teste4")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste4;
    @XmlElement(name = "cale_teste4Limite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleTeste4Limite;
    protected Curso curso;
    protected Disciplina disciplina;
    protected Docente docente;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Docente juri1;
    protected Docente juri2;
    protected Docente juri3;
    protected Docente juri4;
    protected Turma turma;

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
     * Gets the value of the caleAcp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleAcp() {
        return caleAcp;
    }

    /**
     * Sets the value of the caleAcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleAcp(XMLGregorianCalendar value) {
        this.caleAcp = value;
    }

    /**
     * Gets the value of the caleAcp2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleAcp2() {
        return caleAcp2;
    }

    /**
     * Sets the value of the caleAcp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleAcp2(XMLGregorianCalendar value) {
        this.caleAcp2 = value;
    }

    /**
     * Gets the value of the caleAcp2Limite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleAcp2Limite() {
        return caleAcp2Limite;
    }

    /**
     * Sets the value of the caleAcp2Limite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleAcp2Limite(XMLGregorianCalendar value) {
        this.caleAcp2Limite = value;
    }

    /**
     * Gets the value of the caleAcpLimite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleAcpLimite() {
        return caleAcpLimite;
    }

    /**
     * Sets the value of the caleAcpLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleAcpLimite(XMLGregorianCalendar value) {
        this.caleAcpLimite = value;
    }

    /**
     * Gets the value of the caleExame property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleExame() {
        return caleExame;
    }

    /**
     * Sets the value of the caleExame property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleExame(XMLGregorianCalendar value) {
        this.caleExame = value;
    }

    /**
     * Gets the value of the caleExameLimite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleExameLimite() {
        return caleExameLimite;
    }

    /**
     * Sets the value of the caleExameLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleExameLimite(XMLGregorianCalendar value) {
        this.caleExameLimite = value;
    }

    /**
     * Gets the value of the caleHaveAcp property.
     * 
     */
    public boolean isCaleHaveAcp() {
        return caleHaveAcp;
    }

    /**
     * Sets the value of the caleHaveAcp property.
     * 
     */
    public void setCaleHaveAcp(boolean value) {
        this.caleHaveAcp = value;
    }

    /**
     * Gets the value of the caleHaveExame property.
     * 
     */
    public boolean isCaleHaveExame() {
        return caleHaveExame;
    }

    /**
     * Sets the value of the caleHaveExame property.
     * 
     */
    public void setCaleHaveExame(boolean value) {
        this.caleHaveExame = value;
    }

    /**
     * Gets the value of the caleHaveTeste3 property.
     * 
     */
    public boolean isCaleHaveTeste3() {
        return caleHaveTeste3;
    }

    /**
     * Sets the value of the caleHaveTeste3 property.
     * 
     */
    public void setCaleHaveTeste3(boolean value) {
        this.caleHaveTeste3 = value;
    }

    /**
     * Gets the value of the caleHaveTeste4 property.
     * 
     */
    public boolean isCaleHaveTeste4() {
        return caleHaveTeste4;
    }

    /**
     * Sets the value of the caleHaveTeste4 property.
     * 
     */
    public void setCaleHaveTeste4(boolean value) {
        this.caleHaveTeste4 = value;
    }

    /**
     * Gets the value of the caleId property.
     * 
     */
    public int getCaleId() {
        return caleId;
    }

    /**
     * Sets the value of the caleId property.
     * 
     */
    public void setCaleId(int value) {
        this.caleId = value;
    }

    /**
     * Gets the value of the caleRecorrencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleRecorrencia() {
        return caleRecorrencia;
    }

    /**
     * Sets the value of the caleRecorrencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleRecorrencia(XMLGregorianCalendar value) {
        this.caleRecorrencia = value;
    }

    /**
     * Gets the value of the caleRecorrenciaLimite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleRecorrenciaLimite() {
        return caleRecorrenciaLimite;
    }

    /**
     * Sets the value of the caleRecorrenciaLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleRecorrenciaLimite(XMLGregorianCalendar value) {
        this.caleRecorrenciaLimite = value;
    }

    /**
     * Gets the value of the caleSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaleSemestre() {
        return caleSemestre;
    }

    /**
     * Sets the value of the caleSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaleSemestre(String value) {
        this.caleSemestre = value;
    }

    /**
     * Gets the value of the caleTeste1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste1() {
        return caleTeste1;
    }

    /**
     * Sets the value of the caleTeste1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste1(XMLGregorianCalendar value) {
        this.caleTeste1 = value;
    }

    /**
     * Gets the value of the caleTeste1Limite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste1Limite() {
        return caleTeste1Limite;
    }

    /**
     * Sets the value of the caleTeste1Limite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste1Limite(XMLGregorianCalendar value) {
        this.caleTeste1Limite = value;
    }

    /**
     * Gets the value of the caleTeste2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste2() {
        return caleTeste2;
    }

    /**
     * Sets the value of the caleTeste2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste2(XMLGregorianCalendar value) {
        this.caleTeste2 = value;
    }

    /**
     * Gets the value of the caleTeste2Limite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste2Limite() {
        return caleTeste2Limite;
    }

    /**
     * Sets the value of the caleTeste2Limite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste2Limite(XMLGregorianCalendar value) {
        this.caleTeste2Limite = value;
    }

    /**
     * Gets the value of the caleTeste3 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste3() {
        return caleTeste3;
    }

    /**
     * Sets the value of the caleTeste3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste3(XMLGregorianCalendar value) {
        this.caleTeste3 = value;
    }

    /**
     * Gets the value of the caleTeste3Limite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste3Limite() {
        return caleTeste3Limite;
    }

    /**
     * Sets the value of the caleTeste3Limite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste3Limite(XMLGregorianCalendar value) {
        this.caleTeste3Limite = value;
    }

    /**
     * Gets the value of the caleTeste4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste4() {
        return caleTeste4;
    }

    /**
     * Sets the value of the caleTeste4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste4(XMLGregorianCalendar value) {
        this.caleTeste4 = value;
    }

    /**
     * Gets the value of the caleTeste4Limite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleTeste4Limite() {
        return caleTeste4Limite;
    }

    /**
     * Sets the value of the caleTeste4Limite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleTeste4Limite(XMLGregorianCalendar value) {
        this.caleTeste4Limite = value;
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
     * Gets the value of the docente property.
     * 
     * @return
     *     possible object is
     *     {@link Docente }
     *     
     */
    public Docente getDocente() {
        return docente;
    }

    /**
     * Sets the value of the docente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docente }
     *     
     */
    public void setDocente(Docente value) {
        this.docente = value;
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
     * Gets the value of the juri1 property.
     * 
     * @return
     *     possible object is
     *     {@link Docente }
     *     
     */
    public Docente getJuri1() {
        return juri1;
    }

    /**
     * Sets the value of the juri1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docente }
     *     
     */
    public void setJuri1(Docente value) {
        this.juri1 = value;
    }

    /**
     * Gets the value of the juri2 property.
     * 
     * @return
     *     possible object is
     *     {@link Docente }
     *     
     */
    public Docente getJuri2() {
        return juri2;
    }

    /**
     * Sets the value of the juri2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docente }
     *     
     */
    public void setJuri2(Docente value) {
        this.juri2 = value;
    }

    /**
     * Gets the value of the juri3 property.
     * 
     * @return
     *     possible object is
     *     {@link Docente }
     *     
     */
    public Docente getJuri3() {
        return juri3;
    }

    /**
     * Sets the value of the juri3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docente }
     *     
     */
    public void setJuri3(Docente value) {
        this.juri3 = value;
    }

    /**
     * Gets the value of the juri4 property.
     * 
     * @return
     *     possible object is
     *     {@link Docente }
     *     
     */
    public Docente getJuri4() {
        return juri4;
    }

    /**
     * Sets the value of the juri4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Docente }
     *     
     */
    public void setJuri4(Docente value) {
        this.juri4 = value;
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
