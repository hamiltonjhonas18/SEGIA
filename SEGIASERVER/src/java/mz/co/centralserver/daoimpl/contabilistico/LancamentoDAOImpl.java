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
import mz.co.centralserver.model.contabilistico.ContaGeral;
import mz.co.centralserver.model.contabilistico.Diario;
import mz.co.centralserver.model.contabilistico.Documento;
import mz.co.centralserver.model.contabilistico.Pety;
import mz.co.centralserver.model.contabilistico.Lancamento;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
public class LancamentoDAOImpl {

    private DAOGenerico daog;

    public LancamentoDAOImpl() {
        daog = new DAOGenerico(Lancamento.class);
    }

    public Lancamento getLancamento(int id) {
        return (Lancamento) daog.buscarEntidadePorQuery("from Lancamento where lan_id = " + id);
    }

    public Lancamento getLancamento(Entidade entidade, String descricao) {
        return (Lancamento) daog.buscarEntidadePorQuery("from Lancamento where lan_referencia LIKE '" + descricao + "'  AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Lancamento> listaLancamentos(Entidade entidade) {
        return daog.buscarPorConsulta("from Lancamento where entidade_enti_id = " + entidade.getEnti_id() + " order by lan_id desc");
    }

    public List<Lancamento> listaLancamentosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Lancamento where entidade_enti_id = " + entidade.getEnti_id() + " order by lan_id desc", limite);
    }

    public List<Lancamento> listaLancamentosFuncionario(Entidade entidade, Funcionario funcionario) {
        return daog.buscarPorConsulta("from Lancamento where funcionario_func_id = " + funcionario.getFunc_id() + " order by lan_id desc");
    }

    public List<Lancamento> listaLancamentosDiario(Entidade entidade, Diario diario) {
        return daog.buscarPorConsulta("from Lancamento where diario_dir_id = " + diario.getDir_id() + " order by lan_id desc");
    }

    public List<Lancamento> listaLancamentosDocumento(Entidade entidade, Documento documento) {
        return daog.buscarPorConsulta("from Lancamento where documento_doc_id = " + documento.getDoc_id() + " order by lan_id desc");
    }

    public List<Lancamento> listaLancamentosContaCliente(Entidade entidade, ContaGeral contaCliente) {
        return daog.buscarPorConsulta("from Lancamento where contaCliente_ctg_id = " + contaCliente.getCtg_id() + " order by lan_id desc");
    }

    public List<Lancamento> listaLancamentosContaPlano(Entidade entidade, ContaGeral contaPlano) {
        return daog.buscarPorConsulta("from Lancamento where contaPlano_ctg_id = " + contaPlano.getCtg_id() + " order by lan_id desc");
    }

    public List<Lancamento> listaLancamentosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Lancamento where lan_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by lan_id desc");
    }

    public List<Lancamento> listaLancamentosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Lancamento where lan_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by lan_id desc");
    }

    public void persistir_lancamento(Lancamento lancamento) {
        daog = new DAOGenerico(lancamento);
        daog.inserir_actualizar();
    }

    public void remover_lancamento(Lancamento lancamento) {
        daog = new DAOGenerico(lancamento);
        daog.excluir();
    }
}
