/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.webclientcontroler;

import com.dciapps.webclient.Activo;
import com.dciapps.webclient.Conta;
import com.dciapps.webclient.ContaGeral;
import com.dciapps.webclient.Diario;
import com.dciapps.webclient.Documento;
import com.dciapps.webclient.EstadoFactura;
import com.dciapps.webclient.Extracto;
import com.dciapps.webclient.ExtractoContaGeral;
import com.dciapps.webclient.Factura;
import com.dciapps.webclient.Lancamento;
import com.dciapps.webclient.Mensalidade;
import com.dciapps.webclient.ModulosUsuario;
import com.dciapps.webclient.ModulosUsuarioMARKET;
import com.dciapps.webclient.Moeda;
import com.dciapps.webclient.Pagamento;
import com.dciapps.webclient.Pety;
import com.dciapps.webclient.PetyCash;
import com.dciapps.webclient.PlanoDeConta;
import com.dciapps.webclient.Recibo;
import com.dciapps.webclient.ReciboPagamento;
import com.dciapps.webclient.TipoConta;

/**
 *
 * @author HJC2K8
 */
public class ContabilidadeCtrl {

    public Conta buscaContaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaContaDescricao(entidade, descricao);
    }

    public ContaGeral buscaContaGeral(com.dciapps.webclient.Entidade entidade, java.lang.String conta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaContaGeral(entidade, conta);
    }

    public ContaGeral buscaContaGeralDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaContaGeralDescricao(entidade, descricao);
    }

    public ContaGeral buscaContaGeralId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaContaGeralId(id);
    }

    public Conta buscaContaId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaContaId(id);
    }

    public Diario buscaDiarioDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaDiarioDescricao(entidade, descricao);
    }

    public Diario buscaDiarioId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaDiarioId(id);
    }

    public Documento buscaDocumentoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaDocumentoDescricao(entidade, descricao);
    }

    public Documento buscaDocumentoId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaDocumentoId(id);
    }

    public EstadoFactura buscaEstadoFacturaId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaEstadoFacturaId(id);
    }

    public EstadoFactura buscaEstadoFacturaPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String periodo) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaEstadoFacturaPeriodo(entidade, periodo);
    }

    public ExtractoContaGeral buscaExtractoContaGeralId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaExtractoContaGeralId(id);
    }

    public Extracto buscaExtractoId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaExtractoId(id);
    }

    public Factura buscaFacturaId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaFacturaId(id);
    }

    public Factura buscaFacturaNumeroLancamento(com.dciapps.webclient.Entidade entidade, java.lang.String tipo, long id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaFacturaNumeroLancamento(entidade, tipo, id);
    }

    public Factura buscaFacturaPagamento(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Pagamento pagamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaFacturaPagamento(entidade, pagamento);
    }

    public Factura buscaFacturaReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String referencia) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaFacturaReferencia(entidade, referencia);
    }

    public Factura buscaFacturaVenda(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Venda venda) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaFacturaVenda(entidade, venda);
    }

    public Lancamento buscaLancamentoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaLancamentoDescricao(entidade, descricao);
    }

    public Lancamento buscaLancamentoId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaLancamentoId(id);
    }

    public ModulosUsuario buscaModulosUsuarioId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaModulosUsuarioId(id);
    }

    public ModulosUsuarioMARKET buscaModulosUsuarioMARKET(com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaModulosUsuarioMARKET(usuario);
    }

    public Moeda buscaMoedaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaMoedaDescricao(entidade, descricao);
    }

    public Moeda buscaMoedaId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaMoedaId(id);
    }

    public Pagamento buscaPagamentoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPagamentoDescricao(entidade, descricao);
    }

    public Pagamento buscaPagamentoId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPagamentoId(id);
    }

    public PetyCash buscaPetyCashDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPetyCashDescricao(entidade, descricao);
    }

    public PetyCash buscaPetyCashId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPetyCashId(id);
    }

    public Pety buscaPetyId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPetyId(id);
    }

    public Pety buscaPetyPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String periodo) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPetyPeriodo(entidade, periodo);
    }

    public PlanoDeConta buscaPlanoDeContaCodigo(com.dciapps.webclient.Entidade entidade, java.lang.String codigo) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPlanoDeContaCodigo(entidade, codigo);
    }

    public PlanoDeConta buscaPlanoDeContaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPlanoDeContaDescricao(entidade, descricao);
    }

    public PlanoDeConta buscaPlanoDeContaId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaPlanoDeContaId(id);
    }

    public Recibo buscaReciboId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaReciboId(id);
    }

    public TipoConta buscaTipoContaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaTipoContaDescricao(entidade, descricao);
    }

    public TipoConta buscaTipoContaId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaTipoContaId(id);
    }

    public Activo buscarActivoId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscarActivoId(id);
    }

    public Activo buscarActivoNome(com.dciapps.webclient.Entidade entidade, java.lang.String nome) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscarActivoNome(entidade, nome);
    }

    public java.util.List<com.dciapps.webclient.Activo> listaActivos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaActivos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Activo> listaActivosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaActivosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Activo> listaActivosLimite(com.dciapps.webclient.Entidade entidade, int limite) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaActivosLimite(entidade, limite);
    }

    public java.util.List<com.dciapps.webclient.Activo> listaActivosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaActivosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Conta> listaContas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaContas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Conta> listaContasCliente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Cliente cliente) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaContasCliente(entidade, cliente);
    }

    public java.util.List<com.dciapps.webclient.ContaGeral> listaContasGerais(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaContasGerais(entidade);
    }

    public java.util.List<com.dciapps.webclient.Conta> listaContasTipo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.TipoConta tipoConta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaContasTipo(entidade, tipoConta);
    }

    public java.util.List<com.dciapps.webclient.Diario> listaDiarios(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaDiarios(entidade);
    }

    public java.util.List<com.dciapps.webclient.Documento> listaDocumentos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaDocumentos(entidade);
    }

    public java.util.List<com.dciapps.webclient.EstadoFactura> listaEstadosFactura(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaEstadosFactura(entidade);
    }

    public java.util.List<com.dciapps.webclient.Extracto> listaExtractos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractos(entidade);
    }

    public java.util.List<com.dciapps.webclient.ExtractoContaGeral> listaExtractosContaGeral(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosContaGeral(entidade);
    }

    public java.util.List<com.dciapps.webclient.ExtractoContaGeral> listaExtractosContaGeralAssociados(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.ContaGeral contaGeral) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosContaGeralAssociados(entidade, contaGeral);
    }

    public java.util.List<com.dciapps.webclient.ExtractoContaGeral> listaExtractosContaGeralData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosContaGeralData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.ExtractoContaGeral> listaExtractosContaGeralLancamento(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Lancamento lancamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosContaGeralLancamento(entidade, lancamento);
    }

    public java.util.List<com.dciapps.webclient.ExtractoContaGeral> listaExtractosContaGeralMovimento(com.dciapps.webclient.Entidade entidade, java.lang.String movimento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosContaGeralMovimento(entidade, movimento);
    }

    public java.util.List<com.dciapps.webclient.ExtractoContaGeral> listaExtractosContaGeralPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosContaGeralPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Extracto> listaExtractosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Extracto> listaExtractosFactura(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Factura factura) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosFactura(entidade, factura);
    }

    public java.util.List<com.dciapps.webclient.Extracto> listaExtractosMovimento(com.dciapps.webclient.Entidade entidade, java.lang.String movimento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosMovimento(entidade, movimento);
    }

    public java.util.List<com.dciapps.webclient.Extracto> listaExtractosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaExtractosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasAnteriores(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasAnteriores(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasCaixa(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Caixa caixa) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasCaixa(entidade, caixa);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasCategoria(com.dciapps.webclient.Entidade entidade, java.lang.String categoria) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasCategoria(entidade, categoria);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasMoeda(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Moeda moeda) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasMoeda(entidade, moeda);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasNaoLancadas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasNaoLancadas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasPagamento(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Pagamento pagamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasPagamento(entidade, pagamento);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasStatus(com.dciapps.webclient.Entidade entidade, java.lang.String status) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasStatus(entidade, status);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasUsuario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasUsuario(entidade, usuario);
    }

    public java.util.List<com.dciapps.webclient.Factura> listaFacturasVenda(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Venda venda) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaFacturasVenda(entidade, venda);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosContaCliente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.ContaGeral contaCliente) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosContaCliente(entidade, contaCliente);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosContaPlano(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.ContaGeral contaPlano) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosContaPlano(entidade, contaPlano);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosDiario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Diario diario) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosDiario(entidade, diario);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosDocumento(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Documento documento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosDocumento(entidade, documento);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosFuncionario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Funcionario funcionario) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosFuncionario(entidade, funcionario);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosLimite(com.dciapps.webclient.Entidade entidade, int limite) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosLimite(entidade, limite);
    }

    public java.util.List<com.dciapps.webclient.Lancamento> listaLancamentosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaLancamentosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Moeda> listaMoedas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaMoedas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentos(com.dciapps.webclient.Entidade entidade, java.lang.String origem) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentos(entidade, origem);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosCliente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Pessoa pessoa) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosCliente(entidade, pessoa);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.PetyCash> listaPetyCashs(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPetyCashs(entidade);
    }

    public java.util.List<com.dciapps.webclient.PetyCash> listaPetyCashsData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPetyCashsData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.PetyCash> listaPetyCashsFuncionario(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Funcionario funcionario) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPetyCashsFuncionario(entidade, funcionario);
    }

    public java.util.List<com.dciapps.webclient.PetyCash> listaPetyCashsPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPetyCashsPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.PetyCash> listaPetyCashsPety(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Pety pety) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPetyCashsPety(entidade, pety);
    }

    public java.util.List<com.dciapps.webclient.Pety> listaPetys(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPetys(entidade);
    }

    public java.util.List<com.dciapps.webclient.PlanoDeConta> listaPlanosDeConta(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPlanosDeConta(entidade);
    }

    public java.util.List<com.dciapps.webclient.PlanoDeConta> listaPlanosDeContaAssociados(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.PlanoDeConta planoDeConta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPlanosDeContaAssociados(entidade, planoDeConta);
    }

    public java.util.List<com.dciapps.webclient.Recibo> listaRecibos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Recibo> listaRecibosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Recibo> listaRecibosFactura(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Factura factura) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosFactura(entidade, factura);
    }

    public java.util.List<com.dciapps.webclient.Recibo> listaRecibosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Recibo> listaRecibosPessoa(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Pessoa pessoa) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosPessoa(entidade, pessoa);
    }

    public java.util.List<com.dciapps.webclient.TipoConta> listaTiposConta(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaTiposConta(entidade);
    }

    public void persistirActivo(com.dciapps.webclient.Activo activo) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirActivo(activo);
    }

    public void persistirConta(com.dciapps.webclient.Conta conta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirConta(conta);
    }

    public void persistirContaGeral(com.dciapps.webclient.ContaGeral contaGeral) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirContaGeral(contaGeral);
    }

    public void persistirDiario(com.dciapps.webclient.Diario diario) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirDiario(diario);
    }


    public void persistirEstadoFactura(com.dciapps.webclient.EstadoFactura estadoFactura) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirEstadoFactura(estadoFactura);
    }

    public void persistirExtracto(com.dciapps.webclient.Extracto extracto) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirExtracto(extracto);
    }

    public void persistirExtractoContaGeral(com.dciapps.webclient.ExtractoContaGeral extractoContaGeral) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirExtractoContaGeral(extractoContaGeral);
    }

    public void persistirFactura(com.dciapps.webclient.Factura factura) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirFactura(factura);
    }

    public void persistirLancamento(com.dciapps.webclient.Lancamento lancamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirLancamento(lancamento);
    }

    public void persistirMoeda(com.dciapps.webclient.Moeda moeda) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirMoeda(moeda);
    }

    public void persistirPagamento(com.dciapps.webclient.Pagamento pagamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirPagamento(pagamento);
    }

    public void persistirPety(com.dciapps.webclient.Pety pety) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirPety(pety);
    }

    public void persistirPetyCash(com.dciapps.webclient.PetyCash petyCash) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirPetyCash(petyCash);
    }

    public void persistirPlanoDeConta(com.dciapps.webclient.PlanoDeConta planoDeConta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirPlanoDeConta(planoDeConta);
    }

    public void persistirRecibo(com.dciapps.webclient.Recibo recibo) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirRecibo(recibo);
    }

    public void persistirTipoConta(com.dciapps.webclient.TipoConta tipoConta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirTipoConta(tipoConta);
    }

    public void removerActivo(com.dciapps.webclient.Activo activo) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerActivo(activo);
    }

    public void removerConta(com.dciapps.webclient.Conta conta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerConta(conta);
    }

    public void removerContaGeral(com.dciapps.webclient.ContaGeral contaGeral) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerContaGeral(contaGeral);
    }

    public void removerDiario(com.dciapps.webclient.Diario diario) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerDiario(diario);
    }

    public void removerEstadoFactura(com.dciapps.webclient.EstadoFactura estadoFactura) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerEstadoFactura(estadoFactura);
    }

    public void removerExtracto(com.dciapps.webclient.Extracto extracto) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerExtracto(extracto);
    }

    public void removerExtractoContaGeral(com.dciapps.webclient.ExtractoContaGeral extractoContaGeral) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerExtractoContaGeral(extractoContaGeral);
    }

    public void removerFactura(com.dciapps.webclient.Factura factura) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerFactura(factura);
    }

    public void removerLancamento(com.dciapps.webclient.Lancamento lancamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerLancamento(lancamento);
    }

    public void removerMoeda(com.dciapps.webclient.Moeda moeda) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerMoeda(moeda);
    }

    public void removerPagamento(com.dciapps.webclient.Pagamento pagamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerPagamento(pagamento);
    }

    public void removerPety(com.dciapps.webclient.Pety pety) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerPety(pety);
    }

    public void removerPetyCash(com.dciapps.webclient.PetyCash petyCash) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerPetyCash(petyCash);
    }

    public void removerPlanoDeConta(com.dciapps.webclient.PlanoDeConta planoDeConta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerPlanoDeConta(planoDeConta);
    }

    public void removerRecibo(com.dciapps.webclient.Recibo recibo) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerRecibo(recibo);
    }

    public void removerTipoConta(com.dciapps.webclient.TipoConta tipoConta) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerTipoConta(tipoConta);
    }

    public Mensalidade buscaMensalidadeAluno(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaMensalidadeAluno(id);
    }

    public Mensalidade buscaMensalidadeId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaMensalidadeId(id);
    }

    public java.util.List<com.dciapps.webclient.Mensalidade> listaMensalidades(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaMensalidades(entidade);
    }

    public java.util.List<com.dciapps.webclient.Mensalidade> listaMensalidadesAluno(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaMensalidadesAluno(id);
    }

    public java.util.List<com.dciapps.webclient.Mensalidade> listaMensalidadesAlunoDataMensalidade(com.dciapps.webclient.Entidade entidade, java.lang.String data1, java.lang.String data2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaMensalidadesAlunoDataMensalidade(entidade, data1, data2);
    }

    public java.util.List<com.dciapps.webclient.Mensalidade> listaMensalidadesAlunoDataPagamento(com.dciapps.webclient.Entidade entidade, java.lang.String data1, java.lang.String data2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaMensalidadesAlunoDataPagamento(entidade, data1, data2);
    }

    public java.util.List<com.dciapps.webclient.Mensalidade> listaMensalidadesAreaInscricao(com.dciapps.webclient.Entidade entidade, int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaMensalidadesAreaInscricao(entidade, id);
    }

    public java.util.List<com.dciapps.webclient.Mensalidade> listaMensalidadesCurso(com.dciapps.webclient.Entidade entidade, int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaMensalidadesCurso(entidade, id);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosCondicao(com.dciapps.webclient.Entidade entidade, java.lang.String condicao) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosCondicao(entidade, condicao);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String referencia) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosReferencia(entidade, referencia);
    }

    public void persistirMensalidade(com.dciapps.webclient.Mensalidade mensalidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirMensalidade(mensalidade);
    }

    public void removerMensalidade(com.dciapps.webclient.Mensalidade mensalidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerMensalidade(mensalidade);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosInscricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Inscricao pessoa) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosInscricao(entidade, pessoa);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosTurma(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosTurma(entidade, turma);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaTodosPagamentos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaTodosPagamentos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosPendentesCliente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Pessoa pessoa) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosPendentesCliente(entidade, pessoa);
    }

    public ReciboPagamento buscaReciboPagamentoId(int id) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaReciboPagamentoId(id);
    }

    public java.util.List<com.dciapps.webclient.Pagamento> listaPagamentosRecibo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.ReciboPagamento reciboPagamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaPagamentosRecibo(entidade, reciboPagamento);
    }

    public java.util.List<com.dciapps.webclient.ReciboPagamento> listaRecibosPagamentos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosPagamentos(entidade);
    }

    public java.util.List<com.dciapps.webclient.ReciboPagamento> listaRecibosPagamentosData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosPagamentosData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.ReciboPagamento> listaRecibosPagamentosPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosPagamentosPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.ReciboPagamento> listaRecibosPagamentosPessoa(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Pessoa pessoa) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.listaRecibosPagamentosPessoa(entidade, pessoa);
    }

    public void persistirReciboPagamento(com.dciapps.webclient.ReciboPagamento reciboPagamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.persistirReciboPagamento(reciboPagamento);
    }

    public void removerReciboPagamento(com.dciapps.webclient.ReciboPagamento reciboPagamento) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        port.removerReciboPagamento(reciboPagamento);
    }

    public ReciboPagamento buscaReciboPagamentoReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String referencia) {
        com.dciapps.webclient.ContabilidadeWSrv_Service service = new com.dciapps.webclient.ContabilidadeWSrv_Service();
        com.dciapps.webclient.ContabilidadeWSrv port = service.getContabilidadeWSrvPort();
        return port.buscaReciboPagamentoReferencia(entidade, referencia);
    }

}
