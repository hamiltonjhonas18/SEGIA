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
import mz.co.centralserver.daoimpl.financas.BancoDAOImpl;
import mz.co.centralserver.daoimpl.financas.FolhaSalarialDAOImpl;
import mz.co.centralserver.daoimpl.financas.ItemRequisicaoChequeDAOImpl;
import mz.co.centralserver.daoimpl.financas.ItemRequisicaoDAOImpl;
import mz.co.centralserver.daoimpl.financas.MovimentoDAOImpl;
import mz.co.centralserver.daoimpl.financas.PeriodoSalarialDAOImpl;
import mz.co.centralserver.daoimpl.financas.PrecoDAOImpl;
import mz.co.centralserver.daoimpl.financas.RequisicaoChequeDAOImpl;
import mz.co.centralserver.daoimpl.financas.RequisicaoDAOImpl;
import mz.co.centralserver.daoimpl.financas.TipoMovimentoChequeDAOImpl;
import mz.co.centralserver.daoimpl.financas.TipoPagamentoDAOImpl;
import mz.co.centralserver.model.financas.Banco;
import mz.co.centralserver.model.financas.FolhaSalarial;
import mz.co.centralserver.model.financas.ItemRequisicao;
import mz.co.centralserver.model.financas.ItemRequisicaoCheque;
import mz.co.centralserver.model.financas.Movimento;
import mz.co.centralserver.model.financas.PeriodoSalarial;
import mz.co.centralserver.model.financas.Preco;
import mz.co.centralserver.model.financas.Requisicao;
import mz.co.centralserver.model.financas.RequisicaoCheque;
import mz.co.centralserver.model.financas.TipoMovimentoCheque;
import mz.co.centralserver.model.financas.TipoPagamento;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "FinancasWSrv")
public class FinancasWSrv {

    /*=================== BANCO========================*/
    BancoDAOImpl bancoDAOImpl = new BancoDAOImpl();
    
    @WebMethod(operationName = "persistir_banco")
    public void persistir_banco(@WebParam(name = "banco") Banco banco) {
        bancoDAOImpl.persistir_banco(banco);
    }
    
    @WebMethod(operationName = "remover_banco")
    public void remover_banco(@WebParam(name = "banco") Banco banco) {
        bancoDAOImpl.remover_banco(banco);
    }
    
    @WebMethod(operationName = "buscarBancoId")
    public Banco buscarBancoId(@WebParam(name = "id") int id) {
        return bancoDAOImpl.getBanco(id);
    }
    
