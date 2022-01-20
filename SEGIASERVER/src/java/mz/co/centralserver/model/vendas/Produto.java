/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.vendas;

import mz.co.centralserver.model.gestao.Cor;
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
@Table(name = "Produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue
    private int pro_id;

    @Lob
    private String pro_nome;
    
    private double pro_preco;
    private double pro_preco2;
    private double pro_precoCompra;
    private int pro_estoque;
    private int pro_margemAlarme;
    
    private String pro_marca;
    private String pro_codigo;
    private String pro_codigo_barras;
    private String pro_descriminacao;
    private String pro_imagem;
    private String pro_segmento;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pro_dataFabrico;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pro_dataValidade;

    @Lob
    private String pro_detalhes;

    @ManyToOne
    private Tamanho tamanho;

    @ManyToOne
    private Cor cor;

    @ManyToOne
    private CategoriaProduto categoriaProduto;

    @ManyToOne
    private Entidade Entidade;

    @ManyToOne
    private Fornecedor fornecedor;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_nome() {
        return pro_nome;
    }

    public void setPro_nome(String pro_nome) {
        this.pro_nome = pro_nome;
    }

    public double getPro_preco() {
        return pro_preco;
    }

    public void setPro_preco(double pro_preco) {
        this.pro_preco = pro_preco;
    }

    public int getPro_estoque() {
        return pro_estoque;
    }

    public void setPro_estoque(int pro_estoque) {
        this.pro_estoque = pro_estoque;
    }

    public int getPro_margemAlarme() {
        return pro_margemAlarme;
    }

    public void setPro_margemAlarme(int pro_margemAlarme) {
        this.pro_margemAlarme = pro_margemAlarme;
    }

    public String getPro_marca() {
        return pro_marca;
    }

    public void setPro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getPro_codigo() {
        return pro_codigo;
    }

    public void setPro_codigo(String pro_codigo) {
        this.pro_codigo = pro_codigo;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getPro_detalhes() {
        return pro_detalhes;
    }

    public void setPro_detalhes(String pro_detalhes) {
        this.pro_detalhes = pro_detalhes;
    }

    public Date getPro_dataFabrico() {
        return pro_dataFabrico;
    }

    public void setPro_dataFabrico(Date pro_dataFabrico) {
        this.pro_dataFabrico = pro_dataFabrico;
    }

    public Date getPro_dataValidade() {
        return pro_dataValidade;
    }

    public void setPro_dataValidade(Date pro_dataValidade) {
        this.pro_dataValidade = pro_dataValidade;
    }

    public String getPro_descriminacao() {
        return pro_descriminacao;
    }

    public void setPro_descriminacao(String pro_descriminacao) {
        this.pro_descriminacao = pro_descriminacao;
    }

    public String getPro_imagem() {
        return pro_imagem;
    }

    public void setPro_imagem(String pro_imagem) {
        this.pro_imagem = pro_imagem;
    }

    public double getPro_precoCompra() {
        return pro_precoCompra;
    }

    public void setPro_precoCompra(double pro_precoCompra) {
        this.pro_precoCompra = pro_precoCompra;
    }

    public String getPro_segmento() {
        return pro_segmento;
    }

    public void setPro_segmento(String pro_segmento) {
        this.pro_segmento = pro_segmento;
    }

    public String getPro_codigo_barras() {
        return pro_codigo_barras;
    }

    public void setPro_codigo_barras(String pro_codigo_barras) {
        this.pro_codigo_barras = pro_codigo_barras;
    }

    public double getPro_preco2() {
        return pro_preco2;
    }

    public void setPro_preco2(double pro_preco2) {
        this.pro_preco2 = pro_preco2;
    }

}
