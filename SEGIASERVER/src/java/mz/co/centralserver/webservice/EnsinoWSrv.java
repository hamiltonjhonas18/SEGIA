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
import mz.co.centralserver.daoimpl.ensino.AgendaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.AlunoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.AnoLectivoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.AproveitamentoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.AreaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.AreaFormacaoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.AvaliacaoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.BoletimDAOImpl;
import mz.co.centralserver.daoimpl.ensino.CalendarioDAOImpl;
import mz.co.centralserver.daoimpl.ensino.CalendarioExameDAOImpl;
import mz.co.centralserver.daoimpl.ensino.CursoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.DisciplinaCursoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.DisciplinaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.DisciplinaDocenteDAOImpl;
import mz.co.centralserver.daoimpl.ensino.DocenteDAOImpl;
import mz.co.centralserver.daoimpl.ensino.DocenteTurmaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.EscolaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.ExameDAOImpl;
import mz.co.centralserver.daoimpl.ensino.FaltaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.InscricaoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.MatriculaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.MediaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.ModuloDAOImpl;
import mz.co.centralserver.daoimpl.ensino.NotasDAOImpl;
import mz.co.centralserver.daoimpl.ensino.ParceiroDAOImpl;
import mz.co.centralserver.daoimpl.ensino.PresencasDAOImpl;
import mz.co.centralserver.daoimpl.ensino.RespostaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.SalaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.SalaExameDAOImpl;
import mz.co.centralserver.daoimpl.ensino.SumarioDAOImpl;
import mz.co.centralserver.daoimpl.ensino.TaxaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.TemaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.TransferenciaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.TurmaDAOImpl;
import mz.co.centralserver.daoimpl.ensino.TurnoDAOImpl;
import mz.co.centralserver.daoimpl.ensino.VagasDAOImpl;
import mz.co.centralserver.model.ensino.Agenda;
import mz.co.centralserver.model.ensino.Aluno;
import mz.co.centralserver.model.ensino.AnoLectivo;
import mz.co.centralserver.model.ensino.Aproveitamento;
import mz.co.centralserver.model.ensino.Area;
import mz.co.centralserver.model.ensino.AreaFormacao;
import mz.co.centralserver.model.ensino.Avaliacao;
import mz.co.centralserver.model.ensino.Boletim;
import mz.co.centralserver.model.ensino.Calendario;
import mz.co.centralserver.model.ensino.CalendarioExame;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.ensino.Disciplina;
import mz.co.centralserver.model.ensino.DisciplinaCurso;
import mz.co.centralserver.model.ensino.DisciplinaDocente;
import mz.co.centralserver.model.ensino.Docente;
import mz.co.centralserver.model.ensino.DocenteTurma;
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.ensino.Exame;
import mz.co.centralserver.model.ensino.Falta;
import mz.co.centralserver.model.ensino.Inscricao;
import mz.co.centralserver.model.ensino.Matricula;
import mz.co.centralserver.model.ensino.Media;
import mz.co.centralserver.model.ensino.Modulo;
import mz.co.centralserver.model.ensino.Notas;
import mz.co.centralserver.model.ensino.Parceiro;
import mz.co.centralserver.model.ensino.Presencas;
import mz.co.centralserver.model.ensino.Resposta;
import mz.co.centralserver.model.ensino.Sala;
import mz.co.centralserver.model.ensino.SalaExame;
import mz.co.centralserver.model.ensino.Sumario;
import mz.co.centralserver.model.ensino.Taxa;
import mz.co.centralserver.model.ensino.Tema;
import mz.co.centralserver.model.ensino.Transferencia;
import mz.co.centralserver.model.ensino.Turma;
import mz.co.centralserver.model.ensino.Turno;
import mz.co.centralserver.model.ensino.Vagas;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "EnsinoWSrv")
public class EnsinoWSrv {

    //======================= ALUNO ===========================
    AlunoDAOImpl alunoDAOImpl = new AlunoDAOImpl();

    @WebMethod(operationName = "buscaAlunoId")
    public Aluno buscaAlunoId(@WebParam(name = "id") int id) {
        return alunoDAOImpl.getAluno(id);
    }

    @WebMethod(operationName = "buscaAlunoBagdnumber")
    public Aluno buscaAlunoBagdnumber(@WebParam(name = "badgnumber") String badgnumber) {
        return alunoDAOImpl.getAlunoBagdnumber(badgnumber);
    }

    @WebMethod(operationName = "buscaAlunoPessoaId")
    public Aluno buscaAlunoPessoaId(@WebParam(name = "id") int id) {
        return alunoDAOImpl.getAlunoPessoa(id);
    }

    @WebMethod(operationName = "listaAlunos")
    public List<Aluno> listaAlunos(@WebParam(name = "entidade") Entidade entidade) {
        return alunoDAOImpl.listaAlunos(entidade);
    }

    @WebMethod(operationName = "listaAlunosEscolaNecessitados")
    public List<Aluno> listaAlunosEscolaNecessitados(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola) {
        return alunoDAOImpl.listaAlunosEscolaNecessitados(entidade, escola);
    }

