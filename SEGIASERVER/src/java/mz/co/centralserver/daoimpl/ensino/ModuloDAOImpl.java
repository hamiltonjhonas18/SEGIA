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
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Modulo;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ModuloDAOImpl {

    private DAOGenerico daog;

    public ModuloDAOImpl() {
        daog = new DAOGenerico(Modulo.class);
    }

    public Modulo getModulo(int id) {
        return (Modulo) daog.buscarEntidadePorQuery("from Modulo where modu_id = " + id);
    }

    public Modulo getModulo(Entidade entidade, String descricao) {
        return (Modulo) daog.buscarEntidadePorQuery("from Modulo where modu_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Modulo getModulo(Entidade entidade, String descricao, Curso curso) {
        return (Modulo) daog.buscarEntidadePorQuery("from Modulo where modu_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND curso_curs_id = " + curso.getCurs_id());
    }

    public List<Modulo> listaModulos(Entidade entidade) {
        return daog.buscarPorConsulta("from Modulo where entidade_enti_id = " + entidade.getEnti_id() + " order by modu_descricao asc");
    }

    public List<Modulo> listaModulosCurso(Entidade entidade, Curso curso) {
        return daog.buscarPorConsulta("from Modulo where entidade_enti_id = " + entidade.getEnti_id() + " AND curso_curs_id = " + curso.getCurs_id() + " order by modu_descricao asc");
    }

    public void persistir_modulo(Modulo modulo) {
        daog = new DAOGenerico(modulo);
        daog.inserir_actualizar();
    }

    public void remover_modulo(Modulo modulo) {
        daog = new DAOGenerico(modulo);
        daog.excluir();
    }
}
