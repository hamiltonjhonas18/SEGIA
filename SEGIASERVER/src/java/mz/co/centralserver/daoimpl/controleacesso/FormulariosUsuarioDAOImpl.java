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
import mz.co.centralserver.model.controleacesso.FormulariosUsuario;

/**
 *
 * @author HJC2K8
 */
public class FormulariosUsuarioDAOImpl {

    private DAOGenerico daog;

    public FormulariosUsuarioDAOImpl() {
        daog = new DAOGenerico(FormulariosUsuario.class);
    }

    public FormulariosUsuario getFormulariosUsuario(int id) {
        return (FormulariosUsuario) daog.buscarEntidadePorQuery("from FormulariosUsuario where formu_id = " + id);
    }
    
    public FormulariosUsuario getFormulariosUsuarioModuloUsuario(int idFormulario, int idModuloUsuario) {
        return (FormulariosUsuario) daog.buscarEntidadePorQuery("from FormulariosUsuario where formulario_form_id = " + idFormulario + " and moduloUsuario_modu_id = " + idModuloUsuario);
    }

    public List<FormulariosUsuario> listaFormulariosUsuarios() {
        return daog.buscarPorConsulta("from FormulariosUsuario");
    }

    public List<FormulariosUsuario> listaFormulariosUsuarios_Usuario(int id) {
        return daog.buscarPorConsulta("from FormulariosUsuario where moduloUsuario_modu_id = " + id);
    }


    public void persistir_formulariosUsuario(FormulariosUsuario formulariosUsuario) {
        daog = new DAOGenerico(formulariosUsuario);
        daog.inserir_actualizar();
    }
}
