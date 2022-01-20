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
import mz.co.centralserver.model.ensino.Sala;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class SalaDAOImpl {

    private DAOGenerico daog;

    public SalaDAOImpl() {
        daog = new DAOGenerico(Sala.class);
    }

    public Sala getSala(int id) {
        return (Sala) daog.buscarEntidadePorQuery("from Sala where sala_id = " + id);
    }

    public Sala getSala(Entidade entidade, String descricao) {
        return (Sala) daog.buscarEntidadePorQuery("from Sala where sala_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Sala> listaSalas(Entidade entidade) {
        return daog.buscarPorConsulta("from Sala where entidade_enti_id = " + entidade.getEnti_id() + " order by sala_id asc");
    }

    public void persistir_sala(Sala sala) {
        daog = new DAOGenerico(sala);
        daog.inserir_actualizar();
    }

    public void remover_sala(Sala sala) {
        daog = new DAOGenerico(sala);
        daog.excluir();
    }
}
