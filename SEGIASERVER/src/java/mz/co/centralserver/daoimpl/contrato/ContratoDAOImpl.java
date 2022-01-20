/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.contrato;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.contrato.Contrato;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ContratoDAOImpl {

    private DAOGenerico daog;

    public ContratoDAOImpl() {

        daog = new DAOGenerico(Contrato.class);
    }

    public Contrato getContrato(int id) {
        return (Contrato) daog.buscarEntidadePorQuery("from Contrato where cont_id = " + id);
    }

    public Contrato getContrato(Entidade entidade, String descricao) {
        return (Contrato) daog.buscarEntidadePorQuery("from Contrato where cont_referencia LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Contrato getContratoReferenciaReal(Entidade entidade, String refe) {
        return (Contrato) daog.buscarEntidadePorQuery("from Contrato where cont_referencia_2 LIKE '" + refe + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Contrato> listaContratos(Entidade entidade) {
        return daog.buscarPorConsulta("from Contrato where entidade_enti_id  = " + entidade.getEnti_id() + " order by cont_id desc");
    }

    public List<Contrato> listaContratosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Contrato where entidade_enti_id  = " + entidade.getEnti_id() + " order by cont_id desc", limite);
    }

    public List<Contrato> listaContratosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Contrato where cont_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by cont_id desc");
    }

    public List<Contrato> listaContratosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Contrato where cont_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by cont_id desc");
    }

    public void persistir_contrato(Contrato contrato) {
        daog = new DAOGenerico(contrato);
        daog.inserir_actualizar();

    }

    public void remover_contrato(Contrato contrato) {
        daog = new DAOGenerico(contrato);
        daog.excluir();

    }
}
