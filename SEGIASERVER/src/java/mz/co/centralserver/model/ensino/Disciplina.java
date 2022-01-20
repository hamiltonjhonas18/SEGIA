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
@Table(name="disciplina")
public class Disciplina implements Serializable {
    
    @Id
    @GeneratedValue
    private int disc_id;
    
    private String disc_descricao;
    
    private String disc_semestre;
    
    private String disc_codigo;
    
    private String disc_grupo;
    
    private int disc_cargaHoraria;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getDisc_id() {
        return disc_id;
    }

    public void setDisc_id(int disc_id) {
        this.disc_id = disc_id;
    }

    public String getDisc_descricao() {
        return disc_descricao;
    }

    public void setDisc_descricao(String disc_descricao) {
        this.disc_descricao = disc_descricao;
    }

    public String getDisc_semestre() {
        return disc_semestre;
    }

    public void setDisc_semestre(String disc_semestre) {
        this.disc_semestre = disc_semestre;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public int getDisc_cargaHoraria() {
        return disc_cargaHoraria;
    }

    public void setDisc_cargaHoraria(int disc_cargaHoraria) {
        this.disc_cargaHoraria = disc_cargaHoraria;
    }

    public String getDisc_codigo() {
        return disc_codigo;
    }

    public void setDisc_codigo(String disc_codigo) {
        this.disc_codigo = disc_codigo;
    }

    public String getDisc_grupo() {
        return disc_grupo;
    }

    public void setDisc_grupo(String disc_grupo) {
        this.disc_grupo = disc_grupo;
    }
    
}
