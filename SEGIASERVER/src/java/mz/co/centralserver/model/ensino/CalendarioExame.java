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
@Table(name = "calendarioExame")
public class CalendarioExame implements Serializable {

    @Id
    @GeneratedValue
    private int calee_id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date calee_exame;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date calee_exameLimite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date calee_recorrencia;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date calee_recorrenciaLimite;

    private String calee_semestre;

    @ManyToOne
    private AnoLectivo anoLectivo;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public int getCalee_id() {
        return calee_id;
    }

    public void setCalee_id(int calee_id) {
        this.calee_id = calee_id;
    }

    public Date getCalee_exame() {
        return calee_exame;
    }

    public void setCalee_exame(Date calee_exame) {
        this.calee_exame = calee_exame;
    }

    public Date getCalee_recorrencia() {
        return calee_recorrencia;
    }

    public void setCalee_recorrencia(Date calee_recorrencia) {
        this.calee_recorrencia = calee_recorrencia;
    }

    public String getCalee_semestre() {
        return calee_semestre;
    }

    public void setCalee_semestre(String calee_semestre) {
        this.calee_semestre = calee_semestre;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Date getCalee_exameLimite() {
        return calee_exameLimite;
    }

    public void setCalee_exameLimite(Date calee_exameLimite) {
        this.calee_exameLimite = calee_exameLimite;
    }

    public Date getCalee_recorrenciaLimite() {
        return calee_recorrenciaLimite;
    }

    public void setCalee_recorrenciaLimite(Date calee_recorrenciaLimite) {
        this.calee_recorrenciaLimite = calee_recorrenciaLimite;
    }

}
