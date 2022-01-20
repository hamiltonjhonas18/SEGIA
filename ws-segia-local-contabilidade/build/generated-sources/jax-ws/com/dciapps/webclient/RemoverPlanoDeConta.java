
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remover_planoDeConta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remover_planoDeConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "remover_planoDeConta", propOrder = {
    "planoDeConta"
})
public class RemoverPlanoDeConta {

    protected PlanoDeConta planoDeConta;

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
