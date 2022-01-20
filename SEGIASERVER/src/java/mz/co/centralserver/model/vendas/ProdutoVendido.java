/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.vendas;

import mz.co.centralserver.model.contabilistico.Factura;
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

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "ProdutoVendido")
public class ProdutoVendido implements Serializable {

    @Id
    @GeneratedValue
    private int prv_id;
    private int prv_qtd;
    private double prv_desconto;
    private double prv_ajuste;
    private double prv_total;
    private double prv_totalIva;
    private double prv_totalIvaMedio;
    private double prv_totalPrecoMedio;
    private double prv_iva;
    
    private double prv_custoVenda;
    private double prv_precoMedio;
    private double prv_precoCusto;

    private String prv_referencia;
    private String prv_tipoVenda;
    
    @Lob
    private String prv_descricao;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date prv_data;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Entidade Entidade;

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public int getPrv_id() {
        return prv_id;
    }

    public void setPrv_id(int prv_id) {
        this.prv_id = prv_id;
    }

    public int getPrv_qtd() {
        return prv_qtd;
    }

    public void setPrv_qtd(int prv_qtd) {
        this.prv_qtd = prv_qtd;
    }

    public double getPrv_desconto() {
        return prv_desconto;
    }

    public void setPrv_desconto(double prv_desconto) {
        this.prv_desconto = prv_desconto;
    }

    public double getPrv_total() {
        return prv_total;
    }

    public void setPrv_total(double prv_total) {
        this.prv_total = prv_total;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Date getPrv_data() {
        return prv_data;
    }

    public void setPrv_data(Date prv_data) {
        this.prv_data = prv_data;
    }

    public String getPrv_referencia() {
        return prv_referencia;
    }

    public void setPrv_referencia(String prv_referencia) {
        this.prv_referencia = prv_referencia;
    }

    public double getPrv_ajuste() {
        return prv_ajuste;
    }

    public void setPrv_ajuste(double prv_ajuste) {
        this.prv_ajuste = prv_ajuste;
    }

    public String getPrv_descricao() {
        return prv_descricao;
    }

    public void setPrv_descricao(String prv_descricao) {
        this.prv_descricao = prv_descricao;
    }

    public double getPrv_iva() {
        return prv_iva;
    }

    public void setPrv_iva(double prv_iva) {
        this.prv_iva = prv_iva;
    }

    public double getPrv_totalIva() {
        return prv_totalIva;
    }

    public void setPrv_totalIva(double prv_totalIva) {
        this.prv_totalIva = prv_totalIva;
    }

    public double getPrv_custoVenda() {
        return prv_custoVenda;
    }

    public void setPrv_custoVenda(double prv_custoVenda) {
        this.prv_custoVenda = prv_custoVenda;
    }

    public double getPrv_totalPrecoMedio() {
        return prv_totalPrecoMedio;
    }

    public void setPrv_totalPrecoMedio(double prv_totalPrecoMedio) {
        this.prv_totalPrecoMedio = prv_totalPrecoMedio;
    }

    public double getPrv_precoMedio() {
        return prv_precoMedio;
    }

    public void setPrv_precoMedio(double prv_precoMedio) {
        this.prv_precoMedio = prv_precoMedio;
    }

    public double getPrv_totalIvaMedio() {
        return prv_totalIvaMedio;
    }

    public void setPrv_totalIvaMedio(double prv_totalIvaMedio) {
        this.prv_totalIvaMedio = prv_totalIvaMedio;
    }

    public String getPrv_tipoVenda() {
        return prv_tipoVenda;
    }

    public void setPrv_tipoVenda(String prv_tipoVenda) {
        this.prv_tipoVenda = prv_tipoVenda;
    }

    public double getPrv_precoCusto() {
        return prv_precoCusto;
    }

    public void setPrv_precoCusto(double prv_precoCusto) {
        this.prv_precoCusto = prv_precoCusto;
    }

}
