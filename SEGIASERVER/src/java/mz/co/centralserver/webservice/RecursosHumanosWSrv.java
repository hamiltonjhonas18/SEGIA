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
import mz.co.centralserver.daoimpl.recursoshumanos.AdministracaoDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.AssiduidadeDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.CargoDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.DepartamentoDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.DependenteDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.FaltasDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.FeriasDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.FirmaDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.FormacaoDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.FuncionarioDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.HabilitacaoDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.HorasDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.PlanoSaudeDAOImpl;
import mz.co.centralserver.daoimpl.recursoshumanos.SectorDAOImpl;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Administracao;
import mz.co.centralserver.model.recursoshumanos.Assiduidade;
import mz.co.centralserver.model.recursoshumanos.Cargo;
import mz.co.centralserver.model.recursoshumanos.Departamento;
import mz.co.centralserver.model.recursoshumanos.Dependente;
import mz.co.centralserver.model.recursoshumanos.Faltas;
import mz.co.centralserver.model.recursoshumanos.Ferias;
import mz.co.centralserver.model.recursoshumanos.Firma;
import mz.co.centralserver.model.recursoshumanos.Formacao;
import mz.co.centralserver.model.recursoshumanos.Funcionario;
import mz.co.centralserver.model.recursoshumanos.Habilitacao;
import mz.co.centralserver.model.recursoshumanos.Horas;
import mz.co.centralserver.model.recursoshumanos.PlanoSaude;
import mz.co.centralserver.model.recursoshumanos.Sector;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "RecursosHumanosWSrv")
public class RecursosHumanosWSrv {

    //=========================  ADMINISTRACAO ==========================
    AdministracaoDAOImpl administracaoDAOImpl = new AdministracaoDAOImpl();

    @WebMethod(operationName = "buscaAdministracaoId")
    public Administracao buscaAdministracaoId(@WebParam(name = "id") int id) {
        return administracaoDAOImpl.getAdministracao(id);
    }

