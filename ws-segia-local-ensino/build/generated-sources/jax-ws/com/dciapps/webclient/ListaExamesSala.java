
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaExamesSala complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaExamesSala">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="salaExame" type="{http://webservice.centralserver.co.mz/}salaExame" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaExamesSala", propOrder = {
    "entidade",
    "salaExame"
})
public class ListaExamesSala {

    protected Entidade entidade;
    protected SalaExame salaExame;

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
     * Gets the value of the salaExame property.
     * 
     * @return
     *     possible object is
     *     {@link SalaExame }
     *     
     */
    public SalaExame getSalaExame() {
        return salaExame;
    }

    /**
     * Sets the value of the salaExame property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaExame }
     *     
     */
    public void setSalaExame(SalaExame value) {
        this.salaExame = value;
    }

}
