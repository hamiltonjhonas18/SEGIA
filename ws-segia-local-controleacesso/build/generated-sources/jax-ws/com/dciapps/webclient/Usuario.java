
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for usuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="pessoapess" type="{http://webservice.centralserver.co.mz/}pessoa" minOccurs="0"/>
 *         &lt;element name="tipoUsuariotipu" type="{http://webservice.centralserver.co.mz/}tipoUsuario" minOccurs="0"/>
 *         &lt;element name="usu_dataUltimaVisita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usua_codigoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_dataValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usua_device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_distrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_fotoperfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usua_online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_perguntaSeguranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_presenca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="usua_provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_respostaSeguranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_statusicon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_tentativasLogin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usua_ultimasPasswords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usua_usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "encrypted",
    "entidade",
    "escola",
    "pessoapess",
    "tipoUsuariotipu",
    "usuDataUltimaVisita",
    "usuaCodigoRegistro",
    "usuaDataValidade",
    "usuaDevice",
    "usuaDistrito",
    "usuaEstado",
    "usuaFotoperfil",
    "usuaId",
    "usuaOnline",
    "usuaPerguntaSeguranca",
    "usuaPresenca",
    "usuaProvincia",
    "usuaRespostaSeguranca",
    "usuaSenha",
    "usuaStatus",
    "usuaStatusicon",
    "usuaTentativasLogin",
    "usuaUltimasPasswords",
    "usuaUsuario"
})
public class Usuario {

    protected boolean encrypted;
    protected Entidade entidade;
    protected Escola escola;
    protected Pessoa pessoapess;
    protected TipoUsuario tipoUsuariotipu;
    @XmlElement(name = "usu_dataUltimaVisita")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usuDataUltimaVisita;
    @XmlElement(name = "usua_codigoRegistro")
    protected String usuaCodigoRegistro;
    @XmlElement(name = "usua_dataValidade")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usuaDataValidade;
    @XmlElement(name = "usua_device")
    protected String usuaDevice;
    @XmlElement(name = "usua_distrito")
    protected String usuaDistrito;
    @XmlElement(name = "usua_estado")
    protected String usuaEstado;
    @XmlElement(name = "usua_fotoperfil")
    protected String usuaFotoperfil;
    @XmlElement(name = "usua_id")
    protected int usuaId;
    @XmlElement(name = "usua_online")
    protected String usuaOnline;
    @XmlElement(name = "usua_perguntaSeguranca")
    protected String usuaPerguntaSeguranca;
    @XmlElement(name = "usua_presenca")
    protected boolean usuaPresenca;
    @XmlElement(name = "usua_provincia")
    protected String usuaProvincia;
    @XmlElement(name = "usua_respostaSeguranca")
    protected String usuaRespostaSeguranca;
    @XmlElement(name = "usua_senha")
    protected String usuaSenha;
    @XmlElement(name = "usua_status")
    protected String usuaStatus;
    @XmlElement(name = "usua_statusicon")
    protected String usuaStatusicon;
    @XmlElement(name = "usua_tentativasLogin")
    protected Integer usuaTentativasLogin;
    @XmlElement(name = "usua_ultimasPasswords")
    protected String usuaUltimasPasswords;
    @XmlElement(name = "usua_usuario")
    protected String usuaUsuario;

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
     * Gets the value of the pessoapess property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoapess() {
        return pessoapess;
    }

    /**
     * Sets the value of the pessoapess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoapess(Pessoa value) {
        this.pessoapess = value;
    }

    /**
     * Gets the value of the tipoUsuariotipu property.
     * 
     * @return
     *     possible object is
     *     {@link TipoUsuario }
     *     
     */
    public TipoUsuario getTipoUsuariotipu() {
        return tipoUsuariotipu;
    }

    /**
     * Sets the value of the tipoUsuariotipu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUsuario }
     *     
     */
    public void setTipoUsuariotipu(TipoUsuario value) {
        this.tipoUsuariotipu = value;
    }