    @WebMethod(operationName = "listaAlunosTurma")
    public List<Aluno> listaAlunosTurma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma) {
        return alunoDAOImpl.listaAlunosTurma(entidade, turma);
    }

    @WebMethod(operationName = "listaAlunosEscola")
    public List<Aluno> listaAlunosEscola(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola) {
        return alunoDAOImpl.listaAlunosEscola(entidade, escola);
    }

    @WebMethod(operationName = "listaAlunosStatus")
    public List<Aluno> listaAlunosStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status) {
        return alunoDAOImpl.listaAlunos(entidade, status);
    }

    @WebMethod(operationName = "listaAlunosProvincia")
    public List<Aluno> listaAlunosProvincia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "provincia") String provincia) {
        return alunoDAOImpl.listaAlunosProvincia(entidade, provincia);
    }

    @WebMethod(operationName = "listaAlunosDistrito")
    public List<Aluno> listaAlunosDistrito(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "distrito") String distrito) {
        return alunoDAOImpl.listaAlunosDistrito(entidade, distrito);
    }

    @WebMethod(operationName = "persistir_aluno")
    public void persistir_aluno(@WebParam(name = "aluno") Aluno aluno) {
        alunoDAOImpl.persistir_aluno(aluno);
    }

    @WebMethod(operationName = "remover_aluno")
    public void remover_aluno(@WebParam(name = "aluno") Aluno aluno) {
        alunoDAOImpl.remover_aluno(aluno);
    }
    /**
     * ******************** END ALUNO *************************
     */

    //=========================  ANO LECTIVO ==========================
    AnoLectivoDAOImpl anoLectivoDAOImpl = new AnoLectivoDAOImpl();

    @WebMethod(operationName = "buscaAnoLectivoId")
    public AnoLectivo buscaAnoLectivoId(@WebParam(name = "id") int id) {
        return anoLectivoDAOImpl.getAnoLectivo(id);
    }

    @WebMethod(operationName = "buscaAnoLectivoDescricao")
    public AnoLectivo buscaAnoLectivoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return anoLectivoDAOImpl.getAnoLectivo(entidade, descricao);
    }

    @WebMethod(operationName = "buscaAnoLectivoActivo")
    public AnoLectivo buscaAnoLectivoActivo(@WebParam(name = "entidade") Entidade entidade) {
        return anoLectivoDAOImpl.getAnoLectivoActivo(entidade);
    }

    @WebMethod(operationName = "listasAnosLectivos")
    public List<AnoLectivo> listaAnosLectivos(@WebParam(name = "entidade") Entidade entidade) {
        return anoLectivoDAOImpl.listaAnosLectivos(entidade);
    }

    @WebMethod(operationName = "persistir_anoLectivo")
    public void persistir_anoLectivo(@WebParam(name = "anoLectivo") AnoLectivo anoLectivo) {
        anoLectivoDAOImpl.persistir_anoLectivo(anoLectivo);
    }

    /*
     ************************** END ANO LECTIVO ***********************
     **/
    //=========================  BOLETIM ==========================
    BoletimDAOImpl boletimDAOImpl = new BoletimDAOImpl();

    @WebMethod(operationName = "buscaBoletimId")
    public Boletim buscaBoletimId(@WebParam(name = "id") int id) {
        return boletimDAOImpl.getBoletim(id);
    }

    @WebMethod(operationName = "listaBoletins")
    public List<Boletim> listaBoletins(@WebParam(name = "entidade") Entidade entidade) {
        return boletimDAOImpl.listaBoletins(entidade);
    }

    @WebMethod(operationName = "listaBoletinsInscricao")
    public List<Boletim> listaBoletinsInscricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "inscricao") Inscricao inscricao) {
        return boletimDAOImpl.listaBoletinsInscricao(entidade, inscricao);
    }

    @WebMethod(operationName = "persistir_boletim")
    public void persistir_boletim(@WebParam(name = "boletim") Boletim boletim) {
        boletimDAOImpl.persistir_boletim(boletim);
    }

    @WebMethod(operationName = "remover_boletim")
    public void remover_boletim(@WebParam(name = "boletim") Boletim boletim) {
        boletimDAOImpl.remover_boletim(boletim);
    }

    /*
     ************************** END BOLETIM ***********************
     **/
    //=========================  CURSO ==========================
    CursoDAOImpl cursoDAOImpl = new CursoDAOImpl();

    @WebMethod(operationName = "buscaCursoId")
    public Curso buscaCursoId(@WebParam(name = "id") int id) {
        return cursoDAOImpl.getCurso(id);
    }

    @WebMethod(operationName = "buscaCursoDescricao")
    public Curso buscaCursoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return cursoDAOImpl.getCurso(entidade, descricao);
    }

    @WebMethod(operationName = "buscaCursoDescricaoAreaFormacao")
    public Curso buscaCursoDescricaoAreaFormacao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao, @WebParam(name = "areaFormacao") AreaFormacao areaFormacao) {
        return cursoDAOImpl.getCurso(entidade, descricao, areaFormacao);
    }

    @WebMethod(operationName = "listaCursos")
    public List<Curso> listaCursos(@WebParam(name = "entidade") Entidade entidade) {
        return cursoDAOImpl.listaCursos(entidade);
    }

    @WebMethod(operationName = "listaTopCursos")
    public List<Curso> listaTopCursos(@WebParam(name = "entidade") Entidade entidade) {
        return cursoDAOImpl.listaTopCursos(entidade);
    }

    @WebMethod(operationName = "listaCursosAreaFormacao")
    public List<Curso> listaCursosAreaFormacao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "areaFormacao") AreaFormacao areaFormacao) {
        return cursoDAOImpl.listaCursosAreaFormacao(entidade, areaFormacao);
    }

    @WebMethod(operationName = "persistir_curso")
    public void persistir_curso(@WebParam(name = "curso") Curso curso) {
        cursoDAOImpl.persistir_curso(curso);
    }

    @WebMethod(operationName = "remover_curso")
    public void remover_curso(@WebParam(name = "curso") Curso curso) {
        cursoDAOImpl.remover_curso(curso);
    }

    /*
     ************************** END CURSO ***********************
     **/
    //=========================  DISCIPLINA ==========================
    DisciplinaDAOImpl disciplinaDAOImpl = new DisciplinaDAOImpl();

    @WebMethod(operationName = "buscaDisciplinaId")
    public Disciplina buscaDisciplinaId(@WebParam(name = "id") int id) {
        return disciplinaDAOImpl.getDisciplina(id);
    }

    @WebMethod(operationName = "buscaDisciplinaDescricao")
    public Disciplina buscaDisciplinaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return disciplinaDAOImpl.getDisciplina(entidade, descricao);
    }

    @WebMethod(operationName = "listaDisciplinas")
    public List<Disciplina> listaDisciplinas(@WebParam(name = "entidade") Entidade entidade) {
        return disciplinaDAOImpl.listaDisciplinas(entidade);
    }

    @WebMethod(operationName = "persistir_disciplina")
    public void persistir_disciplina(@WebParam(name = "disciplina") Disciplina disciplina) {
        disciplinaDAOImpl.persistir_disciplina(disciplina);
    }

    @WebMethod(operationName = "remover_disciplina")
    public void remover_disciplina(@WebParam(name = "disciplina") Disciplina disciplina) {
        disciplinaDAOImpl.remover_disciplina(disciplina);
    }

    /*
     ************************** END DISCIPLINA ***********************
     **/
    //=========================  DOCENTE DISCIPLINA ==========================
    DisciplinaDocenteDAOImpl disciplinaDocenteDAOImpl = new DisciplinaDocenteDAOImpl();

    @WebMethod(operationName = "buscaDisciplinaDocenteId")
    public DisciplinaDocente buscaDisciplinaDocenteId(@WebParam(name = "id") int id) {
        return disciplinaDocenteDAOImpl.getDisciplinaDocente(id);
    }

    @WebMethod(operationName = "listaDisciplinasDocentes")
    public List<DisciplinaDocente> listaDisciplinasDocentes(@WebParam(name = "entidade") Entidade entidade) {
        return disciplinaDocenteDAOImpl.listaDisciplinasDocente(entidade);
    }

    @WebMethod(operationName = "listaDisciplinasDocenteDisciplina")
    public List<DisciplinaDocente> listaDisciplinasDocenteDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina) {
        return disciplinaDocenteDAOImpl.listaDisciplinasDocenteDisciplina(entidade, disciplina);
    }

    @WebMethod(operationName = "listaDisciplinasDocentesDocente")
    public List<DisciplinaDocente> listaDisciplinasDocentesDocente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "docente") Docente docente) {
        return disciplinaDocenteDAOImpl.listaDisciplinasDocentesDocente(entidade, docente);
    }

    @WebMethod(operationName = "persistir_disciplinaDocente")
    public void persistir_disciplinaDocente(@WebParam(name = "disciplinaDocente") DisciplinaDocente disciplinaDocente) {
        disciplinaDocenteDAOImpl.persistir_disciplinaDocente(disciplinaDocente);
    }

    @WebMethod(operationName = "remover_disciplinaDocente")
    public void remover_disciplinaDocente(@WebParam(name = "disciplinaDocente") DisciplinaDocente disciplinaDocente) {
        disciplinaDocenteDAOImpl.remover_disciplinaDocente(disciplinaDocente);
    }

    /*
     ************************** END DOCENTE DISCIPLINA ***********************
     **/
    //=========================  CURSO DISCIPLINA ==========================
    DisciplinaCursoDAOImpl disciplinaCursoDAOImpl = new DisciplinaCursoDAOImpl();

    @WebMethod(operationName = "buscaDisciplinaCursoId")
    public DisciplinaCurso buscaDisciplinaCursoId(@WebParam(name = "id") int id) {
        return disciplinaCursoDAOImpl.getDisciplinaCurso(id);
    }

    @WebMethod(operationName = "listaDisciplinasCursos")
    public List<DisciplinaCurso> listaDisciplinasCursos(@WebParam(name = "entidade") Entidade entidade) {
        return disciplinaCursoDAOImpl.listaDisciplinasCurso(entidade);
    }

    @WebMethod(operationName = "listaDisciplinasCursoDisciplina")
    public List<DisciplinaCurso> listaDisciplinasCursoDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina) {
        return disciplinaCursoDAOImpl.listaDisciplinasCursoDisciplina(entidade, disciplina);
    }

    @WebMethod(operationName = "listaDisciplinasCursosCurso")
    public List<DisciplinaCurso> listaDisciplinasCursosCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso) {
        return disciplinaCursoDAOImpl.listaDisciplinasCursosCurso(entidade, curso);
    }

    @WebMethod(operationName = "listaDisciplinasCursosCursoSemestre")
    public List<DisciplinaCurso> listaDisciplinasCursosCursoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "semestre") String semestre) {
        return disciplinaCursoDAOImpl.listaDisciplinasCursosCursoSemestre(entidade, curso, semestre);
    }

    @WebMethod(operationName = "persistir_disciplinaCurso")
    public void persistir_disciplinaCurso(@WebParam(name = "disciplinaCurso") DisciplinaCurso disciplinaCurso) {
        disciplinaCursoDAOImpl.persistir_disciplinaCurso(disciplinaCurso);
    }

    @WebMethod(operationName = "remover_disciplinaCurso")
    public void remover_disciplinaCurso(@WebParam(name = "disciplinaCurso") DisciplinaCurso disciplinaCurso) {
        disciplinaCursoDAOImpl.remover_disciplinaCurso(disciplinaCurso);
    }

    /*
     ************************** END CURSO DISCIPLINA ***********************
     **/
    //======================= DOCENTE ===========================
    DocenteDAOImpl docenteDAOImpl = new DocenteDAOImpl();

    @WebMethod(operationName = "buscaDocenteId")
    public Docente buscaDocenteId(@WebParam(name = "id") int id) {
        return docenteDAOImpl.getDocente(id);
    }

    @WebMethod(operationName = "buscaDocentePessoaId")
    public Docente buscaDocentePessoaId(@WebParam(name = "id") int id) {
        return docenteDAOImpl.getDocentePessoa(id);
    }

    @WebMethod(operationName = "listaDocentes")
    public List<Docente> listaDocentes(@WebParam(name = "entidade") Entidade entidade) {
        return docenteDAOImpl.listaDocentes(entidade);
    }

    @WebMethod(operationName = "listaDocentesProvincia")
    public List<Docente> listaDocentesProvincia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "provincia") String provincia) {
        return docenteDAOImpl.listaDocentes(entidade, provincia);
    }

    @WebMethod(operationName = "persistir_docente")
    public void persistir_docente(@WebParam(name = "docente") Docente docente) {
        docenteDAOImpl.persistir_docente(docente);
    }

    @WebMethod(operationName = "remover_docente")
    public void remover_docente(@WebParam(name = "docente") Docente docente) {
        docenteDAOImpl.remover_docente(docente);
    }
    /**
     * ******************** END DOCENTE *************************
     */

    //=========================  INSCRICAO ==========================
    InscricaoDAOImpl inscricaoDAOImpl = new InscricaoDAOImpl();

    @WebMethod(operationName = "buscaInscricaoId")
    public Inscricao buscaInscricaoId(@WebParam(name = "id") int id) {
        return inscricaoDAOImpl.getInscricao(id);
    }

    @WebMethod(operationName = "buscaInscricaoReferencia")
    public Inscricao buscaInscricaoReferencia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "referencia") String referencia) {
        return inscricaoDAOImpl.getInscricao(entidade, referencia);
    }

    @WebMethod(operationName = "buscaInscricaoAnoLectivoSemestre")
    public Inscricao buscaInscricaoAnoLectivoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "aluno") String semestre, @WebParam(name = "semestre") Aluno aluno) {
        return inscricaoDAOImpl.getInscricaoAnoLectivoSemestre(entidade, anoLectivo, semestre, aluno);
    }

    @WebMethod(operationName = "listaInscricoes")
    public List<Inscricao> listaInscricoes(@WebParam(name = "entidade") Entidade entidade) {
        return inscricaoDAOImpl.listaInscricoes(entidade);
    }

    @WebMethod(operationName = "listaInscricoesOrigem")
    public List<Inscricao> listaInscricoesOrigem(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "origem") String origem) {
        return inscricaoDAOImpl.listaInscricoesOrigem(entidade, origem);
    }

    @WebMethod(operationName = "listaInscricoesCurso")
    public List<Inscricao> listaInscricoesCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso) {
        return inscricaoDAOImpl.listaInscricoesCurso(entidade, curso);
    }

    @WebMethod(operationName = "listaInscricoesMelhoresAno")
    public List<Inscricao> listaInscricoesMelhoresAno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "limite") int limite) {
        return inscricaoDAOImpl.listaInscricoesMelhoresAno(entidade, anoLectivo, limite);
    }

    @WebMethod(operationName = "listaInscricoesAluno")
    public List<Inscricao> listaInscricoesAluno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno) {
        return inscricaoDAOImpl.listaInscricoesAluno(entidade, aluno);
    }

    @WebMethod(operationName = "listaInscricoesTurma")
    public List<Inscricao> listaInscricoesTurma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma) {
        return inscricaoDAOImpl.listaInscricoesTurma(entidade, turma);
    }

    @WebMethod(operationName = "listaInscricoesAnoLectivo")
    public List<Inscricao> listaInscricoesAnoLectivo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo) {
        return inscricaoDAOImpl.listaInscricoesAnoLectivo(entidade, anoLectivo);
    }

    @WebMethod(operationName = "listaInscricoesAno")
    public List<Inscricao> listaInscricoesAno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "ano") String ano) {
        return inscricaoDAOImpl.listaInscricoesAno(entidade, ano);
    }

    @WebMethod(operationName = "persistir_inscricao")
    public void persistir_inscricao(@WebParam(name = "inscricao") Inscricao inscricao) {
        inscricaoDAOImpl.persistir_inscricao(inscricao);
    }

    @WebMethod(operationName = "remover_inscricao")
    public void remover_inscricao(@WebParam(name = "inscricao") Inscricao inscricao) {
        inscricaoDAOImpl.remover_inscricao(inscricao);
    }

    /*
     ************************** END INSCRICAO ***********************
     **/
    //=========================  NOTAS ==========================
    NotasDAOImpl notasDAOImpl = new NotasDAOImpl();

    @WebMethod(operationName = "buscaNotasId")
    public Notas buscaNotasId(@WebParam(name = "id") int id) {
        return notasDAOImpl.getNotas(id);
    }

    @WebMethod(operationName = "buscaNotasDisciplinaAluno")
    public Notas buscaNotasDisciplinaAluno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno, @WebParam(name = "turma") Turma turma, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "semestre") String semestre) {
        return notasDAOImpl.getNotas(entidade, aluno, turma, disciplina, anoLectivo, semestre);
    }

    @WebMethod(operationName = "listaNotas")
    public List<Notas> listaNotas(@WebParam(name = "entidade") Entidade entidade) {
        return notasDAOImpl.listaNotas(entidade);
    }

    @WebMethod(operationName = "listaNotasDisciplina")
    public List<Notas> listaNotasDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina) {
        return notasDAOImpl.listaNotasDisciplina(entidade, disciplina);
    }

    @WebMethod(operationName = "listaNotasAluno")
    public List<Notas> listaNotasAluno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno) {
        return notasDAOImpl.listaNotasAluno(entidade, aluno);
    }

    @WebMethod(operationName = "listaNotasInscricao")
    public List<Notas> listaNotasInscricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "inscricao") Inscricao inscricao) {
        return notasDAOImpl.listaNotasInscricao(entidade, inscricao);
    }

    @WebMethod(operationName = "listaNotasAlunoSemestre")
    public List<Notas> listaNotasAlunoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "semestre") String semestre, @WebParam(name = "aluno") Aluno aluno) {
        return notasDAOImpl.listaNotasAlunoSemestre(entidade, aluno, anoLectivo, semestre);
    }

    @WebMethod(operationName = "listaNotasDisciplinaSemestre")
    public List<Notas> listaNotasDisciplinaSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "semestre") String semestre) {
        return notasDAOImpl.listaNotasDisciplinaSemestre(entidade, turma, disciplina, anoLectivo, semestre);
    }

    @WebMethod(operationName = "listaNotasDisciplinaTurma")
    public List<Notas> listaNotasDisciplinaTurma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo) {
        return notasDAOImpl.listaNotasDisciplinaTurma(entidade, turma, disciplina, anoLectivo);
    }

    @WebMethod(operationName = "listaNotasTurmaSemestre")
    public List<Notas> listaNotasTurmaSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "semestre") String semestre) {
        return notasDAOImpl.listaNotasTurmaSemestre(entidade, turma, anoLectivo, semestre);
    }

    @WebMethod(operationName = "persistir_notas")
    public void persistir_notas(@WebParam(name = "notas") Notas notas) {
        notasDAOImpl.persistir_notas(notas);
    }

    @WebMethod(operationName = "remover_notas")
    public void remover_notas(@WebParam(name = "notas") Notas notas) {
        notasDAOImpl.remover_notas(notas);
    }

    /*
     ************************** END NOTAS ***********************
     **/
    //=========================  TURMA ==========================
    TurmaDAOImpl turmaDAOImpl = new TurmaDAOImpl();

    @WebMethod(operationName = "buscaTurmaId")
    public Turma buscaTurmaId(@WebParam(name = "id") int id) {
        return turmaDAOImpl.getTurma(id);
    }

    @WebMethod(operationName = "buscaTurmaDescricao")
    public Turma buscaTurmaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "descricao") String descricao) {
        return turmaDAOImpl.getTurma(entidade, curso, descricao);
    }

    @WebMethod(operationName = "listaTurmas")
    public List<Turma> listaTurmas(@WebParam(name = "entidade") Entidade entidade) {
        return turmaDAOImpl.listaTurmas(entidade);
    }

    @WebMethod(operationName = "listaTurmasCurso")
    public List<Turma> listaTurmasCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso) {
        return turmaDAOImpl.listaTurmasCurso(entidade, curso);
    }

    @WebMethod(operationName = "listaTurmasEscola")
    public List<Turma> listaTurmasEscola(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola) {
        return turmaDAOImpl.listaTurmasEscola(entidade, escola);
    }

    @WebMethod(operationName = "listaTurmasAnoLectivo")
    public List<Turma> listaTurmasAnoLectivo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "escola") Escola escola, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo) {
        return turmaDAOImpl.listaTurmasAnoLectivo(entidade, escola, anoLectivo);
    }

    @WebMethod(operationName = "persistir_turma")
    public void persistir_turma(@WebParam(name = "turma") Turma turma) {
        turmaDAOImpl.persistir_turma(turma);
    }

    @WebMethod(operationName = "remover_turma")
    public void remover_turma(@WebParam(name = "turma") Turma turma) {
        turmaDAOImpl.remover_turma(turma);
    }

    /*
     ************************** END TURMA  ***********************
     **/
    //=========================  TAXA ==========================
    TaxaDAOImpl taxaDAOImpl = new TaxaDAOImpl();

    @WebMethod(operationName = "buscaTaxaId")
    public Taxa buscaTaxaId(@WebParam(name = "id") int id) {
        return taxaDAOImpl.getTaxa(id);
    }

    @WebMethod(operationName = "buscaTaxaDescricao")
    public Taxa buscaTaxaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return taxaDAOImpl.getTaxa(entidade, descricao);
    }

    @WebMethod(operationName = "listaTaxas")
    public List<Taxa> listaTaxas(@WebParam(name = "entidade") Entidade entidade) {
        return taxaDAOImpl.listaTaxas(entidade);
    }

    @WebMethod(operationName = "persistir_taxa")
    public void persistir_taxa(@WebParam(name = "taxa") Taxa taxa) {
        taxaDAOImpl.persistir_taxa(taxa);
    }

    @WebMethod(operationName = "remover_taxa")
    public void remover_taxa(@WebParam(name = "taxa") Taxa taxa) {
        taxaDAOImpl.remover_taxa(taxa);
    }

    /*
     ************************** END TAXA ***********************
     **/
    //=========================  PRESENCAS ==========================
    PresencasDAOImpl presencasDAOImpl = new PresencasDAOImpl();

    @WebMethod(operationName = "buscaPresencasId")
    public Presencas buscaPresencasId(@WebParam(name = "id") int id) {
        return presencasDAOImpl.getPresencas(id);
    }

    @WebMethod(operationName = "listaPresencas")
    public List<Presencas> listaPresencas(@WebParam(name = "entidade") Entidade entidade) {
        return presencasDAOImpl.listaPresencas(entidade);
    }

    @WebMethod(operationName = "listaPresencasDisciplina")
    public List<Presencas> listaPresencasDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina) {
        return presencasDAOImpl.listaPresencasDisciplina(entidade, disciplina);
    }

    @WebMethod(operationName = "buscaPresencasAlunoDisciplina")
    public Presencas buscaPresencasAlunoDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno, @WebParam(name = "disciplina") Disciplina disciplina) {
        return presencasDAOImpl.getPresencasAlunoDisciplina(entidade, aluno, disciplina);
    }

    @WebMethod(operationName = "listaPresencasAluno")
    public List<Presencas> listaPresencasAluno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno) {
        return presencasDAOImpl.listaPresencasAluno(entidade, aluno);
    }

    @WebMethod(operationName = "listaPresencasPeriodo")
    public List<Presencas> listaPresencasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return presencasDAOImpl.listaPresencasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaPresencasData")
    public List<Presencas> listaPresencasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return presencasDAOImpl.listaPresencasData(entidade, data);
    }

    @WebMethod(operationName = "listaPresencasAlunoPeriodo")
    public List<Presencas> listaPresencasAlunoPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return presencasDAOImpl.listaPresencasAlunoPeriodo(entidade, aluno, p1, p2);
    }

    @WebMethod(operationName = "listaPresencasAlunoData")
    public List<Presencas> listaPresencasAlunoData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno, @WebParam(name = "data") String data) {
        return presencasDAOImpl.listaPresencasAlunoData(entidade, aluno, data);
    }

    @WebMethod(operationName = "listaPresencasTurmaPeriodo")
    public List<Presencas> listaPresencasTurmaPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return presencasDAOImpl.listaPresencasTurmaPeriodo(entidade, turma, p1, p2);
    }

    @WebMethod(operationName = "listaPresencasTurmaData")
    public List<Presencas> listaPresencasTurmaData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "data") String data) {
        return presencasDAOImpl.listaPresencasTurmaData(entidade, turma, data);
    }

    @WebMethod(operationName = "listaPresencasDisciplinaPeriodo")
    public List<Presencas> listaPresencasDisciplinaPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return presencasDAOImpl.listaPresencasDisciplinaPeriodo(entidade, disciplina, p1, p2);
    }

    @WebMethod(operationName = "listaPresencasDisciplinaData")
    public List<Presencas> listaPresencasDisciplinaData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "data") String data) {
        return presencasDAOImpl.listaPresencasDisciplinaData(entidade, disciplina, data);
    }

    @WebMethod(operationName = "persistir_presencas")
    public void persistir_presencas(@WebParam(name = "presencas") Presencas presencas) {
        presencasDAOImpl.persistir_presencas(presencas);
    }

    @WebMethod(operationName = "remover_presencas")
    public void remover_presencas(@WebParam(name = "presencas") Presencas presencas) {
        presencasDAOImpl.remover_presencas(presencas);
    }

    /*
     ************************** END PRESENCAS ***********************
     **/
    //=========================  TURNO ==========================
    TurnoDAOImpl turnoDAOImpl = new TurnoDAOImpl();

    @WebMethod(operationName = "buscaTurnoId")
    public Turno buscaTurnoId(@WebParam(name = "id") int id) {
        return turnoDAOImpl.getTurno(id);
    }

    @WebMethod(operationName = "buscaTurnoDescricao")
    public Turno buscaTurnoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return turnoDAOImpl.getTurno(entidade, descricao);
    }

    @WebMethod(operationName = "listaTurnos")
    public List<Turno> listaTurnos(@WebParam(name = "entidade") Entidade entidade) {
        return turnoDAOImpl.listaTurnos(entidade);
    }

    @WebMethod(operationName = "persistir_turno")
    public void persistir_turno(@WebParam(name = "turno") Turno turno) {
        turnoDAOImpl.persistir_turno(turno);
    }

    @WebMethod(operationName = "remover_turno")
    public void remover_turno(@WebParam(name = "turno") Turno turno) {
        turnoDAOImpl.remover_turno(turno);
    }

    /*
     ************************** END TURNO ***********************
     **/
    //=========================  AVALIACAO ==========================
    AvaliacaoDAOImpl avaliacaoDAOImpl = new AvaliacaoDAOImpl();

    @WebMethod(operationName = "buscaAvaliacaoId")
    public Avaliacao buscaAvaliacaoId(@WebParam(name = "id") int id) {
        return avaliacaoDAOImpl.getAvaliacao(id);
    }

    @WebMethod(operationName = "listaAvaliacoes")
    public List<Avaliacao> listaAvaliacoes(@WebParam(name = "entidade") Entidade entidade) {
        return avaliacaoDAOImpl.listaAvaliacoes(entidade);
    }

    @WebMethod(operationName = "listaAvaliacoesAluno")
    public List<Avaliacao> listaAvaliacoesAluno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno) {
        return avaliacaoDAOImpl.listaAvaliacoesAluno(entidade, aluno);
    }

    @WebMethod(operationName = "listaAvaliacoesInscricaoSemestre")
    public List<Avaliacao> listaAvaliacoesInscricaoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") int anoLectivo, @WebParam(name = "semestre") String semestre, @WebParam(name = "aluno") Aluno aluno) {
        return avaliacaoDAOImpl.listaAvaliacoesAlunoSemestre(entidade, aluno, anoLectivo, semestre);
    }

    @WebMethod(operationName = "persistir_avaliacao")
    public void persistir_avaliacao(@WebParam(name = "avaliacao") Avaliacao avaliacao) {
        avaliacaoDAOImpl.persistir_avaliacao(avaliacao);
    }

    @WebMethod(operationName = "remover_avaliacao")
    public void remover_avaliacao(@WebParam(name = "avaliacao") Avaliacao avaliacao) {
        avaliacaoDAOImpl.remover_avaliacao(avaliacao);
    }

    /*
     ************************** END AVALIACAO ***********************
     **/
    //=========================  VAGAS ==========================
    VagasDAOImpl vagasDAOImpl = new VagasDAOImpl();

    @WebMethod(operationName = "buscaVagasId")
    public Vagas buscaVagasId(@WebParam(name = "id") int id) {
        return vagasDAOImpl.getVagas(id);
    }

    @WebMethod(operationName = "listaVagas")
    public List<Vagas> listaVagas(@WebParam(name = "entidade") Entidade entidade) {
        return vagasDAOImpl.listaVagas(entidade);
    }

    @WebMethod(operationName = "listaVagasCurso")
    public List<Vagas> listaVagasCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso) {
        return vagasDAOImpl.listaVagasCurso(entidade, curso);
    }

    @WebMethod(operationName = "listaVagasAnoLectivo")
    public List<Vagas> listaVagasAnoLectivo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo) {
        return vagasDAOImpl.listaVagasAnoLectivo(entidade, anoLectivo);
    }

    @WebMethod(operationName = "buscaVagasAnoLectivoCurso")
    public Vagas buscaVagasAnoLectivoCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "curso") Curso curso) {
        return vagasDAOImpl.getVagasAnoLectivoCurso(entidade, anoLectivo, curso);
    }

    @WebMethod(operationName = "persistir_vagas")
    public void persistir_vagas(@WebParam(name = "vagas") Vagas vagas) {
        vagasDAOImpl.persistir_vagas(vagas);
    }

    @WebMethod(operationName = "remover_vagas")
    public void remover_vagas(@WebParam(name = "vagas") Vagas vagas) {
        vagasDAOImpl.remover_vagas(vagas);
    }

    /*
     ************************** END VAGAS ***********************
     **/
    //=========================  MEDIA ==========================
    MediaDAOImpl mediaDAOImpl = new MediaDAOImpl();

    @WebMethod(operationName = "buscaMediaId")
    public Media buscaMediaId(@WebParam(name = "id") int id) {
        return mediaDAOImpl.getMedia(id);
    }

    @WebMethod(operationName = "buscaMedia")
    public Media buscaMedia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Aluno aluno, @WebParam(name = "aluno") Disciplina disciplina) {
        return mediaDAOImpl.getMedia(entidade, aluno, disciplina, anoLectivo);
    }

    @WebMethod(operationName = "listaMedias")
    public List<Media> listaMedias(@WebParam(name = "entidade") Entidade entidade) {
        return mediaDAOImpl.listaMedias(entidade);
    }

    @WebMethod(operationName = "listaMediasDisciplina")
    public List<Media> listaMediasDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina) {
        return mediaDAOImpl.listaMediasDisciplina(entidade, disciplina);
    }

    @WebMethod(operationName = "listaMediasTurmaDisciplina")
    public List<Media> listaMediasTurmaDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "disciplina") Disciplina disciplina) {
        return mediaDAOImpl.listaMediasTurmaDisciplina(entidade, turma, disciplina);
    }

    @WebMethod(operationName = "listaMediasTurmaDisciplinaApurados")
    public List<Media> listaMediasTurmaDisciplinaApurados(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma, @WebParam(name = "disciplina") Disciplina disciplina) {
        return mediaDAOImpl.listaMediasTurmaDisciplinaApurados(entidade, turma, disciplina);
    }

    @WebMethod(operationName = "listaMediasAluno")
    public List<Media> listaMediasAluno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno) {
        return mediaDAOImpl.listaMediasAluno(entidade, aluno);
    }

    @WebMethod(operationName = "listaMediasInscricao")
    public List<Media> listaMediasInscricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "inscricao") Inscricao inscricao) {
        return mediaDAOImpl.listaMediasInscricao(entidade, inscricao);
    }

    @WebMethod(operationName = "listaMediasAlunoSemestre")
    public List<Media> listaMediasAlunoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") int anoLectivo, @WebParam(name = "semestre") String semestre, @WebParam(name = "aluno") Aluno aluno) {
        return mediaDAOImpl.listaMediasAlunoSemestre(entidade, aluno, anoLectivo, semestre);
    }

    @WebMethod(operationName = "persistir_media")
    public void persistir_media(@WebParam(name = "media") Media media) {
        mediaDAOImpl.persistir_media(media);
    }

    @WebMethod(operationName = "remover_media")
    public void remover_media(@WebParam(name = "media") Media media) {
        mediaDAOImpl.remover_media(media);
    }

    /*
     ************************** END MEDIA ***********************
     **/
    //=========================  EXAME ==========================
    ExameDAOImpl exameDAOImpl = new ExameDAOImpl();

    @WebMethod(operationName = "buscaExameId")
    public Exame buscaExameId(@WebParam(name = "id") int id) {
        return exameDAOImpl.getExame(id);
    }

    @WebMethod(operationName = "buscaExame")
    public Exame buscaExame(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "semestre") String semestre, @WebParam(name = "disciplina") Aluno aluno, @WebParam(name = "aluno") Disciplina disciplina) {
        return exameDAOImpl.getExame(entidade, aluno, disciplina, anoLectivo, semestre);
    }

    @WebMethod(operationName = "listaExames")
    public List<Exame> listaExames(@WebParam(name = "entidade") Entidade entidade) {
        return exameDAOImpl.listaExames(entidade);
    }

    @WebMethod(operationName = "listaExamesDisciplina")
    public List<Exame> listaExamesDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina) {
        return exameDAOImpl.listaExamesDisciplina(entidade, disciplina);
    }

    @WebMethod(operationName = "listaExamesSala")
    public List<Exame> listaExamesSala(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "salaExame") SalaExame salaExame) {
        return exameDAOImpl.listaExamesSala(entidade, salaExame);
    }

    @WebMethod(operationName = "listaExamesAluno")
    public List<Exame> listaExamesAluno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "aluno") Aluno aluno) {
        return exameDAOImpl.listaExamesAluno(entidade, aluno);
    }

    @WebMethod(operationName = "listaExamesInscricao")
    public List<Exame> listaExamesInscricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "inscricao") Inscricao inscricao) {
        return exameDAOImpl.listaExamesInscricao(entidade, inscricao);
    }

    @WebMethod(operationName = "listaExamesAlunoSemestre")
    public List<Exame> listaExamesAlunoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") int anoLectivo, @WebParam(name = "semestre") String semestre, @WebParam(name = "aluno") Aluno aluno) {
        return exameDAOImpl.listaExamesAlunoSemestre(entidade, aluno, anoLectivo, semestre);
    }

    @WebMethod(operationName = "persistir_exame")
    public void persistir_exame(@WebParam(name = "exame") Exame exame) {
        exameDAOImpl.persistir_exame(exame);
    }

    @WebMethod(operationName = "remover_exame")
    public void remover_exame(@WebParam(name = "exame") Exame exame) {
        exameDAOImpl.remover_exame(exame);
    }

    /*
     ************************** END EXAME ***********************
     **/
    //=========================  CALENDARIO ==========================
    CalendarioDAOImpl calendarioDAOImpl = new CalendarioDAOImpl();

    @WebMethod(operationName = "buscaCalendarioId")
    public Calendario buscaCalendarioId(@WebParam(name = "id") int id) {
        return calendarioDAOImpl.getCalendario(id);
    }

    @WebMethod(operationName = "buscaCalendarioTodosCriterios")
    public Calendario buscaCalendarioTodosCriterios(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "semestre") String semestre, @WebParam(name = "turma") Turma turma, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Disciplina disciplina) {
        return calendarioDAOImpl.getCalendario(entidade, semestre, curso, turma, anoLectivo, disciplina);
    }

    @WebMethod(operationName = "listaCalendario")
    public List<Calendario> listaCalendario(@WebParam(name = "entidade") Entidade entidade) {
        return calendarioDAOImpl.listaCalendario(entidade);
    }

    @WebMethod(operationName = "listaCalendarioDisciplina")
    public List<Calendario> listaCalendarioDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "disciplina") Disciplina disciplina) {
        return calendarioDAOImpl.listaCalendarioDisciplina(entidade, curso, disciplina);
    }

    @WebMethod(operationName = "listaCalendarioTurma")
    public List<Calendario> listaCalendarioTurma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "turma") Turma turma) {
        return calendarioDAOImpl.listaCalendarioTurma(entidade, curso, turma);
    }

    @WebMethod(operationName = "listaCalendarioCursoSemestre")
    public List<Calendario> listaCalendarioCursoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "semestre") String semestre) {
        return calendarioDAOImpl.listaCalendarioCursoSemestre(entidade, curso, semestre);
    }

    @WebMethod(operationName = "listaCalendarioTurmaSemestre")
    public List<Calendario> listaCalendarioTurmaSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "semestre") String semestre, @WebParam(name = "turma") Turma turma) {
        return calendarioDAOImpl.listaCalendarioTurmaSemestre(entidade, curso, turma, anoLectivo, semestre);
    }

    @WebMethod(operationName = "persistir_calendario")
    public void persistir_calendario(@WebParam(name = "calendario") Calendario calendario) {
        calendarioDAOImpl.persistir_calendario(calendario);
    }

    @WebMethod(operationName = "remover_calendario")
    public void remover_calendario(@WebParam(name = "calendario") Calendario calendario) {
        calendarioDAOImpl.remover_calendario(calendario);
    }

    /*
     ************************** END CALENDARIO ***********************
     **/
    //=========================  AREA FORMACAO ==========================
    AreaFormacaoDAOImpl areaFormacaoDAOImpl = new AreaFormacaoDAOImpl();

    @WebMethod(operationName = "buscaAreaFormacaoId")
    public AreaFormacao buscaAreaFormacaoId(@WebParam(name = "id") int id) {
        return areaFormacaoDAOImpl.getAreaFormacao(id);
    }

    @WebMethod(operationName = "buscaAreaFormacaoDescricao")
    public AreaFormacao buscaAreaFormacaoDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return areaFormacaoDAOImpl.getAreaFormacao(entidade, descricao);
    }

    @WebMethod(operationName = "listaAreasFormacao")
    public List<AreaFormacao> listaAreasFormacao(@WebParam(name = "entidade") Entidade entidade) {
        return areaFormacaoDAOImpl.listaAreasFormacao(entidade);
    }

    @WebMethod(operationName = "persistir_areaFormacao")
    public void persistir_areaFormacao(@WebParam(name = "areaFormacao") AreaFormacao areaFormacao) {
        areaFormacaoDAOImpl.persistir_areaFormacao(areaFormacao);
    }

    @WebMethod(operationName = "remover_areaFormacao")
    public void remover_areaFormacao(@WebParam(name = "areaFormacao") AreaFormacao areaFormacao) {
        areaFormacaoDAOImpl.remover_areaFormacao(areaFormacao);
    }

    /*
     ************************** END AREA FORMACAO ***********************
     **/
    //=========================  MODULO ==========================
    ModuloDAOImpl moduloDAOImpl = new ModuloDAOImpl();

    @WebMethod(operationName = "buscaModuloId")
    public Modulo buscaModuloId(@WebParam(name = "id") int id) {
        return moduloDAOImpl.getModulo(id);
    }

    @WebMethod(operationName = "buscaModuloDescricao")
    public Modulo buscaModuloDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return moduloDAOImpl.getModulo(entidade, descricao);
    }

    @WebMethod(operationName = "buscaModuloDescricaoCurso")
    public Modulo buscaModuloDescricaoCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao, @WebParam(name = "curso") Curso curso) {
        return moduloDAOImpl.getModulo(entidade, descricao, curso);
    }

    @WebMethod(operationName = "listaModulos")
    public List<Modulo> listaModulos(@WebParam(name = "entidade") Entidade entidade) {
        return moduloDAOImpl.listaModulos(entidade);
    }

    @WebMethod(operationName = "listaModulosCurso")
    public List<Modulo> listaModulosCurso(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso) {
        return moduloDAOImpl.listaModulosCurso(entidade, curso);
    }

    @WebMethod(operationName = "persistir_modulo")
    public void persistir_modulo(@WebParam(name = "modulo") Modulo modulo) {
        moduloDAOImpl.persistir_modulo(modulo);
    }

    @WebMethod(operationName = "remover_modulo")
    public void remover_modulo(@WebParam(name = "modulo") Modulo modulo) {
        moduloDAOImpl.remover_modulo(modulo);
    }

    /*
     ************************** END MODULO ***********************
     **/
    //=========================  PARCEIRO ==========================
    ParceiroDAOImpl parceiroDAOImpl = new ParceiroDAOImpl();

    @WebMethod(operationName = "buscaParceiroId")
    public Parceiro buscaParceiroId(@WebParam(name = "id") int id) {
        return parceiroDAOImpl.getParceiro(id);
    }

    @WebMethod(operationName = "buscaParceiroDescricao")
    public Parceiro buscaParceiroDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return parceiroDAOImpl.getParceiro(entidade, descricao);
    }

    @WebMethod(operationName = "listaParceiros")
    public List<Parceiro> listaParceiros(@WebParam(name = "entidade") Entidade entidade) {
        return parceiroDAOImpl.listaParceiros(entidade);
    }

    @WebMethod(operationName = "persistir_parceiro")
    public void persistir_parceiro(@WebParam(name = "parceiro") Parceiro parceiro) {
        parceiroDAOImpl.persistir_parceiro(parceiro);
    }

    @WebMethod(operationName = "remover_parceiro")
    public void remover_parceiro(@WebParam(name = "parceiro") Parceiro parceiro) {
        parceiroDAOImpl.remover_parceiro(parceiro);
    }

    /*
     ************************** END PARCEIRO ***********************
     **/
    //=========================  AREA ==========================
    AreaDAOImpl areaDAOImpl = new AreaDAOImpl();

    @WebMethod(operationName = "buscaAreaId")
    public Area buscaAreaId(@WebParam(name = "id") int id) {
        return areaDAOImpl.getArea(id);
    }

    @WebMethod(operationName = "buscaAreaDescricao")
    public Area buscaAreaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return areaDAOImpl.getArea(entidade, descricao);
    }

    @WebMethod(operationName = "listaAreas")
    public List<Area> listaAreas(@WebParam(name = "entidade") Entidade entidade) {
        return areaDAOImpl.listaAreas(entidade);
    }

    @WebMethod(operationName = "persistir_area")
    public void persistir_area(@WebParam(name = "area") Area area) {
        areaDAOImpl.persistir_area(area);
    }

    @WebMethod(operationName = "remover_area")
    public void remover_area(@WebParam(name = "area") Area area) {
        areaDAOImpl.remover_area(area);
    }

    /*
     ************************** END AREA ***********************
     **/
    //=========================  DOCENTE TURMA ==========================
    DocenteTurmaDAOImpl docenteTurmaDAOImpl = new DocenteTurmaDAOImpl();

    @WebMethod(operationName = "buscaDocenteTurmaId")
    public DocenteTurma buscaDocenteTurmaId(@WebParam(name = "id") int id) {
        return docenteTurmaDAOImpl.getDocenteTurma(id);
    }

    @WebMethod(operationName = "listaDocentesTurmas")
    public List<DocenteTurma> listaDocentesTurmas(@WebParam(name = "entidade") Entidade entidade) {
        return docenteTurmaDAOImpl.listaDocentesTurmas(entidade);
    }

    @WebMethod(operationName = "listaDocentesTurmasTurma")
    public List<DocenteTurma> listaDocentesTurmasTurma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma) {
        return docenteTurmaDAOImpl.listaDocentesTurmasTurma(entidade, turma);
    }

    @WebMethod(operationName = "listaDocentesTurmasDocente")
    public List<DocenteTurma> listaDocentesTurmasDocente(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "docente") Docente docente) {
        return docenteTurmaDAOImpl.listaDocentesTurmasDocente(entidade, docente);
    }

    @WebMethod(operationName = "persistir_docenteTurma")
    public void persistir_docenteTurma(@WebParam(name = "docenteTurma") DocenteTurma docenteTurma) {
        docenteTurmaDAOImpl.persistir_docenteTurma(docenteTurma);
    }

    @WebMethod(operationName = "remover_docenteTurma")
    public void remover_docenteTurma(@WebParam(name = "docenteTurma") DocenteTurma docenteTurma) {
        docenteTurmaDAOImpl.remover_docenteTurma(docenteTurma);
    }

    /*
     ************************** END DOCENTE TURMA ***********************
     **/
    //=========================  AGENDA ==========================
    AgendaDAOImpl agendaDAOImpl = new AgendaDAOImpl();

    @WebMethod(operationName = "buscaAgendaId")
    public Agenda buscaAgendaId(@WebParam(name = "id") int id) {
        return agendaDAOImpl.getAgenda(id);
    }

    @WebMethod(operationName = "buscaAgendaTodosCriterios")
    public Agenda buscaAgendaTodosCriterios(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "diaSemana") String diaSemana, @WebParam(name = "horario") String horario, @WebParam(name = "semestre") String semestre, @WebParam(name = "turma") Turma turma, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Disciplina disciplina) {
        return agendaDAOImpl.getAgenda(entidade, diaSemana, horario, semestre, turma, anoLectivo, disciplina);
    }

    @WebMethod(operationName = "listaAgenda")
    public List<Agenda> listaAgenda(@WebParam(name = "entidade") Entidade entidade) {
        return agendaDAOImpl.listaAgenda(entidade);
    }

    @WebMethod(operationName = "listaAgendaDisciplina")
    public List<Agenda> listaAgendaDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "disciplina") Disciplina disciplina) {
        return agendaDAOImpl.listaAgendaDisciplina(entidade, disciplina);
    }

    @WebMethod(operationName = "listaAgendaTurma")
    public List<Agenda> listaAgendaTurma(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "turma") Turma turma) {
        return agendaDAOImpl.listaAgendaTurma(entidade, turma);
    }

    @WebMethod(operationName = "listaAgendaCursoSemestre")
    public List<Agenda> listaAgendaCursoSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "semestre") String semestre) {
        return agendaDAOImpl.listaAgendaCursoSemestre(entidade, curso, semestre);
    }

    @WebMethod(operationName = "listaAgendaTurmaSemestre")
    public List<Agenda> listaAgendaTurmaSemestre(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "semestre") String semestre, @WebParam(name = "turma") Turma turma) {
        return agendaDAOImpl.listaAgendaTurmaSemestre(entidade, turma, anoLectivo, semestre);
    }

    @WebMethod(operationName = "persistir_agenda")
    public void persistir_agenda(@WebParam(name = "agenda") Agenda agenda) {
        agendaDAOImpl.persistir_agenda(agenda);
    }

    @WebMethod(operationName = "remover_agenda")
    public void remover_agenda(@WebParam(name = "agenda") Agenda agenda) {
        agendaDAOImpl.remover_agenda(agenda);
    }

    /*
     ************************** END AGENDA ***********************
     **/
    //=========================  ESCOLA ==========================
    EscolaDAOImpl escolaDAOImpl = new EscolaDAOImpl();

    @WebMethod(operationName = "buscaEscolaId")
    public Escola buscaEscolaId(@WebParam(name = "id") int id) {
        return escolaDAOImpl.getEscola(id);
    }

    @WebMethod(operationName = "buscaEscola")
    public Escola buscaEscola(@WebParam(name = "codEscola") String codEscola) {
        return escolaDAOImpl.getEscola(codEscola);
    }

    @WebMethod(operationName = "buscaEscolaDescricao")
    public Escola buscaEscolaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao, @WebParam(name = "provincia") String provincia) {
        return escolaDAOImpl.getEscola(entidade, provincia, descricao);
    }

    @WebMethod(operationName = "listaEscolas")
    public List<Escola> listaEscolas(@WebParam(name = "entidade") Entidade entidade) {
        return escolaDAOImpl.listaEscolas(entidade);
    }

    @WebMethod(operationName = "listaEscolasProvincia")
    public List<Escola> listaEscolasProvincia(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "provincia") String provincia) {
        return escolaDAOImpl.listaEscolasProvincia(entidade, provincia);
    }

    @WebMethod(operationName = "persistir_escola")
    public void persistir_escola(@WebParam(name = "escola") Escola escola) {
        escolaDAOImpl.persistir_escola(escola);
    }

    @WebMethod(operationName = "remover_escola")
    public void remover_escola(@WebParam(name = "escola") Escola escola) {
        escolaDAOImpl.remover_escola(escola);
    }

    /*
     ************************** END ESCOLA ***********************
     **/
    //=========================  SALA ==========================
    SalaDAOImpl salaDAOImpl = new SalaDAOImpl();

    @WebMethod(operationName = "buscaSalaId")
    public Sala buscaSalaId(@WebParam(name = "id") int id) {
        return salaDAOImpl.getSala(id);
    }

    @WebMethod(operationName = "buscaSalaDescricao")
    public Sala buscaSalaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "descricao") String descricao) {
        return salaDAOImpl.getSala(entidade, descricao);
    }

    @WebMethod(operationName = "listaSalas")
    public List<Sala> listaSalas(@WebParam(name = "entidade") Entidade entidade) {
        return salaDAOImpl.listaSalas(entidade);
    }

    @WebMethod(operationName = "persistir_sala")
    public void persistir_sala(@WebParam(name = "sala") Sala sala) {
        salaDAOImpl.persistir_sala(sala);
    }

    @WebMethod(operationName = "remover_sala")
    public void remover_sala(@WebParam(name = "sala") Sala sala) {
        salaDAOImpl.remover_sala(sala);
    }

    /*
     ************************** END SALA ***********************
     **/
    //=========================  APROVEITAMENTO ==========================
    AproveitamentoDAOImpl aproveitamentoDAOImpl = new AproveitamentoDAOImpl();

    @WebMethod(operationName = "buscaAproveitamentoId")
    public Aproveitamento buscaAproveitamentoId(@WebParam(name = "id") int id) {
        return aproveitamentoDAOImpl.getAproveitamento(id);
    }

    @WebMethod(operationName = "buscaAproveitamentoAno")
    public Aproveitamento buscaAproveitamentoAno(@WebParam(name = "codEscola") String codEscola, @WebParam(name = "classe") String classe, @WebParam(name = "ano") String ano) {
        return aproveitamentoDAOImpl.getAproveitamento(codEscola, classe, ano);
    }

    @WebMethod(operationName = "listaAproveitamentos")
    public List<Aproveitamento> listaAproveitamentos(@WebParam(name = "entidade") String codEscola) {
        return aproveitamentoDAOImpl.listaAproveitamentos(codEscola);
    }

    @WebMethod(operationName = "listaAproveitamentosAno")
    public List<Aproveitamento> listaAproveitamentosAno(@WebParam(name = "entidade") String codEscola, @WebParam(name = "ano") String ano) {
        return aproveitamentoDAOImpl.listaAproveitamentosAno(codEscola, ano);
    }

    @WebMethod(operationName = "persistir_aproveitamento")
    public void persistir_aproveitamento(@WebParam(name = "aproveitamento") Aproveitamento aproveitamento) {
        aproveitamentoDAOImpl.persistir_aproveitamento(aproveitamento);
    }

    /*
     ************************** END APROVEITAMENTO ***********************
     **/
    //=========================  FALTA ==========================
    FaltaDAOImpl faltaDAOImpl = new FaltaDAOImpl();

    @WebMethod(operationName = "buscaFaltaId")
    public Falta buscaFaltaId(@WebParam(name = "id") int id) {
        return faltaDAOImpl.getFalta(id);
    }

    @WebMethod(operationName = "buscaFaltaAno")
    public Falta buscaFaltaAno(@WebParam(name = "codEscola") String codEscola, @WebParam(name = "ano") String ano) {
        return faltaDAOImpl.getFalta(codEscola, ano);
    }

    @WebMethod(operationName = "listaFaltas")
    public List<Falta> listaFaltas(@WebParam(name = "codEscola") String codEscola) {
        return faltaDAOImpl.listaFaltas(codEscola);
    }

    @WebMethod(operationName = "listaFaltasAno")
    public List<Falta> listaFaltasAno(@WebParam(name = "codEscola") String codEscola, @WebParam(name = "ano") String ano) {
        return faltaDAOImpl.listaFaltasAno(codEscola, ano);
    }

    @WebMethod(operationName = "persistir_falta")
    public void persistir_falta(@WebParam(name = "falta") Falta falta) {
        faltaDAOImpl.persistir_falta(falta);
    }

    /*
     ************************** END FALTA ***********************
     **/
    //=========================  MATRICULA ==========================
    MatriculaDAOImpl matriculaDAOImpl = new MatriculaDAOImpl();

    @WebMethod(operationName = "buscaMatriculaId")
    public Matricula buscaMatriculaId(@WebParam(name = "id") int id) {
        return matriculaDAOImpl.getMatricula(id);
    }

    @WebMethod(operationName = "buscaMatriculaAno")
    public Matricula buscaMatriculaAno(@WebParam(name = "codEscola") String codEscola, @WebParam(name = "ano") String ano, @WebParam(name = "classe") String classe) {
        return matriculaDAOImpl.getMatricula(codEscola, ano, classe);
    }

    @WebMethod(operationName = "listaMatriculas")
    public List<Matricula> listaMatriculas(@WebParam(name = "codEscola") String codEscola) {
        return matriculaDAOImpl.listaMatriculas(codEscola);
    }

    @WebMethod(operationName = "listaMatriculasAno")
    public List<Matricula> listaMatriculasAno(@WebParam(name = "codEscola") String codEscola, @WebParam(name = "ano") String ano) {
        return matriculaDAOImpl.listaMatriculasAno(codEscola, ano);
    }

    @WebMethod(operationName = "persistir_matricula")
    public void persistir_matricula(@WebParam(name = "matricula") Matricula matricula) {
        matriculaDAOImpl.persistir_matricula(matricula);
    }

    /*
     ************************** END MATRICULA ***********************
     **/
    //=========================  TEMA ==========================
    TemaDAOImpl temaDAOImpl = new TemaDAOImpl();

    @WebMethod(operationName = "buscaTemaId")
    public Tema buscaTemaId(@WebParam(name = "id") int id) {
        return temaDAOImpl.getTema(id);
    }

    @WebMethod(operationName = "buscaTemaDescricao")
    public Tema buscaTemaDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "descricao") String descricao) {
        return temaDAOImpl.getTema(entidade, curso, disciplina, descricao);
    }

    @WebMethod(operationName = "listaTemas")
    public List<Tema> listaTemas(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "disciplina") Disciplina disciplina) {
        return temaDAOImpl.listaTemas(entidade, curso, disciplina);
    }

    @WebMethod(operationName = "persistir_tema")
    public void persistir_tema(@WebParam(name = "tema") Tema tema) {
        temaDAOImpl.persistir_tema(tema);
    }

    @WebMethod(operationName = "remover_tema")
    public void remover_tema(@WebParam(name = "tema") Tema tema) {
        temaDAOImpl.remover_tema(tema);
    }

    /*
     ************************** END TEMA ***********************
     **/
    //=========================  SALA EXAME ==========================
    SalaExameDAOImpl salaExameDAOImpl = new SalaExameDAOImpl();

    @WebMethod(operationName = "buscaSalaExameId")
    public SalaExame buscaSalaExameId(@WebParam(name = "id") int id) {
        return salaExameDAOImpl.getSalaExame(id);
    }

    @WebMethod(operationName = "buscaSalaExameTodosCriterios")
    public SalaExame buscaSalaExameTodosCriterios(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "sala") Sala sala, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Disciplina disciplina) {
        return salaExameDAOImpl.getSalaExame(entidade, curso, sala, anoLectivo, disciplina);
    }

    @WebMethod(operationName = "listaSalaExame")
    public List<SalaExame> listaSalaExame(@WebParam(name = "entidade") Entidade entidade) {
        return salaExameDAOImpl.listaSalaExame(entidade);
    }

    @WebMethod(operationName = "listaSalaExameSala")
    public List<SalaExame> listaSalaExameSala(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "sala") Sala sala) {
        return salaExameDAOImpl.listaSalaExameSala(entidade, curso, sala);
    }

    @WebMethod(operationName = "listaSalaExameCursoAno")
    public List<SalaExame> listaSalaExameCursoAno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo) {
        return salaExameDAOImpl.listaSalaExameCursoAno(entidade, curso, anoLectivo);
    }

    @WebMethod(operationName = "listaSalaExameAno")
    public List<SalaExame> listaSalaExameAno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "sala") Sala sala) {
        return salaExameDAOImpl.listaSalaExameAno(entidade, sala, anoLectivo);
    }

    @WebMethod(operationName = "listaSalaExameDisciplina")
    public List<SalaExame> listaSalaExameDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Disciplina disciplina) {
        return salaExameDAOImpl.listaSalaExameDisciplina(entidade, curso, disciplina, anoLectivo);
    }

    @WebMethod(operationName = "persistir_salaExame")
    public void persistir_salaExame(@WebParam(name = "salaExame") SalaExame salaExame) {
        salaExameDAOImpl.persistir_salaExame(salaExame);
    }

    @WebMethod(operationName = "remover_salaExame")
    public void remover_salaExame(@WebParam(name = "salaExame") SalaExame salaExame) {
        salaExameDAOImpl.remover_salaExame(salaExame);
    }

    /*
     ************************** END SALA EXAME ***********************
     **/
    //=========================  CALENDARIO EXAME ==========================
    CalendarioExameDAOImpl calendarioExameDAOImpl = new CalendarioExameDAOImpl();

    @WebMethod(operationName = "buscaCalendarioExameId")
    public CalendarioExame buscaCalendarioExameId(@WebParam(name = "id") int id) {
        return calendarioExameDAOImpl.getCalendarioExame(id);
    }

    @WebMethod(operationName = "buscaCalendarioExameTodosCriterios")
    public CalendarioExame buscaCalendarioExameTodosCriterios(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Disciplina disciplina) {
        return calendarioExameDAOImpl.getCalendarioExame(entidade, curso, anoLectivo, disciplina);
    }

    @WebMethod(operationName = "listaCalendarioExame")
    public List<CalendarioExame> listaCalendarioExame(@WebParam(name = "entidade") Entidade entidade) {
        return calendarioExameDAOImpl.listaCalendarioExame(entidade);
    }

    @WebMethod(operationName = "listaCalendarioExameDisciplina")
    public List<CalendarioExame> listaCalendarioExameDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "disciplina") Disciplina disciplina) {
        return calendarioExameDAOImpl.listaCalendarioExameDisciplina(entidade, curso, disciplina);
    }

    @WebMethod(operationName = "listaCalendarioExameAno")
    public List<CalendarioExame> listaCalendarioExameAno(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo) {
        return calendarioExameDAOImpl.listaCalendarioExameAno(entidade, curso, anoLectivo);
    }

    @WebMethod(operationName = "persistir_calendarioExame")
    public void persistir_calendarioExame(@WebParam(name = "calendarioExame") CalendarioExame calendarioExame) {
        calendarioExameDAOImpl.persistir_calendarioExame(calendarioExame);
    }

    @WebMethod(operationName = "remover_calendarioExame")
    public void remover_calendarioExame(@WebParam(name = "calendarioExame") CalendarioExame calendarioExame) {
        calendarioExameDAOImpl.remover_calendarioExame(calendarioExame);
    }

    /*
     ************************** END CALENDARIO EXAME ***********************
     **/
    //=========================  RESPOSTA ==========================
    RespostaDAOImpl respostaDAOImpl = new RespostaDAOImpl();

    @WebMethod(operationName = "buscaRespostaId")
    public Resposta buscaRespostaId(@WebParam(name = "id") int id) {
        return respostaDAOImpl.getResposta(id);
    }

    @WebMethod(operationName = "buscaRespostaTodosCriterios")
    public Resposta buscaRespostaTodosCriterios(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "categoria") String categoria, @WebParam(name = "pergunta") String pergunta) {
        return respostaDAOImpl.getResposta(entidade, curso, anoLectivo, disciplina, categoria, pergunta);
    }

    @WebMethod(operationName = "listaResposta")
    public List<Resposta> listaResposta(@WebParam(name = "entidade") Entidade entidade) {
        return respostaDAOImpl.listaResposta(entidade);
    }

    @WebMethod(operationName = "listaRespostaDisciplina")
    public List<Resposta> listaRespostaDisciplina(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "anoLectivo") AnoLectivo anoLectivo, @WebParam(name = "disciplina") Disciplina disciplina) {
        return respostaDAOImpl.listaRespostaDisciplina(entidade, curso, disciplina, anoLectivo);
    }

    @WebMethod(operationName = "persistir_resposta")
    public void persistir_resposta(@WebParam(name = "resposta") Resposta resposta) {
        respostaDAOImpl.persistir_resposta(resposta);
    }

    @WebMethod(operationName = "remover_resposta")
    public void remover_resposta(@WebParam(name = "resposta") Resposta resposta) {
        respostaDAOImpl.remover_resposta(resposta);
    }

    /*
     ************************** END RESPOSTA ***********************
     **/
    //=========================  SUMARIO ==========================
    SumarioDAOImpl sumarioDAOImpl = new SumarioDAOImpl();

    @WebMethod(operationName = "buscaSumarioId")
    public Sumario buscaSumarioId(@WebParam(name = "id") int id) {
        return sumarioDAOImpl.getSumario(id);
    }

    @WebMethod(operationName = "buscaSumarioDescricao")
    public Sumario buscaSumarioDescricao(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "disciplina") Disciplina disciplina, @WebParam(name = "descricao") String descricao) {
        return sumarioDAOImpl.getSumario(entidade, curso, disciplina, descricao);
    }

    @WebMethod(operationName = "listaSumarios")
    public List<Sumario> listaSumarios(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "curso") Curso curso, @WebParam(name = "disciplina") Disciplina disciplina) {
        return sumarioDAOImpl.listaSumarios(entidade, curso, disciplina);
    }

    @WebMethod(operationName = "persistir_sumario")
    public void persistir_sumario(@WebParam(name = "sumario") Sumario sumario) {
        sumarioDAOImpl.persistir_sumario(sumario);
    }

    @WebMethod(operationName = "remover_sumario")
    public void remover_sumario(@WebParam(name = "sumario") Sumario sumario) {
        sumarioDAOImpl.remover_sumario(sumario);
    }

    /*
     ************************** END SUMARIO ***********************
     **/
    //=========================   TRANSFERENCIA ==========================
    TransferenciaDAOImpl transferenciaDAOImpl = new TransferenciaDAOImpl();

    @WebMethod(operationName = "buscaTransferenciaId")
    public Transferencia buscaTransferenciaId(@WebParam(name = "id") int id) {
        return transferenciaDAOImpl.getTransferencia(id);
    }

    @WebMethod(operationName = "listaTransferencias")
    public List<Transferencia> listaTransferencias(@WebParam(name = "entidade") Entidade entidade) {
        return transferenciaDAOImpl.listaTransferencias(entidade);
    }

    @WebMethod(operationName = "listaTransferenciasPeriodo")
    public List<Transferencia> listaTransferenciasPeriodo(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "p1") String p1, @WebParam(name = "p2") String p2) {
        return transferenciaDAOImpl.listaTransferenciasPeriodo(entidade, p1, p2);
    }

    @WebMethod(operationName = "listaTransferenciasData")
    public List<Transferencia> listaTransferenciasData(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "data") String data) {
        return transferenciaDAOImpl.listaTransferenciasData(entidade, data);
    }

    @WebMethod(operationName = "listaTransferenciasOrigemStatus")
    public List<Transferencia> listaTransferenciasOrigemStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status) {
        return transferenciaDAOImpl.listaTransferenciasOrigemStatus(entidade, status);
    }

    @WebMethod(operationName = "listaTransferenciasDestinoStatus")
    public List<Transferencia> listaTransferenciasDestinoStatus(@WebParam(name = "entidade") Entidade entidade, @WebParam(name = "status") String status) {
        return transferenciaDAOImpl.listaTransferenciasDestinoStatus(entidade, status);
    }

    @WebMethod(operationName = "persistir_transferencia")
    public void persistir_transferencia(@WebParam(name = "transferencia") Transferencia transferencia) {
        transferenciaDAOImpl.persistir_transferencia(transferencia);
    }

    @WebMethod(operationName = "remover_transferencia")
    public void remover_transferencia(@WebParam(name = "transferencia") Transferencia transferencia) {
        transferenciaDAOImpl.remover_transferencia(transferencia);
    }

    /*
     ************************** END  TRANSFERENCIA ***********************
     **/
}
