/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.gestao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="segmento")
public class Segmento implements Serializable {
    
    @Id
    @GeneratedValue
    private int seg_id;
    
    private String seg_descricao;
    
    private String seg_categoria;
    
    private int seg_numero;
 
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getSeg_id() {
        return seg_id;
    }

    public void setSeg_id(int seg_id) {
        this.seg_id = seg_id;
    }

    public String getSeg_descricao() {
        return seg_descricao;
    }

    public void setSeg_descricao(String seg_descricao) {
        this.seg_descricao = seg_descricao;
    }

    public String getSeg_categoria() {
        return seg_categoria;
    }

    public void setSeg_categoria(String seg_categoria) {
        this.seg_categoria = seg_categoria;
    }

    public int getSeg_numero() {
        return seg_numero;
    }

    public void setSeg_numero(int seg_numero) {
        this.seg_numero = seg_numero;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    
}
