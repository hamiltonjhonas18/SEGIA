
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for lancamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lancamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contaCliente" type="{http://webservice.centralserver.co.mz/}contaGeral" minOccurs="0"/>
 *         &lt;element name="contaPlano" type="{http://webservice.centralserver.co.mz/}contaGeral" minOccurs="0"/>
 *         &lt;element name="diario" type="{http://webservice.centralserver.co.mz/}diario" minOccurs="0"/>
 *         &lt;element name="documento" type="{http://webservice.centralserver.co.mz/}documento" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="factura" type="{http://webservice.centralserver.co.mz/}factura" minOccurs="0"/>
 *         &lt;element name="funcionario" type="{http://webservice.centralserver.co.mz/}funcionario" minOccurs="0"/>
 *         &lt;element name="lan_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lan_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lan_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lan_iva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lan_numero" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lan_operacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lan_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lan_referenciaDiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lan_referenciaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lan_referenciaMovimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lan_valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lancamento", propOrder = {
    "contaCliente",
    "contaPlano",
    "diario",
    "documento",
    "encrypted",
    "entidade",
    "factura",
    "funcionario",
    "lanData",
    "lanDescricao",
    "lanId",
    "lanIva",
    "lanNumero",
    "lanOperacao",
    "lanReferencia",
    "lanReferenciaDiario",
    "lanReferenciaDocumento",
    "lanReferenciaMovimento",
    "lanValor",
    "usuario"
})
public class Lancamento {

    protected ContaGeral contaCliente;
    protected ContaGeral contaPlano;
    protected Diario diario;
    protected Documento documento;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Factura factura;
    protected Funcionario funcionario;
    @XmlElement(name = "lan_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lanData;
    @XmlElement(name = "lan_descricao")
    protected String lanDescricao;
    @XmlElement(name = "lan_id")
    protected int lanId;
    @XmlElement(name = "lan_iva")
    protected double lanIva;
    @XmlElement(name = "lan_numero")
    protected long lanNumero;
    @XmlElement(name = "lan_operacao")
    protected String lanOperacao;
    @XmlElement(name = "lan_referencia")
    protected String lanReferencia;
    @XmlElement(name = "lan_referenciaDiario")
    protected String lanReferenciaDiario;
    @XmlElement(name = "lan_referenciaDocumento")
    protected String lanReferenciaDocumento;
    @XmlElement(name = "lan_referenciaMovimento")
    protected String lanReferenciaMovimento;
    @XmlElement(name = "lan_valor")
    protected double lanValor;
    protected Usuario usuario;

    /**
     * Gets the value of the contaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link ContaGeral }
     *     
     */
    public ContaGeral getContaCliente() {
        return contaCliente;
    }

    /**
     * Sets the value of the contaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaGeral }
     *     
     */
    public void setContaCliente(ContaGeral value) {
        this.contaCliente = value;
    }

    /**
     * Gets the value of the contaPlano property.
     * 
     * @return
     *     possible object is
     *     {@link ContaGeral }
     *     
     */
    public ContaGeral getContaPlano() {
        return contaPlano;
    }

    /**
     * Sets the value of the contaPlano property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaGeral }
     *     
     */
    public void setContaPlano(ContaGeral value) {
        this.contaPlano = value;
    }

    /**
     * Gets the value of the diario property.
     * 
     * @return
     *     possible object is
     *     {@link Diario }
     *     
     */
    public Diario getDiario() {
        return diario;
    }

    /**
     * Sets the value of the diario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diario }
     *     
     */
    public void setDiario(Diario value) {
        this.diario = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
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
     * Gets the value of the factura property.
     * 
     * @return
     *     possible object is
     *     {@link Factura }
     *     
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * Sets the value of the factura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Factura }
     *     
     */
    public void setFactura(Factura value) {
        this.factura = value;
    }

    /**
     * Gets the value of the funcionario property.
     * 
     * @return
     *     possible object is
     *     {@link Funcionario }
     *     
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Sets the value of the funcionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Funcionario }
     *     
     */
    public void setFuncionario(Funcionario value) {
        this.funcionario = value;
    }

    /**
     * Gets the value of the lanData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLanData() {
        return lanData;
    }

    /**
     * Sets the value of the lanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLanData(XMLGregorianCalendar value) {
        this.lanData = value;
    }

    /**
     * Gets the value of the lanDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanDescricao() {
        return lanDescricao;
    }

    /**
     * Sets the value of the lanDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanDescricao(String value) {
        this.lanDescricao = value;
    }

    /**
     * Gets the value of the lanId property.
     * 
     */
    public int getLanId() {
        return lanId;
    }

    /**
     * Sets the value of the lanId property.
     * 
     */
    public void setLanId(int value) {
        this.lanId = value;
    }

    /**
     * Gets the value of the lanIva property.
     * 
     */
    public double getLanIva() {
        return lanIva;
    }

    /**
     * Sets the value of the lanIva property.
     * 
     */
    public void setLanIva(double value) {
        this.lanIva = value;
    }

    /**
     * Gets the value of the lanNumero property.
     * 
     */
    public long getLanNumero() {
        return lanNumero;
    }

    /**
     * Sets the value of the lanNumero property.
     * 
     */
    public void setLanNumero(long value) {
        this.lanNumero = value;
    }

    /**
     * Gets the value of the lanOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanOperacao() {
        return lanOperacao;
    }

    /**
     * Sets the value of the lanOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanOperacao(String value) {
        this.lanOperacao = value;
    }

    /**
     * Gets the value of the lanReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanReferencia() {
        return lanReferencia;
    }

    /**
     * Sets the value of the lanReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanReferencia(String value) {
        this.lanReferencia = value;
    }

    /**
     * Gets the value of the lanReferenciaDiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanReferenciaDiario() {
        return lanReferenciaDiario;
    }

    /**
     * Sets the value of the lanReferenciaDiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanReferenciaDiario(String value) {
        this.lanReferenciaDiario = value;
    }

    /**
     * Gets the value of the lanReferenciaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanReferenciaDocumento() {
        return lanReferenciaDocumento;
    }

    /**
     * Sets the value of the lanReferenciaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanReferenciaDocumento(String value) {
        this.lanReferenciaDocumento = value;
    }

    /**
     * Gets the value of the lanReferenciaMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanReferenciaMovimento() {
        return lanReferenciaMovimento;
    }

    /**
     * Sets the value of the lanReferenciaMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanReferenciaMovimento(String value) {
        this.lanReferenciaMovimento = value;
    }

    /**
     * Gets the value of the lanValor property.
     * 
     */
    public double getLanValor() {
        return lanValor;
    }

    /**
     * Sets the value of the lanValor property.
     * 
     */
    public void setLanValor(double value) {
        this.lanValor = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
