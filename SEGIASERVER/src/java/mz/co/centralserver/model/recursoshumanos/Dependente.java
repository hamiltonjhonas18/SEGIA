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
 * @author HJC2K8
 */
@Entity
@Table(name = "Dependente")
public class Dependente implements Serializable {

    @Id
    @GeneratedValue
    private int dpn_id;

    private String dpn_nome;
    private String dpn_grau;

    @ManyToOne
    private Funcionario funcionario;

    
    @ManyToOne
    private Entidade Entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }


    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public int getDpn_id() {
        return dpn_id;
    }

    public void setDpn_id(int dpn_id) {
        this.dpn_id = dpn_id;
    }

    public String getDpn_nome() {
        return dpn_nome;
    }

    public void setDpn_nome(String dpn_nome) {
        this.dpn_nome = dpn_nome;
    }

    public String getDpn_grau() {
        return dpn_grau;
    }

    public void setDpn_grau(String dpn_grau) {
        this.dpn_grau = dpn_grau;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
