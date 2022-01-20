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
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class AlunoDAOImpl {

    private DAOGenerico daog;

    public AlunoDAOImpl() {

        daog = new DAOGenerico(Aluno.class);
    }

    public Aluno getAluno(int id) {
        return (Aluno) daog.buscarEntidadePorQuery("from Aluno where alun_id = " + id);
    }

    public Aluno getAlunoPessoa(int id) {
        return (Aluno) daog.buscarEntidadePorQuery("from Aluno where pessoa_pess_id = " + id);
    }

    public List<Aluno> listaAlunos() {
        return daog.buscarPorConsulta("from Aluno order by alun_id asc");
    }

    public List<Aluno> listaAlunos(Entidade entidade) {
        return daog.buscarPorConsulta("from Aluno where entidade_enti_id = " + entidade.getEnti_id() + " order by alun_id asc");
    }

    public List<Aluno> listaAlunosTurma(Entidade entidade, Turma turma) {
        return daog.buscarPorConsulta("from Aluno where entidade_enti_id = " + entidade.getEnti_id() + " AND turma_turm_id = " + turma.getTurm_id() + " order by alun_id asc");
    }

    public List<Aluno> listaAlunosEscola(Entidade entidade, Escola escola) {
        return daog.buscarPorConsulta("from Aluno where entidade_enti_id = " + entidade.getEnti_id() + " AND escola_esc_id = " + escola.getEsc_id() + " order by alun_id asc");
    }

    public List<Aluno> listaAlunosProvincia(Entidade entidade, String provincia) {
        return daog.buscarPorConsulta("from Aluno where entidade_enti_id = " + entidade.getEnti_id() + " AND alun_provincia LIKE '" + provincia + "' order by alun_id asc");
    }

    public List<Aluno> listaAlunosDistrito(Entidade entidade, String distrito) {
        return daog.buscarPorConsulta("from Aluno where entidade_enti_id = " + entidade.getEnti_id() + " AND alun_distrito LIKE '" + distrito + "' order by alun_id asc");
    }

    public List<Aluno> listaAlunos(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from Aluno where alun_status LIKE '" + status + "' AND entidade_enti_id = " + entidade.getEnti_id() + "  order by alun_id asc");
    }

    public List<Aluno> listaAlunosEscolaNecessitados(Entidade entidade, Escola escola) {
        return daog.buscarPorConsulta("from Aluno where entidade_enti_id = " + entidade.getEnti_id() + " AND escola_esc_id = " + escola.getEsc_id() + " AND alun_deficiente = 1 order by alun_id asc");
    }

    public Aluno getAlunoBagdnumber(String alun_badgnumber) {
        return (Aluno) daog.buscarEntidadePorQuery("from Aluno where alun_badgnumber LIKE '" + alun_badgnumber + "'");
    }

    public void persistir_aluno(Aluno aluno) {
        daog = new DAOGenerico(aluno);
        daog.inserir_actualizar();
    }

    public void remover_aluno(Aluno aluno) {
        daog = new DAOGenerico(aluno);
        daog.excluir();
    }
}
