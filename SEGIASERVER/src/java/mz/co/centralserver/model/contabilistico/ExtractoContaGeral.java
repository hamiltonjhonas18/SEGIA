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
import javax.persistence.TemporalType;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ExtractoContaGeral")
public class ExtractoContaGeral implements Serializable {

    @Id
    @GeneratedValue
    private int extc_id;
    
    @Lob
    private String extc_movimento;
    private double extc_debito;
    private double extc_credito;
    
    
    private String extc_referencia;

    @Temporal(TemporalType.DATE)
    private Date extc_data;

    @ManyToOne
    private ContaGeral contaGeral;

    @ManyToOne
    private Lancamento lancamento;

    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getExtc_id() {
        return extc_id;
    }

    public void setExtc_id(int extc_id) {
        this.extc_id = extc_id;
    }

    public String getExtc_movimento() {
        return extc_movimento;
    }

    public void setExtc_movimento(String extc_movimento) {
        this.extc_movimento = extc_movimento;
    }

    public double getExtc_debito() {
        return extc_debito;
    }

    public void setExtc_debito(double extc_debito) {
        this.extc_debito = extc_debito;
    }

    public double getExtc_credito() {
        return extc_credito;
    }

    public void setExtc_credito(double extc_credito) {
        this.extc_credito = extc_credito;
    }

    public Date getExtc_data() {
        return extc_data;
    }

    public void setExtc_data(Date extc_data) {
        this.extc_data = extc_data;
    }

    public ContaGeral getContaGeral() {
        return contaGeral;
    }

    public void setContaGeral(ContaGeral contaGeral) {
        this.contaGeral = contaGeral;
    }

    public Lancamento getLancamento() {
        return lancamento;
    }

    public void setLancamento(Lancamento lancamento) {
        this.lancamento = lancamento;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getExtc_referencia() {
        return extc_referencia;
    }

    public void setExtc_referencia(String extc_referencia) {
        this.extc_referencia = extc_referencia;
    }

}
