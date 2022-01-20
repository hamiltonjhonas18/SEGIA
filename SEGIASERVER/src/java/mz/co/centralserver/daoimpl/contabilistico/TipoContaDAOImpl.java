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
import mz.co.centralserver.model.contabilistico.TipoConta;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TipoContaDAOImpl {

    private DAOGenerico daog;

    public TipoContaDAOImpl() {
        daog = new DAOGenerico(TipoConta.class);
    }

    public TipoConta getTipoConta(int id) {
        return (TipoConta) daog.buscarEntidadePorQuery("from TipoConta where tip_id = " + id);
    }

    public TipoConta getTipoConta(Entidade entidade, String descricao) {
        return (TipoConta) daog.buscarEntidadePorQuery("from TipoConta where entidade_enti_id = " + entidade.getEnti_id() + " AND tip_nome LIKE '" + descricao + "'");
    }

    public List<TipoConta> listaTiposConta(Entidade entidade) {
        return daog.buscarPorConsulta("from TipoConta where entidade_enti_id = " + entidade.getEnti_id() + " order by tip_nome desc");
    }

    public void persistir_tipoConta(TipoConta tipoConta) {
        daog = new DAOGenerico(tipoConta);
        daog.inserir_actualizar();
    }

    public void remover_tipoConta(TipoConta tipoConta) {
        daog = new DAOGenerico(tipoConta);
        daog.excluir();
    }
}
