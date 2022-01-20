package mz.co.centralserver.model.controleacesso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
@Table(name="Browser")
public class Browser implements Serializable {
   
    @Id
    @GeneratedValue
    private int bro_id;
    
    private String bro_descricao;
    
    private String bro_lembre;
    
    @ManyToOne
    private Usuario usuario;
    
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date bro_data;


    public int getBro_id() {
        return bro_id;
    }

    public void setBro_id(int bro_id) {
        this.bro_id = bro_id;
    }

    public String getBro_descricao() {
        return bro_descricao;
    }

    public void setBro_descricao(String bro_descricao) {
        this.bro_descricao = bro_descricao;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getBro_data() {
        return bro_data;
    }

    public void setBro_data(Date bro_data) {
        this.bro_data = bro_data;
    }

    public String getBro_lembre() {
        return bro_lembre;
    }

    public void setBro_lembre(String bro_lembre) {
        this.bro_lembre = bro_lembre;
    }
    
    
}
