/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.gestao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Cor")
@XmlRootElement
public class Cor implements Serializable {

    @Id
    @GeneratedValue
    private int cor_id;

    private String cor_nome;
    private String cor_codigo;
    private String cor_codigoHexaDecimal;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getCor_id() {
        return cor_id;
    }

    public void setCor_id(int cor_id) {
        this.cor_id = cor_id;
    }

    public String getCor_nome() {
        return cor_nome;
    }

    public void setCor_nome(String cor_nome) {
        this.cor_nome = cor_nome;
    }

    public String getCor_codigo() {
        return cor_codigo;
    }

    public void setCor_codigo(String cor_codigo) {
        this.cor_codigo = cor_codigo;
    }

    public String getCor_codigoHexaDecimal() {
        return cor_codigoHexaDecimal;
    }

    public void setCor_codigoHexaDecimal(String cor_codigoHexaDecimal) {
        this.cor_codigoHexaDecimal = cor_codigoHexaDecimal;
    }

}
