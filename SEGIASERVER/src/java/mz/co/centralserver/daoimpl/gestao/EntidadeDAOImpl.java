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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class EntidadeDAOImpl {

    private DAOGenerico daog;

    public EntidadeDAOImpl() {
        daog = new DAOGenerico(Entidade.class);
    }

    public Entidade getEntidade(int id) {
        return (Entidade) daog.buscarEntidadePorQuery("from Entidade where enti_id = " + id);
    }

    public Entidade getEntidade(String nome) {
        return (Entidade) daog.buscarEntidadePorQuery("from Entidade where enti_nome LIKE '" + nome + "'");
    }

    public Entidade getEntidadePelaSigla(String sigla) {
        return (Entidade) daog.buscarEntidadePorQuery("from Entidade where enti_sigla LIKE '" + sigla + "'");
    }

    public List<Entidade> listaEntidades() {
        return daog.buscarPorConsulta("from Entidade order by enti_nome asc");
    }

    public void persistir_entidade(Entidade entidade) {
        daog = new DAOGenerico(entidade);
        daog.inserir_actualizar();
    }
}
