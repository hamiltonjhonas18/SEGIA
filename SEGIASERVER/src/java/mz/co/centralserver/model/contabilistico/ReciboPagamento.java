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
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "ReciboPagamento")
public class ReciboPagamento implements Serializable {

    @Id
    @GeneratedValue
    private int recp_id;

    private double recp_valor;
    private double recp_multa;
    private double recp_total;
    private String recp_recebemosDe;
    private String recp_referencia;

    private long recp_lancamento;

    @Lob
    private String recp_observacoes;
    private String ref_bancoPagamento;
    private String ref_nrDocumentoPagamento;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date recp_data;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public int getRecp_id() {
        return recp_id;
    }

    public void setRecp_id(int recp_id) {
        this.recp_id = recp_id;
    }

    public double getRecp_valor() {
        return recp_valor;
    }

    public void setRecp_valor(double recp_valor) {
        this.recp_valor = recp_valor;
    }

    public String getRecp_recebemosDe() {
        return recp_recebemosDe;
    }

    public void setRecp_recebemosDe(String recp_recebemosDe) {
        this.recp_recebemosDe = recp_recebemosDe;
    }

    public String getRecp_referencia() {
        return recp_referencia;
    }

    public void setRecp_referencia(String recp_referencia) {
        this.recp_referencia = recp_referencia;
    }

    public long getRecp_lancamento() {
        return recp_lancamento;
    }

    public void setRecp_lancamento(long recp_lancamento) {
        this.recp_lancamento = recp_lancamento;
    }

    public String getRecp_observacoes() {
        return recp_observacoes;
    }

    public void setRecp_observacoes(String recp_observacoes) {
        this.recp_observacoes = recp_observacoes;
    }

    public String getRef_bancoPagamento() {
        return ref_bancoPagamento;
    }

    public void setRef_bancoPagamento(String ref_bancoPagamento) {
        this.ref_bancoPagamento = ref_bancoPagamento;
    }

    public String getRef_nrDocumentoPagamento() {
        return ref_nrDocumentoPagamento;
    }

    public void setRef_nrDocumentoPagamento(String ref_nrDocumentoPagamento) {
        this.ref_nrDocumentoPagamento = ref_nrDocumentoPagamento;
    }

    public Date getRecp_data() {
        return recp_data;
    }

    public void setRecp_data(Date recp_data) {
        this.recp_data = recp_data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public double getRecp_multa() {
        return recp_multa;
    }

    public void setRecp_multa(double recp_multa) {
        this.recp_multa = recp_multa;
    }

    public double getRecp_total() {
        return recp_total;
    }

    public void setRecp_total(double recp_total) {
        this.recp_total = recp_total;
    }

}
