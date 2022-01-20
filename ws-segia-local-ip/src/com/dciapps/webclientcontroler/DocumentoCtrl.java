/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.webclientcontroler;

import com.dciapps.webclient.Acta;
import com.dciapps.webclient.Codigo;
import com.dciapps.webclient.Convocado;
import com.dciapps.webclient.Convocatoria;
import com.dciapps.webclient.Doc;

/**
 *
 * @author HJC2K8
 */
public class DocumentoCtrl {

    public Acta buscaActaConvocatoria(com.dciapps.webclient.Convocatoria convocatoria) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaActaConvocatoria(convocatoria);
    }

    public Acta buscaActaId(int id) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaActaId(id);
    }

    public Codigo buscaCodigoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaCodigoDescricao(entidade, descricao);
    }

    public Codigo buscaCodigoDescricaoReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaCodigoDescricaoReferencia(entidade, descricao);
    }

    public Codigo buscaCodigoId(int id) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaCodigoId(id);
    }

    public Convocado buscaConvocado(com.dciapps.webclient.Convocatoria convocatoria, com.dciapps.webclient.Pessoa pessoa) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaConvocado(convocatoria, pessoa);
    }

    public Convocado buscaConvocadoId(int id) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaConvocadoId(id);
    }

    public Convocatoria buscaConvocatoriaId(int id) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaConvocatoriaId(id);
    }

    public Doc buscaDocId(int id) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaDocId(id);
    }

    public Doc buscaDocReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.buscaDocReferencia(entidade, descricao);
    }

    public java.util.List<com.dciapps.webclient.Acta> listaActas(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaActas(entidade, escola);
    }

    public java.util.List<com.dciapps.webclient.Acta> listaActasData(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, java.lang.String data) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaActasData(entidade, escola, data);
    }

    public java.util.List<com.dciapps.webclient.Acta> listaActasPeriodo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaActasPeriodo(entidade, escola, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Codigo> listaCodigos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaCodigos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Convocado> listaConvocados(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Convocatoria convocatoria) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaConvocados(entidade, convocatoria);
    }

    public java.util.List<com.dciapps.webclient.Convocatoria> listaConvocatorias(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaConvocatorias(entidade, escola);
    }

    public java.util.List<com.dciapps.webclient.Convocatoria> listaConvocatoriasData(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, java.lang.String data) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaConvocatoriasData(entidade, escola, data);
    }

    public java.util.List<com.dciapps.webclient.Convocatoria> listaConvocatoriasLimite(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, int limite) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaConvocatoriasLimite(entidade, escola, limite);
    }

    public java.util.List<com.dciapps.webclient.Convocatoria> listaConvocatoriasPeriodo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaConvocatoriasPeriodo(entidade, escola, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Convocatoria> listaConvocatoriasStatus(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, boolean status) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaConvocatoriasStatus(entidade, escola, status);
    }

    public java.util.List<com.dciapps.webclient.Convocatoria> listaConvocatoriasStatusLimite(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, boolean status, int limite) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaConvocatoriasStatusLimite(entidade, escola, status, limite);
    }

    public java.util.List<com.dciapps.webclient.Doc> listaDocs(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaDocs(entidade);
    }

    public java.util.List<com.dciapps.webclient.Doc> listaDocsData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaDocsData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Doc> listaDocsLimite(com.dciapps.webclient.Entidade entidade, int limite) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaDocsLimite(entidade, limite);
    }

    public java.util.List<com.dciapps.webclient.Doc> listaDocsPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaDocsPeriodo(entidade, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Doc> listaDocsStatus(com.dciapps.webclient.Entidade entidade, java.lang.String status) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaDocsStatus(entidade, status);
    }

    public java.util.List<com.dciapps.webclient.Doc> listaDocsStatusLimite(com.dciapps.webclient.Entidade entidade, java.lang.String status, int limite) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        return port.listaDocsStatusLimite(entidade, status, limite);
    }

    public void persistirActa(com.dciapps.webclient.Acta acta) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.persistirActa(acta);
    }

    public void persistirCodigo(com.dciapps.webclient.Codigo codigo) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.persistirCodigo(codigo);
    }

    public void persistirConvocado(com.dciapps.webclient.Convocado convocado) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.persistirConvocado(convocado);
    }

    public void persistirConvocatoria(com.dciapps.webclient.Convocatoria convocatoria) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.persistirConvocatoria(convocatoria);
    }

    public void persistirDoc(com.dciapps.webclient.Doc doc) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.persistirDoc(doc);
    }

    public void removerActa(com.dciapps.webclient.Acta acta) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.removerActa(acta);
    }

    public void removerCodigo(com.dciapps.webclient.Codigo codigo) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.removerCodigo(codigo);
    }

    public void removerConvocado(com.dciapps.webclient.Convocado convocado) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.removerConvocado(convocado);
    }

    public void removerConvocatoria(com.dciapps.webclient.Convocatoria convocatoria) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.removerConvocatoria(convocatoria);
    }

    public void removerDoc(com.dciapps.webclient.Doc doc) {
        com.dciapps.webclient.DocumentoWSrv_Service service = new com.dciapps.webclient.DocumentoWSrv_Service();
        com.dciapps.webclient.DocumentoWSrv port = service.getDocumentoWSrvPort();
        port.removerDoc(doc);
    }


}
