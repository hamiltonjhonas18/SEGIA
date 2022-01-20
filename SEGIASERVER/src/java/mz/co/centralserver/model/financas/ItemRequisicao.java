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
@Table(name = "ItemRequisicao")
public class ItemRequisicao implements Serializable {

    @Id
    @GeneratedValue
    private int itr_id;

    private String itr_descricao;
    private int itr_qtd;

    private double itr_valor;

    @ManyToOne
    private Requisicao requisicao;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getItr_id() {
        return itr_id;
    }

    public void setItr_id(int itr_id) {
        this.itr_id = itr_id;
    }

    public String getItr_descricao() {
        return itr_descricao;
    }

    public void setItr_descricao(String itr_descricao) {
        this.itr_descricao = itr_descricao;
    }

    public int getItr_qtd() {
        return itr_qtd;
    }

    public void setItr_qtd(int itr_qtd) {
        this.itr_qtd = itr_qtd;
    }

    public double getItr_valor() {
        return itr_valor;
    }

    public void setItr_valor(double itr_valor) {
        this.itr_valor = itr_valor;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
