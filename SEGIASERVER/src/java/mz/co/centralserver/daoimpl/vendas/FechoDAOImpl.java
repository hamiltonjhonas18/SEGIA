/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.vendas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Fecho;

/**
 *
 * @author HJC2K8
 */
public class FechoDAOImpl {

    private DAOGenerico daog;

    public FechoDAOImpl() {

        daog = new DAOGenerico(Fecho.class);
    }

    public Fecho getFecho(int id) {
        return (Fecho) daog.buscarEntidadePorQuery("from Fecho  where fech_id = " + id);
    }

    public Fecho getFechoData(Entidade entidade, String data) {
        return (Fecho) daog.buscarEntidadePorQuery("from Fecho where fech_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Fecho> listaFechos(Entidade entidade) {
        return daog.buscarPorConsulta("from Fecho where entidade_enti_id = " + entidade.getEnti_id() + " order by fech_id desc");
    }

    public List<Fecho> listaFechosUsuario(Entidade entidade, Usuario usuario) {
        return daog.buscarPorConsulta("from Fecho where usuario_usua_id = " + usuario.getUsua_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fech_id desc");
    }

    public List<Fecho> listaFechosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Fecho where fech_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fech_id desc");
    }

    public List<Fecho> listaFechosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Fecho where fech_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fech_id desc");
    }

    public void persistir_fecho(Fecho fecho) {
        daog = new DAOGenerico(fecho);
        daog.inserir_actualizar();
    }

    public void remover_fecho(Fecho fecho) {
        daog = new DAOGenerico(fecho);
        daog.excluir();
    }

}
