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
import mz.co.centralserver.model.vendas.ItemPedido;

/**
 *
 * @author HJC2K8
 */
public class ItemPedidoDAOImpl {

    private DAOGenerico daog;

    public ItemPedidoDAOImpl() {
        daog = new DAOGenerico(ItemPedido.class);
    }

    public ItemPedido getItemPedido(int id) {
        return (ItemPedido) daog.buscarEntidadePorQuery("from ItemPedido where itp_id = " + id);
    }

    public List<ItemPedido> listaItensPedidos(Entidade entidade) {
        return daog.buscarPorConsulta("from ItemPedido where entidade_enti_id = "+ entidade.getEnti_id() + " order by itp_id desc");
    }

    public List<ItemPedido> listaItensPedidosFactura(long id) {
        return daog.buscarPorConsulta("from ItemPedido where itp_referenciaFactura = "+ id + " order by itp_id asc");
    }

    public List<ItemPedido> listaItensPedidosGuiaRemessa(String id) {
        return daog.buscarPorConsulta("from ItemPedido where itp_referenciaGuia LIKE '"+ id + "' order by itp_id desc");
    }
    
     public List<ItemPedido> listaItensPedidosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from ItemPedido where itp_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by itp_id desc");
    }
    
     public List<ItemPedido> listaItensPedidosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from ItemPedido where itp_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by itp_id desc");
    }


    public void persistir_itemPedido(ItemPedido itemPedido) {
        daog = new DAOGenerico(itemPedido);
        daog.inserir_actualizar();
    }


    public void remover_itemPedido(ItemPedido itemPedido) {
        daog = new DAOGenerico(itemPedido);
        daog.excluir();
    }
}
