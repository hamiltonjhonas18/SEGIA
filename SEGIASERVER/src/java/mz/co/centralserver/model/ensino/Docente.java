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
import mz.co.centralserver.model.gestao.Pessoa;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name="docente")
public class Docente implements Serializable {
   
    @Id
    @GeneratedValue
    private int doce_id;
    
    private String doce_grauFormacao;
    
    private String doce_especialidade;
    
    private String doce_senha;
    
    private String doce_usuario;
    
    private String doce_categoria;
    
    private String doce_tipoContrato;
    
    private String doce_provincia;
    
    private boolean doce_activo;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date doce_validadeContrato;
    
    @ManyToOne
    private Pessoa pessoa;
    
    @ManyToOne
    private AreaFormacao areaFormacao;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getDoce_id() {
        return doce_id;
    }

    public void setDoce_id(int doce_id) {
        this.doce_id = doce_id;
    }

    public String getDoce_grauFormacao() {
        return doce_grauFormacao;
    }

    public void setDoce_grauFormacao(String doce_grauFormacao) {
        this.doce_grauFormacao = doce_grauFormacao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getDoce_senha() {
        return doce_senha;
    }

    public void setDoce_senha(String doce_senha) {
        this.doce_senha = doce_senha;
    }

    public String getDoce_usuario() {
        return doce_usuario;
    }

    public void setDoce_usuario(String doce_usuario) {
        this.doce_usuario = doce_usuario;
    }

    public String getDoce_especialidade() {
        return doce_especialidade;
    }

    public void setDoce_especialidade(String doce_especialidade) {
        this.doce_especialidade = doce_especialidade;
    }

    public AreaFormacao getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(AreaFormacao areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getDoce_categoria() {
        return doce_categoria;
    }

    public void setDoce_categoria(String doce_categoria) {
        this.doce_categoria = doce_categoria;
    }

    public boolean isDoce_activo() {
        return doce_activo;
    }

    public void setDoce_activo(boolean doce_activo) {
        this.doce_activo = doce_activo;
    }

    public String getDoce_tipoContrato() {
        return doce_tipoContrato;
    }

    public void setDoce_tipoContrato(String doce_tipoContrato) {
        this.doce_tipoContrato = doce_tipoContrato;
    }

    public Date getDoce_validadeContrato() {
        return doce_validadeContrato;
    }

    public void setDoce_validadeContrato(Date doce_validadeContrato) {
        this.doce_validadeContrato = doce_validadeContrato;
    }

    public String getDoce_provincia() {
        return doce_provincia;
    }

    public void setDoce_provincia(String doce_provincia) {
        this.doce_provincia = doce_provincia;
    }
    
}
