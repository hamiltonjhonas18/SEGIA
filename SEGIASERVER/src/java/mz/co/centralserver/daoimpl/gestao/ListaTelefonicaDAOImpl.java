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
import mz.co.centralserver.model.gestao.ListaTelefonica;

/**
 *
 * @author HJC2K8
 */
public class ListaTelefonicaDAOImpl {

    private DAOGenerico daog;

    public ListaTelefonicaDAOImpl() {
        daog = new DAOGenerico(ListaTelefonica.class);
    }

    public ListaTelefonica getListaTelefonica(int id) {
        return (ListaTelefonica) daog.buscarEntidadePorQuery("from ListaTelefonica where lst_id = " + id);
    }

    public ListaTelefonica getListaTelefonica(String descricao) {
        return (ListaTelefonica) daog.buscarEntidadePorQuery("from ListaTelefonica where lst_nome LIKE '" + descricao + "'");
    }

    public List<ListaTelefonica> listaListaTelefonicas() {
        return daog.buscarPorConsulta("from ListaTelefonica order by car_nome desc");
    }

    public List<ListaTelefonica> listaListaTelefonicasCategoria(String categoria) {
        return daog.buscarPorConsulta("from ListaTelefonica where lst_categoria LIKE '"+categoria+"' order by car_nome desc");
    }

    public void persistir_listaTelefonica(ListaTelefonica listaTelefonica) {
        daog = new DAOGenerico(listaTelefonica);
        daog.inserir_actualizar();
    }
}
