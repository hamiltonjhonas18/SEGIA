
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matricula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_escola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matr_ano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matr_assistente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_classe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matr_continuante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_faixa_05" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_faixa_1115" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_faixa_1625" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_faixa_2635" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_faixa_35" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_faixa_610" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_homens" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_mulheres" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_novo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_repetente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_transferido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_turmas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matr_vuneraveis" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matricula", propOrder = {
    "codEscola",
    "matrAno",
    "matrAssistente",
    "matrClasse",
    "matrContinuante",
    "matrFaixa05",
    "matrFaixa1115",
    "matrFaixa1625",
    "matrFaixa2635",
    "matrFaixa35",
    "matrFaixa610",
    "matrHomens",
    "matrId",
    "matrMulheres",
    "matrNovo",
    "matrRepetente",
    "matrTransferido",
    "matrTurmas",
    "matrVuneraveis"
})
public class Matricula {

    @XmlElement(name = "cod_escola")
    protected String codEscola;
    @XmlElement(name = "matr_ano")
    protected String matrAno;
    @XmlElement(name = "matr_assistente")
    protected int matrAssistente;
    @XmlElement(name = "matr_classe")
    protected String matrClasse;
    @XmlElement(name = "matr_continuante")
    protected int matrContinuante;
    @XmlElement(name = "matr_faixa_05")
    protected int matrFaixa05;
    @XmlElement(name = "matr_faixa_1115")
    protected int matrFaixa1115;
    @XmlElement(name = "matr_faixa_1625")
    protected int matrFaixa1625;
    @XmlElement(name = "matr_faixa_2635")
    protected int matrFaixa2635;
    @XmlElement(name = "matr_faixa_35")
    protected int matrFaixa35;
    @XmlElement(name = "matr_faixa_610")
    protected int matrFaixa610;
    @XmlElement(name = "matr_homens")
    protected int matrHomens;
    @XmlElement(name = "matr_id")
    protected int matrId;
    @XmlElement(name = "matr_mulheres")
    protected int matrMulheres;
    @XmlElement(name = "matr_novo")
    protected int matrNovo;
    @XmlElement(name = "matr_repetente")
    protected int matrRepetente;
    @XmlElement(name = "matr_transferido")
    protected int matrTransferido;
    @XmlElement(name = "matr_turmas")
    protected int matrTurmas;
    @XmlElement(name = "matr_vuneraveis")
    protected int matrVuneraveis;

    /**
     * Gets the value of the codEscola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEscola() {
        return codEscola;
    }

    /**
     * Sets the value of the codEscola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEscola(String value) {
        this.codEscola = value;
    }

    /**
     * Gets the value of the matrAno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrAno() {
        return matrAno;
    }

    /**
     * Sets the value of the matrAno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrAno(String value) {
        this.matrAno = value;
    }

    /**
     * Gets the value of the matrAssistente property.
     * 
     */
    public int getMatrAssistente() {
        return matrAssistente;
    }

    /**
     * Sets the value of the matrAssistente property.
     * 
     */
    public void setMatrAssistente(int value) {
        this.matrAssistente = value;
    }

    /**
     * Gets the value of the matrClasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrClasse() {
        return matrClasse;
    }

    /**
     * Sets the value of the matrClasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrClasse(String value) {
        this.matrClasse = value;
    }

    /**
     * Gets the value of the matrContinuante property.
     * 
     */
    public int getMatrContinuante() {
        return matrContinuante;
    }

    /**
     * Sets the value of the matrContinuante property.
     * 
     */
    public void setMatrContinuante(int value) {
        this.matrContinuante = value;
    }

    /**
     * Gets the value of the matrFaixa05 property.
     * 
     */
    public int getMatrFaixa05() {
        return matrFaixa05;
    }

    /**
     * Sets the value of the matrFaixa05 property.
     * 
     */
    public void setMatrFaixa05(int value) {
        this.matrFaixa05 = value;
    }

