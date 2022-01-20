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
import javax.persistence.TemporalType;
import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Servico;

/**
 *
 * @author HJC2K8
 */

@Entity
@Table(name="Contracto")
public class Contracto implements Serializable {
  
    @Id
    @GeneratedValue
    private int cnt_id;
    
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cnt_dataadmissao;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date cnt_datainicio;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date cnt_datafim;

    @ManyToOne
    private Servico servicoserv;

    @ManyToOne
    private Cliente clienteclie;
    
    private String cnt_graohierarquico;
    private double cnt_salario;
    private String cnt_horassemanais;
    private String cnt_beneficios;
    private String cnt_banco;
    private String cnt_agencia;
    private long cnt_conta;
    
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

    public int getCnt_id() {
        return cnt_id;
    }

    public void setCnt_id(int cnt_id) {
        this.cnt_id = cnt_id;
    }

    public Date getCnt_dataadmissao() {
        return cnt_dataadmissao;
    }

    public void setCnt_dataadmissao(Date cnt_dataadmissao) {
        this.cnt_dataadmissao = cnt_dataadmissao;
    }

    public String getCnt_graohierarquico() {
        return cnt_graohierarquico;
    }

    public void setCnt_graohierarquico(String cnt_graohierarquico) {
        this.cnt_graohierarquico = cnt_graohierarquico;
    }

    public double getCnt_salario() {
        return cnt_salario;
    }

    public void setCnt_salario(double cnt_salario) {
        this.cnt_salario = cnt_salario;
    }

    public String getCnt_horassemanais() {
        return cnt_horassemanais;
    }

    public void setCnt_horassemanais(String cnt_horassemanais) {
        this.cnt_horassemanais = cnt_horassemanais;
    }

    public String getCnt_beneficios() {
        return cnt_beneficios;
    }

    public void setCnt_beneficios(String cnt_beneficios) {
        this.cnt_beneficios = cnt_beneficios;
    }

    public String getCnt_banco() {
        return cnt_banco;
    }

    public void setCnt_banco(String cnt_banco) {
        this.cnt_banco = cnt_banco;
    }

    public String getCnt_agencia() {
        return cnt_agencia;
    }

    public void setCnt_agencia(String cnt_agencia) {
        this.cnt_agencia = cnt_agencia;
    }

    public long getCnt_conta() {
        return cnt_conta;
    }

    public void setCnt_conta(long cnt_conta) {
        this.cnt_conta = cnt_conta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public java.util.Date getCnt_datainicio() {
        return cnt_datainicio;
    }

    public void setCnt_datainicio(java.util.Date cnt_datainicio) {
        this.cnt_datainicio = cnt_datainicio;
    }

    public java.util.Date getCnt_datafim() {
        return cnt_datafim;
    }

    public void setCnt_datafim(java.util.Date cnt_datafim) {
        this.cnt_datafim = cnt_datafim;
    }

    public Servico getServicoserv() {
        return servicoserv;
    }

    public void setServicoserv(Servico servicoserv) {
        this.servicoserv = servicoserv;
    }

    public Cliente getClienteclie() {
        return clienteclie;
    }

    public void setClienteclie(Cliente clienteclie) {
        this.clienteclie = clienteclie;
    }
    
    
}
