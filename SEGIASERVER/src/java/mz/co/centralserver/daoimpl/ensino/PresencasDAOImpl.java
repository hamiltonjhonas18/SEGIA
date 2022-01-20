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
import mz.co.centralserver.model.ensino.Presencas;
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class PresencasDAOImpl {

    private DAOGenerico daog;

    public PresencasDAOImpl() {
        daog = new DAOGenerico(Presencas.class);
    }

    public Presencas getPresencas(int id) {
        return (Presencas) daog.buscarEntidadePorQuery("from Presencas where pres_id = " + id);
    }

    public List<Presencas> listaPresencas(Entidade entidade) {
        return daog.buscarPorConsulta("from Presencas where entidade_enti_id = " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasDisciplina(Entidade entidade, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Presencas where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by pres_id desc");
    }

    public List<Presencas> listaPresencasAluno(Entidade entidade, Aluno aluno) {
        return daog.buscarPorConsulta("from Presencas where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Presencas where pres_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Presencas where pres_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasAlunoPeriodo(Entidade entidade, Aluno aluno, String p1, String p2) {
        return daog.buscarPorConsulta("from Presencas where pres_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasAlunoData(Entidade entidade, Aluno aluno, String data) {
        return daog.buscarPorConsulta("from Presencas where pres_data LIKE '" + data + "%' AND aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasTurmaPeriodo(Entidade entidade, Turma turma, String p1, String p2) {
        return daog.buscarPorConsulta("from Presencas where pres_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " AND turma_turm_id = " + turma.getTurm_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasTurmaData(Entidade entidade, Turma turma, String data) {
        return daog.buscarPorConsulta("from Presencas where pres_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " AND turma_turm_id = " + turma.getTurm_id() + " order by pres_id desc");
    }

    public List<Presencas> listaPresencasDisciplinaPeriodo(Entidade entidade, Disciplina disciplina, String p1, String p2) {
        return daog.buscarPorConsulta("from Presencas where pres_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND disciplina_disc_id = " + disciplina.getDisc_id() + " AND  entidade_enti_id = " + entidade.getEnti_id() + "  order by pres_id desc");
    }

    public List<Presencas> listaPresencasDisciplinaData(Entidade entidade, Disciplina disciplina, String data) {
        return daog.buscarPorConsulta("from Presencas where pres_data LIKE '" + data + "%' AND disciplina_disc_id = " + disciplina.getDisc_id() + " AND  entidade_enti_id = " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public Presencas getPresencasAlunoDisciplina(Entidade entidade, Aluno aluno, Disciplina disciplina) {
        return (Presencas) daog.buscarEntidadePorQuery("from Presencas where aluno_alun_id = " + aluno.getAlun_id() + " AND  disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by pres_id desc");
    }

    public void persistir_presencas(Presencas presencas) {
        daog = new DAOGenerico(presencas);
        daog.inserir_actualizar();
    }

    public void remover_presencas(Presencas presencas) {
        daog = new DAOGenerico(presencas);
        daog.excluir();
    }
}