    @WebMethod(operationName = "buscaAdministracaoDescricao")
    public Administracao buscaAdministracaoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return administracaoDAOImpl.getAdministracao(entidade, descricao);
    }

    @WebMethod(operationName = "listaAdministracoes")
    public List<Administracao> listaAdministracoes(@WebParam(name = "entidade") Entidade entidade) {
        return administracaoDAOImpl.listaAdministracoes(entidade);
    }

    @WebMethod(operationName = "listaAdministracoesEntidade")
    public List<Administracao> listaAdministracoesEntidade(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return administracaoDAOImpl.listaAdministracoesEntidade(entidade);
    }

    @WebMethod(operationName = "persistir_administracao")
    public void persistir_administracao(@WebParam(name = "administracao") Administracao administracao) {
        administracaoDAOImpl.persistir_administracao(administracao);
    }

    /*
     ************************** END ADMINISTRACAO ***********************
     **/
    //=========================   ASSIDUIDADE ==========================
    AssiduidadeDAOImpl assiduidadeDAOImpl = new AssiduidadeDAOImpl();

    @WebMethod(operationName = "buscaAssiduidadeId")
    public Assiduidade buscaAssiduidadeId(@WebParam(name = "id") int id) {
        return assiduidadeDAOImpl.getAssiduidade(id);
    }

    @WebMethod(operationName = "buscaAssiduidadeData")
    public Assiduidade buscaAssiduidadeData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id, @WebParam(name = "data") String data) {
        return assiduidadeDAOImpl.getAssiduidadeData(entidade, id, data);
    }

    @WebMethod(operationName = "listaAssiduidades")
    public List<Assiduidade> listaAssiduidades(@WebParam(name = "entidade") Entidade entidade) {
        return assiduidadeDAOImpl.listaAssiduidades(entidade);
    }

    @WebMethod(operationName = "listaAssiduidadesLimit")
    public List<Assiduidade> listaAssiduidadesLimit(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "limite") int limite) {
        return assiduidadeDAOImpl.listaAssiduidadesLimit(entidade, limite);
    }

    @WebMethod(operationName = "listaAssiduidadesPeriodo")
    public List<Assiduidade> listaAssiduidadesPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return assiduidadeDAOImpl.listaAssiduidadesPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaAssiduidadesUsuario")
    public List<Assiduidade> listaAssiduidadesUsuario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return assiduidadeDAOImpl.listaAssiduidadesUsuario(entidade, id);
    }

    @WebMethod(operationName = "listaAssiduidadesUsuarioPeriodo")
    public List<Assiduidade> listaAssiduidadesUsuarioPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id, @WebParam(name = "periodo") String periodo) {
        return assiduidadeDAOImpl.listaAssiduidadesUsuarioPeriodo(entidade, id, periodo);
    }

    @WebMethod(operationName = "listaAssiduidadesData")
    public List<Assiduidade> listaAssiduidadesData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return assiduidadeDAOImpl.listaAssiduidadesData(entidade, data);
    }

    @WebMethod(operationName = "persistir_assiduidade")
    public void persistir_assiduidade(@WebParam(name = "assiduidade") Assiduidade assiduidade) {
        assiduidadeDAOImpl.persistir_assiduidade(assiduidade);
    }

    @WebMethod(operationName = "remover_assiduidade")
    public void remover_assiduidade(@WebParam(name = "assiduidade") Assiduidade assiduidade) {
        assiduidadeDAOImpl.remover_assiduidade(assiduidade);
    }

    /*
     ************************** END  ASSIDUIDADE ***********************
     **/
    //=========================  CARGO ==========================
    CargoDAOImpl cargoDAOImpl = new CargoDAOImpl();

    @WebMethod(operationName = "buscaCargoId")
    public Cargo buscaCargoId(@WebParam(name = "id") int id) {
        return cargoDAOImpl.getCargo(id);
    }

    @WebMethod(operationName = "buscaCargoDescricao")
    public Cargo buscaCargoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return cargoDAOImpl.getCargo(entidade, descricao);
    }

    @WebMethod(operationName = "listaCargos")
    public List<Cargo> listaCargos(@WebParam(name = "entidade") Entidade entidade) {
        return cargoDAOImpl.listaCargos(entidade);
    }

    @WebMethod(operationName = "persistir_cargo")
    public void persistir_cargo(@WebParam(name = "cargo") Cargo cargo) {
        cargoDAOImpl.persistir_cargo(cargo);
    }

    @WebMethod(operationName = "remover_cargo")
    public void remover_cargo(@WebParam(name = "cargo") Cargo cargo) {
        cargoDAOImpl.remover_cargo(cargo);
    }

    /*
     ************************** END CARGO ***********************
     **/
    //=========================  DEPARTAMENTO ==========================
    DepartamentoDAOImpl departamentoDAOImpl = new DepartamentoDAOImpl();

    @WebMethod(operationName = "buscaDepartamentoId")
    public Departamento buscaDepartamentoId(@WebParam(name = "id") int id) {
        return departamentoDAOImpl.getDepartamento(id);
    }

    @WebMethod(operationName = "buscaDepartamentoDescricao")
    public Departamento buscaDepartamentoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return departamentoDAOImpl.getDepartamento(entidade, descricao);
    }

    @WebMethod(operationName = "listaDepartamentos")
    public List<Departamento> listaDepartamentos(@WebParam(name = "entidade") Entidade entidade) {
        return departamentoDAOImpl.listaDepartamentos(entidade);
    }

    @WebMethod(operationName = "listaDepartamentosAdministracao")
    public List<Departamento> listaDepartamentosAdministracao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return departamentoDAOImpl.listaDepartamentosAdministracao(entidade, id);
    }

    @WebMethod(operationName = "listaDepartamentosNivelPrioridade")
    public List<Departamento> listaDepartamentosNivelPrioridade(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return departamentoDAOImpl.listaDepartamentosNivelPrioridade(entidade, id);
    }

    @WebMethod(operationName = "persistir_departamento")
    public void persistir_departamento(@WebParam(name = "departamento") Departamento departamento) {
        departamentoDAOImpl.persistir_departamento(departamento);
    }

    @WebMethod(operationName = "remover_departamento")
    public void remover_departamento(@WebParam(name = "departamento") Departamento departamento) {
        departamentoDAOImpl.remover_departamento(departamento);
    }

    /*
     ************************** END DEPARTAMENTO ***********************
     **/
    //=========================  DEPENDENTE ==========================
    DependenteDAOImpl dependenteDAOImpl = new DependenteDAOImpl();

    @WebMethod(operationName = "buscaDependenteId")
    public Dependente buscaDependenteId(@WebParam(name = "id") int id) {
        return dependenteDAOImpl.getDependente(id);
    }

    @WebMethod(operationName = "buscaDependenteDescricao")
    public Dependente buscaDependenteDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "descricao") String descricao) {
        return dependenteDAOImpl.getDependente(entidade, funcionario, descricao);
    }

    @WebMethod(operationName = "listaDependentes")
    public List<Dependente> listaDependentes(@WebParam(name = "entidade") Entidade entidade) {
        return dependenteDAOImpl.listaDependentes(entidade);
    }

    @WebMethod(operationName = "listaDependentesFuncionario")
    public List<Dependente> listaDependentesFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return dependenteDAOImpl.listaDependentesFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "persistir_dependente")
    public void persistir_dependente(@WebParam(name = "dependente") Dependente dependente) {
        dependenteDAOImpl.persistir_dependente(dependente);
    }

    @WebMethod(operationName = "remover_dependente")
    public void remover_dependente(@WebParam(name = "dependente") Dependente dependente) {
        dependenteDAOImpl.remover_dependente(dependente);
    }

    /*
     ************************** END DEPENDENTE ***********************
     **/
    //=========================  FALTAS ==========================
    FaltasDAOImpl faltasDAOImpl = new FaltasDAOImpl();

    @WebMethod(operationName = "buscaFaltasId")
    public Faltas buscaFaltasId(@WebParam(name = "id") int id) {
        return faltasDAOImpl.getFalta(id);
    }

    @WebMethod(operationName = "listaFaltasColaboradores")
    public List<Faltas> listaFaltasColaboradores(@WebParam(name = "entidade") Entidade entidade) {
        return faltasDAOImpl.listaFaltas(entidade);
    }

    @WebMethod(operationName = "listaFaltasFuncionario")
    public List<Faltas> listaFaltasFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return faltasDAOImpl.listaFaltasFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "listaFaltasPeriodo")
    public List<Faltas> listaFaltasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return faltasDAOImpl.listaFaltasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaFaltasFuncionarioPeriodo")
    public List<Faltas> listaFaltasFuncionarioPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return faltasDAOImpl.listaFaltasFuncionarioPeriodo(entidade, funcionario, p1, p2);
    }

    @WebMethod(operationName = "listaFaltasData")
    public List<Faltas> listaFaltasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return faltasDAOImpl.listaFaltasData(entidade, data);
    }

    @WebMethod(operationName = "listaFaltasFuncionarioData")
    public List<Faltas> listaFaltasFuncionarioData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "data") String data) {
        return faltasDAOImpl.listaFaltasFuncionarioData(entidade, funcionario, data);
    }

    @WebMethod(operationName = "persistir_falta")
    public void persistir_falta(@WebParam(name = "falta") Faltas falta) {
        faltasDAOImpl.persistir_falta(falta);
    }

    @WebMethod(operationName = "remover_falta")
    public void remover_falta(@WebParam(name = "falta") Faltas falta) {
        faltasDAOImpl.remover_falta(falta);
    }

    /*
     ************************** END FALTAS ***********************
     **/
    //=========================  FERIAS ==========================
    FeriasDAOImpl feriasDAOImpl = new FeriasDAOImpl();

    @WebMethod(operationName = "buscaFeriasId")
    public Ferias buscaFeriasId(@WebParam(name = "id") int id) {
        return feriasDAOImpl.getFerias(id);
    }

    @WebMethod(operationName = "listaFerias")
    public List<Ferias> listaFerias(@WebParam(name = "entidade") Entidade entidade) {
        return feriasDAOImpl.listaFerias(entidade);
    }

    @WebMethod(operationName = "listaFeriasFuncionario")
    public List<Ferias> listaFeriasFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return feriasDAOImpl.listaFeriasFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "persistir_ferias")
    public void persistir_ferias(@WebParam(name = "ferias") Ferias ferias) {
        feriasDAOImpl.persistir_ferias(ferias);
    }

    @WebMethod(operationName = "remover_ferias")
    public void remover_ferias(@WebParam(name = "ferias") Ferias ferias) {
        feriasDAOImpl.remover_ferias(ferias);
    }

    /*
     ************************** END FERIAS ***********************
     **/
    //=========================  FIRMA ==========================
    FirmaDAOImpl firmaDAOImpl = new FirmaDAOImpl();

    @WebMethod(operationName = "buscaFirmaId")
    public Firma buscaFirmaId(@WebParam(name = "id") int id) {
        return firmaDAOImpl.getFirma(id);
    }

    @WebMethod(operationName = "buscaFirmaDescricao")
    public Firma buscaFirmaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return firmaDAOImpl.getFirma(entidade, descricao);
    }

    @WebMethod(operationName = "listaFirmas")
    public List<Firma> listaFirmas(@WebParam(name = "entidade") Entidade entidade) {
        return firmaDAOImpl.listaFirmas(entidade);
    }

    @WebMethod(operationName = "persistir_firma")
    public void persistir_firma(@WebParam(name = "firma") Firma firma) {
        firmaDAOImpl.persistir_firma(firma);
    }

    /*
     ************************** END FIRMA ***********************
     **/
    //=========================  FORMACAO ==========================
    FormacaoDAOImpl formacaoDAOImpl = new FormacaoDAOImpl();

    @WebMethod(operationName = "buscaFormacaoId")
    public Formacao buscaFormacaoId(@WebParam(name = "id") int id) {
        return formacaoDAOImpl.getFormacao(id);
    }

    @WebMethod(operationName = "buscaFormacaoDescricao")
    public Formacao buscaFormacaoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "descricao") String descricao) {
        return formacaoDAOImpl.getFormacao(entidade, funcionario, descricao);
    }

    @WebMethod(operationName = "listaFormacoes")
    public List<Formacao> listaFormacoes(@WebParam(name = "entidade") Entidade entidade) {
        return formacaoDAOImpl.listaFormacoes(entidade);
    }

    @WebMethod(operationName = "listaFormacoesFuncionario")
    public List<Formacao> listaFormacoesFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return formacaoDAOImpl.listaFormacoesFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "persistir_formacao")
    public void persistir_formacao(@WebParam(name = "formacao") Formacao formacao) {
        formacaoDAOImpl.persistir_formacao(formacao);
    }

    @WebMethod(operationName = "remover_formacao")
    public void remover_formacao(@WebParam(name = "formacao") Formacao formacao) {
        formacaoDAOImpl.remover_formacao(formacao);
    }

    /*
     ************************** END FORMACAO ***********************
     **/
 /*=================== FUNCIONARIO ========================*/
    FuncionarioDAOImpl funcionarioDAOImpl = new FuncionarioDAOImpl();

    @WebMethod(operationName = "buscarFuncionarioId")
    public Funcionario buscarFuncionarioId(@WebParam(name = "id") int id) {
        return funcionarioDAOImpl.getFuncionario(id);
    }

    @WebMethod(operationName = "buscarFuncionarioPessoaId")
    public Funcionario buscarFuncionarioPessoaId(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return funcionarioDAOImpl.getFuncionarioPessoa(entidade, id);
    }

    @WebMethod(operationName = "buscarFuncionarioNumero")
    public Funcionario buscarFuncionarioNumero(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "id") int id) {
        return funcionarioDAOImpl.getFuncionarioNumero(entidade, id);
    }

    @WebMethod(operationName = "buscarFuncionarioBagdeNumber")
    public Funcionario buscarFuncionarioBagdeNumber(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "numero") String numero) {
        return funcionarioDAOImpl.getFuncionarioBagdeNumber(entidade, numero);
    }

    @WebMethod(operationName = "listaFuncionariosCargo")
    public List<Funcionario> listaFuncionariosCargo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "cargo") Cargo cargo) {
        return funcionarioDAOImpl.listaFuncionariosCargo(entidade, cargo);
    }

    @WebMethod(operationName = "listaFuncionariosHabilitacao")
    public List<Funcionario> listaFuncionariosHabilitacao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "habilitacao") Habilitacao habilitacao) {
        return funcionarioDAOImpl.listaFuncionariosHabilitacao(entidade, habilitacao);
    }

    @WebMethod(operationName = "listaFuncionariosFirma")
    public List<Funcionario> listaFuncionariosFirma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "firma") Firma firma) {
        return funcionarioDAOImpl.listaFuncionariosFirma(entidade, firma);
    }

    @WebMethod(operationName = "listaFuncionariosDepartamento")
    public List<Funcionario> listaFuncionariosDepartamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "departamento") Departamento departamento) {
        return funcionarioDAOImpl.listaFuncionariosDepartamento(entidade, departamento);
    }

    @WebMethod(operationName = "listaFuncionariosNumero")
    public List<Funcionario> listaFuncionariosNumero(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "tipo") String tipo) {
        return funcionarioDAOImpl.listaFuncionariosNumero(entidade, tipo);
    }

    @WebMethod(operationName = "listaFuncionarios")
    public List<Funcionario> listaFuncionarios(@WebParam(name = "entidade") Entidade entidade) {
        return funcionarioDAOImpl.listaFuncionarios(entidade);
    }

    @WebMethod(operationName = "persistir_funcioanario")
    public void persistir_funcioanario(@WebParam(name = "funcionario") Funcionario funcionario) {
        funcionarioDAOImpl.persistir_funcioanario(funcionario);
    }

    @WebMethod(operationName = "remover_funcioanario")
    public void remover_funcioanario(@WebParam(name = "funcionario") Funcionario funcionario) {
        funcionarioDAOImpl.remover_funcioanario(funcionario);
    }

    /**
     * ******************** END FUNCIONARIO *********************
     */
    //=========================  PLANO DE SAUDE ==========================
    PlanoSaudeDAOImpl planoSaudeDAOImpl = new PlanoSaudeDAOImpl();

    @WebMethod(operationName = "buscaPlanoSaudeId")
    public PlanoSaude buscaPlanoSaudeId(@WebParam(name = "id") int id) {
        return planoSaudeDAOImpl.getPlanoSaude(id);
    }

    @WebMethod(operationName = "buscaPlanoSaudeDescricao")
    public PlanoSaude buscaPlanoSaudeDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "descricao") String descricao) {
        return planoSaudeDAOImpl.getPlanoSaude(entidade, funcionario, descricao);
    }

    @WebMethod(operationName = "listaPlanosSaude")
    public List<PlanoSaude> listaPlanosSaude(@WebParam(name = "entidade") Entidade entidade) {
        return planoSaudeDAOImpl.listaPlanosSaude(entidade);
    }

    @WebMethod(operationName = "listaPlanosSaudeFuncionario")
    public List<PlanoSaude> listaPlanosSaudeFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return planoSaudeDAOImpl.listaPlanosSaudeFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "persistir_planoSaude")
    public void persistir_planoSaude(@WebParam(name = "planoSaude") PlanoSaude planoSaude) {
        planoSaudeDAOImpl.persistir_planoSaude(planoSaude);
    }

    @WebMethod(operationName = "remover_planoSaude")
    public void remover_planoSaude(@WebParam(name = "planoSaude") PlanoSaude planoSaude) {
        planoSaudeDAOImpl.remover_planoSaude(planoSaude);
    }

    /*
     ************************** END PLANO DE SAUDE ***********************
     **/
    //=========================  SECTOR ==========================
    SectorDAOImpl sectorDAOImpl = new SectorDAOImpl();

    @WebMethod(operationName = "buscaSectorId")
    public Sector buscaSectorId(@WebParam(name = "id") int id) {
        return sectorDAOImpl.getSector(id);
    }

    @WebMethod(operationName = "buscaSectorDescricao")
    public Sector buscaSectorDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return sectorDAOImpl.getSector(entidade, descricao);
    }

    @WebMethod(operationName = "listaSectores")
    public List<Sector> listaSectores(@WebParam(name = "entidade") Entidade entidade) {
        return sectorDAOImpl.listaSectores(entidade);
    }

    @WebMethod(operationName = "listaSectoresDepartamento")
    public List<Sector> listaSectoresDepartamento(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "departamento") Departamento departamento) {
        return sectorDAOImpl.listaSectoresDepartamento(entidade, departamento);
    }

    @WebMethod(operationName = "persistir_sector")
    public void persistir_sector(@WebParam(name = "sector") Sector sector) {
        sectorDAOImpl.persistir_sector(sector);
    }

    /*
     ************************** END SECTOR ***********************
     **/
    //=========================  HABILITACAO ==========================
    HabilitacaoDAOImpl habilitacaoDAOImpl = new HabilitacaoDAOImpl();

    @WebMethod(operationName = "buscaHabilitacaoId")
    public Habilitacao buscaHabilitacaoId(@WebParam(name = "id") int id) {
        return habilitacaoDAOImpl.getHabilitacao(id);
    }

    @WebMethod(operationName = "buscaHabilitacaoDescricao")
    public Habilitacao buscaHabilitacaoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return habilitacaoDAOImpl.getHabilitacao(entidade, descricao);
    }

    @WebMethod(operationName = "listaHabilitacoes")
    public List<Habilitacao> listaHabilitacoes(@WebParam(name = "entidade") Entidade entidade) {
        return habilitacaoDAOImpl.listaHabilitacoes(entidade);
    }

    @WebMethod(operationName = "persistir_habilitacao")
    public void persistir_habilitacao(@WebParam(name = "habilitacao") Habilitacao habilitacao) {
        habilitacaoDAOImpl.persistir_habilitacao(habilitacao);
    }

    @WebMethod(operationName = "remover_habilitacao")
    public void remover_habilitacao(@WebParam(name = "habilitacao") Habilitacao habilitacao) {
        habilitacaoDAOImpl.remover_habilitacao(habilitacao);
    }

    /*
     ************************** END HABILITACAO ***********************
     **/
    
    
    //=========================  HORAS ==========================
    HorasDAOImpl horasDAOImpl = new HorasDAOImpl();

    @WebMethod(operationName = "buscaHorasId")
    public Horas buscaHorasId(@WebParam(name = "id") int id) {
        return horasDAOImpl.getHora(id);
    }

    @WebMethod(operationName = "listaHoras")
    public List<Horas> listaHoras(@WebParam(name = "entidade") Entidade entidade) {
        return horasDAOImpl.listaHoras(entidade);
    }

    @WebMethod(operationName = "listaHorasFuncionario")
    public List<Horas> listaHorasFuncionario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario) {
        return horasDAOImpl.listaHorasFuncionario(entidade, funcionario);
    }

    @WebMethod(operationName = "listaHorasPeriodo")
    public List<Horas> listaHorasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return horasDAOImpl.listaHorasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaHorasFuncionarioPeriodo")
    public List<Horas> listaHorasFuncionarioPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return horasDAOImpl.listaHorasFuncionarioPeriodo(entidade, funcionario, p1, p2);
    }

    @WebMethod(operationName = "listaHorasData")
    public List<Horas> listaHorasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return horasDAOImpl.listaHorasData(entidade, data);
    }

    @WebMethod(operationName = "listaHorasFuncionarioData")
    public List<Horas> listaHorasFuncionarioData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "funcionario") Funcionario funcionario, @WebParam(name = "data") String data) {
        return horasDAOImpl.listaHorasFuncionarioData(entidade, funcionario, data);
    }

    @WebMethod(operationName = "persistir_hora")
    public void persistir_hora(@WebParam(name = "hora") Horas hora) {
        horasDAOImpl.persistir_hora(hora);
    }

    @WebMethod(operationName = "remover_hora")
    public void remover_hora(@WebParam(name = "hora") Horas hora) {
        horasDAOImpl.remover_hora(hora);
    }

    /*
     ************************** END HORAS ***********************
     **/
}
