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

import com.dciapps.webclient.ContaGeral;

/**
 *
 * @author hamil
 */
public class Balancete {
    
    private ContaGeral contaGeral;
    private double saldoCredor;
    private double saldoDevedor;
    private double credito;
    private double debito;

    public ContaGeral getContaGeral() {
        return contaGeral;
    }

    public void setContaGeral(ContaGeral contaGeral) {
        this.contaGeral = contaGeral;
    }

    public double getSaldoCredor() {
        return saldoCredor;
    }

    public void setSaldoCredor(double saldoCredor) {
        this.saldoCredor = saldoCredor;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }
    
    
}
