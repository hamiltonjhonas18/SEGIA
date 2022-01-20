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
@Table(name = "PlanoSaude")
public class PlanoSaude implements Serializable {

    @Id
    @GeneratedValue
    private int pls_id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pls_data;

    private String pls_descricao;
    private String pls_medico;
    private String pls_avaliacao;

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

    public int getPls_id() {
        return pls_id;
    }

    public void setPls_id(int pls_id) {
        this.pls_id = pls_id;
    }

    public Date getPls_data() {
        return pls_data;
    }

    public void setPls_data(Date pls_data) {
        this.pls_data = pls_data;
    }

    public String getPls_descricao() {
        return pls_descricao;
    }

    public void setPls_descricao(String pls_descricao) {
        this.pls_descricao = pls_descricao;
    }

    public String getPls_medico() {
        return pls_medico;
    }

    public void setPls_medico(String pls_medico) {
        this.pls_medico = pls_medico;
    }

    public String getPls_avaliacao() {
        return pls_avaliacao;
    }

    public void setPls_avaliacao(String pls_avaliacao) {
        this.pls_avaliacao = pls_avaliacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
