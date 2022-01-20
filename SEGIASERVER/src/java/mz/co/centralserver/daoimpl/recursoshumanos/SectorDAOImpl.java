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
import mz.co.centralserver.model.recursoshumanos.Departamento;
import mz.co.centralserver.model.recursoshumanos.Sector;

/**
 *
 * @author HJC2K8
 */
public class SectorDAOImpl {

    private DAOGenerico daog;

    public SectorDAOImpl() {
        daog = new DAOGenerico(Sector.class);
    }

    public Sector getSector(int id) {
        return (Sector) daog.buscarEntidadePorQuery("from Sector where sec_id = " + id);
    }

    public Sector getSector(Entidade entidade, String descricao) {
        return (Sector) daog.buscarEntidadePorQuery("from Sector where sec_nome LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Sector> listaSectores(Entidade entidade) {
        return daog.buscarPorConsulta("from Sector where entidade_enti_id = " + entidade.getEnti_id() + " order by sec_nome asc");
    }

    public List<Sector> listaSectoresDepartamento(Entidade entidade, Departamento departamento) {
        return daog.buscarPorConsulta("from Sector departamento_dep_id = " + departamento.getDep_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by sec_nome asc");
    }

    public void persistir_sector(Sector sector) {
        daog = new DAOGenerico(sector);
        daog.inserir_actualizar();
    }
}
