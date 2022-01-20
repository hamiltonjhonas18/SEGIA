/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.webclientcontroler;

import com.dciapps.webclient.EdstDistrict;
import com.dciapps.webclient.EdstProvince;
import com.dciapps.webclient.EdstSchool;


/**
 *
 * @author HJC2K8
 */
public class EducStatCtrl {

    public java.util.List<com.dciapps.webclient.EdstAdministrativePost> listaEDSTAdministrativePost(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTAdministrativePost(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstAdministrativePost> listaEDSTAdministrativePostDistrict(int districtId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTAdministrativePostDistrict(districtId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstArea> listaEDSTArea(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTArea(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstArea> listaEDSTAreaSettlement(int settlementId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTAreaSettlement(settlementId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstDistrict> listaEDSTDistrict(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTDistrict(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstDistrict> listaEDSTDistrictProvince(int provinceId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTDistrictProvince(provinceId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstEducation> listaEDSTEducation(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTEducation(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstProvince> listaEDSTProvince(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTProvince(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchool(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchool(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchoolType> listaEDSTSchoolTypes(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolTypes(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchoolAdministrativePost(int administrativePostId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolAdministrativePost(administrativePostId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchoolArea(int areaId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolArea(areaId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchoolDistrict(int districtId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolDistrict(districtId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchoolLocality(int localityId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolLocality(localityId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchoolSettlement(int settlementId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolSettlement(settlementId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchoolType(int typeId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolType(typeId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstSchool> listaEDSTSchoolZip(int zipId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTSchoolZip(zipId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstZip> listaEDSTZip(int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTZip(limit);
    }

    public java.util.List<com.dciapps.webclient.EdstZip> listaEDSTZipDistrict(int districtId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTZipDistrict(districtId, limit);
    }

    public java.util.List<com.dciapps.webclient.EdstZip> listaEDSTZipSchool(int headQuarterSchoolId, int limit) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.listaEDSTZipSchool(headQuarterSchoolId, limit);
    }

    public EdstSchool buscaEDSTSchool(int id, int local) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.buscaEDSTSchool(id, local);
    }

    public EdstDistrict buscaEDSTDistrict(int id) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.buscaEDSTDistrict(id);
    }

    public EdstProvince buscaEDSTProvince(int id) {
        com.dciapps.webclient.EducStatWSrv_Service service = new com.dciapps.webclient.EducStatWSrv_Service();
        com.dciapps.webclient.EducStatWSrv port = service.getEducStatWSrvPort();
        return port.buscaEDSTProvince(id);
    }

 
}
