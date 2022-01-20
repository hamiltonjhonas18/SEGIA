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
import mz.co.centralserver.model.ensino.Media;
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class MediaDAOImpl {

    private DAOGenerico daog;

    public MediaDAOImpl() {
        daog = new DAOGenerico(Media.class);
    }

    public Media getMedia(int id) {
        return (Media) daog.buscarEntidadePorQuery("from Media where medi_id = " + id);
    }

    public Media getMedia(Entidade entidade, Aluno aluno, Disciplina disciplina, AnoLectivo anoLectivo) {
        return (Media) daog.buscarEntidadePorQuery("from Media where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND disciplina_disc_id = " + disciplina.getDisc_id());
    }

    public List<Media> listaMedias(Entidade entidade) {
        return daog.buscarPorConsulta("from Media where entidade_enti_id = " + entidade.getEnti_id() + " order by medi_id desc");
    }

    public List<Media> listaMediasDisciplina(Entidade entidade, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Media where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by medi_id desc");
    }

    public List<Media> listaMediasAluno(Entidade entidade, Aluno aluno) {
        return daog.buscarPorConsulta("from Media where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by medi_id desc");
    }

    public List<Media> listaMediasInscricao(Entidade entidade, Inscricao inscricao) {
        return daog.buscarPorConsulta("from Media where inscricao_insc_id = " + inscricao.getInsc_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by medi_id desc");
    }

    public List<Media> listaMediasTurmaDisciplina(Entidade entidade, Turma turma, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Media where disciplina_disc_id = " + disciplina.getDisc_id() + " AND turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by medi_id desc");
    }

    public List<Media> listaMediasTurmaDisciplinaApurados(Entidade entidade, Turma turma, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Media where disciplina_disc_id = " + disciplina.getDisc_id() + " AND turma_turm_id = " + turma.getTurm_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " AND ((medi_media + medi_media2 + medi_media3)/3) BETWEEN 9.5 AND 13.5 order by medi_id desc");
    }

    public List<Media> listaMediasAlunoSemestre(Entidade entidade, Aluno aluno, int anoLectivo, String semestre) {
        return daog.buscarPorConsulta("from Media where aluno_alun_id = " + aluno.getAlun_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND medi_anoLectivo =  " + anoLectivo + " AND medi_semestre LIKE '" + semestre + "' order by medi_id desc");
    }

    public void persistir_media(Media media) {
        daog = new DAOGenerico(media);
        daog.inserir_actualizar();
    }

    public void remover_media(Media media) {
        daog = new DAOGenerico(media);
        daog.excluir();
    }
}
