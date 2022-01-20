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
import mz.co.centralserver.daoimpl.controleacesso.BrowserDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.FormularioDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.FormulariosUsuarioDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.LogDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.ModuloAcessoDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.ModuloUsuarioDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.ModulosUsuarioDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.NivelAcessoDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.SistemaDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.TipoUsuarioDAOImpl;
import mz.co.centralserver.daoimpl.controleacesso.UsuarioDAOImpl;
import mz.co.centralserver.model.controleacesso.Browser;
import mz.co.centralserver.model.controleacesso.Formulario;
import mz.co.centralserver.model.controleacesso.FormulariosUsuario;
import mz.co.centralserver.model.controleacesso.Log;
import mz.co.centralserver.model.controleacesso.ModuloAcesso;
import mz.co.centralserver.model.controleacesso.ModuloUsuario;
import mz.co.centralserver.model.controleacesso.ModulosUsuario;
import mz.co.centralserver.model.controleacesso.NivelAcesso;
import mz.co.centralserver.model.controleacesso.Sistema;
import mz.co.centralserver.model.controleacesso.TipoUsuario;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "ControleAcessoWSrv")
public class ControleAcessoWSrv {

    /*================= USUARIO ======================*/
    UsuarioDAOImpl ipml = new UsuarioDAOImpl();

    @WebMethod(operationName = "autenticar")
    public Usuario autenticar(@WebParam(name = "usuario") String usuario, @WebParam(name = "senha") String senha) {
        return ipml.autenticar(usuario, senha);
    }

    @WebMethod(operationName = "buscar_usuario")
    public Usuario buscar_usuario(@WebParam(name = "usuario") String usuario) {
        return ipml.getUsuario(usuario);
    }

    @WebMethod(operationName = "buscar_usuario_id")
    public Usuario buscar_usuario_id(@WebParam(name = "id") int id) {
        return ipml.getUsuario(id);
    }

    @WebMethod(operationName = "listaUsuarios")
    public List<Usuario> listaUsuarios() {
        return ipml.listaDosUsuarios();
    }

    @WebMethod(operationName = "listaDosUsuariosLimit")
    public List<Usuario> listaDosUsuariosLimit(@WebParam(name = "limite") int limite) {
        return ipml.listaDosUsuariosLimit(limite);
    }

    @WebMethod(operationName = "listaDosUsuariosEntidade")
    public List<Usuario> listaDosUsuariosEntidade(@WebParam(name = "entidade") Entidade entidade) {
        return ipml.listaDosUsuariosEntidade(entidade);
    }

    @WebMethod(operationName = "listaDosUsuariosEntidadeLimit")
    public List<Usuario> listaDosUsuariosEntidadeLimit(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return ipml.listaDosUsuariosEntidadeLimit(entidade, limite);
    }

    @WebMethod(operationName = "alterarEstado")
    public void alterarEstado(@WebParam(name = "id") int id, @WebParam(name = "estado") String estado) {
        ipml.alterar_estado(id, estado);
    }

    @WebMethod(operationName = "persistir_usuario")
    public void persistir_usuario(@WebParam(name = "usuario") Usuario usuario) {
        ipml.persistir_usuario(usuario);
    }

    /**
     * ******************* END USUARIO ******************
     */
    /*===================== NIVEL ACESSO ===================*/
    NivelAcessoDAOImpl nivelAcessoDAOImpl = new NivelAcessoDAOImpl();

    @WebMethod(operationName = "buscaNivelAcessoId")
    public NivelAcesso buscaNivelAcessoId(@WebParam(name = "id") int id) {
        return nivelAcessoDAOImpl.getNivelAcesso(id);
    }

    @WebMethod(operationName = "buscaNivelAcessoDescricao")
    public NivelAcesso buscaNivelAcessoDescricao(@WebParam(name = "descricao") String descricao) {
        return nivelAcessoDAOImpl.getNivelAcesso(descricao);
    }

    @WebMethod(operationName = "listaNiveisAcesso")
    public List<NivelAcesso> listaNiveisAcesso() {
        return nivelAcessoDAOImpl.listaNivelAcessos();
    }

    @WebMethod(operationName = "persistir_nivelAcesso")
    public void persistir_nivelAcesso(@WebParam(name = "nivelAcesso") NivelAcesso nivelAcesso) {
        nivelAcessoDAOImpl.persistir_nivelAcesso(nivelAcesso);
    }

