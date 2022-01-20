/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.vendas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;
import mz.co.centralserver.model.vendas.RequisicaoMaterial;

/**
 *
 * @author HJC2K8
 */
public class RequisicaoMaterialDAOImpl {

    private DAOGenerico daog;

    public RequisicaoMaterialDAOImpl() {
        daog = new DAOGenerico(RequisicaoMaterial.class);
    }

    public RequisicaoMaterial getRequisicaoMaterial(int id) {
        return (RequisicaoMaterial) daog.buscarEntidadePorQuery("from RequisicaoMaterial where reqm_id = " + id);
    }

    public RequisicaoMaterial getRequisicaoMaterial(Entidade entidade, String descricao) {
        return (RequisicaoMaterial) daog.buscarEntidadePorQuery("from RequisicaoMaterial where reqm_referencia LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<RequisicaoMaterial> listaRequisicoesMaterial(Entidade entidade) {
        return daog.buscarPorConsulta("from RequisicaoMaterial where entidade_enti_id = " + entidade.getEnti_id() + " order by reqm_id desc");
    }

    public List<RequisicaoMaterial> listaRequisicoesMaterialEstado(Entidade entidade, String estado) {
        return daog.buscarPorConsulta("from RequisicaoMaterial where reqm_estado LIKE '" + estado + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by reqm_id desc");
    }

    public List<RequisicaoMaterial> listaRequisicoesMaterialPessoa(Entidade entidade, Pessoa pessoa) {
        return daog.buscarPorConsulta("from RequisicaoMaterial where pessoa_pess_id = " + pessoa.getPess_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by reqm_id desc");
    }

    public List<RequisicaoMaterial> listaRequisicoesMaterialPessoaPeriodo(Entidade entidade, String p1, String p2, Pessoa pessoa) {
        return daog.buscarPorConsulta("from RequisicaoMaterial where reqm_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " AND pessoa_pess_id = " + pessoa.getPess_id() + " order by reqm_id desc");
    }

    public List<RequisicaoMaterial> listaRequisicoesMaterialPessoaData(Entidade entidade, String data, Pessoa pessoa) {
        return daog.buscarPorConsulta("from RequisicaoMaterial where reqm_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " AND pessoa_pess_id = " + pessoa.getPess_id() + " order by reqm_id desc");
    }

    public List<RequisicaoMaterial> listaRequisicoesMaterialPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from RequisicaoMaterial where reqm_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by reqm_id desc");
    }

    public List<RequisicaoMaterial> listaRequisicoesMaterialData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from RequisicaoMaterial where reqm_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by reqm_id desc");
    }

    public void persistir_requisicaoMaterial(RequisicaoMaterial requisicaoMaterial) {
        daog = new DAOGenerico(requisicaoMaterial);
        daog.inserir_actualizar();
    }

    public void remover_requisicaoMaterial(RequisicaoMaterial requisicaoMaterial) {
        daog = new DAOGenerico(requisicaoMaterial);
        daog.excluir();
    }
}
