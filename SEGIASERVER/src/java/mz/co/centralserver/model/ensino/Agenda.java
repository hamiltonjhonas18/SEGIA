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
 * @author hamil
 */
@Entity
@Table(name="agenda")
public class Agenda implements Serializable {
    
    @Id
    @GeneratedValue
    private int agen_id;
    
    private String agen_hora;
    
    private String agen_diaSemana;
    
    private String agen_semestre;
    
    @ManyToOne
    private Disciplina disciplina;
    
    @ManyToOne
    private Turma turma;
    
    @ManyToOne
    private AnoLectivo anoLectivo;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getAgen_id() {
        return agen_id;
    }

    public void setAgen_id(int agen_id) {
        this.agen_id = agen_id;
    }

    public String getAgen_hora() {
        return agen_hora;
    }

    public void setAgen_hora(String agen_hora) {
        this.agen_hora = agen_hora;
    }

    public String getAgen_diaSemana() {
        return agen_diaSemana;
    }

    public void setAgen_diaSemana(String agen_diaSemana) {
        this.agen_diaSemana = agen_diaSemana;
    }

    public String getAgen_semestre() {
        return agen_semestre;
    }

    public void setAgen_semestre(String agen_semestre) {
        this.agen_semestre = agen_semestre;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
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
    
     
}
