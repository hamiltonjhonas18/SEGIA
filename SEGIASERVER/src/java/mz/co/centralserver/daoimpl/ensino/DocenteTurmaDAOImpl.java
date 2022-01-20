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
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.ensino.DocenteTurma;
import mz.co.centralserver.model.ensino.Docente;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class DocenteTurmaDAOImpl {

    private DAOGenerico daog;

    public DocenteTurmaDAOImpl() {
        daog = new DAOGenerico(DocenteTurma.class);
    }

    public DocenteTurma getDocenteTurma(int id) {
        return (DocenteTurma) daog.buscarEntidadePorQuery("from DocenteTurma where doct_id = " + id);
    }

    public List<DocenteTurma> listaDocentesTurmas(Entidade entidade) {
        return daog.buscarPorConsulta("from DocenteTurma where entidade_enti_id = " + entidade.getEnti_id() + " order by doct_id desc");
    }

    public List<DocenteTurma> listaDocentesTurmasTurma(Entidade entidade, Turma turma) {
        return daog.buscarPorConsulta("from DocenteTurma where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by doct_id desc");
    }

    public List<DocenteTurma> listaDocentesTurmasDocente(Entidade entidade, Docente docente) {
        return daog.buscarPorConsulta("from DocenteTurma where docente_doce_id = " + docente.getDoce_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by doct_id desc");
    }

    public void persistir_docenteTurma(DocenteTurma docenteTurma) {
        daog = new DAOGenerico(docenteTurma);
        daog.inserir_actualizar();
    }

    public void remover_docenteTurma(DocenteTurma docenteTurma) {
        daog = new DAOGenerico(docenteTurma);
        daog.excluir();
    }
}
