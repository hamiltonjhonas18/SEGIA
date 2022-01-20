
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aluno" type="{http://webservice.centralserver.co.mz/}aluno" minOccurs="0"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="entidade2" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="trans_data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="trans_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="trans_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferencia", propOrder = {
    "aluno",
    "entidade",
    "entidade2",
    "transData",
    "transId",
    "transStatus"
})
public class Transferencia {

    protected Aluno aluno;
    protected Entidade entidade;
    protected Entidade entidade2;
    @XmlElement(name = "trans_data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transData;
    @XmlElement(name = "trans_id")
    protected int transId;
    @XmlElement(name = "trans_status")
    protected String transStatus;

    /**
     * Gets the value of the aluno property.
     * 
     * @return
     *     possible object is
     *     {@link Aluno }
     *     
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * Sets the value of the aluno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aluno }
     *     
     */
    public void setAluno(Aluno value) {
        this.aluno = value;
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
     * Gets the value of the entidade2 property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidade2() {
        return entidade2;
    }

    /**
     * Sets the value of the entidade2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidade2(Entidade value) {
        this.entidade2 = value;
    }

    /**
     * Gets the value of the transData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransData() {
        return transData;
    }

    /**
     * Sets the value of the transData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransData(XMLGregorianCalendar value) {
        this.transData = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     */
    public int getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     */
    public void setTransId(int value) {
        this.transId = value;
    }

    /**
     * Gets the value of the transStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransStatus() {
        return transStatus;
    }

    /**
     * Sets the value of the transStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransStatus(String value) {
        this.transStatus = value;
    }

}
