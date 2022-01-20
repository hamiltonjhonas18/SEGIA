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
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Aluno")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue
    private int alun_id;

    private String alun_status;

    private String alun_badgnumber;

    private String alun_password;
    
    private String alun_nivel;
    
    
    private String alun_bolseiro;
    
    private String alun_categoria;
    
    private boolean alun_deficiente;     

    private int alun_turno;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date alun_dataInscricao;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date alun_dataProximoPagamento;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Entidade entidade;
    
    @ManyToOne
    private Turma turma;
    
    @ManyToOne
    private Escola escola;
    
    private String alun_provincia;
    
    private String alun_distrito;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getAlun_id() {
        return alun_id;
    }

    public void setAlun_id(int alun_id) {
        this.alun_id = alun_id;
    }

    public Date getAlun_dataInscricao() {
        return alun_dataInscricao;
    }

    public void setAlun_dataInscricao(Date alun_dataInscricao) {
        this.alun_dataInscricao = alun_dataInscricao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getAlun_status() {
        return alun_status;
    }

    public void setAlun_status(String alun_status) {
        this.alun_status = alun_status;
    }

    public String getAlun_badgnumber() {
        return alun_badgnumber;
    }

    public void setAlun_badgnumber(String alun_badgnumber) {
        this.alun_badgnumber = alun_badgnumber;
    }

    public int getAlun_turno() {
        return alun_turno;
    }

    public void setAlun_turno(int alun_turno) {
        this.alun_turno = alun_turno;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getAlun_password() {
        return alun_password;
    }

    public void setAlun_password(String alun_password) {
        this.alun_password = alun_password;
    }

    public String getAlun_nivel() {
        return alun_nivel;
    }

    public void setAlun_nivel(String alun_nivel) {
        this.alun_nivel = alun_nivel;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getAlun_bolseiro() {
        return alun_bolseiro;
    }

    public void setAlun_bolseiro(String alun_bolseiro) {
        this.alun_bolseiro = alun_bolseiro;
    }

    public boolean isAlun_deficiente() {
        return alun_deficiente;
    }

    public void setAlun_deficiente(boolean alun_deficiente) {
        this.alun_deficiente = alun_deficiente;
    }

    public String getAlun_categoria() {
        return alun_categoria;
    }

    public void setAlun_categoria(String alun_categoria) {
        this.alun_categoria = alun_categoria;
    }

    public Date getAlun_dataProximoPagamento() {
        return alun_dataProximoPagamento;
    }

    public void setAlun_dataProximoPagamento(Date alun_dataProximoPagamento) {
        this.alun_dataProximoPagamento = alun_dataProximoPagamento;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getAlun_provincia() {
        return alun_provincia;
    }

    public void setAlun_provincia(String alun_provincia) {
        this.alun_provincia = alun_provincia;
    }

    public String getAlun_distrito() {
        return alun_distrito;
    }

    public void setAlun_distrito(String alun_distrito) {
        this.alun_distrito = alun_distrito;
    }


}
