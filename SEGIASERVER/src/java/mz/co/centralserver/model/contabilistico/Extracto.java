/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.contabilistico;

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
 * @author User
 */
@Entity
@Table(name = "Extracto")
public class Extracto implements Serializable {

    @Id
    @GeneratedValue
    private int ext_id;
    private String ext_movimento;
    private double ext_debito;
    private double ext_credito;
    private double ext_saldo;

    @Temporal(TemporalType.DATE)
    private Date ext_data;

    @ManyToOne
    private Factura factura;
    
    @ManyToOne 
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getExt_id() {
        return ext_id;
    }

    public void setExt_id(int ext_id) {
        this.ext_id = ext_id;
    }

    public String getExt_movimento() {
        return ext_movimento;
    }

    public void setExt_movimento(String ext_movimento) {
        this.ext_movimento = ext_movimento;
    }

    public double getExt_debito() {
        return ext_debito;
    }

    public void setExt_debito(double ext_debito) {
        this.ext_debito = ext_debito;
    }

    public double getExt_credito() {
        return ext_credito;
    }

    public void setExt_credito(double ext_credito) {
        this.ext_credito = ext_credito;
    }

    public Date getExt_data() {
        return ext_data;
    }

    public void setExt_data(Date ext_data) {
        this.ext_data = ext_data;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public double getExt_saldo() {
        return ext_saldo;
    }

    public void setExt_saldo(double ext_saldo) {
        this.ext_saldo = ext_saldo;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
