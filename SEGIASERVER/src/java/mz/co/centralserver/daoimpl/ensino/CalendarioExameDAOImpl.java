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
import mz.co.centralserver.model.ensino.CalendarioExame;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class CalendarioExameDAOImpl {

    private DAOGenerico daog;

    public CalendarioExameDAOImpl() {
        daog = new DAOGenerico(CalendarioExame.class);
    }

    public CalendarioExame getCalendarioExame(int id) {
        return (CalendarioExame) daog.buscarEntidadePorQuery("from CalendarioExame where calee_id = " + id);
    }

    public CalendarioExame getCalendarioExame(Entidade entidade, Curso curso, AnoLectivo anoLectivo, Disciplina disciplina) {
        return (CalendarioExame) daog.buscarEntidadePorQuery("from CalendarioExame where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id());
    }

    public List<CalendarioExame> listaCalendarioExame(Entidade entidade) {
        return daog.buscarPorConsulta("from CalendarioExame where entidade_enti_id = " + entidade.getEnti_id() + " order by calee_id desc");
    }

    public List<CalendarioExame> listaCalendarioExameDisciplina(Entidade entidade, Curso curso, Disciplina disciplina) {
        return daog.buscarPorConsulta("from CalendarioExame where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by calee_id desc");
    }

    public List<CalendarioExame> listaCalendarioExameAno(Entidade entidade, Curso curso, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from CalendarioExame where entidade_enti_id =  " + entidade.getEnti_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " order by calee_id desc");
    }

    public void persistir_calendarioExame(CalendarioExame calendarioExame) {
        daog = new DAOGenerico(calendarioExame);
        daog.inserir_actualizar();
    }

    public void remover_calendarioExame(CalendarioExame calendarioExame) {
        daog = new DAOGenerico(calendarioExame);
        daog.excluir();
    }
}
