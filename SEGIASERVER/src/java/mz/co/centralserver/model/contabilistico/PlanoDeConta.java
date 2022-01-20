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
 * @author User
 */
@Entity
@Table(name = "PlanoDeConta")
public class PlanoDeConta implements Serializable {

    @Id
    @GeneratedValue
    private int pdc_id;
    private String pdc_codigo;
    private String pdc_descricao;

    @ManyToOne
    private PlanoDeConta planoDeConta;

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

    public int getPdc_id() {
        return pdc_id;
    }

    public void setPdc_id(int pdc_id) {
        this.pdc_id = pdc_id;
    }

    public String getPdc_codigo() {
        return pdc_codigo;
    }

    public void setPdc_codigo(String pdc_codigo) {
        this.pdc_codigo = pdc_codigo;
    }

    public String getPdc_descricao() {
        return pdc_descricao;
    }

    public void setPdc_descricao(String pdc_descricao) {
        this.pdc_descricao = pdc_descricao;
    }

    public PlanoDeConta getPlanoDeConta() {
        return planoDeConta;
    }

    public void setPlanoDeConta(PlanoDeConta planoDeConta) {
        this.planoDeConta = planoDeConta;
    }

}
