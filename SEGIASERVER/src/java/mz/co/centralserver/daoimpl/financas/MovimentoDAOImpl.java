/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.financas;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.financas.Banco;
import mz.co.centralserver.model.financas.Movimento;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class MovimentoDAOImpl {

    private DAOGenerico daog;

    public MovimentoDAOImpl() {

        daog = new DAOGenerico(Movimento.class);
    }

    public Movimento getMovimento(int id) {
        return (Movimento) daog.buscarEntidadePorQuery("from Movimento where mov_id =" + id);
    }

    public List<Movimento> listaMovimentos(Entidade entidade) {
        return daog.buscarPorConsulta("from Movimento where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<Movimento> listaMovimentosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Movimento where entidade_enti_id =" + entidade.getEnti_id() + "'", limite);
    }

    public List<Movimento> listaMovimentosBanco(Entidade entidade, Banco banco) {
        return daog.buscarPorConsulta("from Movimento where entidade_enti_id =" + entidade.getEnti_id() + " AND banco_bnc_id=" + banco.getBnc_id());
    }

    public List<Movimento> listaMovimentosData(Entidade entidade, String data) {
        return daog.buscarPorConsulta("from Movimento where entidade_enti_id =" + entidade.getEnti_id() + " AND mov_data LIKE '" + data + "%'");
    }

    public List<Movimento> listaMovimentosPeriodo(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from Movimento where entidade_enti_id =" + entidade.getEnti_id() + " AND mov_data between '" + data1 + "' AND '" + data2 + "  23:59:59.999'");
    }

    public void persistir_movimento(Movimento movimento) {
        daog = new DAOGenerico(movimento);
        daog.inserir_actualizar();
    }

    public void remover_movimento(Movimento movimento) {
        daog = new DAOGenerico(movimento);
        daog.excluir();
    }
}
