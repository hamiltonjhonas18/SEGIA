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
import mz.co.centralserver.model.gestao.Entidade;

/**
 *
 * @author HJC2K8
 */
@Entity
@Table(name = "calendario")
public class Calendario implements Serializable {

    @Id
    @GeneratedValue
    private int cale_id;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste1;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste1Limite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste2;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste2Limite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste3;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste3Limite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste4;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_teste4Limite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_acp;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_acpLimite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_acp2;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_acp2Limite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_exame;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_exameLimite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_recorrencia;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date cale_recorrenciaLimite;

    private String cale_semestre;

    private boolean cale_haveExame;
    private boolean cale_haveTeste3;
    private boolean cale_haveTeste4;
    private boolean cale_haveAcp;

    @ManyToOne
    private AnoLectivo anoLectivo;

    @ManyToOne
    private Turma turma;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Docente docente;

    @ManyToOne
    private Entidade entidade;

    @ManyToOne
    private Docente juri1;

    @ManyToOne
    private Docente juri2;

    @ManyToOne
    private Docente juri3;

    @ManyToOne
    private Docente juri4;

    private boolean encrypted;

    public int getCale_id() {
        return cale_id;
    }

    public void setCale_id(int cale_id) {
        this.cale_id = cale_id;
    }

    public Date getCale_teste1() {
        return cale_teste1;
    }

    public void setCale_teste1(Date cale_teste1) {
        this.cale_teste1 = cale_teste1;
    }

    public Date getCale_teste2() {
        return cale_teste2;
    }

    public void setCale_teste2(Date cale_teste2) {
        this.cale_teste2 = cale_teste2;
    }

    public Date getCale_teste3() {
        return cale_teste3;
    }

    public void setCale_teste3(Date cale_teste3) {
        this.cale_teste3 = cale_teste3;
    }

    public Date getCale_exame() {
        return cale_exame;
    }

    public void setCale_exame(Date cale_exame) {
        this.cale_exame = cale_exame;
    }

    public Date getCale_recorrencia() {
        return cale_recorrencia;
    }

    public void setCale_recorrencia(Date cale_recorrencia) {
        this.cale_recorrencia = cale_recorrencia;
    }

    public String getCale_semestre() {
        return cale_semestre;
    }

    public void setCale_semestre(String cale_semestre) {
        this.cale_semestre = cale_semestre;
    }

    public AnoLectivo getAnoLectivo() {
        return anoLectivo;
    }

    public void setAnoLectivo(AnoLectivo anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
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

    public boolean isCale_haveExame() {
        return cale_haveExame;
    }

    public void setCale_haveExame(boolean cale_haveExame) {
        this.cale_haveExame = cale_haveExame;
    }

    public Date getCale_teste4() {
        return cale_teste4;
    }

    public void setCale_teste4(Date cale_teste4) {
        this.cale_teste4 = cale_teste4;
    }

    public Date getCale_acp() {
        return cale_acp;
    }

    public void setCale_acp(Date cale_acp) {
        this.cale_acp = cale_acp;
    }

    public Date getCale_acp2() {
        return cale_acp2;
    }

    public void setCale_acp2(Date cale_acp2) {
        this.cale_acp2 = cale_acp2;
    }

    public boolean isCale_haveTeste3() {
        return cale_haveTeste3;
    }

    public void setCale_haveTeste3(boolean cale_haveTeste3) {
        this.cale_haveTeste3 = cale_haveTeste3;
    }

    public boolean isCale_haveTeste4() {
        return cale_haveTeste4;
    }

    public void setCale_haveTeste4(boolean cale_haveTeste4) {
        this.cale_haveTeste4 = cale_haveTeste4;
    }

    public boolean isCale_haveAcp() {
        return cale_haveAcp;
    }

    public void setCale_haveAcp(boolean cale_haveAcp) {
        this.cale_haveAcp = cale_haveAcp;
    }

    public Docente getJuri1() {
        return juri1;
    }

    public void setJuri1(Docente juri1) {
        this.juri1 = juri1;
    }

    public Docente getJuri2() {
        return juri2;
    }

    public void setJuri2(Docente juri2) {
        this.juri2 = juri2;
    }

    public Docente getJuri3() {
        return juri3;
    }

    public void setJuri3(Docente juri3) {
        this.juri3 = juri3;
    }

    public Docente getJuri4() {
        return juri4;
    }

    public void setJuri4(Docente juri4) {
        this.juri4 = juri4;
    }

    public Date getCale_teste1Limite() {
        return cale_teste1Limite;
    }

    public void setCale_teste1Limite(Date cale_teste1Limite) {
        this.cale_teste1Limite = cale_teste1Limite;
    }

    public Date getCale_teste2Limite() {
        return cale_teste2Limite;
    }

    public void setCale_teste2Limite(Date cale_teste2Limite) {
        this.cale_teste2Limite = cale_teste2Limite;
    }

    public Date getCale_teste3Limite() {
        return cale_teste3Limite;
    }

    public void setCale_teste3Limite(Date cale_teste3Limite) {
        this.cale_teste3Limite = cale_teste3Limite;
    }

    public Date getCale_teste4Limite() {
        return cale_teste4Limite;
    }

    public void setCale_teste4Limite(Date cale_teste4Limite) {
        this.cale_teste4Limite = cale_teste4Limite;
    }

    public Date getCale_acpLimite() {
        return cale_acpLimite;
    }

    public void setCale_acpLimite(Date cale_acpLimite) {
        this.cale_acpLimite = cale_acpLimite;
    }

    public Date getCale_acp2Limite() {
        return cale_acp2Limite;
    }

    public void setCale_acp2Limite(Date cale_acp2Limite) {
        this.cale_acp2Limite = cale_acp2Limite;
    }

    public Date getCale_exameLimite() {
        return cale_exameLimite;
    }

    public void setCale_exameLimite(Date cale_exameLimite) {
        this.cale_exameLimite = cale_exameLimite;
    }

    public Date getCale_recorrenciaLimite() {
        return cale_recorrenciaLimite;
    }

    public void setCale_recorrenciaLimite(Date cale_recorrenciaLimite) {
        this.cale_recorrenciaLimite = cale_recorrenciaLimite;
    }

}
