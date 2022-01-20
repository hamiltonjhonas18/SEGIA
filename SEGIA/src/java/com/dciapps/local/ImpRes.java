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

import java.util.List;

/**
 *
 * @author 25884
 */
public class ImpRes {
    
    private String cod;
    private String dis;
    
    private List<String> respostas;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }
    
    
}
