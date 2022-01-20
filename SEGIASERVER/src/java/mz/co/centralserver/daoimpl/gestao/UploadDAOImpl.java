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

import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Upload;

/**
 *
 * @author HJC2K8
 */
public class UploadDAOImpl {

    private DAOGenerico daog;

    public UploadDAOImpl() {

        daog = new DAOGenerico(Upload.class);
    }

    public Upload getUpload(Entidade entidade) {
        return (Upload) daog.buscarEntidadePorQuery("from Upload where entidade_enti_id = " + entidade.getEnti_id());
    }

    public void persistir_upload(Upload upload) {
        daog = new DAOGenerico(upload);
        daog.inserir_actualizar();

    }

    public void remover_upload(Upload upload) {
        daog = new DAOGenerico(upload);
        daog.excluir();

    }
}
