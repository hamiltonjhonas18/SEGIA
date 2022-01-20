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
import mz.co.centralserver.model.educstat.EDST_AdministrativePost;

/**
 *
 * @author HJC2K8
 */
public class EDST_AdministrativePostDAOImpl {

    private DAOGenerico daog;

    public EDST_AdministrativePostDAOImpl() {
        daog = new DAOGenerico(EDST_AdministrativePost.class);
    }

    public List<EDST_AdministrativePost> listaEDST_AdministrativePost(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_AdministrativePost");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_AdministrativePost", limit);
        }
    }

    public List<EDST_AdministrativePost> listaEDST_AdministrativePost_District(int DistrictId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_AdministrativePost where DistrictId = " + DistrictId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_AdministrativePost where DistrictId = " + DistrictId, limit);
        }
    }

}
