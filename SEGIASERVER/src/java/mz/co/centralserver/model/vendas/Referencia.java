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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "referencia")
public class Referencia implements Serializable {

    @Id
    @GeneratedValue

    private int ref_id;

    private int ref_factura;

    private int ref_funcionario;

    private int ref_salario;

    private int ref_notaCredito;

    private int ref_notaDebito;

    private int ref_recibo;

    private int ref_vendaDinheiro;

    private int ref_facturaProForma;

    private int ref_guiaRemessa;

    private int ref_guiaEntrada;

    private int ref_guiaAbate;

    private int ref_requisicao;

    private int ref_extractoCliente;

    private int ref_extractoStockGeral;

    private int ref_extractoStockArtigo;

    private int ref_cliente;

    private int ref_fornecedor;

    private int ref_despesa;

    private int ref_banco;

    private int ref_lancamento;

    private int ref_documento;

    private int ref_diario;

    private int ref_pety;

    private int ref_petycash;

    private int ref_pagamento;

    private int ref_pagamentos;

    private int ref_bordos;

    private int ref_compras;

    private int ref_vendas;

    private int ref_movimento;

    private int ref_requisicaoCheque;

    private int ref_deposito;

    private int ref_lembrete;

    private int ref_guia;

    private int ref_processamento;

    private int ref_fecho;

    private int ref_inscricoes;

    private String ref_entidade;

    private int ref_adenda;

    private int ref_budget;

    private int ref_contrato;

    private int ref_faltas;

    private int ref_faltasJustificadas;

    private int ref_estudanteAprovacoes;

    private int ref_estudanteDispensas;

    private int ref_estudanteExclusoes;

    private int ref_estudanteReprovacoes;

    private int ref_estudante;

    private int ref_turma;

    private int ref_docente;

    private int ref_disciplina;

    private int ref_curso;

    private int ref_reciboPagamento;

    private String ref_ano;

    public int getRef_id() {
        return ref_id;
    }

    public void setRef_id(int ref_id) {
        this.ref_id = ref_id;
    }

    public int getRef_factura() {
        return ref_factura;
    }

    public void setRef_factura(int ref_factura) {
        this.ref_factura = ref_factura;
    }

    public int getRef_notaCredito() {
        return ref_notaCredito;
    }

    public void setRef_notaCredito(int ref_notaCredito) {
        this.ref_notaCredito = ref_notaCredito;
    }

    public int getRef_notaDebito() {
        return ref_notaDebito;
    }

    public void setRef_notaDebito(int ref_notaDebito) {
        this.ref_notaDebito = ref_notaDebito;
    }

    public int getRef_recibo() {
        return ref_recibo;
    }

    public void setRef_recibo(int ref_recibo) {
        this.ref_recibo = ref_recibo;
    }

    public int getRef_vendaDinheiro() {
        return ref_vendaDinheiro;
    }

    public void setRef_vendaDinheiro(int ref_vendaDinheiro) {
        this.ref_vendaDinheiro = ref_vendaDinheiro;
    }

    public int getRef_facturaProForma() {
        return ref_facturaProForma;
    }

    public void setRef_facturaProForma(int ref_facturaProForma) {
        this.ref_facturaProForma = ref_facturaProForma;
    }

    public int getRef_guiaRemessa() {
        return ref_guiaRemessa;
    }

    public void setRef_guiaRemessa(int ref_guiaRemessa) {
        this.ref_guiaRemessa = ref_guiaRemessa;
    }

    public int getRef_guiaEntrada() {
        return ref_guiaEntrada;
    }

    public void setRef_guiaEntrada(int ref_guiaEntrada) {
        this.ref_guiaEntrada = ref_guiaEntrada;
    }

    public int getRef_guiaAbate() {
        return ref_guiaAbate;
    }

    public void setRef_guiaAbate(int ref_guiaAbate) {
        this.ref_guiaAbate = ref_guiaAbate;
    }

    public int getRef_requisicao() {
        return ref_requisicao;
    }

    public void setRef_requisicao(int ref_requisicao) {
        this.ref_requisicao = ref_requisicao;
    }

    public int getRef_extractoCliente() {
        return ref_extractoCliente;
    }

