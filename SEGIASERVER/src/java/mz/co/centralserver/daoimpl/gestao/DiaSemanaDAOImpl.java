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
import mz.co.centralserver.model.gestao.DiaSemana;

/**
 *
 * @author HJC2K8
 */
public class DiaSemanaDAOImpl {

    private DAOGenerico daog;

    public DiaSemanaDAOImpl() {
        daog = new DAOGenerico(DiaSemana.class);
    }

    public DiaSemana getDiaSemana(int id) {
        return (DiaSemana) daog.buscarEntidadePorQuery("from DiaSemana where dias_id = " + id);
    }

    public DiaSemana getDiaSemana(String descricao) {
        return (DiaSemana) daog.buscarEntidadePorQuery("from DiaSemana where dias_descricao LIKE '" + descricao + "'");
    }

    public List<DiaSemana> listaDiaSemanas() {
        return daog.buscarPorConsulta("from DiaSemana order by dias_id asc");
    }

    public void persistir_diaSemana(DiaSemana diaSemana) {
        daog = new DAOGenerico(diaSemana);
        daog.inserir_actualizar();
    }
}
