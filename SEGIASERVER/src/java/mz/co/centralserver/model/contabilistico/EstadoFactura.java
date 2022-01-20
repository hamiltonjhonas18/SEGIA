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
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "EstadoFactura")
public class EstadoFactura implements Serializable {

    @Id
    @GeneratedValue
    private int estf_id;
    private String estf_descricao;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getEstf_id() {
        return estf_id;
    }

    public void setEstf_id(int estf_id) {
        this.estf_id = estf_id;
    }

    public String getEstf_descricao() {
        return estf_descricao;
    }

    public void setEstf_descricao(String estf_descricao) {
        this.estf_descricao = estf_descricao;
    }

}
