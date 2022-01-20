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
import mz.co.centralserver.model.contabilistico.ContaGeral;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ContaGeralDAOImpl {

    private DAOGenerico daog;

    public ContaGeralDAOImpl() {
        daog = new DAOGenerico(ContaGeral.class);
    }

    public ContaGeral getContaGeral(int id) {
        return (ContaGeral) daog.buscarEntidadePorQuery("from ContaGeral where ctg_id = " + id);
    }

    public ContaGeral getContaGeral(Entidade entidade, String descricao) {
        return (ContaGeral) daog.buscarEntidadePorQuery("from ContaGeral where entidade_enti_id = " + entidade.getEnti_id() + " AND ctg_descricao LIKE '" + descricao + "'");
    }

    public ContaGeral getContaGeralConta(Entidade entidade, String conta) {
        return (ContaGeral) daog.buscarEntidadePorQuery("from ContaGeral where entidade_enti_id = " + entidade.getEnti_id() + " AND ctg_conta LIKE '" + conta + "'");
    }

    public List<ContaGeral> listaContasGerais(Entidade entidade) {
        return daog.buscarPorConsulta("from ContaGeral where entidade_enti_id = " + entidade.getEnti_id() + " order by ctg_id asc");
    }

    public void persistir_contaGeral(ContaGeral contaGeral) {
        daog = new DAOGenerico(contaGeral);
        daog.inserir_actualizar();
    }

    public void remover_contaGeral(ContaGeral contaGeral) {
        daog = new DAOGenerico(contaGeral);
        daog.excluir();
    }
}
