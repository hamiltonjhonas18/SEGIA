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
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "contacorrente")
public class ContaCorrente implements Serializable {

    @Id
    @GeneratedValue
    private int coco_id;

    private String coco_documento;
    private double coco_credito;
    private double coco_debito;
    private double coco_saldo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date coco_data;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Usuario usuario;
    
    private boolean encrypted;

    public int getCoco_id() {
        return coco_id;
    }

    public void setCoco_id(int coco_id) {
        this.coco_id = coco_id;
    }

    public String getCoco_documento() {
        return coco_documento;
    }

    public void setCoco_documento(String coco_documento) {
        this.coco_documento = coco_documento;
    }

    public double getCoco_credito() {
        return coco_credito;
    }

    public void setCoco_credito(double coco_credito) {
        this.coco_credito = coco_credito;
    }

    public double getCoco_debito() {
        return coco_debito;
    }

    public void setCoco_debito(double coco_debito) {
        this.coco_debito = coco_debito;
    }

    public double getCoco_saldo() {
        return coco_saldo;
    }

    public void setCoco_saldo(double coco_saldo) {
        this.coco_saldo = coco_saldo;
    }

    public Date getCoco_data() {
        return coco_data;
    }

    public void setCoco_data(Date coco_data) {
        this.coco_data = coco_data;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
