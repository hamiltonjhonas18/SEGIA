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
import mz.co.centralserver.model.financas.Requisicao;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class RequisicaoDAOImpl {

    private DAOGenerico daog;

    public RequisicaoDAOImpl() {

        daog = new DAOGenerico(Requisicao.class);
    }

    public Requisicao getRequisicao(int id) {
        return (Requisicao) daog.buscarEntidadePorQuery("from Requisicao where req_id =" + id);
    }

    public Requisicao getRequisicao(String codigo) {
        return (Requisicao) daog.buscarEntidadePorQuery("from Requisicao where req_serie LIKE '" + codigo + "'");
    }

    public List<Requisicao> listaRequisicoes(Entidade entidade) {
        return daog.buscarPorConsulta("from Requisicao where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<Requisicao> listaRequisicoesLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Requisicao where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public List<Requisicao> listaRequisicoesFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from Requisicao where entidade_enti_id =" + entidade.getEnti_id() + " AND funcionario_func_id=" + funcionario.getFunc_id());
    }

    public List<Requisicao> listaRequisicoesData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Requisicao where entidade_enti_id =" + entidade.getEnti_id() + " AND req_data LIKE '" + data + "%'");
    }

    public List<Requisicao> listaRequisicoesPeriodo(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from Requisicao where entidade_enti_id =" + entidade.getEnti_id() + " AND req_data between '" + data1 + "' AND '" + data2 + "'");
    }

    public void persistir_requisicao(Requisicao requisicao) {
        daog = new DAOGenerico(requisicao);
        daog.inserir_actualizar();
    }

    public void remover_requisicao(Requisicao requisicao) {
        daog = new DAOGenerico(requisicao);
        daog.excluir();
    }
}
