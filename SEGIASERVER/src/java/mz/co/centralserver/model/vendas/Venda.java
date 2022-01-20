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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Venda")
public class Venda implements Serializable {

    @Id
    @GeneratedValue
    private int vend_id;

    private String vend_descricao;
    private String vend_estado;
    private String vend_referencia;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date vend_dataVenda;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Entidade Entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public int getVend_id() {
        return vend_id;
    }

    public void setVend_id(int vend_id) {
        this.vend_id = vend_id;
    }

    public String getVend_descricao() {
        return vend_descricao;
    }

    public void setVend_descricao(String vend_descricao) {
        this.vend_descricao = vend_descricao;
    }

    public String getVend_estado() {
        return vend_estado;
    }

    public void setVend_estado(String vend_estado) {
        this.vend_estado = vend_estado;
    }

    public String getVend_referencia() {
        return vend_referencia;
    }

    public void setVend_referencia(String vend_referencia) {
        this.vend_referencia = vend_referencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getVend_dataVenda() {
        return vend_dataVenda;
    }

    public void setVend_dataVenda(Date vend_dataVenda) {
        this.vend_dataVenda = vend_dataVenda;
    }

}
