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
import mz.co.centralserver.model.ensino.Agenda;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class AgendaDAOImpl {

    private DAOGenerico daog;

    public AgendaDAOImpl() {
        daog = new DAOGenerico(Agenda.class);
    }

    public Agenda getAgenda(int id) {
        return (Agenda) daog.buscarEntidadePorQuery("from Agenda where agen_id = " + id);
    }

    public Agenda getAgenda(Entidade entidade, String diaSemana, String horario, String semestre, Turma turma, AnoLectivo anoLectivo, Disciplina disciplina) {
        return (Agenda) daog.buscarEntidadePorQuery("from Agenda where agen_diaSemana LIKE '" + diaSemana + "' AND agen_hora LIKE '" + horario + "' AND agen_semestre LIKE '" + semestre + "' AND disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  AND turma_turm_id = " + turma.getTurm_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id());
    }

    public List<Agenda> listaAgenda(Entidade entidade) {
        return daog.buscarPorConsulta("from Agenda where entidade_enti_id = " + entidade.getEnti_id() + " order by agen_id asc");
    }

    public List<Agenda> listaAgendaDisciplina(Entidade entidade, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Agenda where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by agen_id asc");
    }

    public List<Agenda> listaAgendaTurma(Entidade entidade, Turma turma) {
        return daog.buscarPorConsulta("from Agenda where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by agen_id asc");
    }

    public List<Agenda> listaAgendaCursoSemestre(Entidade entidade, Curso curso, String semestre) {
        return daog.buscarPorConsulta("from Agenda where curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND agen_semestre LIKE '" + semestre + "'  order by agen_id asc");
    }

    public List<Agenda> listaAgendaTurmaSemestre(Entidade entidade, Turma turma, AnoLectivo anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Agenda where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND agen_semestre LIKE '" + semestre + "' order by agen_id asc");
    }

    public void persistir_agenda(Agenda agenda) {
        daog = new DAOGenerico(agenda);
        daog.inserir_actualizar();
    }

    public void remover_agenda(Agenda agenda) {
        daog = new DAOGenerico(agenda);
        daog.excluir();
    }
}
