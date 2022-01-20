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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author 25884
 */
@Entity
@Table(name = "tema")
public class Tema implements Serializable {

    @Id
    @GeneratedValue
    private int tema_id;

    @Lob
    private String tema_descricao;

    private int tema_pratica;
    private int tema_teorica;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Escola escola;

    @ManyToOne
    private Curso curso;


    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getTema_id() {
        return tema_id;
    }

    public void setTema_id(int tema_id) {
        this.tema_id = tema_id;
    }

    public String getTema_descricao() {
        return tema_descricao;
    }

    public void setTema_descricao(String tema_descricao) {
        this.tema_descricao = tema_descricao;
    }

    public int getTema_pratica() {
        return tema_pratica;
    }

    public void setTema_pratica(int tema_pratica) {
        this.tema_pratica = tema_pratica;
    }

    public int getTema_teorica() {
        return tema_teorica;
    }

    public void setTema_teorica(int tema_teorica) {
        this.tema_teorica = tema_teorica;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
}
