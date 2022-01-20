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
import mz.co.centralserver.daoimpl.ispc.DespesaDAOImpl;
import mz.co.centralserver.daoimpl.ispc.TipoDespesaDAOImpl;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.ispc.Despesa;
import mz.co.centralserver.model.ispc.TipoDespesa;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "IspcWSrv")
public class IspcWSrv {

    //=========================  TIPO DESPESA ==========================
    TipoDespesaDAOImpl tipoDespesaDAOImpl = new TipoDespesaDAOImpl();

    @WebMethod(operationName = "buscaTipoDespesaId")
    public TipoDespesa buscaTipoDespesaId(@WebParam(name = "id") int id) {
        return tipoDespesaDAOImpl.getTipoDespesa(id);
    }

    @WebMethod(operationName = "buscaTipoDespesaDescricao")
    public TipoDespesa buscaTipoDespesaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return tipoDespesaDAOImpl.getTipoDespesa(entidade, descricao);
    }

    @WebMethod(operationName = "listaTipoDespesas")
    public List<TipoDespesa> listaTipoDespesas(@WebParam(name = "entidade") Entidade entidade) {
        return tipoDespesaDAOImpl.listaTipoDespesas(entidade);
    }

    @WebMethod(operationName = "listaTipoDespesasCategoria")
    public List<TipoDespesa> listaTipoDespesasCategoria(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "categoria") String categoria) {
        return tipoDespesaDAOImpl.listaTipoDespesasCategoria(entidade, categoria);
    }

    @WebMethod(operationName = "listaTipoDespesasCategoriaIntervalo")
    public List<TipoDespesa> listaTipoDespesasCategoriaIntervalo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "categoria") String categoria, @WebParam(name = "primeiro") int primeiro, @WebParam(name = "limite") int limite) {
        return tipoDespesaDAOImpl.listaTipoDespesasCategoriaIntervalo(entidade, categoria,primeiro, limite);
    }

    @WebMethod(operationName = "persistir_tipoDespesa")
    public void persistir_tipoDespesa(@WebParam(name = "tipoDespesa") TipoDespesa tipoDespesa) {
        tipoDespesaDAOImpl.persistir_tipoDespesa(tipoDespesa);
    }

    /*
     ************************** END TIPO DESPESA ***********************
     **/
    //=========================   DESPESA ==========================
    DespesaDAOImpl despesaDAOImpl = new DespesaDAOImpl();

    @WebMethod(operationName = "buscaDespesaId")
    public Despesa buscaDespesaId(@WebParam(name = "id") int id) {
        return despesaDAOImpl.getDespesa(id);
    }

    @WebMethod(operationName = "listaDespesas")
    public List<Despesa> listaDespesas(@WebParam(name = "entidade") Entidade entidade) {
        return despesaDAOImpl.listaDespesas(entidade);
    }

    @WebMethod(operationName = "listaDespesasLimit")
    public List<Despesa> listaDespesasLimit(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return despesaDAOImpl.listaDespesasLimit(entidade, limite);
    }

    @WebMethod(operationName = "listaDespesasIntervalo")
    public List<Despesa> listaDespesasIntervalo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "primeiro") int primeiro, @WebParam(name = "limite") int limite) {
        return despesaDAOImpl.listaDespesasIntervalo(entidade, primeiro, limite);
    }

    @WebMethod(operationName = "listaDespesasPeriodo")
    public List<Despesa> listaDespesasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return despesaDAOImpl.listaDespesasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaDespesasData")
    public List<Despesa> listaDespesasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return despesaDAOImpl.listaDespesasData(entidade, data);
    }

    @WebMethod(operationName = "listaDespesasStatus")
    public List<Despesa> listaDespesasStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status) {
        return despesaDAOImpl.listaDespesasStatus(entidade, status);
    }

    @WebMethod(operationName = "listaDespesasUsuario")
    public List<Despesa> listaDespesasUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return despesaDAOImpl.listaDespesasUsuario(entidade, id);
    }

    @WebMethod(operationName = "listaDespesasNuit")
    public List<Despesa> listaDespesasNuit(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "nuit") long nuit) {
        return despesaDAOImpl.listaDespesasNuit(entidade, nuit);
    }

    @WebMethod(operationName = "listaDespesasTipoDespesa")
    public List<Despesa> listaDespesasTipoDespesa(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return despesaDAOImpl.listaDespesasTipoDespesa(entidade, id);
    }

    @WebMethod(operationName = "persistir_despesa")
    public void persistir_despesa(@WebParam(name = "despesa") Despesa despesa) {
        despesaDAOImpl.persistir_despesa(despesa);
    }

    @WebMethod(operationName = "remover_despesa")
    public void remover_despesa(@WebParam(name = "despesa") Despesa despesa) {
        despesaDAOImpl.remover_despesa(despesa);
    }

    /*
     ************************** END  DESPESA ***********************
     **/
    
    
    //=========================  TIPO DESPESA ==========================


    @WebMethod(operationName = "buscaTipoDespesaReferencia")
    public TipoDespesa buscaTipoDespesaReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return tipoDespesaDAOImpl.getTipoDespesaReferenica(entidade, descricao);
    }


    @WebMethod(operationName = "listaTipoDespesasPeriodo")
    public List<TipoDespesa> listaTipoDespesasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "periodo") String periodo) {
        return tipoDespesaDAOImpl.listaTipoDespesasPeriodo(entidade, periodo);
    }

    @WebMethod(operationName = "remover_tipoDespesa")
    public void remover_tipoDespesa(@WebParam(name = "tipoDespesa") TipoDespesa tipoDespesa) {
        tipoDespesaDAOImpl.remover_tipoDespesa(tipoDespesa);
    }

    /*
     ************************** END TIPO DESPESA ***********************
     **/

}
