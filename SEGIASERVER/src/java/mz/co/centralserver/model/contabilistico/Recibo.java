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
@Table(name = "Recibo")
public class Recibo implements Serializable {

    @Id
    @GeneratedValue
    private int rec_id;

    private double rec_valor;
    private double rec_mullta;
    private double rec_total;
    
    private String rec_recebemosDe;
    private String rec_referencia;
    
    private long rec_lancamento;
    
    @Lob
    private String rec_observacoes;
    private String ref_bancoPagamento;
    private String ref_nrDocumentoPagamento;
    

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date rec_data;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public double getRec_valor() {
        return rec_valor;
    }

    public void setRec_valor(double rec_valor) {
        this.rec_valor = rec_valor;
    }

    public Date getRec_data() {
        return rec_data;
    }

    public void setRec_data(Date rec_data) {
        this.rec_data = rec_data;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setEmitente(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getRec_recebemosDe() {
        return rec_recebemosDe;
    }

    public void setRec_recebemosDe(String rec_recebemosDe) {
        this.rec_recebemosDe = rec_recebemosDe;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getRec_referencia() {
        return rec_referencia;
    }

    public void setRec_referencia(String rec_referencia) {
        this.rec_referencia = rec_referencia;
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

    public String getRec_observacoes() {
        return rec_observacoes;
    }

    public void setRec_observacoes(String rec_observacoes) {
        this.rec_observacoes = rec_observacoes;
    }

    public long getRec_lancamento() {
        return rec_lancamento;
    }

    public void setRec_lancamento(long rec_lancamento) {
        this.rec_lancamento = rec_lancamento;
    }

    public double getRec_mullta() {
        return rec_mullta;
    }

    public void setRec_mullta(double rec_mullta) {
        this.rec_mullta = rec_mullta;
    }

    public double getRec_total() {
        return rec_total;
    }

    public void setRec_total(double rec_total) {
        this.rec_total = rec_total;
    }

}