    /**
     * ******************* END NIVEL ACESSO ******************
     */
    /*===================== TIPO USUARIO ===================*/
    TipoUsuarioDAOImpl tipoUsuarioDAOImpl = new TipoUsuarioDAOImpl();

    @WebMethod(operationName = "buscaTipoUsuarioId")
    public TipoUsuario buscaTipoUsuarioId(@WebParam(name = "id") int id) {
        return tipoUsuarioDAOImpl.getTipoUsuario(id);
    }

    @WebMethod(operationName = "buscaTipoUsuarioDescricao")
    public TipoUsuario buscaTipoUsuarioDescricao(@WebParam(name = "descricao") String descricao) {
        return tipoUsuarioDAOImpl.getTipoUsuario(descricao);
    }

    @WebMethod(operationName = "listaTiposUsuario")
    public List<TipoUsuario> listaTiposUsuario() {
        return tipoUsuarioDAOImpl.listaTipoUsuarios();
    }

    @WebMethod(operationName = "persistir_TipoUsuario")
    public void persistir_TipoUsuario(@WebParam(name = "TipoUsuario") TipoUsuario TipoUsuario) {
        tipoUsuarioDAOImpl.persistir_tipoUsuario(TipoUsuario);
    }

    /**
     * ******************* END TIPO USUARIO ******************
     */
    /*=====================  LOG ===================*/
    LogDAOImpl logDAOImpl = new LogDAOImpl();

