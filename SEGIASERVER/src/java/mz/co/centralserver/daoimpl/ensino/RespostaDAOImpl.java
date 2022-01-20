/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.daoimpl.ensino;

import java.util.List;
import mz.co.centralserver.dao.DAOGenerico;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.ensino.Disciplina;
import mz.co.centralserver.model.ensino.Resposta;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class RespostaDAOImpl {

    private DAOGenerico daog;

    public RespostaDAOImpl() {
        daog = new DAOGenerico(Resposta.class);
    }

    public Resposta getResposta(int id) {
        return (Resposta) daog.buscarEntidadePorQuery("from Resposta where resp_id = " + id);
    }

    public Resposta getResposta(Entidade entidade, Curso curso, AnoLectivo anoLectivo, Disciplina disciplina, String categoria, String pergunta) {
        return (Resposta) daog.buscarEntidadePorQuery("from Resposta where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + " AND resp_categoria LIKE '" + categoria + "'" + " AND resp_pergunta LIKE '" + pergunta + "'");
    }

    public List<Resposta> listaResposta(Entidade entidade) {
        return daog.buscarPorConsulta("from Resposta where entidade_enti_id = " + entidade.getEnti_id() + " order by resp_id asc");
    }

    public List<Resposta> listaRespostaDisciplina(Entidade entidade, Curso curso, Disciplina disciplina, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from Resposta where disciplina_disc_id = " + disciplina.getDisc_id() + " AND curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + " AND anoLectivo_anol_id =  " + anoLectivo.getAnol_id() + "  order by resp_id asc");
    }

    public void persistir_resposta(Resposta resposta) {
        daog = new DAOGenerico(resposta);
        daog.inserir_actualizar();
    }

    public void remover_resposta(Resposta resposta) {
        daog = new DAOGenerico(resposta);
        daog.excluir();
    }
}
