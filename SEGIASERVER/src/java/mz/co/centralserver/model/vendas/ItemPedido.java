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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "ItemPedido")
public class ItemPedido implements Serializable {

    @Id
    @GeneratedValue
    private int itp_id;
    private int itp_quantidade;
    private int itp_refProduto;

    private double itp_desconto;
    private double itp_precoUnit;
    private double itp_precoTotal;
    private double itp_precoTotalMedio;
    private double itp_precoIva;
    private double itp_precoIvaMedio;
    private double itp_iva;
    
    private double itp_custoVenda;
    
    private double itp_precoMedio;

    private long itp_referenciaFactura;
    
    @Lob
    private String itp_descricao;

    private String itp_referencia;
    private String itp_referenciaGuia;
    private String itp_cod;
    private String itp_tipoVenda;

    @Temporal(TemporalType.TIMESTAMP)
    private Date itp_data;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private GuiaRemessa guiaRemessa;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getItp_id() {
        return itp_id;
    }

    public void setItp_id(int itp_id) {
        this.itp_id = itp_id;
    }

    public int getItp_quantidade() {
        return itp_quantidade;
    }

    public void setItp_quantidade(int itp_quantidade) {
        this.itp_quantidade = itp_quantidade;
    }

    public double getItp_desconto() {
        return itp_desconto;
    }

    public void setItp_desconto(double itp_desconto) {
        this.itp_desconto = itp_desconto;
    }

    public long getItp_referenciaFactura() {
        return itp_referenciaFactura;
    }

    public void setItp_referenciaFactura(long itp_referenciaFactura) {
        this.itp_referenciaFactura = itp_referenciaFactura;
    }

    public String getItp_descricao() {
        return itp_descricao;
    }

    public void setItp_descricao(String itp_descricao) {
        this.itp_descricao = itp_descricao;
    }

    public double getItp_precoUnit() {
        return itp_precoUnit;
    }

    public void setItp_precoUnit(double itp_precoUnit) {
        this.itp_precoUnit = itp_precoUnit;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Date getItp_data() {
        return itp_data;
    }

    public void setItp_data(Date itp_data) {
        this.itp_data = itp_data;
    }

    public String getItp_referencia() {
        return itp_referencia;
    }

    public void setItp_referencia(String itp_referencia) {
        this.itp_referencia = itp_referencia;
    }

    public String getItp_cod() {
        return itp_cod;
    }

    public void setItp_cod(String itp_cod) {
        this.itp_cod = itp_cod;
    }

    public double getItp_iva() {
        return itp_iva;
    }

    public void setItp_iva(double itp_iva) {
        this.itp_iva = itp_iva;
    }

    public String getItp_referenciaGuia() {
        return itp_referenciaGuia;
    }

    public void setItp_referenciaGuia(String itp_referenciaGuia) {
        this.itp_referenciaGuia = itp_referenciaGuia;
    }

    public double getItp_precoTotal() {
        return itp_precoTotal;
    }

    public void setItp_precoTotal(double itp_precoTotal) {
        this.itp_precoTotal = itp_precoTotal;
    }

    public double getItp_precoIva() {
        return itp_precoIva;
    }

    public void setItp_precoIva(double itp_precoIva) {
        this.itp_precoIva = itp_precoIva;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public GuiaRemessa getGuiaRemessa() {
        return guiaRemessa;
    }

    public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
        this.guiaRemessa = guiaRemessa;
    }

    public int getItp_refProduto() {
        return itp_refProduto;
    }

    public void setItp_refProduto(int itp_refProduto) {
        this.itp_refProduto = itp_refProduto;
    }

    public double getItp_custoVenda() {
        return itp_custoVenda;
    }

    public void setItp_custoVenda(double itp_custoVenda) {
        this.itp_custoVenda = itp_custoVenda;
    }

    public double getItp_precoTotalMedio() {
        return itp_precoTotalMedio;
    }

    public void setItp_precoTotalMedio(double itp_precoTotalMedio) {
        this.itp_precoTotalMedio = itp_precoTotalMedio;
    }

    public double getItp_precoMedio() {
        return itp_precoMedio;
    }

    public void setItp_precoMedio(double itp_precoMedio) {
        this.itp_precoMedio = itp_precoMedio;
    }

    public double getItp_precoIvaMedio() {
        return itp_precoIvaMedio;
    }

    public void setItp_precoIvaMedio(double itp_precoIvaMedio) {
        this.itp_precoIvaMedio = itp_precoIvaMedio;
    }

    public String getItp_tipoVenda() {
        return itp_tipoVenda;
    }

    public void setItp_tipoVenda(String itp_tipoVenda) {
        this.itp_tipoVenda = itp_tipoVenda;
    }

}
