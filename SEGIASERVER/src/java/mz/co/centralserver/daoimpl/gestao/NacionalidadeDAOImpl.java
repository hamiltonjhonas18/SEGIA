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
import mz.co.centralserver.model.gestao.Nacionalidade;

/**
 *
 * @author HJC2K8
 */
public class NacionalidadeDAOImpl {

    private DAOGenerico daog;

    public NacionalidadeDAOImpl() {
        daog = new DAOGenerico(Nacionalidade.class);
    }

    public Nacionalidade getNacionalidade(int id) {
        return (Nacionalidade) daog.buscarEntidadePorQuery("from Nacionalidade where naci_id = " + id);
    }

    public Nacionalidade getNacionalidade(String descricao) {
        return (Nacionalidade) daog.buscarEntidadePorQuery("from Nacionalidade where naci_descricao LIKE '" + descricao + "'");
    }

    public List<Nacionalidade> listaNacionalidades() {
        return daog.buscarPorConsulta("from Nacionalidade order by naci_descricao asc");
    }

    public void persistir_nacionalidade(Nacionalidade nacionalidade) {
        daog = new DAOGenerico(nacionalidade);
        daog.inserir_actualizar();
    }

    public void remover_nacionalidade(Nacionalidade nacionalidade) {
        daog = new DAOGenerico(nacionalidade);
        daog.excluir();
    }
}
