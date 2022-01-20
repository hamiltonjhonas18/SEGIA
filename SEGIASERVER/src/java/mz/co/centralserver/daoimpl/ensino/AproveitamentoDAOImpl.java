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
import mz.co.centralserver.model.ensino.Aproveitamento;

/**
 *
 * @author HJC2K8
 */
public class AproveitamentoDAOImpl {

    private DAOGenerico daog;

    public AproveitamentoDAOImpl() {
        daog = new DAOGenerico(Aproveitamento.class);
    }

    public Aproveitamento getAproveitamento(int id) {
        return (Aproveitamento) daog.buscarEntidadePorQuery("from Aproveitamento where apro_id = " + id);
    }

    public Aproveitamento getAproveitamento(String codEscola, String classe, String ano) {
        return (Aproveitamento) daog.buscarEntidadePorQuery("from Aproveitamento where apro_categoria LIKE '" + classe + "' AND apro_ano LIKE '" + ano + "' AND cod_escola LIKE '" + codEscola+"'");
    }

    public List<Aproveitamento> listaAproveitamentos(String codEscola) {
        return daog.buscarPorConsulta("from Aproveitamento where cod_escola LIKE '" + codEscola + "' order by apro_id asc");
    }

    public List<Aproveitamento> listaAproveitamentosAno(String codEscola, String ano) {
        return daog.buscarPorConsulta("from Aproveitamento where apro_ano LIKE '" + ano + "' AND cod_escola LIKE '" + codEscola + "' order by apro_id asc");
    }

    public void persistir_aproveitamento(Aproveitamento aproveitamento) {
        daog = new DAOGenerico(aproveitamento);
        daog.inserir_actualizar();
    }
}
