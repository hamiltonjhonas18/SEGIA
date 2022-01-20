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
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TurmaDAOImpl {

    private DAOGenerico daog;

    public TurmaDAOImpl() {
        daog = new DAOGenerico(Turma.class);
    }

    public Turma getTurma(int id) {
        return (Turma) daog.buscarEntidadePorQuery("from Turma where turm_id = " + id);
    }

    public Turma getTurma(Entidade entidade, Curso curso, String descricao) {
        return (Turma) daog.buscarEntidadePorQuery("from Turma where turm_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND curso_curs_id = " + curso.getCurs_id());
    }

    public List<Turma> listaTurmas(Entidade entidade) {
        return daog.buscarPorConsulta("from Turma where entidade_enti_id = " + entidade.getEnti_id() + " order by turm_id desc");
    }

    public List<Turma> listaTurmasCurso(Entidade entidade, Curso curso) {
        return daog.buscarPorConsulta("from Turma where entidade_enti_id = " + entidade.getEnti_id() + " AND curso_curs_id = " + curso.getCurs_id() + " order by turm_id desc");
    }

    public List<Turma> listaTurmasEscola(Entidade entidade, Escola escola) {
        return daog.buscarPorConsulta("from Turma where entidade_enti_id = " + entidade.getEnti_id() + " AND escola_esc_id = " + escola.getEsc_id() + " order by turm_id desc");
    }

    public List<Turma> listaTurmasAnoLectivo(Entidade entidade, Escola escola, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from Turma where entidade_enti_id = " + entidade.getEnti_id() + " AND anoLectivo_anol_id = " + anoLectivo.getAnol_id() + " AND escola_esc_id = " + escola.getEsc_id() + " order by turm_id desc");
    }

    public void persistir_turma(Turma turma) {
        daog = new DAOGenerico(turma);
        daog.inserir_actualizar();
    }

    public void remover_turma(Turma turma) {
        daog = new DAOGenerico(turma);
        daog.excluir();
    }
}
