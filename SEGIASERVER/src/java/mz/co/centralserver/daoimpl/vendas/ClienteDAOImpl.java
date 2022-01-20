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
import mz.co.centralserver.model.vendas.Cliente;

/**
 *
 * @author HJC2K8
 */
public class ClienteDAOImpl {

    private DAOGenerico daog;

    public ClienteDAOImpl() {

        daog = new DAOGenerico(Cliente.class);
    }

    public Cliente getCliente(int id) {
        return (Cliente) daog.buscarEntidadePorQuery("from Cliente where clie_id =" + id);
    }

    public Cliente getClientePessoa(int idPessoa) {
        return (Cliente) daog.buscarEntidadePorQuery("from Cliente where pessoapess_pess_id =" + idPessoa);
    }

    public List<Cliente> listaClientes(String funcao) {
        return daog.buscarPorConsulta("from Cliente where clie_funcao LIKE '" + funcao + "'");
    }

    public List<Cliente> listaClientesCategoria(Entidade entidade, String categoria) {
        return daog.buscarPorConsulta("from Cliente where clie_categoria LIKE '" + categoria + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Cliente> listaClientesLimite(String funcao, int limite) {
        return daog.buscarPorConsultaLimite("from Cliente where clie_funcao LIKE '" + funcao + "'", limite);
    }

    public void persistir_cliente(Cliente cliente) {
        daog = new DAOGenerico(cliente);
        daog.inserir_actualizar();
    }

    public void remover_cliente(Cliente cliente) {
        daog = new DAOGenerico(cliente);
        daog.excluir();
    }
}