    @WebMethod(operationName = "listaLogsData")
    public List<Log> listaLogsData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return logDAOImpl.listaLogs(entidade, data);
    }

    @WebMethod(operationName = "listaLogsSistema")
    public List<Log> listaLogsSistema(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return logDAOImpl.listaLogsSistema(entidade, id);
    }

    @WebMethod(operationName = "listaLogsDataUsuario")
    public List<Log> listaLogsDataUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data, @WebParam(name = "id") int id) {
        return logDAOImpl.listaLogs(entidade, data, id);
    }

    @WebMethod(operationName = "listaLogsDataUsuarioLimite")
    public List<Log> listaLogsDataUsuarioLimite(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data, @WebParam(name = "id") int id, @WebParam(name = "limite") int limite) {
        return logDAOImpl.listaLogs(entidade, data, id, limite);
    }

    @WebMethod(operationName = "listaLogsPeriodo")
    public List<Log> listaLogsPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data1") String data1, @WebParam(name = "data2") String data2) {
        return logDAOImpl.listaLogs(entidade, data1, data2);
    }

    @WebMethod(operationName = "persistir_log")
    public void persistir_log(@WebParam(name = "log") Log log) {
        logDAOImpl.persistir_log(log);
    }
    /**
     * ******************* END LOG ******************
     */

    /*=====================  BROWSER ===================*/
    BrowserDAOImpl browserDAOImpl = new BrowserDAOImpl();

    @WebMethod(operationName = "listaBrowsers")
    public List<Browser> listaBrowsers(@WebParam(name = "descricao") String descricao) {
        return browserDAOImpl.listaBrowsers(descricao);
    }

    @WebMethod(operationName = "listaBrowsersUsuario")
    public List<Browser> listaBrowsersUsuario(@WebParam(name = "descricao") String descricao, @WebParam(name = "idUsuario") int idUsuario) {
        return browserDAOImpl.listaBrowsers(descricao, idUsuario);
    }

    @WebMethod(operationName = "listaTodosBrowsers")
    public List<Browser> listaTodosBrowsers() {
        return browserDAOImpl.listaBrowsers();
    }

    @WebMethod(operationName = "persistir_browser")
    public void persistir_browser(@WebParam(name = "browser") Browser browser) {
        browserDAOImpl.persistir_browser(browser);
    }
    /**
     * ******************* END BROWSER ******************
     */

    /*===================== SISTEMA ===================*/
    SistemaDAOImpl sistemaDAOImpl = new SistemaDAOImpl();

    @WebMethod(operationName = "buscaSistemaId")
    public Sistema buscaSistemaId(@WebParam(name = "id") int id) {
        return sistemaDAOImpl.getSistema(id);
    }

    @WebMethod(operationName = "buscaSistemaDescricao")
    public Sistema buscaSistemaDescricao(@WebParam(name = "descricao") String descricao) {
        return sistemaDAOImpl.getSistema(descricao);
    }

    @WebMethod(operationName = "listaSistemas")
    public List<Sistema> listaSistemas() {
        return sistemaDAOImpl.listaSistemas();
    }

    @WebMethod(operationName = "persistir_sistema")
    public void persistir_sistema(@WebParam(name = "sistema") Sistema sistema) {
        sistemaDAOImpl.persistir_sistema(sistema);
    }

    /**
     * ******************* END SISTEMA ******************
     */
    /*===================== FORMULARIO ===================*/
    FormularioDAOImpl formularioDAOImpl = new FormularioDAOImpl();

    @WebMethod(operationName = "buscaFormularioId")
    public Formulario buscaFormularioId(@WebParam(name = "id") int id) {
        return formularioDAOImpl.getFormulario(id);
    }

    @WebMethod(operationName = "buscaFormularioDescricao")
    public Formulario buscaFormularioDescricao(@WebParam(name = "descricao") String descricao) {
        return formularioDAOImpl.getFormulario(descricao);
    }

    @WebMethod(operationName = "listaFormularios")
    public List<Formulario> listaFormularios() {
        return formularioDAOImpl.listaFormularios();
    }

    @WebMethod(operationName = "listaFormulariosSistema")
    public List<Formulario> listaFormulariosSistema(@WebParam(name = "id") int id) {
        return formularioDAOImpl.listaFormulariosSistema(id);
    }

    @WebMethod(operationName = "persistir_formulario")
    public void persistir_formulario(@WebParam(name = "formulario") Formulario formulario) {
        formularioDAOImpl.persistir_formulario(formulario);
    }
    /**
     * ******************* END FORMULARIO ******************
     */

    /*===================== MODULO ACESSO ===================*/
    ModuloAcessoDAOImpl moduloAcessoDAOImpl = new ModuloAcessoDAOImpl();

    @WebMethod(operationName = "buscaModuloAcessoId")
    public ModuloAcesso buscaModuloAcessoId(@WebParam(name = "id") int id) {
        return moduloAcessoDAOImpl.getModuloAcesso(id);
    }

    @WebMethod(operationName = "listaModuloAcessos")
    public List<ModuloAcesso> listaModuloAcessos() {
        return moduloAcessoDAOImpl.listaModuloAcessos();
    }

    @WebMethod(operationName = "listaModuloAcessosSistema")
    public List<ModuloAcesso> listaModuloAcessosSistema(@WebParam(name = "id") int id) {
        return moduloAcessoDAOImpl.listaModuloAcessosSistema(id);
    }

    @WebMethod(operationName = "listaModuloAcessosEntidade")
    public List<ModuloAcesso> listaModuloAcessosEntidade(@WebParam(name = "id") int id) {
        return moduloAcessoDAOImpl.listaModuloAcessosEntidade(id);
    }

    @WebMethod(operationName = "listaModuloAcessosSistemaEntidade")
    public List<ModuloAcesso> listaModuloAcessosSistemaEntidade(@WebParam(name = "idSistema") int idSistema, @WebParam(name = "idEntidade") int idEntidade) {
        return moduloAcessoDAOImpl.listaModuloAcessosSistemaEntidade(idSistema, idEntidade);
    }

    @WebMethod(operationName = "persistir_moduloAcesso")
    public void persistir_moduloAcesso(@WebParam(name = "moduloAcesso") ModuloAcesso moduloAcesso) {
        moduloAcessoDAOImpl.persistir_moduloAcesso(moduloAcesso);
    }

    /**
     * ******************* END MODULO ACESSO ******************
     */
    /*===================== FORMULARIOS USUARIO ===================*/
    FormulariosUsuarioDAOImpl formulariosUsuarioDAOImpl = new FormulariosUsuarioDAOImpl();

    @WebMethod(operationName = "buscaFormulariosUsuarioId")
    public FormulariosUsuario buscaFormulariosUsuarioId(@WebParam(name = "id") int id) {
        return formulariosUsuarioDAOImpl.getFormulariosUsuario(id);
    }

    @WebMethod(operationName = "buscaFormulariosUsuarioModuloUsuario")
    public FormulariosUsuario buscaFormulariosUsuarioModuloUsuario(@WebParam(name = "idFormulario") int idFormulario, @WebParam(name = "idModuloUsuario") int idModuloUsuario) {
        return formulariosUsuarioDAOImpl.getFormulariosUsuarioModuloUsuario(idFormulario, idModuloUsuario);
    }

    @WebMethod(operationName = "listaFormulariosUsuarios")
    public List<FormulariosUsuario> listaFormulariosUsuarios() {
        return formulariosUsuarioDAOImpl.listaFormulariosUsuarios();
    }

    @WebMethod(operationName = "listaFormulariosUsuarios_Usuario")
    public List<FormulariosUsuario> listaFormulariosUsuarios_Usuario(@WebParam(name = "id") int id) {
        return formulariosUsuarioDAOImpl.listaFormulariosUsuarios_Usuario(id);
    }

    @WebMethod(operationName = "persistir_formulariosUsuario")
    public void persistir_formulariosUsuario(@WebParam(name = "formulariosUsuario") FormulariosUsuario formulariosUsuario) {
        formulariosUsuarioDAOImpl.persistir_formulariosUsuario(formulariosUsuario);
    }

    /**
     * ******************* END FORMULARIOS USUARIO ******************
     */
    //======================= MODULO USUARIO ===========================
    ModuloUsuarioDAOImpl moduloUsuarioDAOImpl = new ModuloUsuarioDAOImpl();

    @WebMethod(operationName = "buscaModuloUsuarioId")
    public ModuloUsuario buscaModuloUsuarioId(@WebParam(name = "id") int id) {
        return moduloUsuarioDAOImpl.getModuloUsuario(id);
    }

    @WebMethod(operationName = "buscaModuloUsuarioReferencia")
    public ModuloUsuario buscaModuloUsuarioReferencia(@WebParam(name = "referencia") String referencia) {
        return moduloUsuarioDAOImpl.getModuloUsuario(referencia);
    }

    @WebMethod(operationName = "listaModuloUsuarios")
    public List<ModuloUsuario> listaModuloUsuarios() {
        return moduloUsuarioDAOImpl.listaModuloUsuarios();
    }

    @WebMethod(operationName = "listaModuloUsuariosUsuarioVisitas")
    public List<ModuloUsuario> listaModuloUsuariosUsuarioVisitas(@WebParam(name = "idUsuario") int idUsuario) {
        return moduloUsuarioDAOImpl.listaModuloUsuariosUsuarioVisitas(idUsuario);
    }

    @WebMethod(operationName = "listaModuloUsuariosUsuario")
    public List<ModuloUsuario> listaModuloUsuariosUsuario(@WebParam(name = "idUsuario") int idUsuario) {
        return moduloUsuarioDAOImpl.listaModuloUsuariosUsuario(idUsuario);
    }

    @WebMethod(operationName = "persistir_moduloUsuario")
    public void persistir_moduloUsuario(@WebParam(name = "moduloUsuario") ModuloUsuario moduloUsuario) {
        moduloUsuarioDAOImpl.persistir_moduloUsuario(moduloUsuario);
    }

    @WebMethod(operationName = "remover_moduloUsuario")
    public void remover_moduloUsuario(@WebParam(name = "moduloUsuario") ModuloUsuario moduloUsuario) {
        moduloUsuarioDAOImpl.remover_moduloUsuario(moduloUsuario);
    }
    /**
     * ******************** END MODULO USUARIO *************************
     */
    
        //******************* MODULO USUARIO  ********************
    ModulosUsuarioDAOImpl modulosUsuarioDAOImpl = new ModulosUsuarioDAOImpl();

    @WebMethod(operationName = "buscaModulosUsuarioId")
    public ModulosUsuario buscaModulosUsuarioId(@WebParam(name = "id") int id) {
        return modulosUsuarioDAOImpl.getModulosUsuario(id);
    }

    @WebMethod(operationName = "buscaModulosUsuario")
    public ModulosUsuario buscaModulosUsuario(@WebParam(name = "usuario") Usuario usuario) {
        return modulosUsuarioDAOImpl.getModulosUsuario(usuario);
    }

    @WebMethod(operationName = "listaModulosUsuarios")
    public List<ModulosUsuario> listaModulosUsuarios(@WebParam(name = "entidade") Entidade entidade) {
        return modulosUsuarioDAOImpl.listaModulos(entidade);
    }

    @WebMethod(operationName = "persitir_modulosUsuario")
    public void persitir_modulosUsuario(@WebParam(name = "modulosUsuario") ModulosUsuario modulosUsuario) {
        modulosUsuarioDAOImpl.persitir_modulosUsuario(modulosUsuario);
    }

    @WebMethod(operationName = "remover_modulosUsuario")
    public void remover_modulosUsuario(@WebParam(name = "modulosUsuario") ModulosUsuario modulosUsuario) {
        modulosUsuarioDAOImpl.remover_modulosUsuario(modulosUsuario);
    }
    //================== END MODULO USUARIO  =====================================


}
