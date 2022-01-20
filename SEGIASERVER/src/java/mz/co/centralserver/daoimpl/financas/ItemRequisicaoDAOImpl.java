/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.financas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.financas.Requisicao;
import mz.co.centralserver.model.financas.ItemRequisicao;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ItemRequisicaoDAOImpl {

    private DAOGenerico daog;

    public ItemRequisicaoDAOImpl() {

        daog = new DAOGenerico(ItemRequisicao.class);
    }

    public ItemRequisicao getItemRequisicao(int id) {
        return (ItemRequisicao) daog.buscarEntidadePorQuery("from ItemRequisicao where itr_id =" + id);
    }

    public List<ItemRequisicao> listaItensRequisicoes(Entidade entidade) {
        return daog.buscarPorConsulta("from ItemRequisicao where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<ItemRequisicao> listaItensRequisicoesLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from ItemRequisicao where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public List<ItemRequisicao> listaItensRequisicoesRequisicao(Entidade entidade, Requisicao requisicao) {
        return daog.buscarPorConsulta("from ItemRequisicao where entidade_enti_id =" + entidade.getEnti_id() + " AND requisicao_req_id=" + requisicao.getReq_id());
    }

    public void persistir_itemRequisicao(ItemRequisicao itemRequisicao) {
        daog = new DAOGenerico(itemRequisicao);
        daog.inserir_actualizar();
    }

    public void remover_itemRequisicao(ItemRequisicao itemRequisicao) {
        daog = new DAOGenerico(itemRequisicao);
        daog.excluir();
    }
}
