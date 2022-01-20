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
import mz.co.centralserver.model.recursoshumanos.Administracao;

/**
 *
 * @author HJC2K8
 */
public class AdministracaoDAOImpl {

    private DAOGenerico daog;

    public AdministracaoDAOImpl() {
        daog = new DAOGenerico(Administracao.class);
    }

    public Administracao getAdministracao(int id) {
        return (Administracao) daog.buscarEntidadePorQuery("from Administracao where adm_id = " + id);
    }

    public Administracao getAdministracao(Entidade entidade, String descricao) {
        return (Administracao) daog.buscarEntidadePorQuery("from Administracao where adm_nome LIKE '" + descricao + "'  AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Administracao> listaAdministracoes(Entidade entidade) {
        return daog.buscarPorConsulta("from Administracao where entidade_enti_id = " + entidade.getEnti_id() + " order by adm_nome asc");
    }

    public List<Administracao> listaAdministracoesEntidade(Entidade entidade) {
        return daog.buscarPorConsulta("from Administracao empresa_enti_id = " + entidade.getEnti_id() + " order by adm_nome desc");
    }

    public void persistir_administracao(Administracao administracao) {
        daog = new DAOGenerico(administracao);
        daog.inserir_actualizar();
    }
}
