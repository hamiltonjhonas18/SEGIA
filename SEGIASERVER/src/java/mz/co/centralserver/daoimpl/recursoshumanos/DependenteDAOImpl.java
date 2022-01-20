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
import mz.co.centralserver.model.recursoshumanos.Dependente;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class DependenteDAOImpl {

    private DAOGenerico daog;

    public DependenteDAOImpl() {
        daog = new DAOGenerico(Dependente.class);
    }

    public Dependente getDependente(int id) {
        return (Dependente) daog.buscarEntidadePorQuery("from Dependente where dpn_id = " + id);
    }

    public Dependente getDependente(Entidade entidade, Funcionario funcionario, String descricao) {
        return (Dependente) daog.buscarEntidadePorQuery("from Dependente where dpn_nome LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id());
    }

    public List<Dependente> listaDependentes(Entidade entidade) {
        return daog.buscarPorConsulta("from Dependente order where entidade_enti_id = " + entidade.getEnti_id() + " by dpn_nome asc");
    }

    public List<Dependente> listaDependentesFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from Dependente  where entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id() + " order by dpn_nome asc");
    }

    public void persistir_dependente(Dependente dependente) {
        daog = new DAOGenerico(dependente);
        daog.inserir_actualizar();
    }

    public void remover_dependente(Dependente dependente) {
        daog = new DAOGenerico(dependente);
        daog.excluir();
    }
}
