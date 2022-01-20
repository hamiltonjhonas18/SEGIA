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
import mz.co.centralserver.model.ensino.AreaFormacao;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class CursoDAOImpl {

    private DAOGenerico daog;

    public CursoDAOImpl() {
        daog = new DAOGenerico(Curso.class);
    }

    public Curso getCurso(int id) {
        return (Curso) daog.buscarEntidadePorQuery("from Curso where curs_id = " + id);
    }

    public Curso getCurso(Entidade entidade, String descricao) {
        return (Curso) daog.buscarEntidadePorQuery("from Curso where curs_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Curso getCurso(Entidade entidade, String descricao, AreaFormacao areaFormacao) {
        return (Curso) daog.buscarEntidadePorQuery("from Curso where curs_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND areaFormacao_aref_id = " + areaFormacao.getAref_id());
    }

    public List<Curso> listaCursos(Entidade entidade) {
        return daog.buscarPorConsulta("from Curso where entidade_enti_id = " + entidade.getEnti_id() + " order by curs_id asc");
    }

    public List<Curso> listaTopCursos(Entidade entidade) {
        return daog.buscarPorConsulta("from Curso where entidade_enti_id = " + entidade.getEnti_id() + " order by curs_inscritos desc");
    }


    public List<Curso> listaCursos() {
        return daog.buscarPorConsulta("from Curso where order by curs_id asc");
    }

    public List<Curso> listaCursosAreaFormacao(Entidade entidade, AreaFormacao areaFormacao) {
        return daog.buscarPorConsulta("from Curso where entidade_enti_id = " + entidade.getEnti_id() + " AND areaFormacao_aref_id = " + areaFormacao.getAref_id() + " order by curs_id asc");
    }

    public void persistir_curso(Curso curso) {
        daog = new DAOGenerico(curso);
        daog.inserir_actualizar();
    }

    public void remover_curso(Curso curso) {
        daog = new DAOGenerico(curso);
        daog.excluir();
    }
}
