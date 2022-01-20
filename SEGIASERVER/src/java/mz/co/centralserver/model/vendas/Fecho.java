/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.vendas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author hamil
 */
@Entity
@Table(name = "Fecho")
public class Fecho implements Serializable {

    @Id
    @GeneratedValue
    private int fech_id;

    private String fech_referencia;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fech_data;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Entidade entidade;
    

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getFech_id() {
        return fech_id;
    }

    public void setFech_id(int fech_id) {
        this.fech_id = fech_id;
    }

    public String getFech_referencia() {
        return fech_referencia;
    }

    public void setFech_referencia(String fech_referencia) {
        this.fech_referencia = fech_referencia;
    }

    public Date getFech_data() {
        return fech_data;
    }

    public void setFech_data(Date fech_data) {
        this.fech_data = fech_data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
    
    
}
