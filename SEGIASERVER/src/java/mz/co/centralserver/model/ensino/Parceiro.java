/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ensino;

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
@Table(name="parceiro")
public class Parceiro implements Serializable {
    
    @Id
    @GeneratedValue
    private int parc_id;
    
    private String parc_descricao;
    
    private String parc_pessoaContacto;
    
    private String parc_endereco;
    
    private String parc_nuit;
    
    private String parc_contacto;
    
    private String parc_areaActuacao;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getParc_id() {
        return parc_id;
    }

    public void setParc_id(int parc_id) {
        this.parc_id = parc_id;
    }

    public String getParc_descricao() {
        return parc_descricao;
    }

    public void setParc_descricao(String parc_descricao) {
        this.parc_descricao = parc_descricao;
    }

    public String getParc_pessoaContacto() {
        return parc_pessoaContacto;
    }

    public void setParc_pessoaContacto(String parc_pessoaContacto) {
        this.parc_pessoaContacto = parc_pessoaContacto;
    }

    public String getParc_endereco() {
        return parc_endereco;
    }

    public void setParc_endereco(String parc_endereco) {
        this.parc_endereco = parc_endereco;
    }

    public String getParc_nuit() {
        return parc_nuit;
    }

    public void setParc_nuit(String parc_nuit) {
        this.parc_nuit = parc_nuit;
    }

    public String getParc_contacto() {
        return parc_contacto;
    }

    public void setParc_contacto(String parc_contacto) {
        this.parc_contacto = parc_contacto;
    }

    public String getParc_areaActuacao() {
        return parc_areaActuacao;
    }

    public void setParc_areaActuacao(String parc_areaActuacao) {
        this.parc_areaActuacao = parc_areaActuacao;
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
