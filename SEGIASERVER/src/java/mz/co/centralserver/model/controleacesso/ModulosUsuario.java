/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.controleacesso;

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
@Table(name = "ModulosUsuario")
public class ModulosUsuario implements Serializable {

    @Id
    @GeneratedValue
    private int mui_id;

    private boolean mui_gestao;
    private boolean mui_gestao_formados;
    private boolean mui_gestao_formadores;
    private boolean mui_gestao_centros;
    private boolean mui_gestao_parceiros;
    private boolean mui_gestao_turmas;
    private boolean mui_gestao_inscricoes;

    private boolean mui_usuarios;
    private boolean mui_usuarios_add;
    private boolean mui_usuarios_permissoes;
    private boolean mui_usuarios_logs;
    private boolean mui_usuarios_status;

    private boolean mui_avaliacao;
    private boolean mui_avaliacao_notas;
    private boolean mui_avaliacao_pautas;
    private boolean mui_avaliacao_boletins;
    private boolean mui_avaliacao_presencas;
    private boolean mui_avaliacao_observacoes;

    private boolean mui_cursos;
    private boolean mui_cursos_cursos;
    private boolean mui_cursos_areasInscricao;
    private boolean mui_cursos_modulos;
    private boolean mui_cursos_cursosCentro;

    private boolean mui_calendario;
    private boolean mui_calendario_horario;
    private boolean mui_calendario_testes;
    private boolean mui_calendario_exames;
    private boolean mui_calendario_recorrencias;

    private boolean mui_estatisticas;
    private boolean mui_estatisticas_curso;
    private boolean mui_estatisticas_gerais;

    private boolean mui_despesas;
    private boolean mui_despesas_internas;
    private boolean mui_despesas_estoque;
    private boolean mui_despesas_formacao;
    private boolean mui_despesas_extracto;
    private boolean mui_fornecedores;

    private boolean mui_pagamentos;
    private boolean mui_pagamentos_taxas;
    private boolean mui_pagamentos_propinas;
    private boolean mui_pagamentos_multas;
    private boolean mui_pagamentos_outrosPagamentos;
    private boolean mui_pagamentos_pagamentosOnline;
    private boolean mui_pagamentos_situacaoPagamentos;

    private boolean mui_resultados;

    private boolean mui_lembres;
    private boolean mui_aprovacaoDespesas;
    private boolean mui_contratos;
    private boolean mui_configuracao;
    private boolean mui_requisicoes;
    private boolean mui_bancos;
    private boolean mui_lancamentos;

    private boolean mui_clientes;
    private boolean mui_vendas;
    private boolean mui_produtos;
    private boolean mui_empresas;
    private boolean mui_guiasRemessa;
    private boolean mui_recursosHumanos;
    private boolean mui_planosDeConta;
    private boolean mui_facturas;
    private boolean mui_petyCash;
    private boolean mui_moedas;
    private boolean mui_formasPagamento;
    private boolean mui_activos;
    private boolean mui_depositos;
    private boolean mui_requisicoes_add;
    private boolean mui_requisicoes_status;
    private boolean mui_requisicoes_aprove;
    private boolean mui_requisicoes_list;

    private boolean mui_docuemntos;
    
    private boolean mui_disciplinas;
    private boolean mui_disciplinas_gestao;
    private boolean mui_disciplinas_turma;
    private boolean mui_disciplinas_curso;
    private boolean mui_disciplinas_docente;
    
    
    private boolean mui_biblioteca;
    private boolean mui_comercial;
    private boolean mui_armazem;
    private boolean mui_financeiro;

    
    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public int getMui_id() {
        return mui_id;
    }

    public void setMui_id(int mui_id) {
        this.mui_id = mui_id;
    }

    public boolean isMui_gestao() {
        return mui_gestao;
    }

    public void setMui_gestao(boolean mui_gestao) {
        this.mui_gestao = mui_gestao;
    }

    public boolean isMui_gestao_formados() {
        return mui_gestao_formados;
    }

    public void setMui_gestao_formados(boolean mui_gestao_formados) {
        this.mui_gestao_formados = mui_gestao_formados;
    }

    public boolean isMui_gestao_formadores() {
        return mui_gestao_formadores;
    }

    public void setMui_gestao_formadores(boolean mui_gestao_formadores) {
        this.mui_gestao_formadores = mui_gestao_formadores;
    }

    public boolean isMui_gestao_centros() {
        return mui_gestao_centros;
    }

    public void setMui_gestao_centros(boolean mui_gestao_centros) {
        this.mui_gestao_centros = mui_gestao_centros;
    }

