/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ispc;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.ispc.TipoDespesa;

/**
 *
 * @author HJC2K8
 */
public class TipoDespesaDAOImpl {

    private DAOGenerico daog;

    public TipoDespesaDAOImpl() {
        daog = new DAOGenerico(TipoDespesa.class);
    }

    public TipoDespesa getTipoDespesa(int id) {
        return (TipoDespesa) daog.buscarEntidadePorQuery("from TipoDespesa where tipd_id = " + id);
    }

    public TipoDespesa getTipoDespesa(Entidade entidade, String descricao) {
        return (TipoDespesa) daog.buscarEntidadePorQuery("from TipoDespesa where tipd_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public TipoDespesa getTipoDespesaReferenica(Entidade entidade, String descricao) {
        return (TipoDespesa) daog.buscarEntidadePorQuery("from TipoDespesa where tipd_categoria LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<TipoDespesa> listaTipoDespesas(Entidade entidade) {
        return daog.buscarPorConsulta("from TipoDespesa where entidade_enti_id = " + entidade.getEnti_id() + " order by tipd_id desc");

    }

    public List<TipoDespesa> listaTipoDespesasCategoria(Entidade entidade, String categoria) {
        return daog.buscarPorConsulta("from TipoDespesa where tipd_categoria LIKE '" + categoria + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by tipd_id desc");
    }

    public List<TipoDespesa> listaTipoDespesasPeriodo(Entidade entidade, String periodo) {
        return daog.buscarPorConsulta("from TipoDespesa where tipd_periodo LIKE '" + periodo + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by tipd_id desc");
    }

    public List<TipoDespesa> listaTipoDespesasCategoriaIntervalo(Entidade entidade, String categoria, int primeiro, int limite) {
        return daog.buscarPorConsultaIntervalo("from TipoDespesa where tipd_categoria LIKE '" + categoria + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by tipd_id desc", primeiro, limite);
    }

    public void persistir_tipoDespesa(TipoDespesa tipoDespesa) {
        daog = new DAOGenerico(tipoDespesa);
        daog.inserir_actualizar();
    }

    public void remover_tipoDespesa(TipoDespesa tipoDespesa) {
        daog = new DAOGenerico(tipoDespesa);
        daog.excluir();
    }

}
