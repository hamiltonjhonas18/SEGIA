package mz.co.centralserver.model.gestao;

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time you
 * generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */
/**
 * Licensee: License Type: Evaluation
 */
import java.io.Serializable;
import javax.persistence.*;

@Entity

@Table(name = "Entidade")
public class Entidade implements Serializable {

    @Id
    @GeneratedValue
    private int enti_id;

    private String enti_logotipo;

    private String enti_nome;

    private String enti_macServidor;

    private String enti_chaveSistema;

    private String enti_generoActividade;

    private String enti_estadoSistema;

    private String enti_linguaSistema;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date enti_dataInicioAssitencia;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date enti_dataFinalAssistencia;

    private String enti_pais;

    private String enti_endereco;

    private String enti_contactos1;

    private String enti_contactos2;

    private String enti_nuit;

    private boolean enti_newsletter;

    private String enti_codigoPostal;

    private String enti_dominio;
    
    private String enti_sigla;
    
    private String enti_contactos3;
    
    private String enti_email;
    
    private String enti_provincia;
    
    private String enti_delegacao;
    
    private String enti_distrito;
    
    private String enti_licenca;
    
    private String enti_pessoaContacto;
    
    
    private double enti_iva;
    
    private double enti_capital;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setEnti_id(int value) {
        this.enti_id = value;
    }

    public int getEnti_id() {
        return enti_id;
    }

    public void setEnti_logotipo(String value) {
        this.enti_logotipo = value;
    }

    public String getEnti_logotipo() {
        return enti_logotipo;
    }

    public void setEnti_nome(String value) {
        this.enti_nome = value;
    }

    public String getEnti_nome() {
        return enti_nome;
    }

    public void setEnti_macServidor(String value) {
        this.enti_macServidor = value;
    }

    public String getEnti_macServidor() {
        return enti_macServidor;
    }

    public void setEnti_chaveSistema(String value) {
        this.enti_chaveSistema = value;
    }

    public String getEnti_chaveSistema() {
        return enti_chaveSistema;
    }

    public void setEnti_generoActividade(String value) {
        this.enti_generoActividade = value;
    }

    public String getEnti_generoActividade() {
        return enti_generoActividade;
    }

    public void setEnti_estadoSistema(String value) {
        this.enti_estadoSistema = value;
    }

    public String getEnti_estadoSistema() {
        return enti_estadoSistema;
    }

    public void setEnti_linguaSistema(String value) {
        this.enti_linguaSistema = value;
    }

    public String getEnti_linguaSistema() {
        return enti_linguaSistema;
    }

    public void setEnti_dataInicioAssitencia(java.util.Date value) {
        this.enti_dataInicioAssitencia = value;
    }

    public java.util.Date getEnti_dataInicioAssitencia() {
        return enti_dataInicioAssitencia;
    }

    public void setEnti_dataFinalAssistencia(java.util.Date value) {
        this.enti_dataFinalAssistencia = value;
    }

    public java.util.Date getEnti_dataFinalAssistencia() {
        return enti_dataFinalAssistencia;
    }

    public void setEnti_pais(String value) {
        this.enti_pais = value;
    }

    public String getEnti_pais() {
        return enti_pais;
    }

    public void setEnti_contactos1(String value) {
        this.enti_contactos1 = value;
    }

    public String getEnti_contactos1() {
        return enti_contactos1;
    }

    public void setEnti_contactos2(String value) {
        this.enti_contactos2 = value;
    }

    public String getEnti_contactos2() {
        return enti_contactos2;
    }

    public void setEnti_newsletter(boolean value) {
        this.enti_newsletter = value;
    }

    public boolean getEnti_newsletter() {
        return enti_newsletter;
    }

    public String getEnti_nuit() {
        return enti_nuit;
    }

    public void setEnti_nuit(String value) {
        this.enti_nuit = value;
    }

    public String getEnti_codigoPostal() {
        return enti_codigoPostal;
    }

    public void setEnti_codigoPostal(String value) {
        this.enti_codigoPostal = value;
    }

    public String getEnti_dominio() {
        return enti_dominio;
    }

    public void setEnti_dominio(String value) {
        this.enti_dominio = value;
    }

    public String getEnti_endereco() {
        return enti_endereco;
    }

    public void setEnti_endereco(String value) {
        this.enti_endereco = value;
    }

    public String getEnti_sigla() {
        return enti_sigla;
    }

    public void setEnti_sigla(String enti_sigla) {
        this.enti_sigla = enti_sigla;
    }

    public String getEnti_contactos3() {
        return enti_contactos3;
    }

    public void setEnti_contactos3(String enti_contactos3) {
        this.enti_contactos3 = enti_contactos3;
    }

    public String getEnti_email() {
        return enti_email;
    }

    public void setEnti_email(String enti_email) {
        this.enti_email = enti_email;
    }

    public String getEnti_provincia() {
        return enti_provincia;
    }

    public void setEnti_provincia(String enti_provincia) {
        this.enti_provincia = enti_provincia;
    }

    public String getEnti_delegacao() {
        return enti_delegacao;
    }

    public void setEnti_delegacao(String enti_delegacao) {
        this.enti_delegacao = enti_delegacao;
    }

    public String getEnti_distrito() {
        return enti_distrito;
    }

    public void setEnti_distrito(String enti_distrito) {
        this.enti_distrito = enti_distrito;
    }

    public String getEnti_licenca() {
        return enti_licenca;
    }

    public void setEnti_licenca(String enti_licenca) {
        this.enti_licenca = enti_licenca;
    }

    public String getEnti_pessoaContacto() {
        return enti_pessoaContacto;
    }

    public void setEnti_pessoaContacto(String enti_pessoaContacto) {
        this.enti_pessoaContacto = enti_pessoaContacto;
    }

    public double getEnti_iva() {
        return enti_iva;
    }

    public void setEnti_iva(double enti_iva) {
        this.enti_iva = enti_iva;
    }

    public double getEnti_capital() {
        return enti_capital;
    }

    public void setEnti_capital(double enti_capital) {
        this.enti_capital = enti_capital;
    }

}
