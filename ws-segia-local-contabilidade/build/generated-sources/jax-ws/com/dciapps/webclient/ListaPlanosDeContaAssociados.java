
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaPlanosDeContaAssociados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaPlanosDeContaAssociados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="planoDeConta" type="{http://webservice.centralserver.co.mz/}planoDeConta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaPlanosDeContaAssociados", propOrder = {
    "entidade",
    "planoDeConta"
})
public class ListaPlanosDeContaAssociados {

    protected Entidade entidade;
    protected PlanoDeConta planoDeConta;

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
     * Gets the value of the planoDeConta property.
     * 
     * @return
     *     possible object is
     *     {@link PlanoDeConta }
     *     
     */
    public PlanoDeConta getPlanoDeConta() {
        return planoDeConta;
    }

    /**
     * Sets the value of the planoDeConta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanoDeConta }
     *     
     */
    public void setPlanoDeConta(PlanoDeConta value) {
        this.planoDeConta = value;
    }

}