    public boolean isMui_gestao_parceiros() {
        return mui_gestao_parceiros;
    }

    public void setMui_gestao_parceiros(boolean mui_gestao_parceiros) {
        this.mui_gestao_parceiros = mui_gestao_parceiros;
    }

    public boolean isMui_gestao_turmas() {
        return mui_gestao_turmas;
    }

    public void setMui_gestao_turmas(boolean mui_gestao_turmas) {
        this.mui_gestao_turmas = mui_gestao_turmas;
    }

    public boolean isMui_gestao_inscricoes() {
        return mui_gestao_inscricoes;
    }

    public void setMui_gestao_inscricoes(boolean mui_gestao_inscricoes) {
        this.mui_gestao_inscricoes = mui_gestao_inscricoes;
    }

    public boolean isMui_usuarios() {
        return mui_usuarios;
    }

    public void setMui_usuarios(boolean mui_usuarios) {
        this.mui_usuarios = mui_usuarios;
    }

    public boolean isMui_usuarios_add() {
        return mui_usuarios_add;
    }

    public void setMui_usuarios_add(boolean mui_usuarios_add) {
        this.mui_usuarios_add = mui_usuarios_add;
    }

    public boolean isMui_usuarios_permissoes() {
        return mui_usuarios_permissoes;
    }

    public void setMui_usuarios_permissoes(boolean mui_usuarios_permissoes) {
        this.mui_usuarios_permissoes = mui_usuarios_permissoes;
    }

    public boolean isMui_usuarios_logs() {
        return mui_usuarios_logs;
    }

    public void setMui_usuarios_logs(boolean mui_usuarios_logs) {
        this.mui_usuarios_logs = mui_usuarios_logs;
    }

    public boolean isMui_usuarios_status() {
        return mui_usuarios_status;
    }

    public void setMui_usuarios_status(boolean mui_usuarios_status) {
        this.mui_usuarios_status = mui_usuarios_status;
    }

    public boolean isMui_avaliacao() {
        return mui_avaliacao;
    }

    public void setMui_avaliacao(boolean mui_avaliacao) {
        this.mui_avaliacao = mui_avaliacao;
    }

    public boolean isMui_avaliacao_notas() {
        return mui_avaliacao_notas;
    }

    public void setMui_avaliacao_notas(boolean mui_avaliacao_notas) {
        this.mui_avaliacao_notas = mui_avaliacao_notas;
    }

    public boolean isMui_avaliacao_pautas() {
        return mui_avaliacao_pautas;
    }

    public void setMui_avaliacao_pautas(boolean mui_avaliacao_pautas) {
        this.mui_avaliacao_pautas = mui_avaliacao_pautas;
    }

    public boolean isMui_avaliacao_boletins() {
        return mui_avaliacao_boletins;
    }

    public void setMui_avaliacao_boletins(boolean mui_avaliacao_boletins) {
        this.mui_avaliacao_boletins = mui_avaliacao_boletins;
    }

    public boolean isMui_avaliacao_presencas() {
        return mui_avaliacao_presencas;
    }

    public void setMui_avaliacao_presencas(boolean mui_avaliacao_presencas) {
        this.mui_avaliacao_presencas = mui_avaliacao_presencas;
    }

    public boolean isMui_avaliacao_observacoes() {
        return mui_avaliacao_observacoes;
    }

    public void setMui_avaliacao_observacoes(boolean mui_avaliacao_observacoes) {
        this.mui_avaliacao_observacoes = mui_avaliacao_observacoes;
    }

    public boolean isMui_cursos() {
        return mui_cursos;
    }

    public void setMui_cursos(boolean mui_cursos) {
        this.mui_cursos = mui_cursos;
    }

    public boolean isMui_cursos_cursos() {
        return mui_cursos_cursos;
    }

    public void setMui_cursos_cursos(boolean mui_cursos_cursos) {
        this.mui_cursos_cursos = mui_cursos_cursos;
    }

    public boolean isMui_cursos_areasInscricao() {
        return mui_cursos_areasInscricao;
    }

    public void setMui_cursos_areasInscricao(boolean mui_cursos_areasInscricao) {
        this.mui_cursos_areasInscricao = mui_cursos_areasInscricao;
    }

    public boolean isMui_cursos_modulos() {
        return mui_cursos_modulos;
    }

    public void setMui_cursos_modulos(boolean mui_cursos_modulos) {
        this.mui_cursos_modulos = mui_cursos_modulos;
    }

    public boolean isMui_cursos_cursosCentro() {
        return mui_cursos_cursosCentro;
    }

