/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.contrato;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.contrato.Contrato;
import mz.co.centralserver.model.contrato.RequisicaoFundo;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class RequisicaoFundoDAOImpl {

    private DAOGenerico daog;

    public RequisicaoFundoDAOImpl() {

        daog = new DAOGenerico(RequisicaoFundo.class);
    }

    public RequisicaoFundo getRequisicaoFundo(int id) {
        return (RequisicaoFundo) daog.buscarEntidadePorQuery("from RequisicaoFundo where reqf_id = " + id);
    }

    public RequisicaoFundo getRequisicaoFundo(Entidade entidade, String descricao) {
        return (RequisicaoFundo) daog.buscarEntidadePorQuery("from RequisicaoFundo where reqf_referencia LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<RequisicaoFundo> listaRequisicaoFundos(Entidade entidade) {
        return daog.buscarPorConsulta("from RequisicaoFundo where entidade_enti_id  = " + entidade.getEnti_id() + " order by reqf_id desc");
    }

    public List<RequisicaoFundo> listaRequisicaoFundosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from RequisicaoFundo where entidade_enti_id  = " + entidade.getEnti_id() + " order by reqf_id desc", limite);
    }

    public List<RequisicaoFundo> listaRequisicaoFundosStatus(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from RequisicaoFundo where entidade_enti_id  = " + entidade.getEnti_id() + " AND reqf_status LIKE '" + status + "' order by reqf_id desc");
    }

    public List<RequisicaoFundo> listaRequisicaoFundosStatusLimite(Entidade entidade, String status, int limite) {
        return daog.buscarPorConsultaLimite("from RequisicaoFundo where entidade_enti_id  = " + entidade.getEnti_id() + " AND reqf_status LIKE '" + status + "' order by reqf_id desc", limite);
    }

    public List<RequisicaoFundo> listaRequisicaoFundosNaoJustificada(Entidade entidade) {
        return daog.buscarPorConsulta("from RequisicaoFundo where  entidade_enti_id  = " + entidade.getEnti_id() + " AND reqf_dataJustificativo = NULL AND reqf_status LIKE 'QUdVQVJEQVIgUEVMTyBKVVNUSUZJQ0FUSVZP' order by reqf_id desc");
    }

    public List<RequisicaoFundo> listaRequisicaoFundosContrato(Entidade entidade, Contrato contrato) {
        return daog.buscarPorConsulta("from RequisicaoFundo where contrato_cont_id = " + contrato.getCont_id() + " AND entidade_enti_id  = " + entidade.getEnti_id() + " order by reqf_id desc");
    }

    public List<RequisicaoFundo> listaRequisicaoFundosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from RequisicaoFundo where reqf_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by reqf_id desc");
    }

    public List<RequisicaoFundo> listaRequisicaoFundosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from RequisicaoFundo where reqf_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by reqf_id desc");
    }

    public void persistir_requisicaoFundo(RequisicaoFundo requisicaoFundo) {
        daog = new DAOGenerico(requisicaoFundo);
        daog.inserir_actualizar();

    }

    public void remover_requisicaoFundo(RequisicaoFundo requisicaoFundo) {
        daog = new DAOGenerico(requisicaoFundo);
        daog.excluir();

    }
}
