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
@Table(name="AreaFormacao")
public class AreaFormacao implements Serializable {
    
    @Id
    @GeneratedValue
    private int aref_id;
    
    private String aref_descricao;
    
    @Lob
    private String aref_detalhes;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getAref_id() {
        return aref_id;
    }

    public void setAref_id(int aref_id) {
        this.aref_id = aref_id;
    }

    public String getAref_descricao() {
        return aref_descricao;
    }

    public void setAref_descricao(String aref_descricao) {
        this.aref_descricao = aref_descricao;
    }

    public String getAref_detalhes() {
        return aref_detalhes;
    }

    public void setAref_detalhes(String aref_detalhes) {
        this.aref_detalhes = aref_detalhes;
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
