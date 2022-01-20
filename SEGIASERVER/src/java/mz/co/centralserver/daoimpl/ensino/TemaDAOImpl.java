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
import mz.co.centralserver.model.ensino.Disciplina;
import mz.co.centralserver.model.ensino.Tema;
import mz.co.centralserver.model.ensino.Docente;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TemaDAOImpl {

    private DAOGenerico daog;

    public TemaDAOImpl() {
        daog = new DAOGenerico(Tema.class);
    }

    public Tema getTema(int id) {
        return (Tema) daog.buscarEntidadePorQuery("from Tema where tema_id = " + id);
    }

    public Tema getTema(Entidade entidade, Curso curso, Disciplina disciplina, String descricao) {
        return (Tema) daog.buscarEntidadePorQuery("from Tema where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " AND tema_descricao LIKE '" + descricao + "'");
    }

    public List<Tema> listaTemas(Entidade entidade, Curso curso, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Tema where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by tema_id desc");
    }

    public void persistir_tema(Tema tema) {
        daog = new DAOGenerico(tema);
        daog.inserir_actualizar();
    }

    public void remover_tema(Tema tema) {
        daog = new DAOGenerico(tema);
        daog.excluir();
    }
}
