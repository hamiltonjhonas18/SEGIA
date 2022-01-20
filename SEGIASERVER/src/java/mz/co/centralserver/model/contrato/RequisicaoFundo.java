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
@Table(name = "requisicaofundo")
public class RequisicaoFundo implements Serializable {

    @Id
    @GeneratedValue
    private int reqf_id;

    private String reqf_referencia;

    @Lob
    private String reqf_link;

    @Lob
    private String reqf_linkJustificativo;

    @Lob
    private String reqf_detalhes;

    private String reqf_status;

    private String reqf_segmento;

    private double reqf_valor;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reqf_data;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reqf_dataAprovacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reqf_dataAprovacaoSede;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reqf_dataAprovacaoRegiao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqf_dataAprovacaoRH;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reqf_dataJustificativo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date reqf_dataAlteracao;

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

    @ManyToOne
    private Usuario usuario4;

    private boolean encrypted;

    public int getReqf_id() {
        return reqf_id;
    }

    public void setReqf_id(int reqf_id) {
        this.reqf_id = reqf_id;
    }

    public String getReqf_referencia() {
        return reqf_referencia;
    }

    public void setReqf_referencia(String reqf_referencia) {
        this.reqf_referencia = reqf_referencia;
    }

    public String getReqf_link() {
        return reqf_link;
    }

    public void setReqf_link(String reqf_link) {
        this.reqf_link = reqf_link;
    }

    public String getReqf_detalhes() {
        return reqf_detalhes;
    }

    public void setReqf_detalhes(String reqf_detalhes) {
        this.reqf_detalhes = reqf_detalhes;
    }

    public String getReqf_status() {
        return reqf_status;
    }

    public void setReqf_status(String reqf_status) {
        this.reqf_status = reqf_status;
    }

    public double getReqf_valor() {
        return reqf_valor;
    }

    public void setReqf_valor(double reqf_valor) {
        this.reqf_valor = reqf_valor;
    }

    public Date getReqf_data() {
        return reqf_data;
    }

    public void setReqf_data(Date reqf_data) {
        this.reqf_data = reqf_data;
    }

    public Date getReqf_dataAprovacao() {
        return reqf_dataAprovacao;
    }

    public void setReqf_dataAprovacao(Date reqf_dataAprovacao) {
        this.reqf_dataAprovacao = reqf_dataAprovacao;
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

    public Date getReqf_dataAprovacaoSede() {
        return reqf_dataAprovacaoSede;
    }

    public void setReqf_dataAprovacaoSede(Date reqf_dataAprovacaoSede) {
        this.reqf_dataAprovacaoSede = reqf_dataAprovacaoSede;
    }

    public Date getReqf_dataAprovacaoRegiao() {
        return reqf_dataAprovacaoRegiao;
    }

    public void setReqf_dataAprovacaoRegiao(Date reqf_dataAprovacaoRegiao) {
        this.reqf_dataAprovacaoRegiao = reqf_dataAprovacaoRegiao;
    }

    public Date getReqf_dataJustificativo() {
        return reqf_dataJustificativo;
    }

    public void setReqf_dataJustificativo(Date reqf_dataJustificativo) {
        this.reqf_dataJustificativo = reqf_dataJustificativo;
    }

    public String getReqf_segmento() {
        return reqf_segmento;
    }

    public void setReqf_segmento(String reqf_segmento) {
        this.reqf_segmento = reqf_segmento;
    }

    public String getReqf_linkJustificativo() {
        return reqf_linkJustificativo;
    }

    public void setReqf_linkJustificativo(String reqf_linkJustificativo) {
        this.reqf_linkJustificativo = reqf_linkJustificativo;
    }

    public Date getReqf_dataAlteracao() {
        return reqf_dataAlteracao;
    }

    public void setReqf_dataAlteracao(Date reqf_dataAlteracao) {
        this.reqf_dataAlteracao = reqf_dataAlteracao;
    }

    public Date getReqf_dataAprovacaoRH() {
        return reqf_dataAprovacaoRH;
    }

    public void setReqf_dataAprovacaoRH(Date reqf_dataAprovacaoRH) {
        this.reqf_dataAprovacaoRH = reqf_dataAprovacaoRH;
    }

    public Usuario getUsuario4() {
        return usuario4;
    }

    public void setUsuario4(Usuario usuario4) {
        this.usuario4 = usuario4;
    }

}
