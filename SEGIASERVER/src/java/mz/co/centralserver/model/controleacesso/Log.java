/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.controleacesso;

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
@Table(name="Log")
public class Log implements Serializable {
 
    @Id
    @GeneratedValue
    
    private int log_id;
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date log_data;
    private String log_descricao;
    private String log_hora;
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Sistema sistema;

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
    

    public int getLog_id() {
        return log_id;
    }

    public void setLog_id(int log_id) {
        this.log_id = log_id;
    }

    public Date getLog_data() {
        return log_data;
    }

    public void setLog_data(Date log_data) {
        this.log_data = log_data;
    }

    public String getLog_descricao() {
        return log_descricao;
    }

    public void setLog_descricao(String log_descricao) {
        this.log_descricao = log_descricao;
    }

    public String getLog_hora() {
        return log_hora;
    }

    public void setLog_hora(String log_hora) {
        this.log_hora = log_hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    
    
    
    
}
