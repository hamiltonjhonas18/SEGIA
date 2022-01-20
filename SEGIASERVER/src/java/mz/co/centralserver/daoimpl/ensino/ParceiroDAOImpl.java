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
import mz.co.centralserver.model.ensino.Parceiro;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ParceiroDAOImpl {

    private DAOGenerico daog;

    public ParceiroDAOImpl() {
        daog = new DAOGenerico(Parceiro.class);
    }

    public Parceiro getParceiro(int id) {
        return (Parceiro) daog.buscarEntidadePorQuery("from Parceiro where parc_id = " + id);
    }

    public Parceiro getParceiro(Entidade entidade, String descricao) {
        return (Parceiro) daog.buscarEntidadePorQuery("from Parceiro where parc_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Parceiro> listaParceiros(Entidade entidade) {
        return daog.buscarPorConsulta("from Parceiro where entidade_enti_id = " + entidade.getEnti_id() + " order by parc_descricao asc");
    }

    public void persistir_parceiro(Parceiro parceiro) {
        daog = new DAOGenerico(parceiro);
        daog.inserir_actualizar();
    }

    public void remover_parceiro(Parceiro parceiro) {
        daog = new DAOGenerico(parceiro);
        daog.excluir();
    }
}
