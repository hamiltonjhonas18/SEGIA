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
import mz.co.centralserver.model.ensino.Exame;
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.SalaExame;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ExameDAOImpl {

    private DAOGenerico daog;

    public ExameDAOImpl() {
        daog = new DAOGenerico(Exame.class);
    }

    public Exame getExame(int id) {
        return (Exame) daog.buscarEntidadePorQuery("from Exame where exam_id = " + id);
    }

    public Exame getExame(Entidade entidade, Aluno aluno, Disciplina disciplina, AnoLectivo anoLectivo, String semestre) {
        return (Exame) daog.buscarEntidadePorQuery("from Exame where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND exam_semestre LIKE '" + semestre + "' AND disciplina_disc_id = " + disciplina.getDisc_id());
    }

    public List<Exame> listaExames(Entidade entidade) {
        return daog.buscarPorConsulta("from Exame where entidade_enti_id = " + entidade.getEnti_id() + " order by exam_id desc");
    }

    public List<Exame> listaExamesDisciplina(Entidade entidade, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Exame where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by exam_id desc");
    }

    public List<Exame> listaExamesSala(Entidade entidade, SalaExame salaExame) {
        return daog.buscarPorConsulta("from Exame where salaExame_salae_id = " + salaExame.getSalae_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by exam_id desc");
    }

    public List<Exame> listaExamesAluno(Entidade entidade, Aluno aluno) {
        return daog.buscarPorConsulta("from Exame where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by exam_id desc");
    }

    public List<Exame> listaExamesInscricao(Entidade entidade, Inscricao inscricao) {
        return daog.buscarPorConsulta("from Exame where inscricao_insc_id = " + inscricao.getInsc_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by exam_id desc");
    }

    public List<Exame> listaExamesAlunoSemestre(Entidade entidade, Aluno aluno, int anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Exame where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo + " AND exam_semestre LIKE '" + semestre + "' order by exam_id desc");
    }

    public void persistir_exame(Exame exame) {
        daog = new DAOGenerico(exame);
        daog.inserir_actualizar();
    }

    public void remover_exame(Exame exame) {
        daog = new DAOGenerico(exame);
        daog.excluir();
    }
}
