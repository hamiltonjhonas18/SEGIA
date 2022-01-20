
package com.dciapps.webclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modulosUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modulosUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entidade" type="{http://webservice.centralserver.co.mz/}entidade" minOccurs="0"/>
 *         &lt;element name="mui_activos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_aprovacaoDespesas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_armazem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_avaliacao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_avaliacao_boletins" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_avaliacao_notas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_avaliacao_observacoes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_avaliacao_pautas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_avaliacao_presencas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_bancos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_biblioteca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_calendario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_calendario_exames" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_calendario_horario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_calendario_recorrencias" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_calendario_testes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_clientes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_comercial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_configuracao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_contratos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_cursos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_cursos_areasInscricao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_cursos_cursos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_cursos_cursosCentro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_cursos_modulos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_depositos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_despesas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_despesas_estoque" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_despesas_extracto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_despesas_formacao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_despesas_internas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_disciplinas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_disciplinas_curso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_disciplinas_docente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_disciplinas_gestao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_disciplinas_turma" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_docuemntos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_empresas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_estatisticas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_estatisticas_curso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_estatisticas_gerais" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_facturas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_financeiro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_formasPagamento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_fornecedores" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_gestao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_gestao_centros" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_gestao_formadores" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_gestao_formados" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_gestao_inscricoes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_gestao_parceiros" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_gestao_turmas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_guiasRemessa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mui_lancamentos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_lembres" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_moedas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_pagamentos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_pagamentos_multas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_pagamentos_outrosPagamentos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_pagamentos_pagamentosOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_pagamentos_propinas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_pagamentos_situacaoPagamentos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_pagamentos_taxas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_petyCash" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_planosDeConta" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_produtos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_recursosHumanos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_add" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_aprove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_list" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_requisicoes_status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_resultados" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_usuarios" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_usuarios_add" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_usuarios_logs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_usuarios_permissoes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_usuarios_status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mui_vendas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="usuario" type="{http://webservice.centralserver.co.mz/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modulosUsuario", propOrder = {
    "encrypted",
    "entidade",
    "muiActivos",
    "muiAprovacaoDespesas",
    "muiArmazem",
    "muiAvaliacao",
    "muiAvaliacaoBoletins",
    "muiAvaliacaoNotas",
    "muiAvaliacaoObservacoes",
    "muiAvaliacaoPautas",
    "muiAvaliacaoPresencas",
    "muiBancos",
    "muiBiblioteca",
    "muiCalendario",
    "muiCalendarioExames",
    "muiCalendarioHorario",
    "muiCalendarioRecorrencias",
    "muiCalendarioTestes",
    "muiClientes",
    "muiComercial",
    "muiConfiguracao",
    "muiContratos",
    "muiCursos",
    "muiCursosAreasInscricao",
    "muiCursosCursos",
    "muiCursosCursosCentro",
    "muiCursosModulos",
    "muiDepositos",
    "muiDespesas",
    "muiDespesasEstoque",
    "muiDespesasExtracto",
    "muiDespesasFormacao",
    "muiDespesasInternas",
    "muiDisciplinas",
    "muiDisciplinasCurso",
    "muiDisciplinasDocente",
    "muiDisciplinasGestao",
    "muiDisciplinasTurma",
    "muiDocuemntos",
    "muiEmpresas",
    "muiEstatisticas",
    "muiEstatisticasCurso",
    "muiEstatisticasGerais",
    "muiFacturas",
    "muiFinanceiro",
    "muiFormasPagamento",
    "muiFornecedores",
    "muiGestao",
    "muiGestaoCentros",
    "muiGestaoFormadores",
    "muiGestaoFormados",
    "muiGestaoInscricoes",
    "muiGestaoParceiros",
    "muiGestaoTurmas",
    "muiGuiasRemessa",
    "muiId",
    "muiLancamentos",
    "muiLembres",
    "muiMoedas",
    "muiPagamentos",
    "muiPagamentosMultas",
    "muiPagamentosOutrosPagamentos",
    "muiPagamentosPagamentosOnline",
    "muiPagamentosPropinas",
    "muiPagamentosSituacaoPagamentos",
    "muiPagamentosTaxas",
    "muiPetyCash",
    "muiPlanosDeConta",
    "muiProdutos",
    "muiRecursosHumanos",
    "muiRequisicoes",
    "muiRequisicoesAdd",
    "muiRequisicoesAprove",
    "muiRequisicoesList",
    "muiRequisicoesStatus",
    "muiResultados",
    "muiUsuarios",
    "muiUsuariosAdd",
    "muiUsuariosLogs",
    "muiUsuariosPermissoes",
    "muiUsuariosStatus",
    "muiVendas",
    "usuario"
})
public class ModulosUsuario {

