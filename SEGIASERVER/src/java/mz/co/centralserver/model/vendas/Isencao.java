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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="isencao")
public class Isencao implements Serializable{
    
    @Id
    @GeneratedValue
    private int isen_id;
    
    @Lob
    private String isen_descricao;
    
    private String isen_codigo;
    
    @Lob
    private String isen_detalhes;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public int getIsen_id() {
        return isen_id;
    }

    public void setIsen_id(int isen_id) {
        this.isen_id = isen_id;
    }

    public String getIsen_descricao() {
        return isen_descricao;
    }

    public void setIsen_descricao(String isen_descricao) {
        this.isen_descricao = isen_descricao;
    }

    public String getIsen_codigo() {
        return isen_codigo;
    }

    public void setIsen_codigo(String isen_codigo) {
        this.isen_codigo = isen_codigo;
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

    public String getIsen_detalhes() {
        return isen_detalhes;
    }

    public void setIsen_detalhes(String isen_detalhes) {
        this.isen_detalhes = isen_detalhes;
    }
    
    
}
