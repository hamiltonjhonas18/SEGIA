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
@Table(name = "resposta")
public class Resposta implements Serializable {

    @Id
    @GeneratedValue
    private int resp_id;
    
    private String resp_categoria;

    @Lob
    private String resp_pergunta;

    @Lob
    private String resp_resposta;

    @Lob
    private String resp_opcao1;

    @Lob
    private String resp_opcao2;

    @Lob
    private String resp_opcao3;

    @Lob
    private String resp_opcao4;
    
    @ManyToOne
    private Disciplina disciplina;
    
    @ManyToOne
    private Curso curso;
    
    @ManyToOne
    private AnoLectivo anoLectivo;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getResp_id() {
        return resp_id;
    }

    public void setResp_id(int resp_id) {
        this.resp_id = resp_id;
    }

    public String getResp_categoria() {
        return resp_categoria;
    }

    public void setResp_categoria(String resp_categoria) {
        this.resp_categoria = resp_categoria;
    }

    public String getResp_pergunta() {
        return resp_pergunta;
    }

    public void setResp_pergunta(String resp_pergunta) {
        this.resp_pergunta = resp_pergunta;
    }

    public String getResp_resposta() {
        return resp_resposta;
    }

    public void setResp_resposta(String resp_resposta) {
        this.resp_resposta = resp_resposta;
    }

    public String getResp_opcao1() {
        return resp_opcao1;
    }

    public void setResp_opcao1(String resp_opcao1) {
        this.resp_opcao1 = resp_opcao1;
    }

    public String getResp_opcao2() {
        return resp_opcao2;
    }

    public void setResp_opcao2(String resp_opcao2) {
        this.resp_opcao2 = resp_opcao2;
    }

    public String getResp_opcao3() {
        return resp_opcao3;
    }

    public void setResp_opcao3(String resp_opcao3) {
        this.resp_opcao3 = resp_opcao3;
    }

    public String getResp_opcao4() {
        return resp_opcao4;
    }

    public void setResp_opcao4(String resp_opcao4) {
        this.resp_opcao4 = resp_opcao4;
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
