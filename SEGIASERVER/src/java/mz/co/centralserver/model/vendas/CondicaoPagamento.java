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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="CondicaoPagamento")
public class CondicaoPagamento implements Serializable{
    
    @Id
    @GeneratedValue
    private int conp_id;
    
    @Lob
    private String conp_descricao;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getConp_id() {
        return conp_id;
    }

    public void setConp_id(int conp_id) {
        this.conp_id = conp_id;
    }

    public String getConp_descricao() {
        return conp_descricao;
    }

    public void setConp_descricao(String conp_descricao) {
        this.conp_descricao = conp_descricao;
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
