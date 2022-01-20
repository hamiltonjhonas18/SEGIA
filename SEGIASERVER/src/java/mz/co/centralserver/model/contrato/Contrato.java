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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author hamil
 */
@Entity
@Table(name = "contrato")
public class Contrato implements Serializable {

    @Id
    @GeneratedValue
    private int cont_id;

    private int cont_execucaoFisica;

    private String cont_referencia;

    private String cont_referencia_2;

    @Lob
    private String cont_link;

    @Lob
    private String cont_descricao;

    @Lob
    private String cont_empreteiro;

    private String cont_gestor;

    private String cont_tipoVisto;

    @Lob
    private String cont_linkVisto;

    @Lob
    private String cont_fonteFinacimento;

    @Lob
    private String cont_observacoes;

    private double cont_valor;

    private double cont_execucaoFinanceira;

    private double cont_valorExecutar;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cont_data;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cont_dataConclusao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cont_dataVisto;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cont_dataEntrega;

    @ManyToOne
    private Entidade entidade;


    private boolean encrypted;

    public int getCont_id() {
        return cont_id;
    }

    public void setCont_id(int cont_id) {
        this.cont_id = cont_id;
    }

    public String getCont_referencia() {
        return cont_referencia;
    }

    public void setCont_referencia(String cont_referencia) {
        this.cont_referencia = cont_referencia;
    }

    public String getCont_descricao() {
        return cont_descricao;
    }

    public void setCont_descricao(String cont_descricao) {
        this.cont_descricao = cont_descricao;
    }

    public String getCont_empreteiro() {
        return cont_empreteiro;
    }

    public void setCont_empreteiro(String cont_empreteiro) {
        this.cont_empreteiro = cont_empreteiro;
    }

    public String getCont_gestor() {
        return cont_gestor;
    }

    public void setCont_gestor(String cont_gestor) {
        this.cont_gestor = cont_gestor;
    }

    public String getCont_fonteFinacimento() {
        return cont_fonteFinacimento;
    }

    public void setCont_fonteFinacimento(String cont_fonteFinacimento) {
        this.cont_fonteFinacimento = cont_fonteFinacimento;
    }

    public String getCont_observacoes() {
        return cont_observacoes;
    }

    public void setCont_observacoes(String cont_observacoes) {
        this.cont_observacoes = cont_observacoes;
    }

    public double getCont_valor() {
        return cont_valor;
    }

    public void setCont_valor(double cont_valor) {
        this.cont_valor = cont_valor;
    }

    public double getCont_execucaoFinanceira() {
        return cont_execucaoFinanceira;
    }

    public void setCont_execucaoFinanceira(double cont_execucaoFinanceira) {
        this.cont_execucaoFinanceira = cont_execucaoFinanceira;
    }

    public double getCont_valorExecutar() {
        return cont_valorExecutar;
    }

    public void setCont_valorExecutar(double cont_valorExecutar) {
        this.cont_valorExecutar = cont_valorExecutar;
    }

    public Date getCont_data() {
        return cont_data;
    }

    public void setCont_data(Date cont_data) {
        this.cont_data = cont_data;
    }

    public Date getCont_dataConclusao() {
        return cont_dataConclusao;
    }

    public void setCont_dataConclusao(Date cont_dataConclusao) {
        this.cont_dataConclusao = cont_dataConclusao;
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

    public String getCont_link() {
        return cont_link;
    }

    public void setCont_link(String cont_link) {
        this.cont_link = cont_link;
    }

    public int getCont_execucaoFisica() {
        return cont_execucaoFisica;
    }

    public void setCont_execucaoFisica(int cont_execucaoFisica) {
        this.cont_execucaoFisica = cont_execucaoFisica;
    }

    public Date getCont_dataVisto() {
        return cont_dataVisto;
    }

    public void setCont_dataVisto(Date cont_dataVisto) {
        this.cont_dataVisto = cont_dataVisto;
    }

    public Date getCont_dataEntrega() {
        return cont_dataEntrega;
    }

    public void setCont_dataEntrega(Date cont_dataEntrega) {
        this.cont_dataEntrega = cont_dataEntrega;
    }

    public String getCont_tipoVisto() {
        return cont_tipoVisto;
    }

    public void setCont_tipoVisto(String cont_tipoVisto) {
        this.cont_tipoVisto = cont_tipoVisto;
    }

    public String getCont_linkVisto() {
        return cont_linkVisto;
    }

    public void setCont_linkVisto(String cont_linkVisto) {
        this.cont_linkVisto = cont_linkVisto;
    }

    public String getCont_referencia_2() {
        return cont_referencia_2;
    }

    public void setCont_referencia_2(String cont_referencia_2) {
        this.cont_referencia_2 = cont_referencia_2;
    }

}
