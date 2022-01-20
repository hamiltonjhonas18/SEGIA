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

/**
 *
 * @author hamil
 */
@Entity
@Table(name="horas")
public class Horas implements Serializable {
   
    @Id
    @GeneratedValue
    private int hora_id;
    
    private String hora_obseravoes;
    private String hora_categoria;
    
    private int hora_duracao;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date hora_data;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Entidade Entidade;

    private boolean encrypted;

    public int getHora_id() {
        return hora_id;
    }

    public void setHora_id(int hora_id) {
        this.hora_id = hora_id;
    }

    public String getHora_obseravoes() {
        return hora_obseravoes;
    }

    public void setHora_obseravoes(String hora_obseravoes) {
        this.hora_obseravoes = hora_obseravoes;
    }

    public int getHora_duracao() {
        return hora_duracao;
    }

    public void setHora_duracao(int hora_duracao) {
        this.hora_duracao = hora_duracao;
    }

    public Date getHora_data() {
        return hora_data;
    }

    public void setHora_data(Date hora_data) {
        this.hora_data = hora_data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public String getHora_categoria() {
        return hora_categoria;
    }

    public void setHora_categoria(String hora_categoria) {
        this.hora_categoria = hora_categoria;
    }

}
