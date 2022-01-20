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
@Table(name = "modulo")
public class Modulo implements Serializable {

    @Id
    @GeneratedValue
    private int modu_id;

    private String modu_descricao;

    private int modu_durcao;
    
    private double modu_credito;

    private double modu_preco;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public int getModu_id() {
        return modu_id;
    }

    public void setModu_id(int modu_id) {
        this.modu_id = modu_id;
    }

    public String getModu_descricao() {
        return modu_descricao;
    }

    public void setModu_descricao(String modu_descricao) {
        this.modu_descricao = modu_descricao;
    }

    public int getModu_durcao() {
        return modu_durcao;
    }

    public void setModu_durcao(int modu_durcao) {
        this.modu_durcao = modu_durcao;
    }

    public double getModu_preco() {
        return modu_preco;
    }

    public void setModu_preco(double modu_preco) {
        this.modu_preco = modu_preco;
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

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public double getModu_credito() {
        return modu_credito;
    }

    public void setModu_credito(double modu_credito) {
        this.modu_credito = modu_credito;
    }

}
