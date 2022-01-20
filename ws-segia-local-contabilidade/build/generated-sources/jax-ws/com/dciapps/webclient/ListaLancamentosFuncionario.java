
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaLancamentosFuncionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaLancamentosFuncionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="funcionario" type="{http://webservice.centralserver.co.mz/}funcionario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaLancamentosFuncionario", propOrder = {
    "entidade",
    "funcionario"
})
public class ListaLancamentosFuncionario {

    protected Entidade entidade;
    protected Funcionario funcionario;

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

}
