/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.vendas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author hamil
 */

@Entity
@Table(name="meiopagamento")
public class MeioPagamento implements Serializable {
    
    @Id
    @GeneratedValue
    private int meio_id;
    
    private String meio_descricao;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getMeio_id() {
        return meio_id;
    }

    public void setMeio_id(int meio_id) {
        this.meio_id = meio_id;
    }

    public String getMeio_descricao() {
        return meio_descricao;
    }

    public void setMeio_descricao(String meio_descricao) {
        this.meio_descricao = meio_descricao;
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
