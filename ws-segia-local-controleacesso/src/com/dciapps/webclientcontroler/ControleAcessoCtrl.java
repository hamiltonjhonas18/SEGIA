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

import com.dciapps.webclient.Formulario;
import com.dciapps.webclient.FormulariosUsuario;
import com.dciapps.webclient.ModuloAcesso;
import com.dciapps.webclient.ModuloUsuario;
import com.dciapps.webclient.ModulosUsuario;
import com.dciapps.webclient.NivelAcesso;
import com.dciapps.webclient.Sistema;
import com.dciapps.webclient.TipoUsuario;
import com.dciapps.webclient.Usuario;

/**
 *
 * @author HJC2K8
 */
public class ControleAcessoCtrl {

    public void alterarEstado(int id, java.lang.String estado) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.alterarEstado(id, estado);
    }

    public Usuario autenticar(java.lang.String usuario, java.lang.String senha) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.autenticar(usuario, senha);
    }

    public Formulario buscaFormularioDescricao(java.lang.String descricao) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaFormularioDescricao(descricao);
    }

    public Formulario buscaFormularioId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaFormularioId(id);
    }

    public FormulariosUsuario buscaFormulariosUsuarioId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaFormulariosUsuarioId(id);
    }

    public FormulariosUsuario buscaFormulariosUsuarioModuloUsuario(int idFormulario, int idModuloUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaFormulariosUsuarioModuloUsuario(idFormulario, idModuloUsuario);
    }

    public ModuloAcesso buscaModuloAcessoId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaModuloAcessoId(id);
    }

    public ModuloUsuario buscaModuloUsuarioId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaModuloUsuarioId(id);
    }

    public ModuloUsuario buscaModuloUsuarioReferencia(java.lang.String referencia) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaModuloUsuarioReferencia(referencia);
    }

    public ModulosUsuario buscaModulosUsuario(com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaModulosUsuario(usuario);
    }

    public ModulosUsuario buscaModulosUsuarioId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaModulosUsuarioId(id);
    }

    public NivelAcesso buscaNivelAcessoDescricao(java.lang.String descricao) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaNivelAcessoDescricao(descricao);
    }

    public NivelAcesso buscaNivelAcessoId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaNivelAcessoId(id);
    }

    public Sistema buscaSistemaDescricao(java.lang.String descricao) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaSistemaDescricao(descricao);
    }

    public Sistema buscaSistemaId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaSistemaId(id);
    }

    public TipoUsuario buscaTipoUsuarioDescricao(java.lang.String descricao) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaTipoUsuarioDescricao(descricao);
    }

    public TipoUsuario buscaTipoUsuarioId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscaTipoUsuarioId(id);
    }

    public Usuario buscarUsuario(java.lang.String usuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscarUsuario(usuario);
    }

    public Usuario buscarUsuarioId(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.buscarUsuarioId(id);
    }

    public java.util.List<com.dciapps.webclient.Browser> listaBrowsers(java.lang.String descricao) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaBrowsers(descricao);
    }

    public java.util.List<com.dciapps.webclient.Browser> listaBrowsersUsuario(java.lang.String descricao, int idUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaBrowsersUsuario(descricao, idUsuario);
    }

    public java.util.List<com.dciapps.webclient.Usuario> listaDosUsuariosEntidade(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaDosUsuariosEntidade(entidade);
    }

    public java.util.List<com.dciapps.webclient.Usuario> listaDosUsuariosEntidadeLimit(com.dciapps.webclient.Entidade entidade, int limite) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaDosUsuariosEntidadeLimit(entidade, limite);
    }

    public java.util.List<com.dciapps.webclient.Usuario> listaDosUsuariosLimit(int limite) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaDosUsuariosLimit(limite);
    }

    public java.util.List<com.dciapps.webclient.Formulario> listaFormularios() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaFormularios();
    }

    public java.util.List<com.dciapps.webclient.Formulario> listaFormulariosSistema(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaFormulariosSistema(id);
    }

    public java.util.List<com.dciapps.webclient.FormulariosUsuario> listaFormulariosUsuarios() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaFormulariosUsuarios();
    }

    public java.util.List<com.dciapps.webclient.FormulariosUsuario> listaFormulariosUsuariosUsuario(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaFormulariosUsuariosUsuario(id);
    }

    public java.util.List<com.dciapps.webclient.Log> listaLogsData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaLogsData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Log> listaLogsDataUsuario(com.dciapps.webclient.Entidade entidade, java.lang.String data, int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaLogsDataUsuario(entidade, data, id);
    }

    public java.util.List<com.dciapps.webclient.Log> listaLogsDataUsuarioLimite(com.dciapps.webclient.Entidade entidade, java.lang.String data, int id, int limite) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaLogsDataUsuarioLimite(entidade, data, id, limite);
    }

    public java.util.List<com.dciapps.webclient.Log> listaLogsPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String data1, java.lang.String data2) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaLogsPeriodo(entidade, data1, data2);
    }

    public java.util.List<com.dciapps.webclient.Log> listaLogsSistema(com.dciapps.webclient.Entidade entidade, int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaLogsSistema(entidade, id);
    }

    public java.util.List<com.dciapps.webclient.ModuloAcesso> listaModuloAcessos() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModuloAcessos();
    }

    public java.util.List<com.dciapps.webclient.ModuloAcesso> listaModuloAcessosEntidade(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModuloAcessosEntidade(id);
    }

    public java.util.List<com.dciapps.webclient.ModuloAcesso> listaModuloAcessosSistema(int id) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModuloAcessosSistema(id);
    }

    public java.util.List<com.dciapps.webclient.ModuloAcesso> listaModuloAcessosSistemaEntidade(int idSistema, int idEntidade) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModuloAcessosSistemaEntidade(idSistema, idEntidade);
    }

    public java.util.List<com.dciapps.webclient.ModuloUsuario> listaModuloUsuarios() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModuloUsuarios();
    }

    public java.util.List<com.dciapps.webclient.ModuloUsuario> listaModuloUsuariosUsuario(int idUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModuloUsuariosUsuario(idUsuario);
    }

    public java.util.List<com.dciapps.webclient.ModuloUsuario> listaModuloUsuariosUsuarioVisitas(int idUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModuloUsuariosUsuarioVisitas(idUsuario);
    }

    public java.util.List<com.dciapps.webclient.ModulosUsuario> listaModulosUsuarios(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaModulosUsuarios(entidade);
    }

    public java.util.List<com.dciapps.webclient.NivelAcesso> listaNiveisAcesso() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaNiveisAcesso();
    }

    public java.util.List<com.dciapps.webclient.Sistema> listaSistemas() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaSistemas();
    }

    public java.util.List<com.dciapps.webclient.TipoUsuario> listaTiposUsuario() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaTiposUsuario();
    }

    public java.util.List<com.dciapps.webclient.Browser> listaTodosBrowsers() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaTodosBrowsers();
    }

    public java.util.List<com.dciapps.webclient.Usuario> listaUsuarios() {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        return port.listaUsuarios();
    }

    public void persistirTipoUsuario(com.dciapps.webclient.TipoUsuario tipoUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirTipoUsuario(tipoUsuario);
    }

    public void persistirBrowser(com.dciapps.webclient.Browser browser) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirBrowser(browser);
    }

    public void persistirFormulario(com.dciapps.webclient.Formulario formulario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirFormulario(formulario);
    }

    public void persistirFormulariosUsuario(com.dciapps.webclient.FormulariosUsuario formulariosUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirFormulariosUsuario(formulariosUsuario);
    }

    public void persistirLog(com.dciapps.webclient.Log log) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirLog(log);
    }

    public void persistirModuloAcesso(com.dciapps.webclient.ModuloAcesso moduloAcesso) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirModuloAcesso(moduloAcesso);
    }

    public void persistirModuloUsuario(com.dciapps.webclient.ModuloUsuario moduloUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirModuloUsuario(moduloUsuario);
    }

    public void persistirNivelAcesso(com.dciapps.webclient.NivelAcesso nivelAcesso) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirNivelAcesso(nivelAcesso);
    }

    public void persistirSistema(com.dciapps.webclient.Sistema sistema) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirSistema(sistema);
    }

    public void persistirUsuario(com.dciapps.webclient.Usuario usuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persistirUsuario(usuario);
    }

    public void persitirModulosUsuario(com.dciapps.webclient.ModulosUsuario modulosUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.persitirModulosUsuario(modulosUsuario);
    }

    public void removerModuloUsuario(com.dciapps.webclient.ModuloUsuario moduloUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.removerModuloUsuario(moduloUsuario);
    }

    public void removerModulosUsuario(com.dciapps.webclient.ModulosUsuario modulosUsuario) {
        com.dciapps.webclient.ControleAcessoWSrv_Service service = new com.dciapps.webclient.ControleAcessoWSrv_Service();
        com.dciapps.webclient.ControleAcessoWSrv port = service.getControleAcessoWSrvPort();
        port.removerModulosUsuario(modulosUsuario);
    }

    
}
