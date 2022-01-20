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
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.vendas.Produto;
import mz.co.centralserver.model.vendas.ProdutoVendido;

/**
 *
 * @author HJC2K8
 */
public class ProdutoVendidoDAOImpl {

    private DAOGenerico daog;

    public ProdutoVendidoDAOImpl() {

        daog = new DAOGenerico(ProdutoVendido.class);
    }

    public ProdutoVendido getProdutoVendido(int id) {
        return (ProdutoVendido) daog.buscarEntidadePorQuery("from ProdutoVendido  where prv_id = " + id);
    }

    public List<ProdutoVendido> listaProdutosVendidos(Entidade entidade) {
        return daog.buscarPorConsulta("from ProdutoVendido where entidade_enti_id = " + entidade.getEnti_id() + " order by prv_id desc");
    }

    public List<ProdutoVendido> listaProdutoVendidoFactura(Entidade entidade, Factura factura) {
        return daog.buscarPorConsulta("from ProdutoVendido where factura_fact_id = " + factura.getFact_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by prv_id desc");
    }

    public List<ProdutoVendido> listaProdutoVendidoProduto(Entidade entidade, Produto produto) {
        return daog.buscarPorConsulta("from ProdutoVendido where produto_pro_id = " + produto.getPro_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by prv_id desc");
    }

    public List<ProdutoVendido> listaProdutoVendidoFacturaProduto(Entidade entidade, Produto produto, Factura factura) {
        return daog.buscarPorConsulta("from ProdutoVendido where produto_pro_id = " + produto.getPro_id() + " AND factura_fact_id = " + factura.getFact_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by prv_id desc");
    }

    public List<ProdutoVendido> listaProdutoVendidoPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from ProdutoVendido where prv_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by prv_id desc");
    }

    public void persistir_produtoVendido(ProdutoVendido produtoVendido) {
        daog = new DAOGenerico(produtoVendido);
        daog.inserir_actualizar();
    }

    public void remover_produtoVendido(ProdutoVendido produtoVendido) {
        daog = new DAOGenerico(produtoVendido);
        daog.excluir();
    }

}
