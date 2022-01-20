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
import mz.co.centralserver.model.financas.RequisicaoCheque;
import mz.co.centralserver.model.financas.ItemRequisicaoCheque;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ItemRequisicaoChequeDAOImpl {

    private DAOGenerico daog;

    public ItemRequisicaoChequeDAOImpl() {

        daog = new DAOGenerico(ItemRequisicaoCheque.class);
    }

    public ItemRequisicaoCheque getItemRequisicaoCheque(int id) {
        return (ItemRequisicaoCheque) daog.buscarEntidadePorQuery("from ItemRequisicaoCheque where irc_id =" + id);
    }

    public List<ItemRequisicaoCheque> listaItensRequisicoesCheque(Entidade entidade) {
        return daog.buscarPorConsulta("from ItemRequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<ItemRequisicaoCheque> listaItensRequisicoesChequeLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from ItemRequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public List<ItemRequisicaoCheque> listaItensRequisicoesChequeRequisicaoCheque(Entidade entidade, RequisicaoCheque requisicaoCheque) {
        return daog.buscarPorConsulta("from ItemRequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id() + " AND requisicaoCheque_rqc_id=" + requisicaoCheque.getRqc_id());
    }

    public void persistir_itemRequisicaoCheque(ItemRequisicaoCheque itemRequisicaoCheque) {
        daog = new DAOGenerico(itemRequisicaoCheque);
        daog.inserir_actualizar();
    }

    public void remover_itemRequisicaoCheque(ItemRequisicaoCheque itemRequisicaoCheque) {
        daog = new DAOGenerico(itemRequisicaoCheque);
        daog.excluir();
    }
}
