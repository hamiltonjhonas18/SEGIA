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
import mz.co.centralserver.model.controleacesso.TipoUsuario;

/**
 *
 * @author HJC2K8
 */
public class TipoUsuarioDAOImpl {

    private DAOGenerico daog;

    public TipoUsuarioDAOImpl() {
        daog = new DAOGenerico(TipoUsuario.class);
    }

    public TipoUsuario getTipoUsuario(int id) {
        return (TipoUsuario) daog.buscarEntidadePorQuery("from TipoUsuario where tipu_id = " + id);
    }

    public TipoUsuario getTipoUsuario(String descricao) {
        return (TipoUsuario) daog.buscarEntidadePorQuery("from TipoUsuario where tipu_descricao LIKE '" + descricao + "'");
    }

    public List<TipoUsuario> listaTipoUsuarios() {
        return daog.buscarPorConsulta("from TipoUsuario order by tipu_descricao asc");
    }

    public void persistir_tipoUsuario(TipoUsuario nivelacesso) {
        daog = new DAOGenerico(nivelacesso);
        daog.inserir_actualizar();
    }
}
