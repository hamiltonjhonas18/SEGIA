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
import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.vendas.Venda;

/**
 *
 * @author HJC2K8
 */
public class VendaDAOImpl {

    private DAOGenerico daog;

    public VendaDAOImpl() {
        daog = new DAOGenerico(Venda.class);
    }

    public Venda getVenda(int id) {
        return (Venda) daog.buscarEntidadePorQuery("from Venda where vend_id = " + id);
    }

    public Venda getVenda(Entidade entidade, String descricao) {
        return (Venda) daog.buscarEntidadePorQuery("from Venda where vend_referencia LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Venda> listaVendas(Entidade entidade) {
        return daog.buscarPorConsulta("from Venda where entidade_enti_id = " + entidade.getEnti_id() + " order by vend_id desc");
    }

    public List<Venda> listaVendasEstado(Entidade entidade, String estado) {
        return daog.buscarPorConsulta("from Venda where vend_estado LIKE '" + estado + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by vend_id desc");
    }

    public List<Venda> listaVendasCliente(Entidade entidade, Cliente cliente) {
        return daog.buscarPorConsulta("from Venda where cliente_clie_id = " + cliente.getClie_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by vend_id desc");
    }

    public List<Venda> listaVendasPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Venda where vend_dataVenda BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by vend_id desc");
    }

    public List<Venda> listaVendasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Venda where vend_dataVenda LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by vend_id desc");
    }

    public void persistir_venda(Venda venda) {
        daog = new DAOGenerico(venda);
        daog.inserir_actualizar();
    }

    public void remover_venda(Venda venda) {
        daog = new DAOGenerico(venda);
        daog.excluir();
    }
}
