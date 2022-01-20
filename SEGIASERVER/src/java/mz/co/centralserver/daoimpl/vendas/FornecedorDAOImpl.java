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
import mz.co.centralserver.model.vendas.Fornecedor;

/**
 *
 * @author HJC2K8
 */
public class FornecedorDAOImpl {

    private DAOGenerico daog;

    public FornecedorDAOImpl() {

        daog = new DAOGenerico(Fornecedor.class);
    }

    public Fornecedor getFornecedor(int id) {
        return (Fornecedor) daog.buscarEntidadePorQuery("from Fornecedor where for_id = " + id);
    }

    public Fornecedor getFornecedor(Entidade entidade, String descricao) {
        return (Fornecedor) daog.buscarEntidadePorQuery("from Fornecedor where for_nome LIKE '" + descricao + "' AND entidade_enti_id = "+entidade.getEnti_id());
    }

    public List<Fornecedor> listaFornecedores(Entidade entidade) {
        return daog.buscarPorConsulta("from Fornecedor where entidade_enti_id = "+entidade.getEnti_id()+" order by for_id desc");
    }

    public void persistir_fornecedor(Fornecedor fornecedor) {
        daog = new DAOGenerico(fornecedor);
        daog.inserir_actualizar();

    }

    public void remover_fornecedor(Fornecedor fornecedor) {
        daog = new DAOGenerico(fornecedor);
        daog.excluir();

    }
}
