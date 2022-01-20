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
import mz.co.centralserver.model.recursoshumanos.Formacao;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class FormacaoDAOImpl {

    private DAOGenerico daog;

    public FormacaoDAOImpl() {
        daog = new DAOGenerico(Formacao.class);
    }

    public Formacao getFormacao(int id) {
        return (Formacao) daog.buscarEntidadePorQuery("from Formacao where frm_id = " + id);
    }

    public Formacao getFormacao(Entidade entidade, Funcionario funcionario, String descricao) {
        return (Formacao) daog.buscarEntidadePorQuery("from Formacao where frm_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id());
    }

    public List<Formacao> listaFormacoes(Entidade entidade) {
        return daog.buscarPorConsulta("from Formacao order where entidade_enti_id = " + entidade.getEnti_id() + " by frm_id desc");
    }

    public List<Formacao> listaFormacoesFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from Formacao  where entidade_enti_id = " + entidade.getEnti_id() + " AND funcionario_func_id = " + funcionario.getFunc_id() + " order by frm_id desc");
    }

    public void persistir_formacao(Formacao formacao) {
        daog = new DAOGenerico(formacao);
        daog.inserir_actualizar();
    }

    public void remover_formacao(Formacao formacao) {
        daog = new DAOGenerico(formacao);
        daog.excluir();
    }
}
