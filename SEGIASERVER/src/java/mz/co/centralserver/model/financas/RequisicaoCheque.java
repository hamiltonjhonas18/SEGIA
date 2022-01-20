/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.financas;

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
@Table(name = "RequisicaoCheque")
public class RequisicaoCheque implements Serializable {

    @Id
    @GeneratedValue
    private int rqc_id;

    @Lob
    private String rqc_valorExtenso;
    private String rqc_nrCheque;
    private String rqc_serie;

    @Lob
    private String rpc_descricao;
    private String rpc_criterio;
    private String rpc_beneficiario;
    private String rpc_movimento;

    private double rqc_valor;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date rqc_data;

    @ManyToOne
    private Funcionario funcionario;
    
    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private TipoMovimentoCheque tipoMovimentoCheque;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getRqc_id() {
        return rqc_id;
    }

    public void setRqc_id(int rqc_id) {
        this.rqc_id = rqc_id;
    }

    public String getRqc_valorExtenso() {
        return rqc_valorExtenso;
    }

    public void setRqc_valorExtenso(String rqc_valorExtenso) {
        this.rqc_valorExtenso = rqc_valorExtenso;
    }

    public String getRqc_nrCheque() {
        return rqc_nrCheque;
    }

    public void setRqc_nrCheque(String rqc_nrCheque) {
        this.rqc_nrCheque = rqc_nrCheque;
    }

    public double getRqc_valor() {
        return rqc_valor;
    }

    public void setRqc_valor(double rqc_valor) {
        this.rqc_valor = rqc_valor;
    }

    public Date getRqc_data() {
        return rqc_data;
    }

    public void setRqc_data(Date rqc_data) {
        this.rqc_data = rqc_data;
    }

    public String getRqc_serie() {
        return rqc_serie;
    }

    public void setRqc_serie(String rqc_serie) {
        this.rqc_serie = rqc_serie;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getRpc_descricao() {
        return rpc_descricao;
    }

    public void setRpc_descricao(String rpc_descricao) {
        this.rpc_descricao = rpc_descricao;
    }

    public String getRpc_criterio() {
        return rpc_criterio;
    }

    public void setRpc_criterio(String rpc_criterio) {
        this.rpc_criterio = rpc_criterio;
    }

    public String getRpc_beneficiario() {
        return rpc_beneficiario;
    }

    public void setRpc_beneficiario(String rpc_beneficiario) {
        this.rpc_beneficiario = rpc_beneficiario;
    }

    public String getRpc_movimento() {
        return rpc_movimento;
    }

    public void setRpc_movimento(String rpc_movimento) {
        this.rpc_movimento = rpc_movimento;
    }

    public TipoMovimentoCheque getTipoMovimentoCheque() {
        return tipoMovimentoCheque;
    }

    public void setTipoMovimentoCheque(TipoMovimentoCheque tipoMovimentoCheque) {
        this.tipoMovimentoCheque = tipoMovimentoCheque;
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

}
