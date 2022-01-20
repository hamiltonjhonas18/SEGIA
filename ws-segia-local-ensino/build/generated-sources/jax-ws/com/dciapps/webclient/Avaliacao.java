
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for avaliacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="avaliacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="aval_anoLectivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aval_comportamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aval_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aval_observacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aval_semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "avaliacao", propOrder = {
    "aluno",
    "avalAnoLectivo",
    "avalComportamento",
    "avalId",
    "avalObservacoes",
    "avalSemestre",
    "encrypted",
    "entidade"
})
public class Avaliacao {

    protected Aluno aluno;
    @XmlElement(name = "aval_anoLectivo")
    protected int avalAnoLectivo;
    @XmlElement(name = "aval_comportamento")
    protected String avalComportamento;
    @XmlElement(name = "aval_id")
    protected int avalId;
    @XmlElement(name = "aval_observacoes")
    protected String avalObservacoes;
    @XmlElement(name = "aval_semestre")
    protected String avalSemestre;
    protected boolean encrypted;
    protected Entidade entidade;

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
     * Gets the value of the avalAnoLectivo property.
     * 
     */
    public int getAvalAnoLectivo() {
        return avalAnoLectivo;
    }

    /**
     * Sets the value of the avalAnoLectivo property.
     * 
     */
    public void setAvalAnoLectivo(int value) {
        this.avalAnoLectivo = value;
    }

    /**
     * Gets the value of the avalComportamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvalComportamento() {
        return avalComportamento;
    }

    /**
     * Sets the value of the avalComportamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvalComportamento(String value) {
        this.avalComportamento = value;
    }

    /**
     * Gets the value of the avalId property.
     * 
     */
    public int getAvalId() {
        return avalId;
    }

    /**
     * Sets the value of the avalId property.
     * 
     */
    public void setAvalId(int value) {
        this.avalId = value;
    }

    /**
     * Gets the value of the avalObservacoes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvalObservacoes() {
        return avalObservacoes;
    }

    /**
     * Sets the value of the avalObservacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvalObservacoes(String value) {
        this.avalObservacoes = value;
    }

    /**
     * Gets the value of the avalSemestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvalSemestre() {
        return avalSemestre;
    }

    /**
     * Sets the value of the avalSemestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvalSemestre(String value) {
        this.avalSemestre = value;
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
