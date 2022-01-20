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
import mz.co.centralserver.model.recursoshumanos.Cargo;

/**
 *
 * @author HJC2K8
 */
public class CargoDAOImpl {

    private DAOGenerico daog;

    public CargoDAOImpl() {
        daog = new DAOGenerico(Cargo.class);
    }

    public Cargo getCargo(int id) {
        return (Cargo) daog.buscarEntidadePorQuery("from Cargo where car_id = " + id);
    }

    public Cargo getCargo(Entidade entidade, String descricao) {
        return (Cargo) daog.buscarEntidadePorQuery("from Cargo where car_nome LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Cargo> listaCargos(Entidade entidade) {
        return daog.buscarPorConsulta("from Cargo where entidade_enti_id = " + entidade.getEnti_id() + " order by car_nome asc");
    }

    public void persistir_cargo(Cargo cargo) {
        daog = new DAOGenerico(cargo);
        daog.inserir_actualizar();
    }

    public void remover_cargo(Cargo cargo) {
        daog = new DAOGenerico(cargo);
        daog.excluir();
    }
}
