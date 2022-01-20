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
@Table(name="taxa")
public class Taxa implements Serializable{
    
    @Id
    @GeneratedValue
    private int taxa_id;
    
    
    private String taxa_descricao;
    
    private double taxa_valor;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getTaxa_id() {
        return taxa_id;
    }

    public void setTaxa_id(int taxa_id) {
        this.taxa_id = taxa_id;
    }

    public String getTaxa_descricao() {
        return taxa_descricao;
    }

    public void setTaxa_descricao(String taxa_descricao) {
        this.taxa_descricao = taxa_descricao;
    }

    public double getTaxa_valor() {
        return taxa_valor;
    }

    public void setTaxa_valor(double taxa_valor) {
        this.taxa_valor = taxa_valor;
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
