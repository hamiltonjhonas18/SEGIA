/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.documento;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.documento.Categoria;
import mz.co.centralserver.model.documento.Ficheiro;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Cliente;

/**
 *
 * @author HJC2K8
 */
public class FicheiroDAOImpl {

    private DAOGenerico daog;

    public FicheiroDAOImpl() {
        daog = new DAOGenerico(Ficheiro.class);
    }

    public Ficheiro getFicheiro(int id) {
        return (Ficheiro) daog.buscarEntidadePorQuery("from Ficheiro where fich_id = " + id);
    }

    public Ficheiro getFicheiro(Entidade entidade, String descricao) {
        return (Ficheiro) daog.buscarEntidadePorQuery("from Ficheiro where fich_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Ficheiro> listaFicheiros(Entidade entidade) {
        return daog.buscarPorConsulta("from Ficheiro where entidade_enti_id = " + entidade.getEnti_id() + " order by fich_id asc");

    }

    public List<Ficheiro> listaFicheirosCategoria(Entidade entidade, Categoria categoria) {
        return daog.buscarPorConsulta("from Ficheiro where categoria_cate_id = " + categoria.getCate_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fich_id desc");
    }

    public List<Ficheiro> listaFicheirosCliente(Entidade entidade, Cliente cliente) {
        return daog.buscarPorConsulta("from Ficheiro where cliente_clie_id = " + cliente.getClie_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by fich_id desc");
    }

    public List<Ficheiro> listaFicheirosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Ficheiro where fich_datacricao BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by fich_id desc");
    }

    public List<Ficheiro> listaFicheirosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Ficheiro where fich_datacricao LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by fich_id desc");
    }

    public List<Ficheiro> listaFicheirosClientePeriodo(Entidade entidade, Cliente cliente, String p1, String p2) {
        return daog.buscarPorConsulta("from Ficheiro where fich_datacricao BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " AND cliente_clie_id = " + cliente.getClie_id() + " order by fich_id desc");
    }

    public List<Ficheiro> listaFicheirosClienteData(Entidade entidade, Cliente cliente, String data) {
        return daog.buscarPorConsulta("from Ficheiro where fich_datacricao LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " AND cliente_clie_id = " + cliente.getClie_id() + " order by fich_id desc");
    }

    public List<Ficheiro> listaFicheirosClienteAno(Entidade entidade, Cliente cliente, String periodo) {
        return daog.buscarPorConsulta("from Ficheiro where fich_periodo LIKE '" + periodo + "' AND entidade_enti_id = " + entidade.getEnti_id() + " AND cliente_clie_id = " + cliente.getClie_id() + " order by fich_id desc");
    }

    public void persistir_documento(Ficheiro documento) {
        daog = new DAOGenerico(documento);
        daog.inserir_actualizar();
    }

    public void remover_documento(Ficheiro documento) {
        daog = new DAOGenerico(documento);
        daog.excluir();
    }
}
