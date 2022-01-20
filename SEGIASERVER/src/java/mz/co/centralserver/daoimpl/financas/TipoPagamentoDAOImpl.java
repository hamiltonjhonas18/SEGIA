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
import mz.co.centralserver.model.financas.TipoPagamento;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TipoPagamentoDAOImpl {

    private DAOGenerico daog;

    public TipoPagamentoDAOImpl() {

        daog = new DAOGenerico(TipoPagamento.class);
    }

    public TipoPagamento getTipoPagamento(int id) {
        return (TipoPagamento) daog.buscarEntidadePorQuery("from TipoPagamento where tipa_id =" + id);
    }

    public TipoPagamento getTipoPagamento(String descricao) {
        return (TipoPagamento) daog.buscarEntidadePorQuery("from TipoPagamento where tipa_descricao LIKE '" + descricao + "'");
    }

    public List<TipoPagamento> listaTiposPagamento(Entidade entidade) {
        return daog.buscarPorConsulta("from TipoPagamento where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<TipoPagamento> listaTiposPagamentoLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from TipoPagamento where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public void persistir_tipoPagamento(TipoPagamento tipoPagamento) {
        daog = new DAOGenerico(tipoPagamento);
        daog.inserir_actualizar();
    }

    public void remover_tipoPagamento(TipoPagamento tipoPagamento) {
        daog = new DAOGenerico(tipoPagamento);
        daog.excluir();
    }
}
