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
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Vagas;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class VagasDAOImpl {

    private DAOGenerico daog;

    public VagasDAOImpl() {
        daog = new DAOGenerico(Vagas.class);
    }

    public Vagas getVagas(int id) {
        return (Vagas) daog.buscarEntidadePorQuery("from Vagas where vaga_id = " + id);
    }

    public Vagas getVagasAnoLectivoCurso(Entidade entidade, AnoLectivo anoLectivo, Curso curso) {
        return (Vagas) daog.buscarEntidadePorQuery("from Vagas where anoLectivo_anol_id = " + anoLectivo.getAnol_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " AND curso_curs_id =  " + curso.getCurs_id() + " order by vaga_id desc");
    }

    public List<Vagas> listaVagas(Entidade entidade) {
        return daog.buscarPorConsulta("from Vagas where entidade_enti_id = " + entidade.getEnti_id() + " order by vaga_id desc");
    }

    public List<Vagas> listaVagasCurso(Entidade entidade, Curso curso) {
        return daog.buscarPorConsulta("from Vagas where curso_curs_id = " + curso.getCurs_id() + " AND entidade_enti_id = " + entidade.getEnti_id() + "  order by vaga_id desc");
    }

    public List<Vagas> listaVagasAnoLectivo(Entidade entidade, AnoLectivo anoLectivo) {
        return daog.buscarPorConsulta("from Vagas where anoLectivo_anol_id = " + anoLectivo.getAnol_id() + " AND entidade_enti_id =  " + entidade.getEnti_id() + " order by vaga_id desc");
    }

    public void persistir_vagas(Vagas vagas) {
        daog = new DAOGenerico(vagas);
        daog.inserir_actualizar();
    }

    public void remover_vagas(Vagas vagas) {
        daog = new DAOGenerico(vagas);
        daog.excluir();
    }
}
