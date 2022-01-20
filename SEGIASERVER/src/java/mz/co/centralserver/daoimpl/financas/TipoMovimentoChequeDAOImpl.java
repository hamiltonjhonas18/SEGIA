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
import mz.co.centralserver.model.financas.TipoMovimentoCheque;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TipoMovimentoChequeDAOImpl {

    private DAOGenerico daog;

    public TipoMovimentoChequeDAOImpl() {

        daog = new DAOGenerico(TipoMovimentoCheque.class);
    }

    public TipoMovimentoCheque getTipoMovimentoCheque(int id) {
        return (TipoMovimentoCheque) daog.buscarEntidadePorQuery("from TipoMovimentoCheque where tmc_id =" + id);
    }

    public TipoMovimentoCheque getTipoMovimentoCheque(String descricao) {
        return (TipoMovimentoCheque) daog.buscarEntidadePorQuery("from TipoMovimentoCheque where tmc_descricao LIKE '" + descricao + "'");
    }

    public List<TipoMovimentoCheque> listaTiposMovimentoCheque(Entidade entidade) {
        return daog.buscarPorConsulta("from TipoMovimentoCheque where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<TipoMovimentoCheque> listaTiposMovimentoChequeLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from TipoMovimentoCheque where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public void persistir_tipoMovimentoCheque(TipoMovimentoCheque tipoMovimentoCheque) {
        daog = new DAOGenerico(tipoMovimentoCheque);
        daog.inserir_actualizar();
    }

    public void remover_tipoMovimentoCheque(TipoMovimentoCheque tipoMovimentoCheque) {
        daog = new DAOGenerico(tipoMovimentoCheque);
        daog.excluir();
    }
}
