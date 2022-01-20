
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resposta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resposta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoLectivo" type="{http://webservice.centralserver.co.mz/}anoLectivo" minOccurs="0"/>
 *         &lt;element name="curso" type="{http://webservice.centralserver.co.mz/}curso" minOccurs="0"/>
 *         &lt;element name="disciplina" type="{http://webservice.centralserver.co.mz/}disciplina" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="resp_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resp_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resp_opcao1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resp_opcao2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resp_opcao3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resp_opcao4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resp_pergunta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resp_resposta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resposta", propOrder = {
    "anoLectivo",
    "curso",
    "disciplina",
    "encrypted",
    "entidade",
    "respCategoria",
    "respId",
    "respOpcao1",
    "respOpcao2",
    "respOpcao3",
    "respOpcao4",
    "respPergunta",
    "respResposta"
})
public class Resposta {

    protected AnoLectivo anoLectivo;
    protected Curso curso;
    protected Disciplina disciplina;
    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "resp_categoria")
    protected String respCategoria;
    @XmlElement(name = "resp_id")
    protected int respId;
    @XmlElement(name = "resp_opcao1")
    protected String respOpcao1;
    @XmlElement(name = "resp_opcao2")
    protected String respOpcao2;
    @XmlElement(name = "resp_opcao3")
    protected String respOpcao3;
    @XmlElement(name = "resp_opcao4")
    protected String respOpcao4;
    @XmlElement(name = "resp_pergunta")
    protected String respPergunta;
    @XmlElement(name = "resp_resposta")
    protected String respResposta;

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
     * Gets the value of the respCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCategoria() {
        return respCategoria;
    }

    /**
     * Sets the value of the respCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCategoria(String value) {
        this.respCategoria = value;
    }

    /**
     * Gets the value of the respId property.
     * 
     */
    public int getRespId() {
        return respId;
    }

    /**
     * Sets the value of the respId property.
     * 
     */
    public void setRespId(int value) {
        this.respId = value;
    }

    /**
     * Gets the value of the respOpcao1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespOpcao1() {
        return respOpcao1;
    }

    /**
     * Sets the value of the respOpcao1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespOpcao1(String value) {
        this.respOpcao1 = value;
    }

    /**
     * Gets the value of the respOpcao2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespOpcao2() {
        return respOpcao2;
    }

    /**
     * Sets the value of the respOpcao2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespOpcao2(String value) {
        this.respOpcao2 = value;
    }

    /**
     * Gets the value of the respOpcao3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespOpcao3() {
        return respOpcao3;
    }

    /**
     * Sets the value of the respOpcao3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespOpcao3(String value) {
        this.respOpcao3 = value;
    }

    /**
     * Gets the value of the respOpcao4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespOpcao4() {
        return respOpcao4;
    }

    /**
     * Sets the value of the respOpcao4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespOpcao4(String value) {
        this.respOpcao4 = value;
    }

    /**
     * Gets the value of the respPergunta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespPergunta() {
        return respPergunta;
    }

    /**
     * Sets the value of the respPergunta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespPergunta(String value) {
        this.respPergunta = value;
    }

    /**
     * Gets the value of the respResposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespResposta() {
        return respResposta;
    }

    /**
     * Sets the value of the respResposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespResposta(String value) {
        this.respResposta = value;
    }

}
