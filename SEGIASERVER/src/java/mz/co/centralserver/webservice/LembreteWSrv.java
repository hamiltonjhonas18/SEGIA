/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.webservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import mz.co.centralserver.daoimpl.notificacao.LembreteDAOImpl;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.notificacao.Lembrete;

/**
 *
 * @author Hamilton Jhonas
 */
@WebService(serviceName = "LembreteWSrv")
public class LembreteWSrv {

    //=========================  LEMBRETE ==========================
    LembreteDAOImpl lembreteDAOImpl = new LembreteDAOImpl();

    @WebMethod(operationName = "buscaLembreteId")
    public Lembrete buscaLembreteId(@WebParam(name = "id") int id) {
        return lembreteDAOImpl.getLembrete(id);
    }

    @WebMethod(operationName = "buscaLembreteReferencia")
    public Lembrete buscaLembreteReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return lembreteDAOImpl.getLembrete(entidade, descricao);
    }

    @WebMethod(operationName = "listaLembretes")
    public List<Lembrete> listaLembretes(@WebParam(name = "entidade") Entidade entidade) {
        return lembreteDAOImpl.listaLembretes(entidade);
    }

    @WebMethod(operationName = "listaLembretesPeriodo")
    public List<Lembrete> listaLembretesPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return lembreteDAOImpl.listaLembretesPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaLembretesData")
    public List<Lembrete> listaLembretesData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return lembreteDAOImpl.listaLembretesData(entidade, data);
    }

    @WebMethod(operationName = "persistir_lembrete")
    public void persistir_lembrete(@WebParam(name = "lembrete") Lembrete lembrete) {
        lembreteDAOImpl.persistir_lembrete(lembrete);
    }

    @WebMethod(operationName = "remover_lembrete")
    public void remover_lembrete(@WebParam(name = "lembrete") Lembrete lembrete) {
        lembreteDAOImpl.remover_lembrete(lembrete);
    }

    /*
     ************************** END LEMBRETE ***********************
     **/
}
