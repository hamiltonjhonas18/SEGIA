
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pessoa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pessoa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="nacionalidadenaci" type="{http://webservice.centralserver.co.mz/}nacionalidade" minOccurs="0"/>
 *         &lt;element name="pess_actividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_altura" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="pess_apelido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_bi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_cPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_contacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_contactoMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_contactoPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_dataCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pess_dataEmissaoBi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_dataNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pess_dataValidadeBi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_educacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_generoActividae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_generoAlimentacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_generoBebida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_generoCultura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_generoEntretenimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_generoFilme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_generoMusica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_grauParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_hobbie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pess_lingua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_localTrabalho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_nomeMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_nomePai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_nuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_numeroCasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_origemRegisto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_profissaoMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_profissaoPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_raca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_relegiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_responsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_rua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_sinais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_skills" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_sobre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_trabalhoMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_trabalhoPai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pess_vicios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoa", propOrder = {
    "encrypted",
    "entidade",
    "nacionalidadenaci",
    "pessActividade",
    "pessAltura",
    "pessApelido",
    "pessBairro",
    "pessBi",
    "pessCPostal",
    "pessCidade",
    "pessContacto",
    "pessContactoMae",
    "pessContactoPai",
    "pessDataCadastro",
    "pessDataEmissaoBi",
    "pessDataNascimento",
    "pessDataValidadeBi",
    "pessDistrito",
    "pessDocumento",
    "pessEducacao",
    "pessEmail",
    "pessEstadoCivil",
    "pessFoto",
    "pessGeneroActividae",
    "pessGeneroAlimentacao",
    "pessGeneroBebida",
    "pessGeneroCultura",
    "pessGeneroEntretenimento",
    "pessGeneroFilme",
    "pessGeneroMusica",
    "pessGrauParentesco",
    "pessHobbie",
    "pessId",
    "pessLingua",
    "pessLocalTrabalho",
    "pessNome",
    "pessNomeMae",
    "pessNomePai",
    "pessNuit",
    "pessNumeroCasa",
    "pessOrigemRegisto",
    "pessPais",
    "pessProfissaoMae",
    "pessProfissaoPai",
    "pessProvincia",
    "pessRaca",
    "pessRelegiao",
    "pessResponsavel",
    "pessRua",
    "pessSector",
    "pessSexo",
    "pessSinais",
    "pessSkills",
    "pessSobre",
    "pessTipo",
    "pessTrabalhoMae",
    "pessTrabalhoPai",
    "pessVicios"
})
public class Pessoa {

