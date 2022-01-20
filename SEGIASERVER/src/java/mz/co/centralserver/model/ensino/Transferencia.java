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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author 25884
 */
@Entity
@Table(name = "Transferencia")
public class Transferencia implements Serializable {

    @Id
    @GeneratedValue
    private int trans_id;

    private String trans_status;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date trans_data;
    
    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Entidade entidade;
    
    @ManyToOne
    private Entidade entidade2;

    public int getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public String getTrans_status() {
        return trans_status;
    }

    public void setTrans_status(String trans_status) {
        this.trans_status = trans_status;
    }

    public Date getTrans_data() {
        return trans_data;
    }

    public void setTrans_data(Date trans_data) {
        this.trans_data = trans_data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Entidade getEntidade2() {
        return entidade2;
    }

    public void setEntidade2(Entidade entidade2) {
        this.entidade2 = entidade2;
    }
    
    

}
