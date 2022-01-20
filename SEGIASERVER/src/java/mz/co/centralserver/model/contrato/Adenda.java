/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.contrato;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.controleacesso.Usuario;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author hamil
 */

@Entity
@Table(name="adenda")
public class Adenda implements Serializable {
    
    @Id
    @GeneratedValue
    private int aden_id;
    
    private String aden_referencia;
    
    private String aden_link;
    
    @Lob
    private String aden_detalhes;
    
    private String aden_status;
    
    private double aden_valor;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date aden_data;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date aden_dataAprovacao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date aden_dataJustificativo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date aden_dataAprovacaoRegiao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date aden_dataAprovacaoSede;
    
    @ManyToOne
    private Entidade entidade;
    
    @ManyToOne
    private Contrato contrato;
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Usuario usuario2;
    
    @ManyToOne
    private Usuario usuario3;
    
    private boolean encrypted;

    public int getAden_id() {
        return aden_id;
    }

    public void setAden_id(int aden_id) {
        this.aden_id = aden_id;
    }

    public String getAden_referencia() {
        return aden_referencia;
    }

    public void setAden_referencia(String aden_referencia) {
        this.aden_referencia = aden_referencia;
    }

    public String getAden_link() {
        return aden_link;
    }

    public void setAden_link(String aden_link) {
        this.aden_link = aden_link;
    }

    public String getAden_detalhes() {
        return aden_detalhes;
    }

    public void setAden_detalhes(String aden_detalhes) {
        this.aden_detalhes = aden_detalhes;
    }

    public String getAden_status() {
        return aden_status;
    }

    public void setAden_status(String aden_status) {
        this.aden_status = aden_status;
    }

    public double getAden_valor() {
        return aden_valor;
    }

    public void setAden_valor(double aden_valor) {
        this.aden_valor = aden_valor;
    }

    public Date getAden_data() {
        return aden_data;
    }

    public void setAden_data(Date aden_data) {
        this.aden_data = aden_data;
    }

    public Date getAden_dataAprovacao() {
        return aden_dataAprovacao;
    }

    public void setAden_dataAprovacao(Date aden_dataAprovacao) {
        this.aden_dataAprovacao = aden_dataAprovacao;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }


    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Usuario getUsuario3() {
        return usuario3;
    }

    public void setUsuario3(Usuario usuario3) {
        this.usuario3 = usuario3;
    }

    public Date getAden_dataJustificativo() {
        return aden_dataJustificativo;
    }

    public void setAden_dataJustificativo(Date aden_dataJustificativo) {
        this.aden_dataJustificativo = aden_dataJustificativo;
    }

    public Date getAden_dataAprovacaoRegiao() {
        return aden_dataAprovacaoRegiao;
    }

    public void setAden_dataAprovacaoRegiao(Date aden_dataAprovacaoRegiao) {
        this.aden_dataAprovacaoRegiao = aden_dataAprovacaoRegiao;
    }

    public Date getAden_dataAprovacaoSede() {
        return aden_dataAprovacaoSede;
    }

    public void setAden_dataAprovacaoSede(Date aden_dataAprovacaoSede) {
        this.aden_dataAprovacaoSede = aden_dataAprovacaoSede;
    }

    
    
}
