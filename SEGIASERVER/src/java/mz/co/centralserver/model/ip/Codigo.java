/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ip;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author hamil
 */
@Entity
@Table(name = "codigo")
public class Codigo implements Serializable {

    @Id
    @GeneratedValue
    private int cod_id;

    private String cod_descricao;

    private String cod_codigo;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public int getCod_id() {
        return cod_id;
    }

    public void setCod_id(int cod_id) {
        this.cod_id = cod_id;
    }

    public String getCod_descricao() {
        return cod_descricao;
    }

    public void setCod_descricao(String cod_descricao) {
        this.cod_descricao = cod_descricao;
    }

    public String getCod_codigo() {
        return cod_codigo;
    }

    public void setCod_codigo(String cod_codigo) {
        this.cod_codigo = cod_codigo;
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
