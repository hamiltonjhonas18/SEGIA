
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaModuloAcessosSistemaEntidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaModuloAcessosSistemaEntidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSistema" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEntidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaModuloAcessosSistemaEntidade", propOrder = {
    "idSistema",
    "idEntidade"
})
public class ListaModuloAcessosSistemaEntidade {

    protected int idSistema;
    protected int idEntidade;

    /**
     * Gets the value of the idSistema property.
     * 
     */
    public int getIdSistema() {
        return idSistema;
    }

    /**
     * Sets the value of the idSistema property.
     * 
     */
    public void setIdSistema(int value) {
        this.idSistema = value;
    }

    /**
     * Gets the value of the idEntidade property.
     * 
     */
    public int getIdEntidade() {
        return idEntidade;
    }

    /**
     * Sets the value of the idEntidade property.
     * 
     */
    public void setIdEntidade(int value) {
        this.idEntidade = value;
    }

}
