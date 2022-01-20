
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for fluxo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fluxo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://webservice.centralserver.co.mz/}cliente" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="factura" type="{http://webservice.centralserver.co.mz/}factura" minOccurs="0"/>
 *         &lt;element name="flux_custoVenda" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="flux_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flux_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flux_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flux_qtd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flux_qtdPresente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flux_referenciaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flux_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flux_tipoVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flux_ultimoStock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="produto" type="{http://webservice.centralserver.co.mz/}produto" minOccurs="0"/>
 *         &lt;element name="turma" type="{http://webservice.centralserver.co.mz/}turma" minOccurs="0"/>
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
@XmlType(name = "fluxo", propOrder = {
    "cliente",
    "encrypted",
    "entidade",
    "factura",
    "fluxCustoVenda",
    "fluxData",
    "fluxDescricao",
    "fluxId",
    "fluxQtd",
    "fluxQtdPresente",
    "fluxReferenciaDocumento",
    "fluxTipo",
    "fluxTipoVenda",
    "fluxUltimoStock",
    "produto",
    "turma",
    "usuario"
})
public class Fluxo {

    protected Cliente cliente;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Factura factura;
    @XmlElement(name = "flux_custoVenda")
    protected double fluxCustoVenda;
    @XmlElement(name = "flux_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fluxData;
    @XmlElement(name = "flux_descricao")
    protected String fluxDescricao;
    @XmlElement(name = "flux_id")
    protected int fluxId;
    @XmlElement(name = "flux_qtd")
    protected int fluxQtd;
    @XmlElement(name = "flux_qtdPresente")
    protected int fluxQtdPresente;
    @XmlElement(name = "flux_referenciaDocumento")
    protected String fluxReferenciaDocumento;
    @XmlElement(name = "flux_tipo")
    protected String fluxTipo;
    @XmlElement(name = "flux_tipoVenda")
    protected String fluxTipoVenda;
    @XmlElement(name = "flux_ultimoStock")
    protected int fluxUltimoStock;
    protected Produto produto;
    protected Turma turma;
    protected Usuario usuario;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
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
     * Gets the value of the fluxCustoVenda property.
     * 
     */
    public double getFluxCustoVenda() {
        return fluxCustoVenda;
    }

    /**
     * Sets the value of the fluxCustoVenda property.
     * 
     */
    public void setFluxCustoVenda(double value) {
        this.fluxCustoVenda = value;
    }

    /**
     * Gets the value of the fluxData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFluxData() {
        return fluxData;
    }

    /**
     * Sets the value of the fluxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFluxData(XMLGregorianCalendar value) {
        this.fluxData = value;
    }

    /**
     * Gets the value of the fluxDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluxDescricao() {
        return fluxDescricao;
    }

    /**
     * Sets the value of the fluxDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluxDescricao(String value) {
        this.fluxDescricao = value;
    }

    /**
     * Gets the value of the fluxId property.
     * 
     */
    public int getFluxId() {
        return fluxId;
    }

    /**
     * Sets the value of the fluxId property.
     * 
     */
    public void setFluxId(int value) {
        this.fluxId = value;
    }

    /**
     * Gets the value of the fluxQtd property.
     * 
     */
    public int getFluxQtd() {
        return fluxQtd;
    }

    /**
     * Sets the value of the fluxQtd property.
     * 
     */
    public void setFluxQtd(int value) {
        this.fluxQtd = value;
    }

    /**
     * Gets the value of the fluxQtdPresente property.
     * 
     */
    public int getFluxQtdPresente() {
        return fluxQtdPresente;
    }

    /**
     * Sets the value of the fluxQtdPresente property.
     * 
     */
    public void setFluxQtdPresente(int value) {
        this.fluxQtdPresente = value;
    }

    /**
     * Gets the value of the fluxReferenciaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluxReferenciaDocumento() {
        return fluxReferenciaDocumento;
    }

    /**
     * Sets the value of the fluxReferenciaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluxReferenciaDocumento(String value) {
        this.fluxReferenciaDocumento = value;
    }

    /**
     * Gets the value of the fluxTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluxTipo() {
        return fluxTipo;
    }

    /**
     * Sets the value of the fluxTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluxTipo(String value) {
        this.fluxTipo = value;
    }

    /**
     * Gets the value of the fluxTipoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluxTipoVenda() {
        return fluxTipoVenda;
    }

    /**
     * Sets the value of the fluxTipoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluxTipoVenda(String value) {
        this.fluxTipoVenda = value;
    }

    /**
     * Gets the value of the fluxUltimoStock property.
     * 
     */
    public int getFluxUltimoStock() {
        return fluxUltimoStock;
    }

    /**
     * Sets the value of the fluxUltimoStock property.
     * 
     */
    public void setFluxUltimoStock(int value) {
        this.fluxUltimoStock = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Sets the value of the produto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProduto(Produto value) {
        this.produto = value;
    }

    /**
     * Gets the value of the turma property.
     * 
     * @return
     *     possible object is
     *     {@link Turma }
     *     
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * Sets the value of the turma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Turma }
     *     
     */
    public void setTurma(Turma value) {
        this.turma = value;
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
