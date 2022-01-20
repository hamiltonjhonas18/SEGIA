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
import mz.co.centralserver.model.educstat.EDST_Zip;

/**
 *
 * @author HJC2K8
 */
public class EDST_ZipDAOImpl {

    private DAOGenerico daog;

    public EDST_ZipDAOImpl() {
        daog = new DAOGenerico(EDST_Zip.class);
    }

    public List<EDST_Zip> listaEDST_Zip(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_Zip");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_Zip", limit);
        }
    }

    public List<EDST_Zip> listaEDST_Zip_District(int DistrictId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_Zip where DistrictId = " + DistrictId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_Zip where DistrictId = " + DistrictId, limit);
        }
    }

    public List<EDST_Zip> listaEDST_Zip_School(int HeadQuarterSchoolId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_Zip where HeadQuarterSchoolId = " + HeadQuarterSchoolId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_Zip where HeadQuarterSchoolId = " + HeadQuarterSchoolId, limit);
        }
    }

}
