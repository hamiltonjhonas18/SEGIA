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
import mz.co.centralserver.model.contabilistico.EstadoFactura;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class EstadoFacturaDAOImpl {

    private DAOGenerico daog;

    public EstadoFacturaDAOImpl() {
        daog = new DAOGenerico(EstadoFactura.class);
    }

    public EstadoFactura getEstadoFactura(int id) {
        return (EstadoFactura) daog.buscarEntidadePorQuery("from EstadoFactura where estf_id = " + id);
    }

    public EstadoFactura getEstadoFactura(Entidade entidade, String descricao) {
        return (EstadoFactura) daog.buscarEntidadePorQuery("from EstadoFactura where entidade_enti_id = " + entidade.getEnti_id() + " AND estf_descricao LIKE '" + descricao + "'");
    }

    public List<EstadoFactura> listaEstadosFactura(Entidade entidade) {
        return daog.buscarPorConsulta("from EstadoFactura where entidade_enti_id = " + entidade.getEnti_id() + " order by estf_id asc");
    }

    public void persistir_estadoFactura(EstadoFactura estadoFactura) {
        daog = new DAOGenerico(estadoFactura);
        daog.inserir_actualizar();
    }

    public void remover_estadoFactura(EstadoFactura estadoFactura) {
        daog = new DAOGenerico(estadoFactura);
        daog.excluir();
    }
}
