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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "guiaremessa")
public class GuiaRemessa implements Serializable {

    @Id
    @GeneratedValue
    private int guia_id;

    private String guia_referencia;
    private String guia_status;
    private String guia_designado;
    private String guia_tipo;

    private String guia_documento;

    @Lob
    private String guia_detalhes;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date guia_data;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date guia_dataAprovacao;

    private long guia_numeroLancamento;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Usuario usuario2;

    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Fornecedor fornecedor;
    

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public int getGuia_id() {
        return guia_id;
    }

    public void setGuia_id(int guia_id) {
        this.guia_id = guia_id;
    }

    public String getGuia_referencia() {
        return guia_referencia;
    }

    public void setGuia_referencia(String guia_referencia) {
        this.guia_referencia = guia_referencia;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Date getGuia_data() {
        return guia_data;
    }

    public void setGuia_data(Date guia_data) {
        this.guia_data = guia_data;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getGuia_status() {
        return guia_status;
    }

    public void setGuia_status(String guia_status) {
        this.guia_status = guia_status;
    }

    public String getGuia_designado() {
        return guia_designado;
    }

    public void setGuia_designado(String guia_designado) {
        this.guia_designado = guia_designado;
    }

    public Date getGuia_dataAprovacao() {
        return guia_dataAprovacao;
    }

    public void setGuia_dataAprovacao(Date guia_dataAprovacao) {
        this.guia_dataAprovacao = guia_dataAprovacao;
    }

    public long getGuia_numeroLancamento() {
        return guia_numeroLancamento;
    }

    public void setGuia_numeroLancamento(long guia_numeroLancamento) {
        this.guia_numeroLancamento = guia_numeroLancamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getGuia_tipo() {
        return guia_tipo;
    }

    public void setGuia_tipo(String guia_tipo) {
        this.guia_tipo = guia_tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getGuia_documento() {
        return guia_documento;
    }

    public void setGuia_documento(String guia_documento) {
        this.guia_documento = guia_documento;
    }

    public String getGuia_detalhes() {
        return guia_detalhes;
    }

    public void setGuia_detalhes(String guia_detalhes) {
        this.guia_detalhes = guia_detalhes;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
