/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ensino;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.ensino.Taxa;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TaxaDAOImpl {

    private DAOGenerico daog;

    public TaxaDAOImpl() {
        daog = new DAOGenerico(Taxa.class);
    }

    public Taxa getTaxa(int id) {
        return (Taxa) daog.buscarEntidadePorQuery("from Taxa where taxa_id = " + id);
    }

    public Taxa getTaxa(Entidade entidade, String descricao) {
        return (Taxa) daog.buscarEntidadePorQuery("from Taxa where taxa_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Taxa> listaTaxas(Entidade entidade) {
        return daog.buscarPorConsulta("from Taxa where entidade_enti_id = " + entidade.getEnti_id() + " order by taxa_descricao asc");
    }

    public void persistir_taxa(Taxa taxa) {
        daog = new DAOGenerico(taxa);
        daog.inserir_actualizar();
    }

    public void remover_taxa(Taxa taxa) {
        daog = new DAOGenerico(taxa);
        daog.excluir();
    }
}
