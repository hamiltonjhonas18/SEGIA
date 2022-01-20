package mz.co.centralserver.model.controleacesso;

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
import mz.co.centralserver.model.gestao.Entidade;

@Entity
@Table(name = "ModuloAcesso")
public class ModuloAcesso implements Serializable {

    @Id
    @GeneratedValue
    private int moac_id;

    private String moac_chaveAcesso;

    private String moac_chaveUsuarios;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date moac_dataActivacao;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date moac_dataFinalTrial;

    private String moac_dataFinalTrialEncry;

    private Integer moac_diasRemanescentes;

    private String moac_diasRemanescentesEncry;

    private String moac_perfilCores;

    private String moac_imagemFundo;

    private String moac_baseDados;

    @ManyToOne
    private Entidade entidadeenti;
    
    @ManyToOne
    private Sistema sistema;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setMoac_id(int value) {
        this.moac_id = value;
    }

    public int getMoac_id() {
        return moac_id;
    }

    public void setMoac_chaveAcesso(String value) {
        this.moac_chaveAcesso = value;
    }

    public String getMoac_chaveAcesso() {
        return moac_chaveAcesso;
    }

    public void setMoac_chaveUsuarios(String value) {
        this.moac_chaveUsuarios = value;
    }

    public String getMoac_chaveUsuarios() {
        return moac_chaveUsuarios;
    }

    public void setMoac_dataActivacao(java.util.Date value) {
        this.moac_dataActivacao = value;
    }

    public java.util.Date getMoac_dataActivacao() {
        return moac_dataActivacao;
    }

    public void setMoac_dataFinalTrial(java.util.Date value) {
        this.moac_dataFinalTrial = value;
    }

    public java.util.Date getMoac_dataFinalTrial() {
        return moac_dataFinalTrial;
    }

    public void setMoac_dataFinalTrialEncry(String value) {
        this.moac_dataFinalTrialEncry = value;
    }

    public String getMoac_dataFinalTrialEncry() {
        return moac_dataFinalTrialEncry;
    }

    public void setMoac_diasRemanescentes(int value) {
        setMoac_diasRemanescentes(new Integer(value));
    }

    public void setMoac_diasRemanescentes(Integer value) {
        this.moac_diasRemanescentes = value;
    }

    public Integer getMoac_diasRemanescentes() {
        return moac_diasRemanescentes;
    }

    public void setMoac_diasRemanescentesEncry(String value) {
        this.moac_diasRemanescentesEncry = value;
    }

    public String getMoac_diasRemanescentesEncry() {
        return moac_diasRemanescentesEncry;
    }

    public void setMoac_perfilCores(String value) {
        this.moac_perfilCores = value;
    }

    public String getMoac_perfilCores() {
        return moac_perfilCores;
    }

    public void setMoac_imagemFundo(String value) {
        this.moac_imagemFundo = value;
    }

    public String getMoac_imagemFundo() {
        return moac_imagemFundo;
    }

    public void setMoac_baseDados(String value) {
        this.moac_baseDados = value;
    }

    public String getMoac_baseDados() {
        return moac_baseDados;
    }

    public void setEntidadeenti(Entidade value) {
        this.entidadeenti = value;
    }

    public Entidade getEntidadeenti() {
        return entidadeenti;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean idOnly) {
        if (idOnly) {
            return String.valueOf(getMoac_id());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("ModuloAcesso[ ");
            sb.append("Moac_id=").append(getMoac_id()).append(" ");
            sb.append("Moac_chaveAcesso=").append(getMoac_chaveAcesso()).append(" ");
            sb.append("Moac_chaveUsuarios=").append(getMoac_chaveUsuarios()).append(" ");
            sb.append("Moac_dataActivacao=").append(getMoac_dataActivacao()).append(" ");
            sb.append("Moac_dataFinalTrial=").append(getMoac_dataFinalTrial()).append(" ");
            sb.append("Moac_dataFinalTrialEncry=").append(getMoac_dataFinalTrialEncry()).append(" ");
            sb.append("Moac_diasRemanescentes=").append(getMoac_diasRemanescentes()).append(" ");
            sb.append("Moac_diasRemanescentesEncry=").append(getMoac_diasRemanescentesEncry()).append(" ");
            sb.append("Moac_perfilCores=").append(getMoac_perfilCores()).append(" ");
            sb.append("Moac_imagemFundo=").append(getMoac_imagemFundo()).append(" ");
            sb.append("Moac_baseDados=").append(getMoac_baseDados()).append(" ");
            sb.append("]");
            return sb.toString();
        }
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

}
