
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pdf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pdf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="pdf_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pdf_descricaoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdf_hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdf_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pdf_nomeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdf_subPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdf_tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pdf", propOrder = {
    "encrypted",
    "entidade",
    "pdfData",
    "pdfDescricaoDocumento",
    "pdfHora",
    "pdfId",
    "pdfNomeDocumento",
    "pdfSubPath",
    "pdfTipoDocumento"
})
public class Pdf {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "pdf_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pdfData;
    @XmlElement(name = "pdf_descricaoDocumento")
    protected String pdfDescricaoDocumento;
    @XmlElement(name = "pdf_hora")
    protected String pdfHora;
    @XmlElement(name = "pdf_id")
    protected int pdfId;
    @XmlElement(name = "pdf_nomeDocumento")
    protected String pdfNomeDocumento;
    @XmlElement(name = "pdf_subPath")
    protected String pdfSubPath;
    @XmlElement(name = "pdf_tipoDocumento")
    protected String pdfTipoDocumento;

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
     * Gets the value of the pdfData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPdfData() {
        return pdfData;
    }

    /**
     * Sets the value of the pdfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPdfData(XMLGregorianCalendar value) {
        this.pdfData = value;
    }

    /**
     * Gets the value of the pdfDescricaoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfDescricaoDocumento() {
        return pdfDescricaoDocumento;
    }

    /**
     * Sets the value of the pdfDescricaoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfDescricaoDocumento(String value) {
        this.pdfDescricaoDocumento = value;
    }

    /**
     * Gets the value of the pdfHora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfHora() {
        return pdfHora;
    }

    /**
     * Sets the value of the pdfHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfHora(String value) {
        this.pdfHora = value;
    }

    /**
     * Gets the value of the pdfId property.
     * 
     */
    public int getPdfId() {
        return pdfId;
    }

    /**
     * Sets the value of the pdfId property.
     * 
     */
    public void setPdfId(int value) {
        this.pdfId = value;
    }

    /**
     * Gets the value of the pdfNomeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfNomeDocumento() {
        return pdfNomeDocumento;
    }

    /**
     * Sets the value of the pdfNomeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfNomeDocumento(String value) {
        this.pdfNomeDocumento = value;
    }

    /**
     * Gets the value of the pdfSubPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfSubPath() {
        return pdfSubPath;
    }

    /**
     * Sets the value of the pdfSubPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfSubPath(String value) {
        this.pdfSubPath = value;
    }

    /**
     * Gets the value of the pdfTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfTipoDocumento() {
        return pdfTipoDocumento;
    }

    /**
     * Sets the value of the pdfTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfTipoDocumento(String value) {
        this.pdfTipoDocumento = value;
    }

}
