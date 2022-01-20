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
@Table(name = "avaliacao")
public class Avaliacao implements Serializable {

    @Id
    @GeneratedValue
    private int aval_id;

    private String aval_comportamento;

    private String aval_observacoes;

    private String aval_semestre;

    private int aval_anoLectivo;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getAval_id() {
        return aval_id;
    }

    public void setAval_id(int aval_id) {
        this.aval_id = aval_id;
    }

    public String getAval_comportamento() {
        return aval_comportamento;
    }

    public void setAval_comportamento(String aval_comportamento) {
        this.aval_comportamento = aval_comportamento;
    }

    public String getAval_observacoes() {
        return aval_observacoes;
    }

    public void setAval_observacoes(String aval_observacoes) {
        this.aval_observacoes = aval_observacoes;
    }

    public String getAval_semestre() {
        return aval_semestre;
    }

    public void setAval_semestre(String aval_semestre) {
        this.aval_semestre = aval_semestre;
    }

    public int getAval_anoLectivo() {
        return aval_anoLectivo;
    }

    public void setAval_anoLectivo(int aval_anoLectivo) {
        this.aval_anoLectivo = aval_anoLectivo;
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

}
