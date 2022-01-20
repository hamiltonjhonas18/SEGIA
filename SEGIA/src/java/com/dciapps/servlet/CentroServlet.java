/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.servlet;

import com.dciapps.local.School;
import com.dciapps.localcontroler.Data;
import com.dciapps.localcontroler.EncryptUtils;
import com.dciapps.localcontroler.ExceptionWriter;
import com.dciapps.localcontroler.MailSender;
import com.dciapps.localcontroler.PCInfo;
import com.dciapps.localcontroler.StringUtils;
import com.dciapps.mail.Sender;
import com.dciapps.webclient.EdstAdministrativePost;
import com.dciapps.webclient.EdstArea;
import com.dciapps.webclient.EdstDistrict;
import com.dciapps.webclient.EdstEducation;
import com.dciapps.webclient.EdstProvince;
import com.dciapps.webclient.EdstSchool;
import com.dciapps.webclient.EdstSchoolType;
import com.dciapps.webclient.EdstZip;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Log;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.Usuario;
import com.dciapps.webclientcontroler.ControleAcessoCtrl;
import com.dciapps.webclientcontroler.EducStatCtrl;
import com.dciapps.webclientcontroler.EnsinoCtrl;
import com.dciapps.webclientcontroler.GestaoCtrl;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author HJC2K8
 */
@WebServlet(name = "Q2VudHJvU2VydmxldCNEQ0k=", urlPatterns = {"/Q2VudHJvU2VydmxldCNEQ0k="})
public class CentroServlet extends HttpServlet {

    Entidade entidade;

    Data data = new Data();

    Sistema sistema;

    ControleAcessoCtrl controleAcessoCtrl = new ControleAcessoCtrl();
    GestaoCtrl gestaoCtrl = new GestaoCtrl();
    EnsinoCtrl ensinoCtrl = new EnsinoCtrl();

    EducStatCtrl educStatCtrl = new EducStatCtrl();

    MailSender ms = new MailSender();
    PCInfo pCInfo = new PCInfo();

    StringUtils stringUtils = new StringUtils();
    EncryptUtils encryptUtils = new EncryptUtils();

    Sender sender = new Sender();

