/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.recursoshumanos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Formacao")
public class Formacao implements Serializable {

    @Id
    @GeneratedValue
    private int frm_id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date frm_dataconclusao;

    private String frm_descricao;
    private int frm_cargahoraria;
    private String frm_status;

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

    public int getFrm_id() {
        return frm_id;
    }

    public void setFrm_id(int frm_id) {
        this.frm_id = frm_id;
    }

    public Date getFrm_dataconclusao() {
        return frm_dataconclusao;
    }

    public void setFrm_dataconclusao(Date frm_dataconclusao) {
        this.frm_dataconclusao = frm_dataconclusao;
    }

    public String getFrm_descricao() {
        return frm_descricao;
    }

    public void setFrm_descricao(String frm_descricao) {
        this.frm_descricao = frm_descricao;
    }

    public int getFrm_cargahoraria() {
        return frm_cargahoraria;
    }

    public void setFrm_cargahoraria(int frm_cargahoraria) {
        this.frm_cargahoraria = frm_cargahoraria;
    }

    public String getFrm_status() {
        return frm_status;
    }

    public void setFrm_status(String frm_status) {
        this.frm_status = frm_status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
