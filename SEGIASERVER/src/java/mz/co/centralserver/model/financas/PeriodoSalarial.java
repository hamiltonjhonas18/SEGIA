/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.financas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "periodosalarial")
public class PeriodoSalarial implements Serializable {

    @Id
    @GeneratedValue
    private int pers_id;

    private String pers_descricao;

     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pers_data;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Usuario usuarioVerifica;

    @ManyToOne
    private Usuario usuarioAutoriza;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getPers_id() {
        return pers_id;
    }

    public void setPers_id(int pers_id) {
        this.pers_id = pers_id;
    }

    public String getPers_descricao() {
        return pers_descricao;
    }

    public void setPers_descricao(String pers_descricao) {
        this.pers_descricao = pers_descricao;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioVerifica() {
        return usuarioVerifica;
    }

    public void setUsuarioVerifica(Usuario usuarioVerifica) {
        this.usuarioVerifica = usuarioVerifica;
    }

    public Usuario getUsuarioAutoriza() {
        return usuarioAutoriza;
    }

    public void setUsuarioAutoriza(Usuario usuarioAutoriza) {
        this.usuarioAutoriza = usuarioAutoriza;
    }

    public Date getPers_data() {
        return pers_data;
    }

    public void setPers_data(Date pers_data) {
        this.pers_data = pers_data;
    }

}
