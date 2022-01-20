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
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Fecho;
import mz.co.centralserver.model.vendas.Produto;
import mz.co.centralserver.model.vendas.RegistoFecho;

/**
 *
 * @author HJC2K8
 */
public class RegistoFechoDAOImpl {

    private DAOGenerico daog;

    public RegistoFechoDAOImpl() {

        daog = new DAOGenerico(RegistoFecho.class);
    }

    public RegistoFecho getRegistoFecho(int id) {
        return (RegistoFecho) daog.buscarEntidadePorQuery("from RegistoFecho  where regf_id = " + id);
    }

    public List<RegistoFecho> listaRegistosFechos(Entidade entidade) {
        return daog.buscarPorConsulta("from RegistoFecho where entidade_enti_id = " + entidade.getEnti_id() + " order by regf_id desc");
    }

    public List<RegistoFecho> listaRegistosFechosProduto(Entidade entidade, Produto produto) {
        return daog.buscarPorConsulta("from RegistoFecho where produto_pro_id = " + produto.getPro_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by regf_id desc");
    }

    public List<RegistoFecho> listaRegistosFechosFecho(Entidade entidade, Fecho fecho) {
        return daog.buscarPorConsulta("from RegistoFecho where fecho_fech_id = " + fecho.getFech_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by regf_id desc");
    }

    public List<RegistoFecho> listaRegistosFechosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from RegistoFecho where regf_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by regf_id desc");
    }
    
    public List<RegistoFecho> listaRegistosFechosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from RegistoFecho where regf_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by regf_id desc");
    }


    public void persistir_registoFecho(RegistoFecho registoFecho) {
        daog = new DAOGenerico(registoFecho);
        daog.inserir_actualizar();
    }

    public void remover_registoFecho(RegistoFecho registoFecho) {
        daog = new DAOGenerico(registoFecho);
        daog.excluir();
    }

}
