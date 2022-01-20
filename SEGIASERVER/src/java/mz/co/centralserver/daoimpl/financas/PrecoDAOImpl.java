/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.financas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.financas.Preco;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class PrecoDAOImpl {

    private DAOGenerico daog;

    public PrecoDAOImpl() {

        daog = new DAOGenerico(Preco.class);
    }

    public Preco getPreco(int id) {
        return (Preco) daog.buscarEntidadePorQuery("from Preco where bnc_id =" + id);
    }

    public List<Preco> listaPrecos(Entidade entidade) {
        return daog.buscarPorConsulta("from Preco where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<Preco> listaPrecosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Preco where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public void persistir_preco(Preco preco) {
        daog = new DAOGenerico(preco);
        daog.inserir_actualizar();
    }

    public void remover_preco(Preco preco) {
        daog = new DAOGenerico(preco);
        daog.excluir();
    }
}
