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
import mz.co.centralserver.model.gestao.AgendaContacto;

/**
 *
 * @author HJC2K8
 */
public class AgendaContactoDAOImpl {

    private DAOGenerico daog;

    public AgendaContactoDAOImpl() {
        daog = new DAOGenerico(AgendaContacto.class);
    }

    public AgendaContacto getAgendaContacto(int id) {
        return (AgendaContacto) daog.buscarEntidadePorQuery("from AgendaContacto where agc_id = " + id);
    }

    public List<AgendaContacto> listaAgendaContactos() {
        return daog.buscarPorConsulta("from AgendaContacto order by agc_id desc");
    }

    public List<AgendaContacto> listaAgendaContactosCliente(int id) {
        return daog.buscarPorConsulta("from AgendaContacto where cliente_clie_id = " + id + " order by agc_id desc");
    }

    public List<AgendaContacto> listaAgendaContactosClienteMicro(int id) {
        return daog.buscarPorConsulta("from AgendaContacto where clienteMicro_clm_id = " + id + " order by agc_id desc");
    }

    public List<AgendaContacto> listaAgendaContactosFornecedor(int id) {
        return daog.buscarPorConsulta("from AgendaContacto where fornecedor_for_id = " + id + " order by agc_id desc");
    }

    public List<AgendaContacto> listaAgendaContactosFuncionario(int id) {
        return daog.buscarPorConsulta("from AgendaContacto where funcionario_func_id = " + id + " order by agc_id desc");
    }

    public List<AgendaContacto> listaAgendaContactosTipoContacto(int id) {
        return daog.buscarPorConsulta("from AgendaContacto where tipoContacto_tipc_id = " + id + " order by agc_id desc");
    }

    public void persistir_agendaContacto(AgendaContacto agendaContacto) {
        daog = new DAOGenerico(agendaContacto);
        daog.inserir_actualizar();
    }
}
