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
@Table(name="itemrequisicaocheque")
public class ItemRequisicaoCheque implements Serializable {
    
    @Id
    @GeneratedValue
    private int irc_id;
    
    private String irc_beneficiario;
    
    private double irc_valor;
    
    private int irc_ref;
    
    @ManyToOne
    private RequisicaoCheque requisicaoCheque;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getIrc_id() {
        return irc_id;
    }

    public void setIrc_id(int irc_id) {
        this.irc_id = irc_id;
    }

    public String getIrc_beneficiario() {
        return irc_beneficiario;
    }

    public void setIrc_beneficiario(String irc_beneficiario) {
        this.irc_beneficiario = irc_beneficiario;
    }

    public double getIrc_valor() {
        return irc_valor;
    }

    public void setIrc_valor(double irc_valor) {
        this.irc_valor = irc_valor;
    }

    public RequisicaoCheque getRequisicaoCheque() {
        return requisicaoCheque;
    }

    public void setRequisicaoCheque(RequisicaoCheque requisicaoCheque) {
        this.requisicaoCheque = requisicaoCheque;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public int getIrc_ref() {
        return irc_ref;
    }

    public void setIrc_ref(int irc_ref) {
        this.irc_ref = irc_ref;
    }

}
