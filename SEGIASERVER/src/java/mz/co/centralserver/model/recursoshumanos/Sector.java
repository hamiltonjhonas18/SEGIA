/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.recursoshumanos;

import mz.co.centralserver.model.recursoshumanos.Departamento;
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
@Table(name = "Sector")
public class Sector implements Serializable {

    @Id
    @GeneratedValue
    private int sec_id;
    private String sec_nome;

    @ManyToOne
    private Departamento departamento;

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

    public int getSec_id() {
        return sec_id;
    }

    public void setSec_id(int sec_id) {
        this.sec_id = sec_id;
    }

    public String getSec_nome() {
        return sec_nome;
    }

    public void setSec_nome(String sec_nome) {
        this.sec_nome = sec_nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
