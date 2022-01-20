/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.vendas;

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
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="RequisicaoMaterial")
public class RequisicaoMaterial implements Serializable {
    
    @Id
    @GeneratedValue
    private int reqm_id;
    
    @Lob
    private String reqm_descricao;
    
    @Lob
    private String reqm_observacoes;
    
    private String reqm_documento;
    private String reqm_referencia;
    private String reqm_status;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqm_data;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqm_dataAprovacao;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqm_dataAlteracao;
    
    @ManyToOne
    private Entidade entidade;
    
    @ManyToOne
    private Pessoa pessoa;
    
    private boolean encrypted;

    public int getReqm_id() {
        return reqm_id;
    }

    public void setReqm_id(int reqm_id) {
        this.reqm_id = reqm_id;
    }

    public String getReqm_descricao() {
        return reqm_descricao;
    }

    public void setReqm_descricao(String reqm_descricao) {
        this.reqm_descricao = reqm_descricao;
    }

    public String getReqm_observacoes() {
        return reqm_observacoes;
    }

    public void setReqm_observacoes(String reqm_observacoes) {
        this.reqm_observacoes = reqm_observacoes;
    }

    public String getReqm_documento() {
        return reqm_documento;
    }

    public void setReqm_documento(String reqm_documento) {
        this.reqm_documento = reqm_documento;
    }

    public String getReqm_referencia() {
        return reqm_referencia;
    }

    public void setReqm_referencia(String reqm_referencia) {
        this.reqm_referencia = reqm_referencia;
    }

    public String getReqm_status() {
        return reqm_status;
    }

    public void setReqm_status(String reqm_status) {
        this.reqm_status = reqm_status;
    }

    public Date getReqm_data() {
        return reqm_data;
    }

    public void setReqm_data(Date reqm_data) {
        this.reqm_data = reqm_data;
    }

    public Date getReqm_dataAprovacao() {
        return reqm_dataAprovacao;
    }

    public void setReqm_dataAprovacao(Date reqm_dataAprovacao) {
        this.reqm_dataAprovacao = reqm_dataAprovacao;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getReqm_dataAlteracao() {
        return reqm_dataAlteracao;
    }

    public void setReqm_dataAlteracao(Date reqm_dataAlteracao) {
        this.reqm_dataAlteracao = reqm_dataAlteracao;
    }
}