    protected boolean encrypted;
    protected Entidade entidade;
    @XmlElement(name = "mui_activos")
    protected boolean muiActivos;
    @XmlElement(name = "mui_aprovacaoDespesas")
    protected boolean muiAprovacaoDespesas;
    @XmlElement(name = "mui_armazem")
    protected boolean muiArmazem;
    @XmlElement(name = "mui_avaliacao")
    protected boolean muiAvaliacao;
    @XmlElement(name = "mui_avaliacao_boletins")
    protected boolean muiAvaliacaoBoletins;
    @XmlElement(name = "mui_avaliacao_notas")
    protected boolean muiAvaliacaoNotas;
    @XmlElement(name = "mui_avaliacao_observacoes")
    protected boolean muiAvaliacaoObservacoes;
    @XmlElement(name = "mui_avaliacao_pautas")
    protected boolean muiAvaliacaoPautas;
    @XmlElement(name = "mui_avaliacao_presencas")
    protected boolean muiAvaliacaoPresencas;
    @XmlElement(name = "mui_bancos")
    protected boolean muiBancos;
    @XmlElement(name = "mui_biblioteca")
    protected boolean muiBiblioteca;
    @XmlElement(name = "mui_calendario")
    protected boolean muiCalendario;
    @XmlElement(name = "mui_calendario_exames")
    protected boolean muiCalendarioExames;
    @XmlElement(name = "mui_calendario_horario")
    protected boolean muiCalendarioHorario;
    @XmlElement(name = "mui_calendario_recorrencias")
    protected boolean muiCalendarioRecorrencias;
    @XmlElement(name = "mui_calendario_testes")
    protected boolean muiCalendarioTestes;
    @XmlElement(name = "mui_clientes")
    protected boolean muiClientes;
    @XmlElement(name = "mui_comercial")
    protected boolean muiComercial;
    @XmlElement(name = "mui_configuracao")
    protected boolean muiConfiguracao;
    @XmlElement(name = "mui_contratos")
    protected boolean muiContratos;
    @XmlElement(name = "mui_cursos")
    protected boolean muiCursos;
    @XmlElement(name = "mui_cursos_areasInscricao")
    protected boolean muiCursosAreasInscricao;
    @XmlElement(name = "mui_cursos_cursos")
    protected boolean muiCursosCursos;
    @XmlElement(name = "mui_cursos_cursosCentro")
    protected boolean muiCursosCursosCentro;
    @XmlElement(name = "mui_cursos_modulos")
    protected boolean muiCursosModulos;
    @XmlElement(name = "mui_depositos")
    protected boolean muiDepositos;
    @XmlElement(name = "mui_despesas")
    protected boolean muiDespesas;
    @XmlElement(name = "mui_despesas_estoque")
    protected boolean muiDespesasEstoque;
    @XmlElement(name = "mui_despesas_extracto")
    protected boolean muiDespesasExtracto;
    @XmlElement(name = "mui_despesas_formacao")
    protected boolean muiDespesasFormacao;
    @XmlElement(name = "mui_despesas_internas")
    protected boolean muiDespesasInternas;
    @XmlElement(name = "mui_disciplinas")
    protected boolean muiDisciplinas;
    @XmlElement(name = "mui_disciplinas_curso")
    protected boolean muiDisciplinasCurso;
    @XmlElement(name = "mui_disciplinas_docente")
    protected boolean muiDisciplinasDocente;
    @XmlElement(name = "mui_disciplinas_gestao")
    protected boolean muiDisciplinasGestao;
    @XmlElement(name = "mui_disciplinas_turma")
    protected boolean muiDisciplinasTurma;
    @XmlElement(name = "mui_docuemntos")
    protected boolean muiDocuemntos;
    @XmlElement(name = "mui_empresas")
    protected boolean muiEmpresas;
    @XmlElement(name = "mui_estatisticas")
    protected boolean muiEstatisticas;
    @XmlElement(name = "mui_estatisticas_curso")
    protected boolean muiEstatisticasCurso;
    @XmlElement(name = "mui_estatisticas_gerais")
    protected boolean muiEstatisticasGerais;
    @XmlElement(name = "mui_facturas")
    protected boolean muiFacturas;
    @XmlElement(name = "mui_financeiro")
    protected boolean muiFinanceiro;
    @XmlElement(name = "mui_formasPagamento")
    protected boolean muiFormasPagamento;
    @XmlElement(name = "mui_fornecedores")
    protected boolean muiFornecedores;
    @XmlElement(name = "mui_gestao")
    protected boolean muiGestao;
    @XmlElement(name = "mui_gestao_centros")
    protected boolean muiGestaoCentros;
    @XmlElement(name = "mui_gestao_formadores")
    protected boolean muiGestaoFormadores;
    @XmlElement(name = "mui_gestao_formados")
    protected boolean muiGestaoFormados;
    @XmlElement(name = "mui_gestao_inscricoes")
    protected boolean muiGestaoInscricoes;
    @XmlElement(name = "mui_gestao_parceiros")
    protected boolean muiGestaoParceiros;
    @XmlElement(name = "mui_gestao_turmas")
    protected boolean muiGestaoTurmas;
    @XmlElement(name = "mui_guiasRemessa")
    protected boolean muiGuiasRemessa;
    @XmlElement(name = "mui_id")
    protected int muiId;
    @XmlElement(name = "mui_lancamentos")
    protected boolean muiLancamentos;
    @XmlElement(name = "mui_lembres")
    protected boolean muiLembres;
    @XmlElement(name = "mui_moedas")
    protected boolean muiMoedas;
    @XmlElement(name = "mui_pagamentos")
    protected boolean muiPagamentos;
    @XmlElement(name = "mui_pagamentos_multas")
    protected boolean muiPagamentosMultas;
    @XmlElement(name = "mui_pagamentos_outrosPagamentos")
    protected boolean muiPagamentosOutrosPagamentos;
    @XmlElement(name = "mui_pagamentos_pagamentosOnline")
    protected boolean muiPagamentosPagamentosOnline;
    @XmlElement(name = "mui_pagamentos_propinas")
    protected boolean muiPagamentosPropinas;
    @XmlElement(name = "mui_pagamentos_situacaoPagamentos")
    protected boolean muiPagamentosSituacaoPagamentos;
    @XmlElement(name = "mui_pagamentos_taxas")
    protected boolean muiPagamentosTaxas;
    @XmlElement(name = "mui_petyCash")
    protected boolean muiPetyCash;
    @XmlElement(name = "mui_planosDeConta")
    protected boolean muiPlanosDeConta;
    @XmlElement(name = "mui_produtos")
    protected boolean muiProdutos;
    @XmlElement(name = "mui_recursosHumanos")
    protected boolean muiRecursosHumanos;
    @XmlElement(name = "mui_requisicoes")
    protected boolean muiRequisicoes;
    @XmlElement(name = "mui_requisicoes_add")
    protected boolean muiRequisicoesAdd;
    @XmlElement(name = "mui_requisicoes_aprove")
    protected boolean muiRequisicoesAprove;
    @XmlElement(name = "mui_requisicoes_list")
    protected boolean muiRequisicoesList;
    @XmlElement(name = "mui_requisicoes_status")
    protected boolean muiRequisicoesStatus;
    @XmlElement(name = "mui_resultados")
    protected boolean muiResultados;
    @XmlElement(name = "mui_usuarios")
    protected boolean muiUsuarios;
    @XmlElement(name = "mui_usuarios_add")
    protected boolean muiUsuariosAdd;
    @XmlElement(name = "mui_usuarios_logs")
    protected boolean muiUsuariosLogs;
    @XmlElement(name = "mui_usuarios_permissoes")
    protected boolean muiUsuariosPermissoes;
    @XmlElement(name = "mui_usuarios_status")
    protected boolean muiUsuariosStatus;
    @XmlElement(name = "mui_vendas")
    protected boolean muiVendas;
    protected Usuario usuario;

