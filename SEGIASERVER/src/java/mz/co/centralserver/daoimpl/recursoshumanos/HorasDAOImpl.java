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
import mz.co.centralserver.model.recursoshumanos.Horas;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class HorasDAOImpl {

    private DAOGenerico daog;

    public HorasDAOImpl() {
        daog = new DAOGenerico(Horas.class);
    }

    public Horas getHora(int id) {
        return (Horas) daog.buscarEntidadePorQuery("from Horas where hora_id = " + id);
    }

    public List<Horas> listaHoras(Entidade entidade) {
        return daog.buscarPorConsulta("from Horas order where entidade_enti_id = " + entidade.getEnti_id() + " by hora_id desc");
    }

    public List<Horas> listaHorasFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from Horas  where entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id() + " order by hora_id desc");
    }

    public List<Horas> listaHorasData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Horas where entidade_enti_id =" + entidade.getEnti_id() + " AND hora_data LIKE '" + data + "%'");
    }

    public List<Horas> listaHorasPeriodo(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from Horas where entidade_enti_id =" + entidade.getEnti_id() + " AND hora_data between '" + data1 + "' AND '" + data2 + "'");
    }

    public List<Horas> listaHorasFuncionarioData(Entidade entidade, Funcionario funcionario, String data) {
        return daog.buscarPorConsulta("from Horas where entidade_enti_id =" + entidade.getEnti_id() + " AND hora_data LIKE '" + data + "%' AND funcionario_func_id = " + funcionario.getFunc_id());
    }

    public List<Horas> listaHorasFuncionarioPeriodo(Entidade entidade, Funcionario funcionario, String data1, String data2) {
        return daog.buscarPorConsulta("from Horas where entidade_enti_id =" + entidade.getEnti_id() + " AND hora_data between '" + data1 + "' AND '" + data2 + "' AND funcionario_func_id = " + funcionario.getFunc_id());
    }

    public void persistir_hora(Horas hora) {
        daog = new DAOGenerico(hora);
        daog.inserir_actualizar();
    }

    public void remover_hora(Horas hora) {
        daog = new DAOGenerico(hora);
        daog.excluir();
    }
}
