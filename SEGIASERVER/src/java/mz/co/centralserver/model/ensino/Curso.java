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
@Table(name="curso")
public class Curso implements Serializable {
  
    @Id
    @GeneratedValue
    private int curs_id;
    
    private String curs_descricao;
    
    private String curs_tipo;
    
    private String curs_cod;
    
    private int curs_duracao;
    
    private int curs_numTurmas;
    
    private int curs_numPrestacoes;
    
    private int curs_aprovacoes;
    
    private int curs_reprovacoes;
    
    private int curs_inscritos;
    
    private double curs_preco;
    
    private double curs_custoInscricao;
    
    private boolean curs_exame;
    
    @ManyToOne
    private Entidade entidade;
    
    
    @ManyToOne
    private AreaFormacao areaFormacao;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }
    

    public int getCurs_id() {
        return curs_id;
    }

    public void setCurs_id(int curs_id) {
        this.curs_id = curs_id;
    }

    public String getCurs_descricao() {
        return curs_descricao;
    }

    public void setCurs_descricao(String curs_descricao) {
        this.curs_descricao = curs_descricao;
    }

    public int getCurs_duracao() {
        return curs_duracao;
    }

    public void setCurs_duracao(int curs_duracao) {
        this.curs_duracao = curs_duracao;
    }

    public double getCurs_preco() {
        return curs_preco;
    }

    public void setCurs_preco(double curs_preco) {
        this.curs_preco = curs_preco;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public AreaFormacao getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(AreaFormacao areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getCurs_tipo() {
        return curs_tipo;
    }

    public void setCurs_tipo(String curs_tipo) {
        this.curs_tipo = curs_tipo;
    }

    public String getCurs_cod() {
        return curs_cod;
    }

    public void setCurs_cod(String curs_cod) {
        this.curs_cod = curs_cod;
    }

    public int getCurs_numTurmas() {
        return curs_numTurmas;
    }

    public void setCurs_numTurmas(int curs_numTurmas) {
        this.curs_numTurmas = curs_numTurmas;
    }

    public int getCurs_numPrestacoes() {
        return curs_numPrestacoes;
    }

    public void setCurs_numPrestacoes(int curs_numPrestacoes) {
        this.curs_numPrestacoes = curs_numPrestacoes;
    }

    public double getCurs_custoInscricao() {
        return curs_custoInscricao;
    }

    public void setCurs_custoInscricao(double curs_custoInscricao) {
        this.curs_custoInscricao = curs_custoInscricao;
    }

    public int getCurs_aprovacoes() {
        return curs_aprovacoes;
    }

    public void setCurs_aprovacoes(int curs_aprovacoes) {
        this.curs_aprovacoes = curs_aprovacoes;
    }

    public int getCurs_reprovacoes() {
        return curs_reprovacoes;
    }

    public void setCurs_reprovacoes(int curs_reprovacoes) {
        this.curs_reprovacoes = curs_reprovacoes;
    }

    public int getCurs_inscritos() {
        return curs_inscritos;
    }

    public void setCurs_inscritos(int curs_inscritos) {
        this.curs_inscritos = curs_inscritos;
    }

    public boolean isCurs_exame() {
        return curs_exame;
    }

    public void setCurs_exame(boolean curs_exame) {
        this.curs_exame = curs_exame;
    }
    
    
}
