/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ip;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.ip.Codigo;

/**
 *
 * @author HJC2K8
 */
public class CodigoDAOImpl {

    private DAOGenerico daog;

    public CodigoDAOImpl() {
        daog = new DAOGenerico(Codigo.class);
    }

    public Codigo getCodigo(int id) {
        return (Codigo) daog.buscarEntidadePorQuery("from Codigo where cod_id = " + id);
    }

    public Codigo getCodigo(Entidade entidade, String descricao) {
        return (Codigo) daog.buscarEntidadePorQuery("from Codigo where cod_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Codigo getCodigoReferenica(Entidade entidade, String descricao) {
        return (Codigo) daog.buscarEntidadePorQuery("from Codigo where cod_categoria LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Codigo> listaCodigos(Entidade entidade) {
        return daog.buscarPorConsulta("from Codigo where entidade_enti_id = " + entidade.getEnti_id() + " order by cod_id asc");

    }

    public void persistir_codigo(Codigo codigo) {
        daog = new DAOGenerico(codigo);
        daog.inserir_actualizar();
    }

    public void remover_codigo(Codigo codigo) {
        daog = new DAOGenerico(codigo);
        daog.excluir();
    }
}
