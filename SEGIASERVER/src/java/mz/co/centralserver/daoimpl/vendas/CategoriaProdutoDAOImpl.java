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

/**
 *
 * @author HJC2K8
 */
public class CategoriaProdutoDAOImpl {

    private DAOGenerico daog;

    public CategoriaProdutoDAOImpl() {

        daog = new DAOGenerico(CategoriaProduto.class);
    }

    public CategoriaProduto getCategoriaProduto(int id) {
        return (CategoriaProduto) daog.buscarEntidadePorQuery("from CategoriaProduto where catp_id = " + id);
    }

    public CategoriaProduto getCategoriaProduto(Entidade entidade, String descricao) {
        return (CategoriaProduto) daog.buscarEntidadePorQuery("from CategoriaProduto where catp_descricao LIKE '" + descricao + "' AND entidade_enti_id = "+entidade.getEnti_id());
    }

    public List<CategoriaProduto> listaCategoriaProdutos(Entidade entidade) {
        return daog.buscarPorConsulta("from CategoriaProduto where entidade_enti_id = "+entidade.getEnti_id()+" order by catp_id desc");
    }

    public void persistir_categoriaProduto (CategoriaProduto categoriaProduto) {
        daog = new DAOGenerico(categoriaProduto);
        daog.inserir_actualizar();

    }

    public void remover_categoriaProduto(CategoriaProduto categoriaProduto) {
        daog = new DAOGenerico(categoriaProduto);
        daog.excluir();

    }
}
