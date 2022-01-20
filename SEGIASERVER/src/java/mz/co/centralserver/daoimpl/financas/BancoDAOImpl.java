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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
public class BancoDAOImpl {

    private DAOGenerico daog;

    public BancoDAOImpl() {

        daog = new DAOGenerico(Banco.class);
    }

    public Banco getBanco(int id) {
        return (Banco) daog.buscarEntidadePorQuery("from Banco where bnc_id =" + id);
    }

    public Banco getBanco(Entidade entidade, String codigo) {
        return (Banco) daog.buscarEntidadePorQuery("from Banco where bnc_nome LIKE '" + codigo + "' AND  entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<Banco> listaBancos() {
        return daog.buscarPorConsulta("from Banco");
    }

    public List<Banco> listaBancos(Entidade entidade) {
        return daog.buscarPorConsulta("from Banco where entidade_enti_id =" + entidade.getEnti_id());
    }

    public List<Banco> listaBancosLimite(Entidade entidade, int limite) {
        return daog.buscarPorConsultaLimite("from Banco where entidade_enti_id =" + entidade.getEnti_id(), limite);
    }

    public void persistir_banco(Banco banco) {
        daog = new DAOGenerico(banco);
        daog.inserir_actualizar();
    }

    public void remover_banco(Banco banco) {
        daog = new DAOGenerico(banco);
        daog.excluir();
    }
}
