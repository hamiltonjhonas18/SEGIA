
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cargo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="car_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cargo", propOrder = {
    "carId",
    "carNome",
    "encrypted",
    "entidade"
})
public class Cargo {

    @XmlElement(name = "car_id")
    protected int carId;
    @XmlElement(name = "car_nome")
    protected String carNome;
    protected boolean encrypted;
    protected Entidade entidade;

    /**
     * Gets the value of the carId property.
     * 
     */
    public int getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     */
    public void setCarId(int value) {
        this.carId = value;
    }

    /**
     * Gets the value of the carNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNome() {
        return carNome;
    }

    /**
     * Sets the value of the carNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNome(String value) {
        this.carNome = value;
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
