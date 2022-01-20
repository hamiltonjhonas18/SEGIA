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
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.ensino.Disciplina;
import mz.co.centralserver.model.ensino.Calendario;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class CalendarioDAOImpl {

    private DAOGenerico daog;

    public CalendarioDAOImpl() {
        daog = new DAOGenerico(Calendario.class);
    }

    public Calendario getCalendario(int id) {
        return (Calendario) daog.buscarEntidadePorQuery("from Calendario where cale_id = " + id);
    }

    public Calendario getCalendario(Entidade entidade, String semestre, Curso curso, Turma turma, AnoLectivo anoLectivo, Disciplina disciplina) {
        return (Calendario) daog.buscarEntidadePorQuery("from Calendario where cale_semestre LIKE '" + semestre + "' AND curso_curs_id = " + curso.getCurs_id() + " AND disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " AND turma_turm_id = " + turma.getTurm_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id());
    }

    public List<Calendario> listaCalendario(Entidade entidade) {
        return daog.buscarPorConsulta("from Calendario where entidade_enti_id = " + entidade.getEnti_id() + " order by cale_id desc");
    }

    public List<Calendario> listaCalendarioDisciplina(Entidade entidade, Curso curso, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Calendario where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by cale_id desc");
    }

    public List<Calendario> listaCalendarioTurma(Entidade entidade, Curso curso, Turma turma) {
        return daog.buscarPorConsulta("from Calendario where turma_turm_id = " + turma.getTurm_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by cale_id desc");
    }

    public List<Calendario> listaCalendarioCursoSemestre(Entidade entidade, Curso curso, String semestre) {
        return daog.buscarPorConsulta("from Calendario where curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND cale_semestre LIKE '" + semestre + "'  order by cale_id desc");
    }

    public List<Calendario> listaCalendarioTurmaSemestre(Entidade entidade, Curso curso, Turma turma, AnoLectivo anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Calendario where turma_turm_id = " + turma.getTurm_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND cale_semestre LIKE '" + semestre + "' order by cale_id desc");
    }

    public List<Calendario> listaCalendarioExame(Entidade entidade, Curso curso, Disciplina disciplina, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from Calendario where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " order by cale_id desc");
    }

    public void persistir_calendario(Calendario calendario) {
        daog = new DAOGenerico(calendario);
        daog.inserir_actualizar();
    }

    public void remover_calendario(Calendario calendario) {
        daog = new DAOGenerico(calendario);
        daog.excluir();
    }
}
