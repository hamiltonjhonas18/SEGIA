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
import mz.co.centralserver.model.contabilistico.ContaGeral;
import mz.co.centralserver.model.contabilistico.ExtractoContaGeral;
import mz.co.centralserver.model.contabilistico.Lancamento;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ExtractoContaGeralDAOImpl {

    private DAOGenerico daog;

    public ExtractoContaGeralDAOImpl() {
        daog = new DAOGenerico(ExtractoContaGeral.class);
    }

    public ExtractoContaGeral getExtractoContaGeral(int id) {
        return (ExtractoContaGeral) daog.buscarEntidadePorQuery("from ExtractoContaGeral where extc_id = " + id);
    }

    public List<ExtractoContaGeral> listaExtractosContaGeral(Entidade entidade) {
        return daog.buscarPorConsulta("from ExtractoContaGeral where entidade_enti_id = " + entidade.getEnti_id() + " order by extc_id desc");
    }

    public List<ExtractoContaGeral> listaExtractosContaGeral(Entidade entidade, String movimento) {
        return daog.buscarPorConsulta("from ExtractoContaGeral where entidade_enti_id = " + entidade.getEnti_id() + " AND extc_movimento LIKE '" + movimento + "' order by extc_id desc");
    }

    public List<ExtractoContaGeral> listaExtractosContaGeralLancamento(Entidade entidade, Lancamento lancamento) {
        return daog.buscarPorConsulta("from ExtractoContaGeral where lancamento_lan_id = " + lancamento.getLan_id() + " order by extc_id desc");
    }

    public List<ExtractoContaGeral> listaExtractosContaGeralAssociados(Entidade entidade, ContaGeral contaGeral) {
        return daog.buscarPorConsulta("from ExtractoContaGeral where contaGeral_ctg_id = " + contaGeral.getCtg_id() + " order by extc_id desc");
    }

    public List<ExtractoContaGeral> listaExtractosContaGeralPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from ExtractoContaGeral where extc_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by extc_id desc");
    }

    public List<ExtractoContaGeral> listaExtractosContaGeralData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from ExtractoContaGeral where extc_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by extc_id desc");
    }

    public void persistir_extractoContaGeral(ExtractoContaGeral extractoContaGeral) {
        daog = new DAOGenerico(extractoContaGeral);
        daog.inserir_actualizar();
    }

    public void remover_extractoContaGeral(ExtractoContaGeral extractoContaGeral) {
        daog = new DAOGenerico(extractoContaGeral);
        daog.excluir();
    }
}
