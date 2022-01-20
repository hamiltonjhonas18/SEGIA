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
@Table(name = "vagas")
public class Vagas implements Serializable {

    @Id
    @GeneratedValue
    private int vaga_id;

    private int vaga_total;

    private int vaga_preechidas;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private AnoLectivo anoLectivo;

    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getVaga_id() {
        return vaga_id;
    }

    public void setVaga_id(int vaga_id) {
        this.vaga_id = vaga_id;
    }

    public int getVaga_total() {
        return vaga_total;
    }

    public void setVaga_total(int vaga_total) {
        this.vaga_total = vaga_total;
    }

    public int getVaga_preechidas() {
        return vaga_preechidas;
    }

    public void setVaga_preechidas(int vaga_preechidas) {
        this.vaga_preechidas = vaga_preechidas;
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

}
