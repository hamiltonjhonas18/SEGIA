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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Movimento")
public class Movimento implements Serializable {

    @Id
    @GeneratedValue
    private int mov_id;

    private String mov_benefeciario;

    private double mov_saldo;
    private double mov_credito;
    private double mov_debito;
    
    private String mov_nrCheque;
    
    private String mov_referencia;
    
    @Lob
    private String mov_detalhes;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date mov_data;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date mov_dataEmissao;

    @ManyToOne
    private Banco banco;
    
    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Entidade entidade;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public double getMov_credito() {
        return mov_credito;
    }

    public void setMov_credito(double mov_credito) {
        this.mov_credito = mov_credito;
    }

    public double getMov_debito() {
        return mov_debito;
    }

    public void setMov_debito(double mov_debito) {
        this.mov_debito = mov_debito;
    }

    public int getMov_id() {
        return mov_id;
    }

    public void setMov_id(int mov_id) {
        this.mov_id = mov_id;
    }

    public String getMov_benefeciario() {
        return mov_benefeciario;
    }

    public void setMov_benefeciario(String mov_benefeciario) {
        this.mov_benefeciario = mov_benefeciario;
    }

    public double getMov_saldo() {
        return mov_saldo;
    }

    public void setMov_saldo(double mov_saldo) {
        this.mov_saldo = mov_saldo;
    }

    public String getMov_nrCheque() {
        return mov_nrCheque;
    }

    public void setMov_nrCheque(String mov_nrCheque) {
        this.mov_nrCheque = mov_nrCheque;
    }

    public Date getMov_data() {
        return mov_data;
    }

    public void setMov_data(Date mov_data) {
        this.mov_data = mov_data;
    }

    public Date getMov_dataEmissao() {
        return mov_dataEmissao;
    }

    public void setMov_dataEmissao(Date mov_dataEmissao) {
        this.mov_dataEmissao = mov_dataEmissao;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMov_referencia() {
        return mov_referencia;
    }

    public void setMov_referencia(String mov_referencia) {
        this.mov_referencia = mov_referencia;
    }

    public String getMov_detalhes() {
        return mov_detalhes;
    }

    public void setMov_detalhes(String mov_detalhes) {
        this.mov_detalhes = mov_detalhes;
    }

}
