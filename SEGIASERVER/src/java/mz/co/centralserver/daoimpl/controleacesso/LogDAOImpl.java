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
import mz.co.centralserver.model.controleacesso.Log;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class LogDAOImpl {

    private DAOGenerico daog;

    public LogDAOImpl() {
        daog = new DAOGenerico(Log.class);
    }

    public void persistir_log(Log log) {
        daog = new DAOGenerico(log);
        daog.inserir_actualizar();
    }

    public List<Log> listaLogs(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Log where log_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Log> listaLogsSistema(Entidade entidade, int id) {
        return daog.buscarPorConsulta("from Log where sistema_sist_id= " + id + " AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Log> listaLogs(Entidade entidade, String data, int idUsuario) {
        return daog.buscarPorConsulta("from Log where log_data LIKE '" + data + "%' AND usuario_usua_id = " + idUsuario + "  AND entidade_enti_id = " + entidade.getEnti_id());
    }
    public List<Log> listaLogs(Entidade entidade, String data, int idUsuario, int limite) {
        return daog.buscarPorConsultaLimite("from Log where log_data LIKE '" + data + "%' AND usuario_usua_id = " + idUsuario + "  AND entidade_enti_id = " + entidade.getEnti_id(), limite);
    }

    public List<Log> listaLogs(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from Log where log_data BETWEEN '" + data1 + "' AND '" + data2 + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

}
