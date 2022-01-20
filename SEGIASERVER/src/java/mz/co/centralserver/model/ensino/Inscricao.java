/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ensino;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "inscricao")
public class Inscricao implements Serializable {

    @Id
    @GeneratedValue
    private int insc_id;

    private String insc_anoLectivo;

    private String insc_turno;

    private String insc_semestre;

    private String insc_origem;

    private String insc_condicao;

    private String insc_categoria;

    private String insc_nrTransfercia;

    private String insc_referencia;

    private boolean insc_activa;

    private boolean insc_regular;

    private boolean insc_certificado;

    private boolean insc_copiaBI;

    private boolean insc_fotos;

    private String insc_comp1;
    private String insc_comp2;
    private String insc_comp3;
    private String insc_comp4;

    private int insc_faltas;
    private int insc_faltasJustificadas;

    private boolean insc_ppf;
    
    private float insc_notaFinal;

    @ManyToOne
    private AnoLectivo anoLectivo;

    @ManyToOne
    private Turma turma;

    @ManyToOne
    private Turno turno;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Curso curso;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date insc_dataInscricao;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date insc_dataUltimoPagamento;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date insc_dataProximoPagamento;

    public int getInsc_id() {
        return insc_id;
    }

    public void setInsc_id(int insc_id) {
        this.insc_id = insc_id;
    }

    public String getInsc_anoLectivo() {
        return insc_anoLectivo;
    }

    public void setInsc_anoLectivo(String insc_anoLectivo) {
        this.insc_anoLectivo = insc_anoLectivo;
    }

    public String getInsc_turno() {
        return insc_turno;
    }

    public void setInsc_turno(String insc_turno) {
        this.insc_turno = insc_turno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Date getInsc_dataInscricao() {
        return insc_dataInscricao;
    }

    public void setInsc_dataInscricao(Date insc_dataInscricao) {
        this.insc_dataInscricao = insc_dataInscricao;
    }

    public Date getInsc_dataProximoPagamento() {
        return insc_dataProximoPagamento;
    }

    public void setInsc_dataProximoPagamento(Date insc_dataProximoPagamento) {
        this.insc_dataProximoPagamento = insc_dataProximoPagamento;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public String getInsc_semestre() {
        return insc_semestre;
    }

    public void setInsc_semestre(String insc_semestre) {
        this.insc_semestre = insc_semestre;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getInsc_origem() {
        return insc_origem;
    }

    public void setInsc_origem(String insc_origem) {
        this.insc_origem = insc_origem;
    }

    public String getInsc_nrTransfercia() {
        return insc_nrTransfercia;
    }

    public void setInsc_nrTransfercia(String insc_nrTransfercia) {
        this.insc_nrTransfercia = insc_nrTransfercia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getInsc_dataUltimoPagamento() {
        return insc_dataUltimoPagamento;
    }

    public void setInsc_dataUltimoPagamento(Date insc_dataUltimoPagamento) {
        this.insc_dataUltimoPagamento = insc_dataUltimoPagamento;
    }

    public String getInsc_referencia() {
        return insc_referencia;
    }

    public void setInsc_referencia(String insc_referencia) {
        this.insc_referencia = insc_referencia;
    }

    public boolean isInsc_activa() {
        return insc_activa;
    }

    public void setInsc_activa(boolean insc_activa) {
        this.insc_activa = insc_activa;
    }

    public boolean isInsc_regular() {
        return insc_regular;
    }

    public void setInsc_regular(boolean insc_regular) {
        this.insc_regular = insc_regular;
    }

    public String getInsc_condicao() {
        return insc_condicao;
    }

    public void setInsc_condicao(String insc_condicao) {
        this.insc_condicao = insc_condicao;
    }

    public boolean isInsc_certificado() {
        return insc_certificado;
    }

    public void setInsc_certificado(boolean insc_certificado) {
        this.insc_certificado = insc_certificado;
    }

    public boolean isInsc_copiaBI() {
        return insc_copiaBI;
    }

    public void setInsc_copiaBI(boolean insc_copiaBI) {
        this.insc_copiaBI = insc_copiaBI;
    }

    public boolean isInsc_fotos() {
        return insc_fotos;
    }

    public void setInsc_fotos(boolean insc_fotos) {
        this.insc_fotos = insc_fotos;
    }

    public String getInsc_categoria() {
        return insc_categoria;
    }

    public void setInsc_categoria(String insc_categoria) {
        this.insc_categoria = insc_categoria;
    }

    public String getInsc_comp1() {
        return insc_comp1;
    }

    public void setInsc_comp1(String insc_comp1) {
        this.insc_comp1 = insc_comp1;
    }

    public String getInsc_comp2() {
        return insc_comp2;
    }

    public void setInsc_comp2(String insc_comp2) {
        this.insc_comp2 = insc_comp2;
    }

    public String getInsc_comp3() {
        return insc_comp3;
    }

    public void setInsc_comp3(String insc_comp3) {
        this.insc_comp3 = insc_comp3;
    }

    public String getInsc_comp4() {
        return insc_comp4;
    }

    public void setInsc_comp4(String insc_comp4) {
        this.insc_comp4 = insc_comp4;
    }

    public int getInsc_faltas() {
        return insc_faltas;
    }

    public void setInsc_faltas(int insc_faltas) {
        this.insc_faltas = insc_faltas;
    }

    public int getInsc_faltasJustificadas() {
        return insc_faltasJustificadas;
    }

    public void setInsc_faltasJustificadas(int insc_faltasJustificadas) {
        this.insc_faltasJustificadas = insc_faltasJustificadas;
    }

    public boolean isInsc_ppf() {
        return insc_ppf;
    }

    public void setInsc_ppf(boolean insc_ppf) {
        this.insc_ppf = insc_ppf;
    }

    public float getInsc_notaFinal() {
        return insc_notaFinal;
    }

    public void setInsc_notaFinal(float insc_notaFinal) {
        this.insc_notaFinal = insc_notaFinal;
    }

}
