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
import mz.co.centralserver.model.gestao.Cidade;

/**
 *
 * @author HJC2K8
 */
public class CidadeDAOImpl {

    private DAOGenerico daog;

    public CidadeDAOImpl() {
        daog = new DAOGenerico(Cidade.class);
    }

    public Cidade getCidade(int id) {
        return (Cidade) daog.buscarEntidadePorQuery("from Cidade where cida_id = " + id);
    }

    public Cidade getCidade(String descricao) {
        return (Cidade) daog.buscarEntidadePorQuery("from Cidade where cida_descricao LIKE '" + descricao + "'");
    }

    public List<Cidade> listaCidades() {
        return daog.buscarPorConsulta("from Cidade order by cida_descricao asc");
    }

    public void persistir_cidade(Cidade cidade) {
        daog = new DAOGenerico(cidade);
        daog.inserir_actualizar();
    }
}
