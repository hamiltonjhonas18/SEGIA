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
import mz.co.centralserver.model.educstat.EDST_District;

/**
 *
 * @author HJC2K8
 */
public class EDST_DistrictDAOImpl {

    private DAOGenerico daog;

    public EDST_DistrictDAOImpl() {
        daog = new DAOGenerico(EDST_District.class);
    }

    public EDST_District getEDST_District(int id) {
        return (EDST_District) daog.buscarEntidadePorQuery("from EDST_District WHERE id =" + id);
    }

    public List<EDST_District> listaEDST_District(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_District");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_District", limit);
        }
    }

    public List<EDST_District> listaEDST_District_Province(int ProvinceId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_District where ProvinceId = " + ProvinceId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_District where ProvinceId = " + ProvinceId, limit);
        }
    }

}
