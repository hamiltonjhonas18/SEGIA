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
import mz.co.centralserver.model.contabilistico.Pagamento;
import mz.co.centralserver.model.contabilistico.ReciboPagamento;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
public class PagamentoDAOImpl {

    private DAOGenerico daog;

    public PagamentoDAOImpl() {
        daog = new DAOGenerico(Pagamento.class);
    }

    public Pagamento getPagamento(int id) {
        return (Pagamento) daog.buscarEntidadePorQuery("from Pagamento where pag_id = " + id);
    }

    public Pagamento getPagamento(Entidade entidade, String descricao) {
        return (Pagamento) daog.buscarEntidadePorQuery("from Pagamento where pag_referencia LIKE '" + descricao + "'  AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Pagamento> listaPagamentos(Entidade entidade) {
        return daog.buscarPorConsulta("from Pagamento where entidade_enti_id = " + entidade.getEnti_id() + " order by pag_id asc");
    }

    public List<Pagamento> listaPagamentos(Entidade entidade, String origem) {
        return daog.buscarPorConsulta("from Pagamento where entidade_enti_id = " + entidade.getEnti_id() + " AND pag_origem LIKE '" + origem + "' order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosCondicao(Entidade entidade, String condicao) {
        return daog.buscarPorConsulta("from Pagamento where entidade_enti_id = " + entidade.getEnti_id() + " AND pag_condicao LIKE '" + condicao + "' order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosReferencia(Entidade entidade, String referencia) {
        return daog.buscarPorConsulta("from Pagamento where entidade_enti_id = " + entidade.getEnti_id() + " AND pag_referencia LIKE '" + referencia + "' order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosCliente(Entidade entidade, Pessoa pessoa) {
        return daog.buscarPorConsulta("from Pagamento where pessoa_pess_id = " + pessoa.getPess_id() + " order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosRecibo(Entidade entidade, ReciboPagamento reciboPagamento) {
        return daog.buscarPorConsulta("from Pagamento where reciboPagamento_recp_id = " + reciboPagamento.getRecp_id() + " order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosPendentesCliente(Entidade entidade, Pessoa pessoa) {
        return daog.buscarPorConsulta("from Pagamento where pessoa_pess_id = " + pessoa.getPess_id() + " AND pag_status = 1 order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosTurma(Entidade entidade, Turma turma) {
        return daog.buscarPorConsulta("from Pagamento where turma_turm_id = " + turma.getTurm_id() + " order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosInscricao(Entidade entidade, Inscricao inscricao) {
        return daog.buscarPorConsulta("from Pagamento where inscricao_insc_id = " + inscricao.getInsc_id() + " order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Pagamento where pag_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pag_id asc");
    }

    public List<Pagamento> listaPagamentosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Pagamento where pag_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by pag_id asc");
    }

    public void persistir_pagamento(Pagamento pagamento) {
        daog = new DAOGenerico(pagamento);
        daog.inserir_actualizar();
    }

    public void remover_pagamento(Pagamento pagamento) {
        daog = new DAOGenerico(pagamento);
        daog.excluir();
    }

}