    public void setRef_extractoCliente(int ref_extractoCliente) {
        this.ref_extractoCliente = ref_extractoCliente;
    }

    public int getRef_extractoStockGeral() {
        return ref_extractoStockGeral;
    }

    public void setRef_extractoStockGeral(int ref_extractoStockGeral) {
        this.ref_extractoStockGeral = ref_extractoStockGeral;
    }

    public int getRef_extractoStockArtigo() {
        return ref_extractoStockArtigo;
    }

    public void setRef_extractoStockArtigo(int ref_extractoStockArtigo) {
        this.ref_extractoStockArtigo = ref_extractoStockArtigo;
    }

    public int getRef_cliente() {
        return ref_cliente;
    }

    public void setRef_cliente(int ref_cliente) {
        this.ref_cliente = ref_cliente;
    }

    public int getRef_fornecedor() {
        return ref_fornecedor;
    }

    public void setRef_fornecedor(int ref_fornecedor) {
        this.ref_fornecedor = ref_fornecedor;
    }

    public int getRef_despesa() {
        return ref_despesa;
    }

    public void setRef_despesa(int ref_despesa) {
        this.ref_despesa = ref_despesa;
    }

    public int getRef_banco() {
        return ref_banco;
    }

    public void setRef_banco(int ref_banco) {
        this.ref_banco = ref_banco;
    }

    public int getRef_lancamento() {
        return ref_lancamento;
    }

    public void setRef_lancamento(int ref_lancamento) {
        this.ref_lancamento = ref_lancamento;
    }

    public int getRef_documento() {
        return ref_documento;
    }

    public void setRef_documento(int ref_documento) {
        this.ref_documento = ref_documento;
    }

    public int getRef_diario() {
        return ref_diario;
    }

    public void setRef_diario(int ref_diario) {
        this.ref_diario = ref_diario;
    }

    public int getRef_pety() {
        return ref_pety;
    }

    public void setRef_pety(int ref_pety) {
        this.ref_pety = ref_pety;
    }

    public int getRef_petycash() {
        return ref_petycash;
    }

    public void setRef_petycash(int ref_petycash) {
        this.ref_petycash = ref_petycash;
    }

    public int getRef_pagamento() {
        return ref_pagamento;
    }

    public void setRef_pagamento(int ref_pagamento) {
        this.ref_pagamento = ref_pagamento;
    }

    public int getRef_pagamentos() {
        return ref_pagamentos;
    }

    public void setRef_pagamentos(int ref_pagamentos) {
        this.ref_pagamentos = ref_pagamentos;
    }

    public int getRef_bordos() {
        return ref_bordos;
    }

    public void setRef_bordos(int ref_bordos) {
        this.ref_bordos = ref_bordos;
    }

    public int getRef_compras() {
        return ref_compras;
    }

    public void setRef_compras(int ref_compras) {
        this.ref_compras = ref_compras;
    }

    public int getRef_vendas() {
        return ref_vendas;
    }

    public void setRef_vendas(int ref_vendas) {
        this.ref_vendas = ref_vendas;
    }

    public int getRef_movimento() {
        return ref_movimento;
    }

    public void setRef_movimento(int ref_movimento) {
        this.ref_movimento = ref_movimento;
    }

    public int getRef_requisicaoCheque() {
        return ref_requisicaoCheque;
    }

    public void setRef_requisicaoCheque(int ref_requisicaoCheque) {
        this.ref_requisicaoCheque = ref_requisicaoCheque;
    }

    public int getRef_deposito() {
        return ref_deposito;
    }

    public void setRef_deposito(int ref_deposito) {
        this.ref_deposito = ref_deposito;
    }

    public int getRef_lembrete() {
        return ref_lembrete;
    }

    public void setRef_lembrete(int ref_lembrete) {
        this.ref_lembrete = ref_lembrete;
    }

    public int getRef_guia() {
        return ref_guia;
    }

    public void setRef_guia(int ref_guia) {
        this.ref_guia = ref_guia;
    }

    public int getRef_processamento() {
        return ref_processamento;
    }

