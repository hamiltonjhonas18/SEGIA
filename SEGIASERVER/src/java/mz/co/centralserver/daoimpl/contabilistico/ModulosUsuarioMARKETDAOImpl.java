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
import mz.co.centralserver.model.contabilistico.ModulosUsuarioMARKET;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ModulosUsuarioMARKETDAOImpl {

    DAOGenerico daog;

    public ModulosUsuarioMARKETDAOImpl() {

        daog = new DAOGenerico(ModulosUsuarioMARKET.class);

    }

    public ModulosUsuarioMARKET getModulosUsuarioMARKET(int id) {
        return (ModulosUsuarioMARKET) daog.buscarEntidadePorQuery("from ModulosUsuarioMARKET where mui_id = " + id);
    }

    public ModulosUsuarioMARKET getModulosUsuarioMARKET(Usuario usuario) {
        return (ModulosUsuarioMARKET) daog.buscarEntidadePorQuery("from ModulosUsuarioMARKET where usuario_usua_id = " + usuario.getUsua_id());
    }

    public List<ModulosUsuarioMARKET> listaModulosMARKET(Entidade entidade) {
        return daog.buscarPorConsulta("from ModulosUsuarioMARKET where entidade_enti_id =  " + entidade.getEnti_id());
    }

    public List<ModulosUsuarioMARKET> listaTodosModulosMARKET() {
        return daog.buscarPorConsulta("from ModulosUsuarioMARKET");
    }

    public void persitir_modulosUsuarioMARKET(ModulosUsuarioMARKET modulosUsuarioMARKET) {
        daog = new DAOGenerico(modulosUsuarioMARKET);
        daog.inserir_actualizar();
    }

    public void remover_modulosUsuarioMARKET(ModulosUsuarioMARKET modulosUsuarioMARKET) {
        daog = new DAOGenerico(modulosUsuarioMARKET);
        daog.excluir();
    }

}
