
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for docente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="docente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaFormacao" type="{http://webservice.centralserver.co.mz/}areaFormacao" minOccurs="0"/>
 *         &lt;element name="doce_activo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="doce_categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doce_especialidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doce_grauFormacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doce_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="doce_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doce_senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doce_tipoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doce_usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doce_validadeContrato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
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
@XmlType(name = "docente", propOrder = {
    "areaFormacao",
    "doceActivo",
    "doceCategoria",
    "doceEspecialidade",
    "doceGrauFormacao",
    "doceId",
    "doceProvincia",
    "doceSenha",
    "doceTipoContrato",
    "doceUsuario",
    "doceValidadeContrato",
    "encrypted",
    "entidade",
    "pessoa"
})
public class Docente {

    protected AreaFormacao areaFormacao;
    @XmlElement(name = "doce_activo")
    protected boolean doceActivo;
    @XmlElement(name = "doce_categoria")
    protected String doceCategoria;
    @XmlElement(name = "doce_especialidade")
    protected String doceEspecialidade;
    @XmlElement(name = "doce_grauFormacao")
    protected String doceGrauFormacao;
    @XmlElement(name = "doce_id")
    protected int doceId;
    @XmlElement(name = "doce_provincia")
    protected String doceProvincia;
    @XmlElement(name = "doce_senha")
    protected String doceSenha;
    @XmlElement(name = "doce_tipoContrato")
    protected String doceTipoContrato;
    @XmlElement(name = "doce_usuario")
    protected String doceUsuario;
    @XmlElement(name = "doce_validadeContrato")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doceValidadeContrato;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Pessoa pessoa;

    /**
     * Gets the value of the areaFormacao property.
     * 
     * @return
     *     possible object is
     *     {@link AreaFormacao }
     *     
     */
    public AreaFormacao getAreaFormacao() {
        return areaFormacao;
    }

    /**
     * Sets the value of the areaFormacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaFormacao }
     *     
     */
    public void setAreaFormacao(AreaFormacao value) {
        this.areaFormacao = value;
    }

    /**
     * Gets the value of the doceActivo property.
     * 
     */
    public boolean isDoceActivo() {
        return doceActivo;
    }

    /**
     * Sets the value of the doceActivo property.
     * 
     */
    public void setDoceActivo(boolean value) {
        this.doceActivo = value;
    }

    /**
     * Gets the value of the doceCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoceCategoria() {
        return doceCategoria;
    }

    /**
     * Sets the value of the doceCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoceCategoria(String value) {
        this.doceCategoria = value;
    }

    /**
     * Gets the value of the doceEspecialidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoceEspecialidade() {
        return doceEspecialidade;
    }

    /**
     * Sets the value of the doceEspecialidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoceEspecialidade(String value) {
        this.doceEspecialidade = value;
    }

    /**
     * Gets the value of the doceGrauFormacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoceGrauFormacao() {
        return doceGrauFormacao;
    }

    /**
     * Sets the value of the doceGrauFormacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoceGrauFormacao(String value) {
        this.doceGrauFormacao = value;
    }

    /**
     * Gets the value of the doceId property.
     * 
     */
    public int getDoceId() {
        return doceId;
    }

    /**
     * Sets the value of the doceId property.
     * 
     */
    public void setDoceId(int value) {
        this.doceId = value;
    }

    /**
     * Gets the value of the doceProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoceProvincia() {
        return doceProvincia;
    }

    /**
     * Sets the value of the doceProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoceProvincia(String value) {
        this.doceProvincia = value;
    }

    /**
     * Gets the value of the doceSenha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoceSenha() {
        return doceSenha;
    }

    /**
     * Sets the value of the doceSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoceSenha(String value) {
        this.doceSenha = value;
    }

    /**
     * Gets the value of the doceTipoContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoceTipoContrato() {
        return doceTipoContrato;
    }

    /**
     * Sets the value of the doceTipoContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoceTipoContrato(String value) {
        this.doceTipoContrato = value;
    }

    /**
     * Gets the value of the doceUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoceUsuario() {
        return doceUsuario;
    }

    /**
     * Sets the value of the doceUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoceUsuario(String value) {
        this.doceUsuario = value;
    }

    /**
     * Gets the value of the doceValidadeContrato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoceValidadeContrato() {
        return doceValidadeContrato;
    }

    /**
     * Sets the value of the doceValidadeContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoceValidadeContrato(XMLGregorianCalendar value) {
        this.doceValidadeContrato = value;
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
