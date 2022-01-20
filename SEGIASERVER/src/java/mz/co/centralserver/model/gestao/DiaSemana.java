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
@Table(name="DiaSemana")
public class DiaSemana implements Serializable {
    
    @Id
    @GeneratedValue
    private int dias_id;
    
    private String dias_descricao;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getDias_id() {
        return dias_id;
    }

    public void setDias_id(int dias_id) {
        this.dias_id = dias_id;
    }

    public String getDias_descricao() {
        return dias_descricao;
    }

    public void setDias_descricao(String dias_descricao) {
        this.dias_descricao = dias_descricao;
    }
}
