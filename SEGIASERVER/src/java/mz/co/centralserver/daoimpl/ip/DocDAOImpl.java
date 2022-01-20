/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ip;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.ip.Doc;

/**
 *
 * @author HJC2K8
 */
public class DocDAOImpl {

    private DAOGenerico daog;

    public DocDAOImpl() {

        daog = new DAOGenerico(Doc.class);
    }

    public Doc getDoc(int id) {
        return (Doc) daog.buscarEntidadePorQuery("from Doc where doc_id = " + id);
    }

    public Doc getDoc(Entidade entidade, String descricao) {
        return (Doc) daog.buscarEntidadePorQuery("from Doc where doc_referencia LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Doc> listaDocs(Entidade entidade) {
        return daog.buscarPorConsulta("from Doc where entidade_enti_id  = " + entidade.getEnti_id() + " order by doc_id desc");
    }

    public List<Doc> listaDocsLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Doc where entidade_enti_id  = " + entidade.getEnti_id() + " order by doc_id desc", limite);
    }

    public List<Doc> listaDocsStatus(Entidade entidade, String status) {
        return daog.buscarPorConsulta("from Doc where entidade_enti_id  = " + entidade.getEnti_id() + " AND doc_status LIKE '" + status + "' order by doc_id desc");
    }

    public List<Doc> listaDocsStatusLimite(Entidade entidade, String status, int limite) {
        return daog.buscarPorConsultaLimite("from Doc where entidade_enti_id  = " + entidade.getEnti_id() + " AND doc_status LIKE '" + status + "' order by doc_id desc", limite);
    }

    public List<Doc> listaDocsPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Doc where doc_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by doc_id desc");
    }

    public List<Doc> listaDocsData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Doc where doc_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by doc_id desc");
    }

    public void persistir_doc(Doc doc) {
        daog = new DAOGenerico(doc);
        daog.inserir_actualizar();

    }

    public void remover_doc(Doc doc) {
        daog = new DAOGenerico(doc);
        daog.excluir();

    }
}
