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
import mz.co.centralserver.model.educstat.EDST_Education;

/**
 *
 * @author HJC2K8
 */
public class EDST_EducationDAOImpl {

    private DAOGenerico daog;

    public EDST_EducationDAOImpl() {
        daog = new DAOGenerico(EDST_Education.class);
    }

    public List<EDST_Education> listaEDST_Education(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_Education");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_Education", limit);
        }
    }

}
