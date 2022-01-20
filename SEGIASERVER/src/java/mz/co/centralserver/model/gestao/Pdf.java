/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.model.gestao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "Pdf")
public class Pdf implements Serializable {

    @Id
    @GeneratedValue
    private int pdf_id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pdf_data;

    private String pdf_hora;
    private String pdf_descricaoDocumento;
    private String pdf_tipoDocumento;
    private String pdf_nomeDocumento;
    private String pdf_subPath;

    @ManyToOne
    private Entidade entidade;
    
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getPdf_id() {
        return pdf_id;
    }

    public void setPdf_id(int pdf_id) {
        this.pdf_id = pdf_id;
    }

    public Date getPdf_data() {
        return pdf_data;
    }

    public void setPdf_data(Date pdf_data) {
        this.pdf_data = pdf_data;
    }

    public String getPdf_descricaoDocumento() {
        return pdf_descricaoDocumento;
    }

    public void setPdf_descricaoDocumento(String pdf_descricaoDocumento) {
        this.pdf_descricaoDocumento = pdf_descricaoDocumento;
    }

    public String getPdf_tipoDocumento() {
        return pdf_tipoDocumento;
    }

    public void setPdf_tipoDocumento(String pdf_tipoDocumento) {
        this.pdf_tipoDocumento = pdf_tipoDocumento;
    }

    public String getPdf_nomeDocumento() {
        return pdf_nomeDocumento;
    }

    public void setPdf_nomeDocumento(String pdf_nomeDocumento) {
        this.pdf_nomeDocumento = pdf_nomeDocumento;
    }

    public String getPdf_subPath() {
        return pdf_subPath;
    }

    public void setPdf_subPath(String pdf_subPath) {
        this.pdf_subPath = pdf_subPath;
    }

    public String getPdf_hora() {
        return pdf_hora;
    }

    public void setPdf_hora(String pdf_hora) {
        this.pdf_hora = pdf_hora;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

}
