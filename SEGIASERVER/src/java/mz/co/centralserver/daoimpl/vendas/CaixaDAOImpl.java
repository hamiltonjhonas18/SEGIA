/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.vendas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Departamento;
import mz.co.centralserver.model.vendas.Caixa;

/**
 *
 * @author HJC2K8
 */
public class CaixaDAOImpl {

    private DAOGenerico daog;

    public CaixaDAOImpl() {

        daog = new DAOGenerico(Caixa.class);
    }

    public Caixa getCaixa(int id) {
        return (Caixa) daog.buscarEntidadePorQuery("from Caixa where caix_id = " + id);
    }

    public Caixa getCaixa(Entidade entidade, String descricao) {
        return (Caixa) daog.buscarEntidadePorQuery("from Caixa where caix_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Caixa> listaCaixas(Entidade entidade) {
        return daog.buscarPorConsulta("from Caixa where entidade_enti_id = " + entidade.getEnti_id() + " order by caix_id desc");
    }

    public List<Caixa> listaCaixasDepartamento(Entidade entidade, Departamento departamento) {
        return daog.buscarPorConsulta("from Caixa where entidade_enti_id = " + entidade.getEnti_id() + " AND departamento_dep_id = " + departamento.getDep_id() + " order by caix_id desc");
    }

    public List<Caixa> listaCaixasUsuario(Entidade entidade, Usuario usuario) {
        return daog.buscarPorConsulta("from Caixa where entidade_enti_id = " + entidade.getEnti_id() + " AND usuario_usua_id = " + usuario.getUsua_id() + " order by caix_id desc");
    }

    public void persistir_caixa(Caixa caixa) {
        daog = new DAOGenerico(caixa);
        daog.inserir_actualizar();

    }

    public void remover_caixa(Caixa caixa) {
        daog = new DAOGenerico(caixa);
        daog.excluir();

    }
}
