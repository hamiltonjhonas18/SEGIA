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
import mz.co.centralserver.model.ensino.SalaExame;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Sala;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class SalaExameDAOImpl {

    private DAOGenerico daog;

    public SalaExameDAOImpl() {
        daog = new DAOGenerico(SalaExame.class);
    }

    public SalaExame getSalaExame(int id) {
        return (SalaExame) daog.buscarEntidadePorQuery("from SalaExame where salae_id = " + id);
    }

    public SalaExame getSalaExame(Entidade entidade, Curso curso, Sala sala, AnoLectivo anoLectivo, Disciplina disciplina) {
        return (SalaExame) daog.buscarEntidadePorQuery("from SalaExame where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " AND sala_sala_id = " + sala.getSala_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND curso_curs_id =  " + curso.getCurs_id());
    }

    public List<SalaExame> listaSalaExame(Entidade entidade) {
        return daog.buscarPorConsulta("from SalaExame where entidade_enti_id = " + entidade.getEnti_id() + " order by salae_id desc");
    }

    public List<SalaExame> listaSalaExameSala(Entidade entidade, Curso curso, Sala sala) {
        return daog.buscarPorConsulta("from SalaExame where sala_sala_id = " + sala.getSala_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND curso_curs_id = " + curso.getCurs_id() + " order by salae_id desc");
    }

    public List<SalaExame> listaSalaExameCursoAno(Entidade entidade, Curso curso, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from SalaExame where curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " order by salae_id desc");
    }

    public List<SalaExame> listaSalaExameAno(Entidade entidade, Sala sala, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from SalaExame where sala_sala_id = " + sala.getSala_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " order by salae_id desc");
    }

    public List<SalaExame> listaSalaExameDisciplina(Entidade entidade, Curso curso, Disciplina disciplina, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from SalaExame where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " order by salae_id desc");
    }

    public void persistir_salaExame(SalaExame salaExame) {
        daog = new DAOGenerico(salaExame);
        daog.inserir_actualizar();
    }

    public void remover_salaExame(SalaExame salaExame) {
        daog = new DAOGenerico(salaExame);
        daog.excluir();
    }
}
