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
import mz.co.centralserver.model.contabilistico.Pagamento;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.contabilistico.Moeda;
import mz.co.centralserver.model.vendas.Caixa;
import mz.co.centralserver.model.vendas.Venda;

/**
 *
 * @author HJC2K8
 */
public class FacturaDAOImpl {

    private DAOGenerico daog;

    public FacturaDAOImpl() {

        daog = new DAOGenerico(Factura.class);
    }

    public Factura getFactura(int id) {
        return (Factura) daog.buscarEntidadePorQuery("from Factura where fact_id = " + id);
    }

    public Factura getFacturaNumeroLancamento(Entidade entidade, String tipo, long id) {
        return (Factura) daog.buscarEntidadePorQuery("from Factura where fact_numerolancamento = " + id + " AND fact_tipo LIKE '" + tipo + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Factura getFacturaReferencia(Entidade entidade, String ref) {
        return (Factura) daog.buscarEntidadePorQuery("from Factura where fact_referencia LIKE '" + ref + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Factura getFacturaVenda(Entidade entidade, Venda venda) {
        return (Factura) daog.buscarEntidadePorQuery("from Factura where venda_vend_id = " + venda.getVend_id() + " AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Factura getFacturaPagamento(Entidade entidade, Pagamento pagamento) {
        return (Factura) daog.buscarEntidadePorQuery("from Factura where pagamento_pag_id = " + pagamento.getPag_id() + " AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Factura> listaFacturas(Entidade entidade) {
        return daog.buscarPorConsulta("from Factura  where entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasNaoLancadas(Entidade entidade) {
        return daog.buscarPorConsulta("from Factura  where entidade_enti_id = " + entidade.getEnti_id() + " AND fact_lancada = 0 order by fact_id desc");
    }

    public List<Factura> listaFacturasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Factura where fact_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasAnteriores(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Factura where fact_data <= '" + data + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Factura where fact_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasCategoria(Entidade entidade, String categoria) {
        return daog.buscarPorConsulta("from Factura where fact_categorizacao LIKE '" + categoria + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasStatus(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from Factura where fact_status LIKE '" + status + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasVenda(Entidade entidade, Venda venda) {
        return daog.buscarPorConsulta("from Factura where venda_vend_id = " + venda.getVend_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasCaixa(Entidade entidade, Caixa caixa) {
        return daog.buscarPorConsulta("from Factura where caixa_caix_id = " + caixa.getCaix_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasMoeda(Entidade entidade, Moeda moeda) {
        return daog.buscarPorConsulta("from Factura where moeda_moe_id = " + moeda.getMoe_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasUsuario(Entidade entidade, Usuario usuario) {
        return daog.buscarPorConsulta("from Factura where usuario_usua_id = " + usuario.getUsua_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public List<Factura> listaFacturasPagamento(Entidade entidade, Pagamento pagamento) {
        return daog.buscarPorConsulta("from Factura where pagamento_pag_id = " + pagamento.getPag_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fact_id desc");
    }

    public void persistir_factura(Factura factura) {
        daog = new DAOGenerico(factura);
        daog.inserir_actualizar();

    }

    public void remover_factura(Factura factura) {
        daog = new DAOGenerico(factura);
        daog.excluir();

    }
}
