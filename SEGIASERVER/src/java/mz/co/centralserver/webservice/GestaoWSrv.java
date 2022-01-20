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
import mz.co.centralserver.daoimpl.gestao.AgendaContactoDAOImpl;
import mz.co.centralserver.daoimpl.gestao.CidadeDAOImpl;
import mz.co.centralserver.daoimpl.gestao.CorDAOImpl;
import mz.co.centralserver.daoimpl.gestao.DiaSemanaDAOImpl;
import mz.co.centralserver.daoimpl.gestao.EntidadeDAOImpl;
import mz.co.centralserver.daoimpl.gestao.HorarioDAOImpl;
import mz.co.centralserver.daoimpl.gestao.ListaTelefonicaDAOImpl;
import mz.co.centralserver.daoimpl.gestao.NacionalidadeDAOImpl;
import mz.co.centralserver.daoimpl.gestao.NivelPrioridadeDAOImpl;
import mz.co.centralserver.daoimpl.gestao.PdfDAOImpl;
import mz.co.centralserver.daoimpl.gestao.PessoaDAOImpl;
import mz.co.centralserver.daoimpl.gestao.TipoContactoDAOImpl;
import mz.co.centralserver.daoimpl.gestao.SegmentoDAOImpl;
import mz.co.centralserver.daoimpl.gestao.UploadDAOImpl;
import mz.co.centralserver.model.gestao.AgendaContacto;
import mz.co.centralserver.model.gestao.Cidade;
import mz.co.centralserver.model.gestao.Cor;
import mz.co.centralserver.model.gestao.DiaSemana;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Horario;
import mz.co.centralserver.model.gestao.ListaTelefonica;
import mz.co.centralserver.model.gestao.Nacionalidade;
import mz.co.centralserver.model.gestao.NivelPrioridade;
import mz.co.centralserver.model.gestao.Pdf;
import mz.co.centralserver.model.gestao.Pessoa;
import mz.co.centralserver.model.gestao.Segmento;
import mz.co.centralserver.model.gestao.TipoContacto;
import mz.co.centralserver.model.gestao.Upload;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "GestaoWSrv")
public class GestaoWSrv {

    /*=================== ENTIDADE ========================*/
    EntidadeDAOImpl entidadeDAOImpl = new EntidadeDAOImpl();

    @WebMethod(operationName = "buscarEntidadeId")
    public Entidade buscarEntidadeId(@WebParam(name = "id") int id) {
        return entidadeDAOImpl.getEntidade(id);
    }

    @WebMethod(operationName = "buscarEntidadeNome")
    public Entidade buscarEntidadeNome(@WebParam(name = "nome") String nome) {
        return entidadeDAOImpl.getEntidade(nome);
    }

    @WebMethod(operationName = "buscarEntidadePelaSigla")
    public Entidade buscarEntidadePelaSigla(@WebParam(name = "sigla") String sigla) {
        return entidadeDAOImpl.getEntidadePelaSigla(sigla);
    }

    @WebMethod(operationName = "listaEntidades")
    public List<Entidade> listaEntidades() {
        return entidadeDAOImpl.listaEntidades();
    }

    @WebMethod(operationName = "persistir_entidade")
    public void persistir_entidade(@WebParam(name = "entidade") Entidade entidade) {

        entidadeDAOImpl.persistir_entidade(entidade);
    }

    /**
     * ********************END ENTIDADE ***********************
     */
    /*=================== NACIONALIDADE ========================*/
    NacionalidadeDAOImpl nacionalidadeDAOImpl = new NacionalidadeDAOImpl();

    @WebMethod(operationName = "buscarNacionalidadeId")
    public Nacionalidade buscarNacionalidadeId(@WebParam(name = "id") int id) {
        return nacionalidadeDAOImpl.getNacionalidade(id);
    }

    @WebMethod(operationName = "buscarNacionalidadeDescricao")
    public Nacionalidade buscarNacionalidadeDescricao(@WebParam(name = "descricao") String descricao) {
        return nacionalidadeDAOImpl.getNacionalidade(descricao);
    }

    @WebMethod(operationName = "listaNacionalidades")
    public List<Nacionalidade> listaNacionalidades() {
        return nacionalidadeDAOImpl.listaNacionalidades();
    }

