/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.webclientcontroler;

/**
 *
 * @author HJC2K8
 */
public class UtilitariosCtrl {

    public UtilitariosCtrl() {
    }

    public void enviarEmail(java.lang.String to, java.lang.String subject, java.lang.String message, java.lang.String category) {
        com.dciapps.webclient.UtilitariosWSrv_Service service = new com.dciapps.webclient.UtilitariosWSrv_Service();
        com.dciapps.webclient.UtilitariosWSrv port = service.getUtilitariosWSrvPort();
        port.enviarEmail(to, subject, message, category);
    }

    public void registrarExcepcao(java.lang.String datetime, java.lang.String msg) {
        com.dciapps.webclient.UtilitariosWSrv_Service service = new com.dciapps.webclient.UtilitariosWSrv_Service();
        com.dciapps.webclient.UtilitariosWSrv port = service.getUtilitariosWSrvPort();
        port.registrarExcepcao(datetime, msg);
    }

    public String buscaBadgeNumber(java.lang.String prefix, int number) {
        com.dciapps.webclient.UtilitariosWSrv_Service service = new com.dciapps.webclient.UtilitariosWSrv_Service();
        com.dciapps.webclient.UtilitariosWSrv port = service.getUtilitariosWSrvPort();
        return port.buscaBadgeNumber(prefix, number);
    }

  
}
