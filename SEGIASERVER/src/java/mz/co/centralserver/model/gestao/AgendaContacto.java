/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.co.centralserver.model.gestao;

import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.vendas.Fornecedor;
import mz.co.centralserver.model.recursoshumanos.Funcionario;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name="AgendaContacto")
public class AgendaContacto implements Serializable {
   
    @Id
    @GeneratedValue
    private int agc_id;
    private String agc_descricao;
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Funcionario funcionario;
    
    @ManyToOne
    private Fornecedor fornecedor;
    
    @ManyToOne
    private TipoContacto tipoContacto;
    
    @ManyToOne
    private Entidade entidade;
    
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getAgc_id() {
        return agc_id;
    }

    public void setAgc_id(int agc_id) {
        this.agc_id = agc_id;
    }

    public String getAgc_descricao() {
        return agc_descricao;
    }

    public void setAgc_descricao(String agc_descricao) {
        this.agc_descricao = agc_descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
    
}
