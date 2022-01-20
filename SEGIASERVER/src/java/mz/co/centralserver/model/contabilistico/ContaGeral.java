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
@Table(name = "ContaGeral")
public class ContaGeral implements Serializable {

    @Id
    @GeneratedValue
    private int ctg_id;
    private String ctg_conta;
    private String ctg_descricao;
    private boolean ctg_raiz;

    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public int getCtg_id() {
        return ctg_id;
    }

    public void setCtg_id(int ctg_id) {
        this.ctg_id = ctg_id;
    }

    public String getCtg_conta() {
        return ctg_conta;
    }

    public void setCtg_conta(String ctg_conta) {
        this.ctg_conta = ctg_conta;
    }

    public String getCtg_descricao() {
        return ctg_descricao;
    }

    public void setCtg_descricao(String ctg_descricao) {
        this.ctg_descricao = ctg_descricao;
    }

    public boolean isCtg_raiz() {
        return ctg_raiz;
    }

    public void setCtg_raiz(boolean ctg_raiz) {
        this.ctg_raiz = ctg_raiz;
    }

}