    public void setMui_cursos_cursosCentro(boolean mui_cursos_cursosCentro) {
        this.mui_cursos_cursosCentro = mui_cursos_cursosCentro;
    }

    public boolean isMui_calendario() {
        return mui_calendario;
    }

    public void setMui_calendario(boolean mui_calendario) {
        this.mui_calendario = mui_calendario;
    }

    public boolean isMui_calendario_horario() {
        return mui_calendario_horario;
    }

    public void setMui_calendario_horario(boolean mui_calendario_horario) {
        this.mui_calendario_horario = mui_calendario_horario;
    }

    public boolean isMui_calendario_testes() {
        return mui_calendario_testes;
    }

    public void setMui_calendario_testes(boolean mui_calendario_testes) {
        this.mui_calendario_testes = mui_calendario_testes;
    }

    public boolean isMui_calendario_exames() {
        return mui_calendario_exames;
    }

    public void setMui_calendario_exames(boolean mui_calendario_exames) {
        this.mui_calendario_exames = mui_calendario_exames;
    }

    public boolean isMui_calendario_recorrencias() {
        return mui_calendario_recorrencias;
    }

    public void setMui_calendario_recorrencias(boolean mui_calendario_recorrencias) {
        this.mui_calendario_recorrencias = mui_calendario_recorrencias;
    }

    public boolean isMui_estatisticas() {
        return mui_estatisticas;
    }

    public void setMui_estatisticas(boolean mui_estatisticas) {
        this.mui_estatisticas = mui_estatisticas;
    }

    public boolean isMui_estatisticas_curso() {
        return mui_estatisticas_curso;
    }

    public void setMui_estatisticas_curso(boolean mui_estatisticas_curso) {
        this.mui_estatisticas_curso = mui_estatisticas_curso;
    }

    public boolean isMui_estatisticas_gerais() {
        return mui_estatisticas_gerais;
    }

    public void setMui_estatisticas_gerais(boolean mui_estatisticas_gerais) {
        this.mui_estatisticas_gerais = mui_estatisticas_gerais;
    }

    public boolean isMui_despesas() {
        return mui_despesas;
    }

    public void setMui_despesas(boolean mui_despesas) {
        this.mui_despesas = mui_despesas;
    }

    public boolean isMui_despesas_internas() {
        return mui_despesas_internas;
    }

    public void setMui_despesas_internas(boolean mui_despesas_internas) {
        this.mui_despesas_internas = mui_despesas_internas;
    }

    public boolean isMui_despesas_estoque() {
        return mui_despesas_estoque;
    }

    public void setMui_despesas_estoque(boolean mui_despesas_estoque) {
        this.mui_despesas_estoque = mui_despesas_estoque;
    }

    public boolean isMui_despesas_formacao() {
        return mui_despesas_formacao;
    }

    public void setMui_despesas_formacao(boolean mui_despesas_formacao) {
        this.mui_despesas_formacao = mui_despesas_formacao;
    }

    public boolean isMui_despesas_extracto() {
        return mui_despesas_extracto;
    }

    public void setMui_despesas_extracto(boolean mui_despesas_extracto) {
        this.mui_despesas_extracto = mui_despesas_extracto;
    }

    public boolean isMui_pagamentos() {
        return mui_pagamentos;
    }

    public void setMui_pagamentos(boolean mui_pagamentos) {
        this.mui_pagamentos = mui_pagamentos;
    }

    public boolean isMui_pagamentos_taxas() {
        return mui_pagamentos_taxas;
    }

    public void setMui_pagamentos_taxas(boolean mui_pagamentos_taxas) {
        this.mui_pagamentos_taxas = mui_pagamentos_taxas;
    }

    public boolean isMui_pagamentos_propinas() {
        return mui_pagamentos_propinas;
    }

    public void setMui_pagamentos_propinas(boolean mui_pagamentos_propinas) {
        this.mui_pagamentos_propinas = mui_pagamentos_propinas;
    }

    public boolean isMui_pagamentos_multas() {
        return mui_pagamentos_multas;
    }

    public void setMui_pagamentos_multas(boolean mui_pagamentos_multas) {
        this.mui_pagamentos_multas = mui_pagamentos_multas;
    }

    public boolean isMui_pagamentos_pagamentosOnline() {
        return mui_pagamentos_pagamentosOnline;
    }

    public void setMui_pagamentos_pagamentosOnline(boolean mui_pagamentos_pagamentosOnline) {
        this.mui_pagamentos_pagamentosOnline = mui_pagamentos_pagamentosOnline;
    }

