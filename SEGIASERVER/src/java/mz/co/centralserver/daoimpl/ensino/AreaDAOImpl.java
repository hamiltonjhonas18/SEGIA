/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ensino;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.ensino.Area;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class AreaDAOImpl {

    private DAOGenerico daog;

    public AreaDAOImpl() {
        daog = new DAOGenerico(Area.class);
    }

    public Area getArea(int id) {
        return (Area) daog.buscarEntidadePorQuery("from Area where area_id = " + id);
    }

    public Area getArea(Entidade entidade, String descricao) {
        return (Area) daog.buscarEntidadePorQuery("from Area where area_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Area> listaAreas(Entidade entidade) {
        return daog.buscarPorConsulta("from Area where entidade_enti_id = " + entidade.getEnti_id() + " order by area_id asc");
    }


    public void persistir_area(Area area) {
        daog = new DAOGenerico(area);
        daog.inserir_actualizar();
    }

    public void remover_area(Area area) {
        daog = new DAOGenerico(area);
        daog.excluir();
    }
}
