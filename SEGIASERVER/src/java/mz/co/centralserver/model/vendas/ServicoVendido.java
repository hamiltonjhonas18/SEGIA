/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.vendas;

import mz.co.centralserver.model.contabilistico.Factura;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "ServicoVendido")
public class ServicoVendido implements Serializable {

    @Id
    @GeneratedValue
    private int srv_id;
    private int srv_qtd;
    private double srv_desconto;
    private double srv_total;

    @ManyToOne
    private Servico servico;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getSrv_id() {
        return srv_id;
    }

    public void setSrv_id(int srv_id) {
        this.srv_id = srv_id;
    }

    public int getSrv_qtd() {
        return srv_qtd;
    }

    public void setSrv_qtd(int srv_qtd) {
        this.srv_qtd = srv_qtd;
    }

    public double getSrv_desconto() {
        return srv_desconto;
    }

    public void setSrv_desconto(double srv_desconto) {
        this.srv_desconto = srv_desconto;
    }

    public double getSrv_total() {
        return srv_total;
    }

    public void setSrv_total(double srv_total) {
        this.srv_total = srv_total;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
