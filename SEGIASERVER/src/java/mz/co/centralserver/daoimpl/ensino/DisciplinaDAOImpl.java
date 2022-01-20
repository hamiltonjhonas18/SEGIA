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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class DisciplinaDAOImpl {

    private DAOGenerico daog;

    public DisciplinaDAOImpl() {
        daog = new DAOGenerico(Disciplina.class);
    }

    public Disciplina getDisciplina(int id) {
        return (Disciplina) daog.buscarEntidadePorQuery("from Disciplina where disc_id = " + id);
    }

    public Disciplina getDisciplina(Entidade entidade, String descricao) {
        return (Disciplina) daog.buscarEntidadePorQuery("from Disciplina where disc_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Disciplina> listaDisciplinas(Entidade entidade) {
        return daog.buscarPorConsulta("from Disciplina where entidade_enti_id = " + entidade.getEnti_id() + " order by disc_descricao asc");
    }

    public List<Disciplina> listaDisciplinas() {
        return daog.buscarPorConsulta("from Disciplina where  order by disc_descricao asc");
    }

    public void persistir_disciplina(Disciplina disciplina) {
        daog = new DAOGenerico(disciplina);
        daog.inserir_actualizar();
    }

    public void remover_disciplina(Disciplina disciplina) {
        daog = new DAOGenerico(disciplina);
        daog.excluir();
    }
}
