
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vagas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vagas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="vaga_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vaga_preechidas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vaga_total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vagas", propOrder = {
    "anoLectivo",
    "curso",
    "encrypted",
    "entidade",
    "vagaId",
    "vagaPreechidas",
    "vagaTotal"
})
public class Vagas {

    protected AnoLectivo anoLectivo;
    protected Curso curso;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "vaga_id")
    protected int vagaId;
    @XmlElement(name = "vaga_preechidas")
    protected int vagaPreechidas;
    @XmlElement(name = "vaga_total")
    protected int vagaTotal;

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
     * Gets the value of the vagaId property.
     * 
     */
    public int getVagaId() {
        return vagaId;
    }

    /**
     * Sets the value of the vagaId property.
     * 
     */
    public void setVagaId(int value) {
        this.vagaId = value;
    }

    /**
     * Gets the value of the vagaPreechidas property.
     * 
     */
    public int getVagaPreechidas() {
        return vagaPreechidas;
    }

    /**
     * Sets the value of the vagaPreechidas property.
     * 
     */
    public void setVagaPreechidas(int value) {
        this.vagaPreechidas = value;
    }

    /**
     * Gets the value of the vagaTotal property.
     * 
     */
    public int getVagaTotal() {
        return vagaTotal;
    }

    /**
     * Sets the value of the vagaTotal property.
     * 
     */
    public void setVagaTotal(int value) {
        this.vagaTotal = value;
    }

}
