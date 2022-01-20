
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for entidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enti_capital" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="enti_chaveSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_contactos1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_contactos2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_contactos3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_dataFinalAssistencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="enti_dataInicioAssitencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="enti_delegacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_dominio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_estadoSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_generoActividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enti_iva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="enti_licenca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_linguaSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_logotipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_macServidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_newsletter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enti_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_nuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_pessoaContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enti_sigla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entidade", propOrder = {
    "encrypted",
    "entiCapital",
    "entiChaveSistema",
    "entiCodigoPostal",
    "entiContactos1",
    "entiContactos2",
    "entiContactos3",
    "entiDataFinalAssistencia",
    "entiDataInicioAssitencia",
    "entiDelegacao",
    "entiDistrito",
    "entiDominio",
    "entiEmail",
    "entiEndereco",
    "entiEstadoSistema",
    "entiGeneroActividade",
    "entiId",
    "entiIva",
    "entiLicenca",
    "entiLinguaSistema",
    "entiLogotipo",
    "entiMacServidor",
    "entiNewsletter",
    "entiNome",
    "entiNuit",
    "entiPais",
    "entiPessoaContacto",
    "entiProvincia",
    "entiSigla"
})
public class Entidade {

    protected boolean encrypted;
    @XmlElement(name = "enti_capital")
    protected double entiCapital;
    @XmlElement(name = "enti_chaveSistema")
    protected String entiChaveSistema;
    @XmlElement(name = "enti_codigoPostal")
    protected String entiCodigoPostal;
    @XmlElement(name = "enti_contactos1")
    protected String entiContactos1;
    @XmlElement(name = "enti_contactos2")
    protected String entiContactos2;
    @XmlElement(name = "enti_contactos3")
    protected String entiContactos3;
    @XmlElement(name = "enti_dataFinalAssistencia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entiDataFinalAssistencia;
    @XmlElement(name = "enti_dataInicioAssitencia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entiDataInicioAssitencia;
    @XmlElement(name = "enti_delegacao")
    protected String entiDelegacao;
    @XmlElement(name = "enti_distrito")
    protected String entiDistrito;
    @XmlElement(name = "enti_dominio")
    protected String entiDominio;
    @XmlElement(name = "enti_email")
    protected String entiEmail;
    @XmlElement(name = "enti_endereco")
    protected String entiEndereco;
    @XmlElement(name = "enti_estadoSistema")
    protected String entiEstadoSistema;
    @XmlElement(name = "enti_generoActividade")
    protected String entiGeneroActividade;
    @XmlElement(name = "enti_id")
    protected int entiId;
    @XmlElement(name = "enti_iva")
    protected double entiIva;
    @XmlElement(name = "enti_licenca")
    protected String entiLicenca;
    @XmlElement(name = "enti_linguaSistema")
    protected String entiLinguaSistema;
    @XmlElement(name = "enti_logotipo")
    protected String entiLogotipo;
    @XmlElement(name = "enti_macServidor")
    protected String entiMacServidor;
    @XmlElement(name = "enti_newsletter")
    protected boolean entiNewsletter;
    @XmlElement(name = "enti_nome")
    protected String entiNome;
    @XmlElement(name = "enti_nuit")
    protected String entiNuit;
    @XmlElement(name = "enti_pais")
    protected String entiPais;
    @XmlElement(name = "enti_pessoaContacto")
    protected String entiPessoaContacto;
    @XmlElement(name = "enti_provincia")
    protected String entiProvincia;
    @XmlElement(name = "enti_sigla")
    protected String entiSigla;

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
     * Gets the value of the entiCapital property.
     * 
     */
    public double getEntiCapital() {
        return entiCapital;
    }

    /**
     * Sets the value of the entiCapital property.
     * 
     */
    public void setEntiCapital(double value) {
        this.entiCapital = value;
    }

    /**
     * Gets the value of the entiChaveSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiChaveSistema() {
        return entiChaveSistema;
    }

    /**
     * Sets the value of the entiChaveSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiChaveSistema(String value) {
        this.entiChaveSistema = value;
    }

    /**
     * Gets the value of the entiCodigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiCodigoPostal() {
        return entiCodigoPostal;
    }

    /**
     * Sets the value of the entiCodigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiCodigoPostal(String value) {
        this.entiCodigoPostal = value;
    }

    /**
     * Gets the value of the entiContactos1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiContactos1() {
        return entiContactos1;
    }

    /**
     * Sets the value of the entiContactos1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiContactos1(String value) {
        this.entiContactos1 = value;
    }

    /**
     * Gets the value of the entiContactos2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiContactos2() {
        return entiContactos2;
    }

    /**
     * Sets the value of the entiContactos2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiContactos2(String value) {
        this.entiContactos2 = value;
    }

    /**
     * Gets the value of the entiContactos3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiContactos3() {
        return entiContactos3;
    }

    /**
     * Sets the value of the entiContactos3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiContactos3(String value) {
        this.entiContactos3 = value;
    }

    /**
     * Gets the value of the entiDataFinalAssistencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntiDataFinalAssistencia() {
        return entiDataFinalAssistencia;
    }

    /**
     * Sets the value of the entiDataFinalAssistencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntiDataFinalAssistencia(XMLGregorianCalendar value) {
        this.entiDataFinalAssistencia = value;
    }

    /**
     * Gets the value of the entiDataInicioAssitencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntiDataInicioAssitencia() {
        return entiDataInicioAssitencia;
    }

    /**
     * Sets the value of the entiDataInicioAssitencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntiDataInicioAssitencia(XMLGregorianCalendar value) {
        this.entiDataInicioAssitencia = value;
    }

    /**
     * Gets the value of the entiDelegacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiDelegacao() {
        return entiDelegacao;
    }

    /**
     * Sets the value of the entiDelegacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiDelegacao(String value) {
        this.entiDelegacao = value;
    }

    /**
     * Gets the value of the entiDistrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiDistrito() {
        return entiDistrito;
    }

    /**
     * Sets the value of the entiDistrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiDistrito(String value) {
        this.entiDistrito = value;
    }

    /**
     * Gets the value of the entiDominio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiDominio() {
        return entiDominio;
    }

    /**
     * Sets the value of the entiDominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiDominio(String value) {
        this.entiDominio = value;
    }

    /**
     * Gets the value of the entiEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiEmail() {
        return entiEmail;
    }

    /**
     * Sets the value of the entiEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiEmail(String value) {
        this.entiEmail = value;
    }

    /**
     * Gets the value of the entiEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiEndereco() {
        return entiEndereco;
    }

    /**
     * Sets the value of the entiEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiEndereco(String value) {
        this.entiEndereco = value;
    }

    /**
     * Gets the value of the entiEstadoSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiEstadoSistema() {
        return entiEstadoSistema;
    }

    /**
     * Sets the value of the entiEstadoSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiEstadoSistema(String value) {
        this.entiEstadoSistema = value;
    }

    /**
     * Gets the value of the entiGeneroActividade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiGeneroActividade() {
        return entiGeneroActividade;
    }

    /**
     * Sets the value of the entiGeneroActividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiGeneroActividade(String value) {
        this.entiGeneroActividade = value;
    }

    /**
     * Gets the value of the entiId property.
     * 
     */
    public int getEntiId() {
        return entiId;
    }

    /**
     * Sets the value of the entiId property.
     * 
     */
    public void setEntiId(int value) {
        this.entiId = value;
    }

    /**
     * Gets the value of the entiIva property.
     * 
     */
    public double getEntiIva() {
        return entiIva;
    }

    /**
     * Sets the value of the entiIva property.
     * 
     */
    public void setEntiIva(double value) {
        this.entiIva = value;
    }

    /**
     * Gets the value of the entiLicenca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiLicenca() {
        return entiLicenca;
    }

    /**
     * Sets the value of the entiLicenca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiLicenca(String value) {
        this.entiLicenca = value;
    }

    /**
     * Gets the value of the entiLinguaSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiLinguaSistema() {
        return entiLinguaSistema;
    }

    /**
     * Sets the value of the entiLinguaSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiLinguaSistema(String value) {
        this.entiLinguaSistema = value;
    }

    /**
     * Gets the value of the entiLogotipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiLogotipo() {
        return entiLogotipo;
    }

    /**
     * Sets the value of the entiLogotipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiLogotipo(String value) {
        this.entiLogotipo = value;
    }

    /**
     * Gets the value of the entiMacServidor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiMacServidor() {
        return entiMacServidor;
    }

    /**
     * Sets the value of the entiMacServidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiMacServidor(String value) {
        this.entiMacServidor = value;
    }

    /**
     * Gets the value of the entiNewsletter property.
     * 
     */
    public boolean isEntiNewsletter() {
        return entiNewsletter;
    }

    /**
     * Sets the value of the entiNewsletter property.
     * 
     */
    public void setEntiNewsletter(boolean value) {
        this.entiNewsletter = value;
    }

    /**
     * Gets the value of the entiNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiNome() {
        return entiNome;
    }

    /**
     * Sets the value of the entiNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiNome(String value) {
        this.entiNome = value;
    }

    /**
     * Gets the value of the entiNuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiNuit() {
        return entiNuit;
    }

    /**
     * Sets the value of the entiNuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiNuit(String value) {
        this.entiNuit = value;
    }

    /**
     * Gets the value of the entiPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiPais() {
        return entiPais;
    }

    /**
     * Sets the value of the entiPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiPais(String value) {
        this.entiPais = value;
    }

    /**
     * Gets the value of the entiPessoaContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiPessoaContacto() {
        return entiPessoaContacto;
    }

    /**
     * Sets the value of the entiPessoaContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiPessoaContacto(String value) {
        this.entiPessoaContacto = value;
    }

    /**
     * Gets the value of the entiProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiProvincia() {
        return entiProvincia;
    }

    /**
     * Sets the value of the entiProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiProvincia(String value) {
        this.entiProvincia = value;
    }

    /**
     * Gets the value of the entiSigla property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntiSigla() {
        return entiSigla;
    }

    /**
     * Sets the value of the entiSigla property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntiSigla(String value) {
        this.entiSigla = value;
    }

}
