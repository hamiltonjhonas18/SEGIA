/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.contabilistico;

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
@Table(name = "Pety")
public class Pety implements Serializable {

    @Id
    @GeneratedValue
    private int pety_id;

    private String pety_periodo;

    private double pety_valortotal;

    private double pety_valorrestante;

    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public int getPety_id() {
        return pety_id;
    }

    public void setPety_id(int pety_id) {
        this.pety_id = pety_id;
    }

    public String getPety_periodo() {
        return pety_periodo;
    }

    public void setPety_periodo(String pety_periodo) {
        this.pety_periodo = pety_periodo;
    }

    public double getPety_valortotal() {
        return pety_valortotal;
    }

    public void setPety_valortotal(double pety_valortotal) {
        this.pety_valortotal = pety_valortotal;
    }

    public double getPety_valorrestante() {
        return pety_valorrestante;
    }

    public void setPety_valorrestante(double pety_valorrestante) {
        this.pety_valorrestante = pety_valorrestante;
    }

}
