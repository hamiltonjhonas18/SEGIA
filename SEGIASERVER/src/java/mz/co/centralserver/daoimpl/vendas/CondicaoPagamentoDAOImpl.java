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
import mz.co.centralserver.model.vendas.CondicaoPagamento;

/**
 *
 * @author HJC2K8
 */
public class CondicaoPagamentoDAOImpl {

    private DAOGenerico daog;

    public CondicaoPagamentoDAOImpl() {

        daog = new DAOGenerico(CondicaoPagamento.class);
    }

    public CondicaoPagamento getCondicaoPagamento(int id) {
        return (CondicaoPagamento) daog.buscarEntidadePorQuery("from CondicaoPagamento where conp_id = " + id);
    }

    public CondicaoPagamento getCondicaoPagamento(Entidade entidade, String descricao) {
        return (CondicaoPagamento) daog.buscarEntidadePorQuery("from CondicaoPagamento where conp_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<CondicaoPagamento> listaCondicoesPagamento(Entidade entidade) {
        return daog.buscarPorConsulta("from CondicaoPagamento where entidade_enti_id = " + entidade.getEnti_id() + " order by conp_id desc");
    }

    public void persistir_condicaoPagamento(CondicaoPagamento condicaoPagamento) {
        daog = new DAOGenerico(condicaoPagamento);
        daog.inserir_actualizar();

    }

    public void remover_condicaoPagamento(CondicaoPagamento condicaoPagamento) {
        daog = new DAOGenerico(condicaoPagamento);
        daog.excluir();

    }
}
