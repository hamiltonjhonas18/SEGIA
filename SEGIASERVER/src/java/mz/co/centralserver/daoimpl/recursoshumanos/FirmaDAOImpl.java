/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.recursoshumanos;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Firma;

/**
 *
 * @author HJC2K8
 */
public class FirmaDAOImpl {

    private DAOGenerico daog;

    public FirmaDAOImpl() {
        daog = new DAOGenerico(Firma.class);
    }

    public Firma getFirma(int id) {
        return (Firma) daog.buscarEntidadePorQuery("from Firma where firm_id = " + id);
    }

    public Firma getFirma(Entidade entidade, String descricao) {
        return (Firma) daog.buscarEntidadePorQuery("from Firma where firm_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Firma> listaFirmas(Entidade entidade) {
        return daog.buscarPorConsulta("from Firma where entidade_enti_id = " + entidade.getEnti_id() + " order by firm_descricao asc");
    }

    public void persistir_firma(Firma firma) {
        daog = new DAOGenerico(firma);
        daog.inserir_actualizar();
    }
}
