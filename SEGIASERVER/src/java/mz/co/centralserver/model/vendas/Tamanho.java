/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.vendas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Tamanho")
public class Tamanho implements Serializable {

    @Id
    @GeneratedValue
    private int tam_id;
    private String tam_descricao;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getTam_id() {
        return tam_id;
    }

    public void setTam_id(int tam_id) {
        this.tam_id = tam_id;
    }

    public String getTam_descricao() {
        return tam_descricao;
    }

    public void setTam_descricao(String tam_descricao) {
        this.tam_descricao = tam_descricao;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
