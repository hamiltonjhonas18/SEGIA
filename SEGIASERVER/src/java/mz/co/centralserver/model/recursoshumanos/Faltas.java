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
@Table(name = "Faltas")
public class Faltas implements Serializable {

    @Id
    @GeneratedValue
    private int flt_id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date flt_data;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date flt_dataJustificacao;

    private String flt_descricao;
    private String flt_status;

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

    public int getFlt_id() {
        return flt_id;
    }

    public void setFlt_id(int flt_id) {
        this.flt_id = flt_id;
    }

    public Date getFlt_data() {
        return flt_data;
    }

    public void setFlt_data(Date flt_data) {
        this.flt_data = flt_data;
    }

    public String getFlt_descricao() {
        return flt_descricao;
    }

    public void setFlt_descricao(String flt_descricao) {
        this.flt_descricao = flt_descricao;
    }

    public String getFlt_status() {
        return flt_status;
    }

    public void setFlt_status(String flt_status) {
        this.flt_status = flt_status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getFlt_dataJustificacao() {
        return flt_dataJustificacao;
    }

    public void setFlt_dataJustificacao(Date flt_dataJustificacao) {
        this.flt_dataJustificacao = flt_dataJustificacao;
    }

}
