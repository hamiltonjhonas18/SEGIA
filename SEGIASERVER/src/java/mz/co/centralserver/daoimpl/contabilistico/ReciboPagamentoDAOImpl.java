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
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.contabilistico.ReciboPagamento;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
public class ReciboPagamentoDAOImpl {

    private DAOGenerico daog;

    public ReciboPagamentoDAOImpl() {

        daog = new DAOGenerico(ReciboPagamento.class);
    }

    public ReciboPagamento getReciboPagamento(int id) {
        return (ReciboPagamento) daog.buscarEntidadePorQuery("from ReciboPagamento where recp_id = " + id);
    }

    public ReciboPagamento getReciboPagamento(Entidade entidade, String referencia) {
        return (ReciboPagamento) daog.buscarEntidadePorQuery("from ReciboPagamento where recp_referencia LIKE '" + referencia + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<ReciboPagamento> listaRecibosPagamentos(Entidade entidade) {
        return daog.buscarPorConsulta("from ReciboPagamento where entidade_enti_id  = " + entidade.getEnti_id() + " order by recp_id desc");
    }

    public List<ReciboPagamento> listaRecibosPagamentosPessoa(Entidade entidade, Pessoa pessoa) {
        return daog.buscarPorConsulta("from ReciboPagamento where pessoa_pess_id = " + pessoa.getPess_id() + " AND entidade_enti_id  = " + entidade.getEnti_id() + " order by recp_id desc");
    }

    public List<ReciboPagamento> listaRecibosPagamentosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from ReciboPagamento where recp_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by recp_id desc");
    }

    public List<ReciboPagamento> listaRecibosPagamentosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from ReciboPagamento where recp_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by recp_id desc");
    }

    public void persistir_reciboPagamento(ReciboPagamento reciboPagamento) {
        daog = new DAOGenerico(reciboPagamento);
        daog.inserir_actualizar();

    }

    public void remover_reciboPagamento(ReciboPagamento reciboPagamento) {
        daog = new DAOGenerico(reciboPagamento);
        daog.excluir();

    }
}
