/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.vendas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "ProdutoRequisicao")
public class ProdutoRequisicao implements Serializable {

    @Id
    @GeneratedValue
    private int prr_id;
    private int prr_qtd;

    private String prr_referencia;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date prr_data;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private RequisicaoMaterial requisicaoMaterial;

    @ManyToOne
    private Entidade Entidade;

    public int getPrr_id() {
        return prr_id;
    }

    public void setPrr_id(int prr_id) {
        this.prr_id = prr_id;
    }

    public int getPrr_qtd() {
        return prr_qtd;
    }

    public void setPrr_qtd(int prr_qtd) {
        this.prr_qtd = prr_qtd;
    }

    public String getPrr_referencia() {
        return prr_referencia;
    }

    public void setPrr_referencia(String prr_referencia) {
        this.prr_referencia = prr_referencia;
    }

    public Date getPrr_data() {
        return prr_data;
    }

    public void setPrr_data(Date prr_data) {
        this.prr_data = prr_data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public RequisicaoMaterial getRequisicaoMaterial() {
        return requisicaoMaterial;
    }

    public void setRequisicaoMaterial(RequisicaoMaterial requisicaoMaterial) {
        this.requisicaoMaterial = requisicaoMaterial;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    

}
