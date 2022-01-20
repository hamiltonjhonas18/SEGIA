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
@Table(name = "Presencas")
public class Presencas implements Serializable {

    @Id
    @GeneratedValue
    private int pres_id;

    private int pres_faltas;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Turma turma;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Aluno aluno;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pres_data;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getPres_faltas() {
        return pres_faltas;
    }

    public void setPres_faltas(int pres_faltas) {
        this.pres_faltas = pres_faltas;
    }

    public int getPres_id() {
        return pres_id;
    }

    public void setPres_id(int pres_id) {
        this.pres_id = pres_id;
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Date getPres_data() {
        return pres_data;
    }

    public void setPres_data(Date pres_data) {
        this.pres_data = pres_data;
    }

}
