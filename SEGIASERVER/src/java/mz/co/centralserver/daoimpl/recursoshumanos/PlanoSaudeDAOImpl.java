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
import mz.co.centralserver.model.recursoshumanos.PlanoSaude;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class PlanoSaudeDAOImpl {

    private DAOGenerico daog;

    public PlanoSaudeDAOImpl() {
        daog = new DAOGenerico(PlanoSaude.class);
    }

    public PlanoSaude getPlanoSaude(int id) {
        return (PlanoSaude) daog.buscarEntidadePorQuery("from PlanoSaude where pls_id = " + id);
    }

    public PlanoSaude getPlanoSaude(Entidade entidade, Funcionario funcionario, String descricao) {
        return (PlanoSaude) daog.buscarEntidadePorQuery("from PlanoSaude where pls_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id());
    }

    public List<PlanoSaude> listaPlanosSaude(Entidade entidade) {
        return daog.buscarPorConsulta("from PlanoSaude order where entidade_enti_id = " + entidade.getEnti_id() + " by pls_descricao asc");
    }

    public List<PlanoSaude> listaPlanosSaudeFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from PlanoSaude  where entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id() + " order by pls_descricao asc");
    }

    public void persistir_planoSaude(PlanoSaude planoSaude) {
        daog = new DAOGenerico(planoSaude);
        daog.inserir_actualizar();
    }

    public void remover_planoSaude(PlanoSaude planoSaude) {
        daog = new DAOGenerico(planoSaude);
        daog.excluir();
    }
}