    @WebMethod(operationName = "buscarBancoNome")
    public Banco buscarBancoNome(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "nome") String nome) {
        return bancoDAOImpl.getBanco(entidade, nome);
    }
    
    @WebMethod(operationName = "listaTodosBancos")
    public List<Banco> listaTodosBancos() {
        return bancoDAOImpl.listaBancos();
    }
    
    @WebMethod(operationName = "listaBancos")
    public List<Banco> listaBancos(@WebParam(name = "entidade") Entidade entidade) {
        return bancoDAOImpl.listaBancos(entidade);
    }
    
    @WebMethod(operationName = "listaBancosLimite")
    public List<Banco> listaBancosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return bancoDAOImpl.listaBancosLimite(entidade, limite);
    }

    /**
     * ******************** END BANCO*********************
     */
         /*=================== FOLHA SALARIAL========================*/
    FolhaSalarialDAOImpl folhaSalarialDAOImpl = new FolhaSalarialDAOImpl();

    @WebMethod(operationName = "persistir_folhaSalarial")
    public void persistir_folhaSalarial(@WebParam(name = "folhaSalarial") FolhaSalarial folhaSalarial) {
        folhaSalarialDAOImpl.persistir_folhaSalarial(folhaSalarial);
    }

    @WebMethod(operationName = "remover_folhaSalarial")
    public void remover_folhaSalarial(@WebParam(name = "folhaSalarial") FolhaSalarial folhaSalarial) {
        folhaSalarialDAOImpl.remover_folhaSalarial(folhaSalarial);
    }

    @WebMethod(operationName = "buscarFolhaSalarialId")
    public FolhaSalarial buscarFolhaSalarialId(@WebParam(name = "id") int id) {
        return folhaSalarialDAOImpl.getFolhaSalarial(id);
    }

    @WebMethod(operationName = "listaFolhasSalariais")
    public List<FolhaSalarial> listaFolhasSalariais(@WebParam(name = "entidade") Entidade entidade) {
        return folhaSalarialDAOImpl.listaFolhasSalariais(entidade);
    }

    @WebMethod(operationName = "listaFolhasSalariaisLimite")
    public List<FolhaSalarial> listaFolhasSalariaisLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaFolhasSalariaisPeriodo")
    public List<FolhaSalarial> listaFolhasSalariaisPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") String periodo) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisPeriodo(entidade, periodo);
    }

    @WebMethod(operationName = "listaFolhasSalariaisPeriodoDatas")
    public List<FolhaSalarial> listaFolhasSalariaisPeriodoDatas(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisPeriodoDatas(entidade, data1, data2);
    }

    @WebMethod(operationName = "listaFolhasSalariaisData")
    public List<FolhaSalarial> listaFolhasSalariaisData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisData(entidade, data);
    }

    @WebMethod(operationName = "listaFolhasSalariaisFuncionarioPeriodo")
    public List<FolhaSalarial> listaFolhasSalariaisFuncionarioPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "periodo") String periodo) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisFuncionarioPeriodo(entidade, funcionario, periodo);
    }

    @WebMethod(operationName = "listaFolhasSalariaisFuncionarioPeriodoDatas")
    public List<FolhaSalarial> listaFolhasSalariaisFuncionarioPeriodoDatas(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisFuncionarioPeriodoDatas(entidade, funcionario, data1, data2);
    }

    @WebMethod(operationName = "listaFolhasSalariaisFuncionarioData")
    public List<FolhaSalarial> listaFolhasSalariaisFuncionarioData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "data") String data) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisFuncionarioData(entidade, funcionario, data);
    }

    @WebMethod(operationName = "listaFolhasSalariaisFuncionario")
    public List<FolhaSalarial> listaFolhasSalariaisFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return folhaSalarialDAOImpl.listaFolhasSalariaisFuncionario(entidade, funcionario);
    }

    /**
     * ******************** END FOLHA SALARIAL*********************
     */
    /*=================== TIPO PAGAMENTO========================*/
    TipoPagamentoDAOImpl tipoPagamentoDAOImpl = new TipoPagamentoDAOImpl();
    
    @WebMethod(operationName = "persistir_tipoPagamento")
    public void persistir_tipoPagamento(@WebParam(name = "tipoPagamento") TipoPagamento tipoPagamento) {
        tipoPagamentoDAOImpl.persistir_tipoPagamento(tipoPagamento);
    }
    
    @WebMethod(operationName = "remover_tipoPagamento")
    public void remover_tipoPagamento(@WebParam(name = "tipoPagamento") TipoPagamento tipoPagamento) {
        tipoPagamentoDAOImpl.remover_tipoPagamento(tipoPagamento);
    }
    
    @WebMethod(operationName = "buscarTipoPagamentoId")
    public TipoPagamento buscarTipoPagamentoId(@WebParam(name = "id") int id) {
        return tipoPagamentoDAOImpl.getTipoPagamento(id);
    }
    
    @WebMethod(operationName = "buscarTipoPagamentoDescricao")
    public TipoPagamento buscarTipoPagamentoDescricao(@WebParam(name = "descricao") String descricao) {
        return tipoPagamentoDAOImpl.getTipoPagamento(descricao);
    }
    
    @WebMethod(operationName = "listaTiposPagamento")
    public List<TipoPagamento> listaTiposPagamento(@WebParam(name = "entidade") Entidade entidade) {
        return tipoPagamentoDAOImpl.listaTiposPagamento(entidade);
    }
    
    @WebMethod(operationName = "listaTiposPagamentoLimite")
    public List<TipoPagamento> listaTiposPagamentoLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return tipoPagamentoDAOImpl.listaTiposPagamentoLimite(entidade, limite);
    }

    /**
     * ******************** END TIPO PAGAMENTO*********************
     */
    /*=================== TIPO MOVIMENTO CHEQUE========================*/
    TipoMovimentoChequeDAOImpl tipoMovimentoChequeDAOImpl = new TipoMovimentoChequeDAOImpl();
    
    @WebMethod(operationName = "persistir_tipoMovimentoCheque")
    public void persistir_tipoMovimentoCheque(@WebParam(name = "tipoMovimentoCheque") TipoMovimentoCheque tipoMovimentoCheque) {
        tipoMovimentoChequeDAOImpl.persistir_tipoMovimentoCheque(tipoMovimentoCheque);
    }
    
    @WebMethod(operationName = "remover_tipoMovimentoCheque")
    public void remover_tipoMovimentoCheque(@WebParam(name = "tipoMovimentoCheque") TipoMovimentoCheque tipoMovimentoCheque) {
        tipoMovimentoChequeDAOImpl.remover_tipoMovimentoCheque(tipoMovimentoCheque);
    }
    
    @WebMethod(operationName = "buscarTipoMovimentoChequeId")
    public TipoMovimentoCheque buscarTipoMovimentoChequeId(@WebParam(name = "id") int id) {
        return tipoMovimentoChequeDAOImpl.getTipoMovimentoCheque(id);
    }
    
    @WebMethod(operationName = "buscarTipoMovimentoChequeDescricao")
    public TipoMovimentoCheque buscarTipoMovimentoChequeDescricao(@WebParam(name = "descricao") String descricao) {
        return tipoMovimentoChequeDAOImpl.getTipoMovimentoCheque(descricao);
    }
    
    @WebMethod(operationName = "listaTiposMovimentoCheque")
    public List<TipoMovimentoCheque> listaTiposMovimentoCheque(@WebParam(name = "entidade") Entidade entidade) {
        return tipoMovimentoChequeDAOImpl.listaTiposMovimentoCheque(entidade);
    }
    
    @WebMethod(operationName = "listaTiposMovimentoChequeLimite")
    public List<TipoMovimentoCheque> listaTiposMovimentoChequeLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return tipoMovimentoChequeDAOImpl.listaTiposMovimentoChequeLimite(entidade, limite);
    }

    /**
     * ******************** END TIPO MOVIMENTO CHEQUE *********************
     */
    /*=================== PRECO ========================*/
    PrecoDAOImpl precoDAOImpl = new PrecoDAOImpl();
    
    @WebMethod(operationName = "persistir_preco")
    public void persistir_preco(@WebParam(name = "preco") Preco preco) {
        precoDAOImpl.persistir_preco(preco);
    }
    
    @WebMethod(operationName = "remover_preco")
    public void remover_preco(@WebParam(name = "preco") Preco preco) {
        precoDAOImpl.remover_preco(preco);
    }
    
    @WebMethod(operationName = "buscarPrecoId")
    public Preco buscarPrecoId(@WebParam(name = "id") int id) {
        return precoDAOImpl.getPreco(id);
    }
    
    @WebMethod(operationName = "listaPrecos")
    public List<Preco> listaPrecos(@WebParam(name = "entidade") Entidade entidade) {
        return precoDAOImpl.listaPrecos(entidade);
    }
    
    @WebMethod(operationName = "listaPrecosLimite")
    public List<Preco> listaPrecosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return precoDAOImpl.listaPrecosLimite(entidade, limite);
    }

    /**
     * ******************** END PRECO *********************
     */
       /*=================== PERIODO SALARIAL========================*/
    PeriodoSalarialDAOImpl periodoSalarialDAOImpl = new PeriodoSalarialDAOImpl();

    @WebMethod(operationName = "persistir_periodoSalarial")
    public void persistir_periodoSalarial(@WebParam(name = "periodoSalarial") PeriodoSalarial periodoSalarial) {
        periodoSalarialDAOImpl.persistir_periodoSalarial(periodoSalarial);
    }

    @WebMethod(operationName = "remover_periodoSalarial")
    public void remover_periodoSalarial(@WebParam(name = "periodoSalarial") PeriodoSalarial periodoSalarial) {
        periodoSalarialDAOImpl.remover_periodoSalarial(periodoSalarial);
    }

    @WebMethod(operationName = "buscarPeriodoSalarialId")
    public PeriodoSalarial buscarPeriodoSalarialId(@WebParam(name = "id") int id) {
        return periodoSalarialDAOImpl.getPeriodoSalarial(id);
    }

    @WebMethod(operationName = "buscarPeriodoSalarialDescricao")
    public PeriodoSalarial buscarPeriodoSalarialDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return periodoSalarialDAOImpl.getPeriodoSalarial(entidade, descricao);
    }

    @WebMethod(operationName = "listaPeriodosSalariais")
    public List<PeriodoSalarial> listaPeriodosSalariais(@WebParam(name = "entidade") Entidade entidade) {
        return periodoSalarialDAOImpl.listaPeriodosSalariais(entidade);
    }

    @WebMethod(operationName = "listaPeriodosSalariaisLimite")
    public List<PeriodoSalarial> listaPeriodosSalariaisLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return periodoSalarialDAOImpl.listaPeriodosSalariaisLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaPeriodosSalariaisPeriodo")
    public List<PeriodoSalarial> listaPeriodosSalariaisPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "d1") String d1, @WebParam(name = "d2") String d2) {
        return periodoSalarialDAOImpl.listaPeriodosSalariaisPeriodo(entidade, d1, d2);
    }

    @WebMethod(operationName = "listaPeriodosSalariaisData")
    public List<PeriodoSalarial> listaPeriodosSalariaisData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return periodoSalarialDAOImpl.listaPeriodosSalariaisData(entidade, data);
    }

    /**
     * ******************** END PERIODO SALARIAL*********************
     */
    /*=================== MOVIMENTO========================*/
    MovimentoDAOImpl movimentoDAOImpl = new MovimentoDAOImpl();
    
    @WebMethod(operationName = "persistir_movimento")
    public void persistir_movimento(@WebParam(name = "movimento") Movimento movimento) {
        movimentoDAOImpl.persistir_movimento(movimento);
    }
    
    @WebMethod(operationName = "remover_movimento")
    public void remover_movimento(@WebParam(name = "movimento") Movimento movimento) {
        movimentoDAOImpl.remover_movimento(movimento);
    }
    
    @WebMethod(operationName = "buscarMovimentoId")
    public Movimento buscarMovimentoId(@WebParam(name = "id") int id) {
        return movimentoDAOImpl.getMovimento(id);
    }
    
    @WebMethod(operationName = "listaMovimentos")
    public List<Movimento> listaMovimentos(@WebParam(name = "entidade") Entidade entidade) {
        return movimentoDAOImpl.listaMovimentos(entidade);
    }
    
    @WebMethod(operationName = "listaMovimentosLimite")
    public List<Movimento> listaMovimentosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return movimentoDAOImpl.listaMovimentosLimite(entidade, limite);
    }
    
    @WebMethod(operationName = "listaMovimentosData")
    public List<Movimento> listaMovimentosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") String periodo) {
        return movimentoDAOImpl.listaMovimentosData(entidade, periodo);
    }
    
    @WebMethod(operationName = "listaMovimentosPeriodo")
    public List<Movimento> listaMovimentosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return movimentoDAOImpl.listaMovimentosPeriodo(entidade, data1, data2);
    }
    
    @WebMethod(operationName = "listaMovimentosBanco")
    public List<Movimento> listaMovimentosBanco(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") Banco banco) {
        return movimentoDAOImpl.listaMovimentosBanco(entidade, banco);
    }

    /**
     * ******************** END MOVIMENTO*********************
     */
    /*=================== REQUISICAO========================*/
    RequisicaoDAOImpl requisicaoDAOImpl = new RequisicaoDAOImpl();
    
    @WebMethod(operationName = "persistir_requisicao")
    public void persistir_requisicao(@WebParam(name = "requisicao") Requisicao requisicao) {
        requisicaoDAOImpl.persistir_requisicao(requisicao);
    }
    
    @WebMethod(operationName = "remover_requisicao")
    public void remover_requisicao(@WebParam(name = "requisicao") Requisicao requisicao) {
        requisicaoDAOImpl.remover_requisicao(requisicao);
    }
    
    @WebMethod(operationName = "buscarRequisicaoId")
    public Requisicao buscarRequisicaoId(@WebParam(name = "id") int id) {
        return requisicaoDAOImpl.getRequisicao(id);
    }
    
    @WebMethod(operationName = "listaRequisicoes")
    public List<Requisicao> listaRequisicoes(@WebParam(name = "entidade") Entidade entidade) {
        return requisicaoDAOImpl.listaRequisicoes(entidade);
    }
    
    @WebMethod(operationName = "listaRequisicoesLimite")
    public List<Requisicao> listaRequisicoesLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return requisicaoDAOImpl.listaRequisicoesLimite(entidade, limite);
    }
    
    @WebMethod(operationName = "listaRequisicoesData")
    public List<Requisicao> listaRequisicoesData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") String periodo) {
        return requisicaoDAOImpl.listaRequisicoesData(entidade, periodo);
    }
    
    @WebMethod(operationName = "listaRequisicoesPeriodo")
    public List<Requisicao> listaRequisicoesPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return requisicaoDAOImpl.listaRequisicoesPeriodo(entidade, data1, data2);
    }
    
    @WebMethod(operationName = "listaRequisicoesFuncionario")
    public List<Requisicao> listaRequisicoesFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") Funcionario funcionario) {
        return requisicaoDAOImpl.listaRequisicoesFuncionario(entidade, funcionario);
    }

    /**
     * ******************** END REQUISICAO*********************
     */
    /*=================== REQUISICAO CHEQUE========================*/
    RequisicaoChequeDAOImpl requisicaoChequeDAOImpl = new RequisicaoChequeDAOImpl();
    
    @WebMethod(operationName = "persistir_requisicaoCheque")
    public void persistir_requisicaoCheque(@WebParam(name = "requisicaoCheque") RequisicaoCheque requisicaoCheque) {
        requisicaoChequeDAOImpl.persistir_requisicaoCheque(requisicaoCheque);
    }
    
    @WebMethod(operationName = "remover_requisicaoCheque")
    public void remover_requisicaoCheque(@WebParam(name = "requisicaoCheque") RequisicaoCheque requisicaoCheque) {
        requisicaoChequeDAOImpl.remover_requisicaoCheque(requisicaoCheque);
    }
    
    @WebMethod(operationName = "buscarRequisicaoChequeId")
    public RequisicaoCheque buscarRequisicaoChequeId(@WebParam(name = "id") int id) {
        return requisicaoChequeDAOImpl.getRequisicaoCheque(id);
    }
    
    @WebMethod(operationName = "buscarRequisicaoCheque")
    public RequisicaoCheque buscarRequisicaoCheque(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "referencia") String referencia) {
        return requisicaoChequeDAOImpl.getRequisicaoCheque(entidade, referencia);
    }
    
    @WebMethod(operationName = "listaRequisicoesCheque")
    public List<RequisicaoCheque> listaRequisicoesCheque(@WebParam(name = "entidade") Entidade entidade) {
        return requisicaoChequeDAOImpl.listaRequisicoesCheque(entidade);
    }
    
    @WebMethod(operationName = "listaRequisicoesChequeLimite")
    public List<RequisicaoCheque> listaRequisicoesChequeLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return requisicaoChequeDAOImpl.listaRequisicoesChequeLimite(entidade, limite);
    }
    
    @WebMethod(operationName = "listaRequisicoesChequeData")
    public List<RequisicaoCheque> listaRequisicoesChequeData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") String periodo) {
        return requisicaoChequeDAOImpl.listaRequisicoesChequeData(entidade, periodo);
    }
    
    @WebMethod(operationName = "listaRequisicoesChequePeriodo")
    public List<RequisicaoCheque> listaRequisicoesChequePeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return requisicaoChequeDAOImpl.listaRequisicoesChequePeriodo(entidade, data1, data2);
    }
    
    @WebMethod(operationName = "listaRequisicoesChequeFuncionario")
    public List<RequisicaoCheque> listaRequisicoesChequeFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") Funcionario funcionario) {
        return requisicaoChequeDAOImpl.listaRequisicoesChequeFuncionario(entidade, funcionario);
    }
    
    @WebMethod(operationName = "listaRequisicoesChequeTipo")
    public List<RequisicaoCheque> listaRequisicoesChequeTipo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "tipoMovimentoCheque") TipoMovimentoCheque tipoMovimentoCheque) {
        return requisicaoChequeDAOImpl.listaRequisicoesChequeTipo(entidade, tipoMovimentoCheque);
    }

    /**
     * ******************** END REQUISICAO CHEQUE*********************
     */
    /*=================== ITEM REQUISICAO ========================*/
    ItemRequisicaoDAOImpl itemRequisicaoDAOImpl = new ItemRequisicaoDAOImpl();
    
    @WebMethod(operationName = "persistir_itemRequisicao")
    public void persistir_itemRequisicao(@WebParam(name = "itemRequisicao") ItemRequisicao itemRequisicao) {
        itemRequisicaoDAOImpl.persistir_itemRequisicao(itemRequisicao);
    }
    
    @WebMethod(operationName = "remover_itemRequisicao")
    public void remover_itemRequisicao(@WebParam(name = "itemRequisicao") ItemRequisicao itemRequisicao) {
        itemRequisicaoDAOImpl.remover_itemRequisicao(itemRequisicao);
    }
    
    @WebMethod(operationName = "buscarItemRequisicaoId")
    public ItemRequisicao buscarItemRequisicaoId(@WebParam(name = "id") int id) {
        return itemRequisicaoDAOImpl.getItemRequisicao(id);
    }
    
    @WebMethod(operationName = "listaItensRequisicoes")
    public List<ItemRequisicao> listaItensRequisicoes(@WebParam(name = "entidade") Entidade entidade) {
        return itemRequisicaoDAOImpl.listaItensRequisicoes(entidade);
    }
    
    @WebMethod(operationName = "listaItensRequisicoesLimite")
    public List<ItemRequisicao> listaItensRequisicoesLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return itemRequisicaoDAOImpl.listaItensRequisicoesLimite(entidade, limite);
    }
    
    @WebMethod(operationName = "listaItensRequisicoesRequisicao")
    public List<ItemRequisicao> listaItensRequisicoesRequisicao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "requisicao") Requisicao requisicao) {
        return itemRequisicaoDAOImpl.listaItensRequisicoesRequisicao(entidade, requisicao);
    }

    /**
     * ******************** END ITEM REQUISICAO *********************
     */
    /*=================== ITEM REQUISICAO CHEQUE ========================*/
    ItemRequisicaoChequeDAOImpl itemRequisicaoChequeDAOImpl = new ItemRequisicaoChequeDAOImpl();
    
    @WebMethod(operationName = "persistir_itemRequisicaoCheque")
    public void persistir_itemRequisicaoCheque(@WebParam(name = "itemRequisicaoCheque") ItemRequisicaoCheque itemRequisicaoCheque) {
        itemRequisicaoChequeDAOImpl.persistir_itemRequisicaoCheque(itemRequisicaoCheque);
    }
    
    @WebMethod(operationName = "remover_itemRequisicaoCheque")
    public void remover_itemRequisicaoCheque(@WebParam(name = "itemRequisicaoCheque") ItemRequisicaoCheque itemRequisicaoCheque) {
        itemRequisicaoChequeDAOImpl.remover_itemRequisicaoCheque(itemRequisicaoCheque);
    }
    
    @WebMethod(operationName = "buscarItemRequisicaoChequeId")
    public ItemRequisicaoCheque buscarItemRequisicaoChequeId(@WebParam(name = "id") int id) {
        return itemRequisicaoChequeDAOImpl.getItemRequisicaoCheque(id);
    }
    
    @WebMethod(operationName = "listaItensRequisicoesCheque")
    public List<ItemRequisicaoCheque> listaItensRequisicoesCheque(@WebParam(name = "entidade") Entidade entidade) {
        return itemRequisicaoChequeDAOImpl.listaItensRequisicoesCheque(entidade);
    }
    
    @WebMethod(operationName = "listaItensRequisicoesChequeLimite")
    public List<ItemRequisicaoCheque> listaItensRequisicoesChequeLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return itemRequisicaoChequeDAOImpl.listaItensRequisicoesChequeLimite(entidade, limite);
    }
    
    @WebMethod(operationName = "listaItensRequisicoesChequeRequisicaoCheque")
    public List<ItemRequisicaoCheque> listaItensRequisicoesChequeRequisicaoCheque(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "requisicao") RequisicaoCheque requisicao) {
        return itemRequisicaoChequeDAOImpl.listaItensRequisicoesChequeRequisicaoCheque(entidade, requisicao);
    }

    /**
     * ******************** END ITEM REQUISICAO CHEQUE *********************
     */
}
