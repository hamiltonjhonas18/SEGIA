/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.controleacesso;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.controleacesso.Browser;

/**
 *
 * @author HJC2K8
 */
public class BrowserDAOImpl {

    private DAOGenerico daog;

    public BrowserDAOImpl() {

        daog = new DAOGenerico(Browser.class);
    }

    public void persistir_browser(Browser browser) {
        daog = new DAOGenerico(browser);
        daog.inserir_actualizar();
    }

    public List<Browser> listaBrowsers(String descricao) {
        return daog.buscarPorConsulta("from Browser where bro_descricao LIKE '" + descricao + "'");
    }
    
    public List<Browser> listaBrowsers(String descricao, int idUsuario) {
        return daog.buscarPorConsulta("from Browser where bro_descricao LIKE '" + descricao + "' AND usuario_usua_id = "+idUsuario);
    }

    public List<Browser> listaBrowsers() {
        return daog.buscarPorConsulta("from Browser");
    }

}
