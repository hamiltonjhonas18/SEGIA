/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.contabilistico;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.contabilistico.Moeda;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class MoedaDAOImpl {

    private DAOGenerico daog;

    public MoedaDAOImpl() {
        daog = new DAOGenerico(Moeda.class);
    }

    public Moeda getMoeda(int id) {
        return (Moeda) daog.buscarEntidadePorQuery("from Moeda where moe_id = " + id);
    }

    public Moeda getMoeda(Entidade entidade, String descricao) {
        return (Moeda) daog.buscarEntidadePorQuery("from Moeda where entidade_enti_id = " + entidade.getEnti_id() + " AND moe_nome LIKE '" + descricao + "'");
    }

    public List<Moeda> listaMoedas(Entidade entidade) {
        return daog.buscarPorConsulta("from Moeda where entidade_enti_id = " + entidade.getEnti_id() + " order by moe_id desc");
    }

    public void persistir_moeda(Moeda moeda) {
        daog = new DAOGenerico(moeda);
        daog.inserir_actualizar();
    }

    public void remover_moeda(Moeda moeda) {
        daog = new DAOGenerico(moeda);
        daog.excluir();
    }
}
