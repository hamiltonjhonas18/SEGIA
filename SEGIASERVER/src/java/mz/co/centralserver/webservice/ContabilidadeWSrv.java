/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.webservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import mz.co.centralserver.daoimpl.contabilistico.ActivoDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.ContaDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.ContaGeralDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.DiarioDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.DocumentoDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.EstadoFacturaDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.ExtractoContaGeralDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.ExtractoDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.FacturaDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.LancamentoDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.MensalidadeDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.ModulosUsuarioMARKETDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.MoedaDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.PagamentoDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.PetyCashDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.PetyDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.PlanoDeContaDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.ReciboDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.ReciboPagamentoDAOImpl;
import mz.co.centralserver.daoimpl.contabilistico.TipoContaDAOImpl;
import mz.co.centralserver.model.contabilistico.Activo;
import mz.co.centralserver.model.contabilistico.Conta;
import mz.co.centralserver.model.contabilistico.ContaGeral;
import mz.co.centralserver.model.contabilistico.Diario;
import mz.co.centralserver.model.contabilistico.Documento;
import mz.co.centralserver.model.contabilistico.EstadoFactura;
import mz.co.centralserver.model.contabilistico.Extracto;
import mz.co.centralserver.model.contabilistico.ExtractoContaGeral;
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.contabilistico.Lancamento;
import mz.co.centralserver.model.contabilistico.Mensalidade;
import mz.co.centralserver.model.contabilistico.ModulosUsuarioMARKET;
import mz.co.centralserver.model.contabilistico.Moeda;
import mz.co.centralserver.model.contabilistico.Pagamento;
import mz.co.centralserver.model.contabilistico.Pety;
import mz.co.centralserver.model.contabilistico.PetyCash;
import mz.co.centralserver.model.contabilistico.PlanoDeConta;
import mz.co.centralserver.model.contabilistico.Recibo;
import mz.co.centralserver.model.contabilistico.ReciboPagamento;
import mz.co.centralserver.model.contabilistico.TipoConta;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;
import mz.co.centralserver.model.recursoshumanos.Funcionario;
import mz.co.centralserver.model.vendas.Caixa;
import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.vendas.Venda;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "ContabilidadeWSrv")
public class ContabilidadeWSrv {

    //=========================  PAGAMENTO ==========================
    PagamentoDAOImpl pagamentoDAOImpl = new PagamentoDAOImpl();

    @WebMethod(operationName = "buscaPagamentoId")
    public Pagamento buscaPagamentoId(@WebParam(name = "id") int id) {
        return pagamentoDAOImpl.getPagamento(id);
    }

