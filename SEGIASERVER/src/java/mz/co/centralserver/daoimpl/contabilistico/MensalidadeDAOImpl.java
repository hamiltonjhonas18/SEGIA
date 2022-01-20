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
import mz.co.centralserver.model.contabilistico.Mensalidade;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class MensalidadeDAOImpl {

    private DAOGenerico daog;

    public MensalidadeDAOImpl() {

        daog = new DAOGenerico(Mensalidade.class);
    }

    public Mensalidade getMensalidade(int id) {
        return (Mensalidade) daog.buscarEntidadePorQuery("from Mensalidade where mens_id = " + id);
    }
    
    public Mensalidade getMensalidadeAluno(int id) {
        return (Mensalidade) daog.buscarEntidadePorQuery("from Mensalidade where aluno_alun_id = " + id);
    }

    public List<Mensalidade> listaMensalidades(Entidade entidade) {
        return daog.buscarPorConsulta("from Mensalidade where entidade_enti_id = "+entidade.getEnti_id()+" order by mens_id desc");

    }

    public List<Mensalidade> listaMensalidadesAluno(int id) {
        return daog.buscarPorConsulta("from Mensalidade where aluno_alun_id = " + id + " order by mens_id desc");

    }

    public List<Mensalidade> listaMensalidadesAreaInscricao(Entidade entidade, int id) {
        return daog.buscarPorConsulta("from Mensalidade where areaInscricao_arei_id = " + id + " AND  entidade_enti_id = "+entidade.getEnti_id()+" order by mens_id desc");

    }

    public List<Mensalidade> listaMensalidadesCurso(Entidade entidade, int id) {
        return daog.buscarPorConsulta("from Mensalidade where curso_curs_id = " + id + " AND entidade_enti_id = "+entidade.getEnti_id()+" order by mens_id desc");

    }

    public List<Mensalidade> listaMensalidadesAlunoDataMensalidade(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from Mensalidade where mens_dataMensalidade BETWEEN '" + data1 + "' AND '" + data2 + "' AND  entidade_enti_id = "+entidade.getEnti_id()+"  order by mens_id desc");

    }

    public List<Mensalidade> listaMensalidadesAlunoDataPagamento(Entidade entidade, String data1, String data2) {
        return daog.buscarPorConsulta("from Mensalidade where mens_dataPagamento BETWEEN '" + data1 + "' AND '" + data2 + "' AND  entidade_enti_id = "+entidade.getEnti_id()+"  order by mens_id desc");

    }

    public void persistir_mensalidade(Mensalidade mensalidade) {
        daog = new DAOGenerico(mensalidade);
        daog.inserir_actualizar();
    }

    public void remover_mensalidade(Mensalidade mensalidade) {
        daog = new DAOGenerico(mensalidade);
        daog.excluir();
    }

}
