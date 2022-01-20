/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.notificacao;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.notificacao.Lembrete;

/**
 *
 * @author HJC2K8
 */
public class LembreteDAOImpl {

    private DAOGenerico daog;

    public LembreteDAOImpl() {

        daog = new DAOGenerico(Lembrete.class);
    }

    public Lembrete getLembrete(int id) {
        return (Lembrete) daog.buscarEntidadePorQuery("from Lembrete where lemb_id = " + id);
    }

    public Lembrete getLembrete(Entidade entidade, String descricao) {
        return (Lembrete) daog.buscarEntidadePorQuery("from Lembrete where lemb_descricao LIKE '" + descricao + "' AND entidade_enti_id = " + entidade.getEnti_id());
    }

    public List<Lembrete> listaLembretes(Entidade entidade) {
        return daog.buscarPorConsulta("from Lembrete where entidade_enti_id  = " + entidade.getEnti_id() + " order by lemb_id desc");
    }

    public List<Lembrete> listaLembretesPeriodo(Entidade entidade, String p1, String p2) {
        return daog.buscarPorConsulta("from Lembrete where lemb_data BETWEEN '" + p1 + "' AND  '" + p2 + " 23:59:59.999'  AND entidade_enti_id = " + entidade.getEnti_id() + " order by lemb_id desc");
    }

    public List<Lembrete> listaLembretesData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Lembrete where lemb_data LIKE '" + data + "%' AND entidade_enti_id = " + entidade.getEnti_id() + " order by lemb_id desc");
    }

    public void persistir_lembrete(Lembrete lembrete) {
        daog = new DAOGenerico(lembrete);
        daog.inserir_actualizar();

    }

    public void remover_lembrete(Lembrete lembrete) {
        daog = new DAOGenerico(lembrete);
        daog.excluir();

    }
}
