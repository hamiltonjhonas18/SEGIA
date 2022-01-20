/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.contabilistico;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.vendas.Fornecedor;

/**
 *
 * @author hamil
 */
@Entity
@Table(name = "activo")
public class Activo implements Serializable {

    @Id
    @GeneratedValue
    private int acti_id;

    private int acti_vidaUtil;
    
    @Lob
    private String acti_descricao;

    @Lob
    private String acti_especificacoes;

    private double acti_valor;
    
    private String acti_referenciaDocumentoCompra;

    @Temporal(TemporalType.TIMESTAMP)
    private Date acti_data;

    @ManyToOne
    private Entidade entidade;
    
    @ManyToOne
    private Fornecedor fornecedor;

    private boolean encrypted;

    public int getActi_id() {
        return acti_id;
    }

    public void setActi_id(int acti_id) {
        this.acti_id = acti_id;
    }

    public String getActi_descricao() {
        return acti_descricao;
    }

    public void setActi_descricao(String acti_descricao) {
        this.acti_descricao = acti_descricao;
    }

    public double getActi_valor() {
        return acti_valor;
    }

    public void setActi_valor(double acti_valor) {
        this.acti_valor = acti_valor;
    }

    public Date getActi_data() {
        return acti_data;
    }

    public void setActi_data(Date acti_data) {
        this.acti_data = acti_data;
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

    public String getActi_especificacoes() {
        return acti_especificacoes;
    }

    public void setActi_especificacoes(String acti_especificacoes) {
        this.acti_especificacoes = acti_especificacoes;
    }

    public int getActi_vidaUtil() {
        return acti_vidaUtil;
    }

    public void setActi_vidaUtil(int acti_vidaUtil) {
        this.acti_vidaUtil = acti_vidaUtil;
    }

    public String getActi_referenciaDocumentoCompra() {
        return acti_referenciaDocumentoCompra;
    }

    public void setActi_referenciaDocumentoCompra(String acti_referenciaDocumentoCompra) {
        this.acti_referenciaDocumentoCompra = acti_referenciaDocumentoCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
