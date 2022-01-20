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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 25884
 */
@Entity
@Table(name = "Escola")
public class Escola implements Serializable {

    @Id
    @GeneratedValue
    private int esc_id;

    private String esc_descricao;

    private String esc_provincia;

    private String esc_distrito;

    private String esc_contacto;

    private String esc_endereco;

    private int esc_alunos;
    private int esc_alunos_necessitados;
    private int esc_alunos_mulheres;
    private int esc_alunos_homens;
    private int esc_turmas;
    private int esc_salas;
    private int esc_docentes;
    private int esc_membros_homens;
    private int esc_membros_mulheres;

    private int esc_faixa_05;
    private int esc_faixa_610;
    private int esc_faixa_1115;
    private int esc_faixa_1625;
    private int esc_faixa_2635;
    private int esc_faixa_35;
    
    private double esc_saldo;

    private String cod_escola;

    public String getCod_escola() {
        return cod_escola;
    }

    public void setCod_escola(String cod_escola) {
        this.cod_escola = cod_escola;
    }

    public int getEsc_id() {
        return esc_id;
    }

    public void setEsc_id(int esc_id) {
        this.esc_id = esc_id;
    }

    public String getEsc_descricao() {
        return esc_descricao;
    }

    public void setEsc_descricao(String esc_descricao) {
        this.esc_descricao = esc_descricao;
    }

    public String getEsc_provincia() {
        return esc_provincia;
    }

    public void setEsc_provincia(String esc_provincia) {
        this.esc_provincia = esc_provincia;
    }

    public String getEsc_distrito() {
        return esc_distrito;
    }

    public void setEsc_distrito(String esc_distrito) {
        this.esc_distrito = esc_distrito;
    }

    public String getEsc_contacto() {
        return esc_contacto;
    }

    public void setEsc_contacto(String esc_contacto) {
        this.esc_contacto = esc_contacto;
    }

    public String getEsc_endereco() {
        return esc_endereco;
    }

    public void setEsc_endereco(String esc_endereco) {
        this.esc_endereco = esc_endereco;
    }

    public int getEsc_alunos() {
        return esc_alunos;
    }

    public void setEsc_alunos(int esc_alunos) {
        this.esc_alunos = esc_alunos;
    }

    public int getEsc_alunos_necessitados() {
        return esc_alunos_necessitados;
    }

    public void setEsc_alunos_necessitados(int esc_alunos_necessitados) {
        this.esc_alunos_necessitados = esc_alunos_necessitados;
    }

    public int getEsc_alunos_mulheres() {
        return esc_alunos_mulheres;
    }

    public void setEsc_alunos_mulheres(int esc_alunos_mulheres) {
        this.esc_alunos_mulheres = esc_alunos_mulheres;
    }

    public int getEsc_alunos_homens() {
        return esc_alunos_homens;
    }

    public void setEsc_alunos_homens(int esc_alunos_homens) {
        this.esc_alunos_homens = esc_alunos_homens;
    }

    public int getEsc_turmas() {
        return esc_turmas;
    }

    public void setEsc_turmas(int esc_turmas) {
        this.esc_turmas = esc_turmas;
    }

    public int getEsc_salas() {
        return esc_salas;
    }

    public void setEsc_salas(int esc_salas) {
        this.esc_salas = esc_salas;
    }

    public int getEsc_docentes() {
        return esc_docentes;
    }

    public void setEsc_docentes(int esc_docentes) {
        this.esc_docentes = esc_docentes;
    }

    public int getEsc_membros_homens() {
        return esc_membros_homens;
    }

    public void setEsc_membros_homens(int esc_membros_homens) {
        this.esc_membros_homens = esc_membros_homens;
    }

    public int getEsc_membros_mulheres() {
        return esc_membros_mulheres;
    }

    public void setEsc_membros_mulheres(int esc_membros_mulheres) {
        this.esc_membros_mulheres = esc_membros_mulheres;
    }

    public int getEsc_faixa_05() {
        return esc_faixa_05;
    }

    public void setEsc_faixa_05(int esc_faixa_05) {
        this.esc_faixa_05 = esc_faixa_05;
    }

    public int getEsc_faixa_610() {
        return esc_faixa_610;
    }

    public void setEsc_faixa_610(int esc_faixa_610) {
        this.esc_faixa_610 = esc_faixa_610;
    }

    public int getEsc_faixa_1115() {
        return esc_faixa_1115;
    }

    public void setEsc_faixa_1115(int esc_faixa_1115) {
        this.esc_faixa_1115 = esc_faixa_1115;
    }

    public int getEsc_faixa_1625() {
        return esc_faixa_1625;
    }

    public void setEsc_faixa_1625(int esc_faixa_1625) {
        this.esc_faixa_1625 = esc_faixa_1625;
    }

    public int getEsc_faixa_2635() {
        return esc_faixa_2635;
    }

    public void setEsc_faixa_2635(int esc_faixa_2635) {
        this.esc_faixa_2635 = esc_faixa_2635;
    }

    public int getEsc_faixa_35() {
        return esc_faixa_35;
    }

    public void setEsc_faixa_35(int esc_faixa_35) {
        this.esc_faixa_35 = esc_faixa_35;
    }

    public double getEsc_saldo() {
        return esc_saldo;
    }

    public void setEsc_saldo(double esc_saldo) {
        this.esc_saldo = esc_saldo;
    }

}
