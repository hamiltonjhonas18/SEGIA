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
import mz.co.centralserver.model.ensino.DisciplinaDocente;
import mz.co.centralserver.model.ensino.Docente;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class DisciplinaDocenteDAOImpl {

    private DAOGenerico daog;

    public DisciplinaDocenteDAOImpl() {
        daog = new DAOGenerico(DisciplinaDocente.class);
    }

    public DisciplinaDocente getDisciplinaDocente(int id) {
        return (DisciplinaDocente) daog.buscarEntidadePorQuery("from DisciplinaDocente where disd_id = " + id);
    }

    public List<DisciplinaDocente> listaDisciplinasDocente(Entidade entidade) {
        return daog.buscarPorConsulta("from DisciplinaDocente where entidade_enti_id = " + entidade.getEnti_id() + " order by disd_id desc");
    }

    public List<DisciplinaDocente> listaDisciplinasDocenteDisciplina(Entidade entidade, Disciplina disciplina) {
        return daog.buscarPorConsulta("from DisciplinaDocente where disciplina_disc_id = " + disciplina.getDisc_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by disd_id desc");
    }

    public List<DisciplinaDocente> listaDisciplinasDocentesDocente(Entidade entidade, Docente docente) {
        return daog.buscarPorConsulta("from DisciplinaDocente where docente_doce_id = " + docente.getDoce_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by disd_id desc");
    }

    public void persistir_disciplinaDocente(DisciplinaDocente disciplinaDocente) {
        daog = new DAOGenerico(disciplinaDocente);
        daog.inserir_actualizar();
    }

    public void remover_disciplinaDocente(DisciplinaDocente disciplinaDocente) {
        daog = new DAOGenerico(disciplinaDocente);
        daog.excluir();
    }
}