    protected boolean encrypted;
    protected Entidade entidade;
    protected Nacionalidade nacionalidadenaci;
    @XmlElement(name = "pess_actividade")
    protected String pessActividade;
    @XmlElement(name = "pess_altura")
    protected Float pessAltura;
    @XmlElement(name = "pess_apelido")
    protected String pessApelido;
    @XmlElement(name = "pess_bairro")
    protected String pessBairro;
    @XmlElement(name = "pess_bi")
    protected String pessBi;
    @XmlElement(name = "pess_cPostal")
    protected String pessCPostal;
    @XmlElement(name = "pess_cidade")
    protected String pessCidade;
    @XmlElement(name = "pess_contacto")
    protected String pessContacto;
    @XmlElement(name = "pess_contactoMae")
    protected String pessContactoMae;
    @XmlElement(name = "pess_contactoPai")
    protected String pessContactoPai;
    @XmlElement(name = "pess_dataCadastro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pessDataCadastro;
    @XmlElement(name = "pess_dataEmissaoBi")
    protected String pessDataEmissaoBi;
    @XmlElement(name = "pess_dataNascimento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pessDataNascimento;
    @XmlElement(name = "pess_dataValidadeBi")
    protected String pessDataValidadeBi;
    @XmlElement(name = "pess_distrito")
    protected String pessDistrito;
    @XmlElement(name = "pess_documento")
    protected String pessDocumento;
    @XmlElement(name = "pess_educacao")
    protected String pessEducacao;
    @XmlElement(name = "pess_email")
    protected String pessEmail;
    @XmlElement(name = "pess_estadoCivil")
    protected String pessEstadoCivil;
    @XmlElement(name = "pess_foto")
    protected String pessFoto;
    @XmlElement(name = "pess_generoActividae")
    protected String pessGeneroActividae;
    @XmlElement(name = "pess_generoAlimentacao")
    protected String pessGeneroAlimentacao;
    @XmlElement(name = "pess_generoBebida")
    protected String pessGeneroBebida;
    @XmlElement(name = "pess_generoCultura")
    protected String pessGeneroCultura;
    @XmlElement(name = "pess_generoEntretenimento")
    protected String pessGeneroEntretenimento;
    @XmlElement(name = "pess_generoFilme")
    protected String pessGeneroFilme;
    @XmlElement(name = "pess_generoMusica")
    protected String pessGeneroMusica;
    @XmlElement(name = "pess_grauParentesco")
    protected String pessGrauParentesco;
    @XmlElement(name = "pess_hobbie")
    protected String pessHobbie;
    @XmlElement(name = "pess_id")
    protected int pessId;
    @XmlElement(name = "pess_lingua")
    protected String pessLingua;
    @XmlElement(name = "pess_localTrabalho")
    protected String pessLocalTrabalho;
    @XmlElement(name = "pess_nome")
    protected String pessNome;
    @XmlElement(name = "pess_nomeMae")
    protected String pessNomeMae;
    @XmlElement(name = "pess_nomePai")
    protected String pessNomePai;
    @XmlElement(name = "pess_nuit")
    protected String pessNuit;
    @XmlElement(name = "pess_numeroCasa")
    protected String pessNumeroCasa;
    @XmlElement(name = "pess_origemRegisto")
    protected String pessOrigemRegisto;
    @XmlElement(name = "pess_pais")
    protected String pessPais;
    @XmlElement(name = "pess_profissaoMae")
    protected String pessProfissaoMae;
    @XmlElement(name = "pess_profissaoPai")
    protected String pessProfissaoPai;
    @XmlElement(name = "pess_provincia")
    protected String pessProvincia;
    @XmlElement(name = "pess_raca")
    protected String pessRaca;
    @XmlElement(name = "pess_relegiao")
    protected String pessRelegiao;
    @XmlElement(name = "pess_responsavel")
    protected String pessResponsavel;
    @XmlElement(name = "pess_rua")
    protected String pessRua;
    @XmlElement(name = "pess_sector")
    protected String pessSector;
    @XmlElement(name = "pess_sexo")
    protected String pessSexo;
    @XmlElement(name = "pess_sinais")
    protected String pessSinais;
    @XmlElement(name = "pess_skills")
    protected String pessSkills;
    @XmlElement(name = "pess_sobre")
    protected String pessSobre;
    @XmlElement(name = "pess_tipo")
    protected String pessTipo;
    @XmlElement(name = "pess_trabalhoMae")
    protected String pessTrabalhoMae;
    @XmlElement(name = "pess_trabalhoPai")
    protected String pessTrabalhoPai;
    @XmlElement(name = "pess_vicios")
    protected String pessVicios;

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
     * Gets the value of the nacionalidadenaci property.
     * 
     * @return
     *     possible object is
     *     {@link Nacionalidade }
     *     
     */
    public Nacionalidade getNacionalidadenaci() {
        return nacionalidadenaci;
    }

    /**
     * Sets the value of the nacionalidadenaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nacionalidade }
     *     
     */
    public void setNacionalidadenaci(Nacionalidade value) {
        this.nacionalidadenaci = value;
    }

    /**
     * Gets the value of the pessActividade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessActividade() {
        return pessActividade;
    }

    /**
     * Sets the value of the pessActividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessActividade(String value) {
        this.pessActividade = value;
    }

    /**
     * Gets the value of the pessAltura property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPessAltura() {
        return pessAltura;
    }

    /**
     * Sets the value of the pessAltura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPessAltura(Float value) {
        this.pessAltura = value;
    }

    /**
     * Gets the value of the pessApelido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessApelido() {
        return pessApelido;
    }

    /**
     * Sets the value of the pessApelido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessApelido(String value) {
        this.pessApelido = value;
    }

    /**
     * Gets the value of the pessBairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessBairro() {
        return pessBairro;
    }

    /**
     * Sets the value of the pessBairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessBairro(String value) {
        this.pessBairro = value;
    }

    /**
     * Gets the value of the pessBi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessBi() {
        return pessBi;
    }

    /**
     * Sets the value of the pessBi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessBi(String value) {
        this.pessBi = value;
    }

    /**
     * Gets the value of the pessCPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessCPostal() {
        return pessCPostal;
    }

    /**
     * Sets the value of the pessCPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessCPostal(String value) {
        this.pessCPostal = value;
    }

    /**
     * Gets the value of the pessCidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessCidade() {
        return pessCidade;
    }

    /**
     * Sets the value of the pessCidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessCidade(String value) {
        this.pessCidade = value;
    }

    /**
     * Gets the value of the pessContacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessContacto() {
        return pessContacto;
    }

    /**
     * Sets the value of the pessContacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessContacto(String value) {
        this.pessContacto = value;
    }

    /**
     * Gets the value of the pessContactoMae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessContactoMae() {
        return pessContactoMae;
    }

    /**
     * Sets the value of the pessContactoMae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessContactoMae(String value) {
        this.pessContactoMae = value;
    }

    /**
     * Gets the value of the pessContactoPai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessContactoPai() {
        return pessContactoPai;
    }

    /**
     * Sets the value of the pessContactoPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessContactoPai(String value) {
        this.pessContactoPai = value;
    }

    /**
     * Gets the value of the pessDataCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPessDataCadastro() {
        return pessDataCadastro;
    }

    /**
     * Sets the value of the pessDataCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPessDataCadastro(XMLGregorianCalendar value) {
        this.pessDataCadastro = value;
    }

    /**
     * Gets the value of the pessDataEmissaoBi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessDataEmissaoBi() {
        return pessDataEmissaoBi;
    }

    /**
     * Sets the value of the pessDataEmissaoBi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessDataEmissaoBi(String value) {
        this.pessDataEmissaoBi = value;
    }

    /**
     * Gets the value of the pessDataNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPessDataNascimento() {
        return pessDataNascimento;
    }

    /**
     * Sets the value of the pessDataNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPessDataNascimento(XMLGregorianCalendar value) {
        this.pessDataNascimento = value;
    }

    /**
     * Gets the value of the pessDataValidadeBi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessDataValidadeBi() {
        return pessDataValidadeBi;
    }

    /**
     * Sets the value of the pessDataValidadeBi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessDataValidadeBi(String value) {
        this.pessDataValidadeBi = value;
    }

    /**
     * Gets the value of the pessDistrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessDistrito() {
        return pessDistrito;
    }

    /**
     * Sets the value of the pessDistrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessDistrito(String value) {
        this.pessDistrito = value;
    }

    /**
     * Gets the value of the pessDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessDocumento() {
        return pessDocumento;
    }

    /**
     * Sets the value of the pessDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessDocumento(String value) {
        this.pessDocumento = value;
    }

    /**
     * Gets the value of the pessEducacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessEducacao() {
        return pessEducacao;
    }

    /**
     * Sets the value of the pessEducacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessEducacao(String value) {
        this.pessEducacao = value;
    }

    /**
     * Gets the value of the pessEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessEmail() {
        return pessEmail;
    }

    /**
     * Sets the value of the pessEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessEmail(String value) {
        this.pessEmail = value;
    }

    /**
     * Gets the value of the pessEstadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessEstadoCivil() {
        return pessEstadoCivil;
    }

    /**
     * Sets the value of the pessEstadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessEstadoCivil(String value) {
        this.pessEstadoCivil = value;
    }

    /**
     * Gets the value of the pessFoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessFoto() {
        return pessFoto;
    }

    /**
     * Sets the value of the pessFoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessFoto(String value) {
        this.pessFoto = value;
    }

    /**
     * Gets the value of the pessGeneroActividae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGeneroActividae() {
        return pessGeneroActividae;
    }

    /**
     * Sets the value of the pessGeneroActividae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGeneroActividae(String value) {
        this.pessGeneroActividae = value;
    }

    /**
     * Gets the value of the pessGeneroAlimentacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGeneroAlimentacao() {
        return pessGeneroAlimentacao;
    }

    /**
     * Sets the value of the pessGeneroAlimentacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGeneroAlimentacao(String value) {
        this.pessGeneroAlimentacao = value;
    }

    /**
     * Gets the value of the pessGeneroBebida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGeneroBebida() {
        return pessGeneroBebida;
    }

    /**
     * Sets the value of the pessGeneroBebida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGeneroBebida(String value) {
        this.pessGeneroBebida = value;
    }

    /**
     * Gets the value of the pessGeneroCultura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGeneroCultura() {
        return pessGeneroCultura;
    }

    /**
     * Sets the value of the pessGeneroCultura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGeneroCultura(String value) {
        this.pessGeneroCultura = value;
    }

    /**
     * Gets the value of the pessGeneroEntretenimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGeneroEntretenimento() {
        return pessGeneroEntretenimento;
    }

    /**
     * Sets the value of the pessGeneroEntretenimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGeneroEntretenimento(String value) {
        this.pessGeneroEntretenimento = value;
    }

    /**
     * Gets the value of the pessGeneroFilme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGeneroFilme() {
        return pessGeneroFilme;
    }

    /**
     * Sets the value of the pessGeneroFilme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGeneroFilme(String value) {
        this.pessGeneroFilme = value;
    }

    /**
     * Gets the value of the pessGeneroMusica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGeneroMusica() {
        return pessGeneroMusica;
    }

    /**
     * Sets the value of the pessGeneroMusica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGeneroMusica(String value) {
        this.pessGeneroMusica = value;
    }

    /**
     * Gets the value of the pessGrauParentesco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessGrauParentesco() {
        return pessGrauParentesco;
    }

    /**
     * Sets the value of the pessGrauParentesco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessGrauParentesco(String value) {
        this.pessGrauParentesco = value;
    }

    /**
     * Gets the value of the pessHobbie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessHobbie() {
        return pessHobbie;
    }

    /**
     * Sets the value of the pessHobbie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessHobbie(String value) {
        this.pessHobbie = value;
    }

    /**
     * Gets the value of the pessId property.
     * 
     */
    public int getPessId() {
        return pessId;
    }

    /**
     * Sets the value of the pessId property.
     * 
     */
    public void setPessId(int value) {
        this.pessId = value;
    }

    /**
     * Gets the value of the pessLingua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessLingua() {
        return pessLingua;
    }

    /**
     * Sets the value of the pessLingua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessLingua(String value) {
        this.pessLingua = value;
    }

    /**
     * Gets the value of the pessLocalTrabalho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessLocalTrabalho() {
        return pessLocalTrabalho;
    }

    /**
     * Sets the value of the pessLocalTrabalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessLocalTrabalho(String value) {
        this.pessLocalTrabalho = value;
    }

    /**
     * Gets the value of the pessNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessNome() {
        return pessNome;
    }

    /**
     * Sets the value of the pessNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessNome(String value) {
        this.pessNome = value;
    }

    /**
     * Gets the value of the pessNomeMae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessNomeMae() {
        return pessNomeMae;
    }

    /**
     * Sets the value of the pessNomeMae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessNomeMae(String value) {
        this.pessNomeMae = value;
    }

    /**
     * Gets the value of the pessNomePai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessNomePai() {
        return pessNomePai;
    }

    /**
     * Sets the value of the pessNomePai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessNomePai(String value) {
        this.pessNomePai = value;
    }

    /**
     * Gets the value of the pessNuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessNuit() {
        return pessNuit;
    }

    /**
     * Sets the value of the pessNuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessNuit(String value) {
        this.pessNuit = value;
    }

    /**
     * Gets the value of the pessNumeroCasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessNumeroCasa() {
        return pessNumeroCasa;
    }

    /**
     * Sets the value of the pessNumeroCasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessNumeroCasa(String value) {
        this.pessNumeroCasa = value;
    }

    /**
     * Gets the value of the pessOrigemRegisto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessOrigemRegisto() {
        return pessOrigemRegisto;
    }

    /**
     * Sets the value of the pessOrigemRegisto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessOrigemRegisto(String value) {
        this.pessOrigemRegisto = value;
    }

    /**
     * Gets the value of the pessPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessPais() {
        return pessPais;
    }

    /**
     * Sets the value of the pessPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessPais(String value) {
        this.pessPais = value;
    }

    /**
     * Gets the value of the pessProfissaoMae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessProfissaoMae() {
        return pessProfissaoMae;
    }

    /**
     * Sets the value of the pessProfissaoMae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessProfissaoMae(String value) {
        this.pessProfissaoMae = value;
    }

    /**
     * Gets the value of the pessProfissaoPai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessProfissaoPai() {
        return pessProfissaoPai;
    }

    /**
     * Sets the value of the pessProfissaoPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessProfissaoPai(String value) {
        this.pessProfissaoPai = value;
    }

    /**
     * Gets the value of the pessProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessProvincia() {
        return pessProvincia;
    }

    /**
     * Sets the value of the pessProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessProvincia(String value) {
        this.pessProvincia = value;
    }

    /**
     * Gets the value of the pessRaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessRaca() {
        return pessRaca;
    }

    /**
     * Sets the value of the pessRaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessRaca(String value) {
        this.pessRaca = value;
    }

    /**
     * Gets the value of the pessRelegiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessRelegiao() {
        return pessRelegiao;
    }

    /**
     * Sets the value of the pessRelegiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessRelegiao(String value) {
        this.pessRelegiao = value;
    }

    /**
     * Gets the value of the pessResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessResponsavel() {
        return pessResponsavel;
    }

    /**
     * Sets the value of the pessResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessResponsavel(String value) {
        this.pessResponsavel = value;
    }

    /**
     * Gets the value of the pessRua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessRua() {
        return pessRua;
    }

    /**
     * Sets the value of the pessRua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessRua(String value) {
        this.pessRua = value;
    }

    /**
     * Gets the value of the pessSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessSector() {
        return pessSector;
    }

    /**
     * Sets the value of the pessSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessSector(String value) {
        this.pessSector = value;
    }

    /**
     * Gets the value of the pessSexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessSexo() {
        return pessSexo;
    }

    /**
     * Sets the value of the pessSexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessSexo(String value) {
        this.pessSexo = value;
    }

    /**
     * Gets the value of the pessSinais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessSinais() {
        return pessSinais;
    }

    /**
     * Sets the value of the pessSinais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessSinais(String value) {
        this.pessSinais = value;
    }

    /**
     * Gets the value of the pessSkills property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessSkills() {
        return pessSkills;
    }

    /**
     * Sets the value of the pessSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessSkills(String value) {
        this.pessSkills = value;
    }

    /**
     * Gets the value of the pessSobre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessSobre() {
        return pessSobre;
    }

    /**
     * Sets the value of the pessSobre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessSobre(String value) {
        this.pessSobre = value;
    }

    /**
     * Gets the value of the pessTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessTipo() {
        return pessTipo;
    }

    /**
     * Sets the value of the pessTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessTipo(String value) {
        this.pessTipo = value;
    }

    /**
     * Gets the value of the pessTrabalhoMae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessTrabalhoMae() {
        return pessTrabalhoMae;
    }

    /**
     * Sets the value of the pessTrabalhoMae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessTrabalhoMae(String value) {
        this.pessTrabalhoMae = value;
    }

    /**
     * Gets the value of the pessTrabalhoPai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessTrabalhoPai() {
        return pessTrabalhoPai;
    }

    /**
     * Sets the value of the pessTrabalhoPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessTrabalhoPai(String value) {
        this.pessTrabalhoPai = value;
    }

    /**
     * Gets the value of the pessVicios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPessVicios() {
        return pessVicios;
    }

    /**
     * Sets the value of the pessVicios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPessVicios(String value) {
        this.pessVicios = value;
    }

}
