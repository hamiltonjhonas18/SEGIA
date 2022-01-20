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
import mz.co.centralserver.model.vendas.Produto;
import mz.co.centralserver.model.vendas.ProdutoRequisicao;
import mz.co.centralserver.model.vendas.RequisicaoMaterial;

/**
 *
 * @author HJC2K8
 */
public class ProdutoRequisicaoDAOImpl {

    private DAOGenerico daog;

    public ProdutoRequisicaoDAOImpl() {

        daog = new DAOGenerico(ProdutoRequisicao.class);
    }

    public ProdutoRequisicao getProdutoRequisicao(int id) {
        return (ProdutoRequisicao) daog.buscarEntidadePorQuery("from ProdutoRequisicao  where prr_id = " + id);
    }

    public List<ProdutoRequisicao> listaProdutosRequisitados(Entidade entidade) {
        return daog.buscarPorConsulta("from ProdutoRequisicao where entidade_enti_id = " + entidade.getEnti_id() + " order by prr_id desc");
    }

    public List<ProdutoRequisicao> listaProdutoRequisitadosRequisicaoMaterial(Entidade entidade, RequisicaoMaterial requisicaoMaterial) {
        return daog.buscarPorConsulta("from ProdutoRequisicao where requisicaoMaterial_reqm_id = " + requisicaoMaterial.getReqm_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by prr_id desc");
    }


    public List<ProdutoRequisicao> listaProdutoRequisitadosProduto(Entidade entidade, Produto produto) {
        return daog.buscarPorConsulta("from ProdutoRequisicao where produto_pro_id = " + produto.getPro_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by prr_id desc");
    }

    public List<ProdutoRequisicao> listaProdutoRequisitadosRequisicaoMaterialProduto(Entidade entidade, Produto produto, RequisicaoMaterial requisicaoMaterial) {
        return daog.buscarPorConsulta("from ProdutoRequisicao where produto_pro_id = " + produto.getPro_id() + " AND requisicaoMaterial_reqm_id = " + requisicaoMaterial.getReqm_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by prr_id desc");
    }

    public List<ProdutoRequisicao> listaProdutoRequisitadosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from ProdutoRequisicao where prr_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by prr_id desc");
    }

    public List<ProdutoRequisicao> listaProdutoRequisitadosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from ProdutoRequisicao where prr_data LIKE '" + data + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by prr_id desc");
    }

    public void persistir_produtoRequisicao(ProdutoRequisicao produtoRequisicao) {
        daog = new DAOGenerico(produtoRequisicao);
        daog.inserir_actualizar();
    }

    public void remover_produtoRequisicao(ProdutoRequisicao produtoRequisicao) {
        daog = new DAOGenerico(produtoRequisicao);
        daog.excluir();
    }

}
