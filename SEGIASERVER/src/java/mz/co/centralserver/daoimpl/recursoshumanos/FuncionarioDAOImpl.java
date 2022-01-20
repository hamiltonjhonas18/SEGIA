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
import mz.co.centralserver.model.recursoshumanos.Firma;
import mz.co.centralserver.model.recursoshumanos.Cargo;
import mz.co.centralserver.model.recursoshumanos.Departamento;
import mz.co.centralserver.model.recursoshumanos.Funcionario;
import mz.co.centralserver.model.recursoshumanos.Habilitacao;
import mz.co.centralserver.model.recursoshumanos.Sector;

/**
 *
 * @author HJC2K8
 */
public class FuncionarioDAOImpl {

    private DAOGenerico daog;

    public FuncionarioDAOImpl() {
        daog = new DAOGenerico(Funcionario.class);
    }

    public Funcionario getFuncionario(int id) {
        return (Funcionario) daog.buscarEntidadePorQuery("from Funcionario where func_id = " + id);
    }

    public Funcionario getFuncionarioNumero(Entidade entidade, int numero) {
        return (Funcionario) daog.buscarEntidadePorQuery("from Funcionario where func_numero = " + numero +" AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Funcionario getFuncionarioBagdeNumber(Entidade entidade, String numero) {
        return (Funcionario) daog.buscarEntidadePorQuery("from Funcionario where func_badgnumber LIKE '" + numero + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public Funcionario getFuncionarioPessoa(Entidade entidade, int numero) {
        return (Funcionario) daog.buscarEntidadePorQuery("from Funcionario where pessoapess_pess_id = " + numero+" AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Funcionario> listaFuncionarios(Entidade entidade) {
        return daog.buscarPorConsulta("from Funcionario where entidade_enti_id = " + entidade.getEnti_id() + " order by func_id desc");
    }

    public List<Funcionario> listaFuncionariosNumero(Entidade entidade,String tipo) {
        return daog.buscarPorConsulta("from Funcionario where func_badgnumber LIKE '" + tipo + "' AND entidade_enti_id = " + entidade.getEnti_id() + " order by func_id desc");
    }

    public List<Funcionario> listaFuncionariosDepartamento(Entidade entidade, Departamento departamento) {
        return daog.buscarPorConsulta("from Funcionario where departamento_dep_id = " + departamento.getDep_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by func_id desc");
    }

    public List<Funcionario> listaFuncionariosCargo(Entidade entidade, Cargo cargo) {
        return daog.buscarPorConsulta("from Funcionario where cargo_car_id = " + cargo.getCar_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by func_id desc");
    }

    public List<Funcionario> listaFuncionariosHabilitacao(Entidade entidade, Habilitacao habilitacao) {
        return daog.buscarPorConsulta("from Funcionario where habilitacao_habi_id = " + habilitacao.getHabi_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by func_id desc");
    }

    public List<Funcionario> listaFuncionariosFirma(Entidade entidade, Firma firma) {
        return daog.buscarPorConsulta("from Funcionario where firmafirm_firm_id = " + firma.getFirm_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by func_id desc");
    }

    public void persistir_funcioanario(Funcionario funcionario) {
        daog = new DAOGenerico(funcionario);
        daog.inserir_actualizar();
    }

    public void remover_funcioanario(Funcionario funcionario) {
        daog = new DAOGenerico(funcionario);
        daog.excluir();
    }

}
