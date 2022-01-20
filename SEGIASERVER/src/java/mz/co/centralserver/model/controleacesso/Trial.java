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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="trial")
public class Trial implements Serializable {
    
    @Id
    @GeneratedValue
    
    private int tria_id;
    
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date tria_inicioTrial;
    
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date tria_fimTrial;
    
   
    @ManyToOne
    private Entidade entidade;
    
    @ManyToOne
    private Sistema sistema;

    public int getTria_id() {
        return tria_id;
    }

    public void setTria_id(int tria_id) {
        this.tria_id = tria_id;
    }

    public Date getTria_inicioTrial() {
        return tria_inicioTrial;
    }

    public void setTria_inicioTrial(Date tria_inicioTrial) {
        this.tria_inicioTrial = tria_inicioTrial;
    }

    public Date getTria_fimTrial() {
        return tria_fimTrial;
    }

    public void setTria_fimTrial(Date tria_fimTrial) {
        this.tria_fimTrial = tria_fimTrial;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    
    
}
