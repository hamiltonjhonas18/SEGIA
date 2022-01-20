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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="CategoriaProduto")
public class CategoriaProduto implements Serializable {
   
    @Id
    @GeneratedValue
    private int catp_id;
    
    private String catp_descricao;
    
    private String catp_codigo;
    
    private boolean catp_estocado;
    
    private int catp_numeroArtigos;
    
    private int catp_referenciaArtigos;
    
    @ManyToOne
    private Entidade Entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public int getCatp_id() {
        return catp_id;
    }

    public void setCatp_id(int catp_id) {
        this.catp_id = catp_id;
    }

    public String getCatp_descricao() {
        return catp_descricao;
    }

    public void setCatp_descricao(String catp_descricao) {
        this.catp_descricao = catp_descricao;
    }

    public boolean isCatp_estocado() {
        return catp_estocado;
    }

    public void setCatp_estocado(boolean catp_estocado) {
        this.catp_estocado = catp_estocado;
    }

    public String getCatp_codigo() {
        return catp_codigo;
    }

    public void setCatp_codigo(String catp_codigo) {
        this.catp_codigo = catp_codigo;
    }

    public int getCatp_numeroArtigos() {
        return catp_numeroArtigos;
    }

    public void setCatp_numeroArtigos(int catp_numeroArtigos) {
        this.catp_numeroArtigos = catp_numeroArtigos;
    }

    public int getCatp_referenciaArtigos() {
        return catp_referenciaArtigos;
    }

    public void setCatp_referenciaArtigos(int catp_referenciaArtigos) {
        this.catp_referenciaArtigos = catp_referenciaArtigos;
    }
    
    
}
