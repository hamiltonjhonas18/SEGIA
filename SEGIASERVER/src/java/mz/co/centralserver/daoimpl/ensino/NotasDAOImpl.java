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
import mz.co.centralserver.model.ensino.Notas;
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class NotasDAOImpl {

    private DAOGenerico daog;

    public NotasDAOImpl() {
        daog = new DAOGenerico(Notas.class);
    }

    public Notas getNotas(int id) {
        return (Notas) daog.buscarEntidadePorQuery("from Notas where nota_id = " + id);
    }

    public Notas getNotas(Entidade entidade, Aluno aluno, Turma turma, Disciplina disciplina, AnoLectivo anoLectivo, String semestre) {
        return (Notas) daog.buscarEntidadePorQuery("from Notas where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND disciplina_disc_id =  " + disciplina.getDisc_id() + " AND nota_semestre LIKE '" + semestre + "' AND aluno_alun_id = " + aluno.getAlun_id());
    }

    public List<Notas> listaNotas(Entidade entidade) {
        return daog.buscarPorConsulta("from Notas where entidade_enti_id = " + entidade.getEnti_id() + " order by nota_id desc");
    }

    public List<Notas> listaNotasDisciplina(Entidade entidade, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Notas where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by nota_id desc");
    }

    public List<Notas> listaNotasAluno(Entidade entidade, Aluno aluno) {
        return daog.buscarPorConsulta("from Notas where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by nota_id desc");
    }

    public List<Notas> listaNotasInscricao(Entidade entidade, Inscricao inscricao) {
        return daog.buscarPorConsulta("from Notas where inscricao_insc_id = " + inscricao.getInsc_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by nota_id desc");
    }

    public List<Notas> listaNotasAlunoSemestre(Entidade entidade, Aluno aluno, AnoLectivo anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Notas where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND nota_semestre LIKE '" + semestre + "' order by nota_id desc");
    }

    public List<Notas> listaNotasTurmaSemestre(Entidade entidade, Turma turma, AnoLectivo anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Notas where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND nota_semestre LIKE '" + semestre + "' order by nota_id desc");
    }

    public List<Notas> listaNotasDisciplinaSemestre(Entidade entidade, Turma turma, Disciplina disciplina, AnoLectivo anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Notas where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND disciplina_disc_id =  " + disciplina.getDisc_id() + " AND nota_semestre LIKE '" + semestre + "' order by nota_id desc");
    }

    public List<Notas> listaNotasDisciplinaTurma(Entidade entidade, Turma turma, Disciplina disciplina, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from Notas where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND disciplina_disc_id =  " + disciplina.getDisc_id() + "  order by nota_id desc");
    }

    public void persistir_notas(Notas notas) {
        daog = new DAOGenerico(notas);
        daog.inserir_actualizar();
    }

    public void remover_notas(Notas notas) {
        daog = new DAOGenerico(notas);
        daog.excluir();
    }
}
