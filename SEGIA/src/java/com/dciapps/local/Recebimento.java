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
public class Recebimento {
    
    private String meio;
    
    private double valorCobrado;
    
    private double valorDepositado;
    
    private double percentegem;

    public String getMeio() {
        return meio;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public double getValorDepositado() {
        return valorDepositado;
    }

    public void setValorDepositado(double valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    public double getPercentegem() {
        return percentegem;
    }

    public void setPercentegem(double percentegem) {
        this.percentegem = percentegem;
    }
    
    
}
