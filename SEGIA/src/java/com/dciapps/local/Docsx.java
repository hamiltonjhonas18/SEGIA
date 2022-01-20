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

import java.util.Date;


/**
 *
 * @author hamil
 */
public class Docsx {
    
    private int id;
    private String descricao;
    private String estado;
    private String utilizador;
    private Date data_insercao;
    private Date data_aprovacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    public Date getData_insercao() {
        return data_insercao;
    }

    public void setData_insercao(Date data_insercao) {
        this.data_insercao = data_insercao;
    }

    public Date getData_aprovacao() {
        return data_aprovacao;
    }

    public void setData_aprovacao(Date data_aprovacao) {
        this.data_aprovacao = data_aprovacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
