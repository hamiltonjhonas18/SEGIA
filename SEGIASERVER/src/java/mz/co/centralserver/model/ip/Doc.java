/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ip;

import mz.co.centralserver.model.contrato.*;
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
import mz.co.centralserver.model.ensino.Escola;
import mz.co.centralserver.model.gestao.Entidade;
import mz.co.centralserver.model.recursoshumanos.Departamento;

/**
 *
 * @author hamil
 */
@Entity
@Table(name = "Doc")
public class Doc implements Serializable {

    @Id
    @GeneratedValue
    private int doc_id;

    private String doc_referencia;

    @Lob
    private String doc_link;

    @Lob
    private String doc_parecer;

    @Lob
    private String doc_despacho;

    @Lob
    private String doc_assunto;

    @Lob
    private String doc_texto;

    private String doc_tipo;

    private String doc_destinatario;

    private String doc_status;

    @Temporal(TemporalType.TIMESTAMP)
    private Date doc_data;

    @Temporal(TemporalType.TIMESTAMP)
    private Date doc_dataDespacho;

    @Temporal(TemporalType.TIMESTAMP)
    private Date doc_dataParecer;

    @ManyToOne
    private Codigo codigo;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Departamento departamento;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Usuario usuario2;

    @ManyToOne
    private Usuario usuario3;

    @ManyToOne
    private Escola escola;

    private boolean encrypted;

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getDoc_referencia() {
        return doc_referencia;
    }

    public void setDoc_referencia(String doc_referencia) {
        this.doc_referencia = doc_referencia;
    }

    public String getDoc_link() {
        return doc_link;
    }

    public void setDoc_link(String doc_link) {
        this.doc_link = doc_link;
    }

    public String getDoc_parecer() {
        return doc_parecer;
    }

    public void setDoc_parecer(String doc_parecer) {
        this.doc_parecer = doc_parecer;
    }

    public String getDoc_despacho() {
        return doc_despacho;
    }

    public void setDoc_despacho(String doc_despacho) {
        this.doc_despacho = doc_despacho;
    }

    public String getDoc_assunto() {
        return doc_assunto;
    }

    public void setDoc_assunto(String doc_assunto) {
        this.doc_assunto = doc_assunto;
    }

    public String getDoc_texto() {
        return doc_texto;
    }

    public void setDoc_texto(String doc_texto) {
        this.doc_texto = doc_texto;
    }

    public String getDoc_tipo() {
        return doc_tipo;
    }

    public void setDoc_tipo(String doc_tipo) {
        this.doc_tipo = doc_tipo;
    }

    public String getDoc_status() {
        return doc_status;
    }

    public void setDoc_status(String doc_status) {
        this.doc_status = doc_status;
    }

    public Date getDoc_data() {
        return doc_data;
    }

    public void setDoc_data(Date doc_data) {
        this.doc_data = doc_data;
    }

    public Date getDoc_dataDespacho() {
        return doc_dataDespacho;
    }

    public void setDoc_dataDespacho(Date doc_dataDespacho) {
        this.doc_dataDespacho = doc_dataDespacho;
    }

    public Date getDoc_dataParecer() {
        return doc_dataParecer;
    }

    public void setDoc_dataParecer(Date doc_dataParecer) {
        this.doc_dataParecer = doc_dataParecer;
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

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }

    public Usuario getUsuario3() {
        return usuario3;
    }

    public void setUsuario3(Usuario usuario3) {
        this.usuario3 = usuario3;
    }

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public String getDoc_destinatario() {
        return doc_destinatario;
    }

    public void setDoc_destinatario(String doc_destinatario) {
        this.doc_destinatario = doc_destinatario;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

}
