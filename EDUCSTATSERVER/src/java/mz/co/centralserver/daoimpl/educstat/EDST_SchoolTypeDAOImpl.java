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
import mz.co.centralserver.model.educstat.EDST_SchoolType;

/**
 *
 * @author HJC2K8
 */
public class EDST_SchoolTypeDAOImpl {

    private DAOGenerico daog;

    public EDST_SchoolTypeDAOImpl() {
        daog = new DAOGenerico(EDST_SchoolType.class);
    }

    public List<EDST_SchoolType> listaEDST_SchoolType(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_SchoolType");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_SchoolType", limit);
        }
    }

}
