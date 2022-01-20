/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.contabilistico;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Moeda")
public class Moeda implements Serializable {

    @Id
    @GeneratedValue
    private int moe_id;
    private String moe_nome;
    
    private Double moe_cambio;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getMoe_id() {
        return moe_id;
    }

    public void setMoe_id(int moe_id) {
        this.moe_id = moe_id;
    }

    public String getMoe_nome() {
        return moe_nome;
    }

    public void setMoe_nome(String moe_nome) {
        this.moe_nome = moe_nome;
    }

    public Double getMoe_cambio() {
        return moe_cambio;
    }

    public void setMoe_cambio(Double moe_cambio) {
        this.moe_cambio = moe_cambio;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
