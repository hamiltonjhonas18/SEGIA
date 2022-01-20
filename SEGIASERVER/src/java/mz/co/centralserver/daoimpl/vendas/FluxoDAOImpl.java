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
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Produto;
import mz.co.centralserver.model.vendas.Fluxo;

/**
 *
 * @author HJC2K8
 */
public class FluxoDAOImpl {

    private DAOGenerico daog;

    public FluxoDAOImpl() {

        daog = new DAOGenerico(Fluxo.class);
    }

    public Fluxo getFluxo(int id) {
        return (Fluxo) daog.buscarEntidadePorQuery("from Fluxo  where flux_id = " + id);
    }

    public List<Fluxo> listaFluxos(Entidade entidade) {
        return daog.buscarPorConsulta("from Fluxo where entidade_enti_id = " + entidade.getEnti_id() + " order by flux_id desc");
    }

    public List<Fluxo> listaFluxoUsuario(Entidade entidade, Usuario usuario) {
        return daog.buscarPorConsulta("from Fluxo where usuario_usua_id = " + usuario.getUsua_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by flux_id desc");
    }

    public List<Fluxo> listaFluxoProduto(Entidade entidade, Produto produto) {
        return daog.buscarPorConsulta("from Fluxo where produto_pro_id = " + produto.getPro_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by flux_id desc");
    }

    public List<Fluxo> listaFluxoUsuarioProduto(Entidade entidade, Produto produto, Usuario usuario) {
        return daog.buscarPorConsulta("from Fluxo where produto_pro_id = " + produto.getPro_id() + " AND usuario_usua_id = " + usuario.getUsua_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " order by flux_id desc");
    }

    public List<Fluxo> listaFluxoPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Fluxo where flux_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by flux_id desc");
    }

    public List<Fluxo> listaFluxoData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Fluxo where flux_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by flux_id desc");
    }

    public List<Fluxo> listaFluxoTurmaPeriodo(Entidade entidade, Turma turma, String p1, String p2) {
        return daog.buscarPorConsulta("from Fluxo where flux_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " AND turma_turm_id = " + turma.getTurm_id() + " order by flux_id desc");
    }

    public List<Fluxo> listaFluxoTurmaData(Entidade entidade, Turma turma, String data) {
        return daog.buscarPorConsulta("from Fluxo where flux_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " AND turma_turm_id = " + turma.getTurm_id() + " order by flux_id desc");
    }

    public void persistir_fluxo(Fluxo fluxo) {
        daog = new DAOGenerico(fluxo);
        daog.inserir_actualizar();
    }

    public void remover_fluxo(Fluxo fluxo) {
        daog = new DAOGenerico(fluxo);
        daog.excluir();
    }

}
