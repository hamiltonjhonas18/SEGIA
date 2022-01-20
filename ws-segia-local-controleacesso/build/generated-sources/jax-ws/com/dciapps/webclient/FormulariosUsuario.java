
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formulariosUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formulariosUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formu_d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formu_i" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formu_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formu_u" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formu_v" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formulario" type="{http://webservice.centralserver.co.mz/}formulario" minOccurs="0"/>
 *         &lt;element name="moduloUsuario" type="{http://webservice.centralserver.co.mz/}moduloUsuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formulariosUsuario", propOrder = {
    "formuD",
    "formuI",
    "formuId",
    "formuU",
    "formuV",
    "formulario",
    "moduloUsuario"
})
public class FormulariosUsuario {

    @XmlElement(name = "formu_d")
    protected boolean formuD;
    @XmlElement(name = "formu_i")
    protected boolean formuI;
    @XmlElement(name = "formu_id")
    protected int formuId;
    @XmlElement(name = "formu_u")
    protected boolean formuU;
    @XmlElement(name = "formu_v")
    protected boolean formuV;
    protected Formulario formulario;
    protected ModuloUsuario moduloUsuario;

    /**
     * Gets the value of the formuD property.
     * 
     */
    public boolean isFormuD() {
        return formuD;
    }

    /**
     * Sets the value of the formuD property.
     * 
     */
    public void setFormuD(boolean value) {
        this.formuD = value;
    }

    /**
     * Gets the value of the formuI property.
     * 
     */
    public boolean isFormuI() {
        return formuI;
    }

    /**
     * Sets the value of the formuI property.
     * 
     */
    public void setFormuI(boolean value) {
        this.formuI = value;
    }

    /**
     * Gets the value of the formuId property.
     * 
     */
    public int getFormuId() {
        return formuId;
    }

    /**
     * Sets the value of the formuId property.
     * 
     */
    public void setFormuId(int value) {
        this.formuId = value;
    }

    /**
     * Gets the value of the formuU property.
     * 
     */
    public boolean isFormuU() {
        return formuU;
    }

    /**
     * Sets the value of the formuU property.
     * 
     */
    public void setFormuU(boolean value) {
        this.formuU = value;
    }

    /**
     * Gets the value of the formuV property.
     * 
     */
    public boolean isFormuV() {
        return formuV;
    }

    /**
     * Sets the value of the formuV property.
     * 
     */
    public void setFormuV(boolean value) {
        this.formuV = value;
    }

    /**
     * Gets the value of the formulario property.
     * 
     * @return
     *     possible object is
     *     {@link Formulario }
     *     
     */
    public Formulario getFormulario() {
        return formulario;
    }

    /**
     * Sets the value of the formulario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formulario }
     *     
     */
    public void setFormulario(Formulario value) {
        this.formulario = value;
    }

    /**
     * Gets the value of the moduloUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link ModuloUsuario }
     *     
     */
    public ModuloUsuario getModuloUsuario() {
        return moduloUsuario;
    }

    /**
     * Sets the value of the moduloUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuloUsuario }
     *     
     */
    public void setModuloUsuario(ModuloUsuario value) {
        this.moduloUsuario = value;
    }

}
