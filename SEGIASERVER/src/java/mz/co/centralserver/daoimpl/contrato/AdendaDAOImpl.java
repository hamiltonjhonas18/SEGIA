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
import mz.co.centralserver.model.contrato.Adenda;
import mz.co.centralserver.model.contrato.Contrato;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class AdendaDAOImpl {

    private DAOGenerico daog;

    public AdendaDAOImpl() {

        daog = new DAOGenerico(Adenda.class);
    }

    public Adenda getAdenda(int id) {
        return (Adenda) daog.buscarEntidadePorQuery("from Adenda where aden_id = " + id);
    }

    public Adenda getAdenda(Entidade entidade, String descricao) {
        return (Adenda) daog.buscarEntidadePorQuery("from Adenda where aden_referencia LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Adenda> listaAdendas(Entidade entidade) {
        return daog.buscarPorConsulta("from Adenda where entidade_enti_id  = " + entidade.getEnti_id() + " order by aden_id desc");
    }

    public List<Adenda> listaAdendasContrato(Entidade entidade, Contrato contrato) {
        return daog.buscarPorConsulta("from Adenda where contrato_cont_id = " + contrato.getCont_id() + " AND entidade_enti_id  = " + entidade.getEnti_id() + " order by aden_id desc");
    }

    public List<Adenda> listaAdendasPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Adenda where aden_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by aden_id desc");
    }

    public List<Adenda> listaAdendasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Adenda where aden_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by aden_id desc");
    }

    public void persistir_adenda(Adenda adenda) {
        daog = new DAOGenerico(adenda);
        daog.inserir_actualizar();

    }

    public void remover_adenda(Adenda adenda) {
        daog = new DAOGenerico(adenda);
        daog.excluir();

    }
}
