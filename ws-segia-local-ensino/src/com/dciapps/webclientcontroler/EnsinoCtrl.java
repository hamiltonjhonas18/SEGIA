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

import com.dciapps.webclient.Agenda;
import com.dciapps.webclient.Aluno;
import com.dciapps.webclient.AnoLectivo;
import com.dciapps.webclient.Aproveitamento;
import com.dciapps.webclient.Area;
import com.dciapps.webclient.AreaFormacao;
import com.dciapps.webclient.Avaliacao;
import com.dciapps.webclient.Boletim;
import com.dciapps.webclient.Calendario;
import com.dciapps.webclient.CalendarioExame;
import com.dciapps.webclient.Curso;
import com.dciapps.webclient.Disciplina;
import com.dciapps.webclient.DisciplinaCurso;
import com.dciapps.webclient.DisciplinaDocente;
import com.dciapps.webclient.Docente;
import com.dciapps.webclient.DocenteTurma;
import com.dciapps.webclient.Escola;
import com.dciapps.webclient.Exame;
import com.dciapps.webclient.Falta;
import com.dciapps.webclient.Inscricao;
import com.dciapps.webclient.Matricula;
import com.dciapps.webclient.Media;
import com.dciapps.webclient.Modulo;
import com.dciapps.webclient.Notas;
import com.dciapps.webclient.Parceiro;
import com.dciapps.webclient.Presencas;
import com.dciapps.webclient.Resposta;
import com.dciapps.webclient.Sala;
import com.dciapps.webclient.SalaExame;
import com.dciapps.webclient.Sumario;
import com.dciapps.webclient.Taxa;
import com.dciapps.webclient.Tema;
import com.dciapps.webclient.Transferencia;
import com.dciapps.webclient.Turma;
import com.dciapps.webclient.Turno;
import com.dciapps.webclient.Vagas;

/**
 *
 * @author HJC2K8
 */
public class EnsinoCtrl {

