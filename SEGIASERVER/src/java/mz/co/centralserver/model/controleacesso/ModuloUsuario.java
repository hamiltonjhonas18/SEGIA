/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

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

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="ModuloUsuario")
public class ModuloUsuario implements Serializable {
    
    @Id
    @GeneratedValue
    private int modu_id;
    
    private String modu_referencia;
    
    private int modu_visitas;
    
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modu_dataUltimoLogin;
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private ModuloAcesso moduloAcesso;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getModu_id() {
        return modu_id;
    }

    public void setModu_id(int modu_id) {
        this.modu_id = modu_id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ModuloAcesso getModuloAcesso() {
        return moduloAcesso;
    }

    public void setModuloAcesso(ModuloAcesso moduloAcesso) {
        this.moduloAcesso = moduloAcesso;
    }

    public String getModu_referencia() {
        return modu_referencia;
    }

    public void setModu_referencia(String modu_referencia) {
        this.modu_referencia = modu_referencia;
    }

    public int getModu_visitas() {
        return modu_visitas;
    }

    public void setModu_visitas(int modu_visitas) {
        this.modu_visitas = modu_visitas;
    }

    public Date getModu_dataUltimoLogin() {
        return modu_dataUltimoLogin;
    }

    public void setModu_dataUltimoLogin(Date modu_dataUltimoLogin) {
        this.modu_dataUltimoLogin = modu_dataUltimoLogin;
    }
    
    
            
}
