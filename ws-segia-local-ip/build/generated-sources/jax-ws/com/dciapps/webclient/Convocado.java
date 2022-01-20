
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convocado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convocado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convo_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="convocatoria" type="{http://webservice.centralserver.co.mz/}convocatoria" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="pessoa" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convocado", propOrder = {
    "convoId",
    "convocatoria",
    "entidade",
    "escola",
    "pessoa"
})
public class Convocado {

    @XmlElement(name = "convo_id")
    protected int convoId;
    protected Convocatoria convocatoria;
    protected Entidade entidade;
    protected Escola escola;
    protected Pessoa pessoa;

    /**
     * Gets the value of the convoId property.
     * 
     */
    public int getConvoId() {
        return convoId;
    }

    /**
     * Sets the value of the convoId property.
     * 
     */
    public void setConvoId(int value) {
        this.convoId = value;
    }

    /**
     * Gets the value of the convocatoria property.
     * 
     * @return
     *     possible object is
     *     {@link Convocatoria }
     *     
     */
    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    /**
     * Sets the value of the convocatoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convocatoria }
     *     
     */
    public void setConvocatoria(Convocatoria value) {
        this.convocatoria = value;
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

}
