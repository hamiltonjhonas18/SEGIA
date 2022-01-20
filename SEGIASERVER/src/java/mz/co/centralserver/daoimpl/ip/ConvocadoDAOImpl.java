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
import mz.co.centralserver.model.gestao.Pessoa;
import mz.co.centralserver.model.ip.Convocado;
import mz.co.centralserver.model.ip.Convocatoria;

/**
 *
 * @author HJC2K8
 */
public class ConvocadoDAOImpl {

    private DAOGenerico daog;

    public ConvocadoDAOImpl() {

        daog = new DAOGenerico(Convocado.class);
    }

    public Convocado getConvocado(int id) {
        return (Convocado) daog.buscarEntidadePorQuery("from Convocado where convo_id = " + id);
    }

    public Convocado getConvocadoConvocatoria(Convocatoria convocatoria, Pessoa pessoa) {
        return (Convocado) daog.buscarEntidadePorQuery("from Convocado where convocatoria_conv_id = " + convocatoria.getConv_id() + " AND pessoa_pess_id = " + pessoa.getPess_id());
    }

    public List<Convocado> listaConvocados(Entidade entidade, Convocatoria convocatoria) {
        return daog.buscarPorConsulta("from Convocado where entidade_enti_id  = " + entidade.getEnti_id() + " AND convocatoria_conv_id = " + convocatoria.getConv_id() + " order by convo_id desc");
    }

    public void persistir_convocado(Convocado convocado) {
        daog = new DAOGenerico(convocado);
        daog.inserir_actualizar();
    }

    public void remover_convocado(Convocado convocado) {
        daog = new DAOGenerico(convocado);
        daog.excluir();
    }
}
