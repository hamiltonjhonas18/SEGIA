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
import mz.co.centralserver.model.vendas.CategoriaProduto;
import mz.co.centralserver.model.vendas.Fornecedor;
import mz.co.centralserver.model.vendas.Produto;

/**
 *
 * @author HJC2K8
 */
public class ProdutoDAOImpl {

    private DAOGenerico daog;

    public ProdutoDAOImpl() {

        daog = new DAOGenerico(Produto.class);
    }

    public Produto getProduto(int id) {
        return (Produto) daog.buscarEntidadePorQuery("from Produto where pro_id = " + id);
    }

    public Produto getProduto(Entidade entidade, String descricao) {
        return (Produto) daog.buscarEntidadePorQuery("from Produto where pro_nome LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Produto getProdutoCodigoBarras(Entidade entidade, String codigo_barras) {
        return (Produto) daog.buscarEntidadePorQuery("from Produto where pro_codigo_barras LIKE '" + codigo_barras + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }


    public Produto getProdutoReferencia(Entidade entidade, String referencia) {
        return (Produto) daog.buscarEntidadePorQuery("from Produto where pro_codigo LIKE '" + referencia + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Produto> listaProdutos(Entidade entidade) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " order by pro_id desc");
    }

    public List<Produto> listaProdutosPorExpirar(Entidade entidade) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " order by pro_dataValidade asc");
    }

    public List<Produto> listaProdutosExpirados(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND pro_dataValidade < " + data + " order by pro_dataValidade asc");
    }

    public List<Produto> listaProdutosEmStock(Entidade entidade) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND pro_estoque > 0 order by pro_id desc");
    }

    public List<Produto> listaProdutosSemStock(Entidade entidade) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND pro_estoque = 0 order by pro_id desc");
    }

    public List<Produto> listaProdutosEmAlerta(Entidade entidade) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND pro_estoque = pro_margemAlarme order by pro_id desc");
    }

    public List<Produto> listaProdutosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " order by pro_id desc", limite);
    }

    public List<Produto> listaProdutosIntervalo(Entidade entidade, int primeiro, int limite) {
        return daog.buscarPorConsultaIntervalo("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " order by pro_id desc", primeiro, limite);
    }

    public List<Produto> listaProdutosEmStockIntervalo(Entidade entidade, int primeiro, int limite) {
        return daog.buscarPorConsultaIntervalo("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND pro_estoque >  order by pro_id desc", primeiro, limite);
    }

    public List<Produto> listaProdutosSemStockIntervalo(Entidade entidade, int primeiro, int limite) {
        return daog.buscarPorConsultaIntervalo("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND pro_estoque = 0  order by pro_id desc", primeiro, limite);
    }

    public List<Produto> listaProdutosEmAlertaIntervalo(Entidade entidade, int primeiro, int limite) {
        return daog.buscarPorConsultaIntervalo("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND pro_estoque = pro_margemAlarme  order by pro_id desc", primeiro, limite);
    }

    public List<Produto> listaProdutosFornecedor(Entidade entidade, Fornecedor fornecedor) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND fornecedor_for_id = " + fornecedor.getFor_id() + " order by pro_id desc");
    }

    public List<Produto> listaProdutosCategoriaProduto(Entidade entidade, CategoriaProduto categoriaProduto) {
        return daog.buscarPorConsulta("from Produto where entidade_enti_id = " + entidade.getEnti_id() + " AND categoriaProduto_catp_id = " + categoriaProduto.getCatp_id() + " order by pro_id desc");
    }

    public void persistir_produto(Produto produto) {
        daog = new DAOGenerico(produto);
        daog.inserir_actualizar();

    }

    public void remover_produto(Produto produto) {
        daog = new DAOGenerico(produto);
        daog.excluir();

    }
}
