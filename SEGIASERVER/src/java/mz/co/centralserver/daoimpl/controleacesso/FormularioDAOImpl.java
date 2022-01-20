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
import mz.co.centralserver.model.controleacesso.Formulario;

/**
 *
 * @author HJC2K8
 */
public class FormularioDAOImpl {

    private DAOGenerico daog;

    public FormularioDAOImpl() {
        daog = new DAOGenerico(Formulario.class);
    }

    public Formulario getFormulario(int id) {
        return (Formulario) daog.buscarEntidadePorQuery("from Formulario where form_id = " + id);
    }

    public Formulario getFormulario(String descricao) {
        return (Formulario) daog.buscarEntidadePorQuery("from Formulario where form_descricao LIKE '" + descricao + "'");
    }

    public List<Formulario> listaFormularios() {
        return daog.buscarPorConsulta("from Formulario");
    }

    public List<Formulario> listaFormulariosSistema(int id) {
        return daog.buscarPorConsulta("from Formulario where sistema_sist_id = " + id);
    }

    public void persistir_formulario(Formulario formulario) {
        daog = new DAOGenerico(formulario);
        daog.inserir_actualizar();
    }
}
