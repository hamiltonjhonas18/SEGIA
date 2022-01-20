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
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.controleacesso.ModulosUsuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ModulosUsuarioDAOImpl {

    DAOGenerico daog;

    public ModulosUsuarioDAOImpl() {

        daog = new DAOGenerico(ModulosUsuario.class);

    }

    

    public ModulosUsuario getModulosUsuario(int id) {
        return (ModulosUsuario) daog.buscarEntidadePorQuery("from ModulosUsuario where mui_id = " + id);
    }
    public ModulosUsuario getModulosUsuario(Usuario usuario) {
        return (ModulosUsuario) daog.buscarEntidadePorQuery("from ModulosUsuario where usuario_usua_id = " + usuario.getUsua_id());
    }

    public List<ModulosUsuario> listaModulos(Entidade entidade) {
        return daog.buscarPorConsulta("from ModulosUsuario where entidade_enti_id =  "+ entidade.getEnti_id());
    }

    public void persitir_modulosUsuario(ModulosUsuario modulosUsuario) {
        daog = new DAOGenerico(modulosUsuario);
        daog.inserir_actualizar();
    }

    public void remover_modulosUsuario(ModulosUsuario modulosUsuario) {
        daog = new DAOGenerico(modulosUsuario);
        daog.excluir();
    }

}
