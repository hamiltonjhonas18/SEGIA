/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.model.ensino;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "turma")
public class Turma implements Serializable {

    @Id
    @GeneratedValue
    private int turm_id;

    private String turm_descricao;

    private String turm_turno;

    private String turm_horario;

    private String turm_referencia;

    @Temporal(TemporalType.TIMESTAMP)
    private Date turm_dataInicio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date turm_dataFim;

    private int turm_maxEstudantes;

    private int turm_numOcupado;

    private int turm_minEstudantes;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Escola escola;

    @ManyToOne
    private AnoLectivo anoLectivo;

    @ManyToOne
    private Sala sala;

    private boolean encrypted;

    public boolean isEncrypted() {
        return encrypted;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public int getTurm_id() {
        return turm_id;
    }

    public void setTurm_id(int turm_id) {
        this.turm_id = turm_id;
    }

    public String getTurm_descricao() {
        return turm_descricao;
    }

    public void setTurm_descricao(String turm_descricao) {
        this.turm_descricao = turm_descricao;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getTurm_dataInicio() {
        return turm_dataInicio;
    }

    public void setTurm_dataInicio(Date turm_dataInicio) {
        this.turm_dataInicio = turm_dataInicio;
    }

    public Date getTurm_dataFim() {
        return turm_dataFim;
    }

    public void setTurm_dataFim(Date turm_dataFim) {
        this.turm_dataFim = turm_dataFim;
    }

    public int getTurm_maxEstudantes() {
        return turm_maxEstudantes;
    }

    public void setTurm_maxEstudantes(int turm_maxEstudantes) {
        this.turm_maxEstudantes = turm_maxEstudantes;
    }

    public int getTurm_minEstudantes() {
        return turm_minEstudantes;
    }

    public void setTurm_minEstudantes(int turm_minEstudantes) {
        this.turm_minEstudantes = turm_minEstudantes;
    }

    public String getTurm_turno() {
        return turm_turno;
    }

    public void setTurm_turno(String turm_turno) {
        this.turm_turno = turm_turno;
    }

    public String getTurm_horario() {
        return turm_horario;
    }

    public void setTurm_horario(String turm_horario) {
        this.turm_horario = turm_horario;
    }

    public String getTurm_referencia() {
        return turm_referencia;
    }

    public void setTurm_referencia(String turm_referencia) {
        this.turm_referencia = turm_referencia;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public int getTurm_numOcupado() {
        return turm_numOcupado;
    }

    public void setTurm_numOcupado(int turm_numOcupado) {
        this.turm_numOcupado = turm_numOcupado;
    }

}
