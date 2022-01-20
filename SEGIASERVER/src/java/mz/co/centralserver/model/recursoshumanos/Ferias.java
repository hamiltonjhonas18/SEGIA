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
@Table(name = "Ferias")
public class Ferias implements Serializable {

    @Id
    @GeneratedValue
    private int fer_id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fer_datainicio;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fer_datafim;

    private String fer_observacoes;

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

    public int getFer_id() {
        return fer_id;
    }

    public void setFer_id(int fer_id) {
        this.fer_id = fer_id;
    }

    public Date getFer_datainicio() {
        return fer_datainicio;
    }

    public void setFer_datainicio(Date fer_datainicio) {
        this.fer_datainicio = fer_datainicio;
    }

    public Date getFer_datafim() {
        return fer_datafim;
    }

    public void setFer_datafim(Date fer_datafim) {
        this.fer_datafim = fer_datafim;
    }

    public String getFer_observacoes() {
        return fer_observacoes;
    }

    public void setFer_observacoes(String fer_observacoes) {
        this.fer_observacoes = fer_observacoes;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