    public void setRef_processamento(int ref_processamento) {
        this.ref_processamento = ref_processamento;
    }

    public int getRef_fecho() {
        return ref_fecho;
    }

    public void setRef_fecho(int ref_fecho) {
        this.ref_fecho = ref_fecho;
    }

    public int getRef_inscricoes() {
        return ref_inscricoes;
    }

    public void setRef_inscricoes(int ref_inscricoes) {
        this.ref_inscricoes = ref_inscricoes;
    }

    public String getRef_entidade() {
        return ref_entidade;
    }

    public void setRef_entidade(String ref_entidade) {
        this.ref_entidade = ref_entidade;
    }

    public String getRef_ano() {
        return ref_ano;
    }

    public void setRef_ano(String ref_ano) {
        this.ref_ano = ref_ano;
    }

    public int getRef_adenda() {
        return ref_adenda;
    }

    public void setRef_adenda(int ref_adenda) {
        this.ref_adenda = ref_adenda;
    }

    public int getRef_contrato() {
        return ref_contrato;
    }

    public void setRef_contrato(int ref_contrato) {
        this.ref_contrato = ref_contrato;
    }

    public int getRef_budget() {
        return ref_budget;
    }

    public void setRef_budget(int ref_budget) {
        this.ref_budget = ref_budget;
    }

    public int getRef_faltas() {
        return ref_faltas;
    }

    public void setRef_faltas(int ref_faltas) {
        this.ref_faltas = ref_faltas;
    }

    public int getRef_faltasJustificadas() {
        return ref_faltasJustificadas;
    }

    public void setRef_faltasJustificadas(int ref_faltasJustificadas) {
        this.ref_faltasJustificadas = ref_faltasJustificadas;
    }

    public int getRef_estudanteAprovacoes() {
        return ref_estudanteAprovacoes;
    }

    public void setRef_estudanteAprovacoes(int ref_estudanteAprovacoes) {
        this.ref_estudanteAprovacoes = ref_estudanteAprovacoes;
    }

    public int getRef_estudanteDispensas() {
        return ref_estudanteDispensas;
    }

    public void setRef_estudanteDispensas(int ref_estudanteDispensas) {
        this.ref_estudanteDispensas = ref_estudanteDispensas;
    }

    public int getRef_estudanteExclusoes() {
        return ref_estudanteExclusoes;
    }

    public void setRef_estudanteExclusoes(int ref_estudanteExclusoes) {
        this.ref_estudanteExclusoes = ref_estudanteExclusoes;
    }

    public int getRef_estudanteReprovacoes() {
        return ref_estudanteReprovacoes;
    }

    public void setRef_estudanteReprovacoes(int ref_estudanteReprovacoes) {
        this.ref_estudanteReprovacoes = ref_estudanteReprovacoes;
    }

    public int getRef_estudante() {
        return ref_estudante;
    }

    public void setRef_estudante(int ref_estudante) {
        this.ref_estudante = ref_estudante;
    }

    public int getRef_turma() {
        return ref_turma;
    }

    public void setRef_turma(int ref_turma) {
        this.ref_turma = ref_turma;
    }

    public int getRef_docente() {
        return ref_docente;
    }

    public void setRef_docente(int ref_docente) {
        this.ref_docente = ref_docente;
    }

    public int getRef_disciplina() {
        return ref_disciplina;
    }

    public void setRef_disciplina(int ref_disciplina) {
        this.ref_disciplina = ref_disciplina;
    }

    public int getRef_curso() {
        return ref_curso;
    }

    public void setRef_curso(int ref_curso) {
        this.ref_curso = ref_curso;
    }

    public int getRef_reciboPagamento() {
        return ref_reciboPagamento;
    }

    public void setRef_reciboPagamento(int ref_reciboPagamento) {
        this.ref_reciboPagamento = ref_reciboPagamento;
    }

    public int getRef_funcionario() {
        return ref_funcionario;
    }

    public void setRef_funcionario(int ref_funcionario) {
        this.ref_funcionario = ref_funcionario;
    }

    public int getRef_salario() {
        return ref_salario;
    }

    public void setRef_salario(int ref_salario) {
        this.ref_salario = ref_salario;
    }

}
