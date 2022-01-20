
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscaHorario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscaHorario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="hora_inicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hora_fim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaHorario", propOrder = {
    "entidade",
    "horaInicio",
    "horaFim"
})
public class BuscaHorario {

    protected Entidade entidade;
    @XmlElement(name = "hora_inicio")
    protected String horaInicio;
    @XmlElement(name = "hora_fim")
    protected String horaFim;

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
     * Gets the value of the horaInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Sets the value of the horaInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Gets the value of the horaFim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFim() {
        return horaFim;
    }

    /**
     * Sets the value of the horaFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFim(String value) {
        this.horaFim = value;
    }

}
