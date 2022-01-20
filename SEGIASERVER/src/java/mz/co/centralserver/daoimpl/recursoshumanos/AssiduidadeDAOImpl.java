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
import mz.co.centralserver.model.recursoshumanos.Assiduidade;

/**
 *
 * @author HJC2K8
 */
public class AssiduidadeDAOImpl {

    private DAOGenerico daog;

    public AssiduidadeDAOImpl() {
        daog = new DAOGenerico(Assiduidade.class);
    }

    public Assiduidade getAssiduidade(int id) {
        return (Assiduidade) daog.buscarEntidadePorQuery("from Assiduidade where assi_id = " + id);
    }

    public Assiduidade getAssiduidadeData(Entidade entidade, int id, String data) {
        return (Assiduidade) daog.buscarEntidadePorQuery("from Assiduidade where pessoa_pess_id = " + id + " AND assi_data LIKE '" + data + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Assiduidade> listaAssiduidades(Entidade entidade) {
        return daog.buscarPorConsulta("from Assiduidade where entidade_enti_id = " + entidade.getEnti_id() + " order by assi_id desc");
    }

    public List<Assiduidade> listaAssiduidadesLimit(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Assiduidade where  entidade_enti_id = " + entidade.getEnti_id() + "  order by assi_id desc", limite);
    }

    public List<Assiduidade> listaAssiduidadesUsuario(Entidade entidade, int id) {
        return daog.buscarPorConsulta("from Assiduidade where pessoa_pess_id = " + id + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by assi_id desc");
    }

    public List<Assiduidade> listaAssiduidadesUsuarioPeriodo(Entidade entidade, int id, String periodo) {
        return daog.buscarPorConsulta("from Assiduidade where pessoa_pess_id = " + id + " AND assi_data LIKE '" + periodo + "%' AND  entidade_enti_id = " + entidade.getEnti_id() + "  order by assi_id desc");
    }

    public List<Assiduidade> listaAssiduidadesData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Assiduidade where assi_data LIKE '" + data + "' AND  entidade_enti_id = " + entidade.getEnti_id() + " order by assi_id desc");
    }

    public List<Assiduidade> listaAssiduidadesPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Assiduidade where assi_data BETWEEN '" + p1 + "' AND '" + p2 + "' AND  entidade_enti_id = " + entidade.getEnti_id() + " order by assi_id desc");
    }

    public void persistir_assiduidade(Assiduidade assiduidade) {
        daog = new DAOGenerico(assiduidade);
        daog.inserir_actualizar();
    }

    public void remover_assiduidade(Assiduidade assiduidade) {
        daog = new DAOGenerico(assiduidade);
        daog.excluir();
    }
}
