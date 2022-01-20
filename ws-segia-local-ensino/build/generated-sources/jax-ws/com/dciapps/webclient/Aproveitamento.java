
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aproveitamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aproveitamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apro_admitidos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apro_ano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apro_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apro_dispensados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apro_exames" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apro_excluidos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apro_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="apro_reprovados" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cod_escola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aproveitamento", propOrder = {
    "aproAdmitidos",
    "aproAno",
    "aproCategoria",
    "aproDispensados",
    "aproExames",
    "aproExcluidos",
    "aproId",
    "aproReprovados",
    "codEscola"
})
public class Aproveitamento {

    @XmlElement(name = "apro_admitidos")
    protected int aproAdmitidos;
    @XmlElement(name = "apro_ano")
    protected String aproAno;
    @XmlElement(name = "apro_categoria")
    protected String aproCategoria;
    @XmlElement(name = "apro_dispensados")
    protected int aproDispensados;
    @XmlElement(name = "apro_exames")
    protected int aproExames;
    @XmlElement(name = "apro_excluidos")
    protected int aproExcluidos;
    @XmlElement(name = "apro_id")
    protected int aproId;
    @XmlElement(name = "apro_reprovados")
    protected int aproReprovados;
    @XmlElement(name = "cod_escola")
    protected String codEscola;

    /**
     * Gets the value of the aproAdmitidos property.
     * 
     */
    public int getAproAdmitidos() {
        return aproAdmitidos;
    }

    /**
     * Sets the value of the aproAdmitidos property.
     * 
     */
    public void setAproAdmitidos(int value) {
        this.aproAdmitidos = value;
    }

    /**
     * Gets the value of the aproAno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAproAno() {
        return aproAno;
    }

    /**
     * Sets the value of the aproAno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAproAno(String value) {
        this.aproAno = value;
    }

    /**
     * Gets the value of the aproCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAproCategoria() {
        return aproCategoria;
    }

    /**
     * Sets the value of the aproCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAproCategoria(String value) {
        this.aproCategoria = value;
    }

    /**
     * Gets the value of the aproDispensados property.
     * 
     */
    public int getAproDispensados() {
        return aproDispensados;
    }

    /**
     * Sets the value of the aproDispensados property.
     * 
     */
    public void setAproDispensados(int value) {
        this.aproDispensados = value;
    }

    /**
     * Gets the value of the aproExames property.
     * 
     */
    public int getAproExames() {
        return aproExames;
    }

    /**
     * Sets the value of the aproExames property.
     * 
     */
    public void setAproExames(int value) {
        this.aproExames = value;
    }

    /**
     * Gets the value of the aproExcluidos property.
     * 
     */
    public int getAproExcluidos() {
        return aproExcluidos;
    }

    /**
     * Sets the value of the aproExcluidos property.
     * 
     */
    public void setAproExcluidos(int value) {
        this.aproExcluidos = value;
    }

    /**
     * Gets the value of the aproId property.
     * 
     */
    public int getAproId() {
        return aproId;
    }

    /**
     * Sets the value of the aproId property.
     * 
     */
    public void setAproId(int value) {
        this.aproId = value;
    }

    /**
     * Gets the value of the aproReprovados property.
     * 
     */
    public int getAproReprovados() {
        return aproReprovados;
    }

    /**
     * Sets the value of the aproReprovados property.
     * 
     */
    public void setAproReprovados(int value) {
        this.aproReprovados = value;
    }

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

}
