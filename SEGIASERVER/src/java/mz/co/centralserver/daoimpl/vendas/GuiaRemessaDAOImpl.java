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
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.vendas.GuiaRemessa;

/**
 *
 * @author HJC2K8
 */
public class GuiaRemessaDAOImpl {

    private DAOGenerico daog;

    public GuiaRemessaDAOImpl() {

        daog = new DAOGenerico(GuiaRemessa.class);
    }

    public GuiaRemessa getGuiaRemessa(int id) {
        return (GuiaRemessa) daog.buscarEntidadePorQuery("from GuiaRemessa where guia_id = " + id);
    }

    public GuiaRemessa getGuiaRemessa(Entidade entidade, String descricao) {
        return (GuiaRemessa) daog.buscarEntidadePorQuery("from GuiaRemessa where guia_referencia LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<GuiaRemessa> listaGuiasRemessa(Entidade entidade) {
        return daog.buscarPorConsulta("from GuiaRemessa where entidade_enti_id  = " + entidade.getEnti_id() + " order by guia_id desc");
    }

    public List<GuiaRemessa> listaGuiasRemessaTipo(Entidade entidade, String descricao) {
        return daog.buscarPorConsulta("from GuiaRemessa where entidade_enti_id  = " + entidade.getEnti_id() + " AND guia_tipo LIKE '" + descricao + "' order by guia_id desc");
    }

    public List<GuiaRemessa> listaGuiasRemessaFactura(Entidade entidade, Factura factura) {
        return daog.buscarPorConsulta("from GuiaRemessa where factura_fact_id = " + factura.getFact_id() + " AND entidade_enti_id  = " + entidade.getEnti_id() + " order by guia_id desc");
    }

    public List<GuiaRemessa> listaGuiasRemessaCliente(Entidade entidade, Cliente cliente) {
        return daog.buscarPorConsulta("from GuiaRemessa where cliente_clie_id = " + cliente.getClie_id() + " AND entidade_enti_id  = " + entidade.getEnti_id() + " order by guia_id desc");
    }

    public List<GuiaRemessa> listaGuiasRemessaPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from GuiaRemessa where guia_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by guia_id desc");
    }

    public List<GuiaRemessa> listaGuiasRemessaData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from GuiaRemessa where guia_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by guia_id desc");
    }

    public void persistir_guiaRemessa(GuiaRemessa guiaRemessa) {
        daog = new DAOGenerico(guiaRemessa);
        daog.inserir_actualizar();

    }

    public void remover_guiaRemessa(GuiaRemessa guiaRemessa) {
        daog = new DAOGenerico(guiaRemessa);
        daog.excluir();

    }
}
