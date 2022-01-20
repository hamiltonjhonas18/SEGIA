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
import mz.co.centralserver.model.ensino.Matricula;

/**
 *
 * @author HJC2K8
 */
public class MatriculaDAOImpl {

    private DAOGenerico daog;

    public MatriculaDAOImpl() {
        daog = new DAOGenerico(Matricula.class);
    }

    public Matricula getMatricula(int id) {
        return (Matricula) daog.buscarEntidadePorQuery("from Matricula where matr_id = " + id);
    }

    public Matricula getMatricula(String codEscola, String ano, String classe) {
        return (Matricula) daog.buscarEntidadePorQuery("from Matricula where matr_ano LIKE '" + ano + "' AND  matr_classe LIKE '" + classe + "' AND cod_escola LIKE '" + codEscola+"'");
    }

    public List<Matricula> listaMatriculas(String codEscola) {
        return daog.buscarPorConsulta("from Matricula where cod_escola LIKE '" + codEscola + "'  order by matr_id asc");
    }

    public List<Matricula> listaMatriculasAno(String codEscola, String ano) {
        return daog.buscarPorConsulta("from Matricula where matr_ano LIKE '" + ano + "' AND cod_escola LIKE '" + codEscola + "'  order by matr_id asc");
    }

    public void persistir_matricula(Matricula matricula) {
        daog = new DAOGenerico(matricula);
        daog.inserir_actualizar();
    }
}
