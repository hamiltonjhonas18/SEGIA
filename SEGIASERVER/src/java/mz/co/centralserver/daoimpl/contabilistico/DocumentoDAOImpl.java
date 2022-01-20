/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.contabilistico;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.contabilistico.Documento;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class DocumentoDAOImpl {

    private DAOGenerico daog;

    public DocumentoDAOImpl() {
        daog = new DAOGenerico(Documento.class);
    }

    public Documento getDocumento(int id) {
        return (Documento) daog.buscarEntidadePorQuery("from Documento where doc_id = " + id);
    }

    public Documento getDocumento(Entidade entidade, String descricao) {
        return (Documento) daog.buscarEntidadePorQuery("from Documento where entidade_enti_id = " + entidade.getEnti_id() + " AND doc_nome LIKE '" + descricao + "'");
    }

    public List<Documento> listaDocumentos(Entidade entidade) {
        return daog.buscarPorConsulta("from Documento where entidade_enti_id = " + entidade.getEnti_id() + " order by doc_id asc");
    }

    public void persistir_documento(Documento documento) {
        daog = new DAOGenerico(documento);
        daog.inserir_actualizar();
    }

    public void remover_documento(Documento documento) {
        daog = new DAOGenerico(documento);
        daog.excluir();
    }
}
