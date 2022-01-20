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

import com.dciapps.webclient.AgendaContacto;
import com.dciapps.webclient.Cidade;
import com.dciapps.webclient.Cor;
import com.dciapps.webclient.DiaSemana;
import com.dciapps.webclient.Entidade;
import com.dciapps.webclient.Horario;
import com.dciapps.webclient.ListaTelefonica;
import com.dciapps.webclient.Nacionalidade;
import com.dciapps.webclient.NivelPrioridade;
import com.dciapps.webclient.Pdf;
import com.dciapps.webclient.Pessoa;
import com.dciapps.webclient.Segmento;
import com.dciapps.webclient.TipoContacto;
import com.dciapps.webclient.Upload;


/**
 *
 * @author HJC2K8
 */
public class GestaoCtrl {

    public AgendaContacto buscaAgendaContactoId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaAgendaContactoId(id);
    }

    public Cidade buscaCidadeDescricao(java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaCidadeDescricao(descricao);
    }

    public Cidade buscaCidadeId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaCidadeId(id);
    }

    public Cor buscaCorDescricao(java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaCorDescricao(descricao);
    }

    public Cor buscaCorId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaCorId(id);
    }

    public DiaSemana buscaDiaSemanaDescricao(java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaDiaSemanaDescricao(descricao);
    }

    public DiaSemana buscaDiaSemanaId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaDiaSemanaId(id);
    }

    public Horario buscaHorario(com.dciapps.webclient.Entidade entidade, java.lang.String horaInicio, java.lang.String horaFim) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaHorario(entidade, horaInicio, horaFim);
    }

    public Horario buscaHorarioId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaHorarioId(id);
    }

    public ListaTelefonica buscaListaTelefonicaDescricao(java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaListaTelefonicaDescricao(descricao);
    }

    public ListaTelefonica buscaListaTelefonicaId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaListaTelefonicaId(id);
    }

    public NivelPrioridade buscaNivelPrioridadeDescricao(java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaNivelPrioridadeDescricao(descricao);
    }

    public NivelPrioridade buscaNivelPrioridadeId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaNivelPrioridadeId(id);
    }

    public Pdf buscaPdfId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaPdfId(id);
    }

 

    public TipoContacto buscaTipoContactoDescricao(java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaTipoContactoDescricao(descricao);
    }

    public TipoContacto buscaTipoContactoId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaTipoContactoId(id);
    }

    public Entidade buscarEntidadeId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarEntidadeId(id);
    }

    public Entidade buscarEntidadeNome(java.lang.String nome) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarEntidadeNome(nome);
    }

    public Entidade buscarEntidadePelaSigla(java.lang.String sigla) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarEntidadePelaSigla(sigla);
    }

    public Nacionalidade buscarNacionalidadeDescricao(java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarNacionalidadeDescricao(descricao);
    }

    public Nacionalidade buscarNacionalidadeId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarNacionalidadeId(id);
    }

    public Segmento buscaSegmentoCategoria(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaSegmentoCategoria(entidade, descricao);
    }

    public Segmento buscaSegmentoId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaSegmentoId(id);
    }


    public Pessoa buscarPessoaBI(com.dciapps.webclient.Entidade entidade, java.lang.String bi) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarPessoaBI(entidade, bi);
    }

    public Pessoa buscarPessoaEmail(com.dciapps.webclient.Entidade entidade, java.lang.String email) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarPessoaEmail(entidade, email);
    }

    public Pessoa buscarPessoaId(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarPessoaId(id);
    }

    public Pessoa buscarPessoaNome(com.dciapps.webclient.Entidade entidade, java.lang.String nome) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarPessoaNome(entidade, nome);
    }

    public Pessoa buscarPessoaNomeApelido(com.dciapps.webclient.Entidade entidade, java.lang.String nome, java.lang.String apelido) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarPessoaNomeApelido(entidade, nome, apelido);
    }

    public Pessoa buscarPessoaNuit(com.dciapps.webclient.Entidade entidade, java.lang.String nuit) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscarPessoaNuit(entidade, nuit);
    }

    public java.util.List<com.dciapps.webclient.AgendaContacto> listaAgendaContactos() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaAgendaContactos();
    }

    public java.util.List<com.dciapps.webclient.AgendaContacto> listaAgendaContactosCliente(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaAgendaContactosCliente(id);
    }

    public java.util.List<com.dciapps.webclient.AgendaContacto> listaAgendaContactosClienteMicro(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaAgendaContactosClienteMicro(id);
    }

    public java.util.List<com.dciapps.webclient.AgendaContacto> listaAgendaContactosFornecedor(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaAgendaContactosFornecedor(id);
    }

    public java.util.List<com.dciapps.webclient.AgendaContacto> listaAgendaContactosFuncionario(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaAgendaContactosFuncionario(id);
    }

    public java.util.List<com.dciapps.webclient.AgendaContacto> listaAgendaContactosTipoContacto(int id) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaAgendaContactosTipoContacto(id);
    }

    public java.util.List<com.dciapps.webclient.Cidade> listaCidades() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaCidades();
    }

    public java.util.List<com.dciapps.webclient.Cor> listaCores() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaCores();
    }

    public java.util.List<com.dciapps.webclient.DiaSemana> listaDiaSemanas() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaDiaSemanas();
    }

    public java.util.List<com.dciapps.webclient.Entidade> listaEntidades() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaEntidades();
    }

    public java.util.List<com.dciapps.webclient.Horario> listaHorarios(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaHorarios(entidade);
    }

    public java.util.List<com.dciapps.webclient.ListaTelefonica> listaListaTelefonicas() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaListaTelefonicas();
    }

    public java.util.List<com.dciapps.webclient.Nacionalidade> listaNacionalidades() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaNacionalidades();
    }

    public java.util.List<com.dciapps.webclient.NivelPrioridade> listaNivelPrioridades() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaNivelPrioridades();
    }

    public java.util.List<com.dciapps.webclient.Pdf> listaPdfs() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaPdfs();
    }

    public java.util.List<com.dciapps.webclient.Pessoa> listaPessoas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaPessoas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Pessoa> listaPessoasBairro(com.dciapps.webclient.Entidade entidade, java.lang.String bairro) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaPessoasBairro(entidade, bairro);
    }

    public java.util.List<com.dciapps.webclient.Pessoa> listaPessoasTipo(com.dciapps.webclient.Entidade entidade, java.lang.String tipo) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaPessoasTipo(entidade, tipo);
    }



    public java.util.List<com.dciapps.webclient.Segmento> listaSegmentos() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaSegmentos();
    }

    public java.util.List<com.dciapps.webclient.TipoContacto> listaTipoContactos() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaTipoContactos();
    }

    public void persistirAgendaContacto(com.dciapps.webclient.AgendaContacto agendaContacto) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirAgendaContacto(agendaContacto);
    }

    public void persistirCidade(com.dciapps.webclient.Cidade cidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirCidade(cidade);
    }

    public void persistirCor(com.dciapps.webclient.Cor cor) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirCor(cor);
    }

    public void persistirDiaSemana(com.dciapps.webclient.DiaSemana diaSemana) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirDiaSemana(diaSemana);
    }

    public void persistirEntidade(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirEntidade(entidade);
    }

    public void persistirHorario(com.dciapps.webclient.Horario horario) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirHorario(horario);
    }

    public void persistirListaTelefonica(com.dciapps.webclient.ListaTelefonica listaTelefonica) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirListaTelefonica(listaTelefonica);
    }

    public void persistirNacionalidade(com.dciapps.webclient.Nacionalidade nacionalidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirNacionalidade(nacionalidade);
    }

    public void persistirNivelPrioridade(com.dciapps.webclient.NivelPrioridade nivelPrioridade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirNivelPrioridade(nivelPrioridade);
    }

    public void persistirPdf(com.dciapps.webclient.Pdf pdf) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirPdf(pdf);
    }

    public void persistirPessoa(com.dciapps.webclient.Pessoa pessoa) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirPessoa(pessoa);
    }

  
    public void persistirSegmento(com.dciapps.webclient.Segmento segmento) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirSegmento(segmento);
    }

    public void persistirTipoContacto(com.dciapps.webclient.TipoContacto tipoContacto) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirTipoContacto(tipoContacto);
    }

    public void removerHorario(com.dciapps.webclient.Horario horario) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.removerHorario(horario);
    }

    public void removerNacionalidade(com.dciapps.webclient.Nacionalidade nacionalidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.removerNacionalidade(nacionalidade);
    }

    public void removerPessoa(com.dciapps.webclient.Pessoa pessoa) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.removerPessoa(pessoa);
    }

    public void removerSegmento(com.dciapps.webclient.Segmento segmento) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.removerSegmento(segmento);
    }

    public java.util.List<com.dciapps.webclient.Pessoa> listaTodasPessoas() {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaTodasPessoas();
    }

    public java.util.List<com.dciapps.webclient.Pessoa> listaPessoasNacionalidade(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Nacionalidade nacionalidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.listaPessoasNacionalidade(entidade, nacionalidade);
    }

    public Upload buscaUpload(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        return port.buscaUpload(entidade);
    }

    public void persistirUpload(com.dciapps.webclient.Upload upload) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.persistirUpload(upload);
    }

    public void removerUpload(com.dciapps.webclient.Upload upload) {
        com.dciapps.webclient.GestaoWSrv_Service service = new com.dciapps.webclient.GestaoWSrv_Service();
        com.dciapps.webclient.GestaoWSrv port = service.getGestaoWSrvPort();
        port.removerUpload(upload);
    }


}
