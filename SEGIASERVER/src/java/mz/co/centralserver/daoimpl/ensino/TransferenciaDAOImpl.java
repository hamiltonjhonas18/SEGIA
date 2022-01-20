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
import mz.co.centralserver.model.ensino.Transferencia;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class TransferenciaDAOImpl {

    private DAOGenerico daog;

    public TransferenciaDAOImpl() {
        daog = new DAOGenerico(Transferencia.class);
    }

    public Transferencia getTransferencia(int id) {
        return (Transferencia) daog.buscarEntidadePorQuery("from Transferencia where trans_id = " + id);
    }

    public List<Transferencia> listaTransferencias(Entidade entidade) {
        return daog.buscarPorConsulta("from Transferencia where entidade_enti_id = " + entidade.getEnti_id() + " order by trans_id desc");
    }

    public List<Transferencia> listaTransferenciasOrigemStatus(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from Transferencia where trans_status LIKE '" + status + "' AND entidade_enti_id = " + entidade.getEnti_id() + "  order by trans_id desc");
    }

    public List<Transferencia> listaTransferenciasDestinoStatus(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from Transferencia where trans_status LIKE '" + status + "' AND entidade2_enti_id = " + entidade.getEnti_id() + "  order by trans_id desc");
    }

    public List<Transferencia> listaTransferenciasPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Transferencia where trans_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by trans_id desc");
    }

    public List<Transferencia> listaTransferenciasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Transferencia where trans_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by trans_id desc");
    }

    public void persistir_transferencia(Transferencia transferencia) {
        daog = new DAOGenerico(transferencia);
        daog.inserir_actualizar();
    }

    public void remover_transferencia(Transferencia transferencia) {
        daog = new DAOGenerico(transferencia);
        daog.excluir();
    }
}
