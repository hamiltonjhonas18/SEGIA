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
 * @author HJC2K8
 */
@Entity
@Table(name = "boletim")
public class Boletim implements Serializable {

    @Id
    @GeneratedValue
    private int bole_id;

    private String bole_periodo;

    private String bole_status;

    @Lob
    private String bole_descricao;

    @ManyToOne
    private Inscricao inscricao;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getBole_id() {
        return bole_id;
    }

    public void setBole_id(int bole_id) {
        this.bole_id = bole_id;
    }

    public String getBole_periodo() {
        return bole_periodo;
    }

    public void setBole_periodo(String bole_periodo) {
        this.bole_periodo = bole_periodo;
    }

    public String getBole_status() {
        return bole_status;
    }

    public void setBole_status(String bole_status) {
        this.bole_status = bole_status;
    }

    public String getBole_descricao() {
        return bole_descricao;
    }

    public void setBole_descricao(String bole_descricao) {
        this.bole_descricao = bole_descricao;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
