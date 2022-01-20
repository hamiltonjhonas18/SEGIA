/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.co.centralserver.model.recursoshumanos;

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
@Table(name="Administracao")
public class Administracao implements Serializable {
    
    @Id
    @GeneratedValue
    private int adm_id;
    private String adm_nome;
    
    @ManyToOne
    private Entidade empresa;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }


    public int getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(int adm_id) {
        this.adm_id = adm_id;
    }

    public String getAdm_nome() {
        return adm_nome;
    }

    public void setAdm_nome(String adm_nome) {
        this.adm_nome = adm_nome;
    }

    public Entidade getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Entidade empresa) {
        this.empresa = empresa;
    }
    
    
}
