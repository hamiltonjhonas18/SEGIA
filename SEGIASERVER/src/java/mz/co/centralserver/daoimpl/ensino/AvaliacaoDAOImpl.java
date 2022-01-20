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
import mz.co.centralserver.model.ensino.Avaliacao;
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class AvaliacaoDAOImpl {

    private DAOGenerico daog;

    public AvaliacaoDAOImpl() {
        daog = new DAOGenerico(Avaliacao.class);
    }

    public Avaliacao getAvaliacao(int id) {
        return (Avaliacao) daog.buscarEntidadePorQuery("from Avaliacao where aval_id = " + id);
    }

    public List<Avaliacao> listaAvaliacoes() {
        return daog.buscarPorConsulta("from Avaliacao order by aval_id desc");
    }

    public List<Avaliacao> listaAvaliacoes(Entidade entidade) {
        return daog.buscarPorConsulta("from Avaliacao where entidade_enti_id = " + entidade.getEnti_id() + " order by aval_id desc");
    }

    public List<Avaliacao> listaAvaliacoesAluno(Entidade entidade, Aluno aluno) {
        return daog.buscarPorConsulta("from Avaliacao where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by aval_id desc");
    }

    public List<Avaliacao> listaAvaliacoesAlunoSemestre(Entidade entidade, Aluno aluno, int anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Avaliacao where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND aval_anoLectivo =  " + anoLectivo + " AND aval_semestre LIKE '" + semestre + "' order by aval_id desc");
    }

    public void persistir_avaliacao(Avaliacao avaliacao) {
        daog = new DAOGenerico(avaliacao);
        daog.inserir_actualizar();
    }

    public void remover_avaliacao(Avaliacao avaliacao) {
        daog = new DAOGenerico(avaliacao);
        daog.excluir();
    }
}