    @WebMethod(operationName = "buscaPagamentoDescricao")
    public Pagamento buscaPagamentoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return pagamentoDAOImpl.getPagamento(entidade, descricao);
    }

    @WebMethod(operationName = "listaPagamentosCondicao")
    public List<Pagamento> listaPagamentosCondicao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "condicao") String condicao) {
        return pagamentoDAOImpl.listaPagamentosCondicao(entidade, condicao);
    }

    @WebMethod(operationName = "listaPagamentosReferencia")
    public List<Pagamento> listaPagamentosReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "referencia") String referencia) {
        return pagamentoDAOImpl.listaPagamentosReferencia(entidade, referencia);
    }

    @WebMethod(operationName = "listaTodosPagamentos")
    public List<Pagamento> listaTodosPagamentos(@WebParam(name = "entidade") Entidade entidade) {
        return pagamentoDAOImpl.listaPagamentos(entidade);
    }

    @WebMethod(operationName = "listaPagamentos")
    public List<Pagamento> listaPagamentos(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "origem") String origem) {
        return pagamentoDAOImpl.listaPagamentos(entidade, origem);
    }

    @WebMethod(operationName = "listaPagamentosCliente")
    public List<Pagamento> listaPagamentosCliente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pessoa") Pessoa pessoa) {
        return pagamentoDAOImpl.listaPagamentosCliente(entidade, pessoa);
    }

    @WebMethod(operationName = "listaPagamentosRecibo")
    public List<Pagamento> listaPagamentosRecibo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "reciboPagamento") ReciboPagamento reciboPagamento) {
        return pagamentoDAOImpl.listaPagamentosRecibo(entidade, reciboPagamento);
    }

    @WebMethod(operationName = "listaPagamentosPendentesCliente")
    public List<Pagamento> listaPagamentosPendentesCliente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pessoa") Pessoa pessoa) {
        return pagamentoDAOImpl.listaPagamentosPendentesCliente(entidade, pessoa);
    }

    @WebMethod(operationName = "listaPagamentosInscricao")
    public List<Pagamento> listaPagamentosInscricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pessoa") Inscricao inscricao) {
        return pagamentoDAOImpl.listaPagamentosInscricao(entidade, inscricao);
    }

    @WebMethod(operationName = "listaPagamentosTurma")
    public List<Pagamento> listaPagamentosTurma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma) {
        return pagamentoDAOImpl.listaPagamentosTurma(entidade, turma);
    }

    @WebMethod(operationName = "listaPagamentosPeriodo")
    public List<Pagamento> listaPagamentosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return pagamentoDAOImpl.listaPagamentosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaPagamentosData")
    public List<Pagamento> listaPagamentosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return pagamentoDAOImpl.listaPagamentosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_pagamento")
    public void persistir_pagamento(@WebParam(name = "pagamento") Pagamento pagamento) {
        pagamentoDAOImpl.persistir_pagamento(pagamento);
    }

    @WebMethod(operationName = "remover_pagamento")
    public void remover_pagamento(@WebParam(name = "pagamento") Pagamento pagamento) {
        pagamentoDAOImpl.remover_pagamento(pagamento);
    }

    /*
     ************************** END PAGAMENTO ***********************
     **/
    //=========================  MOEDA ==========================
    MoedaDAOImpl moedaDAOImpl = new MoedaDAOImpl();

    @WebMethod(operationName = "buscaMoedaId")
    public Moeda buscaMoedaId(@WebParam(name = "id") int id) {
        return moedaDAOImpl.getMoeda(id);
    }

    @WebMethod(operationName = "buscaMoedaDescricao")
    public Moeda buscaMoedaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return moedaDAOImpl.getMoeda(entidade, descricao);
    }

    @WebMethod(operationName = "listaMoedas")
    public List<Moeda> listaMoedas(@WebParam(name = "entidade") Entidade entidade) {
        return moedaDAOImpl.listaMoedas(entidade);
    }

    @WebMethod(operationName = "persistir_moeda")
    public void persistir_moeda(@WebParam(name = "moeda") Moeda moeda) {
        moedaDAOImpl.persistir_moeda(moeda);
    }

    @WebMethod(operationName = "remover_moeda")
    public void remover_moeda(@WebParam(name = "moeda") Moeda moeda) {
        moedaDAOImpl.remover_moeda(moeda);
    }

    /*
     ************************** END MOEDA ***********************
     **/
    //=========================  FACTURA ==========================
    FacturaDAOImpl facturaDAOImpl = new FacturaDAOImpl();

    @WebMethod(operationName = "buscaFacturaId")
    public Factura buscaFacturaId(@WebParam(name = "id") int id) {
        return facturaDAOImpl.getFactura(id);
    }

    @WebMethod(operationName = "buscaFacturaNumeroLancamento")
    public Factura buscaFacturaNumeroLancamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "tipo") String tipo, @WebParam(name = "id") long id) {
        return facturaDAOImpl.getFacturaNumeroLancamento(entidade, tipo, id);
    }

    @WebMethod(operationName = "buscaFacturaReferencia")
    public Factura buscaFacturaReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "referencia") String referencia) {
        return facturaDAOImpl.getFacturaReferencia(entidade, referencia);
    }

    @WebMethod(operationName = "buscaFacturaVenda")
    public Factura buscaFacturaVenda(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "venda") Venda venda) {
        return facturaDAOImpl.getFacturaVenda(entidade, venda);
    }

    @WebMethod(operationName = "buscaFacturaPagamento")
    public Factura buscaFacturaPagamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pagamento") Pagamento pagamento) {
        return facturaDAOImpl.getFacturaPagamento(entidade, pagamento);
    }

    @WebMethod(operationName = "listaFacturas")
    public List<Factura> listaFacturas(@WebParam(name = "entidade") Entidade entidade) {
        return facturaDAOImpl.listaFacturas(entidade);
    }

    @WebMethod(operationName = "listaFacturasNaoLancadas")
    public List<Factura> listaFacturasNaoLancadas(@WebParam(name = "entidade") Entidade entidade) {
        return facturaDAOImpl.listaFacturasNaoLancadas(entidade);
    }

    @WebMethod(operationName = "listaFacturasData")
    public List<Factura> listaFacturasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return facturaDAOImpl.listaFacturasData(entidade, data);
    }

    @WebMethod(operationName = "listaFacturasAnteriores")
    public List<Factura> listaFacturasAnteriores(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return facturaDAOImpl.listaFacturasAnteriores(entidade, data);
    }

    @WebMethod(operationName = "listaFacturasPeriodo")
    public List<Factura> listaFacturasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return facturaDAOImpl.listaFacturasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaFacturasCategoria")
    public List<Factura> listaFacturasCategoria(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "categoria") String categoria) {
        return facturaDAOImpl.listaFacturasCategoria(entidade, categoria);
    }

    @WebMethod(operationName = "listaFacturasStatus")
    public List<Factura> listaFacturasStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status) {
        return facturaDAOImpl.listaFacturasStatus(entidade, status);
    }

    @WebMethod(operationName = "listaFacturasVenda")
    public List<Factura> listaFacturasVenda(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "venda") Venda venda) {
        return facturaDAOImpl.listaFacturasVenda(entidade, venda);
    }

    @WebMethod(operationName = "listaFacturasCaixa")
    public List<Factura> listaFacturasCaixa(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "caixa") Caixa caixa) {
        return facturaDAOImpl.listaFacturasCaixa(entidade, caixa);
    }

    @WebMethod(operationName = "listaFacturasMoeda")
    public List<Factura> listaFacturasMoeda(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "moeda") Moeda moeda) {
        return facturaDAOImpl.listaFacturasMoeda(entidade, moeda);
    }

    @WebMethod(operationName = "listaFacturasUsuario")
    public List<Factura> listaFacturasUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "usuario") Usuario usuario) {
        return facturaDAOImpl.listaFacturasUsuario(entidade, usuario);
    }

    @WebMethod(operationName = "listaFacturasPagamento")
    public List<Factura> listaFacturasPagamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pagamento") Pagamento pagamento) {
        return facturaDAOImpl.listaFacturasPagamento(entidade, pagamento);
    }

    @WebMethod(operationName = "persistir_factura")
    public void persistir_factura(@WebParam(name = "factura") Factura factura) {
        facturaDAOImpl.persistir_factura(factura);
    }

    @WebMethod(operationName = "remover_factura")
    public void remover_factura(@WebParam(name = "factura") Factura factura) {
        facturaDAOImpl.remover_factura(factura);
    }

    /*
     ************************** END FACTURA ***********************
     **/
    //=========================  RECIBO ==========================
    ReciboDAOImpl reciboDAOImpl = new ReciboDAOImpl();

    @WebMethod(operationName = "buscaReciboId")
    public Recibo buscaReciboId(@WebParam(name = "id") int id) {
        return reciboDAOImpl.getRecibo(id);
    }

    @WebMethod(operationName = "listaRecibos")
    public List<Recibo> listaRecibos(@WebParam(name = "entidade") Entidade entidade) {
        return reciboDAOImpl.listaRecibos(entidade);
    }

    @WebMethod(operationName = "listaRecibosFactura")
    public List<Recibo> listaRecibosFactura(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "factura") Factura factura) {
        return reciboDAOImpl.listaRecibosFactura(entidade, factura);
    }

    @WebMethod(operationName = "listaRecibosPessoa")
    public List<Recibo> listaRecibosPessoa(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pessoa") Pessoa pessoa) {
        return reciboDAOImpl.listaRecibosPessoa(entidade, pessoa);
    }

    @WebMethod(operationName = "listaRecibosPeriodo")
    public List<Recibo> listaRecibosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return reciboDAOImpl.listaRecibosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaRecibosData")
    public List<Recibo> listaRecibosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return reciboDAOImpl.listaRecibosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_recibo")
    public void persistir_recibo(@WebParam(name = "recibo") Recibo recibo) {
        reciboDAOImpl.persistir_recibo(recibo);
    }

    @WebMethod(operationName = "remover_recibo")
    public void remover_recibo(@WebParam(name = "recibo") Recibo recibo) {
        reciboDAOImpl.remover_recibo(recibo);
    }

    /*
     ************************** END RECIBO ***********************
     **/
    //******************* MODULO USUARIO MARKET ********************
    ModulosUsuarioMARKETDAOImpl modulosUsuarioMARKETDAOImpl = new ModulosUsuarioMARKETDAOImpl();

    @WebMethod(operationName = "buscaModulosUsuarioId")
    public ModulosUsuarioMARKET buscaModulosUsuarioId(@WebParam(name = "id") int id) {
        return modulosUsuarioMARKETDAOImpl.getModulosUsuarioMARKET(id);
    }

    @WebMethod(operationName = "buscaModulosUsuarioMARKET")
    public ModulosUsuarioMARKET buscaModulosUsuarioMARKET(@WebParam(name = "usuario") Usuario usuario) {
        return modulosUsuarioMARKETDAOImpl.getModulosUsuarioMARKET(usuario);
    }

    @WebMethod(operationName = "listaModulosMARKET")
    public List<ModulosUsuarioMARKET> listaModulosMARKET(@WebParam(name = "entidade") Entidade entidade) {
        return modulosUsuarioMARKETDAOImpl.listaModulosMARKET(entidade);
    }

    @WebMethod(operationName = "listaTodosModulosMARKET")
    public List<ModulosUsuarioMARKET> listaTodosModulosMARKET() {
        return modulosUsuarioMARKETDAOImpl.listaTodosModulosMARKET();
    }

    @WebMethod(operationName = "persitir_modulosUsuarioMARKET")
    public void persitir_modulosUsuarioMARKET(@WebParam(name = "modulosUsuarioMARKET") ModulosUsuarioMARKET modulosUsuarioMARKET) {
        modulosUsuarioMARKETDAOImpl.persitir_modulosUsuarioMARKET(modulosUsuarioMARKET);
    }

    @WebMethod(operationName = "remover_modulosUsuarioMARKET")
    public void remover_modulosUsuarioMARKET(@WebParam(name = "modulosUsuarioMARKET") ModulosUsuarioMARKET modulosUsuarioMARKET) {
        modulosUsuarioMARKETDAOImpl.remover_modulosUsuarioMARKET(modulosUsuarioMARKET);
    }
    //================== END MODULO USUARIO MARKET =====================================

    //=========================  TIPO CONTA ==========================
    TipoContaDAOImpl tipoContaDAOImpl = new TipoContaDAOImpl();

    @WebMethod(operationName = "buscaTipoContaId")
    public TipoConta buscaTipoContaId(@WebParam(name = "id") int id) {
        return tipoContaDAOImpl.getTipoConta(id);
    }

    @WebMethod(operationName = "buscaTipoContaDescricao")
    public TipoConta buscaTipoContaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return tipoContaDAOImpl.getTipoConta(entidade, descricao);
    }

    @WebMethod(operationName = "listaTiposConta")
    public List<TipoConta> listaTiposConta(@WebParam(name = "entidade") Entidade entidade) {
        return tipoContaDAOImpl.listaTiposConta(entidade);
    }

    @WebMethod(operationName = "persistir_tipoConta")
    public void persistir_tipoConta(@WebParam(name = "tipoConta") TipoConta tipoConta) {
        tipoContaDAOImpl.persistir_tipoConta(tipoConta);
    }

    @WebMethod(operationName = "remover_tipoConta")
    public void remover_tipoConta(@WebParam(name = "tipoConta") TipoConta tipoConta) {
        tipoContaDAOImpl.remover_tipoConta(tipoConta);
    }

    /*
     ************************** END TIPO CONTA ***********************
     **/
    //=========================  PLANO DE CONTA ==========================
    PlanoDeContaDAOImpl planoDeContaDAOImpl = new PlanoDeContaDAOImpl();

    @WebMethod(operationName = "buscaPlanoDeContaId")
    public PlanoDeConta buscaPlanoDeContaId(@WebParam(name = "id") int id) {
        return planoDeContaDAOImpl.getPlanoDeConta(id);
    }

    @WebMethod(operationName = "buscaPlanoDeContaDescricao")
    public PlanoDeConta buscaPlanoDeContaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return planoDeContaDAOImpl.getPlanoDeConta(entidade, descricao);
    }

    @WebMethod(operationName = "buscaPlanoDeContaCodigo")
    public PlanoDeConta buscaPlanoDeContaCodigo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "codigo") String codigo) {
        return planoDeContaDAOImpl.getPlanoDeContaCodigo(entidade, codigo);
    }

    @WebMethod(operationName = "listaPlanosDeConta")
    public List<PlanoDeConta> listaPlanosDeConta(@WebParam(name = "entidade") Entidade entidade) {
        return planoDeContaDAOImpl.listaPlanosDeConta(entidade);
    }

    @WebMethod(operationName = "listaPlanosDeContaAssociados")
    public List<PlanoDeConta> listaPlanosDeContaAssociados(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "planoDeConta") PlanoDeConta planoDeConta) {
        return planoDeContaDAOImpl.listaPlanosDeContaAssociados(entidade, planoDeConta);
    }

    @WebMethod(operationName = "persistir_planoDeConta")
    public void persistir_planoDeConta(@WebParam(name = "planoDeConta") PlanoDeConta planoDeConta) {
        planoDeContaDAOImpl.persistir_planoDeConta(planoDeConta);
    }

    @WebMethod(operationName = "remover_planoDeConta")
    public void remover_planoDeConta(@WebParam(name = "planoDeConta") PlanoDeConta planoDeConta) {
        planoDeContaDAOImpl.remover_planoDeConta(planoDeConta);
    }

    /*
     ************************** END PLANO DE CONTA ***********************
     **/
    //=========================  PETY CASH ==========================
    PetyCashDAOImpl petyCashDAOImpl = new PetyCashDAOImpl();

    @WebMethod(operationName = "buscaPetyCashId")
    public PetyCash buscaPetyCashId(@WebParam(name = "id") int id) {
        return petyCashDAOImpl.getPetyCash(id);
    }

    @WebMethod(operationName = "buscaPetyCashDescricao")
    public PetyCash buscaPetyCashDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return petyCashDAOImpl.getPetyCash(entidade, descricao);
    }

    @WebMethod(operationName = "listaPetyCashs")
    public List<PetyCash> listaPetyCashs(@WebParam(name = "entidade") Entidade entidade) {
        return petyCashDAOImpl.listaPetyCashs(entidade);
    }

    @WebMethod(operationName = "listaPetyCashsFuncionario")
    public List<PetyCash> listaPetyCashsFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return petyCashDAOImpl.listaPetyCashsFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "listaPetyCashsPety")
    public List<PetyCash> listaPetyCashsPety(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pety") Pety pety) {
        return petyCashDAOImpl.listaPetyCashsPety(entidade, pety);
    }

    @WebMethod(operationName = "listaPetyCashsPeriodo")
    public List<PetyCash> listaPetyCashsPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return petyCashDAOImpl.listaPetyCashsPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaPetyCashsData")
    public List<PetyCash> listaPetyCashsData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return petyCashDAOImpl.listaPetyCashsData(entidade, data);
    }

    @WebMethod(operationName = "persistir_petyCash")
    public void persistir_petyCash(@WebParam(name = "petyCash") PetyCash petyCash) {
        petyCashDAOImpl.persistir_petyCash(petyCash);
    }

    @WebMethod(operationName = "remover_petyCash")
    public void remover_petyCash(@WebParam(name = "petyCash") PetyCash petyCash) {
        petyCashDAOImpl.remover_petyCash(petyCash);
    }

    /*
     ************************** END PETY CASH ***********************
     **/
    //=========================  PETY ==========================
    PetyDAOImpl petyDAOImpl = new PetyDAOImpl();

    @WebMethod(operationName = "buscaPetyId")
    public Pety buscaPetyId(@WebParam(name = "id") int id) {
        return petyDAOImpl.getPety(id);
    }

    @WebMethod(operationName = "buscaPetyPeriodo")
    public Pety buscaPetyPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") String periodo) {
        return petyDAOImpl.getPety(entidade, periodo);
    }

    @WebMethod(operationName = "listaPetys")
    public List<Pety> listaPetys(@WebParam(name = "entidade") Entidade entidade) {
        return petyDAOImpl.listaPetys(entidade);
    }

    @WebMethod(operationName = "persistir_pety")
    public void persistir_pety(@WebParam(name = "pety") Pety pety) {
        petyDAOImpl.persistir_pety(pety);
    }

    @WebMethod(operationName = "remover_pety")
    public void remover_pety(@WebParam(name = "pety") Pety pety) {
        petyDAOImpl.remover_pety(pety);
    }

    /*
     ************************** END PETY ***********************
     **/
    //=========================  LANCAMENTO ==========================
    LancamentoDAOImpl lancamentoDAOImpl = new LancamentoDAOImpl();

    @WebMethod(operationName = "buscaLancamentoId")
    public Lancamento buscaLancamentoId(@WebParam(name = "id") int id) {
        return lancamentoDAOImpl.getLancamento(id);
    }

    @WebMethod(operationName = "buscaLancamentoDescricao")
    public Lancamento buscaLancamentoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return lancamentoDAOImpl.getLancamento(entidade, descricao);
    }

    @WebMethod(operationName = "listaLancamentos")
    public List<Lancamento> listaLancamentos(@WebParam(name = "entidade") Entidade entidade) {
        return lancamentoDAOImpl.listaLancamentos(entidade);
    }

    @WebMethod(operationName = "listaLancamentosLimite")
    public List<Lancamento> listaLancamentosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return lancamentoDAOImpl.listaLancamentosLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaLancamentosFuncionario")
    public List<Lancamento> listaLancamentosFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return lancamentoDAOImpl.listaLancamentosFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "listaLancamentosDiario")
    public List<Lancamento> listaLancamentosDiario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "diario") Diario diario) {
        return lancamentoDAOImpl.listaLancamentosDiario(entidade, diario);
    }

    @WebMethod(operationName = "listaLancamentosDocumento")
    public List<Lancamento> listaLancamentosDocumento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "documento") Documento documento) {
        return lancamentoDAOImpl.listaLancamentosDocumento(entidade, documento);
    }

    @WebMethod(operationName = "listaLancamentosContaCliente")
    public List<Lancamento> listaLancamentosContaCliente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "contaCliente") ContaGeral contaCliente) {
        return lancamentoDAOImpl.listaLancamentosContaCliente(entidade, contaCliente);
    }

    @WebMethod(operationName = "listaLancamentosContaPlano")
    public List<Lancamento> listaLancamentosContaPlano(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "contaPlano") ContaGeral contaPlano) {
        return lancamentoDAOImpl.listaLancamentosContaPlano(entidade, contaPlano);
    }

    @WebMethod(operationName = "listaLancamentosPeriodo")
    public List<Lancamento> listaLancamentosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return lancamentoDAOImpl.listaLancamentosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaLancamentosData")
    public List<Lancamento> listaLancamentosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return lancamentoDAOImpl.listaLancamentosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_lancamento")
    public void persistir_lancamento(@WebParam(name = "lancamento") Lancamento lancamento) {
        lancamentoDAOImpl.persistir_lancamento(lancamento);
    }

    @WebMethod(operationName = "remover_lancamento")
    public void remover_lancamento(@WebParam(name = "lancamento") Lancamento lancamento) {
        lancamentoDAOImpl.remover_lancamento(lancamento);
    }

    /*
     ************************** END LANCAMENTO ***********************
     **/
    //=========================  EXTRACTO CONTA GERAL ==========================
    ExtractoContaGeralDAOImpl extractoContaGeralDAOImpl = new ExtractoContaGeralDAOImpl();

    @WebMethod(operationName = "buscaExtractoContaGeralId")
    public ExtractoContaGeral buscaExtractoContaGeralId(@WebParam(name = "id") int id) {
        return extractoContaGeralDAOImpl.getExtractoContaGeral(id);
    }

    @WebMethod(operationName = "listaExtractosContaGeral")
    public List<ExtractoContaGeral> listaExtractosContaGeral(@WebParam(name = "entidade") Entidade entidade) {
        return extractoContaGeralDAOImpl.listaExtractosContaGeral(entidade);
    }

    @WebMethod(operationName = "listaExtractosContaGeralMovimento")
    public List<ExtractoContaGeral> listaExtractosContaGeralMovimento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "movimento") String movimento) {
        return extractoContaGeralDAOImpl.listaExtractosContaGeral(entidade, movimento);
    }

    @WebMethod(operationName = "listaExtractosContaGeralLancamento")
    public List<ExtractoContaGeral> listaExtractosContaGeralLancamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "lancamento") Lancamento lancamento) {
        return extractoContaGeralDAOImpl.listaExtractosContaGeralLancamento(entidade, lancamento);
    }

    @WebMethod(operationName = "listaExtractosContaGeralAssociados")
    public List<ExtractoContaGeral> listaExtractosContaGeralAssociados(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "contaGeral") ContaGeral contaGeral) {
        return extractoContaGeralDAOImpl.listaExtractosContaGeralAssociados(entidade, contaGeral);
    }

    @WebMethod(operationName = "listaExtractosContaGeralPeriodo")
    public List<ExtractoContaGeral> listaExtractosContaGeralPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return extractoContaGeralDAOImpl.listaExtractosContaGeralPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaExtractosContaGeralData")
    public List<ExtractoContaGeral> listaExtractosContaGeralData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return extractoContaGeralDAOImpl.listaExtractosContaGeralData(entidade, data);
    }

    @WebMethod(operationName = "persistir_extractoContaGeral")
    public void persistir_extractoContaGeral(@WebParam(name = "extractoContaGeral") ExtractoContaGeral extractoContaGeral) {
        extractoContaGeralDAOImpl.persistir_extractoContaGeral(extractoContaGeral);
    }

    @WebMethod(operationName = "remover_extractoContaGeral")
    public void remover_extractoContaGeral(@WebParam(name = "extractoContaGeral") ExtractoContaGeral extractoContaGeral) {
        extractoContaGeralDAOImpl.remover_extractoContaGeral(extractoContaGeral);
    }

    /*
     ************************** END EXTRACTO CONTA GERAL ***********************
     **/
    //=========================  EXTRACTO  ==========================
    ExtractoDAOImpl extractoDAOImpl = new ExtractoDAOImpl();

    @WebMethod(operationName = "buscaExtractoId")
    public Extracto buscaExtractoId(@WebParam(name = "id") int id) {
        return extractoDAOImpl.getExtracto(id);
    }

    @WebMethod(operationName = "listaExtractos")
    public List<Extracto> listaExtractos(@WebParam(name = "entidade") Entidade entidade) {
        return extractoDAOImpl.listaExtractos(entidade);
    }

    @WebMethod(operationName = "listaExtractosMovimento")
    public List<Extracto> listaExtractosMovimento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "movimento") String movimento) {
        return extractoDAOImpl.listaExtractos(entidade, movimento);
    }

    @WebMethod(operationName = "listaExtractosFactura")
    public List<Extracto> listaExtractosFactura(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "factura") Factura factura) {
        return extractoDAOImpl.listaExtractosFactura(entidade, factura);
    }

    @WebMethod(operationName = "listaExtractosPeriodo")
    public List<Extracto> listaExtractosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return extractoDAOImpl.listaExtractosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaExtractosData")
    public List<Extracto> listaExtractosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return extractoDAOImpl.listaExtractosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_extracto")
    public void persistir_extracto(@WebParam(name = "extracto") Extracto extracto) {
        extractoDAOImpl.persistir_extracto(extracto);
    }

    @WebMethod(operationName = "remover_extracto")
    public void remover_extracto(@WebParam(name = "extracto") Extracto extracto) {
        extractoDAOImpl.remover_extracto(extracto);
    }

    /*
     ************************** END EXTRACTO  ***********************
     **/
    //=========================  ESTADO FACTURA ==========================
    EstadoFacturaDAOImpl estadoFacturaDAOImpl = new EstadoFacturaDAOImpl();

    @WebMethod(operationName = "buscaEstadoFacturaId")
    public EstadoFactura buscaEstadoFacturaId(@WebParam(name = "id") int id) {
        return estadoFacturaDAOImpl.getEstadoFactura(id);
    }

    @WebMethod(operationName = "buscaEstadoFacturaPeriodo")
    public EstadoFactura buscaEstadoFacturaPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") String periodo) {
        return estadoFacturaDAOImpl.getEstadoFactura(entidade, periodo);
    }

    @WebMethod(operationName = "listaEstadosFactura")
    public List<EstadoFactura> listaEstadosFactura(@WebParam(name = "entidade") Entidade entidade) {
        return estadoFacturaDAOImpl.listaEstadosFactura(entidade);
    }

    @WebMethod(operationName = "persistir_estadoFactura")
    public void persistir_estadoFactura(@WebParam(name = "estadoFactura") EstadoFactura estadoFactura) {
        estadoFacturaDAOImpl.persistir_estadoFactura(estadoFactura);
    }

    @WebMethod(operationName = "remover_estadoFactura")
    public void remover_estadoFactura(@WebParam(name = "estadoFactura") EstadoFactura estadoFactura) {
        estadoFacturaDAOImpl.remover_estadoFactura(estadoFactura);
    }

    /*
     ************************** END ESTADO FACTURA ***********************
     **/
    //=========================  DOCUMENTO ==========================
    DocumentoDAOImpl documentoDAOImpl = new DocumentoDAOImpl();

    @WebMethod(operationName = "buscaDocumentoId")
    public Documento buscaDocumentoId(@WebParam(name = "id") int id) {
        return documentoDAOImpl.getDocumento(id);
    }

    @WebMethod(operationName = "buscaDocumentoDescricao")
    public Documento buscaDocumentoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return documentoDAOImpl.getDocumento(entidade, descricao);
    }

    @WebMethod(operationName = "listaDocumentos")
    public List<Documento> listaDocumentos(@WebParam(name = "entidade") Entidade entidade) {
        return documentoDAOImpl.listaDocumentos(entidade);
    }

    @WebMethod(operationName = "persistir_documento")
    public void persistir_documento(@WebParam(name = "documento") Documento documento) {
        documentoDAOImpl.persistir_documento(documento);
    }

    @WebMethod(operationName = "remover_documento")
    public void remover_documento(@WebParam(name = "documento") Documento documento) {
        documentoDAOImpl.remover_documento(documento);
    }

    /*
     ************************** END DOCUMENTO ***********************
     **/
    //=========================  DIARIO ==========================
    DiarioDAOImpl diarioDAOImpl = new DiarioDAOImpl();

    @WebMethod(operationName = "buscaDiarioId")
    public Diario buscaDiarioId(@WebParam(name = "id") int id) {
        return diarioDAOImpl.getDiario(id);
    }

    @WebMethod(operationName = "buscaDiarioDescricao")
    public Diario buscaDiarioDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return diarioDAOImpl.getDiario(entidade, descricao);
    }

    @WebMethod(operationName = "listaDiarios")
    public List<Diario> listaDiarios(@WebParam(name = "entidade") Entidade entidade) {
        return diarioDAOImpl.listaDiarios(entidade);
    }

    @WebMethod(operationName = "persistir_diario")
    public void persistir_diario(@WebParam(name = "diario") Diario diario) {
        diarioDAOImpl.persistir_diario(diario);
    }

    @WebMethod(operationName = "remover_diario")
    public void remover_diario(@WebParam(name = "diario") Diario diario) {
        diarioDAOImpl.remover_diario(diario);
    }

    /*
     ************************** END DIARIO ***********************
     **/
    //=========================  CONTA GERAL ==========================
    ContaGeralDAOImpl contaGeralDAOImpl = new ContaGeralDAOImpl();

    @WebMethod(operationName = "buscaContaGeralId")
    public ContaGeral buscaContaGeralId(@WebParam(name = "id") int id) {
        return contaGeralDAOImpl.getContaGeral(id);
    }

    @WebMethod(operationName = "buscaContaGeralDescricao")
    public ContaGeral buscaContaGeralDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return contaGeralDAOImpl.getContaGeral(entidade, descricao);
    }

    @WebMethod(operationName = "buscaContaGeral")
    public ContaGeral buscaContaGeral(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "conta") String conta) {
        return contaGeralDAOImpl.getContaGeralConta(entidade, conta);
    }

    @WebMethod(operationName = "listaContasGerais")
    public List<ContaGeral> listaContasGerais(@WebParam(name = "entidade") Entidade entidade) {
        return contaGeralDAOImpl.listaContasGerais(entidade);
    }

    @WebMethod(operationName = "persistir_contaGeral")
    public void persistir_contaGeral(@WebParam(name = "contaGeral") ContaGeral contaGeral) {
        contaGeralDAOImpl.persistir_contaGeral(contaGeral);
    }

    @WebMethod(operationName = "remover_contaGeral")
    public void remover_contaGeral(@WebParam(name = "contaGeral") ContaGeral contaGeral) {
        contaGeralDAOImpl.remover_contaGeral(contaGeral);
    }

    /*
     ************************** END CONTA GERAL ***********************
     **/
    //=========================  CONTA  ==========================
    ContaDAOImpl contaDAOImpl = new ContaDAOImpl();

    @WebMethod(operationName = "buscaContaId")
    public Conta buscaContaId(@WebParam(name = "id") int id) {
        return contaDAOImpl.getConta(id);
    }

    @WebMethod(operationName = "buscaContaDescricao")
    public Conta buscaContaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return contaDAOImpl.getConta(entidade, descricao);
    }

    @WebMethod(operationName = "listaContas")
    public List<Conta> listaContas(@WebParam(name = "entidade") Entidade entidade) {
        return contaDAOImpl.listaContas(entidade);
    }

    @WebMethod(operationName = "listaContasCliente")
    public List<Conta> listaContasCliente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "cliente") Cliente cliente) {
        return contaDAOImpl.listaContasCliente(entidade, cliente);
    }

    @WebMethod(operationName = "listaContasTipo")
    public List<Conta> listaContasTipo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "tipoConta") TipoConta tipoConta) {
        return contaDAOImpl.listaContasTipo(entidade, tipoConta);
    }

    @WebMethod(operationName = "persistir_conta")
    public void persistir_conta(@WebParam(name = "conta") Conta conta) {
        contaDAOImpl.persistir_conta(conta);
    }

    @WebMethod(operationName = "remover_conta")
    public void remover_conta(@WebParam(name = "conta") Conta conta) {
        contaDAOImpl.remover_conta(conta);
    }

    /*
     ************************** END CONTA ***********************
     **/
 /*=================== ACTIVO========================*/
    ActivoDAOImpl activoDAOImpl = new ActivoDAOImpl();

    @WebMethod(operationName = "persistir_activo")
    public void persistir_activo(@WebParam(name = "activo") Activo activo) {
        activoDAOImpl.persistir_activo(activo);
    }

    @WebMethod(operationName = "remover_activo")
    public void remover_activo(@WebParam(name = "activo") Activo activo) {
        activoDAOImpl.remover_activo(activo);
    }

    @WebMethod(operationName = "buscarActivoId")
    public Activo buscarActivoId(@WebParam(name = "id") int id) {
        return activoDAOImpl.getActivo(id);
    }

    @WebMethod(operationName = "buscarActivoNome")
    public Activo buscarActivoNome(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "nome") String nome) {
        return activoDAOImpl.getActivo(entidade, nome);
    }

    @WebMethod(operationName = "listaActivos")
    public List<Activo> listaActivos(@WebParam(name = "entidade") Entidade entidade) {
        return activoDAOImpl.listaActivos(entidade);
    }

    @WebMethod(operationName = "listaActivosLimite")
    public List<Activo> listaActivosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return activoDAOImpl.listaActivosLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaActivosPeriodo")
    public List<Activo> listaActivosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return activoDAOImpl.listaActivosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaActivosData")
    public List<Activo> listaActivosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return activoDAOImpl.listaActivosData(entidade, data);
    }
    /**
     * ******************** END ACTIVO*********************
     */

    //======================= MENSALIDADE ===========================
    MensalidadeDAOImpl mensalidadeDAOImpl = new MensalidadeDAOImpl();

    @WebMethod(operationName = "buscaMensalidadeId")
    public Mensalidade buscaMensalidadeId(@WebParam(name = "id") int id) {
        return mensalidadeDAOImpl.getMensalidade(id);
    }

    @WebMethod(operationName = "buscaMensalidadeAluno")
    public Mensalidade buscaMensalidadeAluno(@WebParam(name = "id") int id) {
        return mensalidadeDAOImpl.getMensalidadeAluno(id);
    }

    @WebMethod(operationName = "listaMensalidadesAreaInscricao")
    public List<Mensalidade> listaMensalidadesAreaInscricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return mensalidadeDAOImpl.listaMensalidadesAreaInscricao(entidade, id);
    }

    @WebMethod(operationName = "listaMensalidadesCurso")
    public List<Mensalidade> listaMensalidadesCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return mensalidadeDAOImpl.listaMensalidadesCurso(entidade, id);
    }

    @WebMethod(operationName = "listaMensalidadesAluno")
    public List<Mensalidade> listaMensalidadesAluno(@WebParam(name = "id") int id) {
        return mensalidadeDAOImpl.listaMensalidadesAluno(id);
    }

    @WebMethod(operationName = "listaMensalidadesAlunoDataMensalidade")
    public List<Mensalidade> listaMensalidadesAlunoDataMensalidade(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return mensalidadeDAOImpl.listaMensalidadesAlunoDataMensalidade(entidade, data1, data2);
    }

    @WebMethod(operationName = "listaMensalidadesAlunoDataPagamento")
    public List<Mensalidade> listaMensalidadesAlunoDataPagamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return mensalidadeDAOImpl.listaMensalidadesAlunoDataPagamento(entidade, data1, data2);
    }

    @WebMethod(operationName = "listaMensalidades")
    public List<Mensalidade> listaMensalidades(@WebParam(name = "entidade") Entidade entidade) {
        return mensalidadeDAOImpl.listaMensalidades(entidade);
    }

    @WebMethod(operationName = "persistir_mensalidade")
    public void persistir_mensalidade(@WebParam(name = "mensalidade") Mensalidade mensalidade) {
        mensalidadeDAOImpl.persistir_mensalidade(mensalidade);
    }

    @WebMethod(operationName = "remover_mensalidade")
    public void remover_mensalidade(@WebParam(name = "mensalidade") Mensalidade mensalidade) {
        mensalidadeDAOImpl.remover_mensalidade(mensalidade);
    }

    /**
     * ******************** END MENSALIDADE *************************
     */
    //=========================  RECIBO PAGAMENTO ==========================
    ReciboPagamentoDAOImpl reciboPagamentoDAOImpl = new ReciboPagamentoDAOImpl();

    @WebMethod(operationName = "buscaReciboPagamentoId")
    public ReciboPagamento buscaReciboPagamentoId(@WebParam(name = "id") int id) {
        return reciboPagamentoDAOImpl.getReciboPagamento(id);
    }

    @WebMethod(operationName = "listaRecibosPagamentos")
    public List<ReciboPagamento> listaRecibosPagamentos(@WebParam(name = "entidade") Entidade entidade) {
        return reciboPagamentoDAOImpl.listaRecibosPagamentos(entidade);
    }

    @WebMethod(operationName = "buscaReciboPagamentoReferencia")
    public ReciboPagamento buscaReciboPagamentoReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "referencia") String referencia) {
        return reciboPagamentoDAOImpl.getReciboPagamento(entidade, referencia);
    }

    @WebMethod(operationName = "listaRecibosPagamentosPessoa")
    public List<ReciboPagamento> listaRecibosPagamentosPessoa(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "pessoa") Pessoa pessoa) {
        return reciboPagamentoDAOImpl.listaRecibosPagamentosPessoa(entidade, pessoa);
    }

    @WebMethod(operationName = "listaRecibosPagamentosPeriodo")
    public List<ReciboPagamento> listaRecibosPagamentosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return reciboPagamentoDAOImpl.listaRecibosPagamentosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaRecibosPagamentosData")
    public List<ReciboPagamento> listaRecibosPagamentosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return reciboPagamentoDAOImpl.listaRecibosPagamentosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_reciboPagamento")
    public void persistir_reciboPagamento(@WebParam(name = "reciboPagamento") ReciboPagamento reciboPagamento) {
        reciboPagamentoDAOImpl.persistir_reciboPagamento(reciboPagamento);
    }

    @WebMethod(operationName = "remover_reciboPagamento")
    public void remover_reciboPagamento(@WebParam(name = "reciboPagamento") ReciboPagamento reciboPagamento) {
        reciboPagamentoDAOImpl.remover_reciboPagamento(reciboPagamento);
    }

    /*
     ************************** END RECIBO PAGAMENTO ***********************
     */
}