    /**
     * Gets the value of the matrFaixa1115 property.
     * 
     */
    public int getMatrFaixa1115() {
        return matrFaixa1115;
    }

    /**
     * Sets the value of the matrFaixa1115 property.
     * 
     */
    public void setMatrFaixa1115(int value) {
        this.matrFaixa1115 = value;
    }

    /**
     * Gets the value of the matrFaixa1625 property.
     * 
     */
    public int getMatrFaixa1625() {
        return matrFaixa1625;
    }

    /**
     * Sets the value of the matrFaixa1625 property.
     * 
     */
    public void setMatrFaixa1625(int value) {
        this.matrFaixa1625 = value;
    }

    /**
     * Gets the value of the matrFaixa2635 property.
     * 
     */
    public int getMatrFaixa2635() {
        return matrFaixa2635;
    }

    /**
     * Sets the value of the matrFaixa2635 property.
     * 
     */
    public void setMatrFaixa2635(int value) {
        this.matrFaixa2635 = value;
    }

    /**
     * Gets the value of the matrFaixa35 property.
     * 
     */
    public int getMatrFaixa35() {
        return matrFaixa35;
    }

    /**
     * Sets the value of the matrFaixa35 property.
     * 
     */
    public void setMatrFaixa35(int value) {
        this.matrFaixa35 = value;
    }

    /**
     * Gets the value of the matrFaixa610 property.
     * 
     */
    public int getMatrFaixa610() {
        return matrFaixa610;
    }

    /**
     * Sets the value of the matrFaixa610 property.
     * 
     */
    public void setMatrFaixa610(int value) {
        this.matrFaixa610 = value;
    }

    /**
     * Gets the value of the matrHomens property.
     * 
     */
    public int getMatrHomens() {
        return matrHomens;
    }

    /**
     * Sets the value of the matrHomens property.
     * 
     */
    public void setMatrHomens(int value) {
        this.matrHomens = value;
    }

    /**
     * Gets the value of the matrId property.
     * 
     */
    public int getMatrId() {
        return matrId;
    }

    /**
     * Sets the value of the matrId property.
     * 
     */
    public void setMatrId(int value) {
        this.matrId = value;
    }

    /**
     * Gets the value of the matrMulheres property.
     * 
     */
    public int getMatrMulheres() {
        return matrMulheres;
    }

    /**
     * Sets the value of the matrMulheres property.
     * 
     */
    public void setMatrMulheres(int value) {
        this.matrMulheres = value;
    }

    /**
     * Gets the value of the matrNovo property.
     * 
     */
    public int getMatrNovo() {
        return matrNovo;
    }

    /**
     * Sets the value of the matrNovo property.
     * 
     */
    public void setMatrNovo(int value) {
        this.matrNovo = value;
    }

    /**
     * Gets the value of the matrRepetente property.
     * 
     */
    public int getMatrRepetente() {
        return matrRepetente;
    }

    /**
     * Sets the value of the matrRepetente property.
     * 
     */
    public void setMatrRepetente(int value) {
        this.matrRepetente = value;
    }

    /**
     * Gets the value of the matrTransferido property.
     * 
     */
    public int getMatrTransferido() {
        return matrTransferido;
    }

    /**
     * Sets the value of the matrTransferido property.
     * 
     */
    public void setMatrTransferido(int value) {
        this.matrTransferido = value;
    }

    /**
     * Gets the value of the matrTurmas property.
     * 
     */
    public int getMatrTurmas() {
        return matrTurmas;
    }

    /**
     * Sets the value of the matrTurmas property.
     * 
     */
    public void setMatrTurmas(int value) {
        this.matrTurmas = value;
    }

    /**
     * Gets the value of the matrVuneraveis property.
     * 
     */
    public int getMatrVuneraveis() {
        return matrVuneraveis;
    }

    /**
     * Sets the value of the matrVuneraveis property.
     * 
     */
    public void setMatrVuneraveis(int value) {
        this.matrVuneraveis = value;
    }

}
