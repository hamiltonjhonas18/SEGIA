
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for salaExame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salaExame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="juri1" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
 *         &lt;element name="juri2" type="{http://webservice.centralserver.co.mz/}docente" minOccurs="0"/>
 *         &lt;element name="sala" type="{http://webservice.centralserver.co.mz/}sala" minOccurs="0"/>
 *         &lt;element name="salae_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="salae_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="salae_maxAlunos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="salae_ocupado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salaExame", propOrder = {
    "anoLectivo",
    "curso",
    "disciplina",
    "entidade",
    "juri1",
    "juri2",
    "sala",
    "salaeData",
    "salaeId",
    "salaeMaxAlunos",
    "salaeOcupado"
})
public class SalaExame {

    protected AnoLectivo anoLectivo;
    protected Curso curso;
    protected Disciplina disciplina;
    protected Entidade entidade;
    protected Docente juri1;
    protected Docente juri2;
    protected Sala sala;
    @XmlElement(name = "salae_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar salaeData;
    @XmlElement(name = "salae_id")
    protected int salaeId;
    @XmlElement(name = "salae_maxAlunos")
    protected int salaeMaxAlunos;
    @XmlElement(name = "salae_ocupado")
    protected int salaeOcupado;

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
     * Gets the value of the salaeData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSalaeData() {
        return salaeData;
    }

    /**
     * Sets the value of the salaeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSalaeData(XMLGregorianCalendar value) {
        this.salaeData = value;
    }

    /**
     * Gets the value of the salaeId property.
     * 
     */
    public int getSalaeId() {
        return salaeId;
    }

    /**
     * Sets the value of the salaeId property.
     * 
     */
    public void setSalaeId(int value) {
        this.salaeId = value;
    }

    /**
     * Gets the value of the salaeMaxAlunos property.
     * 
     */
    public int getSalaeMaxAlunos() {
        return salaeMaxAlunos;
    }

    /**
     * Sets the value of the salaeMaxAlunos property.
     * 
     */
    public void setSalaeMaxAlunos(int value) {
        this.salaeMaxAlunos = value;
    }

    /**
     * Gets the value of the salaeOcupado property.
     * 
     */
    public int getSalaeOcupado() {
        return salaeOcupado;
    }

    /**
     * Sets the value of the salaeOcupado property.
     * 
     */
    public void setSalaeOcupado(int value) {
        this.salaeOcupado = value;
    }

}
