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
import mz.co.centralserver.daoimpl.ip.ActaDAOImpl;
import mz.co.centralserver.daoimpl.ip.CodigoDAOImpl;
import mz.co.centralserver.daoimpl.ip.ConvocadoDAOImpl;
import mz.co.centralserver.daoimpl.ip.ConvocatoriaDAOImpl;
import mz.co.centralserver.daoimpl.ip.DocDAOImpl;
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;
import mz.co.centralserver.model.ip.Acta;
import mz.co.centralserver.model.ip.Codigo;
import mz.co.centralserver.model.ip.Convocado;
import mz.co.centralserver.model.ip.Convocatoria;
import mz.co.centralserver.model.ip.Doc;

/**
 *
 * @author hamil
 */
@WebService(serviceName = "DocumentoWSrv")
public class DocumentoWSrv {

    //=========================  DOCS ==========================
    DocDAOImpl docDAOImpl = new DocDAOImpl();

    @WebMethod(operationName = "buscaDocId")
    public Doc buscaDocId(@WebParam(name = "id") int id) {
        return docDAOImpl.getDoc(id);
    }

    @WebMethod(operationName = "buscaDocReferencia")
    public Doc buscaDocReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return docDAOImpl.getDoc(entidade, descricao);
    }

    @WebMethod(operationName = "listaDocs")
    public List<Doc> listaDocs(@WebParam(name = "entidade") Entidade entidade) {
        return docDAOImpl.listaDocs(entidade);
    }

    @WebMethod(operationName = "listaDocsStatus")
    public List<Doc> listaDocsStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status) {
        return docDAOImpl.listaDocsStatus(entidade, status);
    }

    @WebMethod(operationName = "listaDocsLimite")
    public List<Doc> listaDocsLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return docDAOImpl.listaDocsLimite(entidade, limite);
    }

    @WebMethod(operationName = "listaDocsStatusLimite")
    public List<Doc> listaDocsStatusLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status, @WebParam(name = "limite") int limite) {
        return docDAOImpl.listaDocsStatusLimite(entidade, status, limite);
    }

    @WebMethod(operationName = "listaDocsPeriodo")
    public List<Doc> listaDocsPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return docDAOImpl.listaDocsPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaDocsData")
    public List<Doc> listaDocsData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return docDAOImpl.listaDocsData(entidade, data);
    }

    @WebMethod(operationName = "persistir_doc")
    public void persistir_doc(@WebParam(name = "doc") Doc doc) {
        docDAOImpl.persistir_doc(doc);
    }

    @WebMethod(operationName = "remover_doc")
    public void remover_doc(@WebParam(name = "doc") Doc doc) {
        docDAOImpl.remover_doc(doc);
    }

    /*
     ************************** END DOCS ***********************
     **/
    //=========================  CODIGO ==========================
    CodigoDAOImpl codigoDAOImpl = new CodigoDAOImpl();

    @WebMethod(operationName = "buscaCodigoId")
    public Codigo buscaCodigoId(@WebParam(name = "id") int id) {
        return codigoDAOImpl.getCodigo(id);
    }

    @WebMethod(operationName = "buscaCodigoDescricao")
    public Codigo buscaCodigoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return codigoDAOImpl.getCodigo(entidade, descricao);
    }

    @WebMethod(operationName = "buscaCodigoDescricaoReferencia")
    public Codigo buscaCodigoDescricaoReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return codigoDAOImpl.getCodigoReferenica(entidade, descricao);
    }

    @WebMethod(operationName = "listaCodigos")
    public List<Codigo> listaCodigos(@WebParam(name = "entidade") Entidade entidade) {
        return codigoDAOImpl.listaCodigos(entidade);
    }

    @WebMethod(operationName = "persistir_codigo")
    public void persistir_codigo(@WebParam(name = "codigo") Codigo codigo) {
        codigoDAOImpl.persistir_codigo(codigo);
    }

    @WebMethod(operationName = "remover_codigo")
    public void remover_codigo(@WebParam(name = "codigo") Codigo codigo) {
        codigoDAOImpl.remover_codigo(codigo);
    }

    /*
     ************************** END CODIGO ***********************
     **/
    //=========================  CONVOCATORIA ==========================
    ConvocatoriaDAOImpl convocatoriaDAOImpl = new ConvocatoriaDAOImpl();

    @WebMethod(operationName = "buscaConvocatoriaId")
    public Convocatoria buscaConvocatoriaId(@WebParam(name = "id") int id) {
        return convocatoriaDAOImpl.getConvocatoria(id);
    }

    @WebMethod(operationName = "listaConvocatorias")
    public List<Convocatoria> listaConvocatorias(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola) {
        return convocatoriaDAOImpl.listaConvocatorias(entidade, escola);
    }

    @WebMethod(operationName = "listaConvocatoriasStatus")
    public List<Convocatoria> listaConvocatoriasStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "status") boolean status) {
        return convocatoriaDAOImpl.listaConvocatoriasStatus(entidade, escola, status);
    }

    @WebMethod(operationName = "listaConvocatoriasLimite")
    public List<Convocatoria> listaConvocatoriasLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "limite") int limite) {
        return convocatoriaDAOImpl.listaConvocatoriasLimite(entidade, escola, limite);
    }

    @WebMethod(operationName = "listaConvocatoriasStatusLimite")
    public List<Convocatoria> listaConvocatoriasStatusLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "status") boolean status, @WebParam(name = "limite") int limite) {
        return convocatoriaDAOImpl.listaConvocatoriasStatusLimite(entidade, escola, status, limite);
    }

    @WebMethod(operationName = "listaConvocatoriasPeriodo")
    public List<Convocatoria> listaConvocatoriasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return convocatoriaDAOImpl.listaConvocatoriasPeriodo(entidade, escola, p1, p2);
    }

    @WebMethod(operationName = "listaConvocatoriasData")
    public List<Convocatoria> listaConvocatoriasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "data") String data) {
        return convocatoriaDAOImpl.listaConvocatoriasData(entidade, escola, data);
    }

    @WebMethod(operationName = "persistir_convocatoria")
    public void persistir_convocatoria(@WebParam(name = "convocatoria") Convocatoria convocatoria) {
        convocatoriaDAOImpl.persistir_convocatoria(convocatoria);
    }

    @WebMethod(operationName = "remover_convocatoria")
    public void remover_convocatoria(@WebParam(name = "convocatoria") Convocatoria convocatoria) {
        convocatoriaDAOImpl.remover_convocatoria(convocatoria);
    }

    /*
     ************************** END CONVOCATORIA ***********************
     **/
    //=========================  ACTA ==========================
    ActaDAOImpl actaDAOImpl = new ActaDAOImpl();

    @WebMethod(operationName = "buscaActaId")
    public Acta buscaActaId(@WebParam(name = "id") int id) {
        return actaDAOImpl.getActa(id);
    }

    @WebMethod(operationName = "buscaActaConvocatoria")
    public Acta buscaActaConvocatoria(@WebParam(name = "convocatoria") Convocatoria convocatoria) {
        return actaDAOImpl.getActaConvocatoria(convocatoria);
    }

    @WebMethod(operationName = "listaActas")
    public List<Acta> listaActas(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola) {
        return actaDAOImpl.listaActas(entidade, escola);
    }

    @WebMethod(operationName = "listaActasPeriodo")
    public List<Acta> listaActasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return actaDAOImpl.listaActasPeriodo(entidade, escola, p1, p2);
    }

    @WebMethod(operationName = "listaActasData")
    public List<Acta> listaActasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "data") String data) {
        return actaDAOImpl.listaActasData(entidade, escola, data);
    }

    @WebMethod(operationName = "persistir_acta")
    public void persistir_acta(@WebParam(name = "acta") Acta acta) {
        actaDAOImpl.persistir_acta(acta);
    }

    @WebMethod(operationName = "remover_acta")
    public void remover_acta(@WebParam(name = "acta") Acta acta) {
        actaDAOImpl.remover_acta(acta);
    }

    /*
     ************************** END ACTA ***********************
     **/
    //=========================  CONVOCADO ==========================
    ConvocadoDAOImpl convocadoDAOImpl = new ConvocadoDAOImpl();

    @WebMethod(operationName = "buscaConvocadoId")
    public Convocado buscaConvocadoId(@WebParam(name = "id") int id) {
        return convocadoDAOImpl.getConvocado(id);
    }

    @WebMethod(operationName = "buscaConvocado")
    public Convocado buscaConvocado(@WebParam(name = "convocatoria") Convocatoria convocatoria, @WebParam(name = "pessoa") Pessoa pessoa) {
        return convocadoDAOImpl.getConvocadoConvocatoria(convocatoria, pessoa);
    }

    @WebMethod(operationName = "listaConvocados")
    public List<Convocado> listaConvocados(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "convocatoria") Convocatoria convocatoria) {
        return convocadoDAOImpl.listaConvocados(entidade, convocatoria);
    }

    @WebMethod(operationName = "persistir_convocado")
    public void persistir_convocado(@WebParam(name = "convocado") Convocado convocado) {
        convocadoDAOImpl.persistir_convocado(convocado);
    }

    @WebMethod(operationName = "remover_convocado")
    public void remover_convocado(@WebParam(name = "convocado") Convocado convocado) {
        convocadoDAOImpl.remover_convocado(convocado);
    }

    /*
     ************************** END CONVOCADO ***********************
     **/
}
