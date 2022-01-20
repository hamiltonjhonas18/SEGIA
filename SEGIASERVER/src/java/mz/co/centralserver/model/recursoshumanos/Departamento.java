/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */

package mz.co.centralserver.model.recursoshumanos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.NivelPrioridade;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Departamento")
public class Departamento implements Serializable {
    
    @Id
    @GeneratedValue
    private int dep_id;
    private String dep_nome;

    @ManyToOne
    private Administracao administracao;
    
    @ManyToOne
    private NivelPrioridade nivelPrioridade;
    
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
    
    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_nome() {
        return dep_nome;
    }

    public void setDep_nome(String dep_nome) {
        this.dep_nome = dep_nome;
    }

    public Administracao getAdministracao() {
        return administracao;
    }

    public void setAdministracao(Administracao administracao) {
        this.administracao = administracao;
    }

    public NivelPrioridade getNivelPrioridade() {
        return nivelPrioridade;
    }

    public void setNivelPrioridade(NivelPrioridade nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }
    
    
}
