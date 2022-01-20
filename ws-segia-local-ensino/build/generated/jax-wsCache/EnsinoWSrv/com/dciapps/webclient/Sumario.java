
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sumario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sumario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="suma_avaliacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suma_bibliografia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suma_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="suma_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suma_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suma_metodologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suma_objectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suma_recursos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suma_resumo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tema" type="{http://webservice.centralserver.co.mz/}tema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumario", propOrder = {
    "curso",
    "disciplina",
    "encrypted",
    "entidade",
    "escola",
    "sumaAvaliacao",
    "sumaBibliografia",
    "sumaData",
    "sumaDescricao",
    "sumaId",
    "sumaMetodologia",
    "sumaObjectivo",
    "sumaRecursos",
    "sumaResumo",
    "tema"
})
public class Sumario {

    protected Curso curso;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Escola escola;
    @XmlElement(name = "suma_avaliacao")
    protected String sumaAvaliacao;
    @XmlElement(name = "suma_bibliografia")
    protected String sumaBibliografia;
    @XmlElement(name = "suma_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sumaData;
    @XmlElement(name = "suma_descricao")
    protected String sumaDescricao;
    @XmlElement(name = "suma_id")
    protected int sumaId;
    @XmlElement(name = "suma_metodologia")
    protected String sumaMetodologia;
    @XmlElement(name = "suma_objectivo")
    protected String sumaObjectivo;
    @XmlElement(name = "suma_recursos")
    protected String sumaRecursos;
    @XmlElement(name = "suma_resumo")
    protected String sumaResumo;
    protected Tema tema;

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
     * Gets the value of the sumaAvaliacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaAvaliacao() {
        return sumaAvaliacao;
    }

    /**
     * Sets the value of the sumaAvaliacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaAvaliacao(String value) {
        this.sumaAvaliacao = value;
    }

    /**
     * Gets the value of the sumaBibliografia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaBibliografia() {
        return sumaBibliografia;
    }

    /**
     * Sets the value of the sumaBibliografia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaBibliografia(String value) {
        this.sumaBibliografia = value;
    }

    /**
     * Gets the value of the sumaData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSumaData() {
        return sumaData;
    }

    /**
     * Sets the value of the sumaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSumaData(XMLGregorianCalendar value) {
        this.sumaData = value;
    }

    /**
     * Gets the value of the sumaDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaDescricao() {
        return sumaDescricao;
    }

    /**
     * Sets the value of the sumaDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaDescricao(String value) {
        this.sumaDescricao = value;
    }

    /**
     * Gets the value of the sumaId property.
     * 
     */
    public int getSumaId() {
        return sumaId;
    }

    /**
     * Sets the value of the sumaId property.
     * 
     */
    public void setSumaId(int value) {
        this.sumaId = value;
    }

    /**
     * Gets the value of the sumaMetodologia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaMetodologia() {
        return sumaMetodologia;
    }

    /**
     * Sets the value of the sumaMetodologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaMetodologia(String value) {
        this.sumaMetodologia = value;
    }

    /**
     * Gets the value of the sumaObjectivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaObjectivo() {
        return sumaObjectivo;
    }

    /**
     * Sets the value of the sumaObjectivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaObjectivo(String value) {
        this.sumaObjectivo = value;
    }

    /**
     * Gets the value of the sumaRecursos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaRecursos() {
        return sumaRecursos;
    }

    /**
     * Sets the value of the sumaRecursos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaRecursos(String value) {
        this.sumaRecursos = value;
    }

    /**
     * Gets the value of the sumaResumo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaResumo() {
        return sumaResumo;
    }

    /**
     * Sets the value of the sumaResumo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaResumo(String value) {
        this.sumaResumo = value;
    }

    /**
     * Gets the value of the tema property.
     * 
     * @return
     *     possible object is
     *     {@link Tema }
     *     
     */
    public Tema getTema() {
        return tema;
    }

    /**
     * Sets the value of the tema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tema }
     *     
     */
    public void setTema(Tema value) {
        this.tema = value;
    }

}
