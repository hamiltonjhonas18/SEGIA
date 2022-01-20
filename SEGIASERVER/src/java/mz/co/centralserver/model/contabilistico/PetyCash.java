/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.contabilistico;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "PetyCash")
public class PetyCash implements Serializable {

    @Id
    @GeneratedValue
    private int pet_id;

    @Lob
    private String pet_descricao;
    
    private double pet_valor;
    
    private double pet_saldoAnterior;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pet_data;

    @ManyToOne
    private Funcionario funcionario;
    
     @ManyToOne
     private Usuario usuario;

    @ManyToOne
    private Pety pety;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getPet_descricao() {
        return pet_descricao;
    }

    public void setPet_descricao(String pet_descricao) {
        this.pet_descricao = pet_descricao;
    }

    public double getPet_valor() {
        return pet_valor;
    }

    public void setPet_valor(double pet_valor) {
        this.pet_valor = pet_valor;
    }

    public Date getPet_data() {
        return pet_data;
    }

    public void setPet_data(Date pet_data) {
        this.pet_data = pet_data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pety getPety() {
        return pety;
    }

    public void setPety(Pety pety) {
        this.pety = pety;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getPet_saldoAnterior() {
        return pet_saldoAnterior;
    }

    public void setPet_saldoAnterior(double pet_saldoAnterior) {
        this.pet_saldoAnterior = pet_saldoAnterior;
    }

}
