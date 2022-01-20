/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.webservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import mz.co.centralserver.daoimpl.educstat.EDST_AdministrativePostDAOImpl;
import mz.co.centralserver.daoimpl.educstat.EDST_AreaDAOImpl;
import mz.co.centralserver.daoimpl.educstat.EDST_DistrictDAOImpl;
import mz.co.centralserver.daoimpl.educstat.EDST_EducationDAOImpl;
import mz.co.centralserver.daoimpl.educstat.EDST_ProvinceDAOImpl;
import mz.co.centralserver.daoimpl.educstat.EDST_SchoolDAOImpl;
import mz.co.centralserver.daoimpl.educstat.EDST_SchoolTypeDAOImpl;
import mz.co.centralserver.daoimpl.educstat.EDST_ZipDAOImpl;
import mz.co.centralserver.model.educstat.EDST_AdministrativePost;
import mz.co.centralserver.model.educstat.EDST_Area;
import mz.co.centralserver.model.educstat.EDST_District;
import mz.co.centralserver.model.educstat.EDST_Education;
import mz.co.centralserver.model.educstat.EDST_Province;
import mz.co.centralserver.model.educstat.EDST_School;
import mz.co.centralserver.model.educstat.EDST_SchoolType;
import mz.co.centralserver.model.educstat.EDST_Zip;

/**
 *
 * @author Hamilton Jhonas
 */
@WebService(serviceName = "EducStatWSrv")
public class EducStatWSrv {

    //=========================  EDST AREA  ==========================
    EDST_AreaDAOImpl edst_AreaDAOImpl = new EDST_AreaDAOImpl();

    @WebMethod(operationName = "listaEDST_Area")
    public List<EDST_Area> listaEDST_Area(@WebParam(name = "limit") int limit) {
        return edst_AreaDAOImpl.listaEDST_Area(limit);
    }

    @WebMethod(operationName = "listaEDST_Area_Settlement")
    public List<EDST_Area> listaEDST_Area_Settlement(@WebParam(name = "SettlementId") int SettlementId, @WebParam(name = "limit") int limit) {
        return edst_AreaDAOImpl.listaEDST_Area_Settlement(SettlementId, limit);
    }

    /*
     ************************** END EDST AREA  ***********************/
    //=========================  EDST PROVINCE  ==========================
    EDST_ProvinceDAOImpl edst_ProvinceDAOImpl = new EDST_ProvinceDAOImpl();

    @WebMethod(operationName = "buscaEDST_Province")
    public EDST_Province buscaEDST_Province(@WebParam(name = "id") int id) {
        return edst_ProvinceDAOImpl.getEDST_Province(id);
    }

    @WebMethod(operationName = "listaEDST_Province")
    public List<EDST_Province> listaEDST_Province(@WebParam(name = "limit") int limit) {
        return edst_ProvinceDAOImpl.listaEDST_Province(limit);
    }
    /*
     ************************** END EDST PROVINCE  ***********************/

    //=========================  EDST DISTRICT  ==========================
    EDST_DistrictDAOImpl edst_DistrictDAOImpl = new EDST_DistrictDAOImpl();

    @WebMethod(operationName = "buscaEDST_District")
    public EDST_District buscaEDST_District(@WebParam(name = "id") int id) {
        return edst_DistrictDAOImpl.getEDST_District(id);
    }

    @WebMethod(operationName = "listaEDST_District")
    public List<EDST_District> listaEDST_District(@WebParam(name = "limit") int limit) {
        return edst_DistrictDAOImpl.listaEDST_District(limit);
    }

    @WebMethod(operationName = "listaEDST_District_Province")
    public List<EDST_District> listaEDST_District_Province(@WebParam(name = "ProvinceId") int ProvinceId, @WebParam(name = "limit") int limit) {
        return edst_DistrictDAOImpl.listaEDST_District_Province(ProvinceId, limit);
    }

    /*
     ************************** END EDST DISTRICT  ***********************/
    //=========================  EDST ADMINISTRATIVE POST  ==========================
    EDST_AdministrativePostDAOImpl edst_AdministrativePostDAOImpl = new EDST_AdministrativePostDAOImpl();

    @WebMethod(operationName = "listaEDST_AdministrativePost")
    public List<EDST_AdministrativePost> listaEDST_AdministrativePost(@WebParam(name = "limit") int limit) {
        return edst_AdministrativePostDAOImpl.listaEDST_AdministrativePost(limit);
    }

    @WebMethod(operationName = "listaEDST_AdministrativePost_District")
    public List<EDST_AdministrativePost> listaEDST_AdministrativePost_District(@WebParam(name = "DistrictId") int DistrictId, @WebParam(name = "limit") int limit) {
        return edst_AdministrativePostDAOImpl.listaEDST_AdministrativePost_District(DistrictId, limit);
    }