    @SuppressWarnings("UseSpecificCatch")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {

            String url = encryptUtils.decodeString(request.getQueryString());
            System.out.println(url);

            StringTokenizer st1 = new StringTokenizer(url, "#");

            System.err.println(st1.nextToken());

            StringTokenizer st = new StringTokenizer(st1.nextToken(), "&");

            // Pega a accao
            String accao = st.nextToken();
            System.err.println(accao);

            request.getSession().setAttribute("alerta", "");
            request.getSession().setAttribute("msgErro", "");

            Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
            sistema = (Sistema) request.getSession().getAttribute("sistema");

            entidade = (Entidade) request.getSession().getAttribute("entidadeSelecionada");

            if (entidade == null) {
                entidade = (Entidade) request.getSession().getAttribute("entidade");
            }

            switch (accao) {

                case "filtrar-distrito": {

                    String to = st.nextToken().split("=")[1];
                    int id = Integer.parseInt(request.getParameter("idDistrito"));
                    List<EdstDistrict> distritos = (List<EdstDistrict>) request.getSession().getAttribute("distritos");

                    List<EdstSchoolType> tipoEscolas = (List<EdstSchoolType>) request.getSession().getAttribute("tipoEscolas");

                    EdstDistrict distrito = getDistrito(distritos, id);

                    List<EdstAdministrativePost> postosAdministrativos = null;

                    List<School> schools = new ArrayList();

                    int limite = -1;

                    if (distrito != null) {

                        postosAdministrativos = educStatCtrl.listaEDSTAdministrativePostDistrict(distrito.getId(), limite);
                        List<EdstSchool> escolas = educStatCtrl.listaEDSTSchoolDistrict(distrito.getId(), limite);

                        schools = fillSchools(escolas, distritos, tipoEscolas, postosAdministrativos);
                    }

                    request.getSession().setAttribute("distritos", distritos);
                    request.getSession().setAttribute("postosAdministrativos", postosAdministrativos);
                    request.getSession().setAttribute("distrito", distrito);
                    request.getSession().setAttribute("schools", schools);

                    response.sendRedirect(to);
                }
                ;
                break;

                case "centros": {

                    int limite = -1;
                    List<EdstProvince> provincias = (List<EdstProvince>) request.getSession().getAttribute("provincias");

                    if (provincias == null) {
                        provincias = educStatCtrl.listaEDSTProvince(limite);

                        request.getSession().setAttribute("provincias", provincias);
                    }

                    List<EdstSchoolType> tipoEscolas = (List<EdstSchoolType>) request.getSession().getAttribute("tipoEscolas");

                    if (tipoEscolas == null) {
                        tipoEscolas = educStatCtrl.listaEDSTSchoolTypes(-1);

                        request.getSession().setAttribute("tipoEscolas", tipoEscolas);
                    }

                    EdstProvince provincia = null;

                    if (request.getParameter("idProvincia") != null) {

                        int idProvincia = Integer.parseInt(request.getParameter("idProvincia"));
                        provincia = getProvincia(provincias, idProvincia);

                    } else {

                        if (provincias != null) {
                            if (!provincias.isEmpty()) {
                                provincia = provincias.get(0);
                            }
                        }

                    }

                    List<EdstDistrict> distritos = null;
                    EdstDistrict distrito = null;

                    List<EdstAdministrativePost> postosAdministrativos = null;

                    List<School> schools = new ArrayList();

                    if (provincia != null) {
                        distritos = educStatCtrl.listaEDSTDistrictProvince(provincia.getId(), limite);

                        if (distritos != null) {
                            if (!distritos.isEmpty()) {
                                distrito = distritos.get(0);
                            }
                        }

                    }

                    if (distrito != null) {

                        postosAdministrativos = educStatCtrl.listaEDSTAdministrativePostDistrict(distrito.getId(), -1);
                        List<EdstSchool> escolas = educStatCtrl.listaEDSTSchoolDistrict(distrito.getId(), -1);

                        schools = fillSchools(escolas, distritos, tipoEscolas, postosAdministrativos);
                    }

                    request.getSession().setAttribute("provincia", provincia);
                    request.getSession().setAttribute("provincia", provincia);
                    request.getSession().setAttribute("distritos", distritos);
                    request.getSession().setAttribute("postosAdministrativos", postosAdministrativos);
                    request.getSession().setAttribute("distrito", distrito);
                    request.getSession().setAttribute("schools", schools);

                    response.sendRedirect("institution");
                }
                ;
                break;

            }
        } catch (Exception exception) {

            Data d = new Data();
            d.le_hora();

            ExceptionWriter ew = new ExceptionWriter();

            String datetime = d.getAno() + "_" + d.getMesString() + "_" + d.getDia() + "_" + d.getHora() + d.getMinuto() + d.getSegundo();
            String msg = "Ocorreu um excepção do tipo:<br>" + ew.getStackTrace(exception);
            String assunto = "[Exception]: " + datetime;

            ew.writeToFile(datetime, msg);
            sender.mailException(assunto, datetime, msg);

            response.sendRedirect("error-500");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Log addLog(Usuario u, String desc) {
        data.le_hora();
        Log log = new Log();

        GregorianCalendar gc = new GregorianCalendar();
        gc.setGregorianChange(new Date());
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(gc);

        log.setLogData(calendar);
        log.setLogHora(data.getHora() + ":" + data.getMinuto() + ":" + data.getSegundo());
        log.setLogDescricao(desc);
        log.setUsuario(u);
        log.setSistema(sistema);
        log.setEntidade(entidade);

        return log;
    }

    private EdstProvince getProvincia(List<EdstProvince> provincias, int id) {
        EdstProvince obj = null;

        if (provincias != null) {
            for (EdstProvince o : provincias) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private EdstDistrict getDistrito(List<EdstDistrict> distritos, int id) {
        EdstDistrict obj = null;

        if (distritos != null) {
            for (EdstDistrict o : distritos) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private EdstZip getZip(List<EdstZip> values, int id) {
        EdstZip obj = null;

        if (values != null) {
            for (EdstZip o : values) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private EdstArea getArea(List<EdstArea> values, int id) {
        EdstArea obj = null;

        if (values != null) {
            for (EdstArea o : values) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private EdstAdministrativePost getPostoAdministrativo(List<EdstAdministrativePost> values, int id) {
        EdstAdministrativePost obj = null;

        if (values != null) {
            for (EdstAdministrativePost o : values) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private EdstEducation getTipoEnsino(List<EdstEducation> values, int id) {
        EdstEducation obj = null;

        if (values != null) {
            for (EdstEducation o : values) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private EdstSchool getEscola(List<EdstSchool> values, int id) {
        EdstSchool obj = null;

        if (values != null) {
            for (EdstSchool o : values) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private EdstSchoolType getTipoEscola(List<EdstSchoolType> values, int id) {
        EdstSchoolType obj = null;

        if (values != null) {
            for (EdstSchoolType o : values) {
                if (o.getId() == id) {
                    obj = o;
                }
            }

        }

        return obj;
    }

    private List<School> fillSchools(List<EdstSchool> escolas, List<EdstDistrict> distritos, List<EdstSchoolType> edstSchoolTypes, List<EdstAdministrativePost> postosAdministrativos) {
        List<School> schools = new ArrayList();

        if (escolas != null) {
            for (EdstSchool es : escolas) {

                int id = es.getId();
                int local = es.getLocal();
                String nome = es.getName();
                String abreviatura = es.getAbbreviation();
                String key = id + "" + local;

                String tipo = "";
                String distrito = "";
                String postoAdminstrativo = "";
                String localidade = "";
                String area = "";
                String zip = "";

                int ano = 0;
                double coorX = 0;
                double coorY = 0;

                if (es.getTypeId() != null) {
                    EdstSchoolType edstSchoolType = getTipoEscola(edstSchoolTypes, es.getTypeId());

                    if (edstSchoolType != null) {
                        tipo = edstSchoolType.getName();
                    }
                }

                if (es.getDistrictId() != null) {
                    EdstDistrict edstDistrict = getDistrito(distritos, es.getDistrictId());

                    if (edstDistrict != null) {
                        distrito = edstDistrict.getName();
                    }
                }

                if (es.getAdministrativePostId() != null) {
                    EdstAdministrativePost edstAdministrativePost = getPostoAdministrativo(postosAdministrativos, es.getAdministrativePostId());

                    if (edstAdministrativePost != null) {
                        postoAdminstrativo = edstAdministrativePost.getName();
                    }
                }

                if (es.getYearOpened() != null) {
                    ano = es.getYearOpened();
                }

                if (es.getCoordinateX() != null) {
                    coorX = es.getCoordinateX();
                }

                if (es.getCoordinateY() != null) {
                    coorY = es.getCoordinateY();
                }

                School school = new School();
                school.setAbreviatura(abreviatura);
                school.setAno(ano);
                school.setArea(area);
                school.setCoorX(coorX);
                school.setCoorY(coorY);
                school.setDistrito(distrito);
                school.setId(id);
                school.setLocalidade(localidade);
                school.setNome(nome);
                school.setPostoAdminstrativo(postoAdminstrativo);
                school.setTipo(tipo);
                school.setZip(zip);
                school.setKey(key);

                schools.add(school);
            }
        }

        return schools;
    }
}
