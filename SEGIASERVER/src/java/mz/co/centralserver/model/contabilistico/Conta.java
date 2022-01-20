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
import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Conta")
public class Conta implements Serializable {

    @Id
    @GeneratedValue
    private int con_id;
    private String con_nome;
    private double con_saldo;
    private long con_codigo;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private TipoConta tipoConta;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getCon_id() {
        return con_id;
    }

    public void setCon_id(int con_id) {
        this.con_id = con_id;
    }

    public String getCon_nome() {
        return con_nome;
    }

    public void setCon_nome(String con_nome) {
        this.con_nome = con_nome;
    }

    public double getCon_saldo() {
        return con_saldo;
    }

    public void setCon_saldo(double con_saldo) {
        this.con_saldo = con_saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public long getCon_codigo() {
        return con_codigo;
    }

    public void setCon_codigo(long con_codigo) {
        this.con_codigo = con_codigo;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
