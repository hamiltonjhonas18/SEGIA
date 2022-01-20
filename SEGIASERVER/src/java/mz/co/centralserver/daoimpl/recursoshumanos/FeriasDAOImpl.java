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
import mz.co.centralserver.model.recursoshumanos.Ferias;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class FeriasDAOImpl {

    private DAOGenerico daog;

    public FeriasDAOImpl() {
        daog = new DAOGenerico(Ferias.class);
    }

    public Ferias getFerias(int id) {
        return (Ferias) daog.buscarEntidadePorQuery("from Ferias where fer_id = " + id);
    }

    public List<Ferias> listaFerias(Entidade entidade) {
        return daog.buscarPorConsulta("from Ferias order where entidade_enti_id = " + entidade.getEnti_id() + " by fer_id desc");
    }

    public List<Ferias> listaFeriasFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from Ferias  where entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id() + " order by fer_id desc");
    }

    public void persistir_ferias(Ferias ferias) {
        daog = new DAOGenerico(ferias);
        daog.inserir_actualizar();
    }

    public void remover_ferias(Ferias ferias) {
        daog = new DAOGenerico(ferias);
        daog.excluir();
    }
}
