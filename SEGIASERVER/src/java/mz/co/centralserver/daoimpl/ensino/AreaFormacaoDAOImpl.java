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
import mz.co.centralserver.model.ensino.AreaFormacao;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class AreaFormacaoDAOImpl {

    private DAOGenerico daog;

    public AreaFormacaoDAOImpl() {
        daog = new DAOGenerico(AreaFormacao.class);
    }

    public AreaFormacao getAreaFormacao(int id) {
        return (AreaFormacao) daog.buscarEntidadePorQuery("from AreaFormacao where aref_id = " + id);
    }

    public AreaFormacao getAreaFormacao(Entidade entidade, String descricao) {
        return (AreaFormacao) daog.buscarEntidadePorQuery("from AreaFormacao where aref_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<AreaFormacao> listaAreasFormacao(Entidade entidade) {
        return daog.buscarPorConsulta("from AreaFormacao where entidade_enti_id = " + entidade.getEnti_id() + " order by aref_descricao asc");
    }

    public List<AreaFormacao> listaAreasFormacao() {
        return daog.buscarPorConsulta("from AreaFormacao order by aref_descricao asc");
    }

    public void persistir_areaFormacao(AreaFormacao areaFormacao) {
        daog = new DAOGenerico(areaFormacao);
        daog.inserir_actualizar();
    }

    public void remover_areaFormacao(AreaFormacao areaFormacao) {
        daog = new DAOGenerico(areaFormacao);
        daog.excluir();
    }
}