    public Aluno buscaAlunoBagdnumber(java.lang.String badgnumber) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAlunoBagdnumber(badgnumber);
    }

    public Aluno buscaAlunoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAlunoId(id);
    }

    public Aluno buscaAlunoPessoaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAlunoPessoaId(id);
    }

    public AnoLectivo buscaAnoLectivoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAnoLectivoDescricao(entidade, descricao);
    }

    public AnoLectivo buscaAnoLectivoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAnoLectivoId(id);
    }

    public Boletim buscaBoletimId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaBoletimId(id);
    }

    public Curso buscaCursoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaCursoDescricao(entidade, descricao);
    }

    public Curso buscaCursoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaCursoId(id);
    }

    public DisciplinaCurso buscaDisciplinaCursoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaDisciplinaCursoId(id);
    }

    public Disciplina buscaDisciplinaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaDisciplinaDescricao(entidade, descricao);
    }

    public DisciplinaDocente buscaDisciplinaDocenteId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaDisciplinaDocenteId(id);
    }

    public Disciplina buscaDisciplinaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaDisciplinaId(id);
    }

    public Docente buscaDocenteId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaDocenteId(id);
    }

    public Docente buscaDocentePessoaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaDocentePessoaId(id);
    }

    public Inscricao buscaInscricaoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaInscricaoId(id);
    }

    public Notas buscaNotasId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaNotasId(id);
    }

    public Presencas buscaPresencasId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaPresencasId(id);
    }

    public Taxa buscaTaxaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTaxaDescricao(entidade, descricao);
    }

    public Taxa buscaTaxaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTaxaId(id);
    }

    public Turma buscaTurmaDescricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTurmaDescricao(entidade, curso, descricao);
    }

    public Turma buscaTurmaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTurmaId(id);
    }

    public java.util.List<com.dciapps.webclient.Aluno> listaAlunos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAlunos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Aluno> listaAlunosStatus(com.dciapps.webclient.Entidade entidade, java.lang.String status) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAlunosStatus(entidade, status);
    }

    public java.util.List<com.dciapps.webclient.Boletim> listaBoletins(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaBoletins(entidade);
    }

    public java.util.List<com.dciapps.webclient.Boletim> listaBoletinsInscricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Inscricao inscricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaBoletinsInscricao(entidade, inscricao);
    }

    public java.util.List<com.dciapps.webclient.Curso> listaCursos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCursos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Disciplina> listaDisciplinas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinas(entidade);
    }

    public java.util.List<com.dciapps.webclient.DisciplinaCurso> listaDisciplinasCursoDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinasCursoDisciplina(entidade, disciplina);
    }

    public java.util.List<com.dciapps.webclient.DisciplinaCurso> listaDisciplinasCursos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinasCursos(entidade);
    }

    public java.util.List<com.dciapps.webclient.DisciplinaCurso> listaDisciplinasCursosCurso(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinasCursosCurso(entidade, curso);
    }

    public java.util.List<com.dciapps.webclient.DisciplinaDocente> listaDisciplinasDocenteDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinasDocenteDisciplina(entidade, disciplina);
    }

    public java.util.List<com.dciapps.webclient.DisciplinaDocente> listaDisciplinasDocentes(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinasDocentes(entidade);
    }

    public java.util.List<com.dciapps.webclient.DisciplinaDocente> listaDisciplinasDocentesDocente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Docente docente) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinasDocentesDocente(entidade, docente);
    }

    public java.util.List<com.dciapps.webclient.Docente> listaDocentes(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDocentes(entidade);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoes(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoes(entidade);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoesAluno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoesAluno(entidade, aluno);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoesAnoLectivo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoesAnoLectivo(entidade, anoLectivo);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoesCurso(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoesCurso(entidade, curso);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoesTurma(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoesTurma(entidade, turma);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotasDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotasDisciplina(entidade, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotasAluno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotasAluno(entidade, aluno);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasDisciplina(entidade, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Taxa> listaTaxas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTaxas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Turma> listaTurmas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTurmas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Turma> listaTurmasCurso(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTurmasCurso(entidade, curso);
    }

    public java.util.List<com.dciapps.webclient.AnoLectivo> listasAnosLectivos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listasAnosLectivos(entidade);
    }

    public void persistirAluno(com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirAluno(aluno);
    }

    public void persistirAnoLectivo(com.dciapps.webclient.AnoLectivo anoLectivo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirAnoLectivo(anoLectivo);
    }

    public void persistirBoletim(com.dciapps.webclient.Boletim boletim) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirBoletim(boletim);
    }

    public void persistirCurso(com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirCurso(curso);
    }

    public void persistirDisciplina(com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirDisciplina(disciplina);
    }

    public void persistirDisciplinaCurso(com.dciapps.webclient.DisciplinaCurso disciplinaCurso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirDisciplinaCurso(disciplinaCurso);
    }

    public void persistirDisciplinaDocente(com.dciapps.webclient.DisciplinaDocente disciplinaDocente) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirDisciplinaDocente(disciplinaDocente);
    }

    public void persistirDocente(com.dciapps.webclient.Docente docente) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirDocente(docente);
    }

    public void persistirInscricao(com.dciapps.webclient.Inscricao inscricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirInscricao(inscricao);
    }

    public void persistirNotas(com.dciapps.webclient.Notas notas) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirNotas(notas);
    }

    public void persistirPresencas(com.dciapps.webclient.Presencas presencas) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirPresencas(presencas);
    }

    public void persistirTaxa(com.dciapps.webclient.Taxa taxa) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirTaxa(taxa);
    }

    public void persistirTurma(com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirTurma(turma);
    }

    public void removerAluno(com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerAluno(aluno);
    }

    public void removerBoletim(com.dciapps.webclient.Boletim boletim) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerBoletim(boletim);
    }

    public void removerDisciplina(com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerDisciplina(disciplina);
    }

    public void removerDisciplinaCurso(com.dciapps.webclient.DisciplinaCurso disciplinaCurso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerDisciplinaCurso(disciplinaCurso);
    }

    public void removerDisciplinaDocente(com.dciapps.webclient.DisciplinaDocente disciplinaDocente) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerDisciplinaDocente(disciplinaDocente);
    }

    public void removerDocente(com.dciapps.webclient.Docente docente) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerDocente(docente);
    }

    public void removerInscricao(com.dciapps.webclient.Inscricao inscricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerInscricao(inscricao);
    }

    public void removerNotas(com.dciapps.webclient.Notas notas) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerNotas(notas);
    }

    public void removerPresencas(com.dciapps.webclient.Presencas presencas) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerPresencas(presencas);
    }

    public void removerTurma(com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerTurma(turma);
    }

    public void removerCurso(com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerCurso(curso);
    }

    public Avaliacao buscaAvaliacaoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAvaliacaoId(id);
    }

    public java.util.List<com.dciapps.webclient.Avaliacao> listaAvaliacoes(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAvaliacoes(entidade);
    }

    public java.util.List<com.dciapps.webclient.Avaliacao> listaAvaliacoesAluno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAvaliacoesAluno(entidade, aluno);
    }

    public java.util.List<com.dciapps.webclient.Avaliacao> listaAvaliacoesAlunoSemestre(com.dciapps.webclient.Entidade entidade, int anoLectivo, java.lang.String semestre, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAvaliacoesInscricaoSemestre(entidade, anoLectivo, semestre, aluno);
    }

    public void persistirAvaliacao(com.dciapps.webclient.Avaliacao avaliacao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirAvaliacao(avaliacao);
    }

    public void removerAvaliacao(com.dciapps.webclient.Avaliacao avaliacao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerAvaliacao(avaliacao);
    }

    public Turno buscaTurnoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTurnoId(id);
    }

    public Turno buscaTurnoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTurnoDescricao(entidade, descricao);
    }

    public java.util.List<com.dciapps.webclient.Turno> listaTurnos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTurnos(entidade);
    }

    public void persistirTurno(com.dciapps.webclient.Turno turno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirTurno(turno);
    }

    public void removerTurno(com.dciapps.webclient.Turno turno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerTurno(turno);
    }

    public Vagas buscaVagasId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaVagasId(id);
    }

    public java.util.List<com.dciapps.webclient.Vagas> listaVagas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaVagas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Vagas> listaVagasAnoLectivo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaVagasAnoLectivo(entidade, anoLectivo);
    }

    public java.util.List<com.dciapps.webclient.Vagas> listaVagasCurso(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaVagasCurso(entidade, curso);
    }

    public void persistirVagas(com.dciapps.webclient.Vagas vagas) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirVagas(vagas);
    }

    public void removerVagas(com.dciapps.webclient.Vagas vagas) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerVagas(vagas);
    }

    public AnoLectivo buscaAnoLectivoActivo(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAnoLectivoActivo(entidade);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoesOrigem(com.dciapps.webclient.Entidade entidade, java.lang.String origem) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoesOrigem(entidade, origem);
    }

    public Vagas buscaVagasAnoLectivoCurso(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaVagasAnoLectivoCurso(entidade, anoLectivo, curso);
    }

    public Inscricao buscaInscricaoAnoLectivoSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaInscricaoAnoLectivoSemestre(entidade, anoLectivo, semestre, aluno);
    }

    public java.util.List<com.dciapps.webclient.DisciplinaCurso> listaDisciplinasCursosCursoSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, java.lang.String semestre) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDisciplinasCursosCursoSemestre(entidade, curso, semestre);
    }

    public Presencas buscaPresencasAlunoDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaPresencasAlunoDisciplina(entidade, aluno, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasAluno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasAluno(entidade, aluno);
    }

    public Exame buscaExameId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaExameId(id);
    }

    public Media buscaMediaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaMediaId(id);
    }

    public java.util.List<com.dciapps.webclient.Exame> listaExames(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaExames(entidade);
    }

    public java.util.List<com.dciapps.webclient.Exame> listaExamesAluno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaExamesAluno(entidade, aluno);
    }

    public java.util.List<com.dciapps.webclient.Exame> listaExamesAlunoSemestre(com.dciapps.webclient.Entidade entidade, int anoLectivo, java.lang.String semestre, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaExamesAlunoSemestre(entidade, anoLectivo, semestre, aluno);
    }

    public java.util.List<com.dciapps.webclient.Exame> listaExamesDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaExamesDisciplina(entidade, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Media> listaMedias(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMedias(entidade);
    }

    public java.util.List<com.dciapps.webclient.Media> listaMediasAluno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMediasAluno(entidade, aluno);
    }

    public java.util.List<com.dciapps.webclient.Media> listaMediasAlunoSemestre(com.dciapps.webclient.Entidade entidade, int anoLectivo, java.lang.String semestre, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMediasAlunoSemestre(entidade, anoLectivo, semestre, aluno);
    }

    public java.util.List<com.dciapps.webclient.Media> listaMediasDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMediasDisciplina(entidade, disciplina);
    }

    public void persistirExame(com.dciapps.webclient.Exame exame) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirExame(exame);
    }

    public void persistirMedia(com.dciapps.webclient.Media media) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirMedia(media);
    }

    public void removerExame(com.dciapps.webclient.Exame exame) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerExame(exame);
    }

    public void removerMedia(com.dciapps.webclient.Media media) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerMedia(media);
    }

    public Media buscaMedia(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Aluno aluno, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaMedia(entidade, anoLectivo, aluno, disciplina);
    }

    public Exame buscaExame(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre, com.dciapps.webclient.Aluno aluno, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaExame(entidade, anoLectivo, semestre, aluno, disciplina);
    }

    public AreaFormacao buscaAreaFormacaoDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAreaFormacaoDescricao(entidade, descricao);
    }

    public AreaFormacao buscaAreaFormacaoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAreaFormacaoId(id);
    }

    public Curso buscaCursoDescricaoAreaFormacao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao, com.dciapps.webclient.AreaFormacao areaFormacao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaCursoDescricaoAreaFormacao(entidade, descricao, areaFormacao);
    }

    public java.util.List<com.dciapps.webclient.AreaFormacao> listaAreasFormacao(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAreasFormacao(entidade);
    }

    public java.util.List<com.dciapps.webclient.Curso> listaCursosAreaFormacao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AreaFormacao areaFormacao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCursosAreaFormacao(entidade, areaFormacao);
    }

    public void persistirAreaFormacao(com.dciapps.webclient.AreaFormacao areaFormacao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirAreaFormacao(areaFormacao);
    }

    public void removerAreaFormacao(com.dciapps.webclient.AreaFormacao areaFormacao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerAreaFormacao(areaFormacao);
    }

    public Modulo buscaModuloDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaModuloDescricao(entidade, descricao);
    }

    public Modulo buscaModuloDescricaoCurso(com.dciapps.webclient.Entidade entidade, java.lang.String descricao, com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaModuloDescricaoCurso(entidade, descricao, curso);
    }

    public Modulo buscaModuloId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaModuloId(id);
    }

    public java.util.List<com.dciapps.webclient.Modulo> listaModulos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaModulos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Modulo> listaModulosCurso(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaModulosCurso(entidade, curso);
    }

    public void persistirModulo(com.dciapps.webclient.Modulo modulo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirModulo(modulo);
    }

    public void removerModulo(com.dciapps.webclient.Modulo modulo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerModulo(modulo);
    }

    public Parceiro buscaParceiroDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaParceiroDescricao(entidade, descricao);
    }

    public Parceiro buscaParceiroId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaParceiroId(id);
    }

    public java.util.List<com.dciapps.webclient.Parceiro> listaParceiros(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaParceiros(entidade);
    }

    public void persistirParceiro(com.dciapps.webclient.Parceiro parceiro) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirParceiro(parceiro);
    }

    public void removerParceiro(com.dciapps.webclient.Parceiro parceiro) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerParceiro(parceiro);
    }

    public java.util.List<com.dciapps.webclient.Aluno> listaAlunosTurma(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAlunosTurma(entidade, turma);
    }

    public java.util.List<com.dciapps.webclient.Exame> listaExamesInscricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Inscricao inscricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaExamesInscricao(entidade, inscricao);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotasInscricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Inscricao inscricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotasInscricao(entidade, inscricao);
    }

    public java.util.List<com.dciapps.webclient.Media> listaMediasInscricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Inscricao inscricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMediasInscricao(entidade, inscricao);
    }

    public Inscricao buscaInscricaoReferencia(com.dciapps.webclient.Entidade entidade, java.lang.String referencia) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaInscricaoReferencia(entidade, referencia);
    }

    public Area buscaAreaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAreaDescricao(entidade, descricao);
    }

    public Area buscaAreaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAreaId(id);
    }

    public java.util.List<com.dciapps.webclient.Area> listaAreas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAreas(entidade);
    }

    public void persistirArea(com.dciapps.webclient.Area area) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirArea(area);
    }

    public void removerArea(com.dciapps.webclient.Area area) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerArea(area);
    }

    public DocenteTurma buscaDocenteTurmaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaDocenteTurmaId(id);
    }

    public java.util.List<com.dciapps.webclient.DocenteTurma> listaDocentesTurmas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDocentesTurmas(entidade);
    }

    public java.util.List<com.dciapps.webclient.DocenteTurma> listaDocentesTurmasDocente(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Docente docente) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDocentesTurmasDocente(entidade, docente);
    }

    public java.util.List<com.dciapps.webclient.DocenteTurma> listaDocentesTurmasTurma(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDocentesTurmasTurma(entidade, turma);
    }

    public void persistirDocenteTurma(com.dciapps.webclient.DocenteTurma docenteTurma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirDocenteTurma(docenteTurma);
    }

    public void removerDocenteTurma(com.dciapps.webclient.DocenteTurma docenteTurma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerDocenteTurma(docenteTurma);
    }

    public Agenda buscaAgendaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAgendaId(id);
    }

    public java.util.List<com.dciapps.webclient.Agenda> listaAgenda(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAgenda(entidade);
    }

    public java.util.List<com.dciapps.webclient.Agenda> listaAgendaCursoSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, java.lang.String semestre) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAgendaCursoSemestre(entidade, curso, semestre);
    }

    public java.util.List<com.dciapps.webclient.Agenda> listaAgendaDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAgendaDisciplina(entidade, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Agenda> listaAgendaTurma(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAgendaTurma(entidade, turma);
    }

    public java.util.List<com.dciapps.webclient.Agenda> listaAgendaTurmaSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAgendaTurmaSemestre(entidade, anoLectivo, semestre, turma);
    }

    public void persistirAgenda(com.dciapps.webclient.Agenda agenda) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirAgenda(agenda);
    }

    public void removerAgenda(com.dciapps.webclient.Agenda agenda) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerAgenda(agenda);
    }

    public java.util.List<com.dciapps.webclient.Curso> listaTopCursos(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTopCursos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasAlunoData(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno, java.lang.String data) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasAlunoData(entidade, aluno, data);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasAlunoPeriodo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasAlunoPeriodo(entidade, aluno, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasDisciplinaData(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina, java.lang.String data) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasDisciplinaData(entidade, disciplina, data);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasDisciplinaPeriodo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Disciplina disciplina, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasDisciplinaPeriodo(entidade, disciplina, p1, p2);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasTurmaData(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, java.lang.String data) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasTurmaData(entidade, turma, data);
    }

    public java.util.List<com.dciapps.webclient.Presencas> listaPresencasTurmaPeriodo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaPresencasTurmaPeriodo(entidade, turma, p1, p2);
    }

    public Agenda buscaAgendaTodosCriterios(com.dciapps.webclient.Entidade entidade, java.lang.String diaSemana, java.lang.String horario, java.lang.String semestre, com.dciapps.webclient.Turma turma, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAgendaTodosCriterios(entidade, diaSemana, horario, semestre, turma, anoLectivo, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotasAlunoSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre, com.dciapps.webclient.Aluno aluno) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotasAlunoSemestre(entidade, anoLectivo, semestre, aluno);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotasDisciplinaSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, com.dciapps.webclient.Disciplina disciplina, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotasDisciplinaSemestre(entidade, turma, disciplina, anoLectivo, semestre);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotasTurmaSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotasTurmaSemestre(entidade, turma, anoLectivo, semestre);
    }

    public Notas buscaNotasDisciplinaAluno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Aluno aluno, com.dciapps.webclient.Turma turma, com.dciapps.webclient.Disciplina disciplina, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaNotasDisciplinaAluno(entidade, aluno, turma, disciplina, anoLectivo, semestre);
    }

    public void removerTaxa(com.dciapps.webclient.Taxa taxa) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerTaxa(taxa);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoesAno(com.dciapps.webclient.Entidade entidade, java.lang.String ano) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoesAno(entidade, ano);
    }

    public Escola buscaEscolaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaEscolaId(id);
    }

    public java.util.List<com.dciapps.webclient.Aluno> listaAlunosEscola(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAlunosEscola(entidade, escola);
    }

    public java.util.List<com.dciapps.webclient.Aluno> listaAlunosDistrito(com.dciapps.webclient.Entidade entidade, java.lang.String distrito) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAlunosDistrito(entidade, distrito);
    }

    public java.util.List<com.dciapps.webclient.Aluno> listaAlunosProvincia(com.dciapps.webclient.Entidade entidade, java.lang.String provincia) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAlunosProvincia(entidade, provincia);
    }

    public java.util.List<com.dciapps.webclient.Docente> listaDocentesProvincia(com.dciapps.webclient.Entidade entidade, java.lang.String provincia) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaDocentesProvincia(entidade, provincia);
    }

    public java.util.List<com.dciapps.webclient.Turma> listaTurmasEscola(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTurmasEscola(entidade, escola);
    }

    public void persistirEscola(com.dciapps.webclient.Escola escola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirEscola(escola);
    }

    public void removerEscola(com.dciapps.webclient.Escola escola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerEscola(escola);
    }

    public Sala buscaSalaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaSalaDescricao(entidade, descricao);
    }

    public Sala buscaSalaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaSalaId(id);
    }

    public java.util.List<com.dciapps.webclient.Sala> listaSalas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaSalas(entidade);
    }

    public void persistirSala(com.dciapps.webclient.Sala sala) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirSala(sala);
    }

    public void removerSala(com.dciapps.webclient.Sala sala) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerSala(sala);
    }

    public Aproveitamento buscaAproveitamentoId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAproveitamentoId(id);
    }

    public Falta buscaFaltaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaFaltaId(id);
    }

    public Matricula buscaMatriculaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaMatriculaId(id);
    }

    public void persistirAproveitamento(com.dciapps.webclient.Aproveitamento aproveitamento) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirAproveitamento(aproveitamento);
    }

    public void persistirMatricula(com.dciapps.webclient.Matricula matricula) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirMatricula(matricula);
    }

    public void persistirFalta(com.dciapps.webclient.Faltas falta) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirFalta(falta);
    }

    public Tema buscaTemaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTemaId(id);
    }

    public void persistirTema(com.dciapps.webclient.Tema tema) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirTema(tema);
    }

    public void removerTema(com.dciapps.webclient.Tema tema) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerTema(tema);
    }

    public java.util.List<com.dciapps.webclient.Aluno> listaAlunosEscolaNecessitados(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAlunosEscolaNecessitados(entidade, escola);
    }

    public java.util.List<com.dciapps.webclient.Inscricao> listaInscricoesMelhoresAno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.AnoLectivo anoLectivo, int limite) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaInscricoesMelhoresAno(entidade, anoLectivo, limite);
    }

    public java.util.List<com.dciapps.webclient.Turma> listaTurmasAnoLectivo(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Escola escola, com.dciapps.webclient.AnoLectivo anoLectivo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
    }

    public CalendarioExame buscaCalendarioExameId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaCalendarioExameId(id);
    }

    public CalendarioExame buscaCalendarioExameTodosCriterios(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaCalendarioExameTodosCriterios(entidade, curso, anoLectivo, disciplina);
    }

    public Calendario buscaCalendarioId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaCalendarioId(id);
    }

    public Calendario buscaCalendarioTodosCriterios(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, java.lang.String semestre, com.dciapps.webclient.Turma turma, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaCalendarioTodosCriterios(entidade, curso, semestre, turma, anoLectivo, disciplina);
    }

    public SalaExame buscaSalaExameId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaSalaExameId(id);
    }

    public SalaExame buscaSalaExameTodosCriterios(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Sala sala, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaSalaExameTodosCriterios(entidade, curso, sala, anoLectivo, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Calendario> listaCalendario(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendario(entidade);
    }

    public java.util.List<com.dciapps.webclient.Calendario> listaCalendarioCursoSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, java.lang.String semestre) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendarioCursoSemestre(entidade, curso, semestre);
    }

    public java.util.List<com.dciapps.webclient.Calendario> listaCalendarioDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendarioDisciplina(entidade, curso, disciplina);
    }

    public java.util.List<com.dciapps.webclient.CalendarioExame> listaCalendarioExame(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendarioExame(entidade);
    }

    public java.util.List<com.dciapps.webclient.CalendarioExame> listaCalendarioExameAno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendarioExameAno(entidade, curso, anoLectivo);
    }

    public java.util.List<com.dciapps.webclient.CalendarioExame> listaCalendarioExameDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendarioExameDisciplina(entidade, curso, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Calendario> listaCalendarioTurma(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendarioTurma(entidade, curso, turma);
    }

    public java.util.List<com.dciapps.webclient.Calendario> listaCalendarioTurmaSemestre(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo, java.lang.String semestre, com.dciapps.webclient.Turma turma) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaCalendarioTurmaSemestre(entidade, curso, anoLectivo, semestre, turma);
    }

    public Resposta buscaRespostaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaRespostaId(id);
    }

    public Resposta buscaRespostaTodosCriterios(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Disciplina disciplina, java.lang.String categoria, java.lang.String pergunta) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaRespostaTodosCriterios(entidade, curso, anoLectivo, disciplina, categoria, pergunta);
    }

    public java.util.List<com.dciapps.webclient.Resposta> listaResposta(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaResposta(entidade);
    }

    public java.util.List<com.dciapps.webclient.Resposta> listaRespostaDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaRespostaDisciplina(entidade, curso, anoLectivo, disciplina);
    }

    public java.util.List<com.dciapps.webclient.SalaExame> listaSalaExame(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaSalaExame(entidade);
    }

    public java.util.List<com.dciapps.webclient.SalaExame> listaSalaExameAno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Sala sala) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaSalaExameAno(entidade, curso, anoLectivo, sala);
    }

    public java.util.List<com.dciapps.webclient.SalaExame> listaSalaExameCursoAno(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaSalaExameCursoAno(entidade, curso, anoLectivo);
    }

    public java.util.List<com.dciapps.webclient.SalaExame> listaSalaExameDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.AnoLectivo anoLectivo, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaSalaExameDisciplina(entidade, curso, anoLectivo, disciplina);
    }

    public java.util.List<com.dciapps.webclient.SalaExame> listaSalaExameSala(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Sala sala) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaSalaExameSala(entidade, curso, sala);
    }

    public void persistirCalendario(com.dciapps.webclient.Calendario calendario) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirCalendario(calendario);
    }

    public void persistirCalendarioExame(com.dciapps.webclient.CalendarioExame calendarioExame) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirCalendarioExame(calendarioExame);
    }

    public void persistirResposta(com.dciapps.webclient.Resposta resposta) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirResposta(resposta);
    }

    public void persistirSalaExame(com.dciapps.webclient.SalaExame salaExame) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirSalaExame(salaExame);
    }

    public void removerCalendario(com.dciapps.webclient.Calendario calendario) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerCalendario(calendario);
    }

    public void removerCalendarioExame(com.dciapps.webclient.CalendarioExame calendarioExame) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerCalendarioExame(calendarioExame);
    }

    public void removerResposta(com.dciapps.webclient.Resposta resposta) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerResposta(resposta);
    }

    public void removerSalaExame(com.dciapps.webclient.SalaExame salaExame) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerSalaExame(salaExame);
    }

    public Sumario buscaSumarioId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaSumarioId(id);
    }

    public Transferencia buscaTransferenciaId(int id) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTransferenciaId(id);
    }

    public java.util.List<com.dciapps.webclient.Transferencia> listaTransferencias(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTransferencias(entidade);
    }

    public java.util.List<com.dciapps.webclient.Transferencia> listaTransferenciasData(com.dciapps.webclient.Entidade entidade, java.lang.String data) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTransferenciasData(entidade, data);
    }

    public java.util.List<com.dciapps.webclient.Transferencia> listaTransferenciasDestinoStatus(com.dciapps.webclient.Entidade entidade, java.lang.String status) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTransferenciasDestinoStatus(entidade, status);
    }

    public java.util.List<com.dciapps.webclient.Transferencia> listaTransferenciasOrigemStatus(com.dciapps.webclient.Entidade entidade, java.lang.String status) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTransferenciasOrigemStatus(entidade, status);
    }

    public java.util.List<com.dciapps.webclient.Transferencia> listaTransferenciasPeriodo(com.dciapps.webclient.Entidade entidade, java.lang.String p1, java.lang.String p2) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTransferenciasPeriodo(entidade, p1, p2);
    }

    public void persistirSumario(com.dciapps.webclient.Sumario sumario) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirSumario(sumario);
    }

    public void persistirTransferencia(com.dciapps.webclient.Transferencia transferencia) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.persistirTransferencia(transferencia);
    }

    public void removerSumario(com.dciapps.webclient.Sumario sumario) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerSumario(sumario);
    }

    public void removerTransferencia(com.dciapps.webclient.Transferencia transferencia) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        port.removerTransferencia(transferencia);
    }

    public Sumario buscaSumarioDescricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Disciplina disciplina, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaSumarioDescricao(entidade, curso, disciplina, descricao);
    }

    public Tema buscaTemaDescricao(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Disciplina disciplina, java.lang.String descricao) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaTemaDescricao(entidade, curso, disciplina, descricao);
    }

    public java.util.List<com.dciapps.webclient.Sumario> listaSumarios(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaSumarios(entidade, curso, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Tema> listaTemas(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Curso curso, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaTemas(entidade, curso, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Media> listaMediasTurmaDisciplina(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMediasTurmaDisciplina(entidade, turma, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Media> listaMediasTurmaDisciplinaApurados(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, com.dciapps.webclient.Disciplina disciplina) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMediasTurmaDisciplinaApurados(entidade, turma, disciplina);
    }

    public java.util.List<com.dciapps.webclient.Notas> listaNotasDisciplinaTurma(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.Turma turma, com.dciapps.webclient.Disciplina disciplina, com.dciapps.webclient.AnoLectivo anoLectivo) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaNotasDisciplinaTurma(entidade, turma, disciplina, anoLectivo);
    }

    public java.util.List<com.dciapps.webclient.Exame> listaExamesSala(com.dciapps.webclient.Entidade entidade, com.dciapps.webclient.SalaExame salaExame) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaExamesSala(entidade, salaExame);
    }

    public Aproveitamento buscaAproveitamentoAno(java.lang.String codEscola, java.lang.String classe, java.lang.String ano) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaAproveitamentoAno(codEscola, classe, ano);
    }

    public Escola buscaEscola(java.lang.String codEscola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaEscola(codEscola);
    }

    public Escola buscaEscolaDescricao(com.dciapps.webclient.Entidade entidade, java.lang.String descricao, java.lang.String provincia) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaEscolaDescricao(entidade, descricao, provincia);
    }

    public Falta buscaFaltaAno(java.lang.String codEscola, java.lang.String ano) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaFaltaAno(codEscola, ano);
    }

    public Matricula buscaMatriculaAno(java.lang.String codEscola, java.lang.String ano, java.lang.String classe) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.buscaMatriculaAno(codEscola, ano, classe);
    }

    public java.util.List<com.dciapps.webclient.Aproveitamento> listaAproveitamentos(java.lang.String entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAproveitamentos(entidade);
    }

    public java.util.List<com.dciapps.webclient.Aproveitamento> listaAproveitamentosAno(java.lang.String entidade, java.lang.String ano) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaAproveitamentosAno(entidade, ano);
    }

    public java.util.List<com.dciapps.webclient.Escola> listaEscolas(com.dciapps.webclient.Entidade entidade) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaEscolas(entidade);
    }

    public java.util.List<com.dciapps.webclient.Escola> listaEscolasProvincia(com.dciapps.webclient.Entidade entidade, java.lang.String provincia) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaEscolasProvincia(entidade, provincia);
    }

    public java.util.List<com.dciapps.webclient.Falta> listaFaltas(java.lang.String codEscola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaFaltas(codEscola);
    }

    public java.util.List<com.dciapps.webclient.Falta> listaFaltasAno(java.lang.String codEscola, java.lang.String ano) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaFaltasAno(codEscola, ano);
    }

    public java.util.List<com.dciapps.webclient.Matricula> listaMatriculas(java.lang.String codEscola) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMatriculas(codEscola);
    }

    public java.util.List<com.dciapps.webclient.Matricula> listaMatriculasAno(java.lang.String codEscola, java.lang.String ano) {
        com.dciapps.webclient.EnsinoWSrv_Service service = new com.dciapps.webclient.EnsinoWSrv_Service();
        com.dciapps.webclient.EnsinoWSrv port = service.getEnsinoWSrvPort();
        return port.listaMatriculasAno(codEscola, ano);
    }

}
