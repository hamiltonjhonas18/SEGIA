/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.contabilistico;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.contabilistico.PlanoDeConta;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class PlanoDeContaDAOImpl {

    private DAOGenerico daog;

    public PlanoDeContaDAOImpl() {
        daog = new DAOGenerico(PlanoDeConta.class);
    }

    public PlanoDeConta getPlanoDeConta(int id) {
        return (PlanoDeConta) daog.buscarEntidadePorQuery("from PlanoDeConta where pdc_id = " + id);
    }

    public PlanoDeConta getPlanoDeConta(Entidade entidade, String descricao) {
        return (PlanoDeConta) daog.buscarEntidadePorQuery("from PlanoDeConta where entidade_enti_id = " + entidade.getEnti_id() + " AND pdc_descricao LIKE '" + descricao + "'");
    }

    public PlanoDeConta getPlanoDeContaCodigo(Entidade entidade, String codigo) {
        return (PlanoDeConta) daog.buscarEntidadePorQuery("from PlanoDeConta where entidade_enti_id = " + entidade.getEnti_id() + " AND  pdc_codigo LIKE '" + codigo + "'");
    }

    public List<PlanoDeConta> listaPlanosDeConta(Entidade entidade) {
        return daog.buscarPorConsulta("from PlanoDeConta where entidade_enti_id = " + entidade.getEnti_id() + " order by pdc_id asc");
    }

    public List<PlanoDeConta> listaPlanosDeContaAssociados(Entidade entidade, PlanoDeConta planoDeConta) {
        return daog.buscarPorConsulta("from PlanoDeConta where entidade_enti_id = " + entidade.getEnti_id() + " AND planoDeConta_pdc_id = " + planoDeConta.getPdc_id() + " order by  pdc_id asc");
    }

    public void persistir_planoDeConta(PlanoDeConta planoDeConta) {
        daog = new DAOGenerico(planoDeConta);
        daog.inserir_actualizar();
    }

    public void remover_planoDeConta(PlanoDeConta planoDeConta) {
        daog = new DAOGenerico(planoDeConta);
        daog.excluir();
    }
}
