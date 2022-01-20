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
 * @author 25884
 */
@Entity
@Table(name = "salaExame")
public class SalaExame implements Serializable {

    @Id
    @GeneratedValue
    private int salae_id;

    private int salae_maxAlunos;

    private int salae_ocupado;

    @ManyToOne
    private AnoLectivo anoLectivo;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Sala sala;
    
    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Docente juri1;

    @ManyToOne
    private Docente juri2;

    @ManyToOne
    private Entidade entidade;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date salae_data;

    public int getSalae_id() {
        return salae_id;
    }

    public void setSalae_id(int salae_id) {
        this.salae_id = salae_id;
    }

    public int getSalae_maxAlunos() {
        return salae_maxAlunos;
    }

    public void setSalae_maxAlunos(int salae_maxAlunos) {
        this.salae_maxAlunos = salae_maxAlunos;
    }

    public int getSalae_ocupado() {
        return salae_ocupado;
    }

    public void setSalae_ocupado(int salae_ocupado) {
        this.salae_ocupado = salae_ocupado;
    }

    public Docente getJuri1() {
        return juri1;
    }

    public void setJuri1(Docente juri1) {
        this.juri1 = juri1;
    }

    public Docente getJuri2() {
        return juri2;
    }

    public void setJuri2(Docente juri2) {
        this.juri2 = juri2;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Date getSalae_data() {
        return salae_data;
    }

    public void setSalae_data(Date salae_data) {
        this.salae_data = salae_data;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
}
