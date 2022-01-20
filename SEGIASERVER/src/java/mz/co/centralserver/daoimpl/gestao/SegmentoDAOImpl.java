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
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Segmento;

/**
 *
 * @author HJC2K8
 */
public class SegmentoDAOImpl {

    private DAOGenerico daog;

    public SegmentoDAOImpl() {
        daog = new DAOGenerico(Segmento.class);
    }

    public Segmento getSegmento(int id) {
        return (Segmento) daog.buscarEntidadePorQuery("from Segmento where seg_id = " + id);
    }

    public Segmento getSegmento(Entidade entidade, String descricao) {
        return (Segmento) daog.buscarEntidadePorQuery("from Segmento where seg_categoria LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Segmento> listaSegmentos() {
        return daog.buscarPorConsulta("from Segmento order by seg_id desc");
    }

    public void persistir_segmento(Segmento segmento) {
        daog = new DAOGenerico(segmento);
        daog.inserir_actualizar();
    }

    public void remover_segmento(Segmento segmento) {
        daog = new DAOGenerico(segmento);
        daog.excluir();
    }
}
