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

import com.dciapps.webclient.Produto;

/**
 *
 * @author Hamilton Jhonas
 */
public class PSale {

    private Produto produto;

    private int qtd_vd;
    private int qtd_factura;
    private int qtd_notacredito;
    private int qtd_notadebito;

    private double total_vd;
    private double total_factura;
    private double total_notacredito;
    private double total_notadebito;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd_vd() {
        return qtd_vd;
    }

    public void setQtd_vd(int qtd_vd) {
        this.qtd_vd = qtd_vd;
    }

    public int getQtd_factura() {
        return qtd_factura;
    }

    public void setQtd_factura(int qtd_factura) {
        this.qtd_factura = qtd_factura;
    }

    public int getQtd_notacredito() {
        return qtd_notacredito;
    }

    public void setQtd_notacredito(int qtd_notacredito) {
        this.qtd_notacredito = qtd_notacredito;
    }

    public int getQtd_notadebito() {
        return qtd_notadebito;
    }

    public void setQtd_notadebito(int qtd_notadebito) {
        this.qtd_notadebito = qtd_notadebito;
    }

    public double getTotal_vd() {
        return total_vd;
    }

    public void setTotal_vd(double total_vd) {
        this.total_vd = total_vd;
    }

    public double getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(double total_factura) {
        this.total_factura = total_factura;
    }

    public double getTotal_notacredito() {
        return total_notacredito;
    }

    public void setTotal_notacredito(double total_notacredito) {
        this.total_notacredito = total_notacredito;
    }

    public double getTotal_notadebito() {
        return total_notadebito;
    }

    public void setTotal_notadebito(double total_notadebito) {
        this.total_notadebito = total_notadebito;
    }
    
    

}
