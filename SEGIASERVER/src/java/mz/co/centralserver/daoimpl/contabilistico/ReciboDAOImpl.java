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
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.contabilistico.Recibo;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
public class ReciboDAOImpl {

    private DAOGenerico daog;

    public ReciboDAOImpl() {

        daog = new DAOGenerico(Recibo.class);
    }

    public Recibo getRecibo(int id) {
        return (Recibo) daog.buscarEntidadePorQuery("from Recibo where rec_id = " + id);
    }

    public List<Recibo> listaRecibos(Entidade entidade) {
        return daog.buscarPorConsulta("from Recibo where entidade_enti_id  = " + entidade.getEnti_id() + " order by rec_id desc");
    }

    public List<Recibo> listaRecibosFactura(Entidade entidade, Factura factura) {
        return daog.buscarPorConsulta("from Recibo where factura_fact_id = " + factura.getFact_id() + " AND entidade_enti_id  = " + entidade.getEnti_id() + " order by rec_id desc");
    }

    public List<Recibo> listaRecibosPessoa(Entidade entidade, Pessoa pessoa) {
        return daog.buscarPorConsulta("from Recibo where pessoa_pess_id = " + pessoa.getPess_id() + " AND entidade_enti_id  = " + entidade.getEnti_id() + " order by rec_id desc");
    }

    public List<Recibo> listaRecibosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Recibo where rec_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by rec_id desc");
    }

    public List<Recibo> listaRecibosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Recibo where rec_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by rec_id desc");
    }

    public void persistir_recibo(Recibo recibo) {
        daog = new DAOGenerico(recibo);
        daog.inserir_actualizar();

    }

    public void remover_recibo(Recibo recibo) {
        daog = new DAOGenerico(recibo);
        daog.excluir();

    }
}
