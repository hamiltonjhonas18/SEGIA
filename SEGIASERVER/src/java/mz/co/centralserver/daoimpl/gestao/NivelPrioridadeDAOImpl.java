/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.gestao;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.NivelPrioridade;

/**
 *
 * @author HJC2K8
 */
public class NivelPrioridadeDAOImpl {

    private DAOGenerico daog;

    public NivelPrioridadeDAOImpl() {
        daog = new DAOGenerico(NivelPrioridade.class);
    }

    public NivelPrioridade getNivelPrioridade(int id) {
        return (NivelPrioridade) daog.buscarEntidadePorQuery("from NivelPrioridade where nvp_id = " + id);
    }

    public NivelPrioridade getNivelPrioridade(String descricao) {
        return (NivelPrioridade) daog.buscarEntidadePorQuery("from NivelPrioridade where nvp_descricao LIKE '" + descricao + "'");
    }

    public List<NivelPrioridade> listaNivelPrioridades() {
        return daog.buscarPorConsulta("from NivelPrioridade order by nvp_descricao asc");
    }

    public void persistir_nivelPrioridade(NivelPrioridade nivelPrioridade) {
        daog = new DAOGenerico(nivelPrioridade);
        daog.inserir_actualizar();
    }
}
