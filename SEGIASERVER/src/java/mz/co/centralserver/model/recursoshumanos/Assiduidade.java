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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="Assiduidade")
public class Assiduidade implements Serializable {
    
    @Id
    @GeneratedValue
    private int assi_id;
    
    private String assi_horaEntrada;
    private String assi_horaSaida;
    
     @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date assi_data;
    
    @ManyToOne
    private Pessoa pessoa;

    
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


    public int getAssi_id() {
        return assi_id;
    }

    public void setAssi_id(int assi_id) {
        this.assi_id = assi_id;
    }

    public String getAssi_horaEntrada() {
        return assi_horaEntrada;
    }

    public void setAssi_horaEntrada(String assi_horaEntrada) {
        this.assi_horaEntrada = assi_horaEntrada;
    }

    public String getAssi_horaSaida() {
        return assi_horaSaida;
    }

    public void setAssi_horaSaida(String assi_horaSaida) {
        this.assi_horaSaida = assi_horaSaida;
    }

    public Date getAssi_data() {
        return assi_data;
    }

    public void setAssi_data(Date assi_data) {
        this.assi_data = assi_data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
