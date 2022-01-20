/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.contabilistico;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.contabilistico.Conta;
import mz.co.centralserver.model.contabilistico.TipoConta;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Cliente;

/**
 *
 * @author HJC2K8
 */
public class ContaDAOImpl {

    private DAOGenerico daog;

    public ContaDAOImpl() {
        daog = new DAOGenerico(Conta.class);
    }

    public Conta getConta(int id) {
        return (Conta) daog.buscarEntidadePorQuery("from Conta where con_id = " + id);
    }

    public Conta getConta(Entidade entidade, String descricao) {
        return (Conta) daog.buscarEntidadePorQuery("from Conta where entidade_enti_id = " + entidade.getEnti_id() + " AND con_nome LIKE '" + descricao + "'");
    }

    public List<Conta> listaContas(Entidade entidade) {
        return daog.buscarPorConsulta("from Conta where entidade_enti_id = " + entidade.getEnti_id() + " order by con_id desc");
    }

    public List<Conta> listaContasCliente(Entidade entidade, Cliente cliente) {
        return daog.buscarPorConsulta("from Conta where entidade_enti_id = " + entidade.getEnti_id() + " AND cliente_clie_id = " + cliente.getClie_id() + " order by con_id desc");
    }

    public List<Conta> listaContasTipo(Entidade entidade, TipoConta tipoConta) {
        return daog.buscarPorConsulta("from Conta where entidade_enti_id = " + entidade.getEnti_id() + " AND tipoConta_tip_id = " + tipoConta.getTip_id() + " order by con_id desc");
    }

    public void persistir_conta(Conta conta) {
        daog = new DAOGenerico(conta);
        daog.inserir_actualizar();
    }

    public void remover_conta(Conta conta) {
        daog = new DAOGenerico(conta);
        daog.excluir();
    }
}
