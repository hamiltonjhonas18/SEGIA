/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.co.centralserver.model.recursoshumanos;

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
@Table(name="Habilitacao")
public class Habilitacao implements Serializable {
    
    @Id
    @GeneratedValue
    private int habi_id;
    private String habi_descricao;
    
    @ManyToOne
    private Entidade Entidade;

    private boolean encrypted;

    public int getHabi_id() {
        return habi_id;
    }

    public void setHabi_id(int habi_id) {
        this.habi_id = habi_id;
    }

    public String getHabi_descricao() {
        return habi_descricao;
    }

    public void setHabi_descricao(String habi_descricao) {
        this.habi_descricao = habi_descricao;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    
}
