
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for calendarioExame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calendarioExame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="calee_exame" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="calee_exameLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="calee_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calee_recorrencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="calee_recorrenciaLimite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="calee_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
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
@XmlType(name = "calendarioExame", propOrder = {
    "anoLectivo",
    "caleeExame",
    "caleeExameLimite",
    "caleeId",
    "caleeRecorrencia",
    "caleeRecorrenciaLimite",
    "caleeSemestre",
    "curso",
    "disciplina",
    "encrypted",
    "entidade"
})
public class CalendarioExame {

    protected AnoLectivo anoLectivo;
    @XmlElement(name = "calee_exame")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleeExame;
    @XmlElement(name = "calee_exameLimite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleeExameLimite;
    @XmlElement(name = "calee_id")
    protected int caleeId;
    @XmlElement(name = "calee_recorrencia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleeRecorrencia;
    @XmlElement(name = "calee_recorrenciaLimite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caleeRecorrenciaLimite;
    @XmlElement(name = "calee_semestre")
    protected String caleeSemestre;
    protected Curso curso;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;

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
     * Gets the value of the caleeExame property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleeExame() {
        return caleeExame;
    }

    /**
     * Sets the value of the caleeExame property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleeExame(XMLGregorianCalendar value) {
        this.caleeExame = value;
    }

    /**
     * Gets the value of the caleeExameLimite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleeExameLimite() {
        return caleeExameLimite;
    }

    /**
     * Sets the value of the caleeExameLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleeExameLimite(XMLGregorianCalendar value) {
        this.caleeExameLimite = value;
    }

    /**
     * Gets the value of the caleeId property.
     * 
     */
    public int getCaleeId() {
        return caleeId;
    }

    /**
     * Sets the value of the caleeId property.
     * 
     */
    public void setCaleeId(int value) {
        this.caleeId = value;
    }

    /**
     * Gets the value of the caleeRecorrencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleeRecorrencia() {
        return caleeRecorrencia;
    }

    /**
     * Sets the value of the caleeRecorrencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleeRecorrencia(XMLGregorianCalendar value) {
        this.caleeRecorrencia = value;
    }

    /**
     * Gets the value of the caleeRecorrenciaLimite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaleeRecorrenciaLimite() {
        return caleeRecorrenciaLimite;
    }

    /**
     * Sets the value of the caleeRecorrenciaLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaleeRecorrenciaLimite(XMLGregorianCalendar value) {
        this.caleeRecorrenciaLimite = value;
    }

    /**
     * Gets the value of the caleeSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaleeSemestre() {
        return caleeSemestre;
    }

    /**
     * Sets the value of the caleeSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaleeSemestre(String value) {
        this.caleeSemestre = value;
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
