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
@Table(name = "anolectivo")
public class AnoLectivo implements Serializable {

    @Id
    @GeneratedValue
    private int anol_id;

    private String anol_descricao;

    private String anol_status;

    private boolean anol_corrente;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getAnol_id() {
        return anol_id;
    }

    public void setAnol_id(int anol_id) {
        this.anol_id = anol_id;
    }

    public String getAnol_descricao() {
        return anol_descricao;
    }

    public void setAnol_descricao(String anol_descricao) {
        this.anol_descricao = anol_descricao;
    }

    public String getAnol_status() {
        return anol_status;
    }

    public void setAnol_status(String anol_status) {
        this.anol_status = anol_status;
    }

    public boolean isAnol_corrente() {
        return anol_corrente;
    }

    public void setAnol_corrente(boolean anol_corrente) {
        this.anol_corrente = anol_corrente;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
