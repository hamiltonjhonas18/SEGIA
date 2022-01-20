/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ispc;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="Despesa")
public class Despesa implements Serializable {
    
    @Id
    @GeneratedValue
    private int desp_id;
    
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date desp_data;
    
    private long desp_nrDocumento;
    
    private String desp_fornecedor;
    
    private long desp_nuit;
    
    private String desp_descricao;
    
    private String desp_status;
    
    private double desp_valor;
    
    private double desp_valorPago;
    
    private String desp_referencia;
    
    private boolean desp_aCredito;
    
    private double desp_valorExecutado;
    
    private int desp_numeroRequisicoes;
    
    @ManyToOne
    private TipoDespesa tipoDespesa;
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Entidade Entidade;
    
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

    public int getDesp_id() {
        return desp_id;
    }

    public void setDesp_id(int desp_id) {
        this.desp_id = desp_id;
    }

    public Date getDesp_data() {
        return desp_data;
    }

    public void setDesp_data(Date desp_data) {
        this.desp_data = desp_data;
    }

    public long getDesp_nrDocumento() {
        return desp_nrDocumento;
    }

    public void setDesp_nrDocumento(long desp_nrDocumento) {
        this.desp_nrDocumento = desp_nrDocumento;
    }

    public String getDesp_fornecedor() {
        return desp_fornecedor;
    }

    public void setDesp_fornecedor(String desp_fornecedor) {
        this.desp_fornecedor = desp_fornecedor;
    }

    public long getDesp_nuit() {
        return desp_nuit;
    }

    public void setDesp_nuit(long desp_nuit) {
        this.desp_nuit = desp_nuit;
    }

    public String getDesp_descricao() {
        return desp_descricao;
    }

    public void setDesp_descricao(String desp_descricao) {
        this.desp_descricao = desp_descricao;
    }

    public double getDesp_valor() {
        return desp_valor;
    }

    public void setDesp_valor(double desp_valor) {
        this.desp_valor = desp_valor;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDesp_status() {
        return desp_status;
    }

    public void setDesp_status(String desp_status) {
        this.desp_status = desp_status;
    }

    public String getDesp_referencia() {
        return desp_referencia;
    }

    public void setDesp_referencia(String desp_referencia) {
        this.desp_referencia = desp_referencia;
    }

    public boolean isDesp_aCredito() {
        return desp_aCredito;
    }

    public void setDesp_aCredito(boolean desp_aCredito) {
        this.desp_aCredito = desp_aCredito;
    }

    public double getDesp_valorPago() {
        return desp_valorPago;
    }

    public void setDesp_valorPago(double desp_valorPago) {
        this.desp_valorPago = desp_valorPago;
    }

    public double getDesp_valorExecutado() {
        return desp_valorExecutado;
    }

    public void setDesp_valorExecutado(double desp_valorExecutado) {
        this.desp_valorExecutado = desp_valorExecutado;
    }

    public int getDesp_numeroRequisicoes() {
        return desp_numeroRequisicoes;
    }

    public void setDesp_numeroRequisicoes(int desp_numeroRequisicoes) {
        this.desp_numeroRequisicoes = desp_numeroRequisicoes;
    }

}
