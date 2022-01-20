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
import mz.co.centralserver.model.gestao.TipoContacto;

/**
 *
 * @author HJC2K8
 */
public class TipoContactoDAOImpl {

    private DAOGenerico daog;

    public TipoContactoDAOImpl() {
        daog = new DAOGenerico(TipoContacto.class);
    }

    public TipoContacto getTipoContacto(int id) {
        return (TipoContacto) daog.buscarEntidadePorQuery("from TipoContacto where tipc_id = " + id);
    }

    public TipoContacto getTipoContacto(String descricao) {
        return (TipoContacto) daog.buscarEntidadePorQuery("from TipoContacto where tipc_nome LIKE '" + descricao + "'");
    }

    public List<TipoContacto> listaTipoContactos() {
        return daog.buscarPorConsulta("from TipoContacto order by tipc_nome asc");
    }

    public void persistir_tipoContacto(TipoContacto tipoContacto) {
        daog = new DAOGenerico(tipoContacto);
        daog.inserir_actualizar();
    }
}