    /**
     * Gets the value of the encrypted property.
     * 
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     */
    public void setEncrypted(boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link Entidade }
     *     
     */
    public Entidade getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entidade }
     *     
     */
    public void setEntidade(Entidade value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the muiActivos property.
     * 
     */
    public boolean isMuiActivos() {
        return muiActivos;
    }

    /**
     * Sets the value of the muiActivos property.
     * 
     */
    public void setMuiActivos(boolean value) {
        this.muiActivos = value;
    }

    /**
     * Gets the value of the muiAprovacaoDespesas property.
     * 
     */
    public boolean isMuiAprovacaoDespesas() {
        return muiAprovacaoDespesas;
    }

    /**
     * Sets the value of the muiAprovacaoDespesas property.
     * 
     */
    public void setMuiAprovacaoDespesas(boolean value) {
        this.muiAprovacaoDespesas = value;
    }

    /**
     * Gets the value of the muiArmazem property.
     * 
     */
    public boolean isMuiArmazem() {
        return muiArmazem;
    }

    /**
     * Sets the value of the muiArmazem property.
     * 
     */
    public void setMuiArmazem(boolean value) {
        this.muiArmazem = value;
    }

    /**
     * Gets the value of the muiAvaliacao property.
     * 
     */
    public boolean isMuiAvaliacao() {
        return muiAvaliacao;
    }

    /**
     * Sets the value of the muiAvaliacao property.
     * 
     */
    public void setMuiAvaliacao(boolean value) {
        this.muiAvaliacao = value;
    }

    /**
     * Gets the value of the muiAvaliacaoBoletins property.
     * 
     */
    public boolean isMuiAvaliacaoBoletins() {
        return muiAvaliacaoBoletins;
    }

    /**
     * Sets the value of the muiAvaliacaoBoletins property.
     * 
     */
    public void setMuiAvaliacaoBoletins(boolean value) {
        this.muiAvaliacaoBoletins = value;
    }

    /**
     * Gets the value of the muiAvaliacaoNotas property.
     * 
     */
    public boolean isMuiAvaliacaoNotas() {
        return muiAvaliacaoNotas;
    }

    /**
     * Sets the value of the muiAvaliacaoNotas property.
     * 
     */
    public void setMuiAvaliacaoNotas(boolean value) {
        this.muiAvaliacaoNotas = value;
    }

    /**
     * Gets the value of the muiAvaliacaoObservacoes property.
     * 
     */
    public boolean isMuiAvaliacaoObservacoes() {
        return muiAvaliacaoObservacoes;
    }

    /**
     * Sets the value of the muiAvaliacaoObservacoes property.
     * 
     */
    public void setMuiAvaliacaoObservacoes(boolean value) {
        this.muiAvaliacaoObservacoes = value;
    }

    /**
     * Gets the value of the muiAvaliacaoPautas property.
     * 
     */
    public boolean isMuiAvaliacaoPautas() {
        return muiAvaliacaoPautas;
    }

    /**
     * Sets the value of the muiAvaliacaoPautas property.
     * 
     */
    public void setMuiAvaliacaoPautas(boolean value) {
        this.muiAvaliacaoPautas = value;
    }

    /**
     * Gets the value of the muiAvaliacaoPresencas property.
     * 
     */
    public boolean isMuiAvaliacaoPresencas() {
        return muiAvaliacaoPresencas;
    }

    /**
     * Sets the value of the muiAvaliacaoPresencas property.
     * 
     */
    public void setMuiAvaliacaoPresencas(boolean value) {
        this.muiAvaliacaoPresencas = value;
    }

    /**
     * Gets the value of the muiBancos property.
     * 
     */
    public boolean isMuiBancos() {
        return muiBancos;
    }

    /**
     * Sets the value of the muiBancos property.
     * 
     */
    public void setMuiBancos(boolean value) {
        this.muiBancos = value;
    }

    /**
     * Gets the value of the muiBiblioteca property.
     * 
     */
    public boolean isMuiBiblioteca() {
        return muiBiblioteca;
    }

    /**
     * Sets the value of the muiBiblioteca property.
     * 
     */
    public void setMuiBiblioteca(boolean value) {
        this.muiBiblioteca = value;
    }

    /**
     * Gets the value of the muiCalendario property.
     * 
     */
    public boolean isMuiCalendario() {
        return muiCalendario;
    }

    /**
     * Sets the value of the muiCalendario property.
     * 
     */
    public void setMuiCalendario(boolean value) {
        this.muiCalendario = value;
    }

    /**
     * Gets the value of the muiCalendarioExames property.
     * 
     */
    public boolean isMuiCalendarioExames() {
        return muiCalendarioExames;
    }

    /**
     * Sets the value of the muiCalendarioExames property.
     * 
     */
    public void setMuiCalendarioExames(boolean value) {
        this.muiCalendarioExames = value;
    }

    /**
     * Gets the value of the muiCalendarioHorario property.
     * 
     */
    public boolean isMuiCalendarioHorario() {
        return muiCalendarioHorario;
    }

    /**
     * Sets the value of the muiCalendarioHorario property.
     * 
     */
    public void setMuiCalendarioHorario(boolean value) {
        this.muiCalendarioHorario = value;
    }

    /**
     * Gets the value of the muiCalendarioRecorrencias property.
     * 
     */
    public boolean isMuiCalendarioRecorrencias() {
        return muiCalendarioRecorrencias;
    }

    /**
     * Sets the value of the muiCalendarioRecorrencias property.
     * 
     */
    public void setMuiCalendarioRecorrencias(boolean value) {
        this.muiCalendarioRecorrencias = value;
    }

    /**
     * Gets the value of the muiCalendarioTestes property.
     * 
     */
    public boolean isMuiCalendarioTestes() {
        return muiCalendarioTestes;
    }

    /**
     * Sets the value of the muiCalendarioTestes property.
     * 
     */
    public void setMuiCalendarioTestes(boolean value) {
        this.muiCalendarioTestes = value;
    }

    /**
     * Gets the value of the muiClientes property.
     * 
     */
    public boolean isMuiClientes() {
        return muiClientes;
    }

    /**
     * Sets the value of the muiClientes property.
     * 
     */
    public void setMuiClientes(boolean value) {
        this.muiClientes = value;
    }

    /**
     * Gets the value of the muiComercial property.
     * 
     */
    public boolean isMuiComercial() {
        return muiComercial;
    }

    /**
     * Sets the value of the muiComercial property.
     * 
     */
    public void setMuiComercial(boolean value) {
        this.muiComercial = value;
    }

    /**
     * Gets the value of the muiConfiguracao property.
     * 
     */
    public boolean isMuiConfiguracao() {
        return muiConfiguracao;
    }

    /**
     * Sets the value of the muiConfiguracao property.
     * 
     */
    public void setMuiConfiguracao(boolean value) {
        this.muiConfiguracao = value;
    }

    /**
     * Gets the value of the muiContratos property.
     * 
     */
    public boolean isMuiContratos() {
        return muiContratos;
    }

    /**
     * Sets the value of the muiContratos property.
     * 
     */
    public void setMuiContratos(boolean value) {
        this.muiContratos = value;
    }

    /**
     * Gets the value of the muiCursos property.
     * 
     */
    public boolean isMuiCursos() {
        return muiCursos;
    }

    /**
     * Sets the value of the muiCursos property.
     * 
     */
    public void setMuiCursos(boolean value) {
        this.muiCursos = value;
    }

    /**
     * Gets the value of the muiCursosAreasInscricao property.
     * 
     */
    public boolean isMuiCursosAreasInscricao() {
        return muiCursosAreasInscricao;
    }

    /**
     * Sets the value of the muiCursosAreasInscricao property.
     * 
     */
    public void setMuiCursosAreasInscricao(boolean value) {
        this.muiCursosAreasInscricao = value;
    }

    /**
     * Gets the value of the muiCursosCursos property.
     * 
     */
    public boolean isMuiCursosCursos() {
        return muiCursosCursos;
    }

    /**
     * Sets the value of the muiCursosCursos property.
     * 
     */
    public void setMuiCursosCursos(boolean value) {
        this.muiCursosCursos = value;
    }

    /**
     * Gets the value of the muiCursosCursosCentro property.
     * 
     */
    public boolean isMuiCursosCursosCentro() {
        return muiCursosCursosCentro;
    }

    /**
     * Sets the value of the muiCursosCursosCentro property.
     * 
     */
    public void setMuiCursosCursosCentro(boolean value) {
        this.muiCursosCursosCentro = value;
    }

    /**
     * Gets the value of the muiCursosModulos property.
     * 
     */
    public boolean isMuiCursosModulos() {
        return muiCursosModulos;
    }

    /**
     * Sets the value of the muiCursosModulos property.
     * 
     */
    public void setMuiCursosModulos(boolean value) {
        this.muiCursosModulos = value;
    }

    /**
     * Gets the value of the muiDepositos property.
     * 
     */
    public boolean isMuiDepositos() {
        return muiDepositos;
    }

    /**
     * Sets the value of the muiDepositos property.
     * 
     */
    public void setMuiDepositos(boolean value) {
        this.muiDepositos = value;
    }

    /**
     * Gets the value of the muiDespesas property.
     * 
     */
    public boolean isMuiDespesas() {
        return muiDespesas;
    }

    /**
     * Sets the value of the muiDespesas property.
     * 
     */
    public void setMuiDespesas(boolean value) {
        this.muiDespesas = value;
    }

    /**
     * Gets the value of the muiDespesasEstoque property.
     * 
     */
    public boolean isMuiDespesasEstoque() {
        return muiDespesasEstoque;
    }

    /**
     * Sets the value of the muiDespesasEstoque property.
     * 
     */
    public void setMuiDespesasEstoque(boolean value) {
        this.muiDespesasEstoque = value;
    }

    /**
     * Gets the value of the muiDespesasExtracto property.
     * 
     */
    public boolean isMuiDespesasExtracto() {
        return muiDespesasExtracto;
    }

    /**
     * Sets the value of the muiDespesasExtracto property.
     * 
     */
    public void setMuiDespesasExtracto(boolean value) {
        this.muiDespesasExtracto = value;
    }

    /**
     * Gets the value of the muiDespesasFormacao property.
     * 
     */
    public boolean isMuiDespesasFormacao() {
        return muiDespesasFormacao;
    }

    /**
     * Sets the value of the muiDespesasFormacao property.
     * 
     */
    public void setMuiDespesasFormacao(boolean value) {
        this.muiDespesasFormacao = value;
    }

    /**
     * Gets the value of the muiDespesasInternas property.
     * 
     */
    public boolean isMuiDespesasInternas() {
        return muiDespesasInternas;
    }

    /**
     * Sets the value of the muiDespesasInternas property.
     * 
     */
    public void setMuiDespesasInternas(boolean value) {
        this.muiDespesasInternas = value;
    }

    /**
     * Gets the value of the muiDisciplinas property.
     * 
     */
    public boolean isMuiDisciplinas() {
        return muiDisciplinas;
    }

    /**
     * Sets the value of the muiDisciplinas property.
     * 
     */
    public void setMuiDisciplinas(boolean value) {
        this.muiDisciplinas = value;
    }

    /**
     * Gets the value of the muiDisciplinasCurso property.
     * 
     */
    public boolean isMuiDisciplinasCurso() {
        return muiDisciplinasCurso;
    }

    /**
     * Sets the value of the muiDisciplinasCurso property.
     * 
     */
    public void setMuiDisciplinasCurso(boolean value) {
        this.muiDisciplinasCurso = value;
    }

    /**
     * Gets the value of the muiDisciplinasDocente property.
     * 
     */
    public boolean isMuiDisciplinasDocente() {
        return muiDisciplinasDocente;
    }

    /**
     * Sets the value of the muiDisciplinasDocente property.
     * 
     */
    public void setMuiDisciplinasDocente(boolean value) {
        this.muiDisciplinasDocente = value;
    }

    /**
     * Gets the value of the muiDisciplinasGestao property.
     * 
     */
    public boolean isMuiDisciplinasGestao() {
        return muiDisciplinasGestao;
    }

    /**
     * Sets the value of the muiDisciplinasGestao property.
     * 
     */
    public void setMuiDisciplinasGestao(boolean value) {
        this.muiDisciplinasGestao = value;
    }

    /**
     * Gets the value of the muiDisciplinasTurma property.
     * 
     */
    public boolean isMuiDisciplinasTurma() {
        return muiDisciplinasTurma;
    }

    /**
     * Sets the value of the muiDisciplinasTurma property.
     * 
     */
    public void setMuiDisciplinasTurma(boolean value) {
        this.muiDisciplinasTurma = value;
    }

    /**
     * Gets the value of the muiDocuemntos property.
     * 
     */
    public boolean isMuiDocuemntos() {
        return muiDocuemntos;
    }

    /**
     * Sets the value of the muiDocuemntos property.
     * 
     */
    public void setMuiDocuemntos(boolean value) {
        this.muiDocuemntos = value;
    }

    /**
     * Gets the value of the muiEmpresas property.
     * 
     */
    public boolean isMuiEmpresas() {
        return muiEmpresas;
    }

    /**
     * Sets the value of the muiEmpresas property.
     * 
     */
    public void setMuiEmpresas(boolean value) {
        this.muiEmpresas = value;
    }

    /**
     * Gets the value of the muiEstatisticas property.
     * 
     */
    public boolean isMuiEstatisticas() {
        return muiEstatisticas;
    }

    /**
     * Sets the value of the muiEstatisticas property.
     * 
     */
    public void setMuiEstatisticas(boolean value) {
        this.muiEstatisticas = value;
    }

    /**
     * Gets the value of the muiEstatisticasCurso property.
     * 
     */
    public boolean isMuiEstatisticasCurso() {
        return muiEstatisticasCurso;
    }

    /**
     * Sets the value of the muiEstatisticasCurso property.
     * 
     */
    public void setMuiEstatisticasCurso(boolean value) {
        this.muiEstatisticasCurso = value;
    }

    /**
     * Gets the value of the muiEstatisticasGerais property.
     * 
     */
    public boolean isMuiEstatisticasGerais() {
        return muiEstatisticasGerais;
    }

    /**
     * Sets the value of the muiEstatisticasGerais property.
     * 
     */
    public void setMuiEstatisticasGerais(boolean value) {
        this.muiEstatisticasGerais = value;
    }

    /**
     * Gets the value of the muiFacturas property.
     * 
     */
    public boolean isMuiFacturas() {
        return muiFacturas;
    }

    /**
     * Sets the value of the muiFacturas property.
     * 
     */
    public void setMuiFacturas(boolean value) {
        this.muiFacturas = value;
    }

    /**
     * Gets the value of the muiFinanceiro property.
     * 
     */
    public boolean isMuiFinanceiro() {
        return muiFinanceiro;
    }

    /**
     * Sets the value of the muiFinanceiro property.
     * 
     */
    public void setMuiFinanceiro(boolean value) {
        this.muiFinanceiro = value;
    }

    /**
     * Gets the value of the muiFormasPagamento property.
     * 
     */
    public boolean isMuiFormasPagamento() {
        return muiFormasPagamento;
    }

    /**
     * Sets the value of the muiFormasPagamento property.
     * 
     */
    public void setMuiFormasPagamento(boolean value) {
        this.muiFormasPagamento = value;
    }

    /**
     * Gets the value of the muiFornecedores property.
     * 
     */
    public boolean isMuiFornecedores() {
        return muiFornecedores;
    }

    /**
     * Sets the value of the muiFornecedores property.
     * 
     */
    public void setMuiFornecedores(boolean value) {
        this.muiFornecedores = value;
    }

    /**
     * Gets the value of the muiGestao property.
     * 
     */
    public boolean isMuiGestao() {
        return muiGestao;
    }

    /**
     * Sets the value of the muiGestao property.
     * 
     */
    public void setMuiGestao(boolean value) {
        this.muiGestao = value;
    }

    /**
     * Gets the value of the muiGestaoCentros property.
     * 
     */
    public boolean isMuiGestaoCentros() {
        return muiGestaoCentros;
    }

    /**
     * Sets the value of the muiGestaoCentros property.
     * 
     */
    public void setMuiGestaoCentros(boolean value) {
        this.muiGestaoCentros = value;
    }

    /**
     * Gets the value of the muiGestaoFormadores property.
     * 
     */
    public boolean isMuiGestaoFormadores() {
        return muiGestaoFormadores;
    }

    /**
     * Sets the value of the muiGestaoFormadores property.
     * 
     */
    public void setMuiGestaoFormadores(boolean value) {
        this.muiGestaoFormadores = value;
    }

    /**
     * Gets the value of the muiGestaoFormados property.
     * 
     */
    public boolean isMuiGestaoFormados() {
        return muiGestaoFormados;
    }

    /**
     * Sets the value of the muiGestaoFormados property.
     * 
     */
    public void setMuiGestaoFormados(boolean value) {
        this.muiGestaoFormados = value;
    }

    /**
     * Gets the value of the muiGestaoInscricoes property.
     * 
     */
    public boolean isMuiGestaoInscricoes() {
        return muiGestaoInscricoes;
    }

    /**
     * Sets the value of the muiGestaoInscricoes property.
     * 
     */
    public void setMuiGestaoInscricoes(boolean value) {
        this.muiGestaoInscricoes = value;
    }

    /**
     * Gets the value of the muiGestaoParceiros property.
     * 
     */
    public boolean isMuiGestaoParceiros() {
        return muiGestaoParceiros;
    }

    /**
     * Sets the value of the muiGestaoParceiros property.
     * 
     */
    public void setMuiGestaoParceiros(boolean value) {
        this.muiGestaoParceiros = value;
    }

    /**
     * Gets the value of the muiGestaoTurmas property.
     * 
     */
    public boolean isMuiGestaoTurmas() {
        return muiGestaoTurmas;
    }

    /**
     * Sets the value of the muiGestaoTurmas property.
     * 
     */
    public void setMuiGestaoTurmas(boolean value) {
        this.muiGestaoTurmas = value;
    }

    /**
     * Gets the value of the muiGuiasRemessa property.
     * 
     */
    public boolean isMuiGuiasRemessa() {
        return muiGuiasRemessa;
    }

    /**
     * Sets the value of the muiGuiasRemessa property.
     * 
     */
    public void setMuiGuiasRemessa(boolean value) {
        this.muiGuiasRemessa = value;
    }

    /**
     * Gets the value of the muiId property.
     * 
     */
    public int getMuiId() {
        return muiId;
    }

    /**
     * Sets the value of the muiId property.
     * 
     */
    public void setMuiId(int value) {
        this.muiId = value;
    }

    /**
     * Gets the value of the muiLancamentos property.
     * 
     */
    public boolean isMuiLancamentos() {
        return muiLancamentos;
    }

    /**
     * Sets the value of the muiLancamentos property.
     * 
     */
    public void setMuiLancamentos(boolean value) {
        this.muiLancamentos = value;
    }

    /**
     * Gets the value of the muiLembres property.
     * 
     */
    public boolean isMuiLembres() {
        return muiLembres;
    }

    /**
     * Sets the value of the muiLembres property.
     * 
     */
    public void setMuiLembres(boolean value) {
        this.muiLembres = value;
    }

    /**
     * Gets the value of the muiMoedas property.
     * 
     */
    public boolean isMuiMoedas() {
        return muiMoedas;
    }

    /**
     * Sets the value of the muiMoedas property.
     * 
     */
    public void setMuiMoedas(boolean value) {
        this.muiMoedas = value;
    }

    /**
     * Gets the value of the muiPagamentos property.
     * 
     */
    public boolean isMuiPagamentos() {
        return muiPagamentos;
    }

    /**
     * Sets the value of the muiPagamentos property.
     * 
     */
    public void setMuiPagamentos(boolean value) {
        this.muiPagamentos = value;
    }

    /**
     * Gets the value of the muiPagamentosMultas property.
     * 
     */
    public boolean isMuiPagamentosMultas() {
        return muiPagamentosMultas;
    }

    /**
     * Sets the value of the muiPagamentosMultas property.
     * 
     */
    public void setMuiPagamentosMultas(boolean value) {
        this.muiPagamentosMultas = value;
    }

    /**
     * Gets the value of the muiPagamentosOutrosPagamentos property.
     * 
     */
    public boolean isMuiPagamentosOutrosPagamentos() {
        return muiPagamentosOutrosPagamentos;
    }

    /**
     * Sets the value of the muiPagamentosOutrosPagamentos property.
     * 
     */
    public void setMuiPagamentosOutrosPagamentos(boolean value) {
        this.muiPagamentosOutrosPagamentos = value;
    }

    /**
     * Gets the value of the muiPagamentosPagamentosOnline property.
     * 
     */
    public boolean isMuiPagamentosPagamentosOnline() {
        return muiPagamentosPagamentosOnline;
    }

    /**
     * Sets the value of the muiPagamentosPagamentosOnline property.
     * 
     */
    public void setMuiPagamentosPagamentosOnline(boolean value) {
        this.muiPagamentosPagamentosOnline = value;
    }

    /**
     * Gets the value of the muiPagamentosPropinas property.
     * 
     */
    public boolean isMuiPagamentosPropinas() {
        return muiPagamentosPropinas;
    }

    /**
     * Sets the value of the muiPagamentosPropinas property.
     * 
     */
    public void setMuiPagamentosPropinas(boolean value) {
        this.muiPagamentosPropinas = value;
    }

    /**
     * Gets the value of the muiPagamentosSituacaoPagamentos property.
     * 
     */
    public boolean isMuiPagamentosSituacaoPagamentos() {
        return muiPagamentosSituacaoPagamentos;
    }

    /**
     * Sets the value of the muiPagamentosSituacaoPagamentos property.
     * 
     */
    public void setMuiPagamentosSituacaoPagamentos(boolean value) {
        this.muiPagamentosSituacaoPagamentos = value;
    }

    /**
     * Gets the value of the muiPagamentosTaxas property.
     * 
     */
    public boolean isMuiPagamentosTaxas() {
        return muiPagamentosTaxas;
    }

    /**
     * Sets the value of the muiPagamentosTaxas property.
     * 
     */
    public void setMuiPagamentosTaxas(boolean value) {
        this.muiPagamentosTaxas = value;
    }

    /**
     * Gets the value of the muiPetyCash property.
     * 
     */
    public boolean isMuiPetyCash() {
        return muiPetyCash;
    }

    /**
     * Sets the value of the muiPetyCash property.
     * 
     */
    public void setMuiPetyCash(boolean value) {
        this.muiPetyCash = value;
    }

    /**
     * Gets the value of the muiPlanosDeConta property.
     * 
     */
    public boolean isMuiPlanosDeConta() {
        return muiPlanosDeConta;
    }

    /**
     * Sets the value of the muiPlanosDeConta property.
     * 
     */
    public void setMuiPlanosDeConta(boolean value) {
        this.muiPlanosDeConta = value;
    }

    /**
     * Gets the value of the muiProdutos property.
     * 
     */
    public boolean isMuiProdutos() {
        return muiProdutos;
    }

    /**
     * Sets the value of the muiProdutos property.
     * 
     */
    public void setMuiProdutos(boolean value) {
        this.muiProdutos = value;
    }

    /**
     * Gets the value of the muiRecursosHumanos property.
     * 
     */
    public boolean isMuiRecursosHumanos() {
        return muiRecursosHumanos;
    }

    /**
     * Sets the value of the muiRecursosHumanos property.
     * 
     */
    public void setMuiRecursosHumanos(boolean value) {
        this.muiRecursosHumanos = value;
    }

    /**
     * Gets the value of the muiRequisicoes property.
     * 
     */
    public boolean isMuiRequisicoes() {
        return muiRequisicoes;
    }

    /**
     * Sets the value of the muiRequisicoes property.
     * 
     */
    public void setMuiRequisicoes(boolean value) {
        this.muiRequisicoes = value;
    }

    /**
     * Gets the value of the muiRequisicoesAdd property.
     * 
     */
    public boolean isMuiRequisicoesAdd() {
        return muiRequisicoesAdd;
    }

    /**
     * Sets the value of the muiRequisicoesAdd property.
     * 
     */
    public void setMuiRequisicoesAdd(boolean value) {
        this.muiRequisicoesAdd = value;
    }

    /**
     * Gets the value of the muiRequisicoesAprove property.
     * 
     */
    public boolean isMuiRequisicoesAprove() {
        return muiRequisicoesAprove;
    }

    /**
     * Sets the value of the muiRequisicoesAprove property.
     * 
     */
    public void setMuiRequisicoesAprove(boolean value) {
        this.muiRequisicoesAprove = value;
    }

    /**
     * Gets the value of the muiRequisicoesList property.
     * 
     */
    public boolean isMuiRequisicoesList() {
        return muiRequisicoesList;
    }

    /**
     * Sets the value of the muiRequisicoesList property.
     * 
     */
    public void setMuiRequisicoesList(boolean value) {
        this.muiRequisicoesList = value;
    }

    /**
     * Gets the value of the muiRequisicoesStatus property.
     * 
     */
    public boolean isMuiRequisicoesStatus() {
        return muiRequisicoesStatus;
    }

    /**
     * Sets the value of the muiRequisicoesStatus property.
     * 
     */
    public void setMuiRequisicoesStatus(boolean value) {
        this.muiRequisicoesStatus = value;
    }

    /**
     * Gets the value of the muiResultados property.
     * 
     */
    public boolean isMuiResultados() {
        return muiResultados;
    }

    /**
     * Sets the value of the muiResultados property.
     * 
     */
    public void setMuiResultados(boolean value) {
        this.muiResultados = value;
    }

    /**
     * Gets the value of the muiUsuarios property.
     * 
     */
    public boolean isMuiUsuarios() {
        return muiUsuarios;
    }

    /**
     * Sets the value of the muiUsuarios property.
     * 
     */
    public void setMuiUsuarios(boolean value) {
        this.muiUsuarios = value;
    }

    /**
     * Gets the value of the muiUsuariosAdd property.
     * 
     */
    public boolean isMuiUsuariosAdd() {
        return muiUsuariosAdd;
    }

    /**
     * Sets the value of the muiUsuariosAdd property.
     * 
     */
    public void setMuiUsuariosAdd(boolean value) {
        this.muiUsuariosAdd = value;
    }

    /**
     * Gets the value of the muiUsuariosLogs property.
     * 
     */
    public boolean isMuiUsuariosLogs() {
        return muiUsuariosLogs;
    }

    /**
     * Sets the value of the muiUsuariosLogs property.
     * 
     */
    public void setMuiUsuariosLogs(boolean value) {
        this.muiUsuariosLogs = value;
    }

    /**
     * Gets the value of the muiUsuariosPermissoes property.
     * 
     */
    public boolean isMuiUsuariosPermissoes() {
        return muiUsuariosPermissoes;
    }

    /**
     * Sets the value of the muiUsuariosPermissoes property.
     * 
     */
    public void setMuiUsuariosPermissoes(boolean value) {
        this.muiUsuariosPermissoes = value;
    }

    /**
     * Gets the value of the muiUsuariosStatus property.
     * 
     */
    public boolean isMuiUsuariosStatus() {
        return muiUsuariosStatus;
    }

    /**
     * Sets the value of the muiUsuariosStatus property.
     * 
     */
    public void setMuiUsuariosStatus(boolean value) {
        this.muiUsuariosStatus = value;
    }

    /**
     * Gets the value of the muiVendas property.
     * 
     */
    public boolean isMuiVendas() {
        return muiVendas;
    }

    /**
     * Sets the value of the muiVendas property.
     * 
     */
    public void setMuiVendas(boolean value) {
        this.muiVendas = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
