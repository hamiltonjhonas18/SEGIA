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
import mz.co.centralserver.model.vendas.MeioPagamento;

/**
 *
 * @author HJC2K8
 */
public class MeioPagamentoDAOImpl {

    private DAOGenerico daog;

    public MeioPagamentoDAOImpl() {
        daog = new DAOGenerico(MeioPagamento.class);
    }

    public MeioPagamento getMeioPagamento(int id) {
        return (MeioPagamento) daog.buscarEntidadePorQuery("from MeioPagamento where meio_id = " + id);
    }

    public MeioPagamento getMeioPagamento(Entidade entidade, String descricao) {
        return (MeioPagamento) daog.buscarEntidadePorQuery("from MeioPagamento where meio_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<MeioPagamento> listaMeiosPagamento(Entidade entidade) {
        return daog.buscarPorConsulta("from MeioPagamento where entidade_enti_id = " + entidade.getEnti_id() + " order by meio_id asc");
    }

    public void persistir_meioPagamento(MeioPagamento meioPagamento) {
        daog = new DAOGenerico(meioPagamento);
        daog.inserir_actualizar();
    }

    public void remover_meioPagamento(MeioPagamento meioPagamento) {
        daog = new DAOGenerico(meioPagamento);
        daog.excluir();
    }
}
