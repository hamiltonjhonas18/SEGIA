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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author hamil
 */
@Entity
@Table(name="RegistoFecho")
public class RegistoFecho implements Serializable {
    
    @Id
    @GeneratedValue
    private int regf_id;
    
    private int regf_qtd;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date regf_data;
    
    @ManyToOne
    private Fecho fecho;
    
    @ManyToOne
    private Produto produto;
    
    @ManyToOne
    private Entidade entidade;

    public int getRegf_id() {
        return regf_id;
    }

    public void setRegf_id(int regf_id) {
        this.regf_id = regf_id;
    }

    public int getRegf_qtd() {
        return regf_qtd;
    }

    public void setRegf_qtd(int regf_qtd) {
        this.regf_qtd = regf_qtd;
    }

    public Date getRegf_data() {
        return regf_data;
    }

    public void setRegf_data(Date regf_data) {
        this.regf_data = regf_data;
    }

    public Fecho getFecho() {
        return fecho;
    }

    public void setFecho(Fecho fecho) {
        this.fecho = fecho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
    
    
    
    
}
