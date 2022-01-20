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
 * 
 * @author HJC2K8
 */
@Entity
@Table(name="DisciplinaDocente")
public class DisciplinaDocente implements Serializable {
    
    @Id
    @GeneratedValue
    private int disd_id;
    
    @ManyToOne
    private Disciplina disciplina;
    
    @ManyToOne
    private Docente docente;
    
    @ManyToOne
    private Entidade entidade;

    public int getDisd_id() {
        return disd_id;
    }

    public void setDisd_id(int disd_id) {
        this.disd_id = disd_id;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
    
    
}
