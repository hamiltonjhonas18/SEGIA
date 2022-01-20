/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.vendas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Isencao;

/**
 *
 * @author HJC2K8
 */
public class IsencaoDAOImpl {

    private DAOGenerico daog;

    public IsencaoDAOImpl() {

        daog = new DAOGenerico(Isencao.class);
    }

    public Isencao getIsencao(int id) {
        return (Isencao) daog.buscarEntidadePorQuery("from Isencao where isen_id = " + id);
    }

    public Isencao getIsencao(Entidade entidade, String descricao) {
        return (Isencao) daog.buscarEntidadePorQuery("from Isencao where isen_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Isencao getIsencao(String descricao) {
        return (Isencao) daog.buscarEntidadePorQuery("from Isencao where isen_descricao LIKE '" + descricao + "'");
    }

    public Isencao getIsencaoCodigo(Entidade entidade, String codigo) {
        return (Isencao) daog.buscarEntidadePorQuery("from Isencao where isen_codigo LIKE '" + codigo + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Isencao getIsencaoCodigo(String codigo) {
        return (Isencao) daog.buscarEntidadePorQuery("from Isencao where isen_codigo LIKE '" + codigo + "'");
    }

    public List<Isencao> listaIsencoes(Entidade entidade) {
        return daog.buscarPorConsulta("from Isencao where entidade_enti_id = " + entidade.getEnti_id() + " order by isen_id desc");
    }

    public List<Isencao> listaIsencoes() {
        return daog.buscarPorConsulta("from Isencao order by isen_id desc");
    }

    public void persistir_isencao(Isencao isencao) {
        daog = new DAOGenerico(isencao);
        daog.inserir_actualizar();

    }

    public void remover_isencao(Isencao isencao) {
        daog = new DAOGenerico(isencao);
        daog.excluir();

    }
}
