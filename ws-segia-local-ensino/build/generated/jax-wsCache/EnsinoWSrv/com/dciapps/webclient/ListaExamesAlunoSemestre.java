
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaExamesAlunoSemestre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaExamesAlunoSemestre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="anoLectivo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaExamesAlunoSemestre", propOrder = {
    "entidade",
    "anoLectivo",
    "semestre",
    "aluno"
})
public class ListaExamesAlunoSemestre {

    protected Entidade entidade;
    protected int anoLectivo;
    protected String semestre;
    protected Aluno aluno;

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
     * Gets the value of the anoLectivo property.
     * 
     */
    public int getAnoLectivo() {
        return anoLectivo;
    }

    /**
     * Sets the value of the anoLectivo property.
     * 
     */
    public void setAnoLectivo(int value) {
        this.anoLectivo = value;
    }

    /**
     * Gets the value of the semestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Sets the value of the semestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemestre(String value) {
        this.semestre = value;
    }

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

}
