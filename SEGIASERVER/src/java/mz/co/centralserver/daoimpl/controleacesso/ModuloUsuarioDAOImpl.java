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
import mz.co.centralserver.model.controleacesso.ModuloUsuario;

/**
 *
 * @author HJC2K8
 */
public class ModuloUsuarioDAOImpl {

    private DAOGenerico daog;

    public ModuloUsuarioDAOImpl() {

        daog = new DAOGenerico(ModuloUsuario.class);
    }

    public ModuloUsuario getModuloUsuario(int id) {
        return (ModuloUsuario) daog.buscarEntidadePorQuery("from ModuloUsuario where modu_id = " + id);
    }

    public ModuloUsuario getModuloUsuario(String referencia) {
        return (ModuloUsuario) daog.buscarEntidadePorQuery("from ModuloUsuario where modu_referencia LIKE '" + referencia + "'");
    }

    public List<ModuloUsuario> listaModuloUsuarios() {
        return daog.buscarPorConsulta("from ModuloUsuario order by modu_id desc");
    }
    
    public List<ModuloUsuario> listaModuloUsuariosUsuarioVisitas(int idUsuario) {
        return daog.buscarPorConsulta("from ModuloUsuario where usuario_usua_id  = " + idUsuario + " order by modu_visitas desc");
    }

    public List<ModuloUsuario> listaModuloUsuariosUsuario(int idUsuario) {
        return daog.buscarPorConsulta("from ModuloUsuario where usuario_usua_id  = " + idUsuario + " order by modu_id desc");
    }

    public void persistir_moduloUsuario(ModuloUsuario moduloUsuario) {
        daog = new DAOGenerico(moduloUsuario);
        daog.inserir_actualizar();
    }

    public void remover_moduloUsuario(ModuloUsuario moduloUsuario) {
        daog = new DAOGenerico(moduloUsuario);
        daog.excluir();
    }
}
