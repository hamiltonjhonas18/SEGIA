/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.financas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.financas.PeriodoSalarial;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class PeriodoSalarialDAOImpl {

    private DAOGenerico daog;

    public PeriodoSalarialDAOImpl() {

        daog = new DAOGenerico(PeriodoSalarial.class);
    }

    public PeriodoSalarial getPeriodoSalarial(int id) {
        return (PeriodoSalarial) daog.buscarEntidadePorQuery("from PeriodoSalarial where pers_id =" + id);
    }

    public PeriodoSalarial getPeriodoSalarial(Entidade entidade, String descricao) {
        return (PeriodoSalarial) daog.buscarEntidadePorQuery("from PeriodoSalarial where pers_descricao LIKE '" + descricao + "' AND entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<PeriodoSalarial> listaPeriodosSalariais(Entidade entidade) {
        return daog.buscarPorConsulta("from PeriodoSalarial where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<PeriodoSalarial> listaPeriodosSalariaisLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from PeriodoSalarial where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }
    
    public List<PeriodoSalarial> listaPeriodosSalariaisPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from PeriodoSalarial where pers_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by pers_id desc");
    }

    public List<PeriodoSalarial> listaPeriodosSalariaisData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from PeriodoSalarial where pers_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pers_id desc");
    }


    public void persistir_periodoSalarial(PeriodoSalarial periodoSalarial) {
        daog = new DAOGenerico(periodoSalarial);
        daog.inserir_actualizar();
    }

    public void remover_periodoSalarial(PeriodoSalarial periodoSalarial) {
        daog = new DAOGenerico(periodoSalarial);
        daog.excluir();
    }
}
