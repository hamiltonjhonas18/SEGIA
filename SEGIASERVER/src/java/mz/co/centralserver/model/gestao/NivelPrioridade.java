/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.gestao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="NivelPrioridade")
public class NivelPrioridade implements Serializable {
    
    
    @Id
    @GeneratedValue
    private int nvp_id;
    
    private String nvp_descricao;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getNvp_id() {
        return nvp_id;
    }

    public void setNvp_id(int nvp_id) {
        this.nvp_id = nvp_id;
    }

    public String getNvp_descricao() {
        return nvp_descricao;
    }

    public void setNvp_descricao(String nvp_descricao) {
        this.nvp_descricao = nvp_descricao;
    }
    
    
}
