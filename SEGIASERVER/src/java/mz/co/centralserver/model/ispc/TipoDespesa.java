/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ispc;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "TipoDespesa")
public class TipoDespesa implements Serializable {
    
    @Id
    @GeneratedValue
    private int tipd_id;
    
    private String tipd_descricao;
    
    private String tipd_categoria;
    
    private String tipd_periodo;
    
    private int tipd_numDespesas;
    
    private int tipd_tempo;
    
    private double tipd_valorPlanificado;
    
    private double tipd_valorExectuado;
    
    @ManyToOne
    private Entidade Entidade;
    
    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public Entidade getEntidade() {
        return Entidade;
    }

    public void setEntidade(Entidade Entidade) {
        this.Entidade = Entidade;
    }


    public int getTipd_id() {
        return tipd_id;
    }

    public void setTipd_id(int tipd_id) {
        this.tipd_id = tipd_id;
    }

    public String getTipd_descricao() {
        return tipd_descricao;
    }

    public void setTipd_descricao(String tipd_descricao) {
        this.tipd_descricao = tipd_descricao;
    }

    public String getTipd_categoria() {
        return tipd_categoria;
    }

    public void setTipd_categoria(String tipd_categoria) {
        this.tipd_categoria = tipd_categoria;
    }

    public int getTipd_numDespesas() {
        return tipd_numDespesas;
    }

    public void setTipd_numDespesas(int tipd_numDespesas) {
        this.tipd_numDespesas = tipd_numDespesas;
    }

    public int getTipd_tempo() {
        return tipd_tempo;
    }

    public void setTipd_tempo(int tipd_tempo) {
        this.tipd_tempo = tipd_tempo;
    }

    public double getTipd_valorPlanificado() {
        return tipd_valorPlanificado;
    }

    public void setTipd_valorPlanificado(double tipd_valorPlanificado) {
        this.tipd_valorPlanificado = tipd_valorPlanificado;
    }

    public double getTipd_valorExectuado() {
        return tipd_valorExectuado;
    }

    public void setTipd_valorExectuado(double tipd_valorExectuado) {
        this.tipd_valorExectuado = tipd_valorExectuado;
    }

    public String getTipd_periodo() {
        return tipd_periodo;
    }

    public void setTipd_periodo(String tipd_periodo) {
        this.tipd_periodo = tipd_periodo;
    }

}
