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
import mz.co.centralserver.model.controleacesso.NivelAcesso;

/**
 *
 * @author HJC2K8
 */
public class NivelAcessoDAOImpl {

    private DAOGenerico daog;

    public NivelAcessoDAOImpl() {
        daog = new DAOGenerico(NivelAcesso.class);
    }

    public NivelAcesso getNivelAcesso(int id) {
        return (NivelAcesso) daog.buscarEntidadePorQuery("from NivelAcesso where niva_id = " + id);
    }

    public NivelAcesso getNivelAcesso(String descricao) {
        return (NivelAcesso) daog.buscarEntidadePorQuery("from NivelAcesso where niva_descricao LIKE '" + descricao + "'");
    }

    public List<NivelAcesso> listaNivelAcessos() {
        return daog.buscarPorConsulta("from NivelAcesso");
    }

    public void persistir_nivelAcesso(NivelAcesso nivelacesso) {
        daog = new DAOGenerico(nivelacesso);
        daog.inserir_actualizar();
    }
}
