/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ensino;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.ensino.Falta;

/**
 *
 * @author HJC2K8
 */
public class FaltaDAOImpl {

    private DAOGenerico daog;

    public FaltaDAOImpl() {
        daog = new DAOGenerico(Falta.class);
    }

    public Falta getFalta(int id) {
        return (Falta) daog.buscarEntidadePorQuery("from Falta where falt_id = " + id);
    }

    public Falta getFalta(String codEscola, String ano) {
        return (Falta) daog.buscarEntidadePorQuery("from Falta where falt_ano LIKE '" + ano + "' AND cod_escola LIKE '" + codEscola+"'");
    }

    public List<Falta> listaFaltas(String codEscola) {
        return daog.buscarPorConsulta("from Falta where cod_escola LIKE '" + codEscola + "' order by falt_id asc");
    }

    public List<Falta> listaFaltasAno(String codEscola, String ano) {

        if (!ano.isEmpty()) {
            return daog.buscarPorConsulta("from Falta where falt_ano LIKE '" + ano + "' AND cod_escola LIKE '" + codEscola + "' order by falt_id asc");
        } else {
            return daog.buscarPorConsulta("from Falta where cod_escola LIKE '" + codEscola + "' order by falt_id asc");
        }

    }

    public void persistir_falta(Falta falta) {
        daog = new DAOGenerico(falta);
        daog.inserir_actualizar();
    }
}
