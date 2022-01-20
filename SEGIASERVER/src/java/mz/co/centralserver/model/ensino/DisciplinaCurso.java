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
 * 
 * @author HJC2K8
 */
@Entity
@Table(name="DisciplinaCurso")
public class DisciplinaCurso implements Serializable {
    
    @Id
    @GeneratedValue
    private int disd_id;
    
    private String disd_semestre;
    
    @ManyToOne
    private Disciplina disciplina;
    
    @ManyToOne
    private Curso curso;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getDisd_id() {
        return disd_id;
    }

    public void setDisd_id(int disd_id) {
        this.disd_id = disd_id;
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

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getDisd_semestre() {
        return disd_semestre;
    }

    public void setDisd_semestre(String disd_semestre) {
        this.disd_semestre = disd_semestre;
    }
    
    
}
