/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.financas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Funcionario;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "FolhaSalarial")
public class FolhaSalarial implements Serializable {

    @Id
    @GeneratedValue

    private int fls_id;

    private double fls_salario;
    private double fls_coeficiente;
    private double fls_IRPS;
    private double fls_dependentes;
    private double fls_limiteInferior;
    private double fls_desconto;
    private double fls_bonus;

    private String fls_periodo;
    private String fls_referencia;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fls_data;

    @ManyToOne
    private Funcionario funcionario;
    
    @ManyToOne
    private Entidade entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getFls_id() {
        return fls_id;
    }

    public void setFls_id(int fls_id) {
        this.fls_id = fls_id;
    }

    public double getFls_salario() {
        return fls_salario;
    }

    public void setFls_salario(double fls_salario) {
        this.fls_salario = fls_salario;
    }

    public double getFls_desconto() {
        return fls_desconto;
    }

    public void setFls_desconto(double fls_desconto) {
        this.fls_desconto = fls_desconto;
    }

    public double getFls_bonus() {
        return fls_bonus;
    }

    public void setFls_bonus(double fls_bonus) {
        this.fls_bonus = fls_bonus;
    }

    public String getFls_periodo() {
        return fls_periodo;
    }

    public void setFls_periodo(String fls_periodo) {
        this.fls_periodo = fls_periodo;
    }

    public Date getFls_data() {
        return fls_data;
    }

    public void setFls_data(Date fls_data) {
        this.fls_data = fls_data;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public double getFls_coeficiente() {
        return fls_coeficiente;
    }

    public void setFls_coeficiente(double fls_coeficiente) {
        this.fls_coeficiente = fls_coeficiente;
    }

    public double getFls_IRPS() {
        return fls_IRPS;
    }

    public void setFls_IRPS(double fls_IRPS) {
        this.fls_IRPS = fls_IRPS;
    }

    public double getFls_dependentes() {
        return fls_dependentes;
    }

    public void setFls_dependentes(double fls_dependentes) {
        this.fls_dependentes = fls_dependentes;
    }

    public double getFls_limiteInferior() {
        return fls_limiteInferior;
    }

    public void setFls_limiteInferior(double fls_limiteInferior) {
        this.fls_limiteInferior = fls_limiteInferior;
    }

    public String getFls_referencia() {
        return fls_referencia;
    }

    public void setFls_referencia(String fls_referencia) {
        this.fls_referencia = fls_referencia;
    }

}
