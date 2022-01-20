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

import com.dciapps.webclient.Inscricao;
import java.util.List;

/**
 *
 * @author 25884
 */
public class PM {
    
    private Inscricao inscricao;
    
    private float mediaFinal;
    
    private String comportamentoFinal;
    
    private List<DN> dns;

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(float mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getComportamentoFinal() {
        return comportamentoFinal;
    }

    public void setComportamentoFinal(String comportamentoFinal) {
        this.comportamentoFinal = comportamentoFinal;
    }

    public List<DN> getDns() {
        return dns;
    }

    public void setDns(List<DN> dns) {
        this.dns = dns;
    }
    
    
}
