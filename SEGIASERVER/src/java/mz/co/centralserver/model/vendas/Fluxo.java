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
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "fluxo")
public class Fluxo implements Serializable {

    @Id
    @GeneratedValue
    private int flux_id;

    private String flux_tipo;

    private String flux_tipoVenda;
    
    private String flux_referenciaDocumento;

    private int flux_qtd;

    private int flux_qtdPresente;
    
    private int flux_ultimoStock;
    
    private double flux_custoVenda;
    
    @Lob
    private String flux_descricao;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date flux_data;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Factura factura;
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Turma turma;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getFlux_id() {
        return flux_id;
    }

    public void setFlux_id(int flux_id) {
        this.flux_id = flux_id;
    }

    public String getFlux_tipo() {
        return flux_tipo;
    }

    public void setFlux_tipo(String flux_tipo) {
        this.flux_tipo = flux_tipo;
    }

    public int getFlux_qtd() {
        return flux_qtd;
    }

    public void setFlux_qtd(int flux_qtd) {
        this.flux_qtd = flux_qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFlux_data() {
        return flux_data;
    }

    public void setFlux_data(Date flux_data) {
        this.flux_data = flux_data;
    }

    public int getFlux_qtdPresente() {
        return flux_qtdPresente;
    }

    public void setFlux_qtdPresente(int flux_qtdPresente) {
        this.flux_qtdPresente = flux_qtdPresente;
    }

    public int getFlux_ultimoStock() {
        return flux_ultimoStock;
    }

    public void setFlux_ultimoStock(int flux_ultimoStock) {
        this.flux_ultimoStock = flux_ultimoStock;
    }

    public String getFlux_descricao() {
        return flux_descricao;
    }

    public void setFlux_descricao(String flux_descricao) {
        this.flux_descricao = flux_descricao;
    }

    public double getFlux_custoVenda() {
        return flux_custoVenda;
    }

    public void setFlux_custoVenda(double flux_custoVenda) {
        this.flux_custoVenda = flux_custoVenda;
    }

    public String getFlux_tipoVenda() {
        return flux_tipoVenda;
    }

    public void setFlux_tipoVenda(String flux_tipoVenda) {
        this.flux_tipoVenda = flux_tipoVenda;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFlux_referenciaDocumento() {
        return flux_referenciaDocumento;
    }

    public void setFlux_referenciaDocumento(String flux_referenciaDocumento) {
        this.flux_referenciaDocumento = flux_referenciaDocumento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }


}
