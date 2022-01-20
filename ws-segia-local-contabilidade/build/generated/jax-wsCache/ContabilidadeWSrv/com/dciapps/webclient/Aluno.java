
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for aluno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aluno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alun_badgnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_bolseiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_dataInscricao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="alun_dataProximoPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="alun_deficiente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="alun_distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alun_nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alun_turno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
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
@XmlType(name = "aluno", propOrder = {
    "alunBadgnumber",
    "alunBolseiro",
    "alunCategoria",
    "alunDataInscricao",
    "alunDataProximoPagamento",
    "alunDeficiente",
    "alunDistrito",
    "alunId",
    "alunNivel",
    "alunPassword",
    "alunProvincia",
    "alunStatus",
    "alunTurno",
    "encrypted",
    "entidade",
    "escola",
    "pessoa",
    "turma"
})
public class Aluno {

    @XmlElement(name = "alun_badgnumber")
    protected String alunBadgnumber;
    @XmlElement(name = "alun_bolseiro")
    protected String alunBolseiro;
    @XmlElement(name = "alun_categoria")
    protected String alunCategoria;
    @XmlElement(name = "alun_dataInscricao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alunDataInscricao;
    @XmlElement(name = "alun_dataProximoPagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alunDataProximoPagamento;
    @XmlElement(name = "alun_deficiente")
    protected boolean alunDeficiente;
    @XmlElement(name = "alun_distrito")
    protected String alunDistrito;
    @XmlElement(name = "alun_id")
    protected int alunId;
    @XmlElement(name = "alun_nivel")
    protected String alunNivel;
    @XmlElement(name = "alun_password")
    protected String alunPassword;
    @XmlElement(name = "alun_provincia")
    protected String alunProvincia;
    @XmlElement(name = "alun_status")
    protected String alunStatus;
    @XmlElement(name = "alun_turno")
    protected int alunTurno;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Escola escola;
    protected Pessoa pessoa;
    protected Turma turma;

    /**
     * Gets the value of the alunBadgnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunBadgnumber() {
        return alunBadgnumber;
    }

    /**
     * Sets the value of the alunBadgnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunBadgnumber(String value) {
        this.alunBadgnumber = value;
    }

    /**
     * Gets the value of the alunBolseiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunBolseiro() {
        return alunBolseiro;
    }

    /**
     * Sets the value of the alunBolseiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunBolseiro(String value) {
        this.alunBolseiro = value;
    }

    /**
     * Gets the value of the alunCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunCategoria() {
        return alunCategoria;
    }

    /**
     * Sets the value of the alunCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunCategoria(String value) {
        this.alunCategoria = value;
    }

    /**
     * Gets the value of the alunDataInscricao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlunDataInscricao() {
        return alunDataInscricao;
    }

    /**
     * Sets the value of the alunDataInscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlunDataInscricao(XMLGregorianCalendar value) {
        this.alunDataInscricao = value;
    }

    /**
     * Gets the value of the alunDataProximoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlunDataProximoPagamento() {
        return alunDataProximoPagamento;
    }

    /**
     * Sets the value of the alunDataProximoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlunDataProximoPagamento(XMLGregorianCalendar value) {
        this.alunDataProximoPagamento = value;
    }

    /**
     * Gets the value of the alunDeficiente property.
     * 
     */
    public boolean isAlunDeficiente() {
        return alunDeficiente;
    }

    /**
     * Sets the value of the alunDeficiente property.
     * 
     */
    public void setAlunDeficiente(boolean value) {
        this.alunDeficiente = value;
    }

    /**
     * Gets the value of the alunDistrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunDistrito() {
        return alunDistrito;
    }

    /**
     * Sets the value of the alunDistrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunDistrito(String value) {
        this.alunDistrito = value;
    }

    /**
     * Gets the value of the alunId property.
     * 
     */
    public int getAlunId() {
        return alunId;
    }

    /**
     * Sets the value of the alunId property.
     * 
     */
    public void setAlunId(int value) {
        this.alunId = value;
    }

    /**
     * Gets the value of the alunNivel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunNivel() {
        return alunNivel;
    }

    /**
     * Sets the value of the alunNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunNivel(String value) {
        this.alunNivel = value;
    }

    /**
     * Gets the value of the alunPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunPassword() {
        return alunPassword;
    }

    /**
     * Sets the value of the alunPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunPassword(String value) {
        this.alunPassword = value;
    }

    /**
     * Gets the value of the alunProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunProvincia() {
        return alunProvincia;
    }

    /**
     * Sets the value of the alunProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunProvincia(String value) {
        this.alunProvincia = value;
    }

    /**
     * Gets the value of the alunStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlunStatus() {
        return alunStatus;
    }

    /**
     * Sets the value of the alunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlunStatus(String value) {
        this.alunStatus = value;
    }

    /**
     * Gets the value of the alunTurno property.
     * 
     */
    public int getAlunTurno() {
        return alunTurno;
    }

    /**
     * Sets the value of the alunTurno property.
     * 
     */
    public void setAlunTurno(int value) {
        this.alunTurno = value;
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
     * Gets the value of the pessoa property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Sets the value of the pessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoa(Pessoa value) {
        this.pessoa = value;
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
