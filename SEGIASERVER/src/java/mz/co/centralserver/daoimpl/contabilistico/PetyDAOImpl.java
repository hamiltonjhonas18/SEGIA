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
import mz.co.centralserver.model.contabilistico.Pety;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class PetyDAOImpl {

    private DAOGenerico daog;

    public PetyDAOImpl() {
        daog = new DAOGenerico(Pety.class);
    }

    public Pety getPety(int id) {
        return (Pety) daog.buscarEntidadePorQuery("from Pety where pety_id = " + id);
    }

    public Pety getPety(Entidade entidade, String periodo) {
        return (Pety) daog.buscarEntidadePorQuery("from Pety where entidade_enti_id = " + entidade.getEnti_id() + " AND pety_periodo LIKE '" + periodo + "'");
    }

    public List<Pety> listaPetys(Entidade entidade) {
        return daog.buscarPorConsulta("from Pety where entidade_enti_id = " + entidade.getEnti_id() + " order by pety_id desc");
    }

    public void persistir_pety(Pety pety) {
        daog = new DAOGenerico(pety);
        daog.inserir_actualizar();
    }

    public void remover_pety(Pety pety) {
        daog = new DAOGenerico(pety);
        daog.excluir();
    }
}
