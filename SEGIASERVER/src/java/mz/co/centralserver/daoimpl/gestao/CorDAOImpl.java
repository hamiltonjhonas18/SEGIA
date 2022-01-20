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
import mz.co.centralserver.model.gestao.Cor;

/**
 *
 * @author HJC2K8
 */
public class CorDAOImpl {

    private DAOGenerico daog;

    public CorDAOImpl() {
        daog = new DAOGenerico(Cor.class);
    }

    public Cor getCor(int id) {
        return (Cor) daog.buscarEntidadePorQuery("from Cor where cor_id = " + id);
    }

    public Cor getCor(String descricao) {
        return (Cor) daog.buscarEntidadePorQuery("from Cor where cor_nome LIKE '" + descricao + "'");
    }

    public List<Cor> listaCores() {
        return daog.buscarPorConsulta("from Cor order by cor_nome asc");
    }

    public void persistir_cor(Cor cor) {
        daog = new DAOGenerico(cor);
        daog.inserir_actualizar();
    }
}
