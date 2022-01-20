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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="notas")
public class Notas implements Serializable {
    
    @Id
    @GeneratedValue
    private int nota_id;
    
    private float nota_teste1;
    private float nota_teste2;
    private float nota_teste3;
    private float nota_teste4;
    private float nota_acp;
    private float nota_acp2;
    private float nota_trabPratico;
    private float nota_avaliacaoContinua;
    private float nota_media;
    
    private boolean isTeste3;
    private boolean isTeste4;
    private boolean isAcp2;
    
    private String nota_semestre;
    
    @ManyToOne
    private Disciplina disciplina;
    
    @ManyToOne
    private Entidade entidade;
    
    @ManyToOne
    private Aluno aluno;
    
    @ManyToOne
    private Turma turma;
    
    @ManyToOne
    private Inscricao inscricao;
    
    @ManyToOne
    private AnoLectivo anoLectivo;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getNota_id() {
        return nota_id;
    }

    public void setNota_id(int nota_id) {
        this.nota_id = nota_id;
    }

    public float getNota_teste1() {
        return nota_teste1;
    }

    public void setNota_teste1(float nota_teste1) {
        this.nota_teste1 = nota_teste1;
    }

    public float getNota_teste2() {
        return nota_teste2;
    }

    public void setNota_teste2(float nota_teste2) {
        this.nota_teste2 = nota_teste2;
    }

    public float getNota_trabPratico() {
        return nota_trabPratico;
    }

    public void setNota_trabPratico(float nota_trabPratico) {
        this.nota_trabPratico = nota_trabPratico;
    }

    public float getNota_avaliacaoContinua() {
        return nota_avaliacaoContinua;
    }

    public void setNota_avaliacaoContinua(float nota_avaliacaoContinua) {
        this.nota_avaliacaoContinua = nota_avaliacaoContinua;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getNota_semestre() {
        return nota_semestre;
    }

    public void setNota_semestre(String nota_semestre) {
        this.nota_semestre = nota_semestre;
    }
    
    public float getNota_media() {
        return nota_media;
    }

    public void setNota_media(float nota_media) {
        this.nota_media = nota_media;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public float getNota_teste3() {
        return nota_teste3;
    }

    public void setNota_teste3(float nota_teste3) {
        this.nota_teste3 = nota_teste3;
    }

    public float getNota_acp() {
        return nota_acp;
    }

    public void setNota_acp(float nota_acp) {
        this.nota_acp = nota_acp;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public boolean isIsTeste3() {
        return isTeste3;
    }

    public void setIsTeste3(boolean isTeste3) {
        this.isTeste3 = isTeste3;
    }

    public boolean isIsTeste4() {
        return isTeste4;
    }

    public void setIsTeste4(boolean isTeste4) {
        this.isTeste4 = isTeste4;
    }

    public boolean isIsAcp2() {
        return isAcp2;
    }

    public void setIsAcp2(boolean isAcp2) {
        this.isAcp2 = isAcp2;
    }

    public float getNota_teste4() {
        return nota_teste4;
    }

    public void setNota_teste4(float nota_teste4) {
        this.nota_teste4 = nota_teste4;
    }

    public float getNota_acp2() {
        return nota_acp2;
    }

    public void setNota_acp2(float nota_acp2) {
        this.nota_acp2 = nota_acp2;
    }
    
    
}
