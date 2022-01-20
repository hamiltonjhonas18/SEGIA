/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.financas;

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
@Table(name="Banco")
public class Banco implements Serializable {
    
    @Id
    @GeneratedValue
    private int bnc_id;
    
    private String bnc_nome;
    
    private double bnc_saldo;
    
    private String bnc_nib;
    
    private String bnc_moeda;
    
    private String bnc_conta;
    
    private String bnc_logo;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getBnc_id() {
        return bnc_id;
    }

    public void setBnc_id(int bnc_id) {
        this.bnc_id = bnc_id;
    }

    public String getBnc_nome() {
        return bnc_nome;
    }

    public void setBnc_nome(String bnc_nome) {
        this.bnc_nome = bnc_nome;
    }

    public double getBnc_saldo() {
        return bnc_saldo;
    }

    public void setBnc_saldo(double bnc_saldo) {
        this.bnc_saldo = bnc_saldo;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getBnc_nib() {
        return bnc_nib;
    }

    public void setBnc_nib(String bnc_nib) {
        this.bnc_nib = bnc_nib;
    }

    public String getBnc_moeda() {
        return bnc_moeda;
    }

    public void setBnc_moeda(String bnc_moeda) {
        this.bnc_moeda = bnc_moeda;
    }

    public String getBnc_conta() {
        return bnc_conta;
    }

    public void setBnc_conta(String bnc_conta) {
        this.bnc_conta = bnc_conta;
    }

    public String getBnc_logo() {
        return bnc_logo;
    }

    public void setBnc_logo(String bnc_logo) {
        this.bnc_logo = bnc_logo;
    }

    
}
