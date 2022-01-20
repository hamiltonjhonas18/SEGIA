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
import mz.co.centralserver.daoimpl.contrato.AdendaDAOImpl;
import mz.co.centralserver.daoimpl.contrato.ContratoDAOImpl;
import mz.co.centralserver.daoimpl.contrato.RequisicaoFundoDAOImpl;
import mz.co.centralserver.model.contrato.Adenda;
import mz.co.centralserver.model.contrato.Contrato;
import mz.co.centralserver.model.contrato.RequisicaoFundo;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author hamil
 */
@WebService(serviceName = "ContratoWSrv")
public class ContratoWSrv {

    //=========================  CONTRATOS ==========================
    ContratoDAOImpl contratoDAOImpl = new ContratoDAOImpl();

    @WebMethod(operationName = "buscaContratoId")
    public Contrato buscaContratoId(@WebParam(name = "id") int id) {
        return contratoDAOImpl.getContrato(id);
    }

    @WebMethod(operationName = "buscaContratoReferencia")
    public Contrato buscaContratoReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return contratoDAOImpl.getContrato(entidade, descricao);
    }

    @WebMethod(operationName = "buscaContratoReferenciaReal")
    public Contrato buscaContratoReferenciaReal(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "referencia") String referencia) {
        return contratoDAOImpl.getContratoReferenciaReal(entidade, referencia);
    }

    @WebMethod(operationName = "listaContratos")
    public List<Contrato> listaContratos(@WebParam(name = "entidade") Entidade entidade) {
        return contratoDAOImpl.listaContratos(entidade);
    }

    @WebMethod(operationName = "listaContratosLimite")
    public List<Contrato> listaContratosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return contratoDAOImpl.listaContratosLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaContratosPeriodo")
    public List<Contrato> listaContratosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return contratoDAOImpl.listaContratosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaContratosData")
    public List<Contrato> listaContratosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return contratoDAOImpl.listaContratosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_contrato")
    public void persistir_contrato(@WebParam(name = "contrato") Contrato contrato) {
        contratoDAOImpl.persistir_contrato(contrato);
    }

    @WebMethod(operationName = "remover_contrato")
    public void remover_contrato(@WebParam(name = "contrato") Contrato contrato) {
        contratoDAOImpl.remover_contrato(contrato);
    }

    /*
     ************************** END CONTRATOS ***********************
     **/
    //=========================  ADENDA ==========================
    AdendaDAOImpl adendaDAOImpl = new AdendaDAOImpl();

    @WebMethod(operationName = "buscaAdendaId")
    public Adenda buscaAdendaId(@WebParam(name = "id") int id) {
        return adendaDAOImpl.getAdenda(id);
    }

    @WebMethod(operationName = "buscaAdendaReferencia")
    public Adenda buscaAdendaReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return adendaDAOImpl.getAdenda(entidade, descricao);
    }

    @WebMethod(operationName = "listaAdendas")
    public List<Adenda> listaAdendas(@WebParam(name = "entidade") Entidade entidade) {
        return adendaDAOImpl.listaAdendas(entidade);
    }

    @WebMethod(operationName = "listaAdendasContrato")
    public List<Adenda> listaAdendasContrato(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "contrato") Contrato contrato) {
        return adendaDAOImpl.listaAdendasContrato(entidade, contrato);
    }

    @WebMethod(operationName = "listaAdendasPeriodo")
    public List<Adenda> listaAdendasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return adendaDAOImpl.listaAdendasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaAdendasData")
    public List<Adenda> listaAdendasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return adendaDAOImpl.listaAdendasData(entidade, data);
    }

    @WebMethod(operationName = "persistir_adenda")
    public void persistir_adenda(@WebParam(name = "adenda") Adenda adenda) {
        adendaDAOImpl.persistir_adenda(adenda);
    }

    @WebMethod(operationName = "remover_adenda")
    public void remover_adenda(@WebParam(name = "adenda") Adenda adenda) {
        adendaDAOImpl.remover_adenda(adenda);
    }

    /*
     ************************** END ADENDA ***********************
     **/
    //=========================  REQUISICAO DE FUNDOS ==========================
    RequisicaoFundoDAOImpl requisicaoFundoDAOImpl = new RequisicaoFundoDAOImpl();

    @WebMethod(operationName = "buscaRequisicaoFundoId")
    public RequisicaoFundo buscaRequisicaoFundoId(@WebParam(name = "id") int id) {
        return requisicaoFundoDAOImpl.getRequisicaoFundo(id);
    }

    @WebMethod(operationName = "buscaRequisicaoFundoReferencia")
    public RequisicaoFundo buscaRequisicaoFundoReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return requisicaoFundoDAOImpl.getRequisicaoFundo(entidade, descricao);
    }

    @WebMethod(operationName = "listaRequisicaoFundos")
    public List<RequisicaoFundo> listaRequisicaoFundos(@WebParam(name = "entidade") Entidade entidade) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundos(entidade);
    }

    @WebMethod(operationName = "listaRequisicaoFundosStatus")
    public List<RequisicaoFundo> listaRequisicaoFundosStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundosStatus(entidade, status);
    }

    @WebMethod(operationName = "listaRequisicaoFundosLimite")
    public List<RequisicaoFundo> listaRequisicaoFundosLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundosLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaRequisicaoFundosStatusLimite")
    public List<RequisicaoFundo> listaRequisicaoFundosStatusLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status, @WebParam(name = "limite") int limite) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundosStatusLimite(entidade, status, limite);
    }

    @WebMethod(operationName = "listaRequisicaoFundosNaoJustificada")
    public List<RequisicaoFundo> listaRequisicaoFundosNaoJustificada(@WebParam(name = "entidade") Entidade entidade) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundosNaoJustificada(entidade);
    }

    @WebMethod(operationName = "listaRequisicaoFundosContrato")
    public List<RequisicaoFundo> listaRequisicaoFundosContrato(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "contrato") Contrato contrato) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundosContrato(entidade, contrato);
    }

    @WebMethod(operationName = "listaRequisicaoFundosPeriodo")
    public List<RequisicaoFundo> listaRequisicaoFundosPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundosPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaRequisicaoFundosData")
    public List<RequisicaoFundo> listaRequisicaoFundosData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return requisicaoFundoDAOImpl.listaRequisicaoFundosData(entidade, data);
    }

    @WebMethod(operationName = "persistir_requisicaoFundo")
    public void persistir_requisicaoFundo(@WebParam(name = "requisicaoFundo") RequisicaoFundo requisicaoFundo) {
        requisicaoFundoDAOImpl.persistir_requisicaoFundo(requisicaoFundo);
    }

    @WebMethod(operationName = "remover_requisicaoFundo")
    public void remover_requisicaoFundo(@WebParam(name = "requisicaoFundo") RequisicaoFundo requisicaoFundo) {
        requisicaoFundoDAOImpl.remover_requisicaoFundo(requisicaoFundo);
    }

    /*
     ************************** END REQUISICAO DE FUNDOS ***********************
     **/
}