    /**
     * Gets the value of the usuDataUltimaVisita property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsuDataUltimaVisita() {
        return usuDataUltimaVisita;
    }

    /**
     * Sets the value of the usuDataUltimaVisita property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsuDataUltimaVisita(XMLGregorianCalendar value) {
        this.usuDataUltimaVisita = value;
    }

    /**
     * Gets the value of the usuaCodigoRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaCodigoRegistro() {
        return usuaCodigoRegistro;
    }

    /**
     * Sets the value of the usuaCodigoRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaCodigoRegistro(String value) {
        this.usuaCodigoRegistro = value;
    }

    /**
     * Gets the value of the usuaDataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsuaDataValidade() {
        return usuaDataValidade;
    }

    /**
     * Sets the value of the usuaDataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsuaDataValidade(XMLGregorianCalendar value) {
        this.usuaDataValidade = value;
    }

    /**
     * Gets the value of the usuaDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaDevice() {
        return usuaDevice;
    }

    /**
     * Sets the value of the usuaDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaDevice(String value) {
        this.usuaDevice = value;
    }

    /**
     * Gets the value of the usuaDistrito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaDistrito() {
        return usuaDistrito;
    }

    /**
     * Sets the value of the usuaDistrito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaDistrito(String value) {
        this.usuaDistrito = value;
    }

    /**
     * Gets the value of the usuaEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaEstado() {
        return usuaEstado;
    }

    /**
     * Sets the value of the usuaEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaEstado(String value) {
        this.usuaEstado = value;
    }

    /**
     * Gets the value of the usuaFotoperfil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaFotoperfil() {
        return usuaFotoperfil;
    }

    /**
     * Sets the value of the usuaFotoperfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaFotoperfil(String value) {
        this.usuaFotoperfil = value;
    }

    /**
     * Gets the value of the usuaId property.
     * 
     */
    public int getUsuaId() {
        return usuaId;
    }

    /**
     * Sets the value of the usuaId property.
     * 
     */
    public void setUsuaId(int value) {
        this.usuaId = value;
    }

    /**
     * Gets the value of the usuaOnline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaOnline() {
        return usuaOnline;
    }

    /**
     * Sets the value of the usuaOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaOnline(String value) {
        this.usuaOnline = value;
    }

    /**
     * Gets the value of the usuaPerguntaSeguranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaPerguntaSeguranca() {
        return usuaPerguntaSeguranca;
    }

    /**
     * Sets the value of the usuaPerguntaSeguranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaPerguntaSeguranca(String value) {
        this.usuaPerguntaSeguranca = value;
    }

    /**
     * Gets the value of the usuaPresenca property.
     * 
     */
    public boolean isUsuaPresenca() {
        return usuaPresenca;
    }

    /**
     * Sets the value of the usuaPresenca property.
     * 
     */
    public void setUsuaPresenca(boolean value) {
        this.usuaPresenca = value;
    }

    /**
     * Gets the value of the usuaProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaProvincia() {
        return usuaProvincia;
    }

    /**
     * Sets the value of the usuaProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaProvincia(String value) {
        this.usuaProvincia = value;
    }

    /**
     * Gets the value of the usuaRespostaSeguranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaRespostaSeguranca() {
        return usuaRespostaSeguranca;
    }

    /**
     * Sets the value of the usuaRespostaSeguranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaRespostaSeguranca(String value) {
        this.usuaRespostaSeguranca = value;
    }

    /**
     * Gets the value of the usuaSenha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaSenha() {
        return usuaSenha;
    }

    /**
     * Sets the value of the usuaSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaSenha(String value) {
        this.usuaSenha = value;
    }

    /**
     * Gets the value of the usuaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaStatus() {
        return usuaStatus;
    }

    /**
     * Sets the value of the usuaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaStatus(String value) {
        this.usuaStatus = value;
    }

    /**
     * Gets the value of the usuaStatusicon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaStatusicon() {
        return usuaStatusicon;
    }

    /**
     * Sets the value of the usuaStatusicon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaStatusicon(String value) {
        this.usuaStatusicon = value;
    }

    /**
     * Gets the value of the usuaTentativasLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuaTentativasLogin() {
        return usuaTentativasLogin;
    }

    /**
     * Sets the value of the usuaTentativasLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuaTentativasLogin(Integer value) {
        this.usuaTentativasLogin = value;
    }

    /**
     * Gets the value of the usuaUltimasPasswords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaUltimasPasswords() {
        return usuaUltimasPasswords;
    }

    /**
     * Sets the value of the usuaUltimasPasswords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaUltimasPasswords(String value) {
        this.usuaUltimasPasswords = value;
    }

    /**
     * Gets the value of the usuaUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuaUsuario() {
        return usuaUsuario;
    }

    /**
     * Sets the value of the usuaUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuaUsuario(String value) {
        this.usuaUsuario = value;
    }

}
