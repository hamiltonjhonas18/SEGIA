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
import mz.co.centralserver.model.financas.FolhaSalarial;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class FolhaSalarialDAOImpl {

    private DAOGenerico daog;

    public FolhaSalarialDAOImpl() {

        daog = new DAOGenerico(FolhaSalarial.class);
    }

    public FolhaSalarial getFolhaSalarial(int id) {
        return (FolhaSalarial) daog.buscarEntidadePorQuery("from FolhaSalarial where fls_id =" + id);
    }

    public List<FolhaSalarial> listaFolhasSalariais(Entidade entidade) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<FolhaSalarial> listaFolhasSalariaisLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public List<FolhaSalarial> listaFolhasSalariaisFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + " AND funcionario_func_id=" + funcionario.getFunc_id());
    }

    public List<FolhaSalarial> listaFolhasSalariaisPeriodo(Entidade entidade, String periodo) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + " AND fls_periodo LIKE'" + periodo + "'");
    }

    public List<FolhaSalarial> listaFolhasSalariaisData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + " AND fls_data LIKE '" + data + "%'");
    }

    public List<FolhaSalarial> listaFolhasSalariaisPeriodoDatas(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + " AND fls_data between '" + data1 + "' AND '" + data2 + "'");
    }

    public List<FolhaSalarial> listaFolhasSalariaisFuncionarioPeriodo(Entidade entidade, Funcionario funcionario, String periodo) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + " AND fls_periodo LIKE'" + periodo + "'" + " AND funcionario_func_id=" + funcionario.getFunc_id());
    }

    public List<FolhaSalarial> listaFolhasSalariaisFuncionarioData(Entidade entidade, Funcionario funcionario, String data) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + " AND fls_data LIKE '" + data + "%'" + " AND funcionario_func_id=" + funcionario.getFunc_id());
    }

    public List<FolhaSalarial> listaFolhasSalariaisFuncionarioPeriodoDatas(Entidade entidade, Funcionario funcionario, String data1, String data2) {
        return daog.buscarPorConsulta("from FolhaSalarial where entidade_enti_id =" + entidade.getEnti_id() + " AND fls_data between '" + data1 + "' AND '" + data2 + "'" + " AND funcionario_func_id=" + funcionario.getFunc_id());
    }

    public void persistir_folhaSalarial(FolhaSalarial folhaSalarial) {
        daog = new DAOGenerico(folhaSalarial);
        daog.inserir_actualizar();
    }

    public void remover_folhaSalarial(FolhaSalarial folhaSalarial) {
        daog = new DAOGenerico(folhaSalarial);
        daog.excluir();
    }
}
