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
import mz.co.centralserver.model.educstat.EDST_School;

/**
 *
 * @author HJC2K8
 */
public class EDST_SchoolDAOImpl {

    private DAOGenerico daog;

    public EDST_SchoolDAOImpl() {
        daog = new DAOGenerico(EDST_School.class);
    }

    public EDST_School getEDST_School(int id, int local) {
        return (EDST_School) daog.buscarEntidadePorQuery("from EDST_School WHERE id =" + id + " AND local=" + local);
    }

    public List<EDST_School> listaEDST_School(int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School");
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School", limit);
        }
    }

    public List<EDST_School> listaEDST_School_Settlement(int SettlementId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School where SettlementId = " + SettlementId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School where SettlementId = " + SettlementId, limit);
        }
    }

    public List<EDST_School> listaEDST_School_Type(int TypeId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School where TypeId = " + TypeId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School where TypeId = " + TypeId, limit);
        }
    }

    public List<EDST_School> listaEDST_School_District(int DistrictId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School where DistrictId = " + DistrictId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School where DistrictId = " + DistrictId, limit);
        }
    }

    public List<EDST_School> listaEDST_School_AdministrativePost(int AdministrativePostId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School where AdministrativePostId = " + AdministrativePostId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School where AdministrativePostId = " + AdministrativePostId, limit);
        }
    }

    public List<EDST_School> listaEDST_School_Locality(int LocalityId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School where LocalityId = " + LocalityId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School where LocalityId = " + LocalityId, limit);
        }
    }

    public List<EDST_School> listaEDST_School_Area(int AreaId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School where AreaId = " + AreaId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School where AreaId = " + AreaId, limit);
        }
    }

    public List<EDST_School> listaEDST_School_Zip(int ZipId, int limit) {

        if (limit == -1) {
            return daog.buscarPorConsulta("from EDST_School where ZipId = " + ZipId);
        } else {
            return daog.buscarPorConsultaLimite("from EDST_School where ZipId = " + ZipId, limit);
        }
    }

}
