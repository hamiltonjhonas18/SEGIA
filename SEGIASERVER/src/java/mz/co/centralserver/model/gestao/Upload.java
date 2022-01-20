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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author hamil
 */
@Entity
@Table(name = "upload")
public class Upload implements Serializable {

    @Id
    @GeneratedValue
    private int upl_id;

    @Lob
    private String upl_file;

    @ManyToOne
    private Entidade entidade;

    public int getUpl_id() {
        return upl_id;
    }

    public void setUpl_id(int upl_id) {
        this.upl_id = upl_id;
    }

    public String getUpl_file() {
        return upl_file;
    }

    public void setUpl_file(String upl_file) {
        this.upl_file = upl_file;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
    
    
}
