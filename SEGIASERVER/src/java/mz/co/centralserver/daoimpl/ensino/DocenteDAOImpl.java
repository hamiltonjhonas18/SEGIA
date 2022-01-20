/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ensino;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.ensino.Docente;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class DocenteDAOImpl {

    private DAOGenerico daog;

    public DocenteDAOImpl() {

        daog = new DAOGenerico(Docente.class);
    }

    public Docente getDocente(int id) {
        return (Docente) daog.buscarEntidadePorQuery("from Docente where doce_id = " + id);
    }

    public Docente getDocentePessoa(int id) {
        return (Docente) daog.buscarEntidadePorQuery("from Docente where pessoa_pess_id = " + id);
    }

    public List<Docente> listaDocentes(Entidade entidade) {
        return daog.buscarPorConsulta("from Docente where entidade_enti_id = " + entidade.getEnti_id() + " order by doce_id desc");
    }

    public List<Docente> listaDocentes(Entidade entidade, String provincia) {
        return daog.buscarPorConsulta("from Docente where entidade_enti_id = " + entidade.getEnti_id() + " AND doce_provincia LIKE '" + provincia + "' order by doce_id desc");
    }

    public List<Docente> listaDocentes() {
        return daog.buscarPorConsulta("from Docente where order by doce_id desc");
    }

    public void persistir_docente(Docente docente) {
        daog = new DAOGenerico(docente);
        daog.inserir_actualizar();
    }

    public void remover_docente(Docente docente) {
        daog = new DAOGenerico(docente);
        daog.excluir();
    }
}
