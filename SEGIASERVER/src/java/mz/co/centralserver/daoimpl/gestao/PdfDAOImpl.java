/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.gestao;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Pdf;

/**
 *
 * @author HJC2K8
 */
public class PdfDAOImpl {

    private DAOGenerico daog;

    public PdfDAOImpl() {
        daog = new DAOGenerico(Pdf.class);
    }

    public Pdf getPdf(int id) {
        return (Pdf) daog.buscarEntidadePorQuery("from Pdf where pdf_id = " + id);
    }

    public List<Pdf> listaPdfs() {
        return daog.buscarPorConsulta("from Pdf order by pdf_id desc");
    }

    public void persistir_pdf(Pdf pdf) {
        daog = new DAOGenerico(pdf);
        daog.inserir_actualizar();
    }
}
