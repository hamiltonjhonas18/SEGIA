/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.contabilistico;

import mz.co.centralserver.model.ensino.Aluno;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.ensino.Curso;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Mensalidade")
public class Mensalidade implements Serializable {

    @Id
    @GeneratedValue
    private int mens_id;

    private String mens_estado;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date mens_dataInscricao;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date mens_dataPagamento;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date mens_dataProximoPagamento;

    @ManyToOne
    private Aluno aluno;

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

    public int getMens_id() {
        return mens_id;
    }

    public void setMens_id(int mens_id) {
        this.mens_id = mens_id;
    }

    public Date getMens_dataInscricao() {
        return mens_dataInscricao;
    }

    public void setMens_dataInscricao(Date mens_dataInscricao) {
        this.mens_dataInscricao = mens_dataInscricao;
    }

    public Date getMens_dataPagamento() {
        return mens_dataPagamento;
    }

    public void setMens_dataPagamento(Date mens_dataPagamento) {
        this.mens_dataPagamento = mens_dataPagamento;
    }

    public Date getMens_dataProximoPagamento() {
        return mens_dataProximoPagamento;
    }

    public void setMens_dataProximoPagamento(Date mens_dataProximoPagamento) {
        this.mens_dataProximoPagamento = mens_dataProximoPagamento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getMens_estado() {
        return mens_estado;
    }

    public void setMens_estado(String mens_estado) {
        this.mens_estado = mens_estado;
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

}
