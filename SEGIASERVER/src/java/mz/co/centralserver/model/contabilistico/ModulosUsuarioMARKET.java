/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.contabilistico;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "ModulosUsuarioMARKET")
public class ModulosUsuarioMARKET implements Serializable {

    @Id
    @GeneratedValue
    private int mui_id;

    private boolean mui_clientes;
    private boolean mui_vendas;
    private boolean mui_usuarios;
    private boolean mui_despesas;
    private boolean mui_fornecedores;
    private boolean mui_produtos;
    private boolean mui_resultados;
    private boolean mui_empresas;
    private boolean mui_estatisticas;
    private boolean mui_guiasRemessa;
    private boolean mui_recursosHumanos;
    private boolean mui_planosDeConta;
    private boolean mui_facturas;
    private boolean mui_lancamentos;
    private boolean mui_petyCash;
    private boolean mui_moedas;
    private boolean mui_formasPagamento;
    private boolean mui_bancos;
    private boolean mui_requisicoes;
    private boolean mui_activos;
    private boolean mui_depositos;
    private boolean mui_requisicoes_add;
    private boolean mui_requisicoes_status;
    private boolean mui_requisicoes_aprove;
    private boolean mui_requisicoes_list;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isMui_clientes() {
        return mui_clientes;
    }

    public void setMui_clientes(boolean mui_clientes) {
        this.mui_clientes = mui_clientes;
    }

    public boolean isMui_vendas() {
        return mui_vendas;
    }

    public void setMui_vendas(boolean mui_vendas) {
        this.mui_vendas = mui_vendas;
    }

    public int getMui_id() {
        return mui_id;
    }

    public void setMui_id(int mui_id) {
        this.mui_id = mui_id;
    }

    public boolean isMui_usuarios() {
        return mui_usuarios;
    }

    public void setMui_usuarios(boolean mui_usuarios) {
        this.mui_usuarios = mui_usuarios;
    }

    public boolean isMui_despesas() {
        return mui_despesas;
    }

    public void setMui_despesas(boolean mui_despesas) {
        this.mui_despesas = mui_despesas;
    }

    public boolean isMui_fornecedores() {
        return mui_fornecedores;
    }

    public void setMui_fornecedores(boolean mui_fornecedores) {
        this.mui_fornecedores = mui_fornecedores;
    }

    public boolean isMui_resultados() {
        return mui_resultados;
    }

    public void setMui_resultados(boolean mui_resultados) {
        this.mui_resultados = mui_resultados;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public boolean isMui_produtos() {
        return mui_produtos;
    }

    public void setMui_produtos(boolean mui_produtos) {
        this.mui_produtos = mui_produtos;
    }

    public boolean isMui_empresas() {
        return mui_empresas;
    }

    public void setMui_empresas(boolean mui_empresas) {
        this.mui_empresas = mui_empresas;
    }

    public boolean isMui_estatisticas() {
        return mui_estatisticas;
    }

    public void setMui_estatisticas(boolean mui_estatisticas) {
        this.mui_estatisticas = mui_estatisticas;
    }

    public boolean isMui_guiasRemessa() {
        return mui_guiasRemessa;
    }

    public void setMui_guiasRemessa(boolean mui_guiasRemessa) {
        this.mui_guiasRemessa = mui_guiasRemessa;
    }

    public boolean isMui_recursosHumanos() {
        return mui_recursosHumanos;
    }

    public void setMui_recursosHumanos(boolean mui_recursosHumanos) {
        this.mui_recursosHumanos = mui_recursosHumanos;
    }

    public boolean isMui_planosDeConta() {
        return mui_planosDeConta;
    }

    public void setMui_planosDeConta(boolean mui_planosDeConta) {
        this.mui_planosDeConta = mui_planosDeConta;
    }

    public boolean isMui_facturas() {
        return mui_facturas;
    }

    public void setMui_facturas(boolean mui_facturas) {
        this.mui_facturas = mui_facturas;
    }

    public boolean isMui_lancamentos() {
        return mui_lancamentos;
    }

    public void setMui_lancamentos(boolean mui_lancamentos) {
        this.mui_lancamentos = mui_lancamentos;
    }

    public boolean isMui_petyCash() {
        return mui_petyCash;
    }

    public void setMui_petyCash(boolean mui_petyCash) {
        this.mui_petyCash = mui_petyCash;
    }

    public boolean isMui_moedas() {
        return mui_moedas;
    }

    public void setMui_moedas(boolean mui_moedas) {
        this.mui_moedas = mui_moedas;
    }

    public boolean isMui_formasPagamento() {
        return mui_formasPagamento;
    }

    public void setMui_formasPagamento(boolean mui_formasPagamento) {
        this.mui_formasPagamento = mui_formasPagamento;
    }

    public boolean isMui_bancos() {
        return mui_bancos;
    }

    public void setMui_bancos(boolean mui_bancos) {
        this.mui_bancos = mui_bancos;
    }

    public boolean isMui_requisicoes() {
        return mui_requisicoes;
    }

    public void setMui_requisicoes(boolean mui_requisicoes) {
        this.mui_requisicoes = mui_requisicoes;
    }

    public boolean isMui_activos() {
        return mui_activos;
    }

    public void setMui_activos(boolean mui_activos) {
        this.mui_activos = mui_activos;
    }

    public boolean isMui_depositos() {
        return mui_depositos;
    }

    public void setMui_depositos(boolean mui_depositos) {
        this.mui_depositos = mui_depositos;
    }

    public boolean isMui_requisicoes_add() {
        return mui_requisicoes_add;
    }

    public void setMui_requisicoes_add(boolean mui_requisicoes_add) {
        this.mui_requisicoes_add = mui_requisicoes_add;
    }

    public boolean isMui_requisicoes_status() {
        return mui_requisicoes_status;
    }

    public void setMui_requisicoes_status(boolean mui_requisicoes_status) {
        this.mui_requisicoes_status = mui_requisicoes_status;
    }

    public boolean isMui_requisicoes_aprove() {
        return mui_requisicoes_aprove;
    }

    public void setMui_requisicoes_aprove(boolean mui_requisicoes_aprove) {
        this.mui_requisicoes_aprove = mui_requisicoes_aprove;
    }

    public boolean isMui_requisicoes_list() {
        return mui_requisicoes_list;
    }

    public void setMui_requisicoes_list(boolean mui_requisicoes_list) {
        this.mui_requisicoes_list = mui_requisicoes_list;
    }

}
