
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mensalidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mensalidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="mens_dataInscricao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mens_dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mens_dataProximoPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mens_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mens_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensalidade", propOrder = {
    "aluno",
    "curso",
    "encrypted",
    "entidade",
    "mensDataInscricao",
    "mensDataPagamento",
    "mensDataProximoPagamento",
    "mensEstado",
    "mensId"
})
public class Mensalidade {

    protected Aluno aluno;
    protected Curso curso;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "mens_dataInscricao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mensDataInscricao;
    @XmlElement(name = "mens_dataPagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mensDataPagamento;
    @XmlElement(name = "mens_dataProximoPagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mensDataProximoPagamento;
    @XmlElement(name = "mens_estado")
    protected String mensEstado;
    @XmlElement(name = "mens_id")
    protected int mensId;

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
     * Gets the value of the mensDataInscricao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMensDataInscricao() {
        return mensDataInscricao;
    }

    /**
     * Sets the value of the mensDataInscricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMensDataInscricao(XMLGregorianCalendar value) {
        this.mensDataInscricao = value;
    }

    /**
     * Gets the value of the mensDataPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMensDataPagamento() {
        return mensDataPagamento;
    }

    /**
     * Sets the value of the mensDataPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMensDataPagamento(XMLGregorianCalendar value) {
        this.mensDataPagamento = value;
    }

    /**
     * Gets the value of the mensDataProximoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMensDataProximoPagamento() {
        return mensDataProximoPagamento;
    }

    /**
     * Sets the value of the mensDataProximoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMensDataProximoPagamento(XMLGregorianCalendar value) {
        this.mensDataProximoPagamento = value;
    }

    /**
     * Gets the value of the mensEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensEstado() {
        return mensEstado;
    }

    /**
     * Sets the value of the mensEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensEstado(String value) {
        this.mensEstado = value;
    }

    /**
     * Gets the value of the mensId property.
     * 
     */
    public int getMensId() {
        return mensId;
    }

    /**
     * Sets the value of the mensId property.
     * 
     */
    public void setMensId(int value) {
        this.mensId = value;
    }

}
