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
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class InscricaoDAOImpl {

    private DAOGenerico daog;

    public InscricaoDAOImpl() {
        daog = new DAOGenerico(Inscricao.class);
    }

    public Inscricao getInscricao(int id) {
        return (Inscricao) daog.buscarEntidadePorQuery("from Inscricao where insc_id = " + id);
    }

    public Inscricao getInscricao(Entidade entidade, String referencia) {
        return (Inscricao) daog.buscarEntidadePorQuery("from Inscricao where insc_referencia LIKE '" + referencia + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Inscricao getInscricaoAnoLectivoSemestre(Entidade entidade, AnoLectivo anoLectivo, String semestre, Aluno aluno) {
        return (Inscricao) daog.buscarEntidadePorQuery("from Inscricao where anoLectivo_anol_id = " + anoLectivo.getAnol_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND insc_semestre LIKE '" + semestre + "' AND aluno_alun_id = " + aluno.getAlun_id());
    }

    public List<Inscricao> listaInscricoes(Entidade entidade) {
        return daog.buscarPorConsulta("from Inscricao where entidade_enti_id = " + entidade.getEnti_id() + " order by insc_id desc");
    }

    public List<Inscricao> listaInscricoesOrigem(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from Inscricao where entidade_enti_id = " + entidade.getEnti_id() + " AND insc_origem LIKE '" + status + "' order by insc_id desc");
    }

    public List<Inscricao> listaInscricoesCurso(Entidade entidade, Curso curso) {
        return daog.buscarPorConsulta("from Inscricao where curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by insc_id desc");
    }

    public List<Inscricao> listaInscricoesAluno(Entidade entidade, Aluno aluno) {
        return daog.buscarPorConsulta("from Inscricao where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by insc_id desc");
    }

    public List<Inscricao> listaInscricoesTurma(Entidade entidade, Turma turma) {
        return daog.buscarPorConsulta("from Inscricao where turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by insc_id desc");
    }

    public List<Inscricao> listaInscricoesAnoLectivo(Entidade entidade, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from Inscricao where anoLectivo_anol_id = " + anoLectivo.getAnol_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by insc_id desc");
    }

    public List<Inscricao> listaInscricoesMelhoresAno(Entidade entidade, AnoLectivo anoLectivo, int limite) {
        return daog.buscarPorConsultaLimite("from Inscricao where anoLectivo_anol_id = " + anoLectivo.getAnol_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND insc_notaFinal >=9.5 order by insc_notaFinal desc", limite);
    }

    public List<Inscricao> listaInscricoesAno(Entidade entidade, String ano) {
        return daog.buscarPorConsulta("from Inscricao where insc_anoLectivo LIKE '" + ano + "' AND entidade_enti_id =  " + entidade.getEnti_id() + " order by insc_id desc");
    }

    public void persistir_inscricao(Inscricao inscricao) {
        daog = new DAOGenerico(inscricao);
        daog.inserir_actualizar();
    }

    public void remover_inscricao(Inscricao inscricao) {
        daog = new DAOGenerico(inscricao);
        daog.excluir();
    }
}
