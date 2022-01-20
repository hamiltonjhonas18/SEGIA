
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nivelAcessoniva" type="{http://webservice.centralserver.co.mz/}nivelAcesso" minOccurs="0"/>
 *         &lt;element name="tipu_descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipu_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoUsuario", propOrder = {
    "encrypted",
    "nivelAcessoniva",
    "tipuDescricao",
    "tipuId"
})
public class TipoUsuario {

    protected boolean encrypted;
    protected NivelAcesso nivelAcessoniva;
    @XmlElement(name = "tipu_descricao")
    protected String tipuDescricao;
    @XmlElement(name = "tipu_id")
    protected int tipuId;

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
     * Gets the value of the nivelAcessoniva property.
     * 
     * @return
     *     possible object is
     *     {@link NivelAcesso }
     *     
     */
    public NivelAcesso getNivelAcessoniva() {
        return nivelAcessoniva;
    }

    /**
     * Sets the value of the nivelAcessoniva property.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelAcesso }
     *     
     */
    public void setNivelAcessoniva(NivelAcesso value) {
        this.nivelAcessoniva = value;
    }

    /**
     * Gets the value of the tipuDescricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipuDescricao() {
        return tipuDescricao;
    }

    /**
     * Sets the value of the tipuDescricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipuDescricao(String value) {
        this.tipuDescricao = value;
    }

    /**
     * Gets the value of the tipuId property.
     * 
     */
    public int getTipuId() {
        return tipuId;
    }

    /**
     * Sets the value of the tipuId property.
     * 
     */
    public void setTipuId(int value) {
        this.tipuId = value;
    }

}
