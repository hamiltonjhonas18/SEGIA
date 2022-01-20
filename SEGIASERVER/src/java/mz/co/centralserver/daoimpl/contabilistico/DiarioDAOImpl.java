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
import mz.co.centralserver.model.contabilistico.Diario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class DiarioDAOImpl {

    private DAOGenerico daog;

    public DiarioDAOImpl() {
        daog = new DAOGenerico(Diario.class);
    }

    public Diario getDiario(int id) {
        return (Diario) daog.buscarEntidadePorQuery("from Diario where dir_id = " + id);
    }

    public Diario getDiario(Entidade entidade, String descricao) {
        return (Diario) daog.buscarEntidadePorQuery("from Diario where entidade_enti_id = " + entidade.getEnti_id() + " AND dir_nome LIKE '" + descricao + "'");
    }

    public List<Diario> listaDiarios(Entidade entidade) {
        return daog.buscarPorConsulta("from Diario where entidade_enti_id = " + entidade.getEnti_id() + " order by dir_id asc");
    }

    public void persistir_diario(Diario diario) {
        daog = new DAOGenerico(diario);
        daog.inserir_actualizar();
    }

    public void remover_diario(Diario diario) {
        daog = new DAOGenerico(diario);
        daog.excluir();
    }
}
