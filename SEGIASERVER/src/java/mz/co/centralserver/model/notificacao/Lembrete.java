/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.notificacao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author Hamilton Jhonas
 */
@Entity
@Table(name="lembrete")
public class Lembrete implements Serializable {
 
    @Id
    @GeneratedValue
    private int lemb_id;
    
    private String lemb_descricao;
    
    private String lemb_referencia;
    
    @Lob
    private String lemb_detalhes;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date lemb_data;
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean lemb_sent;
    
    private boolean encrypted;

    public int getLemb_id() {
        return lemb_id;
    }

    public void setLemb_id(int lemb_id) {
        this.lemb_id = lemb_id;
    }

    public String getLemb_descricao() {
        return lemb_descricao;
    }

    public void setLemb_descricao(String lemb_descricao) {
        this.lemb_descricao = lemb_descricao;
    }

    public String getLemb_detalhes() {
        return lemb_detalhes;
    }

    public void setLemb_detalhes(String lemb_detalhes) {
        this.lemb_detalhes = lemb_detalhes;
    }

    public Date getLemb_data() {
        return lemb_data;
    }

    public void setLemb_data(Date lemb_data) {
        this.lemb_data = lemb_data;
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

    public boolean isLemb_sent() {
        return lemb_sent;
    }

    public void setLemb_sent(boolean lemb_sent) {
        this.lemb_sent = lemb_sent;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public String getLemb_referencia() {
        return lemb_referencia;
    }

    public void setLemb_referencia(String lemb_referencia) {
        this.lemb_referencia = lemb_referencia;
    }
    
    
}
