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
 * @author User
 */
@Entity
@Table(name = "Fornecedor")
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue
    private int for_id;
    private String for_nome;
    private String for_endereco;
    private String for_contacto;
    private String for_email;
    private String for_contaGeral;
    private long for_nuit;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getFor_id() {
        return for_id;
    }

    public void setFor_id(int for_id) {
        this.for_id = for_id;
    }

    public String getFor_nome() {
        return for_nome;
    }

    public void setFor_nome(String for_nome) {
        this.for_nome = for_nome;
    }

    public String getFor_endereco() {
        return for_endereco;
    }

    public void setFor_endereco(String for_endereco) {
        this.for_endereco = for_endereco;
    }

    public long getFor_nuit() {
        return for_nuit;
    }

    public void setFor_nuit(long for_nuit) {
        this.for_nuit = for_nuit;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getFor_contacto() {
        return for_contacto;
    }

    public void setFor_contacto(String for_contacto) {
        this.for_contacto = for_contacto;
    }

    public String getFor_email() {
        return for_email;
    }

    public void setFor_email(String for_email) {
        this.for_email = for_email;
    }

    public String getFor_contaGeral() {
        return for_contaGeral;
    }

    public void setFor_contaGeral(String for_contaGeral) {
        this.for_contaGeral = for_contaGeral;
    }
}
