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
 * @author HJC2K8
 */
public class Resultado {
    
    private String categoria;
    private String descricao;
    private int id;
    private double valor;
    private double valorEsperado;
    private double percentagem;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPercentagem() {
        return percentagem;
    }

    public void setPercentagem(double percentagem) {
        this.percentagem = percentagem;
    }

    public double getValorEsperado() {
        return valorEsperado;
    }

    public void setValorEsperado(double valorEsperado) {
        this.valorEsperado = valorEsperado;
    }
    
    
}
