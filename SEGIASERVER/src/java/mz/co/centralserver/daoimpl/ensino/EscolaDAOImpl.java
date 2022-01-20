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
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class EscolaDAOImpl {

    private DAOGenerico daog;

    public EscolaDAOImpl() {
        daog = new DAOGenerico(Escola.class);
    }

    public Escola getEscola(int id) {
        return (Escola) daog.buscarEntidadePorQuery("from Escola where esc_id = " + id);
    }

    public Escola getEscola(String codEscola) {
        return (Escola) daog.buscarEntidadePorQuery("from Escola where cod_escola LIKE '" + codEscola + "'");
    }

    public Escola getEscola(Entidade entidade, String provincia, String descricao) {
        return (Escola) daog.buscarEntidadePorQuery("from Escola where esc_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND esc_provincia LIKE '" + provincia + "'");
    }

    public List<Escola> listaEscolas(Entidade entidade) {
        return daog.buscarPorConsulta("from Escola where entidade_enti_id = " + entidade.getEnti_id() + " order by esc_id");
    }

    public List<Escola> listaEscolasProvincia(Entidade entidade, String provincia) {
        return daog.buscarPorConsulta("from Escola where entidade_enti_id = " + entidade.getEnti_id() + " AND esc_provincia LIKE '" + provincia + "' order by esc_id");
    }

    public void persistir_escola(Escola escola) {
        daog = new DAOGenerico(escola);
        daog.inserir_actualizar();
    }

    public void remover_escola(Escola escola) {
        daog = new DAOGenerico(escola);
        daog.excluir();
    }
}
