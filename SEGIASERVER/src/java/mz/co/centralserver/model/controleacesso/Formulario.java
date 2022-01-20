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
@Table(name="formulario")
public class Formulario implements Serializable {
    
    @Id
    @GeneratedValue
    private int form_id;
    
    private String form_descricao;
    
    private String form_referencia;
    
    @ManyToOne
    private Sistema sistema;

    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
    }

    public String getForm_descricao() {
        return form_descricao;
    }

    public void setForm_descricao(String form_descricao) {
        this.form_descricao = form_descricao;
    }

    public String getForm_referencia() {
        return form_referencia;
    }

    public void setForm_referencia(String form_referencia) {
        this.form_referencia = form_referencia;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    
    
}
