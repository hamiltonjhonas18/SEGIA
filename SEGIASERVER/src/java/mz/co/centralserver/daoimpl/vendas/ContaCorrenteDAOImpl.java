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
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Cliente;
import mz.co.centralserver.model.vendas.ContaCorrente;

/**
 *
 * @author HJC2K8
 */
public class ContaCorrenteDAOImpl {

    private DAOGenerico daog;

    public ContaCorrenteDAOImpl() {

        daog = new DAOGenerico(ContaCorrente.class);
    }

    public ContaCorrente getContaCorrente(int id) {
        return (ContaCorrente) daog.buscarEntidadePorQuery("from ContaCorrente  where coco_id = " + id);
    }

    public List<ContaCorrente> listaContasCorrentes(Entidade entidade) {
        return daog.buscarPorConsulta("from ContaCorrente where entidade_enti_id = " + entidade.getEnti_id() + " order by coco_id desc");
    }

    public List<ContaCorrente> listaContasCorrentesUsuario(Entidade entidade, Usuario usuario) {
        return daog.buscarPorConsulta("from ContaCorrente where usuario_usua_id = " + usuario.getUsua_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by coco_id desc");
    }

    public List<ContaCorrente> listaContasCorrentesCliente(Entidade entidade, Cliente cliente) {
        return daog.buscarPorConsulta("from ContaCorrente where cliente_clie_id = " + cliente.getClie_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by coco_id desc");
    }

    public List<ContaCorrente> listaContasCorrentesPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from ContaCorrente where coco_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by coco_id desc");
    }

    public List<ContaCorrente> listaContasCorrentesData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from ContaCorrente where coco_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by coco_id desc");
    }

    public void persistir_contaCorrente(ContaCorrente contaCorrente) {
        daog = new DAOGenerico(contaCorrente);
        daog.inserir_actualizar();
    }

    public void remover_contaCorrente(ContaCorrente contaCorrente) {
        daog = new DAOGenerico(contaCorrente);
        daog.excluir();
    }

}
