/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ensino;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class AnoLectivoDAOImpl {

    private DAOGenerico daog;

    public AnoLectivoDAOImpl() {
        daog = new DAOGenerico(AnoLectivo.class);
    }

    public AnoLectivo getAnoLectivo(int id) {
        return (AnoLectivo) daog.buscarEntidadePorQuery("from AnoLectivo where anol_id = " + id);
    }

    public AnoLectivo getAnoLectivo(Entidade entidade, String descricao) {
        return (AnoLectivo) daog.buscarEntidadePorQuery("from AnoLectivo where anol_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public AnoLectivo getAnoLectivoActivo(Entidade entidade) {
        return (AnoLectivo) daog.buscarEntidadePorQuery("from AnoLectivo where anol_corrente = 1 AND entidade_enti_id = " + entidade.getEnti_id());
    }


    public List<AnoLectivo> listaAnosLectivos(Entidade entidade) {
        return daog.buscarPorConsulta("from AnoLectivo where entidade_enti_id = " + entidade.getEnti_id() + " order by anol_descricao asc");
    }

    public void persistir_anoLectivo(AnoLectivo anoLectivo) {
        daog = new DAOGenerico(anoLectivo);
        daog.inserir_actualizar();
    }
}
