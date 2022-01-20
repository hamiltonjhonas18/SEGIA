/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.local;

/**
 *
 * @author hamil
 */
public class IResultado {
    
    private String descricao;
    
    private double mesCorrente;
    private double mesAnterior;
    private double variacao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMesCorrente() {
        return mesCorrente;
    }

    public void setMesCorrente(double mesCorrente) {
        this.mesCorrente = mesCorrente;
    }

    public double getMesAnterior() {
        return mesAnterior;
    }

    public void setMesAnterior(double mesAnterior) {
        this.mesAnterior = mesAnterior;
    }

    public double getVariacao() {
        return variacao;
    }

    public void setVariacao(double variacao) {
        this.variacao = variacao;
    }
    
    
}
