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
import mz.co.centralserver.model.financas.RequisicaoCheque;
import mz.co.centralserver.model.financas.TipoMovimentoCheque;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class RequisicaoChequeDAOImpl {

    private DAOGenerico daog;

    public RequisicaoChequeDAOImpl() {

        daog = new DAOGenerico(RequisicaoCheque.class);
    }

    public RequisicaoCheque getRequisicaoCheque(int id) {
        return (RequisicaoCheque) daog.buscarEntidadePorQuery("from RequisicaoCheque where rqc_id =" + id);
    }

    public RequisicaoCheque getRequisicaoCheque(Entidade entidade, String codigo) {
        return (RequisicaoCheque) daog.buscarEntidadePorQuery("from RequisicaoCheque where rqc_serie LIKE '" + codigo + "'AND entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<RequisicaoCheque> listaRequisicoesCheque(Entidade entidade) {
        return daog.buscarPorConsulta("from RequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<RequisicaoCheque> listaRequisicoesChequeLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from RequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public List<RequisicaoCheque> listaRequisicoesChequeFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from RequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id() + " AND funcionario_func_id=" + funcionario.getFunc_id());
    }

    public List<RequisicaoCheque> listaRequisicoesChequeTipo(Entidade entidade, TipoMovimentoCheque tipoMovimentoCheque) {
        return daog.buscarPorConsulta("from RequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id() + " AND tipoMovimentoCheque_tmc_id=" + tipoMovimentoCheque.getTmc_id());
    }

    public List<RequisicaoCheque> listaRequisicoesChequeData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from RequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id() + " AND rqc_data LIKE '" + data + "%'");
    }

    public List<RequisicaoCheque> listaRequisicoesChequePeriodo(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from RequisicaoCheque where entidade_enti_id =" + entidade.getEnti_id() + " AND rqc_data between '" + data1 + "' AND '" + data2 + "'");
    }

    public void persistir_requisicaoCheque(RequisicaoCheque requisicaoCheque) {
        daog = new DAOGenerico(requisicaoCheque);
        daog.inserir_actualizar();
    }

    public void remover_requisicaoCheque(RequisicaoCheque requisicaoCheque) {
        daog = new DAOGenerico(requisicaoCheque);
        daog.excluir();
    }
}
