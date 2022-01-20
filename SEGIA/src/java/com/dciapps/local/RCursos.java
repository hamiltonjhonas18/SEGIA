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

import com.dciapps.webclient.Curso;

/**
 *
 * @author HJC2K8
 */
public class RCursos {
    
    private Curso curso;
    private int numInscricoes;
    private double percentagem;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public double getPercentagem() {
        return percentagem;
    }

    public void setPercentagem(double percentagem) {
        this.percentagem = percentagem;
    }

    public int getNumInscricoes() {
        return numInscricoes;
    }

    public void setNumInscricoes(int numInscricoes) {
        this.numInscricoes = numInscricoes;
    }
}
