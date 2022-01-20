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

import com.dciapps.webclient.GuiaRemessa;
import com.dciapps.webclient.ItemPedido;
import java.util.List;

/**
 *
 * @author hamil
 */
public class Guide {
   
    private GuiaRemessa guiaRemessa;
    
    private List<ItemPedido> itensPedidos;

    public GuiaRemessa getGuiaRemessa() {
        return guiaRemessa;
    }

    public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
        this.guiaRemessa = guiaRemessa;
    }

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }
    
    
}