    public boolean isMui_pagamentos_situacaoPagamentos() {
        return mui_pagamentos_situacaoPagamentos;
    }

    public void setMui_pagamentos_situacaoPagamentos(boolean mui_pagamentos_situacaoPagamentos) {
        this.mui_pagamentos_situacaoPagamentos = mui_pagamentos_situacaoPagamentos;
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

    public boolean isMui_fornecedores() {
        return mui_fornecedores;
    }

    public void setMui_fornecedores(boolean mui_fornecedores) {
        this.mui_fornecedores = mui_fornecedores;
    }

    public boolean isMui_pagamentos_outrosPagamentos() {
        return mui_pagamentos_outrosPagamentos;
    }

    public void setMui_pagamentos_outrosPagamentos(boolean mui_pagamentos_outrosPagamentos) {
        this.mui_pagamentos_outrosPagamentos = mui_pagamentos_outrosPagamentos;
    }

    public boolean isMui_lembres() {
        return mui_lembres;
    }

    public void setMui_lembres(boolean mui_lembres) {
        this.mui_lembres = mui_lembres;
    }

    public boolean isMui_aprovacaoDespesas() {
        return mui_aprovacaoDespesas;
    }

    public void setMui_aprovacaoDespesas(boolean mui_aprovacaoDespesas) {
        this.mui_aprovacaoDespesas = mui_aprovacaoDespesas;
    }

    public boolean isMui_contratos() {
        return mui_contratos;
    }

    public void setMui_contratos(boolean mui_contratos) {
        this.mui_contratos = mui_contratos;
    }

    public boolean isMui_configuracao() {
        return mui_configuracao;
    }

    public void setMui_configuracao(boolean mui_configuracao) {
        this.mui_configuracao = mui_configuracao;
    }

    public boolean isMui_requisicoes() {
        return mui_requisicoes;
    }

    public void setMui_requisicoes(boolean mui_requisicoes) {
        this.mui_requisicoes = mui_requisicoes;
    }

    public boolean isMui_bancos() {
        return mui_bancos;
    }

    public void setMui_bancos(boolean mui_bancos) {
        this.mui_bancos = mui_bancos;
    }

    public boolean isMui_lancamentos() {
        return mui_lancamentos;
    }

    public void setMui_lancamentos(boolean mui_lancamentos) {
        this.mui_lancamentos = mui_lancamentos;
    }

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

    public boolean isMui_docuemntos() {
        return mui_docuemntos;
    }

    public void setMui_docuemntos(boolean mui_docuemntos) {
        this.mui_docuemntos = mui_docuemntos;
    }

    public boolean isMui_disciplinas() {
        return mui_disciplinas;
    }

    public void setMui_disciplinas(boolean mui_disciplinas) {
        this.mui_disciplinas = mui_disciplinas;
    }

    public boolean isMui_disciplinas_gestao() {
        return mui_disciplinas_gestao;
    }

    public void setMui_disciplinas_gestao(boolean mui_disciplinas_gestao) {
        this.mui_disciplinas_gestao = mui_disciplinas_gestao;
    }

    public boolean isMui_disciplinas_turma() {
        return mui_disciplinas_turma;
    }

    public void setMui_disciplinas_turma(boolean mui_disciplinas_turma) {
        this.mui_disciplinas_turma = mui_disciplinas_turma;
    }

    public boolean isMui_disciplinas_curso() {
        return mui_disciplinas_curso;
    }

    public void setMui_disciplinas_curso(boolean mui_disciplinas_curso) {
        this.mui_disciplinas_curso = mui_disciplinas_curso;
    }

    public boolean isMui_disciplinas_docente() {
        return mui_disciplinas_docente;
    }

    public void setMui_disciplinas_docente(boolean mui_disciplinas_docente) {
        this.mui_disciplinas_docente = mui_disciplinas_docente;
    }

    public boolean isMui_biblioteca() {
        return mui_biblioteca;
    }

    public void setMui_biblioteca(boolean mui_biblioteca) {
        this.mui_biblioteca = mui_biblioteca;
    }

    public boolean isMui_comercial() {
        return mui_comercial;
    }

    public void setMui_comercial(boolean mui_comercial) {
        this.mui_comercial = mui_comercial;
    }

    public boolean isMui_armazem() {
        return mui_armazem;
    }

    public void setMui_armazem(boolean mui_armazem) {
        this.mui_armazem = mui_armazem;
    }

    public boolean isMui_financeiro() {
        return mui_financeiro;
    }

    public void setMui_financeiro(boolean mui_financeiro) {
        this.mui_financeiro = mui_financeiro;
    }

}
