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
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Departamento;

/**
 *
 * @author Hamilton Jhonas
 */
@Entity
@Table(name = "caixa")
public class Caixa implements Serializable {

    @Id
    @GeneratedValue
    private int caix_id;

    private String caix_descricao;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Departamento departamento;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public int getCaix_id() {
        return caix_id;
    }

    public void setCaix_id(int caix_id) {
        this.caix_id = caix_id;
    }

    public String getCaix_descricao() {
        return caix_descricao;
    }

    public void setCaix_descricao(String caix_descricao) {
        this.caix_descricao = caix_descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
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
