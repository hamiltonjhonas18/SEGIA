
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for moduloAcesso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moduloAcesso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidadeenti" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="moac_baseDados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moac_chaveAcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moac_chaveUsuarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moac_dataActivacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moac_dataFinalTrial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moac_dataFinalTrialEncry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moac_diasRemanescentes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="moac_diasRemanescentesEncry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moac_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moac_imagemFundo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moac_perfilCores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistema" type="{http://webservice.centralserver.co.mz/}sistema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moduloAcesso", propOrder = {
    "encrypted",
    "entidadeenti",
    "moacBaseDados",
    "moacChaveAcesso",
    "moacChaveUsuarios",
    "moacDataActivacao",
    "moacDataFinalTrial",
    "moacDataFinalTrialEncry",
    "moacDiasRemanescentes",
    "moacDiasRemanescentesEncry",
    "moacId",
    "moacImagemFundo",
    "moacPerfilCores",
    "sistema"
})
public class ModuloAcesso {

    protected boolean encrypted;
    protected Entidade entidadeenti;
    @XmlElement(name = "moac_baseDados")
    protected String moacBaseDados;
    @XmlElement(name = "moac_chaveAcesso")
    protected String moacChaveAcesso;
    @XmlElement(name = "moac_chaveUsuarios")
    protected String moacChaveUsuarios;
    @XmlElement(name = "moac_dataActivacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moacDataActivacao;
    @XmlElement(name = "moac_dataFinalTrial")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moacDataFinalTrial;
    @XmlElement(name = "moac_dataFinalTrialEncry")
    protected String moacDataFinalTrialEncry;
    @XmlElement(name = "moac_diasRemanescentes")
    protected Integer moacDiasRemanescentes;
    @XmlElement(name = "moac_diasRemanescentesEncry")
    protected String moacDiasRemanescentesEncry;
    @XmlElement(name = "moac_id")
    protected int moacId;
    @XmlElement(name = "moac_imagemFundo")
    protected String moacImagemFundo;
    @XmlElement(name = "moac_perfilCores")
    protected String moacPerfilCores;
    protected Sistema sistema;

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
     * Gets the value of the entidadeenti property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidadeenti() {
        return entidadeenti;
    }

    /**
     * Sets the value of the entidadeenti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidadeenti(Entidade value) {
        this.entidadeenti = value;
    }

    /**
     * Gets the value of the moacBaseDados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoacBaseDados() {
        return moacBaseDados;
    }

    /**
     * Sets the value of the moacBaseDados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoacBaseDados(String value) {
        this.moacBaseDados = value;
    }

    /**
     * Gets the value of the moacChaveAcesso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoacChaveAcesso() {
        return moacChaveAcesso;
    }

    /**
     * Sets the value of the moacChaveAcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoacChaveAcesso(String value) {
        this.moacChaveAcesso = value;
    }

    /**
     * Gets the value of the moacChaveUsuarios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoacChaveUsuarios() {
        return moacChaveUsuarios;
    }

    /**
     * Sets the value of the moacChaveUsuarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoacChaveUsuarios(String value) {
        this.moacChaveUsuarios = value;
    }

    /**
     * Gets the value of the moacDataActivacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoacDataActivacao() {
        return moacDataActivacao;
    }

    /**
     * Sets the value of the moacDataActivacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoacDataActivacao(XMLGregorianCalendar value) {
        this.moacDataActivacao = value;
    }

    /**
     * Gets the value of the moacDataFinalTrial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoacDataFinalTrial() {
        return moacDataFinalTrial;
    }

    /**
     * Sets the value of the moacDataFinalTrial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoacDataFinalTrial(XMLGregorianCalendar value) {
        this.moacDataFinalTrial = value;
    }

    /**
     * Gets the value of the moacDataFinalTrialEncry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoacDataFinalTrialEncry() {
        return moacDataFinalTrialEncry;
    }

    /**
     * Sets the value of the moacDataFinalTrialEncry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoacDataFinalTrialEncry(String value) {
        this.moacDataFinalTrialEncry = value;
    }

    /**
     * Gets the value of the moacDiasRemanescentes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoacDiasRemanescentes() {
        return moacDiasRemanescentes;
    }

    /**
     * Sets the value of the moacDiasRemanescentes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoacDiasRemanescentes(Integer value) {
        this.moacDiasRemanescentes = value;
    }

    /**
     * Gets the value of the moacDiasRemanescentesEncry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoacDiasRemanescentesEncry() {
        return moacDiasRemanescentesEncry;
    }

    /**
     * Sets the value of the moacDiasRemanescentesEncry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoacDiasRemanescentesEncry(String value) {
        this.moacDiasRemanescentesEncry = value;
    }

    /**
     * Gets the value of the moacId property.
     * 
     */
    public int getMoacId() {
        return moacId;
    }

    /**
     * Sets the value of the moacId property.
     * 
     */
    public void setMoacId(int value) {
        this.moacId = value;
    }

    /**
     * Gets the value of the moacImagemFundo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoacImagemFundo() {
        return moacImagemFundo;
    }

    /**
     * Sets the value of the moacImagemFundo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoacImagemFundo(String value) {
        this.moacImagemFundo = value;
    }

    /**
     * Gets the value of the moacPerfilCores property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoacPerfilCores() {
        return moacPerfilCores;
    }

    /**
     * Sets the value of the moacPerfilCores property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoacPerfilCores(String value) {
        this.moacPerfilCores = value;
    }

    /**
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistema(Sistema value) {
        this.sistema = value;
    }

}
