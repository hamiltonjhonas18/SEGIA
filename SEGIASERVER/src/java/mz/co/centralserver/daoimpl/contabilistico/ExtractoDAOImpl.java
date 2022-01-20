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
import mz.co.centralserver.model.contabilistico.Extracto;
import mz.co.centralserver.model.contabilistico.Factura;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ExtractoDAOImpl {

    private DAOGenerico daog;

    public ExtractoDAOImpl() {
        daog = new DAOGenerico(Extracto.class);
    }

    public Extracto getExtracto(int id) {
        return (Extracto) daog.buscarEntidadePorQuery("from Extracto where ext_id = " + id);
    }

    public List<Extracto> listaExtractos(Entidade entidade) {
        return daog.buscarPorConsulta("from Extracto where entidade_enti_id = " + entidade.getEnti_id() + " order by ext_id desc");
    }

    public List<Extracto> listaExtractos(Entidade entidade, String movimento) {
        return daog.buscarPorConsulta("from Extracto where entidade_enti_id = " + entidade.getEnti_id() + " AND ext_movimento LIKE '" + movimento + "' order by ext_id desc");
    }

    public List<Extracto> listaExtractosFactura(Entidade entidade, Factura factura) {
        return daog.buscarPorConsulta("from Extracto where factura_fact_id = " + factura.getFact_id() + " order by ext_id desc");
    }

    public List<Extracto> listaExtractosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Extracto where ext_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by ext_id desc");
    }

    public List<Extracto> listaExtractosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Extracto where ext_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by ext_id desc");
    }

    public void persistir_extracto(Extracto extracto) {
        daog = new DAOGenerico(extracto);
        daog.inserir_actualizar();
    }

    public void remover_extracto(Extracto extracto) {
        daog = new DAOGenerico(extracto);
        daog.excluir();
    }
}
