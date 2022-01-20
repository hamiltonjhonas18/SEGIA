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
import mz.co.centralserver.model.ensino.Disciplina;
import mz.co.centralserver.model.ensino.DisciplinaCurso;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class DisciplinaCursoDAOImpl {

    private DAOGenerico daog;

    public DisciplinaCursoDAOImpl() {
        daog = new DAOGenerico(DisciplinaCurso.class);
    }

    public DisciplinaCurso getDisciplinaCurso(int id) {
        return (DisciplinaCurso) daog.buscarEntidadePorQuery("from DisciplinaCurso where disd_id = " + id);
    }

    public List<DisciplinaCurso> listaDisciplinasCurso(Entidade entidade) {
        return daog.buscarPorConsulta("from DisciplinaCurso where entidade_enti_id = " + entidade.getEnti_id() + " order by disd_id desc");
    }

    public List<DisciplinaCurso> listaDisciplinasCursoDisciplina(Entidade entidade, Disciplina disciplina) {
        return daog.buscarPorConsulta("from DisciplinaCurso where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by disd_id desc");
    }

    public List<DisciplinaCurso> listaDisciplinasCursosCurso(Entidade entidade, Curso curso) {
        return daog.buscarPorConsulta("from DisciplinaCurso where curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by disd_id desc");
    } 
    
    public List<DisciplinaCurso> listaDisciplinasCursosCursoSemestre(Entidade entidade, Curso curso, String semestre) {
        return daog.buscarPorConsulta("from DisciplinaCurso where curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND disd_semestre LIKE '"+semestre+"' order by disd_id desc");
    }

    public void persistir_disciplinaCurso(DisciplinaCurso disciplinaCurso) {
        daog = new DAOGenerico(disciplinaCurso);
        daog.inserir_actualizar();
    }

    public void remover_disciplinaCurso(DisciplinaCurso disciplinaCurso) {
        daog = new DAOGenerico(disciplinaCurso);
        daog.excluir();
    }
}
