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
import mz.co.centralserver.model.controleacesso.ModuloAcesso;

/**
 *
 * @author HJC2K8
 */
public class ModuloAcessoDAOImpl {

    private DAOGenerico daog;

    public ModuloAcessoDAOImpl() {
        daog = new DAOGenerico(ModuloAcesso.class);
    }

    public ModuloAcesso getModuloAcesso(int id) {
        return (ModuloAcesso) daog.buscarEntidadePorQuery("from ModuloAcesso where moac_id = " + id);
    }

    public List<ModuloAcesso> listaModuloAcessos() {
        return daog.buscarPorConsulta("from ModuloAcesso");
    }

    public List<ModuloAcesso> listaModuloAcessosEntidade(int id) {
        return daog.buscarPorConsulta("from ModuloAcesso where entidadeenti_enti_id = " + id);
    }

    public List<ModuloAcesso> listaModuloAcessosSistema(int id) {
        return daog.buscarPorConsulta("from ModuloAcesso where sistema_sist_id = " + id);
    }

    public List<ModuloAcesso> listaModuloAcessosSistemaEntidade(int idSistema, int idEntidade) {
        return daog.buscarPorConsulta("from ModuloAcesso where sistema_sist_id = " + idSistema + " and entidadeenti_enti_id = " + idEntidade);
    }

    public void persistir_moduloAcesso(ModuloAcesso moduloAcesso) {
        daog = new DAOGenerico(moduloAcesso);
        daog.inserir_actualizar();
    }
}
