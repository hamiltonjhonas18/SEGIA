
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for turma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="sala" type="{http://webservice.centralserver.co.mz/}sala" minOccurs="0"/>
 *         &lt;element name="turm_dataFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="turm_dataInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="turm_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turm_horario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turm_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="turm_maxEstudantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="turm_minEstudantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="turm_numOcupado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="turm_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turm_turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turma", propOrder = {
    "anoLectivo",
    "curso",
    "encrypted",
    "entidade",
    "escola",
    "sala",
    "turmDataFim",
    "turmDataInicio",
    "turmDescricao",
    "turmHorario",
    "turmId",
    "turmMaxEstudantes",
    "turmMinEstudantes",
    "turmNumOcupado",
    "turmReferencia",
    "turmTurno"
})
public class Turma {

    protected AnoLectivo anoLectivo;
    protected Curso curso;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Escola escola;
    protected Sala sala;
    @XmlElement(name = "turm_dataFim")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar turmDataFim;
    @XmlElement(name = "turm_dataInicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar turmDataInicio;
    @XmlElement(name = "turm_descricao")
    protected String turmDescricao;
    @XmlElement(name = "turm_horario")
    protected String turmHorario;
    @XmlElement(name = "turm_id")
    protected int turmId;
    @XmlElement(name = "turm_maxEstudantes")
    protected int turmMaxEstudantes;
    @XmlElement(name = "turm_minEstudantes")
    protected int turmMinEstudantes;
    @XmlElement(name = "turm_numOcupado")
    protected int turmNumOcupado;
    @XmlElement(name = "turm_referencia")
    protected String turmReferencia;
    @XmlElement(name = "turm_turno")
    protected String turmTurno;

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
     * Gets the value of the escola property.
     * 
     * @return
     *     possible object is
     *     {@link Escola }
     *     
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * Sets the value of the escola property.
     * 
     * @param value
     *     allowed object is
     *     {@link Escola }
     *     
     */
    public void setEscola(Escola value) {
        this.escola = value;
    }

    /**
     * Gets the value of the sala property.
     * 
     * @return
     *     possible object is
     *     {@link Sala }
     *     
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * Sets the value of the sala property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sala }
     *     
     */
    public void setSala(Sala value) {
        this.sala = value;
    }

    /**
     * Gets the value of the turmDataFim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTurmDataFim() {
        return turmDataFim;
    }

    /**
     * Sets the value of the turmDataFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTurmDataFim(XMLGregorianCalendar value) {
        this.turmDataFim = value;
    }

    /**
     * Gets the value of the turmDataInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTurmDataInicio() {
        return turmDataInicio;
    }

    /**
     * Sets the value of the turmDataInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTurmDataInicio(XMLGregorianCalendar value) {
        this.turmDataInicio = value;
    }

    /**
     * Gets the value of the turmDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurmDescricao() {
        return turmDescricao;
    }

    /**
     * Sets the value of the turmDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurmDescricao(String value) {
        this.turmDescricao = value;
    }

    /**
     * Gets the value of the turmHorario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurmHorario() {
        return turmHorario;
    }

    /**
     * Sets the value of the turmHorario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurmHorario(String value) {
        this.turmHorario = value;
    }

    /**
     * Gets the value of the turmId property.
     * 
     */
    public int getTurmId() {
        return turmId;
    }

    /**
     * Sets the value of the turmId property.
     * 
     */
    public void setTurmId(int value) {
        this.turmId = value;
    }

    /**
     * Gets the value of the turmMaxEstudantes property.
     * 
     */
    public int getTurmMaxEstudantes() {
        return turmMaxEstudantes;
    }

    /**
     * Sets the value of the turmMaxEstudantes property.
     * 
     */
    public void setTurmMaxEstudantes(int value) {
        this.turmMaxEstudantes = value;
    }

    /**
     * Gets the value of the turmMinEstudantes property.
     * 
     */
    public int getTurmMinEstudantes() {
        return turmMinEstudantes;
    }

    /**
     * Sets the value of the turmMinEstudantes property.
     * 
     */
    public void setTurmMinEstudantes(int value) {
        this.turmMinEstudantes = value;
    }

    /**
     * Gets the value of the turmNumOcupado property.
     * 
     */
    public int getTurmNumOcupado() {
        return turmNumOcupado;
    }

    /**
     * Sets the value of the turmNumOcupado property.
     * 
     */
    public void setTurmNumOcupado(int value) {
        this.turmNumOcupado = value;
    }

    /**
     * Gets the value of the turmReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurmReferencia() {
        return turmReferencia;
    }

    /**
     * Sets the value of the turmReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurmReferencia(String value) {
        this.turmReferencia = value;
    }

    /**
     * Gets the value of the turmTurno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurmTurno() {
        return turmTurno;
    }

    /**
     * Sets the value of the turmTurno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurmTurno(String value) {
        this.turmTurno = value;
    }

}
