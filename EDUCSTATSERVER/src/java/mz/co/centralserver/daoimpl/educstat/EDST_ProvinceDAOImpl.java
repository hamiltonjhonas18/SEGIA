/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.educstat;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.educstat.EDST_Province;

/**
 *
 * @author HJC2K8
 */
public class EDST_ProvinceDAOImpl {

    private DAOGenerico daog;

    public EDST_ProvinceDAOImpl() {
        daog = new DAOGenerico(EDST_Province.class);
    }

    public EDST_Province getEDST_Province(int id) {
        return (EDST_Province) daog.buscarEntidadePorQuery("from EDST_Province WHERE id =" + id);
    }

    public List<EDST_Province> listaEDST_Province(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_Province");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_Province", limit);
        }
    }

}
