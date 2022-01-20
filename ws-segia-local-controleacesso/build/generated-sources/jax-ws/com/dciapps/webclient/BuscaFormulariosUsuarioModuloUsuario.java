
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscaFormulariosUsuarioModuloUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscaFormulariosUsuarioModuloUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFormulario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idModuloUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaFormulariosUsuarioModuloUsuario", propOrder = {
    "idFormulario",
    "idModuloUsuario"
})
public class BuscaFormulariosUsuarioModuloUsuario {

    protected int idFormulario;
    protected int idModuloUsuario;

    /**
     * Gets the value of the idFormulario property.
     * 
     */
    public int getIdFormulario() {
        return idFormulario;
    }

    /**
     * Sets the value of the idFormulario property.
     * 
     */
    public void setIdFormulario(int value) {
        this.idFormulario = value;
    }

    /**
     * Gets the value of the idModuloUsuario property.
     * 
     */
    public int getIdModuloUsuario() {
        return idModuloUsuario;
    }

    /**
     * Sets the value of the idModuloUsuario property.
     * 
     */
    public void setIdModuloUsuario(int value) {
        this.idModuloUsuario = value;
    }

}
