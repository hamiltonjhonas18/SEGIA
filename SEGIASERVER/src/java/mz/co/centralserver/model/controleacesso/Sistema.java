/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.controleacesso;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="Sistema")
public class Sistema implements Serializable  {
    
    @Id
    @GeneratedValue
    private int sist_id;
    
    private String sist_descricao;
    
    private String sist_url;
    
    private boolean sist_estado;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getSist_id() {
        return sist_id;
    }

    public void setSist_id(int sist_id) {
        this.sist_id = sist_id;
    }

    public String getSist_descricao() {
        return sist_descricao;
    }

    public void setSist_descricao(String sist_descricao) {
        this.sist_descricao = sist_descricao;
    }

    public String getSist_url() {
        return sist_url;
    }

    public void setSist_url(String sist_url) {
        this.sist_url = sist_url;
    }

    public boolean isSist_estado() {
        return sist_estado;
    }

    public void setSist_estado(boolean sist_estado) {
        this.sist_estado = sist_estado;
    }
    
    
}
