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
import mz.co.centralserver.model.ensino.Turno;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TurnoDAOImpl {

    private DAOGenerico daog;

    public TurnoDAOImpl() {
        daog = new DAOGenerico(Turno.class);
    }

    public Turno getTurno(int id) {
        return (Turno) daog.buscarEntidadePorQuery("from Turno where turn_id = " + id);
    }

    public Turno getTurno(Entidade entidade, String descricao) {
        return (Turno) daog.buscarEntidadePorQuery("from Turno where turn_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Turno> listaTurnos(Entidade entidade) {
        return daog.buscarPorConsulta("from Turno where entidade_enti_id = " + entidade.getEnti_id() + " order by turn_descricao asc");
    }

    public void persistir_turno(Turno turno) {
        daog = new DAOGenerico(turno);
        daog.inserir_actualizar();
    }

    public void remover_turno(Turno turno) {
        daog = new DAOGenerico(turno);
        daog.excluir();
    }
}
