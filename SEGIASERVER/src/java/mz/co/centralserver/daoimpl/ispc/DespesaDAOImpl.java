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
import mz.co.centralserver.model.ispc.Despesa;

/**
 *
 * @author HJC2K8
 */
public class DespesaDAOImpl {

    private DAOGenerico daog;

    public DespesaDAOImpl() {
        daog = new DAOGenerico(Despesa.class);
    }

        public Despesa getDespesa(int id) {
        return (Despesa) daog.buscarEntidadePorQuery("from Despesa where desp_id = " + id);
    }

    public List<Despesa> listaDespesas(Entidade entidade) {
        return daog.buscarPorConsulta("from Despesa where entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc");
    }

    public List<Despesa> listaDespesasLimit(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Despesa where entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc", limite);
    }

    public List<Despesa> listaDespesasIntervalo(Entidade entidade, int primeiro, int limite) {
        return daog.buscarPorConsultaIntervalo("from Despesa where entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc", primeiro, limite);
    }

    public List<Despesa> listaDespesasUsuario(Entidade entidade, int id) {
        return daog.buscarPorConsulta("from Despesa where usuario_usua_id = " + id + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc");
    }

    public List<Despesa> listaDespesasNuit(Entidade entidade, long nuit) {
        return daog.buscarPorConsulta("from Despesa where desp_nuit = " + nuit + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc");
    }

    public List<Despesa> listaDespesasTipoDespesa(Entidade entidade, int id) {
        return daog.buscarPorConsulta("from Despesa where tipoDespesa_tipd_id = " + id + "  AND entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc");
    }

    public List<Despesa> listaDespesasStatus(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from Despesa where desp_status LIKE '" + status + "' AND entidade_enti_id = " + entidade.getEnti_id() + "  order by desp_id desc");
    }

    public List<Despesa> listaDespesasPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Despesa where desp_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc");
    }

    public List<Despesa> listaDespesasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Despesa where desp_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by desp_id desc");
    }

    public void persistir_despesa(Despesa despesa) {
        daog = new DAOGenerico(despesa);
        daog.inserir_actualizar();
    }

    public void remover_despesa(Despesa despesa) {
        daog = new DAOGenerico(despesa);
        daog.excluir();
    }
}
