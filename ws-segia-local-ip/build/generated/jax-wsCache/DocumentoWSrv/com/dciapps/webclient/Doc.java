
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for doc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://webservice.centralserver.co.mz/}codigo" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://webservice.centralserver.co.mz/}departamento" minOccurs="0"/>
 *         &lt;element name="doc_assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doc_dataDespacho" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doc_dataParecer" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doc_despacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="doc_link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_parecer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="escola" type="{http://webservice.centralserver.co.mz/}escola" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *         &lt;element name="usuario2" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *         &lt;element name="usuario3" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doc", propOrder = {
    "codigo",
    "departamento",
    "docAssunto",
    "docData",
    "docDataDespacho",
    "docDataParecer",
    "docDespacho",
    "docDestinatario",
    "docId",
    "docLink",
    "docParecer",
    "docReferencia",
    "docStatus",
    "docTexto",
    "docTipo",
    "encrypted",
    "entidade",
    "escola",
    "usuario",
    "usuario2",
    "usuario3"
})
public class Doc {

    protected Codigo codigo;
    protected Departamento departamento;
    @XmlElement(name = "doc_assunto")
    protected String docAssunto;
    @XmlElement(name = "doc_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docData;
    @XmlElement(name = "doc_dataDespacho")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDataDespacho;
    @XmlElement(name = "doc_dataParecer")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDataParecer;
    @XmlElement(name = "doc_despacho")
    protected String docDespacho;
    @XmlElement(name = "doc_destinatario")
    protected String docDestinatario;
    @XmlElement(name = "doc_id")
    protected int docId;
    @XmlElement(name = "doc_link")
    protected String docLink;
    @XmlElement(name = "doc_parecer")
    protected String docParecer;
    @XmlElement(name = "doc_referencia")
    protected String docReferencia;
    @XmlElement(name = "doc_status")
    protected String docStatus;
    @XmlElement(name = "doc_texto")
    protected String docTexto;
    @XmlElement(name = "doc_tipo")
    protected String docTipo;
    protected boolean encrypted;
    protected Entidade entidade;
    protected Escola escola;
    protected Usuario usuario;
    protected Usuario usuario2;
    protected Usuario usuario3;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigo(Codigo value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDepartamento(Departamento value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the docAssunto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocAssunto() {
        return docAssunto;
    }

    /**
     * Sets the value of the docAssunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocAssunto(String value) {
        this.docAssunto = value;
    }

    /**
     * Gets the value of the docData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocData() {
        return docData;
    }

    /**
     * Sets the value of the docData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocData(XMLGregorianCalendar value) {
        this.docData = value;
    }

    /**
     * Gets the value of the docDataDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDataDespacho() {
        return docDataDespacho;
    }

    /**
     * Sets the value of the docDataDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDataDespacho(XMLGregorianCalendar value) {
        this.docDataDespacho = value;
    }

    /**
     * Gets the value of the docDataParecer property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDataParecer() {
        return docDataParecer;
    }

    /**
     * Sets the value of the docDataParecer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDataParecer(XMLGregorianCalendar value) {
        this.docDataParecer = value;
    }

    /**
     * Gets the value of the docDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDespacho() {
        return docDespacho;
    }

    /**
     * Sets the value of the docDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDespacho(String value) {
        this.docDespacho = value;
    }

    /**
     * Gets the value of the docDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDestinatario() {
        return docDestinatario;
    }

    /**
     * Sets the value of the docDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDestinatario(String value) {
        this.docDestinatario = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     */
    public int getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     */
    public void setDocId(int value) {
        this.docId = value;
    }

    /**
     * Gets the value of the docLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocLink() {
        return docLink;
    }

    /**
     * Sets the value of the docLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocLink(String value) {
        this.docLink = value;
    }

    /**
     * Gets the value of the docParecer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocParecer() {
        return docParecer;
    }

    /**
     * Sets the value of the docParecer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocParecer(String value) {
        this.docParecer = value;
    }

    /**
     * Gets the value of the docReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocReferencia() {
        return docReferencia;
    }

    /**
     * Sets the value of the docReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocReferencia(String value) {
        this.docReferencia = value;
    }

    /**
     * Gets the value of the docStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocStatus() {
        return docStatus;
    }

    /**
     * Sets the value of the docStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocStatus(String value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the docTexto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTexto() {
        return docTexto;
    }

    /**
     * Sets the value of the docTexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTexto(String value) {
        this.docTexto = value;
    }

    /**
     * Gets the value of the docTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTipo() {
        return docTipo;
    }

    /**
     * Sets the value of the docTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTipo(String value) {
        this.docTipo = value;
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

    /**
     * Gets the value of the usuario2 property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario2() {
        return usuario2;
    }

    /**
     * Sets the value of the usuario2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario2(Usuario value) {
        this.usuario2 = value;
    }

    /**
     * Gets the value of the usuario3 property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario3() {
        return usuario3;
    }

    /**
     * Sets the value of the usuario3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario3(Usuario value) {
        this.usuario3 = value;
    }

}
