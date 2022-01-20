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
import mz.co.centralserver.model.contabilistico.Activo;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class ActivoDAOImpl {

    private DAOGenerico daog;

    public ActivoDAOImpl() {

        daog = new DAOGenerico(Activo.class);
    }

    public Activo getActivo(int id) {
        return (Activo) daog.buscarEntidadePorQuery("from Activo where acti_id =" + id);
    }

    public Activo getActivo(Entidade entidade, String codigo) {
        return (Activo) daog.buscarEntidadePorQuery("from Activo where acti_descricao LIKE '" + codigo + "' AND  entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<Activo> listaActivos(Entidade entidade) {
        return daog.buscarPorConsulta("from Activo where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<Activo> listaActivosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Activo where entidade_enti_id =" + entidade.getEnti_id(), limite);
    }

    public List<Activo> listaActivosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Activo where acti_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by acti_id desc");
    }

    public List<Activo> listaActivosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Activo where acti_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by acti_id desc");
    }

    public void persistir_activo(Activo activo) {
        daog = new DAOGenerico(activo);
        daog.inserir_actualizar();
    }

    public void remover_activo(Activo activo) {
        daog = new DAOGenerico(activo);
        daog.excluir();
    }
}
