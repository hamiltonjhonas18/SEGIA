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
@Table(name = "exame")
public class Exame implements Serializable {

    @Id
    @GeneratedValue
    private int exam_id;

    private String exam_semestre;

    private float exam_media;

    private float exam_nota;

    private float exam_recorrencia;

    private float exam_notaFinal;

    private boolean exam_naRecorrencia;
    
    private boolean exam_presenca;
    
    private boolean exam_fraude;

    @ManyToOne
    private AnoLectivo anoLectivo;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Inscricao inscricao;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private SalaExame salaExame;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getExam_semestre() {
        return exam_semestre;
    }

    public void setExam_semestre(String exam_semestre) {
        this.exam_semestre = exam_semestre;
    }

    public float getExam_media() {
        return exam_media;
    }

    public void setExam_media(float exam_media) {
        this.exam_media = exam_media;
    }

    public float getExam_nota() {
        return exam_nota;
    }

    public void setExam_nota(float exam_nota) {
        this.exam_nota = exam_nota;
    }

    public float getExam_recorrencia() {
        return exam_recorrencia;
    }

    public void setExam_recorrencia(float exam_recorrencia) {
        this.exam_recorrencia = exam_recorrencia;
    }

    public boolean isExam_naRecorrencia() {
        return exam_naRecorrencia;
    }

    public void setExam_naRecorrencia(boolean exam_naRecorrencia) {
        this.exam_naRecorrencia = exam_naRecorrencia;
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

    public float getExam_notaFinal() {
        return exam_notaFinal;
    }

    public void setExam_notaFinal(float exam_notaFinal) {
        this.exam_notaFinal = exam_notaFinal;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public SalaExame getSalaExame() {
        return salaExame;
    }

    public void setSalaExame(SalaExame salaExame) {
        this.salaExame = salaExame;
    }

    public boolean isExam_presenca() {
        return exam_presenca;
    }

    public void setExam_presenca(boolean exam_presenca) {
        this.exam_presenca = exam_presenca;
    }

}
