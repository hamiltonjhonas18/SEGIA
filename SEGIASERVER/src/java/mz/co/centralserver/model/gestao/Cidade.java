/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.gestao;

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
@Table(name="cidade")
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue
    private int cida_id;
    
    private String cida_descricao;

    private boolean encrypted;
    
    public int getCida_id() {
        return cida_id;
    }

    public void setCida_id(int cida_id) {
        this.cida_id = cida_id;
    }

    public String getCida_descricao() {
        return cida_descricao;
    }

    public void setCida_descricao(String cida_descricao) {
        this.cida_descricao = cida_descricao;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    
}
