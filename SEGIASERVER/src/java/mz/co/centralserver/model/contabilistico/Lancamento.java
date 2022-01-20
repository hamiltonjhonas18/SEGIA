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
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Lancamento")
public class Lancamento implements Serializable {

    @Id
    @GeneratedValue
    private int lan_id;
    private long lan_numero;

    @Lob
    private String lan_descricao;
    private double lan_valor;
    private double lan_iva;
    private String lan_operacao;

    private String lan_referenciaMovimento;
    private String lan_referenciaDiario;
    private String lan_referenciaDocumento;

    private String lan_referencia;

    @Temporal(TemporalType.DATE)
    private Date lan_data;

    @ManyToOne
    private Diario diario;

    @ManyToOne
    private ContaGeral contaCliente;

    @ManyToOne
    private ContaGeral contaPlano;

    @ManyToOne
    private Documento documento;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Factura factura;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getLan_id() {
        return lan_id;
    }

    public void setLan_id(int lan_id) {
        this.lan_id = lan_id;
    }

    public long getLan_numero() {
        return lan_numero;
    }

    public void setLan_numero(long lan_numero) {
        this.lan_numero = lan_numero;
    }

    public String getLan_descricao() {
        return lan_descricao;
    }

    public void setLan_descricao(String lan_descricao) {
        this.lan_descricao = lan_descricao;
    }

    public double getLan_valor() {
        return lan_valor;
    }

    public void setLan_valor(double lan_valor) {
        this.lan_valor = lan_valor;
    }

    public double getLan_iva() {
        return lan_iva;
    }

    public void setLan_iva(double lan_iva) {
        this.lan_iva = lan_iva;
    }

    public String getLan_operacao() {
        return lan_operacao;
    }

    public void setLan_operacao(String lan_operacao) {
        this.lan_operacao = lan_operacao;
    }

    public Date getLan_data() {
        return lan_data;
    }

    public void setLan_data(Date lan_data) {
        this.lan_data = lan_data;
    }

    public Diario getDiario() {
        return diario;
    }

    public void setDiario(Diario diario) {
        this.diario = diario;
    }

    public ContaGeral getContaCliente() {
        return contaCliente;
    }

    public void setContaCliente(ContaGeral contaCliente) {
        this.contaCliente = contaCliente;
    }

    public ContaGeral getContaPlano() {
        return contaPlano;
    }

    public void setContaPlano(ContaGeral contaPlano) {
        this.contaPlano = contaPlano;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getLan_referenciaMovimento() {
        return lan_referenciaMovimento;
    }

    public void setLan_referenciaMovimento(String lan_referenciaMovimento) {
        this.lan_referenciaMovimento = lan_referenciaMovimento;
    }

    public String getLan_referenciaDiario() {
        return lan_referenciaDiario;
    }

    public void setLan_referenciaDiario(String lan_referenciaDiario) {
        this.lan_referenciaDiario = lan_referenciaDiario;
    }

    public String getLan_referenciaDocumento() {
        return lan_referenciaDocumento;
    }

    public void setLan_referenciaDocumento(String lan_referenciaDocumento) {
        this.lan_referenciaDocumento = lan_referenciaDocumento;
    }

    public String getLan_referencia() {
        return lan_referencia;
    }

    public void setLan_referencia(String lan_referencia) {
        this.lan_referencia = lan_referencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

}
