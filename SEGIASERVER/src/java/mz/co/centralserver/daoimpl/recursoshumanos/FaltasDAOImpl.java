/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.recursoshumanos;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Faltas;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class FaltasDAOImpl {

    private DAOGenerico daog;

    public FaltasDAOImpl() {
        daog = new DAOGenerico(Faltas.class);
    }

    public Faltas getFalta(int id) {
        return (Faltas) daog.buscarEntidadePorQuery("from Faltas where flt_id = " + id);
    }

    public List<Faltas> listaFaltas(Entidade entidade) {
        return daog.buscarPorConsulta("from Faltas order where entidade_enti_id = " + entidade.getEnti_id() + " by flt_id desc");
    }

    public List<Faltas> listaFaltasFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from Faltas  where entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id() + " order by flt_id desc");
    }

    public List<Faltas> listaFaltasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Faltas where entidade_enti_id =" + entidade.getEnti_id() + " AND flt_data LIKE '" + data + "%'");
    }

    public List<Faltas> listaFaltasPeriodo(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from Faltas where entidade_enti_id =" + entidade.getEnti_id() + " AND flt_data between '" + data1 + "' AND '" + data2 + "'");
    }

    public List<Faltas> listaFaltasFuncionarioData(Entidade entidade, Funcionario funcionario, String data) {
        return daog.buscarPorConsulta("from Faltas where entidade_enti_id =" + entidade.getEnti_id() + " AND flt_data LIKE '" + data + "%' AND funcionario_func_id = " + funcionario.getFunc_id());
    }

    public List<Faltas> listaFaltasFuncionarioPeriodo(Entidade entidade, Funcionario funcionario, String data1, String data2) {
        return daog.buscarPorConsulta("from Faltas where entidade_enti_id =" + entidade.getEnti_id() + " AND flt_data between '" + data1 + "' AND '" + data2 + "' AND funcionario_func_id = " + funcionario.getFunc_id());
    }

    public void persistir_falta(Faltas falta) {
        daog = new DAOGenerico(falta);
        daog.inserir_actualizar();
    }

    public void remover_falta(Faltas falta) {
        daog = new DAOGenerico(falta);
        daog.excluir();
    }
}
