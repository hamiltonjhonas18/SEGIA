/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.recursoshumanos;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Habilitacao;

/**
 *
 * @author HJC2K8
 */
public class HabilitacaoDAOImpl {

    private DAOGenerico daog;

    public HabilitacaoDAOImpl() {
        daog = new DAOGenerico(Habilitacao.class);
    }

    public Habilitacao getHabilitacao(int id) {
        return (Habilitacao) daog.buscarEntidadePorQuery("from Habilitacao where habi_id = " + id);
    }

    public Habilitacao getHabilitacao(Entidade entidade, String descricao) {
        return (Habilitacao) daog.buscarEntidadePorQuery("from Habilitacao where habi_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Habilitacao> listaHabilitacoes(Entidade entidade) {
        return daog.buscarPorConsulta("from Habilitacao where entidade_enti_id = " + entidade.getEnti_id() + " order by habi_id asc");
    }

    public void persistir_habilitacao(Habilitacao habilitacao) {
        daog = new DAOGenerico(habilitacao);
        daog.inserir_actualizar();
    }

    public void remover_habilitacao(Habilitacao habilitacao) {
        daog = new DAOGenerico(habilitacao);
        daog.excluir();
    }
}
