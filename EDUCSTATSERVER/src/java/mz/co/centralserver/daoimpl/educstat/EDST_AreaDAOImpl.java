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
import mz.co.centralserver.model.educstat.EDST_Area;

/**
 *
 * @author HJC2K8
 */
public class EDST_AreaDAOImpl {

    private DAOGenerico daog;

    public EDST_AreaDAOImpl() {
        daog = new DAOGenerico(EDST_Area.class);
    }

    public List<EDST_Area> listaEDST_Area(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_Area");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_Area", limit);
        }
    }

    public List<EDST_Area> listaEDST_Area_Settlement(int SettlementId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_Area where SettlementId = " + SettlementId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_Area where SettlementId = " + SettlementId, limit);
        }
    }

}
