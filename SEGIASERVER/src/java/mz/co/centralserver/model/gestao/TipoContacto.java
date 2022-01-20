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
 * @author User
 */
@Entity
@Table(name="TipoContacto")
public class TipoContacto implements Serializable {
   
    @Id
    @GeneratedValue
    private int tipc_id;
    private String tipc_nome;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getTipc_id() {
        return tipc_id;
    }

    public void setTipc_id(int tipc_id) {
        this.tipc_id = tipc_id;
    }

    public String getTipc_nome() {
        return tipc_nome;
    }

    public void setTipc_nome(String tipc_nome) {
        this.tipc_nome = tipc_nome;
    }
    
    
}
