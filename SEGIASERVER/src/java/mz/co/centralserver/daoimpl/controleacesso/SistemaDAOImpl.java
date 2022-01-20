/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.controleacesso;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.controleacesso.Sistema;

/**
 *
 * @author HJC2K8
 */
public class SistemaDAOImpl {

    private DAOGenerico daog;

    public SistemaDAOImpl() {

        daog = new DAOGenerico(Sistema.class);
    }

    public Sistema getSistema(int id) {
        return (Sistema) daog.buscarEntidadePorQuery("from Sistema where sist_id = " + id);
    }

    public Sistema getSistema(String descricao) {
        return (Sistema) daog.buscarEntidadePorQuery("from Sistema where sist_descricao LIKE '" + descricao + "'");
    }

    public List<Sistema> listaSistemas() {
        return daog.buscarPorConsulta("from Sistema order by sist_descricao desc");
    }

    public void persistir_sistema(Sistema sistema) {
        daog = new DAOGenerico(sistema);
        daog.inserir_actualizar();
    }

    public void remover_sistema(Sistema sistema) {
        daog = new DAOGenerico(sistema);
        daog.excluir();
    }
}
