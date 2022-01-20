/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.gestao;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Horario;

/**
 *
 * @author HJC2K8
 */
public class HorarioDAOImpl {

    private DAOGenerico daog;

    public HorarioDAOImpl() {
        daog = new DAOGenerico(Horario.class);
    }

    public Horario getHorario(int id) {
        return (Horario) daog.buscarEntidadePorQuery("from Horario where hora_id = " + id);
    }

    public Horario getHorario(Entidade entidade, String ini, String fim) {
        return (Horario) daog.buscarEntidadePorQuery("from Horario where entidade_enti_id = " + entidade.getEnti_id() + " AND hora_inicio LIKE '" + ini + "' AND hora_fim LIKE '" + fim + "'");
    }

    public List<Horario> listaHorarios(Entidade entidade) {
        return daog.buscarPorConsulta("from Horario where entidade_enti_id = " + entidade.getEnti_id() + " order by hora_id desc");
    }

    public void persistir_horario(Horario horario) {
        daog = new DAOGenerico(horario);
        daog.inserir_actualizar();
    }

    public void remover_horario(Horario horario) {
        daog = new DAOGenerico(horario);
        daog.excluir();
    }
}
