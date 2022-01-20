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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class UsuarioDAOImpl {

    private DAOGenerico daog;

    public UsuarioDAOImpl() {
        daog = new DAOGenerico(Usuario.class);
    }

    public Usuario getUsuario(int id) {
        return (Usuario) daog.buscarEntidadePorQuery("from Usuario where usua_id = " + id);
    }

    public Usuario getUsuario(String usuario) {
        return (Usuario) daog.buscarEntidadePorQuery("from Usuario where usua_usuario LIKE '" + usuario + "'");
    }

    public List<Usuario> listaDosUsuarios() {
        return daog.buscarPorConsulta("from Usuario order by usua_id desc");
    }

    public List<Usuario> listaDosUsuariosLimit(int limite) {
        return daog.buscarPorConsultaLimite("from Usuario order by usua_id desc", limite);
    }

    public List<Usuario> listaDosUsuariosEntidade(Entidade entidade) {
        return daog.buscarPorConsulta("from Usuario where entidade_enti_id = " + entidade.getEnti_id() + " order by usua_id desc");
    }

    public List<Usuario> listaDosUsuariosEntidadeLimit(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Usuario where entidade_enti_id = " + entidade.getEnti_id() + " order by usua_id desc", limite);
    }

    public Usuario autenticar(String usuario, String senha) {
        return (Usuario) daog.buscarEntidadePorQuery("from Usuario where usua_usuario LIKE '" + usuario + "' AND usua_senha LIKE '" + senha + "'");
    }

    public void persistir_usuario(Usuario usuario) {

        daog = new DAOGenerico(usuario);
        daog.inserir_actualizar();

    }

    public void alterar_estado(int id, String estado) {

        Usuario usuario = getUsuario(id);
        usuario.setUsua_estado(estado);

        persistir_usuario(usuario);
    }

}
