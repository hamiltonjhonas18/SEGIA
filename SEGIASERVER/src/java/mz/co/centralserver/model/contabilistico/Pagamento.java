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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;
import mz.co.centralserver.model.vendas.Caixa;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Pagamento")
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue
    private int pag_id;
    private String pag_descricao;
    private String pag_referencia;
    private String pag_recibo;
    private double pag_valor;
    private double pag_multa;
    private double pag_comissao;
    private String pag_origem;
    private boolean pag_status;
    private String pag_formaPagamento;
    private String pag_periodo;
    private String pag_condicao;
    private String pag_categorizacao;
    private String pag_refOnline;
    private double pag_valorPago;
    private boolean pag_actual;
    private boolean online;
    
    private String pag_refElectronico;
    
    private String pag_estado;
    

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pag_data;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pag_dataPagamento;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pag_dataLimite;


    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Inscricao inscricao;

    @ManyToOne
    private Turma turma;
    
    @ManyToOne
    private Pessoa pessoa;
    
    @ManyToOne
    private Caixa caixa;
    
    @ManyToOne
    private ReciboPagamento reciboPagamento;
    
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public int getPag_id() {
        return pag_id;
    }

    public void setPag_id(int pag_id) {
        this.pag_id = pag_id;
    }

    public String getPag_descricao() {
        return pag_descricao;
    }

    public void setPag_descricao(String pag_descricao) {
        this.pag_descricao = pag_descricao;
    }

    public String getPag_referencia() {
        return pag_referencia;
    }

    public void setPag_referencia(String pag_referencia) {
        this.pag_referencia = pag_referencia;
    }

    public Date getPag_data() {
        return pag_data;
    }

    public void setPag_data(Date pag_data) {
        this.pag_data = pag_data;
    }

    public String getPag_recibo() {
        return pag_recibo;
    }

    public void setPag_recibo(String pag_recibo) {
        this.pag_recibo = pag_recibo;
    }

    public double getPag_valor() {
        return pag_valor;
    }

    public void setPag_valor(double pag_valor) {
        this.pag_valor = pag_valor;
    }

    public String getPag_origem() {
        return pag_origem;
    }

    public void setPag_origem(String pag_origem) {
        this.pag_origem = pag_origem;
    }

    public boolean isPag_status() {
        return pag_status;
    }

    public void setPag_status(boolean pag_status) {
        this.pag_status = pag_status;
    }

    public String getPag_formaPagamento() {
        return pag_formaPagamento;
    }

    public void setPag_formaPagamento(String pag_formaPagamento) {
        this.pag_formaPagamento = pag_formaPagamento;
    }

    public String getPag_periodo() {
        return pag_periodo;
    }

    public void setPag_periodo(String pag_periodo) {
        this.pag_periodo = pag_periodo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getPag_condicao() {
        return pag_condicao;
    }

    public void setPag_condicao(String pag_condicao) {
        this.pag_condicao = pag_condicao;
    }

    public String getPag_categorizacao() {
        return pag_categorizacao;
    }

    public void setPag_categorizacao(String pag_categorizacao) {
        this.pag_categorizacao = pag_categorizacao;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public double getPag_valorPago() {
        return pag_valorPago;
    }

    public void setPag_valorPago(double pag_valorPago) {
        this.pag_valorPago = pag_valorPago;
    }

    public boolean isPag_actual() {
        return pag_actual;
    }

    public void setPag_actual(boolean pag_actual) {
        this.pag_actual = pag_actual;
    }

    public Date getPag_dataPagamento() {
        return pag_dataPagamento;
    }

    public void setPag_dataPagamento(Date pag_dataPagamento) {
        this.pag_dataPagamento = pag_dataPagamento;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getPag_refOnline() {
        return pag_refOnline;
    }

    public void setPag_refOnline(String pag_refOnline) {
        this.pag_refOnline = pag_refOnline;
    }

    public Date getPag_dataLimite() {
        return pag_dataLimite;
    }

    public void setPag_dataLimite(Date pag_dataLimite) {
        this.pag_dataLimite = pag_dataLimite;
    }

    public double getPag_comissao() {
        return pag_comissao;
    }

    public void setPag_comissao(double pag_comissao) {
        this.pag_comissao = pag_comissao;
    }

    public String getPag_refElectronico() {
        return pag_refElectronico;
    }

    public void setPag_refElectronico(String pag_refElectronico) {
        this.pag_refElectronico = pag_refElectronico;
    }

    public String getPag_estado() {
        return pag_estado;
    }

    public void setPag_estado(String pag_estado) {
        this.pag_estado = pag_estado;
    }

    public ReciboPagamento getReciboPagamento() {
        return reciboPagamento;
    }

    public void setReciboPagamento(ReciboPagamento reciboPagamento) {
        this.reciboPagamento = reciboPagamento;
    }

    public double getPag_multa() {
        return pag_multa;
    }

    public void setPag_multa(double pag_multa) {
        this.pag_multa = pag_multa;
    }
    

}
