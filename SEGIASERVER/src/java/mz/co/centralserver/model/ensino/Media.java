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
@Table(name="media")
public class Media implements Serializable {
    
    @Id
    @GeneratedValue
    private int medi_id;
    
    private float medi_media;
    private float medi_media2;
    private float medi_media3;
    
    private String med_semestre;
    
    @ManyToOne
    private AnoLectivo anoLectivo;
    
    @ManyToOne
    private Aluno aluno;
    
    @ManyToOne
    private Inscricao inscricao;
    
    @ManyToOne
    private Turma turma;
    
    @ManyToOne
    private Disciplina disciplina;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getMedi_id() {
        return medi_id;
    }

    public void setMedi_id(int medi_id) {
        this.medi_id = medi_id;
    }

    public float getMedi_media() {
        return medi_media;
    }

    public void setMedi_media(float medi_media) {
        this.medi_media = medi_media;
    }

    public String getMed_semestre() {
        return med_semestre;
    }

    public void setMed_semestre(String med_semestre) {
        this.med_semestre = med_semestre;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public float getMedi_media2() {
        return medi_media2;
    }

    public void setMedi_media2(float medi_media2) {
        this.medi_media2 = medi_media2;
    }

    public float getMedi_media3() {
        return medi_media3;
    }

    public void setMedi_media3(float medi_media3) {
        this.medi_media3 = medi_media3;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
}
