
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistir_resposta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistir_resposta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resposta" type="{http://webservice.centralserver.co.mz/}resposta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistir_resposta", propOrder = {
    "resposta"
})
public class PersistirResposta {

    protected Resposta resposta;

    /**
     * Gets the value of the resposta property.
     * 
     * @return
     *     possible object is
     *     {@link Resposta }
     *     
     */
    public Resposta getResposta() {
        return resposta;
    }

    /**
     * Sets the value of the resposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resposta }
     *     
     */
    public void setResposta(Resposta value) {
        this.resposta = value;
    }

}
