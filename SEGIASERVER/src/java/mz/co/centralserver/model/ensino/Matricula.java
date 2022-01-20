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
@Table(name = "Matricula")
public class Matricula implements Serializable {

    @Id
    @GeneratedValue
    private int matr_id;

    private String matr_ano;
    private String matr_classe;

    private int matr_novo;
    private int matr_continuante;
    private int matr_repetente;
    private int matr_assistente;
    private int matr_transferido;
    private int matr_homens;
    private int matr_mulheres;
    private int matr_vuneraveis;

    private int matr_faixa_05;
    private int matr_faixa_610;
    private int matr_faixa_1115;
    private int matr_faixa_1625;
    private int matr_faixa_2635;
    private int matr_faixa_35;
    
    
    private int matr_turmas;

    private String cod_escola;

    public String getCod_escola() {
        return cod_escola;
    }

    public void setCod_escola(String cod_escola) {
        this.cod_escola = cod_escola;
    }

    public int getMatr_id() {
        return matr_id;
    }

    public void setMatr_id(int matr_id) {
        this.matr_id = matr_id;
    }

    public String getMatr_ano() {
        return matr_ano;
    }

    public void setMatr_ano(String matr_ano) {
        this.matr_ano = matr_ano;
    }

    public String getMatr_classe() {
        return matr_classe;
    }

    public void setMatr_classe(String matr_classe) {
        this.matr_classe = matr_classe;
    }

    public int getMatr_novo() {
        return matr_novo;
    }

    public void setMatr_novo(int matr_novo) {
        this.matr_novo = matr_novo;
    }

    public int getMatr_continuante() {
        return matr_continuante;
    }

    public void setMatr_continuante(int matr_continuante) {
        this.matr_continuante = matr_continuante;
    }

    public int getMatr_repetente() {
        return matr_repetente;
    }

    public void setMatr_repetente(int matr_repetente) {
        this.matr_repetente = matr_repetente;
    }

    public int getMatr_assistente() {
        return matr_assistente;
    }

    public void setMatr_assistente(int matr_assistente) {
        this.matr_assistente = matr_assistente;
    }

    public int getMatr_transferido() {
        return matr_transferido;
    }

    public void setMatr_transferido(int matr_transferido) {
        this.matr_transferido = matr_transferido;
    }

    public int getMatr_homens() {
        return matr_homens;
    }

    public void setMatr_homens(int matr_homens) {
        this.matr_homens = matr_homens;
    }

    public int getMatr_mulheres() {
        return matr_mulheres;
    }

    public void setMatr_mulheres(int matr_mulheres) {
        this.matr_mulheres = matr_mulheres;
    }

    public int getMatr_vuneraveis() {
        return matr_vuneraveis;
    }

    public void setMatr_vuneraveis(int matr_vuneraveis) {
        this.matr_vuneraveis = matr_vuneraveis;
    }

    public int getMatr_faixa_05() {
        return matr_faixa_05;
    }

    public void setMatr_faixa_05(int matr_faixa_05) {
        this.matr_faixa_05 = matr_faixa_05;
    }

    public int getMatr_faixa_610() {
        return matr_faixa_610;
    }

    public void setMatr_faixa_610(int matr_faixa_610) {
        this.matr_faixa_610 = matr_faixa_610;
    }

    public int getMatr_faixa_1115() {
        return matr_faixa_1115;
    }

    public void setMatr_faixa_1115(int matr_faixa_1115) {
        this.matr_faixa_1115 = matr_faixa_1115;
    }

    public int getMatr_faixa_1625() {
        return matr_faixa_1625;
    }

    public void setMatr_faixa_1625(int matr_faixa_1625) {
        this.matr_faixa_1625 = matr_faixa_1625;
    }

    public int getMatr_faixa_2635() {
        return matr_faixa_2635;
    }

    public void setMatr_faixa_2635(int matr_faixa_2635) {
        this.matr_faixa_2635 = matr_faixa_2635;
    }

    public int getMatr_faixa_35() {
        return matr_faixa_35;
    }

    public void setMatr_faixa_35(int matr_faixa_35) {
        this.matr_faixa_35 = matr_faixa_35;
    }

    public int getMatr_turmas() {
        return matr_turmas;
    }

    public void setMatr_turmas(int matr_turmas) {
        this.matr_turmas = matr_turmas;
    }

     
}
