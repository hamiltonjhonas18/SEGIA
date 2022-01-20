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
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.ip.Convocatoria;

/**
 *
 * @author HJC2K8
 */
public class ConvocatoriaDAOImpl {

    private DAOGenerico daog;

    public ConvocatoriaDAOImpl() {

        daog = new DAOGenerico(Convocatoria.class);
    }

    public Convocatoria getConvocatoria(int id) {
        return (Convocatoria) daog.buscarEntidadePorQuery("from Convocatoria where conv_id = " + id);
    }

    public List<Convocatoria> listaConvocatorias(Entidade entidade, Escola escola) {
        return daog.buscarPorConsulta("from Convocatoria where entidade_enti_id  = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " order by conv_id desc");
    }

    public List<Convocatoria> listaConvocatoriasLimite(Entidade entidade, Escola escola, int limite) {
        return daog.buscarPorConsultaLimite("from Convocatoria where entidade_enti_id  = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " order by conv_id desc", limite);
    }

    public List<Convocatoria> listaConvocatoriasStatus(Entidade entidade, Escola escola, boolean status) {
        return daog.buscarPorConsulta("from Convocatoria where entidade_enti_id  = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " AND conv_status = " + status + " order by conv_id desc");
    }

    public List<Convocatoria> listaConvocatoriasStatusLimite(Entidade entidade, Escola escola, boolean status, int limite) {
        return daog.buscarPorConsultaLimite("from Convocatoria where entidade_enti_id  = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " AND conv_status = " + status + " order by conv_id desc", limite);
    }

    public List<Convocatoria> listaConvocatoriasPeriodo(Entidade entidade, Escola escola, String p1, String p2) {
        return daog.buscarPorConsulta("from Convocatoria where conv_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " order by conv_id desc");
    }

    public List<Convocatoria> listaConvocatoriasData(Entidade entidade, Escola escola, String data) {
        return daog.buscarPorConsulta("from Convocatoria where conv_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " order by conv_id desc");
    }

    public void persistir_convocatoria(Convocatoria convocatoria) {
        daog = new DAOGenerico(convocatoria);
        daog.inserir_actualizar();

    }

    public void remover_convocatoria(Convocatoria convocatoria) {
        daog = new DAOGenerico(convocatoria);
        daog.excluir();

    }
}
