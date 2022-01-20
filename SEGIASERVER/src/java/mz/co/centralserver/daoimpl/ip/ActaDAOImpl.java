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
import mz.co.centralserver.model.ip.Acta;
import mz.co.centralserver.model.ip.Convocatoria;

/**
 *
 * @author HJC2K8
 */
public class ActaDAOImpl {

    private DAOGenerico daog;

    public ActaDAOImpl() {

        daog = new DAOGenerico(Acta.class);
    }

    public Acta getActa(int id) {
        return (Acta) daog.buscarEntidadePorQuery("from Acta where acta_id = " + id);
    }

    public Acta getActaConvocatoria(Convocatoria convocatoria) {
        return (Acta) daog.buscarEntidadePorQuery("from Acta where convocatoria_conv_id = " + convocatoria.getConv_id());
    }

    public List<Acta> listaActas(Entidade entidade, Escola escola) {
        return daog.buscarPorConsulta("from Acta where entidade_enti_id  = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " order by acta_id desc");
    }

    public List<Acta> listaActasPeriodo(Entidade entidade, Escola escola, String p1, String p2) {
        return daog.buscarPorConsulta("from Acta where acta_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " order by acta_id desc");
    }

    public List<Acta> listaActasData(Entidade entidade, Escola escola, String data) {
        return daog.buscarPorConsulta("from Acta where acta_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " AND escola_esc_id =" + escola.getEsc_id() + " order by acta_id desc");
    }

    public void persistir_acta(Acta acta) {
        daog = new DAOGenerico(acta);
        daog.inserir_actualizar();

    }

    public void remover_acta(Acta acta) {
        daog = new DAOGenerico(acta);
        daog.excluir();

    }
}