    /*
     ************************** END EDST ADMINISTRATIVE POST  ***********************/
    //=========================  EDST EDUCATION  ==========================
    EDST_EducationDAOImpl edst_EducationDAOImpl = new EDST_EducationDAOImpl();

    @WebMethod(operationName = "listaEDST_Education")
    public List<EDST_Education> listaEDST_Education(@WebParam(name = "limit") int limit) {
        return edst_EducationDAOImpl.listaEDST_Education(limit);
    }
    /*
     ************************** END EDST EDUCATION  ***********************/

    //=========================  EDST SCHOOL  ==========================
    EDST_SchoolDAOImpl edst_SchoolDAOImpl = new EDST_SchoolDAOImpl();

    @WebMethod(operationName = "buscaEDST_School")
    public EDST_School buscaEDST_School(@WebParam(name = "id") int id, @WebParam(name = "local") int local) {
        return edst_SchoolDAOImpl.getEDST_School(id, local);
    }

    @WebMethod(operationName = "listaEDST_School")
    public List<EDST_School> listaEDST_School(@WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School(limit);
    }

    @WebMethod(operationName = "listaEDST_School_Settlement")
    public List<EDST_School> listaEDST_School_Settlement(@WebParam(name = "SettlementId") int SettlementId, @WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School_Settlement(SettlementId, limit);
    }

    @WebMethod(operationName = "listaEDST_School_District")
    public List<EDST_School> listaEDST_School_District(@WebParam(name = "DistrictId") int DistrictId, @WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School_District(DistrictId, limit);
    }

    @WebMethod(operationName = "listaEDST_School_Type")
    public List<EDST_School> listaEDST_School_Type(@WebParam(name = "TypeId") int TypeId, @WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School_Type(TypeId, limit);
    }

    @WebMethod(operationName = "listaEDST_School_AdministrativePost")
    public List<EDST_School> listaEDST_School_AdministrativePost(@WebParam(name = "AdministrativePostId") int AdministrativePostId, @WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School_AdministrativePost(AdministrativePostId, limit);
    }

    @WebMethod(operationName = "listaEDST_School_Locality")
    public List<EDST_School> listaEDST_School_Locality(@WebParam(name = "LocalityId") int LocalityId, @WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School_Locality(LocalityId, limit);
    }

    @WebMethod(operationName = "listaEDST_School_Area")
    public List<EDST_School> listaEDST_School_Area(@WebParam(name = "AreaId") int AreaId, @WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School_Area(AreaId, limit);
    }

    @WebMethod(operationName = "listaEDST_School_Zip")
    public List<EDST_School> listaEDST_School_Zip(@WebParam(name = "ZipId") int ZipId, @WebParam(name = "limit") int limit) {
        return edst_SchoolDAOImpl.listaEDST_School_Zip(ZipId, limit);
    }

    /*
     ************************** END EDST SCHOOL  ***********************/
    //=========================  EDST SCHOOL TYPE  ==========================
    EDST_SchoolTypeDAOImpl edst_SchoolTypeDAOImpl = new EDST_SchoolTypeDAOImpl();

    @WebMethod(operationName = "listaEDST_SchoolTypes")
    public List<EDST_SchoolType> listaEDST_SchoolTypes(@WebParam(name = "limit") int limit) {
        return edst_SchoolTypeDAOImpl.listaEDST_SchoolType(limit);
    }
    /*
     ************************** END EDST SCHOOL TYPE  ***********************/

    //=========================  EDST ZIP  ==========================
    EDST_ZipDAOImpl edst_ZipDAOImpl = new EDST_ZipDAOImpl();

    @WebMethod(operationName = "listaEDST_Zip")
    public List<EDST_Zip> listaEDST_Zip(@WebParam(name = "limit") int limit) {
        return edst_ZipDAOImpl.listaEDST_Zip(limit);
    }

    @WebMethod(operationName = "listaEDST_Zip_District")
    public List<EDST_Zip> listaEDST_Zip_District(@WebParam(name = "DistrictId") int DistrictId, @WebParam(name = "limit") int limit) {
        return edst_ZipDAOImpl.listaEDST_Zip_District(DistrictId, limit);
    }

    @WebMethod(operationName = "listaEDST_Zip_School")
    public List<EDST_Zip> listaEDST_Zip_School(@WebParam(name = "HeadQuarterSchoolId") int HeadQuarterSchoolId, @WebParam(name = "limit") int limit) {
        return edst_ZipDAOImpl.listaEDST_Zip_School(HeadQuarterSchoolId, limit);
    }

    /*
     ************************** END EDST ZIP  ***********************/
}
