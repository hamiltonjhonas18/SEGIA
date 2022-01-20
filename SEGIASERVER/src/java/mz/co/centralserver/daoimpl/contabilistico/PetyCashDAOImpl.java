/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.contabilistico;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.contabilistico.Pety;
import mz.co.centralserver.model.contabilistico.PetyCash;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class PetyCashDAOImpl {

    private DAOGenerico daog;

    public PetyCashDAOImpl() {
        daog = new DAOGenerico(PetyCash.class);
    }

    public PetyCash getPetyCash(int id) {
        return (PetyCash) daog.buscarEntidadePorQuery("from PetyCash where pet_id = " + id);
    }

    public PetyCash getPetyCash(Entidade entidade, String descricao) {
        return (PetyCash) daog.buscarEntidadePorQuery("from PetyCash where pet_descricao LIKE '" + descricao + "'  AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<PetyCash> listaPetyCashs(Entidade entidade) {
        return daog.buscarPorConsulta("from PetyCash where entidade_enti_id = " + entidade.getEnti_id() + " order by pet_id desc");
    }

    public List<PetyCash> listaPetyCashsFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from PetyCash where funcionario_func_id = " + funcionario.getFunc_id() + " order by pet_id desc");
    }

    public List<PetyCash> listaPetyCashsPety(Entidade entidade, Pety pety) {
        return daog.buscarPorConsulta("from PetyCash where pety_pety_id = " + pety.getPety_id() + " order by pet_id desc");
    }

    public List<PetyCash> listaPetyCashsPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from PetyCash where pet_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pet_id desc");
    }

    public List<PetyCash> listaPetyCashsData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from PetyCash where pet_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pet_id desc");
    }

    public void persistir_petyCash(PetyCash petyCash) {
        daog = new DAOGenerico(petyCash);
        daog.inserir_actualizar();
    }

    public void remover_petyCash(PetyCash petyCash) {
        daog = new DAOGenerico(petyCash);
        daog.excluir();
    }
}
