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
import mz.co.centralserver.model.vendas.Referencia;

/**
 *
 * @author HJC2K8
 */
public class ReferenciaDAOImpl {

    private DAOGenerico daog;

    public ReferenciaDAOImpl() {

        daog = new DAOGenerico(Referencia.class);
    }

    public Referencia getReferencia(String codEscola, String ano) {
        return (Referencia) daog.buscarEntidadePorQuery("from Referencia where ref_entidade LIKE '" + codEscola + "' AND ref_ano LIKE '" + ano + "'");
    }

    public List<Referencia> listaReferencias(String codEscola) {
        return daog.buscarPorConsulta("from Referencia where ref_entidade LIKE '" + codEscola + "' order by ref_id desc");
    }

    public void persistir_referencia(Referencia referencia) {
        daog = new DAOGenerico(referencia);
        daog.inserir_actualizar();

    }

    public void remover_referencia(Referencia referencia) {
        daog = new DAOGenerico(referencia);
        daog.excluir();

    }
}
