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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author 25884
 */
@Entity
@Table(name = "sumario")
public class Sumario implements Serializable {

    @Id
    @GeneratedValue
    private int suma_id;

    @Lob
    private String suma_descricao;

    @Lob
    private String suma_objectivo;

    @Lob
    private String suma_resumo;

    @Lob
    private String suma_metodologia;

    @Lob
    private String suma_recursos;

    @Lob
    private String suma_avaliacao;

    @Lob
    private String suma_bibliografia;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date suma_data;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Tema tema;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Escola escola;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public int getSuma_id() {
        return suma_id;
    }

    public void setSuma_id(int suma_id) {
        this.suma_id = suma_id;
    }

    public String getSuma_descricao() {
        return suma_descricao;
    }

    public void setSuma_descricao(String suma_descricao) {
        this.suma_descricao = suma_descricao;
    }

    public String getSuma_objectivo() {
        return suma_objectivo;
    }

    public void setSuma_objectivo(String suma_objectivo) {
        this.suma_objectivo = suma_objectivo;
    }

    public String getSuma_resumo() {
        return suma_resumo;
    }

    public void setSuma_resumo(String suma_resumo) {
        this.suma_resumo = suma_resumo;
    }

    public String getSuma_metodologia() {
        return suma_metodologia;
    }

    public void setSuma_metodologia(String suma_metodologia) {
        this.suma_metodologia = suma_metodologia;
    }

    public String getSuma_recursos() {
        return suma_recursos;
    }

    public void setSuma_recursos(String suma_recursos) {
        this.suma_recursos = suma_recursos;
    }

    public String getSuma_avaliacao() {
        return suma_avaliacao;
    }

    public void setSuma_avaliacao(String suma_avaliacao) {
        this.suma_avaliacao = suma_avaliacao;
    }

    public String getSuma_bibliografia() {
        return suma_bibliografia;
    }

    public void setSuma_bibliografia(String suma_bibliografia) {
        this.suma_bibliografia = suma_bibliografia;
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

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Date getSuma_data() {
        return suma_data;
    }

    public void setSuma_data(Date suma_data) {
        this.suma_data = suma_data;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
