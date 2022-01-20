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
import mz.co.centralserver.model.ensino.Sumario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class SumarioDAOImpl {

    private DAOGenerico daog;

    public SumarioDAOImpl() {
        daog = new DAOGenerico(Sumario.class);
    }

    public Sumario getSumario(int id) {
        return (Sumario) daog.buscarEntidadePorQuery("from Sumario where suma_id = " + id);
    }

    public Sumario getSumario(Entidade entidade, Curso curso, Disciplina disciplina, String descricao) {
        return (Sumario) daog.buscarEntidadePorQuery("from Sumario where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " AND suma_descricao LIKE '" + descricao + "'");
    }

    public List<Sumario> listaSumarios(Entidade entidade, Curso curso, Disciplina disciplina) {
        return daog.buscarPorConsulta("from Sumario where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by suma_id desc");
    }

    public void persistir_sumario(Sumario sumario) {
        daog = new DAOGenerico(sumario);
        daog.inserir_actualizar();
    }

    public void remover_sumario(Sumario sumario) {
        daog = new DAOGenerico(sumario);
        daog.excluir();
    }
}