    @WebMethod(operationName = "persistir_nacionalidade")
    public void persistir_nacionalidade(@WebParam(name = "nacionalidade") Nacionalidade nacionalidade) {

        nacionalidadeDAOImpl.persistir_nacionalidade(nacionalidade);
    }

    @WebMethod(operationName = "remover_nacionalidade")
    public void remover_nacionalidade(@WebParam(name = "nacionalidade") Nacionalidade nacionalidade) {

        nacionalidadeDAOImpl.remover_nacionalidade(nacionalidade);
    }

    /**
     * ******************** END NACIONALIDADE *********************
     */
    /*=================== PESSOA ========================*/
    PessoaDAOImpl pessoaDAOImpl = new PessoaDAOImpl();

    @WebMethod(operationName = "buscarPessoaId")
    public Pessoa buscarPessoaId(@WebParam(name = "id") int id) {
        return pessoaDAOImpl.getPessoa(id);
    }

    @WebMethod(operationName = "buscarPessoaNome")
    public Pessoa buscarPessoaNome(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "nome") String nome) {
        return pessoaDAOImpl.getPessoa(entidade, nome);
    }

    @WebMethod(operationName = "buscarPessoaEmail")
    public Pessoa buscarPessoaEmail(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "email") String email) {
        return pessoaDAOImpl.getPessoaEmail(entidade, email);
    }

    @WebMethod(operationName = "buscarPessoaNuit")
    public Pessoa buscarPessoaNuit(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "nuit") String nuit) {
        return pessoaDAOImpl.getPessoaNuit(entidade, nuit);
    }

    @WebMethod(operationName = "buscarPessoaBI")
    public Pessoa buscarPessoaBI(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "bi") String bi) {
        return pessoaDAOImpl.getPessoaBI(entidade, bi);
    }

    @WebMethod(operationName = "buscarPessoaNomeApelido")
    public Pessoa buscarPessoaNomeApelido(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "nome") String nome, @WebParam(name = "apelido") String apelido) {
        return pessoaDAOImpl.getPessoa(entidade, nome, apelido);
    }

    @WebMethod(operationName = "listaTodasPessoas")
    public List<Pessoa> listaTodasPessoas() {
        return pessoaDAOImpl.listaPessoas();
    }

    @WebMethod(operationName = "listaPessoas")
    public List<Pessoa> listaPessoas(@WebParam(name = "entidade") Entidade entidade) {
        return pessoaDAOImpl.listaPessoas(entidade);
    }

    @WebMethod(operationName = "listaPessoasNacionalidade")
    public List<Pessoa> listaPessoasNacionalidade(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "nacionalidade") Nacionalidade nacionalidade) {
        return pessoaDAOImpl.listaPessoasNacionalidade(entidade, nacionalidade);
    }

    @WebMethod(operationName = "listaPessoasTipo")
    public List<Pessoa> listaPessoasTipo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "tipo") String tipo) {
        return pessoaDAOImpl.listaPessoasTipo(entidade, tipo);
    }

    @WebMethod(operationName = "listaPessoasBairro")
    public List<Pessoa> listaPessoasBairro(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "bairro") String bairro) {
        return pessoaDAOImpl.listaPessoasBairro(entidade, bairro);
    }

    @WebMethod(operationName = "persistir_pessoa")
    public void persistir_pessoa(@WebParam(name = "pessoa") Pessoa pessoa) {

        pessoaDAOImpl.persistir_pessoa(pessoa);
    }

    @WebMethod(operationName = "remover_pessoa")
    public void remover_pessoa(@WebParam(name = "pessoa") Pessoa pessoa) {

        pessoaDAOImpl.remover_pessoa(pessoa);
    }

    /**
     * ******************** END PESSOA *********************
     */
    //======================= DIA SEMANA ===========================
    DiaSemanaDAOImpl diaSemanaDAOImpl = new DiaSemanaDAOImpl();

    @WebMethod(operationName = "buscaDiaSemanaId")
    public DiaSemana buscaDiaSemanaId(@WebParam(name = "id") int id) {
        return diaSemanaDAOImpl.getDiaSemana(id);
    }

    @WebMethod(operationName = "buscaDiaSemanaDescricao")
    public DiaSemana buscaDiaSemanaDescricao(@WebParam(name = "descricao") String descricao) {
        return diaSemanaDAOImpl.getDiaSemana(descricao);
    }

    @WebMethod(operationName = "listaDiaSemanas")
    public List<DiaSemana> listaDiaSemanas() {
        return diaSemanaDAOImpl.listaDiaSemanas();
    }

    @WebMethod(operationName = "persistir_diaSemana")
    public void persistir_diaSemana(@WebParam(name = "diaSemana") DiaSemana diaSemana) {
        diaSemanaDAOImpl.persistir_diaSemana(diaSemana);
    }

    /**
     * ******************** END DIA SEMANA *************************
     */
    //=========================  NIVEL PRIORIDADE ==========================
    NivelPrioridadeDAOImpl nivelPrioridadeDAOImpl = new NivelPrioridadeDAOImpl();

    @WebMethod(operationName = "buscaNivelPrioridadeId")
    public NivelPrioridade buscaNivelPrioridadeId(@WebParam(name = "id") int id) {
        return nivelPrioridadeDAOImpl.getNivelPrioridade(id);
    }

    @WebMethod(operationName = "buscaNivelPrioridadeDescricao")
    public NivelPrioridade buscaNivelPrioridadeDescricao(@WebParam(name = "descricao") String descricao) {
        return nivelPrioridadeDAOImpl.getNivelPrioridade(descricao);
    }

    @WebMethod(operationName = "listaNivelPrioridades")
    public List<NivelPrioridade> listaNivelPrioridades() {
        return nivelPrioridadeDAOImpl.listaNivelPrioridades();
    }

    @WebMethod(operationName = "persistir_nivelPrioridade")
    public void persistir_nivelPrioridade(@WebParam(name = "nivelPrioridade") NivelPrioridade nivelPrioridade) {
        nivelPrioridadeDAOImpl.persistir_nivelPrioridade(nivelPrioridade);
    }

    /*
     ************************** END NIVEL PRIORIDADE ***********************
     **/
    //=========================  HORARIO ==========================
    HorarioDAOImpl horarioDAOImpl = new HorarioDAOImpl();

    @WebMethod(operationName = "buscaHorarioId")
    public Horario buscaHorarioId(@WebParam(name = "id") int id) {
        return horarioDAOImpl.getHorario(id);
    }

    @WebMethod(operationName = "buscaHorario")
    public Horario buscaHorario(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "hora_inicio") String hora_inicio, @WebParam(name = "hora_fim") String hora_fim) {
        return horarioDAOImpl.getHorario(entidade, hora_fim, hora_fim);
    }

    @WebMethod(operationName = "listaHorarios")
    public List<Horario> listaHorarios(@WebParam(name = "entidade") Entidade entidade) {
        return horarioDAOImpl.listaHorarios(entidade);
    }

    @WebMethod(operationName = "persistir_horario")
    public void persistir_horario(@WebParam(name = "horario") Horario horario) {
        horarioDAOImpl.persistir_horario(horario);
    }

    @WebMethod(operationName = "remover_horario")
    public void remover_horario(@WebParam(name = "horario") Horario horario) {
        horarioDAOImpl.remover_horario(horario);
    }

    /*
     ************************** END HORARIO ***********************
     **/
    //=========================  TIPO CONTACTO ==========================
    TipoContactoDAOImpl tipoContactoDAOImpl = new TipoContactoDAOImpl();

    @WebMethod(operationName = "buscaTipoContactoId")
    public TipoContacto buscaTipoContactoId(@WebParam(name = "id") int id) {
        return tipoContactoDAOImpl.getTipoContacto(id);
    }

    @WebMethod(operationName = "buscaTipoContactoDescricao")
    public TipoContacto buscaTipoContactoDescricao(@WebParam(name = "descricao") String descricao) {
        return tipoContactoDAOImpl.getTipoContacto(descricao);
    }

    @WebMethod(operationName = "listaTipoContactos")
    public List<TipoContacto> listaTipoContactos() {
        return tipoContactoDAOImpl.listaTipoContactos();
    }

    @WebMethod(operationName = "persistir_tipoContacto")
    public void persistir_tipoContacto(@WebParam(name = "tipoContacto") TipoContacto tipoContacto) {
        tipoContactoDAOImpl.persistir_tipoContacto(tipoContacto);
    }

    /*
     ************************** END TIPO CONTACTO ***********************
     **/
    //=========================  PDF ==========================
    PdfDAOImpl pdfDAOImpl = new PdfDAOImpl();

    @WebMethod(operationName = "buscaPdfId")
    public Pdf buscaPdfId(@WebParam(name = "id") int id) {
        return pdfDAOImpl.getPdf(id);
    }

    @WebMethod(operationName = "listaPdfs")
    public List<Pdf> listaPdfs() {
        return pdfDAOImpl.listaPdfs();
    }

    @WebMethod(operationName = "persistir_pdf")
    public void persistir_pdf(@WebParam(name = "pdf") Pdf pdf) {
        pdfDAOImpl.persistir_pdf(pdf);
    }

    /*
     ************************** END PDF ***********************
     **/
    //=========================  LISTA TELEFONICA ==========================
    ListaTelefonicaDAOImpl listaTelefonicaDAOImpl = new ListaTelefonicaDAOImpl();

    @WebMethod(operationName = "buscaListaTelefonicaId")
    public ListaTelefonica buscaListaTelefonicaId(@WebParam(name = "id") int id) {
        return listaTelefonicaDAOImpl.getListaTelefonica(id);
    }

    @WebMethod(operationName = "buscaListaTelefonicaDescricao")
    public ListaTelefonica buscaListaTelefonicaDescricao(@WebParam(name = "descricao") String descricao) {
        return listaTelefonicaDAOImpl.getListaTelefonica(descricao);
    }

    @WebMethod(operationName = "listaListaTelefonicas")
    public List<ListaTelefonica> listaListaTelefonicas() {
        return listaTelefonicaDAOImpl.listaListaTelefonicas();
    }

    @WebMethod(operationName = "persistir_listaTelefonica")
    public void persistir_listaTelefonica(@WebParam(name = "listaTelefonica") ListaTelefonica listaTelefonica) {
        listaTelefonicaDAOImpl.persistir_listaTelefonica(listaTelefonica);
    }

    /*
     ************************** END LISTA TELEFONICA ***********************
     **/
    //=========================  AGENDA CONTACTO ==========================
    AgendaContactoDAOImpl agendaContactoDAOImpl = new AgendaContactoDAOImpl();

    @WebMethod(operationName = "buscaAgendaContactoId")
    public AgendaContacto buscaAgendaContactoId(@WebParam(name = "id") int id) {
        return agendaContactoDAOImpl.getAgendaContacto(id);
    }

    @WebMethod(operationName = "listaAgendaContactos")
    public List<AgendaContacto> listaAgendaContactos() {
        return agendaContactoDAOImpl.listaAgendaContactos();
    }

    @WebMethod(operationName = "listaAgendaContactosCliente")
    public List<AgendaContacto> listaAgendaContactosCliente(@WebParam(name = "id") int id) {
        return agendaContactoDAOImpl.listaAgendaContactosCliente(id);
    }

    @WebMethod(operationName = "listaAgendaContactosClienteMicro")
    public List<AgendaContacto> listaAgendaContactosClienteMicro(@WebParam(name = "id") int id) {
        return agendaContactoDAOImpl.listaAgendaContactosClienteMicro(id);
    }

    @WebMethod(operationName = "listaAgendaContactosFornecedor")
    public List<AgendaContacto> listaAgendaContactosFornecedor(@WebParam(name = "id") int id) {
        return agendaContactoDAOImpl.listaAgendaContactosFornecedor(id);
    }

    @WebMethod(operationName = "listaAgendaContactosFuncionario")
    public List<AgendaContacto> listaAgendaContactosFuncionario(@WebParam(name = "id") int id) {
        return agendaContactoDAOImpl.listaAgendaContactosFuncionario(id);
    }

    @WebMethod(operationName = "listaAgendaContactosTipoContacto")
    public List<AgendaContacto> listaAgendaContactosTipoContacto(@WebParam(name = "id") int id) {
        return agendaContactoDAOImpl.listaAgendaContactosTipoContacto(id);
    }

    @WebMethod(operationName = "persistir_agendaContacto")
    public void persistir_agendaContacto(@WebParam(name = "agendaContacto") AgendaContacto agendaContacto) {
        agendaContactoDAOImpl.persistir_agendaContacto(agendaContacto);
    }

    /*
     ************************** END AGENDA CONTACTO ***********************
     **/
    //=========================  COR ==========================
    CorDAOImpl corDAOImpl = new CorDAOImpl();

    @WebMethod(operationName = "buscaCorId")
    public Cor buscaCorId(@WebParam(name = "id") int id) {
        return corDAOImpl.getCor(id);
    }

    @WebMethod(operationName = "buscaCorDescricao")
    public Cor buscaCorDescricao(@WebParam(name = "descricao") String descricao) {
        return corDAOImpl.getCor(descricao);
    }

    @WebMethod(operationName = "listaCores")
    public List<Cor> listaCores() {
        return corDAOImpl.listaCores();
    }

    @WebMethod(operationName = "persistir_cor")
    public void persistir_cor(@WebParam(name = "cor") Cor cor) {
        corDAOImpl.persistir_cor(cor);
    }

    /*
     ************************** END COR ***********************
     **/
    //=========================  CIDADE ==========================
    CidadeDAOImpl cidadeDAOImpl = new CidadeDAOImpl();

    @WebMethod(operationName = "buscaCidadeId")
    public Cidade buscaCidadeId(@WebParam(name = "id") int id) {
        return cidadeDAOImpl.getCidade(id);
    }

    @WebMethod(operationName = "buscaCidadeDescricao")
    public Cidade buscaCidadeDescricao(@WebParam(name = "descricao") String descricao) {
        return cidadeDAOImpl.getCidade(descricao);
    }

    @WebMethod(operationName = "listaCidades")
    public List<Cidade> listaCidades() {
        return cidadeDAOImpl.listaCidades();
    }

    @WebMethod(operationName = "persistir_cidade")
    public void persistir_cidade(@WebParam(name = "cidade") Cidade cidade) {
        cidadeDAOImpl.persistir_cidade(cidade);
    }

    /*
     ************************** END CIDADE ***********************
     **/

    //=========================  SEGMENTO ==========================
    SegmentoDAOImpl segmentoDAOImpl = new SegmentoDAOImpl();

    @WebMethod(operationName = "buscaSegmentoId")
    public Segmento buscaSegmentoId(@WebParam(name = "id") int id) {
        return segmentoDAOImpl.getSegmento(id);
    }

    @WebMethod(operationName = "buscaSegmentoCategoria")
    public Segmento buscaSegmentoCategoria(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return segmentoDAOImpl.getSegmento(entidade, descricao);
    }

    @WebMethod(operationName = "listaSegmentos")
    public List<Segmento> listaSegmentos() {
        return segmentoDAOImpl.listaSegmentos();
    }

    @WebMethod(operationName = "persistir_segmento")
    public void persistir_segmento(@WebParam(name = "segmento") Segmento segmento) {
        segmentoDAOImpl.persistir_segmento(segmento);
    }

    @WebMethod(operationName = "remover_segmento")
    public void remover_segmento(@WebParam(name = "segmento") Segmento segmento) {
        segmentoDAOImpl.remover_segmento(segmento);
    }

    /*
     ************************** END SEGMENTO ***********************
     **/
    
       //=========================  UPLOAD ==========================
    UploadDAOImpl uploadDAOImpl = new UploadDAOImpl();

    @WebMethod(operationName = "buscaUpload")
    public Upload buscaUpload(@WebParam(name = "entidade") Entidade entidade) {
        return uploadDAOImpl.getUpload(entidade);
    }
	
    @WebMethod(operationName = "persistir_upload")
    public void persistir_upload(@WebParam(name = "upload") Upload upload) {
        uploadDAOImpl.persistir_upload(upload);
    }

    @WebMethod(operationName = "remover_upload")
    public void remover_upload(@WebParam(name = "upload") Upload upload) {
        uploadDAOImpl.remover_upload(upload);
    }

    /*
     ************************** END UPLOAD ***********************
     **/
}
