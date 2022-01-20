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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "ListaTelefonica")
public class ListaTelefonica implements Serializable {

    @Id
    @GeneratedValue
    private int lst_id;

    private String lst_nome;
    private String lst_telefone;
    private String lst_categoria;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getLst_id() {
        return lst_id;
    }

    public void setLst_id(int lst_id) {
        this.lst_id = lst_id;
    }

    public String getLst_nome() {
        return lst_nome;
    }

    public void setLst_nome(String lst_nome) {
        this.lst_nome = lst_nome;
    }

    public String getLst_telefone() {
        return lst_telefone;
    }

    public void setLst_telefone(String lst_telefone) {
        this.lst_telefone = lst_telefone;
    }

    public String getLst_categoria() {
        return lst_categoria;
    }

    public void setLst_categoria(String lst_categoria) {
        this.lst_categoria = lst_categoria;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
